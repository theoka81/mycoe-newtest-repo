package com.scm.dao.inventory.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.ContractStandard;
import com.scm.dao.inventory.ContractStandardsDao;

@Repository
public class HibernateContractStandardsDao extends HibernateGenericDao<ContractStandard, Long>
		implements ContractStandardsDao {

	@Override
	@Transactional
	public Long getContractStandardsCount() throws Throwable {
		long count = 0l;
		Query qry = getSession().createQuery("select count(*) from ContractStandard");
		Long obj = (Long) qry.uniqueResult();
		if (obj != null) {
			count = obj.longValue();
		}
		return count;
	}
}
