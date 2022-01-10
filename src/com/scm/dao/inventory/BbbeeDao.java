package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Bbbee;

public interface BbbeeDao  extends GenericDao<Bbbee, Long>{

	public Bbbee getBbbeeDetails(Long supplierId) throws Throwable;
	
	public Bbbee getBbbeeDetails(String supplierNumber) throws Throwable;
	
}
