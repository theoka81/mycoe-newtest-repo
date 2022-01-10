package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.BbbeeVerificationRegulator;

public interface BbbeeVerificationRegulatorsDao extends GenericDao<BbbeeVerificationRegulator, Integer>{

	public BbbeeVerificationRegulator getBbbeeVerificationRegulatorByCode(String code) throws Throwable;
}
