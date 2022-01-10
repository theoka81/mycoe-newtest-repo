package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.CommodityLocation;

public interface CommodityLocationsDao  extends GenericDao<CommodityLocation, Long>{

	public List<CommodityLocation> getCommodityLocationsDetails(Long supplierId) throws Throwable;
	
}
