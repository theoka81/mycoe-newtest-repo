package com.scm.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.internal.util.StringHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scm.common.cache.SCMProperties;
import com.scm.dao.domain.ApplicationRole;
import com.scm.dao.domain.ApplicationUserRole;
import com.scm.dao.domain.SystemUser;
import com.scm.modal.Pagination;
import com.scm.modal.ResetPasswordBean;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;
import com.scm.modal.UserBean;
import com.scm.service.UserUIService;
import com.scm.service.common.BaseUIservice;
import com.scm.util.DesEncrypter;
import com.scm.ws.impl.data.SupplierDetailsFull;

@Service
public class UserUIServiceImpl extends BaseUIservice implements UserUIService {
	
	//private SqlHelper sqlHelper = null;

	@Override
	public SystemUser getUserDetailsBy(Long userId) throws Throwable {
		return daoManager.getUserDao().get(userId);
	}
	
	@Override
	public SystemUser getUserDetailsBy(String username, String password) throws Throwable {
		return daoManager.getUserDao().getUserDetailsByUserName(username, password);
	}

	@Override
	public String getUserRole(Long userId) throws Throwable {
		return daoManager.getApplicationUserRoleDao().getByUserId(userId);
	}
	
	@Override
	public ApplicationRole getRoleByName(String roleName) throws Throwable {
		return daoManager.getApplicationRoleDao().getByRoleName(roleName);
	}

	@Override
	@Transactional("transactionManager")
	public void registerSupplier(UserBean userObj) throws Throwable {
		
		SystemUser systemUser = new SystemUser();
		systemUser.setEmailAddress(userObj.getEmail());
		systemUser.setMaaaNumber(userObj.getMaaaNumber());
		systemUser.setFirstName(userObj.getFirstName());
		systemUser.setLastName(userObj.getLastName());
		systemUser.setMobileNumber(userObj.getMobileNumber());
		systemUser.setIdentificationNumber(userObj.getIdentificationNumber());
		systemUser.setPassword(userObj.getPassword());
		systemUser.setIsActive(true);
		systemUser.setIsDeleted(false);
		systemUser.setIsLocked(false);
		Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
		systemUser.setCreatedDateTime(ts);
		systemUser.setModifiedDateTime(ts);
		systemUser.setIsPasswordReset(true);
		systemUser.setIsTemporaryPassword(false);
		systemUser.setCode("");
		
		systemUser = daoManager.getUserDao().save(systemUser);
		
		if (systemUser != null && systemUser.getId() != null) {
			ApplicationUserRole userRole = new ApplicationUserRole();

			userRole.setApplicationRole(getRoleByName("Supplier"));
			userRole.setSystemUserId(systemUser.getId());
			userRole = daoManager.getApplicationUserRoleDao().save(userRole);

			daoManager.getUserDao().flush();
			daoManager.getApplicationUserRoleDao().flush();
			serviceManager.getEmailService().emailSupplierOnRegistration(systemUser.getEmailAddress(),
					systemUser.getMaaaNumber(), systemUser.getMobileNumber());
		}
	}
	
	@Override
	public void updateUser(UserBean userObj) throws Throwable {
	}

	@Override
	public SystemUser changePassword(ResetPasswordBean reset) throws Throwable {

		SystemUser sysUser = daoManager.getUserDao()
				.get(reset.getUserId());

		sysUser.setPassword(DesEncrypter.encrypt(reset.getNewPassword()));
		sysUser.setIsPasswordReset(true);
		return daoManager.getUserDao().save(sysUser);

	}

	@Override
	@Transactional("transactionManager")
	public String checkUserValueExists(String value, String type) throws Throwable {
		Integer cnt = daoManager.getUserDao().checkUserValueExists(value, type);
		daoManager.getUserDao().flush();
		if(cnt != null) {
			if(cnt.intValue() > 0) {
				return "Exists";
			}
		}
		return "";
	}
	
	
	@Override
	@Transactional(value="csdTransactionManager", readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public String validateMaaaNumber(String maaaNumber) throws Throwable {
		String isCSDLocalEnabled = SCMProperties.get("USE_CSD_LOCAL_DB");
		if (!SCMProperties.isEmpty(isCSDLocalEnabled) && SCMProperties.isOn(isCSDLocalEnabled)) {
			Integer cnt = daoManager.getCsdSupplierDao().validateMaaaNumber(maaaNumber);
//			daoManager.getCsdSupplierDao().flush();
			if (cnt != null && cnt.intValue() > 0) {
				return "success";
			}
		} else {
			String token = serviceManager.getCsdApiService().authenticate();
			SupplierDetailsFull supplierDetailsFull = serviceManager.getCsdApiService().getSupplier(token, maaaNumber);
			if (supplierDetailsFull != null && supplierDetailsFull.getSupplierIdentificationDetails() != null
					&& StringHelper
							.isNotEmpty(supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber()))
				return "success";
		}
		return "error";
	}
	
	@Override
	@Transactional(value="csdTransactionManager", readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public boolean isCSDActive(String maaaNumber) throws Throwable {
		String isCSDLocalEnabled = SCMProperties.get("USE_CSD_LOCAL_DB");
		if (!SCMProperties.isEmpty(isCSDLocalEnabled) && SCMProperties.isOn(isCSDLocalEnabled)) {
			Integer cnt = daoManager.getCsdSupplierDao().isCSDActive(maaaNumber);
			//daoManager.getCsdSupplierDao().flush();
			if (cnt != null && cnt.intValue() > 0) {
				return true;
			}
		} else {
			String token = serviceManager.getCsdApiService().authenticate();
			if (token == null)
				throw new Throwable("Invalid token...");
			SupplierDetailsFull supplierDetailsFull = serviceManager.getCsdApiService().getSupplier(token, maaaNumber);
			if (supplierDetailsFull != null && supplierDetailsFull.getSupplierIdentificationDetails() != null
					&& StringHelper
							.isNotEmpty(supplierDetailsFull.getSupplierIdentificationDetails().getSupplierNumber())) {
				if (supplierDetailsFull.getSupplierIdentificationDetails().getIsActive() != null
						&& supplierDetailsFull.getSupplierIdentificationDetails().getIsActive()) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	@Override
	public SummaryResponse<UserBean> getSystemUsersSummary(Pagination pagination,
			SearchSortContainer searchSortContainer) throws Throwable {
		SummaryResponse<UserBean> summary = new SummaryResponse<UserBean>();
		summary.setTotalRecords(daoManager.getUserDao().getSystemUsersCount(searchSortContainer));
		summary.setEntities(daoManager.getUserDao().getSystemUsersSummary(pagination, searchSortContainer));

		return summary;
	}
}
