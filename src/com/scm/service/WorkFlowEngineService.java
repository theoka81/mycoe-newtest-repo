package com.scm.service;

import com.scm.dao.domain.SupplierMasterWork;

public interface WorkFlowEngineService {
	
	public boolean submit(SupplierMasterWork work, Long systemUserId, String url) throws Throwable;

}
