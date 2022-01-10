package com.scm.service.impl;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.domain.InventoryWarehouseDefault;
import com.scm.dao.domain.UserCode;
import com.scm.dao.domain.WarehouseDetail;
import com.scm.dao.domain.WarehouseInventoryDefinition;
import com.scm.modal.GenericDropDownBean;
import com.scm.service.WarehouseUIService;
import com.scm.service.common.BaseUIservice;

@Service
public class WarehouseUIServiceImpl extends BaseUIservice implements WarehouseUIService {

	@Override
	public List<GenericDropDownBean> getActiveWarehouses() throws Throwable {
		
		 List<GenericDropDownBean> summary=
				daoManager.getWarehouseDao().getActiveWarehouses();

		return summary;

	}
	
	@Override
	@Transactional("")
	public String goExtendItemsToWarehouse(long[] itemIds,long warehouseId) throws Throwable {
		
		
		List<Long> list = Arrays.stream(itemIds).boxed().collect(Collectors.toList());
		
		List<WarehouseInventoryDefinition> existingWarehouseInv=daoManager.getWarehouseInventoryDao().getExistingWarehouseInve(warehouseId);
		
		for(WarehouseInventoryDefinition item : existingWarehouseInv)
		{
				
			list.remove(item.getItemId());
		}
		WarehouseInventoryDefinition warehouseInvDef=null;
		for(Long item : list)
		{
			InventoryWarehouseDefault invDef=daoManager.getInventoryWarehouseDefaultsDao().get(item);
			warehouseInvDef=new WarehouseInventoryDefinition();
			if(invDef.getRebateCode()!=null && invDef.getRebateCode().length() > 0)
			warehouseInvDef.setRebateCode(Long.parseLong(invDef.getRebateCode()));
			warehouseInvDef.setItemId(item);
			warehouseInvDef.setItemNo(invDef.getItemNo());
			warehouseInvDef.setLastSupplierNumber(invDef.getLastSupplierNumber());
			warehouseInvDef.setBuyerNumber(invDef.getBuyerNumber());
			warehouseInvDef.setReorderQuantityInput(invDef.getReorderPointInput());
			warehouseInvDef.setReorderPointInput(invDef.getReorderPointInput());
			warehouseInvDef.setReorderQuantityMaximum(invDef.getReorderQuantityMaximum());
			warehouseInvDef.setReorderQuantityMinimum(invDef.getReorderQuantityMinimum());
			warehouseInvDef.setServiceLevel(invDef.getServiceLevel());
			warehouseInvDef.setSafetyStock(invDef.getSafetyStock());
			warehouseInvDef.setShelfLifeDays(invDef.getShelfLifeDays());
			warehouseInvDef.setCheckAvailability(invDef.getCheckAvailability());
			warehouseInvDef.setLayerCodeSource(invDef.getLayerCodeSource());
			warehouseInvDef.setLotStatusCode(invDef.getLotStatusCode());
			UserCode uc= new UserCode();
			uc.setId(invDef.getLotStatusTypeId());
			warehouseInvDef.setUserCode4(uc);
			UserCode uc2=new UserCode();
			uc2.setId(invDef.getLayerSourceTypeId());
			warehouseInvDef.setUserCode2(uc2);
			
			UserCode uc8=new UserCode();
			uc8.setId(invDef.getShippingConditionsTypeId());
			warehouseInvDef.setUserCode8(uc8);
			
			
			warehouseInvDef.setPotencyControl(invDef.getPotencyControl());
			warehouseInvDef.setGradeControl(invDef.getGradeControl());
			warehouseInvDef.setShippingConditionsCode(invDef.getShippingConditionsCode());
			warehouseInvDef.setStockingType(invDef.getStockingType());
			UserCode uc9=new UserCode();
			uc9.setId(invDef.getStockingTypeId());
			warehouseInvDef.setUserCode9(uc9);
			UserCode uc3=new UserCode();
			uc3.setId(invDef.getLineTypeId());
			warehouseInvDef.setUserCode3(uc3);
			warehouseInvDef.setLineType(invDef.getLineType());
			
			UserCode uc10=new UserCode();
			uc10.setId(invDef.getWarehouseCode1Id());
			warehouseInvDef.setUserCode10(uc10);
			warehouseInvDef.setWarehouseCode1(invDef.getWarehouseCode1());
			
			UserCode uc11=new UserCode();
			uc11.setId(invDef.getWarehouseCode2Id());
			warehouseInvDef.setUserCode11(uc11);
			warehouseInvDef.setWarehouseCode2(invDef.getWarehouseCode2());
			
			UserCode uc12=new UserCode();
			uc12.setId(invDef.getWarehouseCode3Id());
			warehouseInvDef.setUserCode12(uc12);
			warehouseInvDef.setWarehouseCode3(invDef.getWarehouseCode3());
			
			
			warehouseInvDef.setQualityBatchBestBefore(invDef.getQualityBatchBestBefore());
			warehouseInvDef.setQualityBatchNo(invDef.getQualityBatchNo());
			warehouseInvDef.setQualityBatchReviewer(invDef.getQualityBatchReviewer());
			warehouseInvDef.setWarehouseCode3(invDef.getWarehouseCode3());
			
			WarehouseDetail w=new WarehouseDetail();
			w.setId(warehouseId);
			warehouseInvDef.setWarehouseDetail(w);
			
			//TODO 
			//Need to do All items
			
			daoManager.getWarehouseInventoryDao().save(warehouseInvDef);
			daoManager.getWarehouseInventoryDao().flush();
			
			
			
			
			
			
		}
		return "success";

	}

}
