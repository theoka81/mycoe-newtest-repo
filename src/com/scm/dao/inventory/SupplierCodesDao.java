package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierCode;

public interface SupplierCodesDao  extends GenericDao<SupplierCode, Long>{

	public SupplierCode getSupplierCodeDetails(Long supplierId) throws Throwable;
	
}
