package com.scm.service;

import java.util.Map;

import com.scm.modal.ContractBean;
import com.scm.modal.ContractDetailBean;
import com.scm.modal.ContractDetailsViewModel;
import com.scm.modal.ContractMasterViewModel;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;

public interface ContractUIService {

	public SummaryResponse<ContractBean> getContractMastersSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable;
	
	public void loadContractMasterDetails(Long contractId, ContractMasterViewModel cvm) throws Throwable;
	
	public Map<Long, String> goUserCodeKeyMap(String codeKey, boolean isContractType) throws Throwable;
	
	public SummaryResponse<ContractDetailBean> getContractDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable;

	public void loadContractDetails(Long contractId, ContractDetailsViewModel contractDetailsViewModel) throws Throwable;
}
