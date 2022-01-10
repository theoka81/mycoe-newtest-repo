package com.scm.dao.inventory.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.PriceBenchmarkDefinition;
import com.scm.dao.inventory.PriceBenchmarkDefinitionsDao;

@Repository
public class HibernatePriceBenchmarkDefinitionsDao extends HibernateGenericDao<PriceBenchmarkDefinition, Long>
		implements PriceBenchmarkDefinitionsDao {

	@Override
	@Transactional
	public Long getPriceBenchmarkDefinitionsCount() throws Throwable {
		long count = 0l;
		Query qry = getSession().createQuery("select count(*) from PriceBenchmarkDefinition");
		Long obj = (Long) qry.uniqueResult();
		if (obj != null) {
			count = obj.longValue();
		}
		return count;
	}
}
