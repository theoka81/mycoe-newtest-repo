package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.BbbeeIrbaRegisteredAuditor;

public interface BbbeeIrbaRegisteredAuditorsDao extends GenericDao<BbbeeIrbaRegisteredAuditor, Integer>{

	public BbbeeIrbaRegisteredAuditor getBbbeeIrbaRegisteredAuditorByCode(String code) throws Throwable;
}
