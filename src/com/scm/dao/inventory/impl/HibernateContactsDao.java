package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Bbbee;
import com.scm.dao.domain.Contact;
import com.scm.dao.inventory.ContactsDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateContactsDao extends HibernateGenericDao<Contact, Long>
		implements ContactsDao {


	@Override
	@Transactional
	public List<Contact> getContactsDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierId", supplierId));
		
		List<Contact> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}

}
