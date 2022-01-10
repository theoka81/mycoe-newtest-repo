package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierIndustryClassification;

public interface SupplierIndustryClassificationsDao  extends GenericDao<SupplierIndustryClassification, Long>{

	public List<SupplierIndustryClassification> getSupplierIndustryClassificationsDetails(Long supplierId) throws Throwable;
	
}
