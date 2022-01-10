package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.City;

public interface CitiesDao extends GenericDao<City, Integer>{

	public City getCityByCode(String code) throws Throwable;
}
