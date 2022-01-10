package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.InventoryDefinition;
import com.scm.dao.domain.WarehouseDetail;
import com.scm.dao.domain.WarehouseInventoryDefinition;
import com.scm.modal.GenericDropDownBean;
import com.scm.modal.InventoryDefinitionsBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

public interface WarehouseInventoryDao extends GenericDao<WarehouseInventoryDefinition, Long> {


	public List<WarehouseInventoryDefinition> getExistingWarehouseInve(Long warehouseId) throws Throwable;
	

}
