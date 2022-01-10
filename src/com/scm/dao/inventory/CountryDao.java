package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Country;

public interface CountryDao extends GenericDao<Country, Integer>{

	public Country getCountryByCode(String code) throws Throwable;
}
