package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.FundingContact;
import com.scm.dao.inventory.FundingContactsDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateFundingContactsDao extends HibernateGenericDao<FundingContact, Long>
		implements FundingContactsDao {


	@Override
	@Transactional
	public List<FundingContact> getFundingContactsDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierId", supplierId));
		
		List<FundingContact> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}

}
