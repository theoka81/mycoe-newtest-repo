package com.scm.dao.inventory.impl;

import java.math.BigDecimal;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.RequisitionDetail;
import com.scm.dao.inventory.RequisitionDetailsDao;

@Repository
public class HibernateRequisitionDetailsDao extends HibernateGenericDao<RequisitionDetail, Long>
		implements RequisitionDetailsDao {

	@Override
	@Transactional
	public Long getRequisitionDetailsBy(Long transactionId) throws Throwable {

		Query q = getSession().createSQLQuery(
				"select sum(AmountExtendedPrice) from RequisitionDetails where RequisitionHeaderId=:transactionId ");
		q.setLong("transactionId", transactionId);

		BigDecimal d = (BigDecimal) q.uniqueResult();
		return (d == null ? 0l : d.longValue());
	}

}
