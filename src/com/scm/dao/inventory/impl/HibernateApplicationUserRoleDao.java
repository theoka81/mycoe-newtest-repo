package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.ApplicationUserRole;
import com.scm.dao.inventory.ApplicationUserRoleDao;

@Repository
public class HibernateApplicationUserRoleDao extends HibernateGenericDao<ApplicationUserRole, Long>
		implements ApplicationUserRoleDao {

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public ApplicationUserRole getByUserId1(Long userId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("systemUserId", userId));
		List<ApplicationUserRole> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public String getByUserId(Long userId) throws Throwable {
		Query q = getSession().createQuery("select a.applicationRole.roleName from  ApplicationUserRole a where a.systemUserId = :userId");
		q.setLong("userId", userId);
		return (String)q.uniqueResult();
	}

}
