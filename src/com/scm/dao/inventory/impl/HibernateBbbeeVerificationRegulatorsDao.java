package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.BbbeeVerificationRegulator;
import com.scm.dao.inventory.BbbeeVerificationRegulatorsDao;

@Repository
public class HibernateBbbeeVerificationRegulatorsDao extends HibernateGenericDao<BbbeeVerificationRegulator, Integer>
		implements BbbeeVerificationRegulatorsDao {

	public BbbeeVerificationRegulator getBbbeeVerificationRegulatorByCode(String code) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("code", code));

		List<BbbeeVerificationRegulator> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
