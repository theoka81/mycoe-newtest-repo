package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.TransactionType;

public interface TransactionTypesDao  extends GenericDao<TransactionType, Long>{

	public TransactionType getTransactionTypesBy(Long transactionTypeId) throws Throwable;
}
