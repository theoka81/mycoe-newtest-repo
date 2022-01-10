package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Contact;

public interface ContactsDao  extends GenericDao<Contact, Long>{

	public List<Contact> getContactsDetails(Long supplierId) throws Throwable;
	
}
