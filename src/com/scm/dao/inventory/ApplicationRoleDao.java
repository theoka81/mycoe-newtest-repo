package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.ApplicationRole;

public interface ApplicationRoleDao extends GenericDao<ApplicationRole, Long>{
	
	public ApplicationRole getByRoleName(String roleName) throws Throwable;

}