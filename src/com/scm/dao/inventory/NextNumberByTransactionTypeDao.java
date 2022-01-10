package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.NextNumberByTransactionType;

public interface NextNumberByTransactionTypeDao extends GenericDao<NextNumberByTransactionType, Long> {

	public NextNumberByTransactionType getNextNumberByTransactionType(long transactionTypeId, String transactionType)
			throws Throwable;

}
