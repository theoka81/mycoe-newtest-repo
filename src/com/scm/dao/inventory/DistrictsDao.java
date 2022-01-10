package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.District;

public interface DistrictsDao extends GenericDao<District, Integer>{

	public District getDistrictByCode(String code) throws Throwable;
}
