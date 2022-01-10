package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.CededSupplier;
import com.scm.dao.inventory.CededSupplierDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateCededSupplierDao extends HibernateGenericDao<CededSupplier, Long>
		implements CededSupplierDao {


	@Override
	@Transactional
	public CededSupplier getCededSupplierDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierId", supplierId));
		
		List<CededSupplier> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
