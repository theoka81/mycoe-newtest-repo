package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Bank;

public interface BanksDao  extends GenericDao<Bank, Long>{

	public Bank getBankDetails(String code) throws Throwable;
	
}
