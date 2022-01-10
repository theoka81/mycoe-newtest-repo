package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierContact;

public interface SupplierContactsDao  extends GenericDao<SupplierContact, Long>{

	public SupplierContact getSupplierContactsDetails(Long supplierId) throws Throwable;
	
}
