package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.util.StringHelper;
import org.hibernate.transform.Transformers;
import org.hibernate.type.BooleanType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.ContractDetail;
import com.scm.dao.inventory.ContractDetailsDao;
import com.scm.modal.ContractDetailBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

@Repository
public class HibernateContractDetailsDao extends HibernateGenericDao<ContractDetail, Long>
		implements ContractDetailsDao {

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public List<ContractDetailBean> getContractDetailsList(String maaaNumber) throws Throwable {

		String sqlStr = "select cd.id as id, cd.ContractMasterId as contractMasterId, cd.ContractNo as contractNo, "
				+ "cd.ItemNo as itemNo, cd.UnitCost as unitCost " + "from " + "SystemUsers u, "
				+ "Suppliers s, SupplierMasters sm, ContractDetails cd where " + "s.SupplierNumber= u.MaaaNumber and "
				+ "sm.SupplierRefId=s.id and " + "cd.SupplierId=sm.id and "
				+ "cd.IsActive=:isActive and cd.isDeleted =:isDeleted and u.maaanumber=:maaaNumber";
		Query q = getSession().createSQLQuery(sqlStr).addScalar("id", new LongType())
				.addScalar("contractNo", new StringType()).addScalar("contractMasterId", new LongType())
				.addScalar("itemNo", new StringType()).addScalar("unitCost", new LongType());
		q.setString("maaaNumber", maaaNumber);
		q.setBoolean("isActive", true);
		q.setBoolean("isDeleted", false);
		List<ContractDetailBean> ipwList = q.setResultTransformer(Transformers.aliasToBean(ContractDetailBean.class))
				.list();
		return ipwList;
	}

	@Override
	public List<ContractDetail> getContractDetailsByContractMasterId(Long contractMasterId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("contractMasterId", contractMasterId));

		List<ContractDetail> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}

	@Override
	public List<ContractDetailBean> getContractDetailsSummary(Pagination pagination, SearchSortContainer searchSortObj)
			throws Throwable {
		String queryStr = "select cd.ContractMasterId as contractMasterId, cd.id as contractDetailsId, cd.ContractNo as contractNo "
				+ ",cm.ContractTitle as contractTitle, coalesce(i.ItemDescription, 'Not Set') as commodityDescription "
				+ ", cd.[LineNo] as 'lineNo', cd.ItemNo as itemNo, coalesce(uc.Description, '') as contractStatus "
				+ ",cd.ContractType as contractType, cd.ContractTypeId as contractTypeId "
				+ ",cm.ProcurementType as procurementType, cd.QuantityOrdered as quantityOrdered "
				+ ", cd.ExtendedPrice as extendedPrice, cd.UnitCost as unitPrice "
				+ ",FORMAT(cm.ContractStartDate,'yyyy-MM-dd') as contractBeginDate "
				+ ",FORMAT(cm.ContractEndDate,'yyyy-MM-dd') as contractExpiryDate "
				+ ",FORMAT(cd.ContractStartDate,'yyyy-MM-dd') as contractStartDate "
				+ ",FORMAT(cd.ContractEndDate,'yyyy-MM-dd') as contractEndDate "
				+ ",FORMAT(cd.OriginalPromisedDeliveryDate,'yyyy-MM-dd') as originalPromisedDeliveryDate "
				+ ",cd.UnitOfMeasurePrimary as unitOfMeasurePrimary "
				+ ",cd.OnHoldAmount as onHoldAmount "
				+ ",cd.ReceivedAmount as receivedAmount "
				+ ",cd.RetentionYN as retentionYN "
				+ ",cd.StatusReasonId as statusReasonId "
				+ ",cd.RequestingUnitId as requestingUnitId "
				+ ",coalesce(s.LegalName, 'Not Set') as supplierName "
				+ ",coalesce(s.SupplierNumber, '') as supplierNumber "
				+ " from ContractDetails cd left outer join ContractMasters cm on cd.ContractMasterId=cm.id "
				+ " left outer join UserCodes uc on uc.id=cm.StatusId "
				+ " left outer join InventoryDefinitions i on i.id=cd.InventoryId "
				+ " left outer join SupplierMasters sm on sm.id=cd.SupplierId "
				+ " left outer join Suppliers s on sm.SupplierRefId=s.id " + " where cm.id=:contractMasterId";
		if (searchSortObj != null) {

			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
				queryStr = queryStr + " and (cd.ContractMasterId like '%" + searchSortObj.getSearchValue()
						+ "%' or cd.ContractNo like '%" + searchSortObj.getSearchValue()
						+ "%' or i.ItemDescription like '%" + searchSortObj.getSearchValue()
						+ "%' or s.LegalName like '%" + searchSortObj.getSearchValue()
						+ "%' or cd.ExtendedPrice like '%" + searchSortObj.getSearchValue()
						+ "%' or cd.UnitCost like '%" + searchSortObj.getSearchValue() + "%' ) ";
			}
			if (StringHelper.isNotEmpty(searchSortObj.getSidx()) && StringHelper.isNotEmpty(searchSortObj.getSord())) {
				switch (searchSortObj.getSidx()) {
				case "contractMasterId": {
					queryStr = queryStr + " order by cd.ContractMasterId " + searchSortObj.getSord();
					break;
				}
				case "contractNo": {
					queryStr = queryStr + " order by cd.ContractNo " + searchSortObj.getSord();
					break;
				}
				case "commodityDescription": {
					queryStr = queryStr + " order by i.ItemDescription " + searchSortObj.getSord();
					break;
				}
				case "supplierName": {
					queryStr = queryStr + " order by s.LegalName " + searchSortObj.getSord();
					break;
				}
				case "extendedPrice": {
					queryStr = queryStr + " order by cd.ExtendedPrice " + searchSortObj.getSord();
					break;
				}
				case "unitPrice": {
					queryStr = queryStr + " order by cd.UnitCost " + searchSortObj.getSord();
					break;
				}
				default: {
					queryStr = queryStr + " order by cm.ContractStartDate desc ";
				}
				}

			} else {
				queryStr = queryStr + " order by cm.ContractStartDate desc ";
			}
		} else {
			queryStr = queryStr + " order by cm.ContractStartDate desc ";
		}
		Query query = getSession().createSQLQuery(queryStr).addScalar("contractMasterId", new LongType())
				.addScalar("contractDetailsId", new LongType()).addScalar("contractNo", new StringType())
				.addScalar("contractTitle", new StringType()).addScalar("commodityDescription", new StringType())
				.addScalar("lineNo", new StringType()).addScalar("itemNo", new StringType())
				.addScalar("contractStatus", new StringType()).addScalar("contractType", new StringType())
				.addScalar("contractTypeId", new LongType()).addScalar("procurementType", new StringType())
				.addScalar("quantityOrdered", new LongType()).addScalar("extendedPrice", new LongType())
				.addScalar("unitPrice", new LongType()).addScalar("contractBeginDate", new StringType())
				.addScalar("unitOfMeasurePrimary", new LongType()).addScalar("onHoldAmount", new LongType())
				.addScalar("receivedAmount", new LongType()).addScalar("requestingUnitId", new LongType())
				.addScalar("supplierNumber", new StringType()).addScalar("supplierName", new StringType())
				.addScalar("contractStartDate", new StringType()).addScalar("contractEndDate", new StringType())
				.addScalar("contractExpiryDate", new StringType()).addScalar("originalPromisedDeliveryDate", new StringType())
				.addScalar("retentionYN", new BooleanType());
		query.setLong("contractMasterId", searchSortObj.getContractMasterId());
		if (pagination != null) {
			if (pagination.getOffset() > 0) {
				query.setFirstResult(pagination.getOffset());
			}
			if (pagination.getSize() > 0) {
				query.setMaxResults(pagination.getSize());
			}
		}
		List<ContractDetailBean> smList = query.setResultTransformer(Transformers.aliasToBean(ContractDetailBean.class))
				.list();
		return smList;

	}

	@Override
	public int getContractDetailsCount(SearchSortContainer searchSortObj) throws Throwable {
		int count = 0;
		String queryStr = " select count(*)  from ContractDetails cd "
				+ " left outer join ContractMasters cm on cd.ContractMasterId=cm.id "
				+ "	left outer join UserCodes uc on uc.id=cm.StatusId "
				+ "	left outer join InventoryDefinitions i on i.id=cd.InventoryId "
				+ "	left outer join SupplierMasters sm on sm.id=cd.SupplierId "
				+ "	left outer join Suppliers s on sm.SupplierRefId=s.id where cm.id=:contractMasterId";
		if (searchSortObj != null) {

			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
				queryStr = queryStr + " and (cd.ContractMasterId like '%" + searchSortObj.getSearchValue()
						+ "%' or cd.ContractNo like '%" + searchSortObj.getSearchValue()
						+ "%' or i.ItemDescription like '%" + searchSortObj.getSearchValue()
						+ "%' or s.LegalName like '%" + searchSortObj.getSearchValue()
						+ "%' or cd.ExtendedPrice like '%" + searchSortObj.getSearchValue()
						+ "%' or cd.UnitCost like '%" + searchSortObj.getSearchValue() + "%' ) ";
			}
		}
		Query query = getSession().createSQLQuery(queryStr);
		query.setLong("contractMasterId", searchSortObj.getContractMasterId());
		Integer obj = (Integer) query.uniqueResult();
		if (obj != null) {
			count = obj.intValue();
		}
		return count;

	}

}
