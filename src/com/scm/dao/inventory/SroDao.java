package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.SROe;
import com.scm.modal.SroBean;

public interface SroDao extends GenericDao<SROe, Long>{
	
	public List<SroBean> getSROList(String maaaNumber) throws Throwable;
	
	public Long getSROCount() throws Throwable;
	
	public SROe getSROByContract(Long contractId) throws Throwable;

}
