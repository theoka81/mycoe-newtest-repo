package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.TaskComparableRoute;

public interface TaskComparableRoutesDao extends GenericDao<TaskComparableRoute, Long> {

	public TaskComparableRoute getTaskComparableRoutesBy(Long taskMgrId, Long approvalVersionId, Long totalValue)
			throws Throwable;
}
