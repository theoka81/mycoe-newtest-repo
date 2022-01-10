package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierMasterWork;

public interface SupplierMasterWorkDao  extends GenericDao<SupplierMasterWork, Long>{

	public SupplierMasterWork getSupplierMasterWorkDetails(Long supplierId) throws Throwable;
	
	public SupplierMasterWork getSupplierMasterWorkDetails(String maaaNumber) throws Throwable;
	
}
