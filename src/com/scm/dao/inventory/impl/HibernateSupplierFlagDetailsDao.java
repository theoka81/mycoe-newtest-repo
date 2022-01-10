package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierFlagDetail;
import com.scm.dao.inventory.SupplierFlagDetailsDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateSupplierFlagDetailsDao extends HibernateGenericDao<SupplierFlagDetail, Long>
		implements SupplierFlagDetailsDao {


	@Override
	@Transactional
	public List<SupplierFlagDetail> getSupplierFlagsDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierId", supplierId));
		
		List<SupplierFlagDetail> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}

}
