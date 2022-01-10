package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierSubClassification;

public interface SupplierSubClassificationsDao extends GenericDao<SupplierSubClassification, Integer>{

	public SupplierSubClassification getSupplierSubClassificationByCode(String code) throws Throwable;
}
