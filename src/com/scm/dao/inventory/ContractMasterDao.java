package com.scm.dao.inventory;

import java.util.List;
import java.util.Map;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.ContractMaster;
import com.scm.modal.ContractBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

public interface ContractMasterDao  extends GenericDao<ContractMaster, Long>{

	public Long getContractMasterCount() throws Throwable;
	
	public List<ContractBean> getContractMastersSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable;

	public int getContractMastersCount(SearchSortContainer searchSortObj) throws Throwable;

	public Map<Long, String> getContractMastersKeyMap() throws Throwable;
	
}
