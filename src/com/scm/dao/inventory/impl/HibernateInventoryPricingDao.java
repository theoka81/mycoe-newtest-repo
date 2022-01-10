package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.InventoryPricing;
import com.scm.dao.domain.Suburb;
import com.scm.dao.inventory.InventoryPricingDao;

@Repository
public class HibernateInventoryPricingDao extends HibernateGenericDao<InventoryPricing, Long>
		implements InventoryPricingDao {

	@Override
	public InventoryPricing getInventoryPricingDetails(Long inventoryId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("inventoryDefinition.id", inventoryId));

		List<InventoryPricing> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}


	
	
}
