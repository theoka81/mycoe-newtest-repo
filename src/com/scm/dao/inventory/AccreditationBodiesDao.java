package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.AccreditationBody;

public interface AccreditationBodiesDao  extends GenericDao<AccreditationBody, Long>{

	public List<AccreditationBody> getAccreditationBodiesDetails(Long supplierId) throws Throwable;
	
}
