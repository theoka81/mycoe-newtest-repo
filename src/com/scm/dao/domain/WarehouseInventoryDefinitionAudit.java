package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the WarehouseInventoryDefinitionAudits database table.
 * 
 */
@Entity
@Table(name="WarehouseInventoryDefinitionAudits")
@NamedQuery(name="WarehouseInventoryDefinitionAudit.findAll", query="SELECT w FROM WarehouseInventoryDefinitionAudit w")
public class WarehouseInventoryDefinitionAudit implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId", unique=true, nullable=false)
	private Long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="BuyerNumber")
	private Long buyerNumber;

	@Column(name="CheckAvailability", nullable=false)
	private Boolean checkAvailability;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="GradeControl")
	private String gradeControl;

	@Column(name="Id", nullable=false)
	private Long id;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemId")
	private Long itemId;

	@Column(name="ItemNo")
	private String itemNo;

	@Column(name="LastSupplierNumber")
	private Long lastSupplierNumber;

	@Column(name="LayerCodeSource")
	private String layerCodeSource;

	@Column(name="LineType")
	private String lineType;

	@Column(name="LotStatusCode")
	private String lotStatusCode;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="PotencyControl")
	private String potencyControl;

	@Column(name="QualityBatchBestBefore")
	private String qualityBatchBestBefore;

	@Column(name="QualityBatchNo")
	private Long qualityBatchNo;

	@Column(name="QualityBatchReviewer")
	private String qualityBatchReviewer;

	@Column(name="QuaratineFlag")
	private String quaratineFlag;

	@Column(name="RebateCode")
	private Long rebateCode;

	@Column(name="ReorderPointInput")
	private Long reorderPointInput;

	@Column(name="ReorderQuantityInput")
	private Long reorderQuantityInput;

	@Column(name="ReorderQuantityMaximum")
	private Long reorderQuantityMaximum;

	@Column(name="ReorderQuantityMinimum")
	private Long reorderQuantityMinimum;

	@Column(name="SafetyStock")
	private Long safetyStock;

	@Column(name="ServiceLevel")
	private Long serviceLevel;

	@Column(name="ShelfLifeDays")
	private Long shelfLifeDays;

	@Column(name="ShippingConditionsCode")
	private String shippingConditionsCode;

	@Column(name="StockingType")
	private String stockingType;

	@Column(name="SystemUserId")
	private Long systemUserId;

	@Column(name="WarehouseCode1")
	private Long warehouseCode1;

	@Column(name="WarehouseCode2")
	private Long warehouseCode2;

	@Column(name="WarehouseCode3")
	private Long warehouseCode3;

	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="LocationId")
	private Location location;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="GradeControlId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="LayerCodeSourceId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="LineTypeId")
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="LotStatusCodeId")
	private UserCode userCode4;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="PotencyControlId")
	private UserCode userCode5;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="RebateCodeId")
	private UserCode userCode6;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ServiceLevelId")
	private UserCode userCode7;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ShippingConditionsCodeId")
	private UserCode userCode8;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StockingTypeId")
	private UserCode userCode9;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="WarehouseCode1Id")
	private UserCode userCode10;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="WarehouseCode2Id")
	private UserCode userCode11;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="WarehouseCode3Id")
	private UserCode userCode12;

	//bi-directional many-to-one association to WarehouseDetail
	@ManyToOne
	@JoinColumn(name="WarehouseId")
	private WarehouseDetail warehouseDetail;

	public WarehouseInventoryDefinitionAudit() {
	}

	public Long getAuditId() {
		return this.auditId;
	}

	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
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

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getGradeControl() {
		return this.gradeControl;
	}

	public void setGradeControl(String gradeControl) {
		this.gradeControl = gradeControl;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getLineType() {
		return this.lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	public String getLotStatusCode() {
		return this.lotStatusCode;
	}

	public void setLotStatusCode(String lotStatusCode) {
		this.lotStatusCode = lotStatusCode;
	}

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
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

	public Long getRebateCode() {
		return this.rebateCode;
	}

	public void setRebateCode(Long rebateCode) {
		this.rebateCode = rebateCode;
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

	public String getStockingType() {
		return this.stockingType;
	}

	public void setStockingType(String stockingType) {
		this.stockingType = stockingType;
	}

	public Long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public Long getWarehouseCode1() {
		return this.warehouseCode1;
	}

	public void setWarehouseCode1(Long warehouseCode1) {
		this.warehouseCode1 = warehouseCode1;
	}

	public Long getWarehouseCode2() {
		return this.warehouseCode2;
	}

	public void setWarehouseCode2(Long warehouseCode2) {
		this.warehouseCode2 = warehouseCode2;
	}

	public Long getWarehouseCode3() {
		return this.warehouseCode3;
	}

	public void setWarehouseCode3(Long warehouseCode3) {
		this.warehouseCode3 = warehouseCode3;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public SystemUser getSystemUser1() {
		return this.systemUser1;
	}

	public void setSystemUser1(SystemUser systemUser1) {
		this.systemUser1 = systemUser1;
	}

	public SystemUser getSystemUser2() {
		return this.systemUser2;
	}

	public void setSystemUser2(SystemUser systemUser2) {
		this.systemUser2 = systemUser2;
	}

	public UserCode getUserCode1() {
		return this.userCode1;
	}

	public void setUserCode1(UserCode userCode1) {
		this.userCode1 = userCode1;
	}

	public UserCode getUserCode2() {
		return this.userCode2;
	}

	public void setUserCode2(UserCode userCode2) {
		this.userCode2 = userCode2;
	}

	public UserCode getUserCode3() {
		return this.userCode3;
	}

	public void setUserCode3(UserCode userCode3) {
		this.userCode3 = userCode3;
	}

	public UserCode getUserCode4() {
		return this.userCode4;
	}

	public void setUserCode4(UserCode userCode4) {
		this.userCode4 = userCode4;
	}

	public UserCode getUserCode5() {
		return this.userCode5;
	}

	public void setUserCode5(UserCode userCode5) {
		this.userCode5 = userCode5;
	}

	public UserCode getUserCode6() {
		return this.userCode6;
	}

	public void setUserCode6(UserCode userCode6) {
		this.userCode6 = userCode6;
	}

	public UserCode getUserCode7() {
		return this.userCode7;
	}

	public void setUserCode7(UserCode userCode7) {
		this.userCode7 = userCode7;
	}

	public UserCode getUserCode8() {
		return this.userCode8;
	}

	public void setUserCode8(UserCode userCode8) {
		this.userCode8 = userCode8;
	}

	public UserCode getUserCode9() {
		return this.userCode9;
	}

	public void setUserCode9(UserCode userCode9) {
		this.userCode9 = userCode9;
	}

	public UserCode getUserCode10() {
		return this.userCode10;
	}

	public void setUserCode10(UserCode userCode10) {
		this.userCode10 = userCode10;
	}

	public UserCode getUserCode11() {
		return this.userCode11;
	}

	public void setUserCode11(UserCode userCode11) {
		this.userCode11 = userCode11;
	}

	public UserCode getUserCode12() {
		return this.userCode12;
	}

	public void setUserCode12(UserCode userCode12) {
		this.userCode12 = userCode12;
	}

	public WarehouseDetail getWarehouseDetail() {
		return this.warehouseDetail;
	}

	public void setWarehouseDetail(WarehouseDetail warehouseDetail) {
		this.warehouseDetail = warehouseDetail;
	}

}