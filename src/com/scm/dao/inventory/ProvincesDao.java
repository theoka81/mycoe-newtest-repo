package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Province;

public interface ProvincesDao extends GenericDao<Province, Integer>{

	public Province getProvinceByCode(String code) throws Throwable;
}
