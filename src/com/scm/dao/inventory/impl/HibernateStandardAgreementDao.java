package com.scm.dao.inventory.impl;

import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.Tuple;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.StandardAgreement;
import com.scm.dao.inventory.StandardAgreementDao;

@Repository
public class HibernateStandardAgreementDao extends HibernateGenericDao<StandardAgreement, Long>
		implements StandardAgreementDao {

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Long getStandardAgreementCount() throws Throwable {
		long count = 0l;
		Query qry = getSession().createQuery("select count(*) from StandardAgreement");
		Long obj = (Long) qry.uniqueResult();
		if (obj != null) {
			count = obj.longValue();
		}
		return count;
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public Map<Integer, String> getStandardAgreementDropDown() throws Throwable {
		

			Map<Integer, String> orginMap = getSession()
					.createQuery("select  c.id as id, c.templateDescription as description from "
							+ " StandardAgreement c order by c.templateDescription asc ", Tuple.class)
					.getResultList().stream()
					.collect(Collectors.toMap(tuple -> ((Number) tuple.get("id")).intValue(),
							tuple -> ((String) tuple.get("description")).toString()));

			return orginMap;

		}
	

}
