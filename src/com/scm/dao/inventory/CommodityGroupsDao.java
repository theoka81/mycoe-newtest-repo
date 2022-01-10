package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.CommodityGroup;

public interface CommodityGroupsDao  extends GenericDao<CommodityGroup, Long>{

	public List<CommodityGroup> getCommodityGroupsDetails(Long supplierId) throws Throwable;
	
}
