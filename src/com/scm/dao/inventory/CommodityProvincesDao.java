package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.CommodityProvince;

public interface CommodityProvincesDao  extends GenericDao<CommodityProvince, Long>{

	public List<CommodityProvince> getCommodityProvincesDetails(Long supplierId) throws Throwable;
	
}
