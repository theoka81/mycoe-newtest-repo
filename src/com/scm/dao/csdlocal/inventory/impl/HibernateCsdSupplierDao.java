package com.scm.dao.csdlocal.inventory.impl;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.scm.dao.common.impl.HibernateGenericCsdDao;
import com.scm.dao.csdlocal.domain.Supplier;
import com.scm.dao.csdlocal.inventory.CsdSupplierDao;

@Repository
public class HibernateCsdSupplierDao extends HibernateGenericCsdDao<Supplier, Integer> implements CsdSupplierDao{

	
	@Override
	@Transactional("csdTransactionManager")
	public Integer validateMaaaNumber(String maaaNumber) throws Throwable {
		String sqlStr = "select count(*) from suppliers where suppliernumber=:maaaNumber ";
		Query q = getCsdSession().createSQLQuery(sqlStr);
		q.setString("maaaNumber", maaaNumber);
		return (Integer) q.uniqueResult();
	}
	
	@Override
	@Transactional("csdTransactionManager")
	public Integer isCSDActive(String maaaNumber) throws Throwable {
		String sqlStr = "select count(*) from suppliers where suppliernumber=:maaaNumber and isActive=:isActive  ";
		Query q = getCsdSession().createSQLQuery(sqlStr);
		q.setString("maaaNumber", maaaNumber);
		q.setBoolean("isActive", true);
		return (Integer) q.uniqueResult();
	}
	
	@Override
	@Transactional("csdTransactionManager")
	public Supplier getSupplierDetails(String maaaNumber) throws Throwable{
		Criteria crit = getCsdSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierNumber", maaaNumber));
		List<Supplier> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}
}
