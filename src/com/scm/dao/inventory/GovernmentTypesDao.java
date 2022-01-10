package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.GovernmentType;

public interface GovernmentTypesDao extends GenericDao<GovernmentType, Integer>{

	public GovernmentType getGovernmentTypeByCode(String code) throws Throwable;
}
