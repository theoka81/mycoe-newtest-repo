package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.ContactTypeList;

public interface ContactTypeListDao  extends GenericDao<ContactTypeList, Long>{

	public List<ContactTypeList> getContactTypeListDetails(Long supplierId) throws Throwable;
	
}
