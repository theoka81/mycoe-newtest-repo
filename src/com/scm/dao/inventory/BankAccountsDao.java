package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.BankAccount;

public interface BankAccountsDao  extends GenericDao<BankAccount, Long>{

	public List<BankAccount> getBankAccountsDetails(Long supplierId) throws Throwable;
	
}
