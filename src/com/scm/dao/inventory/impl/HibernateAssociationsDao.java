package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Address;
import com.scm.dao.domain.Association;
import com.scm.dao.inventory.AssociationsDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateAssociationsDao extends HibernateGenericDao<Association, Long>
		implements AssociationsDao {


	@Override
	@Transactional
	public List<Association> getAssociationsDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierId", supplierId));
		
		List<Association> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}

}
