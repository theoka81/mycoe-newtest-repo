package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierContact;
import com.scm.dao.inventory.SupplierContactsDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateSupplierContactsDao extends HibernateGenericDao<SupplierContact, Long>
		implements SupplierContactsDao {


	@Override
	@Transactional
	public SupplierContact getSupplierContactsDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierId", supplierId));
		
		List<SupplierContact> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
