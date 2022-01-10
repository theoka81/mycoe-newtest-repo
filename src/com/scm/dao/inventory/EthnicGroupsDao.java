package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.EthnicGroup;

public interface EthnicGroupsDao  extends GenericDao<EthnicGroup, Integer>{

	public EthnicGroup getEthnicGroupDetails(String code) throws Throwable;
	
}
