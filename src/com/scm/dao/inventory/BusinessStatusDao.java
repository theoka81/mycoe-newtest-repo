package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.BusinessStatus;

public interface BusinessStatusDao extends GenericDao<BusinessStatus, Integer>{

	public BusinessStatus getBusinessStatusByCode(String code) throws Throwable;
}
