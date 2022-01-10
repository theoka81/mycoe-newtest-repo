package com.scm.service.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.hibernate.internal.util.StringHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scm.dao.domain.Document;
import com.scm.dao.domain.InventoryDefinition;
import com.scm.dao.domain.InventoryPricing;
import com.scm.dao.domain.InventorySpecification;
import com.scm.dao.domain.InventoryWarehouseDefault;
import com.scm.dao.domain.UomConversion;
import com.scm.dao.domain.UserCode;
import com.scm.keys.UserCodeKeys;
import com.scm.modal.DocumentBean;
import com.scm.modal.DocumentViewModel;
import com.scm.modal.InventoryBean;
import com.scm.modal.InventoryDefinitionsBean;
import com.scm.modal.InventoryViewModel;
import com.scm.modal.Pagination;
import com.scm.modal.SearchSortContainer;
import com.scm.modal.SummaryResponse;
import com.scm.service.InventoryUIService;
import com.scm.service.common.BaseUIservice;
import com.scm.util.Utility;

@Service
public class InventoryUIServiceImpl extends BaseUIservice implements InventoryUIService {

	@Override
	public SummaryResponse<InventoryDefinitionsBean> getInventoryDetailsSummary(Pagination pagination,
			SearchSortContainer searchSortObj) throws Throwable {
		SummaryResponse<InventoryDefinitionsBean> summary = new SummaryResponse<InventoryDefinitionsBean>();
		summary.setTotalRecords(daoManager.getInventoryDao().getInventoryDetailsCount(searchSortObj));
		summary.setEntities(
				daoManager.getInventoryDao().getInventoryDetailsSummary(pagination, searchSortObj));

		return summary;

	}
	
	
	
	@Override
	@Transactional("transactionManager")
	public InventoryViewModel saveDetails(InventoryBean inventoryBean, DocumentBean documentBean, Long systemUserId) throws Throwable {
		
		InventoryViewModel ivm = null;
		if(inventoryBean.getInventoryId()!=null)
		{
			
			InventoryDefinition invDef= daoManager.getInventoryDao().get(inventoryBean.getInventoryId());
			//invDef.setBarcodeNo(inventoryBean.getInventoryDefinitionBar);
			invDef.setBuyerNo(inventoryBean.getInventoryDefinitionBuyerNo());
			invDef.setCarrierNo(inventoryBean.getInventoryDefinitionCarrierNo());
			invDef.setCategoryGlId(inventoryBean.getInventoryDefinitionCategoryGlId());
			invDef.setCommissionCategoryId(inventoryBean.getInventoryDefinitionCommissionCategoryId());
			invDef.setCommodityClassId(inventoryBean.getInventoryDefinitionCommodityClassId());
			invDef.setCommodityCodeId(inventoryBean.getInventoryDefinitionCommodityCodeId());
			invDef.setCommoditySubClassId(inventoryBean.getInventoryDefinitionCommoditySubClassId());
			//invDef.setCreatedDateTime(date.getTime);
			invDef.setCycleCountCategoryId(inventoryBean.getInventoryDefinitionCycleCountCategoryId());
			invDef.setDaysShelfLifeDays(inventoryBean.getInventoryDefinitionDaysShelfLifeDays());
			invDef.setDrawingNo(inventoryBean.getInventoryDefinitionDrawingNo());
			invDef.setFamilySectionId(inventoryBean.getInventoryDefinitionFamilySectionId());
			invDef.setFifoProcessingId(inventoryBean.getInventoryDefinitionFifoProcessingId());
			//invDef.setId(inventoryBean.getInventoryId());
			//invDef.setImageLinkPath(inventoryBean.image);
			invDef.setIsActive(true);
			invDef.setIsDeleted(false);
			invDef.setIsLocked(false);
			invDef.setItemCodeId1(inventoryBean.getInventoryDefinitionItemCodeId1());
			invDef.setItemCodeId2(inventoryBean.getInventoryDefinitionItemCodeId2());
			invDef.setItemCodeId3(inventoryBean.getInventoryDefinitionItemCodeId3());
			invDef.setItemCodeId4(inventoryBean.getInventoryDefinitionItemCodeId4());
			invDef.setItemCodeId5(inventoryBean.getInventoryDefinitionItemCodeId5());
			invDef.setItemCodeId6(inventoryBean.getInventoryDefinitionItemCodeId6());
			invDef.setItemCodeId7(inventoryBean.getInventoryDefinitionItemCodeId7());
			invDef.setItemCodeId8(inventoryBean.getInventoryDefinitionItemCodeId8());
			invDef.setItemDescription(inventoryBean.getInventoryDefinitionItemDescription());
			invDef.setItemDimensionHeight(inventoryBean.getInventoryDefinitionItemDimensionHeight());
			invDef.setItemDimensionLength(inventoryBean.getInventoryDefinitionItemDimensionLength());
			invDef.setItemDimensionVolume(inventoryBean.getInventoryDefinitionItemDimensionVolume());
			invDef.setItemDimensionWidth(inventoryBean.getInventoryDefinitionItemDimensionWidth());
			//invDef.setItemId(inventoryBean.getInvItem);
			//invDef.setItemNo(inventoryBean.getInventoryDefinitionItemN);
			invDef.setItemStatusId(inventoryBean.getInventoryDefinitionItemStatusId());
			invDef.setItemTemperaturePreferredFromId(inventoryBean.getInventoryDefinitionItemTemperaturePreferredFromId());
			invDef.setItemTemperaturePreferredToId(inventoryBean.getInventoryDefinitionItemTemperaturePreferredToId());
			invDef.setItemXRef3(inventoryBean.getInventoryDefinitionItemXRef3());
			//invDef.setItemXRef4(inventoryBean.getInventoryDefinitionXRef4());
			//invDef.setItemXRef5(inventoryBean.getInventoryDefinitionXRef5());
			
			if(StringHelper.isNotEmpty(inventoryBean.getInventoryDefinitionLastInvoiceEffectiveDate())) {
				invDef.setLastInvoiceEffectiveDate(Timestamp.valueOf(inventoryBean.getInventoryDefinitionLastInvoiceEffectiveDate()));
			}
			if(inventoryBean.getInventoryDefinitionLastInvoiceUnitPrice() != null)
				invDef.setLastInvoiceUnitPrice(BigDecimal.valueOf(inventoryBean.getInventoryDefinitionLastInvoiceUnitPrice()));
			invDef.setLastInvoiceUom(inventoryBean.getInventoryDefinitionLastInvoiceUom());
			invDef.setLotStatusCodeId(inventoryBean.getInventoryDefinitionLotStatusCodeId());
			invDef.setMethodKitConfiguratorPricingId(inventoryBean.getInventoryDefinitionMethodKitConfiguratorPricingId());
			invDef.setMscoaItemSegmentId(inventoryBean.getInventoryDefinitionMscoaItemSegmentId());
			invDef.setPlanningCodeId(inventoryBean.getInventoryDefinitionPlanningCodeId());
			invDef.setPreferredCarrier(inventoryBean.getInventoryDefinitionPreferredCarrier());
			invDef.setProductFamilyId(inventoryBean.getInventoryDefinitionProductFamilyId());
			invDef.setProductGroupId(inventoryBean.getInventoryDefinitionProducGroupId());
			invDef.setProductLineId(inventoryBean.getInventoryDefinitionProductLineId());
			//invDef.setProvincialContract(inventoryBean.getInventoryDefinitionpro);
			//invDef.setQRCode(inventoryBean.getInventoryDefinition);
			invDef.setSerialNoRequiredId(inventoryBean.getInventoryDefinitionSerialNoRequiredId());
			invDef.setShippingCommodityClassId(inventoryBean.getInventoryDefinitionShippingCommodityClassId());
			invDef.setShippingConditionsCodeId(inventoryBean.getInventoryDefinitionShippingConditionsCodeId());
			invDef.setShortDescription(inventoryBean.getInventoryDefinitionShortDescription());
			invDef.setStandardAgreementTemplateId(inventoryBean.getInventoryDefinitionStandardAgreementTemplateId());
			invDef.setStockTypeId(inventoryBean.getInventoryDefinitionStockTypeId());
			//invDef.setTakeOnIndicator(inventoryBean.getInventoryDefinitiont);
			invDef.setTypeWarrantyId(inventoryBean.getInventoryDefinitionTypeWarrantyId());
		//	invDef.setUomComponentId(inventoryBean.getInventoryDefinitionToUomId());
			invDef.setUomPricingId(inventoryBean.getInventoryDefinitionUomPricingId());
			invDef.setUomPrimaryId(inventoryBean.getInventoryDefinitionUomPrimaryId());
			//invDef.setUomProductionId(inventoryBean.getInventoryDefinitionU);
			invDef.setUomPurchasingId(inventoryBean.getInventoryDefinitionUomPurchasingId());
			invDef.setUomSecondaryId(inventoryBean.getInventoryDefinitionUomSecondaryId());
			invDef.setUomShippingId(inventoryBean.getInventoryDefinitionUomShippingId());
			invDef.setUomStockingId(inventoryBean.getInventoryDefinitionStockTypeId());
			if(inventoryBean.getInventoryId()!=0)
				invDef.setId(inventoryBean.getInventoryId());
			//invDef.setUomVolumeId(inventoryBean.getInventoryDefinitionUom);
		//	invDef.setUomVolumeorWeightId(inventoryBean.getInventoryDefinitionuo);
		//	invDef.setUomWeightId(inventoryBean.getInventoryDefinitionuonW);
			//invDef.setVatIndicatorId(inventoryBean.getInventoryDefinitionv);
			daoManager.getInventoryDao().save(invDef);
			
			//inventoryId=invDef.getId();
			
			InventoryPricing invPricing=daoManager.getInventoryPricingDao().getInventoryPricingDetails(inventoryBean.getInventoryId());
			if(invPricing == null) {
				invPricing = new InventoryPricing();
			}
			if (inventoryBean.getInventoryPricingId() != null
					&& (inventoryBean.getInventoryPricingId() != 0 && inventoryBean.getInventoryPricingId() != -1))
				invPricing.setId(inventoryBean.getInventoryPricingId());
			if (inventoryBean.getInventoryPricingCurrencyId() != null
					&& inventoryBean.getInventoryPricingCurrencyId() != 0
					&& inventoryBean.getInventoryPricingCurrencyId() != -1)
				invPricing.setCurrencyId(inventoryBean.getInventoryPricingCurrencyId());
			invPricing.setInventoryDefinition(invDef);
			invPricing.setIsActive(true);
			invPricing.setIsDeleted(false);
			invPricing.setIsLocked(false);
			//invPricing.setItemNo(inventoryBean.getInventoryPricingite););
			if (inventoryBean.getInventoryPricingItemPriceStatusId() != null
					&& inventoryBean.getInventoryPricingItemPriceStatusId() != 0
					&& inventoryBean.getInventoryPricingItemPriceStatusId() != -1)
				invPricing.setItemPriceStatusId(inventoryBean.getInventoryPricingItemPriceStatusId());
			if(inventoryBean.getInventoryPricingPrice() != null)
				invPricing.setPrice(BigDecimal.valueOf(inventoryBean.getInventoryPricingPrice()));
			if(StringHelper.isNotEmpty(inventoryBean.getInventoryPricingPricingDate())) {
				invPricing.setPricingDate(Timestamp.valueOf(inventoryBean.getInventoryPricingPricingDate()));
			}
			if (inventoryBean.getInventoryPricingPricingTypeId() != null
					&& inventoryBean.getInventoryPricingPricingTypeId() != 0
					&& inventoryBean.getInventoryPricingPricingTypeId() != -1)
				invPricing.setPricingTypeId(inventoryBean.getInventoryPricingPricingTypeId());
			if (inventoryBean.getInventoryPricingPricingUomId() != null
					&& inventoryBean.getInventoryPricingPricingUomId() != 0
					&& inventoryBean.getInventoryPricingPricingUomId() != -1)
				invPricing.setPricingUomId(inventoryBean.getInventoryPricingPricingUomId());
		/*	if(inventoryBean.getInventoryPricingId)
			invPricing*/
			daoManager.getInventoryPricingDao().save(invPricing);
			
			
			UomConversion uomConv= daoManager.getUomConversionDao().getUomConversionDetails(inventoryBean.getInventoryId());
			if(uomConv == null)	
				uomConv = new UomConversion();
			uomConv.setConversionFactor(inventoryBean.getUomConversionConversionFactor());
			uomConv.setDescription(inventoryBean.getUomConversionDescription());
			if(inventoryBean.getUomConversionId() != null && inventoryBean.getUomConversionId()!=0)
				uomConv.setId(inventoryBean.getUomConversionId());
			//uomConv.setFromUom(inventoryBean.getUomConversion);
			uomConv.setIsActive(true);
			uomConv.setIsDeleted(false);
			uomConv.setIsLocked(false);
			uomConv.setItemId(inventoryBean.getInventoryId());
			//uomConv.setItemNo(null);
			//uomConv.setQtyFromUnit(inventoryBean.getUomC);
		//	uomConv.setQtyToUnit(inventoryId);t
			//uomConv.setToUom(null);
			//uomConv.setUserCode1(null);
			//uomConv.setUserCode2(null);
			
			daoManager.getUomConversionDao().save(uomConv);
			
			
			InventoryWarehouseDefault invWarehouse=daoManager.getInventoryWarehouseDefaultsDao().getInventoryWarehouseDefaultDetails(inventoryBean.getInventoryId());
			if(invWarehouse == null) {
				 invWarehouse=new InventoryWarehouseDefault();
			}
			if(inventoryBean.getInventoryWarehouseDefaultsId() != null && inventoryBean.getInventoryWarehouseDefaultsId()!=0)
				invWarehouse.setId(inventoryBean.getInventoryWarehouseDefaultsId());
			invWarehouse.setBuyerNumber(inventoryBean.getInventoryWarehouseDefaultBuyerNumber());
			invWarehouse.setCheckAvailability(true);
		//	invWarehouse.setGradeControl(inventoryBean.getInventoryWarehouseDefault);
			invWarehouse.setInventoryDefinition(invDef);
			invWarehouse.setIsActive(true);
			invWarehouse.setIsDeleted(false);
			invWarehouse.setIsLocked(false);
		//	invWarehouse.setItemNo(inventoryBean.getInventoryWarehouseDefaultI);
			invWarehouse.setLastSupplierNumber(inventoryBean.getInventoryWarehouseDefaultLastSupplierNumber());
			//invWarehouse.setLayerCodeSource(inventoryBean.getInventoryWarehouseDefaultL);
		//	invWarehouse.setLineTypeId(inventoryBean.getInventoryWarehouseDefaultL);
		//	invWarehouse.setLocationId(inventoryBean.getInventoryWarehouseDefaultL);
		//	invWarehouse.setLotStatusTypeId(inventoryBean.getInventoryWarehouseDefaultLo);
			invWarehouse.setServiceLevel(inventoryBean.getInventoryWarehouseDefaultServiceLevel());
			invWarehouse.setSafetyStock(inventoryBean.getInventoryWarehouseDefaultSafetyStock());
			invWarehouse.setShelfLifeDays(inventoryBean.getInventoryWarehouseDefaultShelfLifeDays());
			//invWarehouse.setShippingConditionsCode(inventoryBean.getInventoryWarehouseDefaults);
		//	invWarehouse.setShippingConditionsTypeId(inventoryBean.getInventoryWarehouseDefaults);
		//	invWarehouse.setStockingTypeId(inventoryBean.getInventoryWarehouseDefaultst);
		//	invWarehouse.setQualityBatchBestBefore(inventoryBean.getInventoryWarehouseDefault);
			invWarehouse.setReorderQuantityInput(inventoryBean.getInventoryWarehouseDefaultReorderQuantityInput());
			invWarehouse.setReorderPointInput(inventoryBean.getInventoryWarehouseDefaultReorderPointInput());
		//	invWarehouse.setRebateCode(inventoryBean.getInventoryWarehouseDefaultre);
			if (inventoryBean.getInventoryWarehouseDefaultRebateTypeId() != null
					&& inventoryBean.getInventoryWarehouseDefaultRebateTypeId() != 0
					&& inventoryBean.getInventoryWarehouseDefaultRebateTypeId() != -1)
				invWarehouse.setRebateTypeId(inventoryBean.getInventoryWarehouseDefaultRebateTypeId());
			invWarehouse.setReorderQuantityInput(inventoryBean.getInventoryWarehouseDefaultReorderQuantityInput());
			invWarehouse.setReorderQuantityMaximum(inventoryBean.getInventoryWarehouseDefaultReorderQuantityMaximum());
			invWarehouse.setReorderQuantityMinimum(inventoryBean.getInventoryWarehouseDefaultReorderQuantityMinimum());
			invWarehouse.setInventoryDefinition(invDef);
			//invWarehouse.setQualityBatchReviewer(inventoryBean.getInventoryWarehouseDefault);
			
			daoManager.getInventoryWarehouseDefaultsDao().save(invWarehouse);
			
			InventorySpecification invSpec=daoManager.getInventorySpecificationDao().getInventorySpecificationDetails(inventoryBean.getInventoryId());
			if(invSpec == null) {
				invSpec=new InventorySpecification();
			}
			invSpec.setCanUseSubstituteFlag(inventoryBean.getInventorySpecificationcanUseSubstituteFlag());
			if(inventoryBean.getInventorySpecificationId() != null && inventoryBean.getInventorySpecificationId()!=0)
				invSpec.setId(inventoryBean.getInventorySpecificationId());
			//invSpec.setDefaultUnit(inventoryBean.getInventorySpecificationD);
		//	invSpec.setDocSpecificationId(inventoryBean.getInventorySpecificationdo);
			invSpec.setIsActive(true);
			invSpec.setIsDeleted(false);
			invSpec.setIsLocked(false);
			invSpec.setItemId(inventoryBean.getInventoryId());
			//invSpec.setItemNotesLinkId(inventoryBean.getInventorySpecificationi);
		//	invSpec.setProductConfiguration(inventoryBean.getInventorySpecificationP);
			invSpec.setProductModel(inventoryBean.getInventorySpecificationProductModel());
			invSpec.setProductModelGroup(inventoryBean.getInventorySpecificationProductModelGroup());
			invSpec.setRelatedAssetDescription(inventoryBean.getInventorySpecificationRelatedAssetDescription());
			invSpec.setRelatedAssetId(inventoryBean.getInventorySpecificationRelatedAssetId());
			invSpec.setSpecifiedEffectiveDate(inventoryBean.getInventorySpecificationSpecifiedEffectiveDate());
			invSpec.setSpecifiedState(inventoryBean.getInventorySpecificationSpecifiedState());
			//invSpec.setTraceCode(inventoryBean.getInventorySpecification);
			invSpec.setUseOemPartFlag(inventoryBean.getInventorySpecificationuseOemPartFlag());
			invSpec.setVariantBaseline(inventoryBean.getInventorySpecificationVariantBaseline());
			invSpec.setVariantSpecification(inventoryBean.getInventorySpecificationVariantSpecification());
			
			daoManager.getInventorySpecificationDao().save(invSpec);
			
			ivm = getInventoryVewModalDetails(inventoryBean.getInventoryId());
			
			List<Document> findDocumentsActive = new ArrayList<Document>();
			for (UserCode dcl : ivm.getDocumentViewModel().getDocumentCheckLists()) {
				List<Document> d = daoManager.getDocumentsDao().getDocumentsDetails(dcl.getId(), ivm.getInventoryCode().getId());
				if(d != null && d.size() > 0) {
					findDocumentsActive.addAll(d);
				}
			}

			if (findDocumentsActive.size() == 0
					|| findDocumentsActive.size() < ivm.getDocumentViewModel().getDocumentCheckLists().size()) {
				List<Integer> userCodeIdList = Utility.getListFromCommaSeparated(documentBean.getChecklists());
				if (documentBean != null && documentBean.getFileNames() != null && documentBean.getFileNames().size() > 0)
					for (int i = 0; i < documentBean.getFileNames().size(); i++) {

						UserCode u = daoManager.getUserCodeDao().get(Long.valueOf(userCodeIdList.get(i)));
						Document d = new Document();
						d.setContentType(documentBean.getContentTypes().get(i));
						d.setDocumentName(documentBean.getFileNames().get(i));
						d.setContent(FileUtils.readFileToByteArray(documentBean.getFiles().get(i)));
						d.setFileSize(documentBean.getFiles().get(i).length());
						d.setCodeValue(u.getCodeValue());
						d.setUserCodeId(u.getId());
						d.setUserCodeDesc(u.getDescription());
						d.setIsActive(true);
						d.setIsDeleted(false);
						d.setReferenceId(ivm.getInventoryCode().getId());
						Date date = new Date();
						Timestamp ts = new Timestamp(date.getTime());
						d.setCreatedDateTime(ts);
						d.setModifiedDateTime(ts);
						d.setIsLocked(false);
						d.setCreatedBySystemUserId(systemUserId);

						d = daoManager.getDocumentsDao().save(d);
					}

			}
			
		}
		return ivm;

	}

	@Override
	public InventoryViewModel getInventoryVewModalDetails(Long inventoryId) throws Throwable {
		
		InventoryViewModel invVModel=new InventoryViewModel();
		invVModel.setInventoryDefinition(daoManager.getInventoryDao().get(inventoryId));
		
		if(invVModel.getInventoryDefinition()!=null)
		{
			invVModel.setInventoryPricing(daoManager.getInventoryPricingDao().getInventoryPricingDetails(inventoryId));
			invVModel.setInventorySpecification(daoManager.getInventorySpecificationDao().getInventorySpecificationDetails(inventoryId));
			if(invVModel.getInventoryDefinition()==null)
			{
				InventoryPricing invPricing=new InventoryPricing();
				invPricing.setInventoryDefinition(invVModel.getInventoryDefinition());
				invVModel.setInventoryPricing(invPricing);
			}
			invVModel.setInventoryWarehouseDefault(daoManager.getInventoryWarehouseDefaultsDao().getInventoryWarehouseDefaultDetails(inventoryId));
			
			if(invVModel.getInventoryWarehouseDefault()==null)
			{
				InventoryWarehouseDefault invWarehouse=new InventoryWarehouseDefault();
				invWarehouse.setInventoryDefinition(invVModel.getInventoryDefinition());
				invVModel.setInventoryWarehouseDefault(invWarehouse);
			}
			invVModel.setUomConversion(daoManager.getUomConversionDao().getUomConversionDetails(inventoryId));
			if(invVModel.getUomConversion()==null)
			{
				UomConversion uomConversion=new UomConversion();
				uomConversion.setItemId(inventoryId);
				invVModel.setUomConversion(uomConversion);
			}
			invVModel.setInventorySpecification(daoManager.getInventorySpecificationDao().getInventorySpecificationDetails(inventoryId));
			if(invVModel.getInventorySpecification()==null)
			{
				InventorySpecification invSpec=new InventorySpecification();
				invSpec.setItemId(inventoryId);
				invVModel.setInventorySpecification(invSpec);
			}
			
			DocumentViewModel dmv = new DocumentViewModel();
			List<UserCode> userCodeList = daoManager.getUserCodeDao()
					.getUserCodeDetails(UserCodeKeys.InventoryRegistrationDocumentsUpload);
			List<Document> documentList = daoManager.getDocumentsDao().getDocumentsDetails(UserCodeKeys.InventoryRegistrationDocumentsUpload, inventoryId);
			
			for(Document d :documentList) {
				d.setUserCodeDesc(daoManager.getUserCodeDao().getUserCodeDetailsDesc(d.getUserCodeId()));
			}
			dmv.setReferenceId(inventoryId);
			dmv.setUploadView(true); // TODO: set based on role
			dmv.setDocumentCheckLists(userCodeList);
			dmv.setDocuments(documentList);
			invVModel.setDocumentViewModel(dmv);
		}
		
		return invVModel;
	}

	@Override
	public Map<Long, String> getInventoryDefinitionsMap() throws Throwable {
		return daoManager.getInventoryDao().getInventoryDefinitionsMap();
	}
}
