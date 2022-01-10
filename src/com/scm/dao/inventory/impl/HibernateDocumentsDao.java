package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Document;
import com.scm.dao.inventory.DocumentsDao;

@SuppressWarnings("deprecation")
@Repository
public class HibernateDocumentsDao extends HibernateGenericDao<Document, Long>
		implements DocumentsDao {


	@Override
	@Transactional
	public List<Document> getDocumentsDetails(Long id) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("referenceId", id));
		crit.add(Restrictions.eq("isActive", true));
		crit.add(Restrictions.eq("isDeleted", false));
		List<Document> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}
	
	@Override
	@Transactional
	public List<Document> getDocumentsDetails(Long userCodeId, Long referenceId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("referenceId", referenceId));
		crit.add(Restrictions.eq("userCodeId", userCodeId));
		crit.add(Restrictions.eq("isActive", true));
		crit.add(Restrictions.eq("isDeleted", false));
		List<Document> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}
	

	@Override
	@Transactional
	public List<Document> getDocumentsDetails(String userCodeKey, Long referenceId) throws Throwable {

		String sqlQry = "select d from Document d, UserCode uc where d.referenceId=:referenceId "
				+ " and d.isActive=:isActive and d.isDeleted=:isDeleted and d.userCodeId=uc.id and uc.codeKey=:userCodeKey";
		Query qry = getSession().createQuery(sqlQry);
		qry.setLong("referenceId", referenceId);
		qry.setString("userCodeKey", userCodeKey);
		qry.setBoolean("isActive", true);
		qry.setBoolean("isDeleted", false);

		return qry.list();

	}
}
