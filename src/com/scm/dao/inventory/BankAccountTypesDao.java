package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.BankAccountType;

public interface BankAccountTypesDao  extends GenericDao<BankAccountType, Long>{

	public BankAccountType getBankAccountTypesDetails(String code) throws Throwable;
	
}
