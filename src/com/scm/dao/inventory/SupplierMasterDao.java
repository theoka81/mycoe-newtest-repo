package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierMaster;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

public interface SupplierMasterDao extends GenericDao<SupplierMaster, Long> {

	public List<SupplierMaster> getSupplierMasterDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable;

	public int getSupplierMasterDetailsCount(SearchSortContainer searchSortObj) throws Throwable;
	
	public SupplierMaster getSupplierMasterDetails(String reference, boolean includeOr) throws Throwable;
	
	public Long getSupplierMastersCount(String reference, String opr) throws Throwable;
	
	public Long getSupplierMastersCount() throws Throwable;
	
	public SupplierMaster getSupplierMasterDetails(Long supplierReferenceId) throws Throwable;

}
