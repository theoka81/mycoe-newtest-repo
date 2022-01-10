package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.DirectorFlag;

public interface DirectorFlagsDao  extends GenericDao<DirectorFlag, Long>{

	public List<DirectorFlag> getDirectorFlagsDetails(Long supplierId) throws Throwable;
	
}
