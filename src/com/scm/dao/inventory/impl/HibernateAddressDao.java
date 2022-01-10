package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.util.StringHelper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Address;
import com.scm.dao.inventory.AddressDao;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

@SuppressWarnings("deprecation")
@Repository
public class HibernateAddressDao extends HibernateGenericDao<Address, Long>
		implements AddressDao {


	@Override
	@Transactional
	public List<Address> getAddressDetails(Long supplierId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierId", supplierId));
		
		List<Address> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}

	
	@Override
	public int getSupplierAddressCount(SearchSortContainer searchSortObj) throws Throwable {
		int count = 0;
		String queryStr = "select count(*) from Address a ";
		if (searchSortObj != null) {
			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
				queryStr = queryStr + " where (a.supplierId like '%" + searchSortObj.getSearchValue()
						+ "%' or a.supplierNumber like '%" + searchSortObj.getSearchValue()
						+ "%' or a.addressTypeCode like '%" + searchSortObj.getSearchValue()
						+ "%' or s.addressLine1 like '%" + searchSortObj.getSearchValue()
						+ "%' or s.addressLine2 like '%" + searchSortObj.getSearchValue() + "%' ) ";
			}
		}
		Query query = getSession().createQuery(queryStr);
		Long obj = (Long) query.uniqueResult();
		if (obj != null) {
			count = obj.intValue();
		}
		return count;
	}

	@Override
	public List<Address> getSupplierAddressSummary(Pagination pagination, SearchSortContainer searchSortObj)
			throws Throwable {
		String queryStr = " from Address a ";
		if (searchSortObj != null) {
			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
				queryStr = queryStr + " where (a.supplierId like '%" + searchSortObj.getSearchValue()
						+ "%' or a.supplierNumber like '%" + searchSortObj.getSearchValue()
						+ "%' or a.addressTypeCode like '%" + searchSortObj.getSearchValue()
						+ "%' or a.addressLine1 like '%" + searchSortObj.getSearchValue()
						+ "%' or a.addressLine2 like '%" + searchSortObj.getSearchValue() + "%' ) ";
			}
			if (StringHelper.isNotEmpty(searchSortObj.getSidx()) && StringHelper.isNotEmpty(searchSortObj.getSord())) {
				switch (searchSortObj.getSidx()) {
				case "supplierId": {
					queryStr = queryStr + " order by a.supplierId " + searchSortObj.getSord();
					break;
				}
				case "supplierNumber": {
					queryStr = queryStr + " order by a.supplierNumber " + searchSortObj.getSord();
					break;
				}
				case "addressTypeCode": {
					queryStr = queryStr + " order by a.addressTypeCode " + searchSortObj.getSord();
					break;
				}
				case "addressLine1": {
					queryStr = queryStr + " order by a.addressLine1 " + searchSortObj.getSord();
					break;
				}
				case "addressLine2": {
					queryStr = queryStr + " order by a.addressLine2 " + searchSortObj.getSord();
					break;
				}
				default: {
					queryStr = queryStr + " order by a.createdDate desc ";
				}
				}

			} else {
				queryStr = queryStr + " order by a.createdDate desc ";
			}
		} else {
			queryStr = queryStr + " order by a.createdDate desc ";
		}
		Query query = getSession().createQuery(queryStr);
		if (pagination != null) {
			if (pagination.getOffset() > 0) {
				query.setFirstResult(pagination.getOffset());
			}
			if (pagination.getSize() > 0) {
				query.setMaxResults(pagination.getSize());
			}
		}
		return query.list();
	}
}
