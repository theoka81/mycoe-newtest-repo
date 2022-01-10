package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierCodesWork;

public interface SupplierCodesWorkDao  extends GenericDao<SupplierCodesWork, Long>{

	public SupplierCodesWork getSupplierCodesWorkDetails(Long supplierId) throws Throwable;
	
}
