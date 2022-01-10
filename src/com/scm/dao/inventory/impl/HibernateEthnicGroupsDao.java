package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.EthnicGroup;
import com.scm.dao.inventory.EthnicGroupsDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateEthnicGroupsDao extends HibernateGenericDao<EthnicGroup, Integer>
		implements EthnicGroupsDao {


	@Override
	@Transactional
	public EthnicGroup getEthnicGroupDetails(String code) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("code", code));
		
		List<EthnicGroup> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
