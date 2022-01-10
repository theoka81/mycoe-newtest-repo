package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Association;

public interface AssociationsDao  extends GenericDao<Association, Long>{

	public List<Association> getAssociationsDetails(Long supplierId) throws Throwable;
	
}
