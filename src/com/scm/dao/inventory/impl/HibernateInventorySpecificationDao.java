package com.scm.dao.inventory.impl;

import org.springframework.stereotype.Repository;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.InventorySpecification;
import com.scm.dao.domain.InventoryWarehouseDefault;
import com.scm.dao.inventory.InventorySpecificationDao;
import com.scm.dao.inventory.InventoryWarehouseDefaultsDao;

@Repository
public class HibernateInventorySpecificationDao extends HibernateGenericDao<InventorySpecification, Long>
		implements InventorySpecificationDao {

	@Override
	public InventorySpecification getInventorySpecificationDetails(Long inventoryId) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
