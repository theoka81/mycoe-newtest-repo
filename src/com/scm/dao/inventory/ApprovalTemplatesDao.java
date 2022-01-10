package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.ApprovalTemplate;

public interface ApprovalTemplatesDao  extends GenericDao<ApprovalTemplate, Long>{

	public ApprovalTemplate getApprovalTemplatesBy(Long approvalTemplateTypeId) throws Throwable;
}
