package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Address;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;

public interface AddressDao  extends GenericDao<Address, Long>{

	public List<Address> getAddressDetails(Long supplierId) throws Throwable;
	
	public int getSupplierAddressCount(SearchSortContainer searchSortContainer) throws Throwable;

	public List<Address> getSupplierAddressSummary(Pagination pagination,
			SearchSortContainer searchSortContainer)  throws Throwable;
}
