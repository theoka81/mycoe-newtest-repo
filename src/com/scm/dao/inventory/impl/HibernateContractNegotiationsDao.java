package com.scm.dao.inventory.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.ContractNegotiation;
import com.scm.dao.inventory.ContractNegotiationsDao;

@Repository
public class HibernateContractNegotiationsDao extends HibernateGenericDao<ContractNegotiation, Long>
		implements ContractNegotiationsDao {

	@Override
	@Transactional
	public Long getContractNegotiationsCount() throws Throwable {
		long count = 0l;
		Query qry = getSession().createQuery("select count(*) from ContractNegotiation");
		Long obj = (Long) qry.uniqueResult();
		if (obj != null) {
			count = obj.longValue();
		}
		return count;
	}
}
