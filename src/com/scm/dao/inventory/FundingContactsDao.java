package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.FundingContact;

public interface FundingContactsDao  extends GenericDao<FundingContact, Long>{

	public List<FundingContact> getFundingContactsDetails(Long supplierId) throws Throwable;
	
}
