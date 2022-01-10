package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Municipality;

public interface MunicipalitiesDao extends GenericDao<Municipality, Integer>{

	public Municipality getMunicipalityByCode(String code) throws Throwable;
}
