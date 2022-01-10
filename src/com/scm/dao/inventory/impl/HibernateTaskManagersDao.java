package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.TaskManager;
import com.scm.dao.inventory.TaskManagersDao;

@Repository
public class HibernateTaskManagersDao extends HibernateGenericDao<TaskManager, Long>
		implements TaskManagersDao {

	@Override
	@Transactional
	public TaskManager getTaskManagersBy(Long approvalVersionId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("approvalVersionId", approvalVersionId));
		crit.add(Restrictions.eq("stepNo", 1l));
		crit.add(Restrictions.eq("isActive", true));
		crit.add(Restrictions.eq("isDeleted", false));
		List<TaskManager> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
