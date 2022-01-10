package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SanasBbbeeVerificationAgency;

public interface SanasBbbeeVerificationAgenciesDao extends GenericDao<SanasBbbeeVerificationAgency, Integer>{

	public SanasBbbeeVerificationAgency getSanasBbbeeVerificationAgencyByCode(String code) throws Throwable;
}
