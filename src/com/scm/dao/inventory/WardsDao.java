package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Ward;

public interface WardsDao extends GenericDao<Ward, Integer>{

	public Ward getWardByCode(String code) throws Throwable;
}
