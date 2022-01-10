package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the InventoryDefinitionWorks database table.
 * 
 */
@Entity
@Table(name="InventoryDefinitionWorks")
@NamedQuery(name="InventoryDefinitionWork.findAll", query="SELECT i FROM InventoryDefinitionWork i")
public class InventoryDefinitionWork implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="BarcodeNo")
	private String barcodeNo;

	@Column(name="BuyerNo")
	private Long buyerNo;

	@Column(name="CarrierNo")
	private Long carrierNo;

	@Column(name="CategoryGl")
	private String categoryGl;

	@Column(name="CategoryGlId")
	private Long categoryGlId;

	@Column(name="CommissionCategory")
	private String commissionCategory;

	@Column(name="CommissionCategoryId")
	private Long commissionCategoryId;

	@Column(name="CommodityClass")
	private String commodityClass;

	@Column(name="CommodityClassId")
	private Long commodityClassId;

	@Column(name="CommodityCode")
	private String commodityCode;

	@Column(name="CommodityCodeId")
	private Long commodityCodeId;

	@Column(name="CommoditySubClass")
	private String commoditySubClass;

	@Column(name="CommoditySubClassId")
	private Long commoditySubClassId;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="CycleCountCategory")
	private String cycleCountCategory;

	@Column(name="CycleCountCategoryId")
	private Long cycleCountCategoryId;

	@Column(name="DaysShelfLifeDays")
	private Long daysShelfLifeDays;

	@Column(name="DrawingNo")
	private Long drawingNo;

	@Column(name="FamilySection")
	private String familySection;

	@Column(name="FamilySectionId")
	private Long familySectionId;

	@Column(name="FifoProcessing")
	private String fifoProcessing;

	@Column(name="FifoProcessingId")
	private Long fifoProcessingId;

	@Column(name="ImageLinkPath")
	private String imageLinkPath;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemCode1")
	private String itemCode1;

	@Column(name="ItemCode2")
	private String itemCode2;

	@Column(name="ItemCode3")
	private String itemCode3;

	@Column(name="ItemCode4")
	private String itemCode4;

	@Column(name="ItemCode5")
	private String itemCode5;

	@Column(name="ItemCode6")
	private String itemCode6;

	@Column(name="ItemCode7")
	private String itemCode7;

	@Column(name="ItemCode8")
	private String itemCode8;

	@Column(name="ItemCodeId1")
	private Long itemCodeId1;

	@Column(name="ItemCodeId2")
	private Long itemCodeId2;

	@Column(name="ItemCodeId3")
	private Long itemCodeId3;

	@Column(name="ItemCodeId4")
	private Long itemCodeId4;

	@Column(name="ItemCodeId5")
	private Long itemCodeId5;

	@Column(name="ItemCodeId6")
	private Long itemCodeId6;

	@Column(name="ItemCodeId7")
	private Long itemCodeId7;

	@Column(name="ItemCodeId8")
	private Long itemCodeId8;

	@Column(name="ItemDescription")
	private String itemDescription;

	@Column(name="ItemDimensionHeight")
	private Long itemDimensionHeight;

	@Column(name="ItemDimensionLength")
	private Long itemDimensionLength;

	@Column(name="ItemDimensionVolume")
	private Long itemDimensionVolume;

	@Column(name="ItemDimensionWidth")
	private Long itemDimensionWidth;

	@Column(name="ItemId")
	private Long itemId;

	@Column(name="ItemNo")
	private String itemNo;

	@Column(name="ItemStatus")
	private String itemStatus;

	@Column(name="ItemStatusId")
	private Long itemStatusId;

	@Column(name="ItemTemperaturePreferredFrom")
	private Long itemTemperaturePreferredFrom;

	@Column(name="ItemTemperaturePreferredFromId")
	private Long itemTemperaturePreferredFromId;

	@Column(name="ItemTemperaturePreferredTo")
	private Long itemTemperaturePreferredTo;

	@Column(name="ItemTemperaturePreferredToId")
	private Long itemTemperaturePreferredToId;

	@Column(name="ItemXRef1")
	private String itemXRef1;

	@Column(name="ItemXRef2")
	private String itemXRef2;

	@Column(name="ItemXRef3")
	private String itemXRef3;

	@Column(name="ItemXRef4")
	private String itemXRef4;

	@Column(name="ItemXRef5")
	private String itemXRef5;

	@Column(name="LastInvoiceEffectiveDate")
	private Timestamp lastInvoiceEffectiveDate;

	@Column(name="LastInvoiceUnitPrice", precision=18, scale=2)
	private BigDecimal lastInvoiceUnitPrice;

	@Column(name="LastInvoiceUom")
	private String lastInvoiceUom;

	@Column(name="LotStatusCode")
	private Long lotStatusCode;

	@Column(name="LotStatusCodeId")
	private Long lotStatusCodeId;

	@Column(name="MethodKitConfiguratorPricing")
	private String methodKitConfiguratorPricing;

	@Column(name="MethodKitConfiguratorPricingId")
	private Long methodKitConfiguratorPricingId;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="MscoaItemSegment")
	private String mscoaItemSegment;

	@Column(name="MscoaItemSegmentId")
	private Long mscoaItemSegmentId;

	@Column(name="OriginalId", nullable=false)
	private Long originalId;

	@Column(name="PlanningCode")
	private String planningCode;

	@Column(name="PlanningCodeId")
	private Long planningCodeId;

	@Column(name="PreferredCarrier")
	private String preferredCarrier;

	@Column(name="ProductFamily")
	private String productFamily;

	@Column(name="ProductFamilyId")
	private Long productFamilyId;

	@Column(name="ProductGroup")
	private String productGroup;

	@Column(name="ProductGroupId")
	private Long productGroupId;

	@Column(name="ProductLine")
	private String productLine;

	@Column(name="ProductLineId")
	private Long productLineId;

	@Column(name="ProvincialContract")
	private String provincialContract;

	private String QRCode;

	@Column(name="SerialNoRequired")
	private String serialNoRequired;

	@Column(name="SerialNoRequiredId")
	private Long serialNoRequiredId;

	@Column(name="ShippingCommodityClass")
	private String shippingCommodityClass;

	@Column(name="ShippingCommodityClassId")
	private Long shippingCommodityClassId;

	@Column(name="ShippingConditionsCode")
	private String shippingConditionsCode;

	@Column(name="ShippingConditionsCodeId")
	private Long shippingConditionsCodeId;

	@Column(name="ShortDescription")
	private String shortDescription;

	@Column(name="StandardAgreementTemplateId")
	private Long standardAgreementTemplateId;

	@Column(name="StockingType")
	private String stockingType;

	@Column(name="StockTypeId")
	private Long stockTypeId;

	@Column(name="TakeOnIndicator")
	private Boolean takeOnIndicator;

	@Column(name="TypeWarranty")
	private String typeWarranty;

	@Column(name="TypeWarrantyId")
	private Long typeWarrantyId;

	@Column(name="UomComponent")
	private String uomComponent;

	@Column(name="UomComponentId")
	private Long uomComponentId;

	@Column(name="UomPricing")
	private String uomPricing;

	@Column(name="UomPricingId")
	private Long uomPricingId;

	@Column(name="UomPrimary")
	private String uomPrimary;

	@Column(name="UomPrimaryId")
	private Long uomPrimaryId;

	@Column(name="UomProduction")
	private String uomProduction;

	@Column(name="UomProductionId")
	private Long uomProductionId;

	@Column(name="UomPurchasing")
	private String uomPurchasing;

	@Column(name="UomPurchasingId")
	private Long uomPurchasingId;

	@Column(name="UomSecondary")
	private String uomSecondary;

	@Column(name="UomSecondaryId")
	private Long uomSecondaryId;

	@Column(name="UomShipping")
	private String uomShipping;

	@Column(name="UomShippingId")
	private Long uomShippingId;

	@Column(name="UomStocking")
	private String uomStocking;

	@Column(name="UomStockingId")
	private Long uomStockingId;

	@Column(name="UomVolume")
	private String uomVolume;

	@Column(name="UomVolumeId")
	private Long uomVolumeId;

	@Column(name="UomVolumeorWeight")
	private String uomVolumeorWeight;

	@Column(name="UomVolumeorWeightId")
	private Long uomVolumeorWeightId;

	@Column(name="UomWeight")
	private String uomWeight;

	@Column(name="UomWeightId")
	private Long uomWeightId;

	@Column(name="VatIndicator")
	private String vatIndicator;

	@Column(name="VatIndicatorId")
	private Long vatIndicatorId;

	public InventoryDefinitionWork() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBarcodeNo() {
		return this.barcodeNo;
	}

	public void setBarcodeNo(String barcodeNo) {
		this.barcodeNo = barcodeNo;
	}

	public Long getBuyerNo() {
		return this.buyerNo;
	}

	public void setBuyerNo(Long buyerNo) {
		this.buyerNo = buyerNo;
	}

	public Long getCarrierNo() {
		return this.carrierNo;
	}

	public void setCarrierNo(Long carrierNo) {
		this.carrierNo = carrierNo;
	}

	public String getCategoryGl() {
		return this.categoryGl;
	}

	public void setCategoryGl(String categoryGl) {
		this.categoryGl = categoryGl;
	}

	public Long getCategoryGlId() {
		return this.categoryGlId;
	}

	public void setCategoryGlId(Long categoryGlId) {
		this.categoryGlId = categoryGlId;
	}

	public String getCommissionCategory() {
		return this.commissionCategory;
	}

	public void setCommissionCategory(String commissionCategory) {
		this.commissionCategory = commissionCategory;
	}

	public Long getCommissionCategoryId() {
		return this.commissionCategoryId;
	}

	public void setCommissionCategoryId(Long commissionCategoryId) {
		this.commissionCategoryId = commissionCategoryId;
	}

	public String getCommodityClass() {
		return this.commodityClass;
	}

	public void setCommodityClass(String commodityClass) {
		this.commodityClass = commodityClass;
	}

	public Long getCommodityClassId() {
		return this.commodityClassId;
	}

	public void setCommodityClassId(Long commodityClassId) {
		this.commodityClassId = commodityClassId;
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public Long getCommodityCodeId() {
		return this.commodityCodeId;
	}

	public void setCommodityCodeId(Long commodityCodeId) {
		this.commodityCodeId = commodityCodeId;
	}

	public String getCommoditySubClass() {
		return this.commoditySubClass;
	}

	public void setCommoditySubClass(String commoditySubClass) {
		this.commoditySubClass = commoditySubClass;
	}

	public Long getCommoditySubClassId() {
		return this.commoditySubClassId;
	}

	public void setCommoditySubClassId(Long commoditySubClassId) {
		this.commoditySubClassId = commoditySubClassId;
	}

	public Long getCreatedBySystemUserId() {
		return this.createdBySystemUserId;
	}

	public void setCreatedBySystemUserId(Long createdBySystemUserId) {
		this.createdBySystemUserId = createdBySystemUserId;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCycleCountCategory() {
		return this.cycleCountCategory;
	}

	public void setCycleCountCategory(String cycleCountCategory) {
		this.cycleCountCategory = cycleCountCategory;
	}

	public Long getCycleCountCategoryId() {
		return this.cycleCountCategoryId;
	}

	public void setCycleCountCategoryId(Long cycleCountCategoryId) {
		this.cycleCountCategoryId = cycleCountCategoryId;
	}

	public Long getDaysShelfLifeDays() {
		return this.daysShelfLifeDays;
	}

	public void setDaysShelfLifeDays(Long daysShelfLifeDays) {
		this.daysShelfLifeDays = daysShelfLifeDays;
	}

	public Long getDrawingNo() {
		return this.drawingNo;
	}

	public void setDrawingNo(Long drawingNo) {
		this.drawingNo = drawingNo;
	}

	public String getFamilySection() {
		return this.familySection;
	}

	public void setFamilySection(String familySection) {
		this.familySection = familySection;
	}

	public Long getFamilySectionId() {
		return this.familySectionId;
	}

	public void setFamilySectionId(Long familySectionId) {
		this.familySectionId = familySectionId;
	}

	public String getFifoProcessing() {
		return this.fifoProcessing;
	}

	public void setFifoProcessing(String fifoProcessing) {
		this.fifoProcessing = fifoProcessing;
	}

	public Long getFifoProcessingId() {
		return this.fifoProcessingId;
	}

	public void setFifoProcessingId(Long fifoProcessingId) {
		this.fifoProcessingId = fifoProcessingId;
	}

	public String getImageLinkPath() {
		return this.imageLinkPath;
	}

	public void setImageLinkPath(String imageLinkPath) {
		this.imageLinkPath = imageLinkPath;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public String getItemCode1() {
		return this.itemCode1;
	}

	public void setItemCode1(String itemCode1) {
		this.itemCode1 = itemCode1;
	}

	public String getItemCode2() {
		return this.itemCode2;
	}

	public void setItemCode2(String itemCode2) {
		this.itemCode2 = itemCode2;
	}

	public String getItemCode3() {
		return this.itemCode3;
	}

	public void setItemCode3(String itemCode3) {
		this.itemCode3 = itemCode3;
	}

	public String getItemCode4() {
		return this.itemCode4;
	}

	public void setItemCode4(String itemCode4) {
		this.itemCode4 = itemCode4;
	}

	public String getItemCode5() {
		return this.itemCode5;
	}

	public void setItemCode5(String itemCode5) {
		this.itemCode5 = itemCode5;
	}

	public String getItemCode6() {
		return this.itemCode6;
	}

	public void setItemCode6(String itemCode6) {
		this.itemCode6 = itemCode6;
	}

	public String getItemCode7() {
		return this.itemCode7;
	}

	public void setItemCode7(String itemCode7) {
		this.itemCode7 = itemCode7;
	}

	public String getItemCode8() {
		return this.itemCode8;
	}

	public void setItemCode8(String itemCode8) {
		this.itemCode8 = itemCode8;
	}

	public Long getItemCodeId1() {
		return this.itemCodeId1;
	}

	public void setItemCodeId1(Long itemCodeId1) {
		this.itemCodeId1 = itemCodeId1;
	}

	public Long getItemCodeId2() {
		return this.itemCodeId2;
	}

	public void setItemCodeId2(Long itemCodeId2) {
		this.itemCodeId2 = itemCodeId2;
	}

	public Long getItemCodeId3() {
		return this.itemCodeId3;
	}

	public void setItemCodeId3(Long itemCodeId3) {
		this.itemCodeId3 = itemCodeId3;
	}

	public Long getItemCodeId4() {
		return this.itemCodeId4;
	}

	public void setItemCodeId4(Long itemCodeId4) {
		this.itemCodeId4 = itemCodeId4;
	}

	public Long getItemCodeId5() {
		return this.itemCodeId5;
	}

	public void setItemCodeId5(Long itemCodeId5) {
		this.itemCodeId5 = itemCodeId5;
	}

	public Long getItemCodeId6() {
		return this.itemCodeId6;
	}

	public void setItemCodeId6(Long itemCodeId6) {
		this.itemCodeId6 = itemCodeId6;
	}

	public Long getItemCodeId7() {
		return this.itemCodeId7;
	}

	public void setItemCodeId7(Long itemCodeId7) {
		this.itemCodeId7 = itemCodeId7;
	}

	public Long getItemCodeId8() {
		return this.itemCodeId8;
	}

	public void setItemCodeId8(Long itemCodeId8) {
		this.itemCodeId8 = itemCodeId8;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Long getItemDimensionHeight() {
		return this.itemDimensionHeight;
	}

	public void setItemDimensionHeight(Long itemDimensionHeight) {
		this.itemDimensionHeight = itemDimensionHeight;
	}

	public Long getItemDimensionLength() {
		return this.itemDimensionLength;
	}

	public void setItemDimensionLength(Long itemDimensionLength) {
		this.itemDimensionLength = itemDimensionLength;
	}

	public Long getItemDimensionVolume() {
		return this.itemDimensionVolume;
	}

	public void setItemDimensionVolume(Long itemDimensionVolume) {
		this.itemDimensionVolume = itemDimensionVolume;
	}

	public Long getItemDimensionWidth() {
		return this.itemDimensionWidth;
	}

	public void setItemDimensionWidth(Long itemDimensionWidth) {
		this.itemDimensionWidth = itemDimensionWidth;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemStatus() {
		return this.itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public Long getItemStatusId() {
		return this.itemStatusId;
	}

	public void setItemStatusId(Long itemStatusId) {
		this.itemStatusId = itemStatusId;
	}

	public Long getItemTemperaturePreferredFrom() {
		return this.itemTemperaturePreferredFrom;
	}

	public void setItemTemperaturePreferredFrom(Long itemTemperaturePreferredFrom) {
		this.itemTemperaturePreferredFrom = itemTemperaturePreferredFrom;
	}

	public Long getItemTemperaturePreferredFromId() {
		return this.itemTemperaturePreferredFromId;
	}

	public void setItemTemperaturePreferredFromId(Long itemTemperaturePreferredFromId) {
		this.itemTemperaturePreferredFromId = itemTemperaturePreferredFromId;
	}

	public Long getItemTemperaturePreferredTo() {
		return this.itemTemperaturePreferredTo;
	}

	public void setItemTemperaturePreferredTo(Long itemTemperaturePreferredTo) {
		this.itemTemperaturePreferredTo = itemTemperaturePreferredTo;
	}

	public Long getItemTemperaturePreferredToId() {
		return this.itemTemperaturePreferredToId;
	}

	public void setItemTemperaturePreferredToId(Long itemTemperaturePreferredToId) {
		this.itemTemperaturePreferredToId = itemTemperaturePreferredToId;
	}

	public String getItemXRef1() {
		return this.itemXRef1;
	}

	public void setItemXRef1(String itemXRef1) {
		this.itemXRef1 = itemXRef1;
	}

	public String getItemXRef2() {
		return this.itemXRef2;
	}

	public void setItemXRef2(String itemXRef2) {
		this.itemXRef2 = itemXRef2;
	}

	public String getItemXRef3() {
		return this.itemXRef3;
	}

	public void setItemXRef3(String itemXRef3) {
		this.itemXRef3 = itemXRef3;
	}

	public String getItemXRef4() {
		return this.itemXRef4;
	}

	public void setItemXRef4(String itemXRef4) {
		this.itemXRef4 = itemXRef4;
	}

	public String getItemXRef5() {
		return this.itemXRef5;
	}

	public void setItemXRef5(String itemXRef5) {
		this.itemXRef5 = itemXRef5;
	}

	public Timestamp getLastInvoiceEffectiveDate() {
		return this.lastInvoiceEffectiveDate;
	}

	public void setLastInvoiceEffectiveDate(Timestamp lastInvoiceEffectiveDate) {
		this.lastInvoiceEffectiveDate = lastInvoiceEffectiveDate;
	}

	public BigDecimal getLastInvoiceUnitPrice() {
		return this.lastInvoiceUnitPrice;
	}

	public void setLastInvoiceUnitPrice(BigDecimal lastInvoiceUnitPrice) {
		this.lastInvoiceUnitPrice = lastInvoiceUnitPrice;
	}

	public String getLastInvoiceUom() {
		return this.lastInvoiceUom;
	}

	public void setLastInvoiceUom(String lastInvoiceUom) {
		this.lastInvoiceUom = lastInvoiceUom;
	}

	public Long getLotStatusCode() {
		return this.lotStatusCode;
	}

	public void setLotStatusCode(Long lotStatusCode) {
		this.lotStatusCode = lotStatusCode;
	}

	public Long getLotStatusCodeId() {
		return this.lotStatusCodeId;
	}

	public void setLotStatusCodeId(Long lotStatusCodeId) {
		this.lotStatusCodeId = lotStatusCodeId;
	}

	public String getMethodKitConfiguratorPricing() {
		return this.methodKitConfiguratorPricing;
	}

	public void setMethodKitConfiguratorPricing(String methodKitConfiguratorPricing) {
		this.methodKitConfiguratorPricing = methodKitConfiguratorPricing;
	}

	public Long getMethodKitConfiguratorPricingId() {
		return this.methodKitConfiguratorPricingId;
	}

	public void setMethodKitConfiguratorPricingId(Long methodKitConfiguratorPricingId) {
		this.methodKitConfiguratorPricingId = methodKitConfiguratorPricingId;
	}

	public Long getModifiedBySystemUserId() {
		return this.modifiedBySystemUserId;
	}

	public void setModifiedBySystemUserId(Long modifiedBySystemUserId) {
		this.modifiedBySystemUserId = modifiedBySystemUserId;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getMscoaItemSegment() {
		return this.mscoaItemSegment;
	}

	public void setMscoaItemSegment(String mscoaItemSegment) {
		this.mscoaItemSegment = mscoaItemSegment;
	}

	public Long getMscoaItemSegmentId() {
		return this.mscoaItemSegmentId;
	}

	public void setMscoaItemSegmentId(Long mscoaItemSegmentId) {
		this.mscoaItemSegmentId = mscoaItemSegmentId;
	}

	public Long getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(Long originalId) {
		this.originalId = originalId;
	}

	public String getPlanningCode() {
		return this.planningCode;
	}

	public void setPlanningCode(String planningCode) {
		this.planningCode = planningCode;
	}

	public Long getPlanningCodeId() {
		return this.planningCodeId;
	}

	public void setPlanningCodeId(Long planningCodeId) {
		this.planningCodeId = planningCodeId;
	}

	public String getPreferredCarrier() {
		return this.preferredCarrier;
	}

	public void setPreferredCarrier(String preferredCarrier) {
		this.preferredCarrier = preferredCarrier;
	}

	public String getProductFamily() {
		return this.productFamily;
	}

	public void setProductFamily(String productFamily) {
		this.productFamily = productFamily;
	}

	public Long getProductFamilyId() {
		return this.productFamilyId;
	}

	public void setProductFamilyId(Long productFamilyId) {
		this.productFamilyId = productFamilyId;
	}

	public String getProductGroup() {
		return this.productGroup;
	}

	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	public Long getProductGroupId() {
		return this.productGroupId;
	}

	public void setProductGroupId(Long productGroupId) {
		this.productGroupId = productGroupId;
	}

	public String getProductLine() {
		return this.productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public Long getProductLineId() {
		return this.productLineId;
	}

	public void setProductLineId(Long productLineId) {
		this.productLineId = productLineId;
	}

	public String getProvincialContract() {
		return this.provincialContract;
	}

	public void setProvincialContract(String provincialContract) {
		this.provincialContract = provincialContract;
	}

	public String getQRCode() {
		return this.QRCode;
	}

	public void setQRCode(String QRCode) {
		this.QRCode = QRCode;
	}

	public String getSerialNoRequired() {
		return this.serialNoRequired;
	}

	public void setSerialNoRequired(String serialNoRequired) {
		this.serialNoRequired = serialNoRequired;
	}

	public Long getSerialNoRequiredId() {
		return this.serialNoRequiredId;
	}

	public void setSerialNoRequiredId(Long serialNoRequiredId) {
		this.serialNoRequiredId = serialNoRequiredId;
	}

	public String getShippingCommodityClass() {
		return this.shippingCommodityClass;
	}

	public void setShippingCommodityClass(String shippingCommodityClass) {
		this.shippingCommodityClass = shippingCommodityClass;
	}

	public Long getShippingCommodityClassId() {
		return this.shippingCommodityClassId;
	}

	public void setShippingCommodityClassId(Long shippingCommodityClassId) {
		this.shippingCommodityClassId = shippingCommodityClassId;
	}

	public String getShippingConditionsCode() {
		return this.shippingConditionsCode;
	}

	public void setShippingConditionsCode(String shippingConditionsCode) {
		this.shippingConditionsCode = shippingConditionsCode;
	}

	public Long getShippingConditionsCodeId() {
		return this.shippingConditionsCodeId;
	}

	public void setShippingConditionsCodeId(Long shippingConditionsCodeId) {
		this.shippingConditionsCodeId = shippingConditionsCodeId;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Long getStandardAgreementTemplateId() {
		return this.standardAgreementTemplateId;
	}

	public void setStandardAgreementTemplateId(Long standardAgreementTemplateId) {
		this.standardAgreementTemplateId = standardAgreementTemplateId;
	}

	public String getStockingType() {
		return this.stockingType;
	}

	public void setStockingType(String stockingType) {
		this.stockingType = stockingType;
	}

	public Long getStockTypeId() {
		return this.stockTypeId;
	}

	public void setStockTypeId(Long stockTypeId) {
		this.stockTypeId = stockTypeId;
	}

	public Boolean getTakeOnIndicator() {
		return this.takeOnIndicator;
	}

	public void setTakeOnIndicator(Boolean takeOnIndicator) {
		this.takeOnIndicator = takeOnIndicator;
	}

	public String getTypeWarranty() {
		return this.typeWarranty;
	}

	public void setTypeWarranty(String typeWarranty) {
		this.typeWarranty = typeWarranty;
	}

	public Long getTypeWarrantyId() {
		return this.typeWarrantyId;
	}

	public void setTypeWarrantyId(Long typeWarrantyId) {
		this.typeWarrantyId = typeWarrantyId;
	}

	public String getUomComponent() {
		return this.uomComponent;
	}

	public void setUomComponent(String uomComponent) {
		this.uomComponent = uomComponent;
	}

	public Long getUomComponentId() {
		return this.uomComponentId;
	}

	public void setUomComponentId(Long uomComponentId) {
		this.uomComponentId = uomComponentId;
	}

	public String getUomPricing() {
		return this.uomPricing;
	}

	public void setUomPricing(String uomPricing) {
		this.uomPricing = uomPricing;
	}

	public Long getUomPricingId() {
		return this.uomPricingId;
	}

	public void setUomPricingId(Long uomPricingId) {
		this.uomPricingId = uomPricingId;
	}

	public String getUomPrimary() {
		return this.uomPrimary;
	}

	public void setUomPrimary(String uomPrimary) {
		this.uomPrimary = uomPrimary;
	}

	public Long getUomPrimaryId() {
		return this.uomPrimaryId;
	}

	public void setUomPrimaryId(Long uomPrimaryId) {
		this.uomPrimaryId = uomPrimaryId;
	}

	public String getUomProduction() {
		return this.uomProduction;
	}

	public void setUomProduction(String uomProduction) {
		this.uomProduction = uomProduction;
	}

	public Long getUomProductionId() {
		return this.uomProductionId;
	}

	public void setUomProductionId(Long uomProductionId) {
		this.uomProductionId = uomProductionId;
	}

	public String getUomPurchasing() {
		return this.uomPurchasing;
	}

	public void setUomPurchasing(String uomPurchasing) {
		this.uomPurchasing = uomPurchasing;
	}

	public Long getUomPurchasingId() {
		return this.uomPurchasingId;
	}

	public void setUomPurchasingId(Long uomPurchasingId) {
		this.uomPurchasingId = uomPurchasingId;
	}

	public String getUomSecondary() {
		return this.uomSecondary;
	}

	public void setUomSecondary(String uomSecondary) {
		this.uomSecondary = uomSecondary;
	}

	public Long getUomSecondaryId() {
		return this.uomSecondaryId;
	}

	public void setUomSecondaryId(Long uomSecondaryId) {
		this.uomSecondaryId = uomSecondaryId;
	}

	public String getUomShipping() {
		return this.uomShipping;
	}

	public void setUomShipping(String uomShipping) {
		this.uomShipping = uomShipping;
	}

	public Long getUomShippingId() {
		return this.uomShippingId;
	}

	public void setUomShippingId(Long uomShippingId) {
		this.uomShippingId = uomShippingId;
	}

	public String getUomStocking() {
		return this.uomStocking;
	}

	public void setUomStocking(String uomStocking) {
		this.uomStocking = uomStocking;
	}

	public Long getUomStockingId() {
		return this.uomStockingId;
	}

	public void setUomStockingId(Long uomStockingId) {
		this.uomStockingId = uomStockingId;
	}

	public String getUomVolume() {
		return this.uomVolume;
	}

	public void setUomVolume(String uomVolume) {
		this.uomVolume = uomVolume;
	}

	public Long getUomVolumeId() {
		return this.uomVolumeId;
	}

	public void setUomVolumeId(Long uomVolumeId) {
		this.uomVolumeId = uomVolumeId;
	}

	public String getUomVolumeorWeight() {
		return this.uomVolumeorWeight;
	}

	public void setUomVolumeorWeight(String uomVolumeorWeight) {
		this.uomVolumeorWeight = uomVolumeorWeight;
	}

	public Long getUomVolumeorWeightId() {
		return this.uomVolumeorWeightId;
	}

	public void setUomVolumeorWeightId(Long uomVolumeorWeightId) {
		this.uomVolumeorWeightId = uomVolumeorWeightId;
	}

	public String getUomWeight() {
		return this.uomWeight;
	}

	public void setUomWeight(String uomWeight) {
		this.uomWeight = uomWeight;
	}

	public Long getUomWeightId() {
		return this.uomWeightId;
	}

	public void setUomWeightId(Long uomWeightId) {
		this.uomWeightId = uomWeightId;
	}

	public String getVatIndicator() {
		return this.vatIndicator;
	}

	public void setVatIndicator(String vatIndicator) {
		this.vatIndicator = vatIndicator;
	}

	public Long getVatIndicatorId() {
		return this.vatIndicatorId;
	}

	public void setVatIndicatorId(Long vatIndicatorId) {
		this.vatIndicatorId = vatIndicatorId;
	}

}