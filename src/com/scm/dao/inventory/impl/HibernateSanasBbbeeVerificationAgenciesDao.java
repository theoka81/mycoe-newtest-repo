package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SanasBbbeeVerificationAgency;
import com.scm.dao.inventory.SanasBbbeeVerificationAgenciesDao;

@Repository
public class HibernateSanasBbbeeVerificationAgenciesDao extends HibernateGenericDao<SanasBbbeeVerificationAgency, Integer>
		implements SanasBbbeeVerificationAgenciesDao {

	public SanasBbbeeVerificationAgency getSanasBbbeeVerificationAgencyByCode(String code) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("code", code));

		List<SanasBbbeeVerificationAgency> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
