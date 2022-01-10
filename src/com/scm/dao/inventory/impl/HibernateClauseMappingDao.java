package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.Clause;
import com.scm.dao.domain.ClauseMapping;
import com.scm.dao.inventory.ClauseMappingDao;

@Repository
public class HibernateClauseMappingDao extends HibernateGenericDao<ClauseMapping, Integer> implements ClauseMappingDao {

	@Override
	@Transactional
	public List<ClauseMapping> getClauseMappingDetails(Long referenceDetailId, Long referenceId, Long referenceTypeId)
			throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("referenceDetailsId", referenceDetailId));
		crit.add(Restrictions.eq("referenceId", referenceId));
		crit.add(Restrictions.eq("userCode.id", referenceTypeId));
		crit.add(Restrictions.eq("isActive", true));

		List<ClauseMapping> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	}

	@Override
	@Transactional
	public List<Clause> getClausesDetails(Long referenceDetailsId, Long referenceId, Long referenceTypeId)
			throws Throwable {
		Query qry = getSession()
				.createQuery("select c from Clause c where c.id not in (select cm.claus.id from  ClauseMapping cm where"
						+ " cm.referenceDetailsId = :referenceDetailsId and cm.referenceId = :referenceId and cm.userCode.id = :referenceTypeId and cm.isActive = :isActive ) ");

		qry.setLong("referenceDetailsId", referenceDetailsId);
		qry.setLong("referenceId", referenceId);
		qry.setLong("referenceTypeId", referenceTypeId);
		qry.setBoolean("isActive", true);
		
		return qry.list();
	}

}
