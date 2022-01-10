package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Tender;
import com.scm.dao.inventory.TendersDao;
import com.scm.modal.TendersBean;

@Repository
public class HibernateTendersDao extends HibernateGenericDao<Tender, Integer> implements TendersDao {

	public List<TendersBean> getTendersDetails() throws Throwable {
		Query qry = getSession().createSQLQuery("select t.id as id, t.tenderDescription as tenderDescription, "
				+ "CONVERT(VARCHAR,CONVERT(DATE,t.tenderClosingDate)) as tenderClosingDate, "
				+ "CONVERT(VARCHAR,CONVERT(DATE,t.bidClosingDate)) as bidClosingDate, t.tenderType as tenderType,"
				+ " t.tenderStatus as tenderStatus "
				+ "from Tenders t where CONVERT(varchar(12),CreatedDateTime, 103) = CONVERT(varchar(12),GETDATE(), 103)")
				.addScalar("id", new LongType()).addScalar("tenderDescription", new StringType())
				.addScalar("tenderClosingDate", new StringType()).addScalar("bidClosingDate", new StringType())
				.addScalar("tenderType", new StringType()).addScalar("tenderStatus", new StringType());
		List<TendersBean> smList = qry.setResultTransformer(Transformers.aliasToBean(TendersBean.class)).list();
		return smList;

	}

}
