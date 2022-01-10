package com.scm.service;

import com.scm.dao.domain.SupplierMaster;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;

public interface SupplierMasterUIService {

	public SummaryResponse<SupplierMaster> getSupplierMasterDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable;
}
