package com.scm.service.impl;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import com.scm.dao.domain.SupplierMaster;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;
import com.scm.service.SupplierMasterUIService;
import com.scm.service.common.BaseUIservice;

@Service
public class SupplierMasterUIServiceImpl extends BaseUIservice implements SupplierMasterUIService {

	@Override
	public SummaryResponse<SupplierMaster> getSupplierMasterDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable {
		SummaryResponse<SupplierMaster> summary = new SummaryResponse<SupplierMaster>();
		summary.setTotalRecords(daoManager.getSupplierMasterDao().getSupplierMasterDetailsCount(searchSortObj));
		summary.setEntities(
				daoManager.getSupplierMasterDao().getSupplierMasterDetailsSummary(pagination, searchSortObj));

		return summary;

	}

}
