package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.BankVerificationStatus;

public interface BankVerificationStatusDao  extends GenericDao<BankVerificationStatus, Long>{

	public BankVerificationStatus getBankVerificationStatusDetails(String code) throws Throwable;
	
}
