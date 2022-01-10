package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.util.StringHelper;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Supplier;
import com.scm.dao.domain.SupplierMaster;
import com.scm.dao.inventory.SupplierMasterDao;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

@SuppressWarnings("deprecation")
@Repository
public class HibernateSupplierMasterDao extends HibernateGenericDao<SupplierMaster, Long>
		implements SupplierMasterDao {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@Transactional
	public List<SupplierMaster> getSupplierMasterDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable {
		StringBuilder queryStr = new StringBuilder();
		queryStr.append("select sm.Cluster as cluster, sm.Company as company, sm.Department as department, sm.ParentNo as parentNo from SupplierMasters sm where sm.isActive=1 ");
		if (searchSortObj != null) {
			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
					queryStr.append(" and sm.cluster like '%" + searchSortObj.getSearchValue() + "%'");
			}

			if (StringHelper.isNotEmpty(searchSortObj.getSidx()) && StringHelper.isNotEmpty(searchSortObj.getSord())) {
				if (searchSortObj.getSidx().equalsIgnoreCase("cluster")) {
					queryStr.append(" order by sm.cluster " + searchSortObj.getSord());
				} else {
					queryStr.append(" order by sm.modifiedDateTime desc");
				}
			} else {
				queryStr.append(" order by sm.modifiedDateTime desc");
			}
		}
		Query query = getSession().createSQLQuery(queryStr.toString()).addScalar("cluster", new StringType())
				.addScalar("company", new StringType())
				.addScalar("department", new StringType())
				.addScalar("parentNo", new StringType());
		if (pagination != null) {
			if (pagination.getOffset() > 0) {
				query.setFirstResult(pagination.getOffset());
			}
			if (pagination.getSize() > 0) {
				query.setMaxResults(pagination.getSize());
			}
		}
		List<SupplierMaster> smList = query.setResultTransformer(Transformers.aliasToBean(SupplierMaster.class)).list();
		return smList;
	}

	@SuppressWarnings({ "rawtypes" })
	@Override
	@Transactional
	public int getSupplierMasterDetailsCount(SearchSortContainer searchSortObj) throws Throwable {

		int count = 0;
		StringBuilder queryStr = new StringBuilder();
		queryStr.append(" select count(*) from SupplierMasters sm where sm.isActive=1 ");
		if (searchSortObj != null) {
			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
					queryStr.append(" and sm.cluster like '%" + searchSortObj.getSearchValue() + "%'");
			}

		}
		Query query = getSession().createSQLQuery(queryStr.toString());
		Integer obj = (Integer) query.uniqueResult();
		if (obj != null) {
			count = obj.intValue();
		}
		return count;
	}
	
	@Override
	@Transactional
	public SupplierMaster getSupplierMasterDetails(String reference, boolean includeOr) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierRefNo", reference));
		if (includeOr) {
			crit.add(Restrictions.or(Restrictions.eq("supplierXRef1", reference)));
			crit.add(Restrictions.or(Restrictions.eq("supplierXRef2", reference)));
			crit.add(Restrictions.or(Restrictions.eq("supplierXRef3", reference)));
		}
		List<SupplierMaster> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}
	
	@Override
	@Transactional
	public SupplierMaster getSupplierMasterDetails(Long supplierReferenceId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierRefId", supplierReferenceId));
		List<SupplierMaster> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}
	
	@Override
	@Transactional
	public Long getSupplierMastersCount(String reference, String opr) throws Throwable {
		long count = 0l;
		String qryStr = "select count(*) from SupplierMaster where supplierXRef1 like :reference";
		Query qry = getSession().createQuery(qryStr);
		if (opr.equalsIgnoreCase("startswith")) {
			qry.setString("reference", reference + "%");
		} else if (opr.equalsIgnoreCase("endswith")) {
			qry.setString("reference", "%" + reference);
		} else if (opr.equalsIgnoreCase("contains")) {
			qry.setString("reference", "%" + reference + "%");
		} else {
			qry.setString("reference", reference);
		}
		Long obj = (Long) qry.uniqueResult();
		if (obj != null) {
			count = obj.longValue();
		}
		return count;
	}
	
	@Override
	@Transactional
	public Long getSupplierMastersCount() throws Throwable {
		long count = 0l;
		Query qry = getSession().createQuery("select count(*) from SupplierMaster");
		Long obj = (Long) qry.uniqueResult();
		if (obj != null) {
			count = obj.longValue();
		}
		return count;
	}

}
