package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.Director;

public interface DirectorsDao  extends GenericDao<Director, Long>{

	public List<Director> getDirectorsDetails(Long supplierId) throws Throwable;
	
}
