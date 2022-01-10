package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierSubClassification;
import com.scm.dao.inventory.SupplierSubClassificationsDao;

@Repository
public class HibernateSupplierSubClassificationsDao extends HibernateGenericDao<SupplierSubClassification, Integer>
		implements SupplierSubClassificationsDao {

	public SupplierSubClassification getSupplierSubClassificationByCode(String code) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("code", code));

		List<SupplierSubClassification> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
