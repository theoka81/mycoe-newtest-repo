package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.ContractDetail;
import com.scm.modal.ContractDetailBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

public interface ContractDetailsDao extends GenericDao<ContractDetail, Long>{
	
	public List<ContractDetailBean> getContractDetailsList(String maaaNumber) throws Throwable;
	
	public List<ContractDetail> getContractDetailsByContractMasterId(Long contractMasterId) throws Throwable;

	public int getContractDetailsCount(SearchSortContainer searchSortObj)  throws Throwable;
	
	public List<ContractDetailBean> getContractDetailsSummary(Pagination pagination, SearchSortContainer searchSortObj)
			throws Throwable;


}
