package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierMasterWork;
import com.scm.dao.inventory.SupplierMasterWorkDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateSupplierMasterWorkDao extends HibernateGenericDao<SupplierMasterWork, Long>
		implements SupplierMasterWorkDao {


	@Override
	@Transactional
	public SupplierMasterWork getSupplierMasterWorkDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("originalId", supplierId));
		
		List<SupplierMasterWork> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}
	
	@Override
	@Transactional
	public SupplierMasterWork getSupplierMasterWorkDetails(String maaaNumber) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierRefNo", maaaNumber));
		
		List<SupplierMasterWork> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
