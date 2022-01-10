package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.ContractNegotiation;

public interface ContractNegotiationsDao extends GenericDao<ContractNegotiation, Long> {

	public Long getContractNegotiationsCount() throws Throwable;

}
