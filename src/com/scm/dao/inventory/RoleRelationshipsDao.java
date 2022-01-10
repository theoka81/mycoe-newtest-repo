package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.RoleRelationship;

public interface RoleRelationshipsDao extends GenericDao<RoleRelationship, Long> {

	public List<RoleRelationship> getRoleRelationshipsBy(Long userGrpId, String roleType)
			throws Throwable;
	
	public List<RoleRelationship> getRoleRelationshipDetails(Long teamId) throws Throwable;
}
