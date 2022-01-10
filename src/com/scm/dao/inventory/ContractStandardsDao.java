package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.ContractStandard;

public interface ContractStandardsDao extends GenericDao<ContractStandard, Long> {

	public Long getContractStandardsCount() throws Throwable;

}
