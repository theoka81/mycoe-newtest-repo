package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.ApplicationRole;
import com.scm.dao.inventory.ApplicationRoleDao;

@Repository
public class HibernateApplicationRoleDao extends HibernateGenericDao<ApplicationRole, Long>
		implements ApplicationRoleDao {

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public ApplicationRole getByRoleName(String roleName) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("roleName", roleName));
		List<ApplicationRole> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}
	

}
