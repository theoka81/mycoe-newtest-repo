package com.scm.dao.common.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.Hibernate;
import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.Actionable;
import com.scm.dao.common.GenericDao;
import com.scm.modal.Pagination;

@Transactional("cesarTransactionManager")
public abstract class HibernateGenericCesarDao<T, ID extends Serializable> implements GenericDao<T, ID> {
	protected Logger logger = LogManager.getLogger("SCMCORE");

	protected static int JDBC_BATCH_SIZE = 2;
	private Class<T> persistentClass;
	
	
	private SessionFactory cesarSessionFactory;

	@SuppressWarnings("unchecked")
	public HibernateGenericCesarDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}


	public SessionFactory getCesarSessionFactory() {
		return cesarSessionFactory;
	}

	@Autowired
	public void setCesarSessionFactory(SessionFactory cesarSessionFactory) {
		this.cesarSessionFactory = cesarSessionFactory;
	}

	protected Session getCesarSession() {
		return cesarSessionFactory.getCurrentSession();
	}
	
	protected Class<T> getPersistentClass() {
		return persistentClass;
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public T get(ID id) {
		T instance = (T) getCesarSession().get(getPersistentClass(), id);
		return instance;
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public T getWithNoWaitLock(ID id) {
		LockOptions lockOptions = new LockOptions(LockMode.UPGRADE_NOWAIT);
		T instance = (T) getCesarSession().get(getPersistentClass(), id, lockOptions);
		return instance;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public T get(T entity) {
		List<T> result = list(entity);

		if (result.size() == 1) {
			return result.get(0);
		} else {
			if (result.size() > 1) {
				logger.warn("Query returned multiple (" + result.size() + ") entries!");
			}
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public T getByName(String name) {
		Criteria crit = getCesarSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("name", name));
		List<T> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() == 1) {
			return result.get(0);
		} else {
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public T load(ID id, boolean lock) {
		T entity;
		if (lock)
			entity = (T) getCesarSession().load(getPersistentClass(), id, LockOptions.UPGRADE);
		else
			entity = (T) getCesarSession().load(getPersistentClass(), id);

		return entity;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void lock(T item) {
		getCesarSession().buildLockRequest(LockOptions.UPGRADE).lock(item);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void initialize(Object o) {
		if (!Hibernate.isInitialized(getPersistentClass().cast(o))) {
			Hibernate.initialize(getPersistentClass().cast(o));
		}
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void initializeSet(Set<T> c) {
		if (!Hibernate.isInitialized(c.getClass())) {
			Hibernate.initialize(c);
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public T merge(T entity) {
		return (T) getCesarSession().merge(entity);

	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	@Override
	public int count() {
		Criteria crit = getCesarSession().createCriteria(getPersistentClass());
		return (Integer) crit.setProjection(Projections.rowCount()).uniqueResult();

	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<T> list(Criterion... criterion) {
		return findByCriteria(criterion);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<T> list(int from, int size, Criterion... criterion) {
		return findByCriteria(from, size, criterion);
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<T> list(T exampleInstance, String... excludeProperty) {
		Criteria crit = getCesarSession().createCriteria(getPersistentClass());
		Example example = Example.create(exampleInstance);
		if (excludeProperty != null) {
			for (String exclude : excludeProperty) {
				example.excludeProperty(exclude);
			}
		}
		crit.add(example);
		return crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<T> listById(Set<ID> set) {
		Criteria crit = getCesarSession().createCriteria(getPersistentClass());
		if (set != null) {
			crit.add(Restrictions.in("id", set));
		}
		return crit.list();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public List<T> listAndPerform(Actionable<T> action, T exampleInstance, String... excludeProperty) {
		List<T> affectedList = new ArrayList<T>();
		if (excludeProperty != null) {
			List<T> itemList = null;
			try {
				itemList = listAndLock(exampleInstance, excludeProperty);
			} catch (Throwable th) {
				// Ignore lock related exceptions
			}
			if (itemList != null) {
				for (T item : itemList) {
					if (action.doThis(item)) {
						save(item);
						affectedList.add(item);
					}
				}
			}
		}
		return affectedList;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public List<T> listAndPerformWithSize(Actionable<T> action, T exampleInstance, int size,
			String... excludeProperty) {
		List<T> affectedList = new ArrayList<T>();
		if (excludeProperty != null) {
			for (T item : listAndLockWithSize(exampleInstance, size, excludeProperty)) {
				if (action.doThis(item)) {
					save(item);
					affectedList.add(item);
				}
			}
		}
		return affectedList;
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<T> listAndLock(T exampleInstance, String... excludeProperty) {
		Criteria crit = getCesarSession().createCriteria(getPersistentClass());
		Example example = Example.create(exampleInstance);
		if (excludeProperty != null) {
			for (String exclude : excludeProperty) {
				example.excludeProperty(exclude);
			}
		}
		crit.add(example);
		return crit.setLockMode(LockMode.UPGRADE_NOWAIT).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<T> listAndLockWithSize(T exampleInstance, int size, String... excludeProperty) {
		Criteria crit = getCesarSession().createCriteria(getPersistentClass());
		Example example = Example.create(exampleInstance);
		if (excludeProperty != null) {
			for (String exclude : excludeProperty) {
				example.excludeProperty(exclude);
			}
		}
		crit.add(example);
		return crit.setFirstResult(0).add(Restrictions.sqlRestriction("rownum <= " + size))
				.setLockMode(LockMode.PESSIMISTIC_WRITE).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public T save(T entity) {
		getCesarSession().saveOrUpdate(entity);
		return entity;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public T update(T entity) {
		getCesarSession().update(entity);
		return entity;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void delete(T entity) {
		getCesarSession().delete(entity);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void flush() {
		getCesarSession().flush();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void commit() {
		getCesarSession().getTransaction().commit();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void clear() {
		getCesarSession().clear();
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	protected List<T> findAndLockByCriteria(Criterion... criterion) {
		Criteria crit = getCesarSession().createCriteria(getPersistentClass());
		if (criterion != null) {
			for (Criterion c : criterion) {
				crit.add(c);
			}
		}
		return crit.setLockMode(LockMode.PESSIMISTIC_WRITE).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	protected List<T> findByCriteria(Criterion... criterion) {

		Criteria crit = getCesarSession().createCriteria(getPersistentClass());
		if (criterion != null) {
			for (Criterion c : criterion) {
				crit.add(c);
			}

		}
		return crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	protected List<T> findByCriteria(int from, int size, Criterion... criterion) {
		Criteria crit = getCesarSession().createCriteria(getPersistentClass());
		if (criterion != null) {
			for (Criterion c : criterion) {
				crit.add(c);
			}
		}
		return crit.setFirstResult(from).setMaxResults(size).list();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void evict(T entity) {
		getCesarSession().evict(entity);
	}

	/**
	 * @author chandrashekar.sudars This method set the Pagination for the Query
	 *         Object
	 * @param pagination
	 * @param query
	 */
	protected void setPaginationForQuery(Pagination pagination, Query query) {
		if (pagination != null) {
			if (pagination.getOffset() > 0)
				query.setFirstResult(pagination.getOffset());
			if (pagination.getSize() > 0)
				query.setMaxResults(pagination.getSize());
		}
	}

	/**
	 * @author chandrashekar.sudars This method set the Pagination for the Criteria
	 *         Object
	 * @param pagination
	 * @param query
	 */
	protected void setPaginationForCriteria(Pagination pagination, Criteria criteria) {
		if (pagination != null) {
			if (pagination.getOffset() > 0)
				criteria.setFirstResult(pagination.getOffset());
			if (pagination.getSize() > 0)
				criteria.setMaxResults(pagination.getSize());
		}
	}

	@Override
	public void setFlushModeToCommit() {
		getCesarSession().setFlushMode(FlushMode.COMMIT);
	}

	@Override
	public void setFlushModeToAuto() {
		getCesarSession().setFlushMode(FlushMode.AUTO);
	}

	@Override
	public void setFlushModeToManual() {
		getCesarSession().setFlushMode(FlushMode.MANUAL);
	}

	@SuppressWarnings("hiding")
	public <T> void refresh(T entity) {
		getCesarSession().refresh(entity);
	}

}