package com.scm.dao.inventory.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierEnquiryHeader;
import com.scm.dao.inventory.SupplierEnquiryHeaderDao;
import com.scm.keys.UserCodeIdKeys;

@Repository
public class HibernateSupplierEnquiryHeaderDao extends HibernateGenericDao<SupplierEnquiryHeader, Long>
implements SupplierEnquiryHeaderDao {

	@Override
	@Transactional
	public List<SupplierEnquiryHeader> getSEHList(String maaaNumber) throws Throwable {
		
		Query qry = getSession().createQuery("select sch from SupplierEnquiryHeader sch inner join sch.supplierMaster sm, Supplier s "
				+ "where s.supplierNumber=:maaaNumber and sm.supplierRefId=s.id");
		
		qry.setString("maaaNumber", maaaNumber);
		
		return qry.list();
	}
	
	@Override
	public Integer getNewCount() throws Throwable {
		Query qry = getSession().createSQLQuery(
				"select count(*) from SupplierEnquiryHeaders sch, UserCodes uc where sch.StatusId = uc.id and uc.id=:statusId");
		qry.setLong("statusId", UserCodeIdKeys.SupplierEnquiry_NewStatus);
		Integer obj = (Integer) qry.uniqueResult();
		return obj;
	}

	@Override
	public Integer getPendingCount() throws Throwable {
		Query qry = getSession().createSQLQuery(
				"select count(*) from SupplierEnquiryHeaders sch, UserCodes uc where sch.StatusId = uc.id and uc.id not in (:statusId)");
		List<Integer> statusIdList = new ArrayList<Integer>();
		statusIdList.add(UserCodeIdKeys.SupplierEnquiry_NewStatus);
		statusIdList.add(UserCodeIdKeys.SupplierEnquiry_EscalatedStatus);
		statusIdList.add(UserCodeIdKeys.SupplierEnquiryHeaderStatus_Close);
		qry.setParameterList("statusId", statusIdList);
		Integer obj = (Integer) qry.uniqueResult();
		return obj;
	}

	@Override
	public Integer getEscalatedCount() throws Throwable {
		Query qry = getSession().createSQLQuery(
				"select count(*) from SupplierEnquiryHeaders sch, UserCodes uc where sch.StatusId = uc.id and uc.id=:statusId");
		qry.setLong("statusId", UserCodeIdKeys.SupplierEnquiry_EscalatedStatus);
		Integer obj = (Integer) qry.uniqueResult();
		return obj;
	}

	@Override
	public Integer getClosedCount() throws Throwable {
		Query qry = getSession().createSQLQuery(
				"select count(*) from SupplierEnquiryHeaders sch, UserCodes uc where sch.StatusId = uc.id and uc.id=:statusId");
		qry.setLong("statusId", UserCodeIdKeys.SupplierEnquiryHeaderStatus_Close);
		Integer obj = (Integer) qry.uniqueResult();
		return obj;
	}


}
