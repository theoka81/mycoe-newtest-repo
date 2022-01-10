package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.InventoryWarehouseDefault;
import com.scm.dao.domain.UomConversion;
import com.scm.dao.inventory.InventoryWarehouseDefaultsDao;

@Repository
public class HibernateInventoryWarehouseDefaultsDao extends HibernateGenericDao<InventoryWarehouseDefault, Long>
		implements InventoryWarehouseDefaultsDao {

	@Override
	public InventoryWarehouseDefault getInventoryWarehouseDefaultDetails(Long inventoryId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("inventoryDefinition.id", inventoryId));

		List<InventoryWarehouseDefault> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}


	
	
}
