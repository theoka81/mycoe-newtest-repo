package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.TaskComparableRoute;
import com.scm.dao.inventory.TaskComparableRoutesDao;

@Repository
public class HibernateTaskComparableRoutesDao extends HibernateGenericDao<TaskComparableRoute, Long>
		implements TaskComparableRoutesDao {

	@Override
	@Transactional
	public TaskComparableRoute getTaskComparableRoutesBy(Long taskMgrId, Long approvalVersionId, Long totalValue)
			throws Throwable {

		Query qry = getSession().createQuery(
				"select t from TaskComparableRoute t where t.taskId=:taskMgrId and t.approvalVersionId=:approvalVersionId "
						+ " and t.isActive=:isActive and t.isDeleted=:isDeleted and t.minimumThreshold <= :totalValue and t.maximumThreshold > :totalValue order by id desc");

		qry.setLong("taskMgrId", taskMgrId);
		qry.setLong("approvalVersionId", approvalVersionId);
		qry.setLong("totalValue", totalValue);
		qry.setBoolean("isActive", true);
		qry.setBoolean("isDeleted", false);
		List<TaskComparableRoute> tcrList = qry.list();
		if (tcrList != null && tcrList.size() > 0) {
			return tcrList.get(0);
		} else
			return null;
	}

}
