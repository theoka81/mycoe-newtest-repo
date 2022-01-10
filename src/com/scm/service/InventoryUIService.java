package com.scm.service;

import java.util.Map;

import com.scm.modal.DocumentBean;
import com.scm.modal.InventoryBean;
import com.scm.modal.InventoryDefinitionsBean;
import com.scm.modal.InventoryViewModel;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;

public interface InventoryUIService {

	public SummaryResponse<InventoryDefinitionsBean> getInventoryDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable;
	
	public InventoryViewModel getInventoryVewModalDetails(Long inventoryId) throws Throwable;
	
	public Map<Long, String> getInventoryDefinitionsMap() throws Throwable;

	public InventoryViewModel saveDetails(InventoryBean inventoryBean, DocumentBean documentBean, Long systemUserId) throws Throwable;
	
	
}
