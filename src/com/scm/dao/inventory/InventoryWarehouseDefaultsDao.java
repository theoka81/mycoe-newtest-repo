package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.InventoryDefinition;
import com.scm.dao.domain.InventorySpecification;
import com.scm.dao.domain.InventoryWarehouseDefault;
import com.scm.modal.InventoryDefinitionsBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

public interface InventoryWarehouseDefaultsDao extends GenericDao<InventoryWarehouseDefault, Long> {

	
	public InventoryWarehouseDefault getInventoryWarehouseDefaultDetails(Long inventoryId) throws Throwable;
	
	

}
