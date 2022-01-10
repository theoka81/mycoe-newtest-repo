package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.BankAccountType;
import com.scm.dao.inventory.BankAccountTypesDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateBankAccountTypesDao extends HibernateGenericDao<BankAccountType, Long>
		implements BankAccountTypesDao {


	@Override
	@Transactional
	public BankAccountType getBankAccountTypesDetails(String code) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("code", code));
		
		List<BankAccountType> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
