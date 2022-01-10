package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Taxes;

public interface TaxesDao  extends GenericDao<Taxes, Long>{

	public List<Taxes> getTaxesDetails(Long supplierId) throws Throwable;
	
}
