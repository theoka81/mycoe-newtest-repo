package com.scm.dao.inventory;

import java.util.List;
import java.util.Map;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.UserCode;

public interface UserCodeDao  extends GenericDao<UserCode, Long>{

	public UserCode getUserCodeDetails(Long id) throws Throwable;
	
	public List<UserCode> getUserCodeDetails(String key) throws Throwable;
	
	public String getUserCodeDetailsDesc(Long id) throws Throwable;
	
	public Map<Long, String> getUserCodeKeyMap(String codeKey, boolean isContractType) throws Throwable;
	
}
