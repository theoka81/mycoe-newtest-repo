package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.ApplicationUserRole;

public interface ApplicationUserRoleDao extends GenericDao<ApplicationUserRole, Long>{
	
	public String getByUserId(Long userId) throws Throwable;

}