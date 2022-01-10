package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierCompliantHeader;

public interface SupplierCompliantHeaderDao extends GenericDao<SupplierCompliantHeader, Long>{
	
	public List<SupplierCompliantHeader> getSCHList(String maaaNumber) throws Throwable;
	
	public Integer getNewCount() throws Throwable;
	
	public Integer getPendingCount() throws Throwable;
	
	public Integer getEscalatedCount() throws Throwable;
	
	public Integer getClosedCount() throws Throwable;

}
