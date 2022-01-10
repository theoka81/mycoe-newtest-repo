package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.PriceBenchmarkDefinition;

public interface PriceBenchmarkDefinitionsDao extends GenericDao<PriceBenchmarkDefinition, Long> {

	public Long getPriceBenchmarkDefinitionsCount() throws Throwable;

}
