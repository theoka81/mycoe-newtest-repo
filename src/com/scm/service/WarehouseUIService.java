package com.scm.service;

import java.util.List;

import com.scm.modal.GenericDropDownBean;


public interface WarehouseUIService {

	public List<GenericDropDownBean> getActiveWarehouses() throws Throwable;

	public String goExtendItemsToWarehouse(long[]  itemIds, long warehouseId) throws Throwable;
}
