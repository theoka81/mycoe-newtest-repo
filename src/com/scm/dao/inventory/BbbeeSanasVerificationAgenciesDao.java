package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.BbbeeSanasVerificationAgency;

public interface BbbeeSanasVerificationAgenciesDao extends GenericDao<BbbeeSanasVerificationAgency, Integer>{

	public BbbeeSanasVerificationAgency getBbbeeSanasVerificationAgencyByCode(String code) throws Throwable;
}
