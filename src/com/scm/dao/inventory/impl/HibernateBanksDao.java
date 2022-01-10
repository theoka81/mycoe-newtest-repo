package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Bank;
import com.scm.dao.inventory.BanksDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateBanksDao extends HibernateGenericDao<Bank, Long>
		implements BanksDao {


	@Override
	@Transactional
	public Bank getBankDetails(String code) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("code", code));
		
		List<Bank> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
