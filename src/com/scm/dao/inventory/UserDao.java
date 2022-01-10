package com.scm.dao.inventory;

import java.util.List;
import java.util.Map;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SystemUser;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.UserBean;

public interface UserDao extends GenericDao<SystemUser, Long> {

	public SystemUser getUserDetailsByUserName(String username, String password) throws Throwable;

	public Integer checkUserValueExists(String value, String type) throws Throwable;

	public Map<Long, String> getUsersKeyMap() throws Throwable;

	public SystemUser getUserDetailsBy(String maaaNumber) throws Throwable;

	public int getSystemUsersCount(SearchSortContainer searchSortContainer) throws Throwable;

	public List<UserBean> getSystemUsersSummary(Pagination pagination, SearchSortContainer searchSortContainer)
			throws Throwable;
}