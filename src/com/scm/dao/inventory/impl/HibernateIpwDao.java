package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.hibernate.type.BigIntegerType;
import org.hibernate.type.BooleanType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.hibernate.type.TimestampType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.IPW;
import com.scm.dao.inventory.IpwDao;
import com.scm.keys.UserCodeIdKeys;
import com.scm.modal.IPWBean;

@Repository
public class HibernateIpwDao extends HibernateGenericDao<IPW, Long> implements IpwDao {

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public List<IPWBean> getIPWList(String maaaNumber) throws Throwable {

		String sqlStr = "select ipw.id as id, ipw.contractNo as contractNo, ipw.contractId as contractId, "
				+ "ipw.IpwReference as ipwReference, ipw.CreatedDateTime as createdDate, "
				+ "ipw.Comments as comments, ipw.StartDate as startDate, ipw.EndDate as endDate,"
				+ "ipw.DateIssuedToSupplier as dateIssuedToSupplier, ipw.StatusId as statusId,"
				+ "ipw.SupplierReferenceNo as supplierReferenceNo, ipw.LegalName as legalName,"
				+ "ipw.IsActive as activeFlag, ipw.Amount amount" + " from " + "SystemUsers u,"
				+ "Suppliers s, SupplierMasters sm, IPWs ipw where " + " s.SupplierNumber= u.MaaaNumber and "
				+ " sm.SupplierRefId=s.id and" + " ipw.SupplierId=sm.id and" + " ipw.IsActive=1 and ipw.StatusId=:statusId "
				+ " and u.maaanumber=:maaaNumber";
		Query q = getSession().createSQLQuery(sqlStr).addScalar("id", new LongType())
				.addScalar("contractNo", new StringType()).addScalar("contractId", new LongType())
				.addScalar("ipwReference", new StringType()).addScalar("createdDate", new TimestampType())
				.addScalar("comments", new StringType()).addScalar("startDate", new TimestampType())
				.addScalar("endDate", new TimestampType()).addScalar("dateIssuedToSupplier", new TimestampType())
				.addScalar("statusId", new LongType()).addScalar("supplierReferenceNo", new StringType())
				.addScalar("legalName", new StringType()).addScalar("activeFlag", new BooleanType())
				.addScalar("amount", new BigIntegerType());
		q.setString("maaaNumber", maaaNumber);
		q.setLong("statusId", UserCodeIdKeys.ISAStatusActive);
		List<IPWBean> ipwList = q.setResultTransformer(Transformers.aliasToBean(IPWBean.class)).list();
		return ipwList;
	}
	
	@Override
	@Transactional
	public Long getIPWsCount() throws Throwable {
		long count = 0l;
		Query qry = getSession().createQuery("select count(*) from IPW");
		Long obj = (Long) qry.uniqueResult();
		if (obj != null) {
			count = obj.longValue();
		}
		return count;
	}
	
	@Override
	public IPW getIPWByContract(Long contractId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("contractId", contractId));

		List<IPW> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
