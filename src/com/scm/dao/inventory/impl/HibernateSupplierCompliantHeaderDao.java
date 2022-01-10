package com.scm.dao.inventory.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.SupplierCompliantHeader;
import com.scm.dao.inventory.SupplierCompliantHeaderDao;
import com.scm.keys.UserCodeIdKeys;

@Repository
public class HibernateSupplierCompliantHeaderDao extends HibernateGenericDao<SupplierCompliantHeader, Long>
implements SupplierCompliantHeaderDao {

	@Override
	@Transactional
	public List<SupplierCompliantHeader> getSCHList(String maaaNumber) throws Throwable {
		
		Query qry = getSession().createQuery("select sch from SupplierCompliantHeader sch inner join sch.supplierMaster sm, Supplier s "
				+ "where s.supplierNumber=:maaaNumber and sm.supplierRefId=s.id");
		
		qry.setString("maaaNumber", maaaNumber);
		
		return qry.list();
	}

	@Override
	public Integer getNewCount() throws Throwable {
		Query qry = getSession().createSQLQuery(
				"select count(*) from SupplierCompliantHeaders sch, UserCodes uc where sch.StatusId = uc.id and uc.id=:statusId");
		qry.setLong("statusId", UserCodeIdKeys.SupplierCompliant_NewStatus);
		Integer obj = (Integer) qry.uniqueResult();
		return obj;
	}

	@Override
	public Integer getPendingCount() throws Throwable {
		Query qry = getSession().createSQLQuery(
				"select count(*) from SupplierCompliantHeaders sch, UserCodes uc where sch.StatusId = uc.id and uc.id not in (:statusId)");
		List<Integer> statusIdList = new ArrayList<Integer>();
		statusIdList.add(UserCodeIdKeys.SupplierCompliant_NewStatus);
		statusIdList.add(UserCodeIdKeys.SupplierCompliant_EscalatedStatus);
		statusIdList.add(UserCodeIdKeys.SupplierComplaintHeaderStatus_Close);
		qry.setParameterList("statusId", statusIdList);
		Integer obj = (Integer) qry.uniqueResult();
		return obj;
	}

	@Override
	public Integer getEscalatedCount() throws Throwable {
		Query qry = getSession().createSQLQuery(
				"select count(*) from SupplierCompliantHeaders sch, UserCodes uc where sch.StatusId = uc.id and uc.id=:statusId");
		qry.setLong("statusId", UserCodeIdKeys.SupplierCompliant_EscalatedStatus);
		Integer obj = (Integer) qry.uniqueResult();
		return obj;
	}

	@Override
	public Integer getClosedCount() throws Throwable {
		Query qry = getSession().createSQLQuery(
				"select count(*) from SupplierCompliantHeaders sch, UserCodes uc where sch.StatusId = uc.id and uc.id=:statusId");
		qry.setLong("statusId", UserCodeIdKeys.SupplierComplaintHeaderStatus_Close);
		Integer obj = (Integer) qry.uniqueResult();
		return obj;
	}

}
