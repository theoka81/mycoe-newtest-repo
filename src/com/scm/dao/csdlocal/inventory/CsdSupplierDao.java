package com.scm.dao.csdlocal.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.csdlocal.domain.Supplier;

public interface CsdSupplierDao extends GenericDao<Supplier, Integer>{

	public Integer validateMaaaNumber(String maaaNumber) throws Throwable;
	
	public Integer isCSDActive(String maaaNumber) throws Throwable;
	
	public Supplier getSupplierDetails(String maaaNumber) throws Throwable;
}
