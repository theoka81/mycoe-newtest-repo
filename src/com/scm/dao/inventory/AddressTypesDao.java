package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.AddressType;

public interface AddressTypesDao extends GenericDao<AddressType, Integer>{

	public AddressType getAddressTypeByCode(String code) throws Throwable;
}
