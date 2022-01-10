package com.scm.dao.inventory.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.Tuple;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.util.StringHelper;
import org.hibernate.transform.Transformers;
import org.hibernate.type.BooleanType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SystemUser;
import com.scm.dao.inventory.UserDao;
import com.scm.modal.ContractBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.UserBean;
import com.scm.util.DesEncrypter;

@Repository
public class HibernateUserDao extends HibernateGenericDao<SystemUser, Long> implements UserDao {

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public SystemUser getUserDetailsByUserName(String username, String password) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("emailAddress", username));
		if (StringHelper.isNotEmpty(password)) {
			crit.add(Restrictions.eq("password", DesEncrypter.encrypt(password)));
		}
		// crit.add(Restrictions.eq("isActive", true));
		List<SystemUser> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public SystemUser getUserDetailsBy(String maaaNumber) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("maaaNumber", maaaNumber));
		// crit.add(Restrictions.eq("isActive", true));
		List<SystemUser> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

	@Override
	@Transactional
	public Integer checkUserValueExists(String value, String type) throws Throwable {
		String sqlStr = "select count(*) from SystemUsers where isActive=:isActive ";
		switch (type) {
		case "mobile": {
			sqlStr = sqlStr + " and MobileNumber=:value ";
			break;
		}
		case "email": {
			sqlStr = sqlStr + " and EmailAddress=:value ";
			break;
		}
		case "username": {
			sqlStr = sqlStr + " and UserName=:value ";
			break;
		}
		case "maaaNumber": {
			sqlStr = sqlStr + " and maaaNumber=:value ";
			break;
		}
		case "identificationNumber": {
			sqlStr = sqlStr + " and identificationNumber=:value ";
			break;
		}
		}
		Query q = getSession().createSQLQuery(sqlStr);
		q.setString("value", value);
		q.setBoolean("isActive", true);
		return (Integer) q.uniqueResult();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Long, String> getUsersKeyMap() throws Throwable {

		String qryStr = "select c.id as id, concat(coalesce(c.firstName, ''), ' ', coalesce(c.lastName,'')) as fullName from "
				+ " SystemUser c where c.isActive=:isActive and c.isDeleted=:isDeleted order by c.firstName, c.lastName asc ";
		
		Query<Tuple> query = getSession()
				.createQuery(qryStr, Tuple.class);
		
		query.setBoolean("isActive", true);
		query.setBoolean("isDeleted", false);
		
		Map<Long, String> orginMap = query.getResultList().stream()
				.collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).longValue(),
						tuple -> ((String) tuple.get("fullName")).toString().trim()));

		return orginMap;

	}

	@Override
	public int getSystemUsersCount(SearchSortContainer searchSortObj) throws Throwable {
		int count = 0;
		String queryStr = "select count(*) from SystemUsers s ";
		if (searchSortObj != null) {
			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
				queryStr = queryStr + " where (s.MaaaNumber like '%" + searchSortObj.getSearchValue()
						+ "%' or s.FirstName like '%" + searchSortObj.getSearchValue()
						+ "%' or s.LastName like '%" + searchSortObj.getSearchValue()
						+ "%' or s.EmailAddress like '%" + searchSortObj.getSearchValue()
						+ "%' or s.UserName like '%" + searchSortObj.getSearchValue() + "%' ) ";
			}
		}
		Query query = getSession().createSQLQuery(queryStr);
		Integer obj = (Integer) query.uniqueResult();
		if (obj != null) {
			count = obj.intValue();
		}
		return count;
	}

	@Override
	public List<UserBean> getSystemUsersSummary(Pagination pagination, SearchSortContainer searchSortObj)
			throws Throwable {
		String queryStr = "select s.id as userId, s.MaaaNumber as maaaNumber, s.FirstName as firstName,"
				+ " s.LastName as lastName, s.EmailAddress as email, s.UserName as userName, s.IsActive as isActive from SystemUsers s ";
		if (searchSortObj != null) {
			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
				queryStr = queryStr + " where (s.MaaaNumber like '%" + searchSortObj.getSearchValue()
						+ "%' or s.FirstName like '%" + searchSortObj.getSearchValue() + "%' or s.LastName like '%"
						+ searchSortObj.getSearchValue() + "%' or s.EmailAddress like '%"
						+ searchSortObj.getSearchValue() + "%' or s.UserName like '%" + searchSortObj.getSearchValue()
						+ "%' ) ";
			}
			if (StringHelper.isNotEmpty(searchSortObj.getSidx()) && StringHelper.isNotEmpty(searchSortObj.getSord())) {
				switch (searchSortObj.getSidx()) {
				case "maaaNumber": {
					queryStr = queryStr + " order by s.MaaaNumber " + searchSortObj.getSord();
					break;
				}
				case "fullName": {
					queryStr = queryStr + " order by s.FirstName, s.LastName " + searchSortObj.getSord();
					break;
				}
				case "userName": {
					queryStr = queryStr + " order by s.UserName " + searchSortObj.getSord();
					break;
				}
				case "email": {
					queryStr = queryStr + " order by s.EmailAddress " + searchSortObj.getSord();
					break;
				}
				default: {
					queryStr = queryStr + " order by s.CreatedDateTime desc ";
				}
				}

			} else {
				queryStr = queryStr + " order by s.CreatedDateTime desc ";
			}
		} else {
			queryStr = queryStr + " order by s.CreatedDateTime desc ";
		}
		Query query = getSession().createSQLQuery(queryStr).addScalar("userId", new LongType())
				.addScalar("maaaNumber", new StringType()).addScalar("firstName", new StringType())
				.addScalar("lastName", new StringType()).addScalar("email", new StringType())
				.addScalar("userName", new StringType()).addScalar("isActive", new BooleanType());
		if (pagination != null) {
			if (pagination.getOffset() > 0) {
				query.setFirstResult(pagination.getOffset());
			}
			if (pagination.getSize() > 0) {
				query.setMaxResults(pagination.getSize());
			}
		}
		List<UserBean> userList = query.setResultTransformer(Transformers.aliasToBean(UserBean.class)).list();
		return userList;
	}

}
