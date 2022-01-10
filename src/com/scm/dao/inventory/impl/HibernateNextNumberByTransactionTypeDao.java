package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.NextNumberByTransactionType;
import com.scm.dao.inventory.NextNumberByTransactionTypeDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateNextNumberByTransactionTypeDao extends HibernateGenericDao<NextNumberByTransactionType, Long>
		implements NextNumberByTransactionTypeDao {


	@Override
	@Transactional
	public NextNumberByTransactionType getNextNumberByTransactionType(long transactionTypeId, String transactionType) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("transactionTypeId", transactionTypeId));
		crit.add(Restrictions.eq("transactionType", transactionType));
		
		List<NextNumberByTransactionType> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
