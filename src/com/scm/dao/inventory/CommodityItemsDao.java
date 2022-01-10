package com.scm.dao.inventory;

import java.util.List;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.CommodityItem;

public interface CommodityItemsDao  extends GenericDao<CommodityItem, Long>{

	public List<CommodityItem> getCommodityItemsDetails(Long supplierId) throws Throwable;
	
}
