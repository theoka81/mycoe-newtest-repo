package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Clause;
import com.scm.dao.domain.ClauseMapping;

public interface ClauseMappingDao extends GenericDao<ClauseMapping, Integer> {

	public List<ClauseMapping> getClauseMappingDetails(Long referenceDetailId, Long referenceId, Long referenceTypeId)
			throws Throwable;
	
	public List<Clause> getClausesDetails(Long referenceDetailId, Long referenceId, Long referenceTypeId)
			throws Throwable;
}
