package com.scm.dao.inventory.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.Tuple;

import org.hibernate.Query;
import org.hibernate.internal.util.StringHelper;
import org.hibernate.transform.Transformers;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.ContractMaster;
import com.scm.dao.inventory.ContractMasterDao;
import com.scm.modal.ContractBean;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

@SuppressWarnings("deprecation")
@Repository
public class HibernateContractMasterDao extends HibernateGenericDao<ContractMaster, Long> implements ContractMasterDao {

	@Override
	@Transactional
	public Long getContractMasterCount() throws Throwable {
		long count = 0l;
		Query qry = getSession().createQuery("select count(*) from ContractMaster");
		Long obj = (Long) qry.uniqueResult();
		if (obj != null) {
			count = obj.longValue();
		}
		return count;
	}

	@Override
	public List<ContractBean> getContractMastersSummary(Pagination pagination, SearchSortContainer searchSortObj)
			throws Throwable {
		String queryStr = "select c.id,c.contractNo,c.contractTitle,s.[description] as [status],ct.[Description] as contractType "
				+ ",p.[description] as procurementType,r.[Description] as requestingUnit "
				+ ",FORMAT(c.ContractStartDate,'yyyy-MM-dd') as contractStartDate "
				+ ",FORMAT(c.ContractEndDate,'yyyy-MM-dd') as contractEndDate "
				+ ",FORMAT(c.ModifiedDateTime,'yyyy-MM-dd') as modifiedDate "
				+ " , su.firstname + ' ' + su.lastname as modifiedBy "
				+ " from contractMasters c left outer join UserCodes s on s.id=c.StatusId "
				+ " left outer join UserCodes ct on ct.id=c.ContractTypeId "
				+ " left outer join UserCodes r on r.id=c.RequestingUnitId "
				+ " left outer join UserCodes p on p.id=c.OrderTypeId  "
				+ " left outer join SystemUsers su on su.id=c.ModifiedBySystemUserId " + " where c.IsActive=1";
		if (searchSortObj != null) {

			if (searchSortObj.getContractTypeId() != null) {
				queryStr = queryStr + " and c.ContractTypeId = " + searchSortObj.getContractTypeId();
			}

			if (searchSortObj.getStatusId() != null) {
				queryStr = queryStr + " and s.Id = " + searchSortObj.getStatusId();
			}

			if (searchSortObj.getProcurementTypeId() != null) {
				queryStr = queryStr + " and p.Id = " + searchSortObj.getProcurementTypeId();
			}

			if (searchSortObj.getRequestedUnitId() != null) {
				queryStr = queryStr + " and r.Id = " + searchSortObj.getRequestedUnitId();
			}

			if (searchSortObj.getSupplierId() != null) {
				queryStr = queryStr + " and c.SupplierId = " + searchSortObj.getSupplierId();
			}

			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
				queryStr = queryStr + " and (c.contractNo like '%" + searchSortObj.getSearchValue()
						+ "%' or c.contractTitle like '%" + searchSortObj.getSearchValue()
						+ "%' or s.description like '%" + searchSortObj.getSearchValue()
						+ "%' or ct.Description like '%" + searchSortObj.getSearchValue()
						+ "%' or p.description like '%" + searchSortObj.getSearchValue() + "%' or r.Description like '%"
						+ searchSortObj.getSearchValue() + "%' or FORMAT(c.ContractStartDate,'yyyy-MM-dd') like '%"
						+ searchSortObj.getSearchValue() + "%' or FORMAT(c.ContractEndDate,'yyyy-MM-dd') like '%"
						+ searchSortObj.getSearchValue() + "%' or FORMAT(c.ModifiedDateTime,'yyyy-MM-dd') like '%"
						+ searchSortObj.getSearchValue() + "%' or su.firstname like '%" + searchSortObj.getSearchValue()
						+ "%' or su.lastname like '%" + searchSortObj.getSearchValue() + "%' ) ";
			}
			if (StringHelper.isNotEmpty(searchSortObj.getSidx()) && StringHelper.isNotEmpty(searchSortObj.getSord())) {
				switch (searchSortObj.getSidx()) {
				case "contractNo": {
					queryStr = queryStr + " order by c.ContractNo " + searchSortObj.getSord();
					break;
				}
				case "contractTitle": {
					queryStr = queryStr + " order by c.ContractTitle " + searchSortObj.getSord();
					break;
				}
				case "status": {
					queryStr = queryStr + " order by s.description " + searchSortObj.getSord();
					break;
				}
				case "contractType": {
					queryStr = queryStr + " order by ct.description " + searchSortObj.getSord();
					break;
				}
				case "procurementType": {
					queryStr = queryStr + " order by p.description " + searchSortObj.getSord();
					break;
				}
				case "requestingUnit": {
					queryStr = queryStr + " order by r.description " + searchSortObj.getSord();
					break;
				}
				case "contractStartDate": {
					queryStr = queryStr + " order by c.ContractStartDate " + searchSortObj.getSord();
					break;
				}
				case "contractEndDate": {
					queryStr = queryStr + " order by c.ContractEndDate " + searchSortObj.getSord();
					break;
				}
				case "modifiedDate": {
					queryStr = queryStr + " order by c.ModifiedDateTime " + searchSortObj.getSord();
					break;
				}
				case "modifiedBy": {
					queryStr = queryStr + " order by s.firstname " + searchSortObj.getSord();
					break;
				}
				default: {
					queryStr = queryStr + " order by c.CreatedDateTime desc ";
				}
				}

			} else {
				queryStr = queryStr + " order by c.CreatedDateTime desc ";
			}
		} else {
			queryStr = queryStr + " order by c.CreatedDateTime desc ";
		}
		Query query = getSession().createSQLQuery(queryStr).addScalar("id", new LongType())
				.addScalar("contractNo", new StringType()).addScalar("contractType", new StringType())
				.addScalar("contractTitle", new StringType()).addScalar("status", new StringType())
				.addScalar("procurementType", new StringType()).addScalar("requestingUnit", new StringType())
				.addScalar("contractStartDate", new StringType()).addScalar("contractEndDate", new StringType())
				.addScalar("modifiedDate", new StringType()).addScalar("modifiedBy", new StringType());
		if (pagination != null) {
			if (pagination.getOffset() > 0) {
				query.setFirstResult(pagination.getOffset());
			}
			if (pagination.getSize() > 0) {
				query.setMaxResults(pagination.getSize());
			}
		}
		List<ContractBean> smList = query.setResultTransformer(Transformers.aliasToBean(ContractBean.class)).list();
		return smList;

	}

	@Override
	public int getContractMastersCount(SearchSortContainer searchSortObj) throws Throwable {
		int count = 0;
		String queryStr = " select count(*) from contractMasters c left outer join UserCodes s on s.id=c.StatusId "
				+ "	left outer join UserCodes ct on ct.id=c.ContractTypeId "
				+ "	left outer join UserCodes r on r.id=c.RequestingUnitId "
				+ "	left outer join UserCodes p on p.id=c.OrderTypeId  "
				+ "	left outer join SystemUsers su on su.id=c.ModifiedBySystemUserId " + "	where c.IsActive=1 ";
		if (searchSortObj != null) {
			
			if(searchSortObj.getContractTypeId() != null) {
				queryStr = queryStr + " and c.ContractTypeId = "+searchSortObj.getContractTypeId();
			}
			
			if(searchSortObj.getStatusId() != null) {
				queryStr = queryStr + " and s.Id = "+searchSortObj.getStatusId();
			}
			
			if(searchSortObj.getProcurementTypeId() != null) {
				queryStr = queryStr + " and p.Id = "+searchSortObj.getProcurementTypeId();
			}
			
			if(searchSortObj.getRequestedUnitId() != null) {
				queryStr = queryStr + " and r.Id = "+searchSortObj.getRequestedUnitId();
			}
			
			if(searchSortObj.getSupplierId() != null) {
				queryStr = queryStr + " and c.SupplierId = "+searchSortObj.getSupplierId();
			}
			
			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
				queryStr = queryStr + " and (c.contractNo like '%" + searchSortObj.getSearchValue()
						+ "%' or c.contractTitle like '%" + searchSortObj.getSearchValue()
						+ "%' or s.description like '%" + searchSortObj.getSearchValue()
						+ "%' or ct.Description like '%" + searchSortObj.getSearchValue()
						+ "%' or p.description like '%" + searchSortObj.getSearchValue() + "%' or r.Description like '%"
						+ searchSortObj.getSearchValue() + "%' or FORMAT(c.ContractStartDate,'yyyy-MM-dd') like '%"
						+ searchSortObj.getSearchValue() + "%' or FORMAT(c.ContractEndDate,'yyyy-MM-dd') like '%"
						+ searchSortObj.getSearchValue() + "%' or FORMAT(c.ModifiedDateTime,'yyyy-MM-dd') like '%"
						+ searchSortObj.getSearchValue() + "%' or su.firstname like '%" + searchSortObj.getSearchValue()
						+ "%' or su.lastname like '%" + searchSortObj.getSearchValue() + "%' ) ";
			}
		}
		Query query = getSession().createSQLQuery(queryStr);
		Integer obj = (Integer) query.uniqueResult();
		if (obj != null) {
			count = obj.intValue();
		}
		return count;


	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Long, String> getContractMastersKeyMap() throws Throwable {

		String qryStr = "select c.id as id, coalesce(c.contractType, '') as contractType from "
				+ " ContractMaster c where c.isActive=:isActive and c.isDeleted=:isDeleted order by c.contractType asc ";
		
		Query<Tuple> query = getSession()
				.createQuery(qryStr, Tuple.class);
		
		query.setBoolean("isActive", true);
		query.setBoolean("isDeleted", false);
		
		Map<Long, String> orginMap = query.getResultList().stream()
				.collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).longValue(),
						tuple -> ((String) tuple.get("contractType")).toString().trim()));

		return orginMap;

	}
}
