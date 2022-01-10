package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.DirectorStatus;
import com.scm.dao.inventory.DirectorStatusDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateDirectorStatusDao extends HibernateGenericDao<DirectorStatus, Integer>
		implements DirectorStatusDao {


	@Override
	@Transactional
	public DirectorStatus getDirectorStatusDetails(String code) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("code", code));
		
		List<DirectorStatus> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
