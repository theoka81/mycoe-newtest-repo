package com.scm.dao.inventory.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.Tuple;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.util.StringHelper;
import org.hibernate.transform.Transformers;
import org.hibernate.type.BigIntegerType;
import org.hibernate.type.BooleanType;
import org.hibernate.type.DoubleType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.hibernate.type.TimestampType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Supplier;
import com.scm.dao.inventory.SupplierDao;
import com.scm.keys.UserCodeIdKeys;
import com.scm.modal.BidSpecificationsBean;
import com.scm.modal.Pagination;
import com.scm.modal.RequisitionDetailBean;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SroBean;
import com.scm.modal.SuppliersBean;
import com.scm.modal.UserBean;

@SuppressWarnings("deprecation")
@Repository
public class HibernateSupplierDao extends HibernateGenericDao<Supplier, Long> implements SupplierDao {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@Transactional
	public List<SroBean> getSupplierSRODetailsSummary(Pagination pagination, SearchSortContainer searchSortObj)
			throws Throwable {
		StringBuilder queryStr = new StringBuilder();
		queryStr.append(
				"select sm.Cluster as cluster, sm.Company as company, sm.Department as department, sm.ParentNo as parentNo from Suppliers sm where sm.isActive=1 ");
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
				.addScalar("company", new StringType()).addScalar("department", new StringType())
				.addScalar("parentNo", new StringType());
		if (pagination != null) {
			if (pagination.getOffset() > 0) {
				query.setFirstResult(pagination.getOffset());
			}
			if (pagination.getSize() > 0) {
				query.setMaxResults(pagination.getSize());
			}
		}
		List<SroBean> smList = query.setResultTransformer(Transformers.aliasToBean(SroBean.class)).list();
		return smList;
	}

	@SuppressWarnings({ "rawtypes" })
	@Override
	@Transactional
	public int getSupplierSRODetailsCount(SearchSortContainer searchSortObj) throws Throwable {

		int count = 0;
		StringBuilder queryStr = new StringBuilder();
		queryStr.append(" select count(*) from Supplier sm where sm.isActive=1 ");
		Query query = getSession().createQuery(queryStr.toString());
		Integer obj = (Integer) query.uniqueResult();
		if (obj != null) {
			count = obj.intValue();
		}
		return count;
	}

	@Override
	@Transactional
	public List<RequisitionDetailBean> loadRequisitionDetails(String maaaNumber, Integer orderTypeId) throws Throwable {
		String sqlStr = "select t.requisitionId as requisitionId, t.\"lineNo\" as \"lineNo\","
				+ "IIF(t.requestingUnit is null, 'Not Set', t.requestingUnit) as requestingUnit,"
				+ "t.orderNo as orderNo," + "IIF(t.orderType is null, 'Not Set', t.orderType) as orderType,"
				+ "t.requisitionDetailsId as requisitionDetailsId, t.orderTypeId as orderTypeId,"
				+ "IIF(t.commodityNo is null, 'Not Set', t.commodityNo) as commodityNo,"
				+ "IIF(t.commodityShortDescription is null, 'Not Set', t.commodityShortDescription) as commodityShortDescription,"
				+ "IIF(t.supplier is null, 'Not Set', t.supplier) as supplier, t.supplierId as supplierId,"
				+ "t.amountUnitCost as amountUnitCost, t.amountExtendedPrice as amountExtendedPrice,"
				+ "IIF(t.transactionQuantity is null, 0, t.transactionQuantity) as transactionQuantity,"
				+ "t.unitofMeasureId as unitofMeasureId,"
				+ "IIF(t.unitOfMeasure is null, 'Not Set', t.unitOfMeasure) as unitOfMeasure,"
				+ "t.dateOrderTransaction as dateOrderTransaction, "
				+ "IIF(t.currencyCode is null, 'Not Set', t.currencyCode) as currencyCode "
				+ "from (select rh.Id as requisitionId, rd.\"LineNo\" as \"lineNo\", "
				+ "((select Description from UserCodes where id = rh.RequestingUnitId)) as requestingUnit,"
				+ "rh.OrderNo as orderNo, "
				+ "((select Description from UserCodes where id = rh.OrderTypeId)) as orderType,"
				+ "rd.Id as requisitionDetailsId," + "rh.OrderTypeId as orderTypeId,"
				+ "inv.ItemNo as commodityNo, inv.ShortDescription as commodityShortDescription,"
				+ "sup.LegalName as supplier, sm.id as supplierId,"
				+ "rd.AmountUnitCost as amountUnitCost, rd.AmountExtendedPrice as amountExtendedPrice,"
				+ "rd.UnitsOrderTransactionQuantity as transactionQuantity," + "rd.UnitofMeasureId as unitofMeasureId,"
				+ "((select Description from UserCodes where id = rd.UnitofMeasureId)) as unitOfMeasure,"
				+ "GETDATE() as dateOrderTransaction," + "rd.CurrencyCodeFrom as currencyCode " + "from "
				+ "RequisitionHeaders rh left join RequisitionDetails rd on rh.Id=rd.RequisitionHeaderId "
				+ "left join InventoryDefinitions inv on rd.ItemId = inv.Id left join SupplierMasters sm on rd.SupplierId = sm.Id "
				+ "left join Suppliers  sup on sm.SupplierRefId = sup.Id "
				+ "where sm.SupplierRefNo =:maaaNumber  and rh.OrderTypeId=:orderTypeId) t";
		Query q = getSession().createSQLQuery(sqlStr).addScalar("requisitionId", new LongType())
				.addScalar("lineNo", new StringType()).addScalar("requestingUnit", new StringType())
				.addScalar("orderNo", new StringType()).addScalar("orderType", new StringType())
				.addScalar("requisitionDetailsId", new LongType()).addScalar("orderTypeId", new LongType())
				.addScalar("commodityNo", new StringType()).addScalar("commodityShortDescription", new StringType())
				.addScalar("supplier", new StringType()).addScalar("supplierId", new LongType())
				.addScalar("amountUnitCost", new DoubleType()).addScalar("amountExtendedPrice", new DoubleType())
				.addScalar("transactionQuantity", new LongType()).addScalar("unitofMeasureId", new LongType())
				.addScalar("unitOfMeasure", new StringType()).addScalar("dateOrderTransaction", new TimestampType())
				.addScalar("currencyCode", new StringType());
		q.setString("maaaNumber", maaaNumber);
		q.setInteger("orderTypeId", orderTypeId);
		List<RequisitionDetailBean> rdList = q
				.setResultTransformer(Transformers.aliasToBean(RequisitionDetailBean.class)).list();
		return rdList;
	}

	@Override
	@Transactional
	public List<RequisitionDetailBean> loadQuotationDetails(String maaaNumber, Integer orderTypeId) throws Throwable {
		String sqlStr = "select t.requisitionId as requisitionId, t.\"lineNo\" as \"lineNo\","
				+ "IIF(t.requestingUnit is null, 'Not Set', t.requestingUnit) as requestingUnit,"
				+ "t.orderNo as orderNo," + "IIF(t.orderType is null, 'Not Set', t.orderType) as orderType,"
				+ "t.requisitionDetailsId as requisitionDetailsId, t.orderTypeId as orderTypeId,"
				+ "IIF(t.commodityNo is null, 'Not Set', t.commodityNo) as commodityNo,"
				+ "IIF(t.commodityShortDescription is null, 'Not Set', t.commodityShortDescription) as commodityShortDescription,"
				+ "IIF(t.supplier is null, 'Not Set', t.supplier) as supplier, t.supplierId as supplierId,"
				+ "t.amountUnitCost as amountUnitCost, t.amountExtendedPrice as amountExtendedPrice,"
				+ "IIF(t.transactionQuantity is null, 0, t.transactionQuantity) as transactionQuantity,"
				+ "t.unitofMeasureId as unitofMeasureId,"
				+ "IIF(t.unitOfMeasure is null, 'Not Set', t.unitOfMeasure) as unitOfMeasure,"
				+ "t.dateOrderTransaction as dateOrderTransaction, "
				+ "IIF(t.currencyCode is null, 'Not Set', t.currencyCode) as currencyCode "
				+ "from (select rh.Id as requisitionId, rd.\"LineNo\" as \"lineNo\", "
				+ "((select Description from UserCodes where id = rh.RequestingUnitId)) as requestingUnit,"
				+ "rh.OrderNo as orderNo, "
				+ "((select Description from UserCodes where id = rh.OrderTypeId)) as orderType,"
				+ "rd.Id as requisitionDetailsId," + "rh.OrderTypeId as orderTypeId,"
				+ "inv.ItemNo as commodityNo, inv.ShortDescription as commodityShortDescription,"
				+ "sup.LegalName as supplier, sm.id as supplierId,"
				+ "rd.AmountUnitCost as amountUnitCost, rd.AmountExtendedPrice as amountExtendedPrice,"
				+ "rd.UnitsOrderTransactionQuantity as transactionQuantity," + "rd.UnitofMeasureId as unitofMeasureId,"
				+ "((select Description from UserCodes where id = rd.UnitofMeasureId)) as unitOfMeasure,"
				+ "GETDATE() as dateOrderTransaction," + "rd.CurrencyCodeFrom as currencyCode " + "from "
				+ "RequisitionHeaders rh left join RequisitionDetails rd on rh.Id=rd.RequisitionHeaderId "
				+ "left join InventoryDefinitions inv on rd.ItemId = inv.Id left join SupplierMasters sm on rd.SupplierId = sm.Id "
				+ "left join SupplierQuotations sq on sm.id=sq. SupplierMasterId left join Suppliers  sup on sm.SupplierRefId = sup.Id "
				+ "where sq.RequisitionDetailsId=rd.Id and sm.SupplierRefNo =:maaaNumber  and rh.OrderTypeId=:orderTypeId) t";
		Query q = getSession().createSQLQuery(sqlStr).addScalar("requisitionId", new LongType())
				.addScalar("lineNo", new StringType()).addScalar("requestingUnit", new StringType())
				.addScalar("orderNo", new StringType()).addScalar("orderType", new StringType())
				.addScalar("requisitionDetailsId", new LongType()).addScalar("orderTypeId", new LongType())
				.addScalar("commodityNo", new StringType()).addScalar("commodityShortDescription", new StringType())
				.addScalar("supplier", new StringType()).addScalar("supplierId", new LongType())
				.addScalar("amountUnitCost", new DoubleType()).addScalar("amountExtendedPrice", new DoubleType())
				.addScalar("transactionQuantity", new LongType()).addScalar("unitofMeasureId", new LongType())
				.addScalar("unitOfMeasure", new StringType()).addScalar("dateOrderTransaction", new TimestampType())
				.addScalar("currencyCode", new StringType());
		q.setString("maaaNumber", maaaNumber);
		q.setInteger("orderTypeId", orderTypeId);
		List<RequisitionDetailBean> rdList = q
				.setResultTransformer(Transformers.aliasToBean(RequisitionDetailBean.class)).list();
		return rdList;
	}

	@Override
	@Transactional
	public List<BidSpecificationsBean> loadBidSpecifications(String maaaNumber) throws Throwable {
		String sqlStr = "select t.id as tenderId, t.tenderDescription as tenderDescription, "
				+ " t.tenderClosingDate as tenderClosingDate, t.bidClosingDate as bidClosingDate, "
				+ "t.estimatedBudget as estimatedBudget, tbp.id as tenderBidInvitationsId " + "from "
				+ "Tenders t left join TenderBidPackages tbp on t.Id = tbp.TenderId "
				+ "left join TenderBidInvitations tbi on t.Id = tbi.TenderId "
				+ "left join SupplierMasters sm on tbi.SupplierMasterId=sm.id " + "where "
				+ "sm.SupplierRefNo=:maaaNumber";

		Query query = getSession().createSQLQuery(sqlStr).addScalar("tenderId", new LongType())
				.addScalar("tenderDescription", new StringType()).addScalar("tenderClosingDate", new TimestampType())
				.addScalar("bidClosingDate", new TimestampType()).addScalar("estimatedBudget", new BigIntegerType())
				.addScalar("tenderBidInvitationsId", new LongType());
		query.setString("maaaNumber", maaaNumber);
		List<BidSpecificationsBean> bidSpecifications = query
				.setResultTransformer(Transformers.aliasToBean(BidSpecificationsBean.class)).list();
		return bidSpecifications;
	}

	@Override
	@Transactional
	public Supplier getSupplierDetails(String maaaNumber) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("supplierNumber", maaaNumber));
		List<Supplier> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

	@Override
	@Transactional
	public void importSupplierAsync(String maaaNumber) throws Throwable {

		Query query = getSession().createSQLQuery("{CALL pr_SCRIPT_ImportSupplier(:maaaNumber)}");
		query.setParameter("maaaNumber", maaaNumber);
		query.executeUpdate();

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goBbbeeVerificationRegulatorsMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.verificationRegulatorId as id, " + "   c.name as name " + "from "
						+ "   BbbeeVerificationRegulator c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goBusinessStatusMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.businessStatusId as id, " + "   c.name as name " + "from "
						+ "   BusinessStatus c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goCountriesMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.countryId as id, " + "   c.name as name " + "from "
						+ "   Country c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goGovernmentTypesMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.governmentTypeId as id, " + "   c.name as name " + "from "
						+ "   GovernmentType c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goIdTypesMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.idTypeId as id, " + "   c.name as name " + "from "
						+ "   IdType c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goSupplierStatesMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.supplierStateId as id, " + "   c.name as name " + "from "
						+ "   SupplierState c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goSupplierSubClassificationsMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.supplierSubClassificationId as id, " + "   c.name as name " + "from "
						+ "   SupplierSubClassification c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goSupplierClassificationsMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.supplierClassificationId as id, " + "   c.name as name " + "from "
						+ "   SupplierClassification c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goBbbeeTotalAnnualTurnoversMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.totalAnnualTurnoverId as id, " + "   c.name as name " + "from "
						+ "   BbbeeTotalAnnualTurnover c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goBbbeeCertificateTypesMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.certificateTypeId as id, " + "   c.name as name " + "from "
						+ "   BbbeeCertificateType c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goBbbeeIrbaRegisteredAuditorsMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.irbaRegisteredAuditorId as id, " + "   c.auditFirm as name " + "from "
						+ "   BbbeeIrbaRegisteredAuditor c order by c.auditFirm asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goSanasBbbeeVerificationAgenciesMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.sanasBbbeeVerificationAgencyId as id, " + "   c.name as name " + "from "
						+ "   SanasBbbeeVerificationAgency c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goBbbeeSectorChartersMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.sectorCharterId as id, " + "   c.name as name " + "from "
						+ "   BbbeeSectorCharter c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goBbbeeStatusLevelOfContributorsMap() throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.BBBEEStatusLevelOfContributorId as id, " + "   c.name as name " + "from "
						+ "   BbbeeStatusLevelOfContributor c order by c.name asc ", Tuple.class)
				.getResultList().stream().collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("name")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> goUserCodeKeyMap(String codeKey) throws Throwable {

		Map<Integer, String> orginMap = getSession()
				.createQuery("select " + "   c.id as id, " + "   c.description as description " + "from "
						+ "   UserCode c where c.codeKey=:codeKey order by c.description asc ", Tuple.class)
				.setString("codeKey", codeKey).getResultList().stream()
				.collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
						tuple -> ((String) tuple.get("description")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Long, String> getSuppliersMap() throws Throwable {

		Map<Long, String> orginMap = getSession()
				.createQuery("select " + "   c.id as id, " + "   c.tradingName as tradingName " + "from "
						+ "   Supplier c where c.isActive=:IsActive order by c.tradingName asc ", Tuple.class)
				.setBoolean("IsActive", true).getResultList().stream()
				.collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).longValue(),
						tuple -> ((String) tuple.get("tradingName")).toString()));

		return orginMap;

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Long, String> getActiveSuppliersMap() throws Throwable {

		String qryStr = "select sm.id as id, s.legalName as legalName from "
				+ " Supplier s inner join SupplierMaster sm on sm.supplierRefId=s.id where s.legalName is not null "
				+ " and sm.isActive = :isActive and sm.userCode8.id=:statusId order by s.legalName asc ";

		Query<Tuple> query = getSession().createQuery(qryStr, Tuple.class);

		query.setBoolean("isActive", true);
		query.setLong("statusId", Long.valueOf(UserCodeIdKeys.SupplierStatusActive));

		Map<Long, String> orginMap = query.getResultList().stream()
				.collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).longValue(),
						tuple -> ((String) tuple.get("legalName")).toString().trim()));

		return orginMap;

	}

	@Override
	public List<SuppliersBean> getSupplierMastersSummary(Pagination pagination, SearchSortContainer searchSortObj)
			throws Throwable {
		String queryStr = "select s.id as supplierId, s.SupplierNumber as supplierNumber,"
				+ "sm.SupplierXRef1 as supplierXref1, sm.SupplierRefNo as supplierRefNo,"
				+ "s.LegalName as legalName, s.SaCompanyNumber as saCompanyNumber,"
				+ "uc.Description as status  from SupplierMasters sm, Suppliers s, UserCodes uc where s.id=sm.SupplierRefId "
				+ "and uc.id=sm.StatusId ";
		if (searchSortObj != null) {

			if (searchSortObj.getStatusId() != null) {
				queryStr = queryStr + " and sm.StatusId = " + searchSortObj.getStatusId() + " ";
				if(searchSortObj.getStatusId() == UserCodeIdKeys.SupplierStatusPending) {
					queryStr = queryStr + " and sm.IsApplicationSubmitted = 1 ";
				}
			}

			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
				queryStr = queryStr + " and (s.id like '%" + searchSortObj.getSearchValue()
						+ "%' or sm.SupplierXRef1 like '%" + searchSortObj.getSearchValue()
						+ "%' or sm.SupplierRefNo like '%" + searchSortObj.getSearchValue()
						+ "%' or s.LegalName like '%" + searchSortObj.getSearchValue()
						+ "%' or s.SaCompanyNumber like '%" + searchSortObj.getSearchValue()
						+ "%' or uc.Description like '%" + searchSortObj.getSearchValue() + "%')";
			}
			if (StringHelper.isNotEmpty(searchSortObj.getSidx()) && StringHelper.isNotEmpty(searchSortObj.getSord())) {
				switch (searchSortObj.getSidx()) {
				case "supplierId": {
					queryStr = queryStr + " order by s.id " + searchSortObj.getSord();
					break;
				}
				case "supplierXref1": {
					queryStr = queryStr + " order by sm.SupplierXRef1 " + searchSortObj.getSord();
					break;
				}
				case "supplierRefNo": {
					queryStr = queryStr + " order by sm.SupplierRefNo " + searchSortObj.getSord();
					break;
				}
				case "legalName": {
					queryStr = queryStr + " order by s.LegalName " + searchSortObj.getSord();
					break;
				}
				case "saCompanyNumber": {
					queryStr = queryStr + " order by s.SaCompanyNumber " + searchSortObj.getSord();
					break;
				}
				case "status": {
					queryStr = queryStr + " order by uc.Description " + searchSortObj.getSord();
					break;
				}
				default: {
					queryStr = queryStr + " order by s.id desc ";
				}
				}

			} else {
				queryStr = queryStr + " order by s.id desc ";
			}
		} else {
			queryStr = queryStr + " order by s.id desc ";
		}
		Query query = getSession().createSQLQuery(queryStr).addScalar("supplierId", new LongType())
				.addScalar("supplierXref1", new StringType()).addScalar("supplierRefNo", new StringType())
				.addScalar("legalName", new StringType()).addScalar("status", new StringType())
				.addScalar("saCompanyNumber", new StringType()).addScalar("supplierNumber", new StringType());
		if (pagination != null) {
			if (pagination.getOffset() > 0) {
				query.setFirstResult(pagination.getOffset());
			}
			if (pagination.getSize() > 0) {
				query.setMaxResults(pagination.getSize());
			}
		}
		List<SuppliersBean> smList = query.setResultTransformer(Transformers.aliasToBean(SuppliersBean.class)).list();
		return smList;

	}

	@Override
	public int getSupplierMastersCount(SearchSortContainer searchSortObj) throws Throwable {
		int count = 0;
		String queryStr = "select count(*) from SupplierMasters sm, Suppliers s, UserCodes uc where s.id=sm.SupplierRefId "
				+ "and sm.StatusId=uc.id ";
		if (searchSortObj != null) {

			if (searchSortObj.getStatusId() != null) {
				queryStr = queryStr + " and uc.Id = " + searchSortObj.getStatusId();
				if(searchSortObj.getStatusId() == UserCodeIdKeys.SupplierStatusPending) {
					queryStr = queryStr + " and sm.IsApplicationSubmitted = 1 ";
				}
			}

			if (StringHelper.isNotEmpty(searchSortObj.getSearchValue())) {
				queryStr = queryStr + " and (s.id like '%" + searchSortObj.getSearchValue()
						+ "%' or sm.SupplierXRef1 like '%" + searchSortObj.getSearchValue()
						+ "%' or sm.SupplierRefNo like '%" + searchSortObj.getSearchValue()
						+ "%' or s.LegalName like '%" + searchSortObj.getSearchValue()
						+ "%' or s.SaCompanyNumber like '%" + searchSortObj.getSearchValue()
						+ "%' or uc.Description like '%" + searchSortObj.getSearchValue() + "%')";
			}
		}
		Query query = getSession().createSQLQuery(queryStr);
		Integer obj = (Integer) query.uniqueResult();
		if (obj != null) {
			count = obj.intValue();
		}
		return count;

	}

}
