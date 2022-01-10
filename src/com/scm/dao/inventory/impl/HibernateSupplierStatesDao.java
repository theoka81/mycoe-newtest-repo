package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierState;
import com.scm.dao.inventory.SupplierStatesDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateSupplierStatesDao extends HibernateGenericDao<SupplierState, Integer>
		implements SupplierStatesDao {


	@Override
	@Transactional
	public SupplierState getSupplierStateDetails(String code) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("code", code));
		
		List<SupplierState> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
