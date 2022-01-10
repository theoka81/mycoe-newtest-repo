package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Signatory;
import com.scm.dao.inventory.SignatoriesDao;

@Repository
public class HibernateSignatoriesDao extends HibernateGenericDao<Signatory, Integer>
		implements SignatoriesDao {

	@Override
	@Transactional
	public Signatory getSignatoriesByContractMaster(Long contractDetailsId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("contractDetailsId", contractDetailsId));

		List<Signatory> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
