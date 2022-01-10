package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.InventoryWarehouseDefault;
import com.scm.dao.domain.UomConversion;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

public interface UomConversionDao extends GenericDao<UomConversion, Long> {
	
	public UomConversion getUomConversionDetails(Long inventoryId) throws Throwable;

	

}
