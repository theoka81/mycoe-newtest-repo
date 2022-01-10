package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierFlagDetail;

public interface SupplierFlagDetailsDao  extends GenericDao<SupplierFlagDetail, Long>{

	public List<SupplierFlagDetail> getSupplierFlagsDetails(Long supplierId) throws Throwable;
	
}
