package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SupplierRotationTemplate;

public interface SupplierRotationTemplatesDao extends GenericDao<SupplierRotationTemplate, Long> {

	public Long getSupplierRotationTemplatesCount() throws Throwable;

}
