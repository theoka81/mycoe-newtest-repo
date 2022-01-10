package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierClassification;

public interface SupplierClassificationsDao extends GenericDao<SupplierClassification, Integer>{

	public SupplierClassification getSupplierClassificationByCode(String code) throws Throwable;
}
