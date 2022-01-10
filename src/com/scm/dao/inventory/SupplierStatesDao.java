package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierState;

public interface SupplierStatesDao  extends GenericDao<SupplierState, Integer>{

	public SupplierState getSupplierStateDetails(String code) throws Throwable;
	
}
