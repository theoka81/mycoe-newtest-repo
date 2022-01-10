package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Contact;
import com.scm.dao.domain.Director;
import com.scm.dao.inventory.DirectorsDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateDirectorsDao extends HibernateGenericDao<Director, Long>
		implements DirectorsDao {


	@Override
	@Transactional
	public List<Director> getDirectorsDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierId", supplierId));
		
		List<Director> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}

}
