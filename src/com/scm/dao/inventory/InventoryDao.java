package com.scm.dao.inventory;

import java.util.List;
import java.util.Map;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.InventoryDefinition;
import com.scm.modal.InventoryDefinitionsBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

public interface InventoryDao extends GenericDao<InventoryDefinition, Long> {

	public List<InventoryDefinitionsBean> getInventoryDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable;

	public int getInventoryDetailsCount(SearchSortContainer searchSortObj) throws Throwable;
	
	public Long getInventoryDefinitionsCount() throws Throwable;
	
	public Map<Long, String> getInventoryDefinitionsMap() throws Throwable;

}
