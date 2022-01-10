package com.scm.ws;

import com.scm.modal.SupplierViewModel;
import com.scm.ws.impl.data.SupplierDetailsFull;

public interface CsdApiService {
	public String authenticate() throws Throwable;
	
	public SupplierDetailsFull getSupplier(String token, String supplierNo) throws Throwable;
	
	public void mapSupplierDto(SupplierViewModel svm, SupplierDetailsFull supplierDetailsFull)  throws Throwable;
}
