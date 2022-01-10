package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Suburb;

public interface SuburbsDao extends GenericDao<Suburb, Integer>{

	public Suburb getSuburbByCode(String code) throws Throwable;
}
