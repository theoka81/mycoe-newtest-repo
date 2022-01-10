package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.BbbeeCertificateType;

public interface BbbeeCertificateTypeDao extends GenericDao<BbbeeCertificateType, Integer>{

	public BbbeeCertificateType getBbbeeCertificateTypeByCode(String code) throws Throwable;
}
