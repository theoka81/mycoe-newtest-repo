package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierMarketDevelopment;

public interface SupplierMarketDevelopmentDao extends GenericDao<SupplierMarketDevelopment, Long> {

	public Long getSupplierMarketDevelopmentCount() throws Throwable;

}
