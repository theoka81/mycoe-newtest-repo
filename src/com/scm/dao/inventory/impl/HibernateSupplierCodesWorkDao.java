package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierCodesWork;
import com.scm.dao.inventory.SupplierCodesWorkDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateSupplierCodesWorkDao extends HibernateGenericDao<SupplierCodesWork, Long>
		implements SupplierCodesWorkDao {


	@Override
	@Transactional
	public SupplierCodesWork getSupplierCodesWorkDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("originalId", supplierId));
		
		List<SupplierCodesWork> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
