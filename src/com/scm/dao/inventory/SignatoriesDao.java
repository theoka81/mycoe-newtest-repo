package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Signatory;

public interface SignatoriesDao extends GenericDao<Signatory, Integer>{

	public Signatory getSignatoriesByContractMaster(Long contractDetailsId) throws Throwable;
}
