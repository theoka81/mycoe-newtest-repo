package com.scm.dao.inventory;

import java.util.Map;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.StandardAgreement;

public interface StandardAgreementDao extends GenericDao<StandardAgreement, Long> {

	public Long getStandardAgreementCount() throws Throwable;
	
	public Map<Integer, String> getStandardAgreementDropDown() throws Throwable;
	

}
