package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.IPW;
import com.scm.modal.IPWBean;

public interface IpwDao extends GenericDao<IPW, Long>{
	
	public List<IPWBean> getIPWList(String maaaNumber) throws Throwable;

	public Long getIPWsCount() throws Throwable;
	
	public IPW getIPWByContract(Long contractId) throws Throwable;
}
