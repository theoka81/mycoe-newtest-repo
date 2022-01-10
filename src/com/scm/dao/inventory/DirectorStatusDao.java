package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.DirectorStatus;

public interface DirectorStatusDao  extends GenericDao<DirectorStatus, Integer>{

	public DirectorStatus getDirectorStatusDetails(String code) throws Throwable;
	
}
