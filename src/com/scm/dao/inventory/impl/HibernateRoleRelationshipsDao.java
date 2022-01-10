package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.RoleRelationship;
import com.scm.dao.inventory.RoleRelationshipsDao;

@Repository
public class HibernateRoleRelationshipsDao extends HibernateGenericDao<RoleRelationship, Long>
		implements RoleRelationshipsDao {

	@Override
	@Transactional
	public List<RoleRelationship> getRoleRelationshipsBy(Long userGrpId, String roleType)
			throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		if(roleType.equalsIgnoreCase("GroupId"))
			crit.add(Restrictions.eq("userCode3.id", userGrpId));
		else if(roleType.equalsIgnoreCase("TeamId"))
			crit.add(Restrictions.eq("userCode7.id", userGrpId));
		else if(roleType.equalsIgnoreCase("UserId"))
			crit.add(Restrictions.eq("systemUser3.id", userGrpId));
		List<RoleRelationship> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}

	}
	
	@Override
	@Transactional
	public List<RoleRelationship> getRoleRelationshipDetails(Long teamId) throws Throwable {

		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("userCode7.id", teamId));
		List<RoleRelationship> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result;
		} else {
			return null;
		}
	
	}

}
