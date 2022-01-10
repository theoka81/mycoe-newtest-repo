package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierFlag;
import com.scm.dao.inventory.SupplierFlagsDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateSupplierFlagsDao extends HibernateGenericDao<SupplierFlag, Long>
		implements SupplierFlagsDao {


	@Override
	@Transactional
	public List<SupplierFlag> getSupplierFlagsDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierId", supplierId));
		
		List<SupplierFlag> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}

}
