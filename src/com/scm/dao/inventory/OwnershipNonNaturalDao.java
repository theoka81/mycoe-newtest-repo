package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.OwnershipNonNatural;

public interface OwnershipNonNaturalDao  extends GenericDao<OwnershipNonNatural, Long>{

	public List<OwnershipNonNatural> getOwnershipNonNaturalDetails(Long supplierId) throws Throwable;
	
}
