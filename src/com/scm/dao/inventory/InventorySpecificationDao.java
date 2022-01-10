package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.InventoryPricing;
import com.scm.dao.domain.InventorySpecification;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

public interface InventorySpecificationDao extends GenericDao<InventorySpecification, Long> {

	public InventorySpecification getInventorySpecificationDetails(Long inventoryId) throws Throwable;	

}
