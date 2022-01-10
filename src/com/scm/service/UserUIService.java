package com.scm.service;

import com.scm.dao.domain.ApplicationRole;
import com.scm.dao.domain.SystemUser;
import com.scm.modal.Pagination;
import com.scm.modal.ResetPasswordBean;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;
import com.scm.modal.UserBean;

public interface UserUIService {
	
	public SystemUser getUserDetailsBy(Long userId) throws Throwable;

	public SystemUser getUserDetailsBy(String username, String password) throws Throwable;

	public String getUserRole(Long userId) throws Throwable;

	public ApplicationRole getRoleByName(String roleName) throws Throwable;

	public void registerSupplier(UserBean userObj) throws Throwable;

	public void updateUser(UserBean userObj) throws Throwable;

	public SystemUser changePassword(ResetPasswordBean reset) throws Throwable;

	public String checkUserValueExists(String value, String type) throws Throwable;

	public String validateMaaaNumber(String maaaNumber) throws Throwable;

	public boolean isCSDActive(String maaaNumber) throws Throwable;

	public SummaryResponse<UserBean> getSystemUsersSummary(Pagination pagination,
			SearchSortContainer searchSortContainer) throws Throwable;

}
