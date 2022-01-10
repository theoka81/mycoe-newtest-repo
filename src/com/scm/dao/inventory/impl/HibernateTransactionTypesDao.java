package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.TransactionType;
import com.scm.dao.inventory.TransactionTypesDao;

@Repository
public class HibernateTransactionTypesDao extends HibernateGenericDao<TransactionType, Long>
		implements TransactionTypesDao {

	@Override
	@Transactional
	public TransactionType getTransactionTypesBy(Long transactionTypeId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("userCode2.id", transactionTypeId));

		List<TransactionType> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
