package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierFlag;

public interface SupplierFlagsDao  extends GenericDao<SupplierFlag, Long>{

	public List<SupplierFlag> getSupplierFlagsDetails(Long supplierId) throws Throwable;
	
}
