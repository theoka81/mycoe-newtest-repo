package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.IdType;

public interface IdTypesDao extends GenericDao<IdType, Integer>{

	public IdType getIdTypeByCode(String code) throws Throwable;
}
