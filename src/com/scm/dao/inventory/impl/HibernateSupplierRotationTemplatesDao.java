package com.scm.dao.inventory.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierRotationTemplate;
import com.scm.dao.inventory.SupplierRotationTemplatesDao;

@Repository
public class HibernateSupplierRotationTemplatesDao extends HibernateGenericDao<SupplierRotationTemplate, Long>
		implements SupplierRotationTemplatesDao {

	@Override
	@Transactional
	public Long getSupplierRotationTemplatesCount() throws Throwable {
		long count = 0l;
		Query qry = getSession().createQuery("select count(*) from SupplierRotationTemplate");
		Long obj = (Long) qry.uniqueResult();
		if (obj != null) {
			count = obj.longValue();
		}
		return count;
	}
}
