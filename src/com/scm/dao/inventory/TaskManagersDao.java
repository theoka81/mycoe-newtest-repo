package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.TaskManager;

public interface TaskManagersDao  extends GenericDao<TaskManager, Long>{

	public TaskManager getTaskManagersBy(Long approvalVersionId) throws Throwable;
}
