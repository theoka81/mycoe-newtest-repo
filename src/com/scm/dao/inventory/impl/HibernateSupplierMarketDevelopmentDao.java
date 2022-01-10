package com.scm.dao.inventory.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierMarketDevelopment;
import com.scm.dao.inventory.SupplierMarketDevelopmentDao;

@Repository
public class HibernateSupplierMarketDevelopmentDao extends HibernateGenericDao<SupplierMarketDevelopment, Long>
		implements SupplierMarketDevelopmentDao {

	@Override
	@Transactional
	public Long getSupplierMarketDevelopmentCount() throws Throwable {
		long count = 0l;
		Query qry = getSession().createQuery("select count(*) from SupplierMarketDevelopment");
		Long obj = (Long) qry.uniqueResult();
		if (obj != null) {
			count = obj.longValue();
		}
		return count;
	}
}
