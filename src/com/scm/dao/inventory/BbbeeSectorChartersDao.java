package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.BbbeeSectorCharter;

public interface BbbeeSectorChartersDao extends GenericDao<BbbeeSectorCharter, Integer>{

	public BbbeeSectorCharter getBbbeeSectorCharterByCode(String code) throws Throwable;
}
