package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierCode;
import com.scm.dao.inventory.SupplierCodesDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateSupplierCodesDao extends HibernateGenericDao<SupplierCode, Long>
		implements SupplierCodesDao {


	@Override
	@Transactional
	public SupplierCode getSupplierCodeDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierId", supplierId));
		
		List<SupplierCode> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
