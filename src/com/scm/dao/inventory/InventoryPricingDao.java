package com.scm.dao.inventory;

import com.scm.dao.common.GenericDao;
import com.scm.dao.domain.InventoryPricing;

public interface InventoryPricingDao extends GenericDao<InventoryPricing, Long> {

	public InventoryPricing getInventoryPricingDetails(Long inventoryId) throws Throwable;

}
