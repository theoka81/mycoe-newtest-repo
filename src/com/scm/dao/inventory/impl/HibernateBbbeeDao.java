package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Bbbee;
import com.scm.dao.inventory.BbbeeDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateBbbeeDao extends HibernateGenericDao<Bbbee, Long>
		implements BbbeeDao {


	@Override
	@Transactional
	public Bbbee getBbbeeDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierId", supplierId));
		
		List<Bbbee> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}
	
	@Override
	@Transactional
	public Bbbee getBbbeeDetails(String supplierNumber) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierNumber", supplierNumber));
		
		List<Bbbee> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
