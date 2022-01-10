package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.CededSupplier;

public interface CededSupplierDao  extends GenericDao<CededSupplier, Long>{

	public CededSupplier getCededSupplierDetails(Long supplierId) throws Throwable;
	
}
