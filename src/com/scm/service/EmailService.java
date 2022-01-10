package com.scm.service;

public interface EmailService {
	
	public void emailSupplierOnRegistration(String email, String maaaNumber, String mobileNumber) throws Throwable;
	
	public void emailTeam(Long teamId, Long supplierReferenceId) throws Throwable;
	
	public  void emailSupplierOnSubmit(Long supplierReferenceId) throws Throwable;

}
