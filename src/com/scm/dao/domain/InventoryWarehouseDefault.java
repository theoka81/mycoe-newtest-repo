package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the InventoryWarehouseDefaults database table.
 * 
 */
@Entity
@Table(name="InventoryWarehouseDefaults")
@NamedQuery(name="InventoryWarehouseDefault.findAll", query="SELECT i FROM InventoryWarehouseDefault i")
public class InventoryWarehouseDefault implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="BuyerNumber", nullable=false)
	private Long buyerNumber;

	@Column(name="CheckAvailability", nullable=false)
	private Boolean checkAvailability;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="GradeControl")
	private String gradeControl;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemNo")
	private String itemNo;

	@Column(name="LastSupplierNumber", nullable=false)
	private Long lastSupplierNumber;

	@Column(name="LayerCodeSource")
	private String layerCodeSource;

	@Column(name="LayerSourceTypeId")
	private Long layerSourceTypeId;

	@Column(name="LineType")
	private String lineType;

	@Column(name="LineTypeId")
	private Long lineTypeId;

	@Column(name="LocationId")
	private Long locationId;

	@Column(name="LocationType")
	private String locationType;

	@Column(name="LotStatusCode")
	private String lotStatusCode;

	@Column(name="LotStatusTypeId")
	private Long lotStatusTypeId;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="PotencyControl")
	private String potencyControl;

	@Column(name="QualityBatchBestBefore")
	private String qualityBatchBestBefore;

	@Column(name="QualityBatchNo", nullable=false)
	private Long qualityBatchNo;

	@Column(name="QualityBatchReviewer")
	private String qualityBatchReviewer;

	@Column(name="QuaratineFlag")
	private String quaratineFlag;

	@Column(name="RebateCode")
	private String rebateCode;

	@Column(name="RebateTypeId")
	private Long rebateTypeId;

	@Column(name="ReorderPointInput", nullable=false)
	private Long reorderPointInput;

	@Column(name="ReorderQuantityInput", nullable=false)
	private Long reorderQuantityInput;

	@Column(name="ReorderQuantityMaximum", nullable=false)
	private Long reorderQuantityMaximum;

	@Column(name="ReorderQuantityMinimum", nullable=false)
	private Long reorderQuantityMinimum;

	@Column(name="SafetyStock", nullable=false)
	private Long safetyStock;

	@Column(name="ServiceLevel", nullable=false)
	private Long serviceLevel;

	@Column(name="ShelfLifeDays", nullable=false)
	private Long shelfLifeDays;

	@Column(name="ShippingConditionsCode")
	private String shippingConditionsCode;

	@Column(name="ShippingConditionsTypeId")
	private Long shippingConditionsTypeId;

	@Column(name="StockingType")
	private String stockingType;

	@Column(name="StockingTypeId")
	private Long stockingTypeId;

	@Column(name="WarehouseCode1")
	private Long warehouseCode1;

	@Column(name="WarehouseCode1Id")
	private Long warehouseCode1Id;

	@Column(name="WarehouseCode2")
	private Long warehouseCode2;

	@Column(name="WarehouseCode2Id")
	private Long warehouseCode2Id;

	@Column(name="WarehouseCode3")
	private Long warehouseCode3;

	@Column(name="WarehouseCode3Id")
	private Long warehouseCode3Id;

	//bi-directional many-to-one association to InventoryDefinition
	@ManyToOne
	@JoinColumn(name="ItemId")
	private InventoryDefinition inventoryDefinition;

	public InventoryWarehouseDefault() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBuyerNumber() {
		return this.buyerNumber;
	}

	public void setBuyerNumber(Long buyerNumber) {
		this.buyerNumber = buyerNumber;
	}

	public Boolean getCheckAvailability() {
		return this.checkAvailability;
	}

	public void setCheckAvailability(Boolean checkAvailability) {
		this.checkAvailability = checkAvailability;
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

	public String getGradeControl() {
		return this.gradeControl;
	}

	public void setGradeControl(String gradeControl) {
		this.gradeControl = gradeControl;
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

	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public Long getLastSupplierNumber() {
		return this.lastSupplierNumber;
	}

	public void setLastSupplierNumber(Long lastSupplierNumber) {
		this.lastSupplierNumber = lastSupplierNumber;
	}

	public String getLayerCodeSource() {
		return this.layerCodeSource;
	}

	public void setLayerCodeSource(String layerCodeSource) {
		this.layerCodeSource = layerCodeSource;
	}

	public Long getLayerSourceTypeId() {
		return this.layerSourceTypeId;
	}

	public void setLayerSourceTypeId(Long layerSourceTypeId) {
		this.layerSourceTypeId = layerSourceTypeId;
	}

	public String getLineType() {
		return this.lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	public Long getLineTypeId() {
		return this.lineTypeId;
	}

	public void setLineTypeId(Long lineTypeId) {
		this.lineTypeId = lineTypeId;
	}

	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getLocationType() {
		return this.locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getLotStatusCode() {
		return this.lotStatusCode;
	}

	public void setLotStatusCode(String lotStatusCode) {
		this.lotStatusCode = lotStatusCode;
	}

	public Long getLotStatusTypeId() {
		return this.lotStatusTypeId;
	}

	public void setLotStatusTypeId(Long lotStatusTypeId) {
		this.lotStatusTypeId = lotStatusTypeId;
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

	public String getPotencyControl() {
		return this.potencyControl;
	}

	public void setPotencyControl(String potencyControl) {
		this.potencyControl = potencyControl;
	}

	public String getQualityBatchBestBefore() {
		return this.qualityBatchBestBefore;
	}

	public void setQualityBatchBestBefore(String qualityBatchBestBefore) {
		this.qualityBatchBestBefore = qualityBatchBestBefore;
	}

	public Long getQualityBatchNo() {
		return this.qualityBatchNo;
	}

	public void setQualityBatchNo(Long qualityBatchNo) {
		this.qualityBatchNo = qualityBatchNo;
	}

	public String getQualityBatchReviewer() {
		return this.qualityBatchReviewer;
	}

	public void setQualityBatchReviewer(String qualityBatchReviewer) {
		this.qualityBatchReviewer = qualityBatchReviewer;
	}

	public String getQuaratineFlag() {
		return this.quaratineFlag;
	}

	public void setQuaratineFlag(String quaratineFlag) {
		this.quaratineFlag = quaratineFlag;
	}

	public String getRebateCode() {
		return this.rebateCode;
	}

	public void setRebateCode(String rebateCode) {
		this.rebateCode = rebateCode;
	}

	public Long getRebateTypeId() {
		return this.rebateTypeId;
	}

	public void setRebateTypeId(Long rebateTypeId) {
		this.rebateTypeId = rebateTypeId;
	}

	public Long getReorderPointInput() {
		return this.reorderPointInput;
	}

	public void setReorderPointInput(Long reorderPointInput) {
		this.reorderPointInput = reorderPointInput;
	}

	public Long getReorderQuantityInput() {
		return this.reorderQuantityInput;
	}

	public void setReorderQuantityInput(Long reorderQuantityInput) {
		this.reorderQuantityInput = reorderQuantityInput;
	}

	public Long getReorderQuantityMaximum() {
		return this.reorderQuantityMaximum;
	}

	public void setReorderQuantityMaximum(Long reorderQuantityMaximum) {
		this.reorderQuantityMaximum = reorderQuantityMaximum;
	}

	public Long getReorderQuantityMinimum() {
		return this.reorderQuantityMinimum;
	}

	public void setReorderQuantityMinimum(Long reorderQuantityMinimum) {
		this.reorderQuantityMinimum = reorderQuantityMinimum;
	}

	public Long getSafetyStock() {
		return this.safetyStock;
	}

	public void setSafetyStock(Long safetyStock) {
		this.safetyStock = safetyStock;
	}

	public Long getServiceLevel() {
		return this.serviceLevel;
	}

	public void setServiceLevel(Long serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public Long getShelfLifeDays() {
		return this.shelfLifeDays;
	}

	public void setShelfLifeDays(Long shelfLifeDays) {
		this.shelfLifeDays = shelfLifeDays;
	}

	public String getShippingConditionsCode() {
		return this.shippingConditionsCode;
	}

	public void setShippingConditionsCode(String shippingConditionsCode) {
		this.shippingConditionsCode = shippingConditionsCode;
	}

	public Long getShippingConditionsTypeId() {
		return this.shippingConditionsTypeId;
	}

	public void setShippingConditionsTypeId(Long shippingConditionsTypeId) {
		this.shippingConditionsTypeId = shippingConditionsTypeId;
	}

	public String getStockingType() {
		return this.stockingType;
	}

	public void setStockingType(String stockingType) {
		this.stockingType = stockingType;
	}

	public Long getStockingTypeId() {
		return this.stockingTypeId;
	}

	public void setStockingTypeId(Long stockingTypeId) {
		this.stockingTypeId = stockingTypeId;
	}

	public Long getWarehouseCode1() {
		return this.warehouseCode1;
	}

	public void setWarehouseCode1(Long warehouseCode1) {
		this.warehouseCode1 = warehouseCode1;
	}

	public Long getWarehouseCode1Id() {
		return this.warehouseCode1Id;
	}

	public void setWarehouseCode1Id(Long warehouseCode1Id) {
		this.warehouseCode1Id = warehouseCode1Id;
	}

	public Long getWarehouseCode2() {
		return this.warehouseCode2;
	}

	public void setWarehouseCode2(Long warehouseCode2) {
		this.warehouseCode2 = warehouseCode2;
	}

	public Long getWarehouseCode2Id() {
		return this.warehouseCode2Id;
	}

	public void setWarehouseCode2Id(Long warehouseCode2Id) {
		this.warehouseCode2Id = warehouseCode2Id;
	}

	public Long getWarehouseCode3() {
		return this.warehouseCode3;
	}

	public void setWarehouseCode3(Long warehouseCode3) {
		this.warehouseCode3 = warehouseCode3;
	}

	public Long getWarehouseCode3Id() {
		return this.warehouseCode3Id;
	}

	public void setWarehouseCode3Id(Long warehouseCode3Id) {
		this.warehouseCode3Id = warehouseCode3Id;
	}

	public InventoryDefinition getInventoryDefinition() {
		return this.inventoryDefinition;
	}

	public void setInventoryDefinition(InventoryDefinition inventoryDefinition) {
		this.inventoryDefinition = inventoryDefinition;
	}

}