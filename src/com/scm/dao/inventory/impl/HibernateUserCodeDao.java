package com.scm.dao.inventory.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.Tuple;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.UserCode;
import com.scm.dao.inventory.UserCodeDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateUserCodeDao extends HibernateGenericDao<UserCode, Long>
		implements UserCodeDao {


	@Override
	@Transactional
	public UserCode getUserCodeDetails(Long id) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("id", id));
		
		List<UserCode> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}
	
	@Override
	@Transactional
	public List<UserCode> getUserCodeDetails(String key) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("codeKey", key));
		
		List<UserCode> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}
	
	@Override
	@Transactional
	public String getUserCodeDetailsDesc(Long id) throws Throwable {
		Query qry = getSession().createQuery("select uc.description from UserCode uc where uc.id=:id");
		qry.setLong("id",id);
		return (String) qry.uniqueResult();
	}
	
	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Long, String> getUserCodeKeyMap(String codeKey, boolean isContractType) throws Throwable {

		String qryStr = "select " + "   c.id as id, " + "   c.description as description " + "from "
				+ "   UserCode c where c.codeKey=:codeKey and c.isActive=:isActive and c.isDeleted=:isDeleted ";
		if(isContractType) {
			qryStr = qryStr + " and c.character1='C' ";
		}
		
		qryStr = qryStr	+ " order by c.description asc ";
		Query<Tuple> query = getSession()
				.createQuery(qryStr, Tuple.class);
		
		query.setString("codeKey", codeKey);
		query.setBoolean("isActive", true);
		query.setBoolean("isDeleted", false);
		
		Map<Long, String> orginMap = query.getResultList().stream()
				.collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).longValue(),
						tuple -> ((String) tuple.get("description")).toString()));

		return orginMap;

	}

}
