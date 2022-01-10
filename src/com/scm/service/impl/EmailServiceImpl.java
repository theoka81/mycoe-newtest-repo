package com.scm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.internal.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.domain.RoleRelationship;
import com.scm.dao.domain.SupplierMaster;
import com.scm.dao.domain.SystemUser;
import com.scm.service.EmailService;
import com.scm.service.common.BaseUIservice;

@Service
public class EmailServiceImpl extends BaseUIservice implements EmailService {

	@Autowired
	private CesarApiHelper cesarApiHelper;

	@Override
	@Transactional(value = "cesarTransactionManager", propagation = Propagation.REQUIRES_NEW)
	public void emailSupplierOnRegistration(String email, String maaaNumber, String mobileNumber) throws Throwable {
		try {
			// SystemUser systemUser =
			// daoManager.getUserDao().getUserDetailsByUserName(email, null);
			String emailSubject = "COE/SCM";
			String body = "Your account has been successfully registered with supplier number (" + maaaNumber
					+ "), please view your details and upload the necessary documentation.";
			String templateBody = templateBuilder(body);
			if (StringHelper.isNotEmpty(email)) {
				cesarApiHelper.sendMail(email, emailSubject, templateBody);
			}
			if (StringHelper.isNotEmpty(mobileNumber)) {
				cesarApiHelper.sendSms(mobileNumber, body);
			}
		} catch (Throwable th) {
			throw th;
		}
	}

	@Override
	@Transactional("transactionManager")
	public void emailTeam(Long teamId, Long supplierReferenceId) throws Throwable {
		String emailAddress = "";
		String body = "";
		String mobileNumber = "";
		List<String> emailList = new ArrayList<String>();
		List<String> mobileNumberList = new ArrayList<String>();

		SupplierMaster supplierMaster = daoManager.getSupplierMasterDao().getSupplierMasterDetails(supplierReferenceId);
		List<RoleRelationship> teamIds = daoManager.getRoleRelationshipsDao().getRoleRelationshipDetails(teamId);
		if (teamIds != null && teamIds.size() > 0) {
			body = "Please note that supplier (" + supplierMaster.getSupplierRefNo()
			+ ") has been sent to COE for assessment and the status of the supplier is currently pending.";
			for (RoleRelationship team : teamIds) {
				if (team.getSystemUser3() != null) {
					emailAddress = team.getSystemUser3().getEmailAddress();
					mobileNumber = team.getSystemUser3().getMobileNumber();
					
					if (emailAddress != null && !emailAddress.equals("")) {
						emailList.add(emailAddress);
					}
					if (StringHelper.isNotEmpty(mobileNumber)) {
						mobileNumberList.add(mobileNumber);
					}
				}
			}
		}
		emailAnsSendSMS(emailList, mobileNumberList, body);
	}
	
	@Transactional(value = "cesarTransactionManager", propagation = Propagation.REQUIRES_NEW)
	private void emailAnsSendSMS(List<String> emailList, List<String> mobileNumberList, String body) throws Throwable {
		String emailSubject = "";
		String templateBody = "";
		try {
			for(String email: emailList) {
				emailSubject = "COE/SCM";
				templateBody = templateBuilder(body);
				cesarApiHelper.sendMail(email, emailSubject, templateBody);
			}
			for(String mobileNumber: mobileNumberList) {
				emailSubject = "COE/SCM";
				cesarApiHelper.sendSms(mobileNumber, body);
			}
		} catch(Throwable th) {
			throw th;
		}
	}
	

	@Override
	@Transactional("transactionManager")
	public void emailSupplierOnSubmit(Long supplierReferenceId) throws Throwable {
		String body = "";
		List<String> emailList = new ArrayList<String>();
		List<String> mobileNumberList = new ArrayList<String>();

		SupplierMaster supplierMaster = daoManager.getSupplierMasterDao().getSupplierMasterDetails(supplierReferenceId);
		if (supplierMaster != null) {
			SystemUser getSupplier = daoManager.getUserDao().getUserDetailsBy(supplierMaster.getSupplierRefNo());
			body = "Your application with supplier number (" + supplierMaster.getSupplierRefNo()
					+ ") has been sent to COE for assessment and your status is currently pending.";
			if (getSupplier != null) {
				if (StringHelper.isNotEmpty(getSupplier.getEmailAddress())) {
					emailList.add(getSupplier.getEmailAddress());
				}
				if (StringHelper.isNotEmpty(getSupplier.getMobileNumber())) {
					mobileNumberList.add(getSupplier.getMobileNumber());
				}
			}
		}
		emailAnsSendSMS(emailList, mobileNumberList, body);
	}
	
	

	private String templateBuilder(String message) {
		StringBuilder sb = new StringBuilder();

		sb.append("<!DOCTYPE html>");

		sb.append("<html>");
		sb.append("<head></head>");
		sb.append("<body>");
		sb.append("<table>");
		sb.append("<p style='text - align: center; align: center; '>");
		sb.append(
				"<table cellpadding='0' style='width: 90 %; border: none; background - color: #fff;margin-left: auto;margin-right: auto;padding: 5%;border-spacing: 0px;'>");
		sb.append("<tr>");
		sb.append("<td ></td >");
		sb.append("</tr >");
		sb.append("<tr>");
		sb.append("<td>");
		sb.append(
				"<p style = 'position: relative;font-family: 'Helvetica Neue',Helvetica,Arial,sans-serif;font-size: 1.5em;color: #151211;border-left: 3px solid #151211;padding-left: 20px;margin: 0; padding: 20px;'> Dear Sir / Madam </p>");
		sb.append("</td >");
		sb.append("</tr>");

		sb.append("<tr>");
		sb.append("<td>");

		sb.append(
				"<p style = 'position: relative;font-family: 'Helvetica Neue',Helvetica,Arial,sans-serif;color: #151211;padding-bottom: 20px;padding-top: 20px;border-left: 3px solid #151211;padding-left: 20px;margin: 0;' >");
		sb.append(message);
		sb.append("</p>");
		sb.append("</td>");
		sb.append("</tr>");

		sb.append("<tr>");
		sb.append("<td>");
		sb.append(
				"<p style = 'position: relative;font-family: 'Helvetica Neue',Helvetica,Arial,sans-serif;color: #151211;font-size: 1.3em;border-left: 3px solid #151211;padding: 20px;margin: 0;'> Yours sincerely,<br> COE / SCM </p>");
		sb.append("</td>");
		sb.append("</tr>");
		sb.append("</table>");
		sb.append("</body >");
		sb.append("</html>");

		return sb.toString();

	}
}
