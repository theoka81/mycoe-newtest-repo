package com.scm.dao.inventory.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.common.impl.HibernateGenericDao;
import com.scm.dao.domain.ApprovalTemplate;
import com.scm.dao.inventory.ApprovalTemplatesDao;

@Repository
public class HibernateApprovalTemplatesDao extends HibernateGenericDao<ApprovalTemplate, Long>
		implements ApprovalTemplatesDao {

	@Override
	@Transactional
	public ApprovalTemplate getApprovalTemplatesBy(Long approvalTemplateTypeId) throws Throwable {
		Criteria crit = getSession().createCriteria(getPersistentClass());
		crit.add(Restrictions.eq("userCode1.id", approvalTemplateTypeId));
		crit.addOrder(Order.desc("id"));
		List<ApprovalTemplate> result = crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		if (result.size() >= 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

}
