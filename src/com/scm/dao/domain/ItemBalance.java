package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ItemBalances database table.
 * 
 */
@Entity
@Table(name="ItemBalances")
@NamedQuery(name="ItemBalance.findAll", query="SELECT i FROM ItemBalance i")
public class ItemBalance implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CategoryGl")
	private String categoryGl;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="CriticalHoldFlag")
	private String criticalHoldFlag;

	@Column(name="DateLastReceipt", nullable=false)
	private Timestamp dateLastReceipt;

	@Column(name="DateNextCount", nullable=false)
	private Timestamp dateNextCount;

	@Column(name="DepartmenId")
	private Long departmenId;

	@Column(name="FutureUseQuantity")
	private Long futureUseQuantity;

	@Column(name="FutureUseQuantity2")
	private Long futureUseQuantity2;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="LocationId")
	private Long locationId;

	@Column(name="LotSerialNumber")
	private String lotSerialNumber;

	@Column(name="LotStatusCodeId")
	private Long lotStatusCodeId;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="PrimaryLocationPs")
	private String primaryLocationPs;

	@Column(name="ProjectHardCommittedQuantityinPrimary")
	private Long projectHardCommittedQuantityinPrimary;

	@Column(name="ProjectHardCommittedQuantityinSecondary")
	private Long projectHardCommittedQuantityinSecondary;

	@Column(name="Quantity1OtherPrimaryUnits")
	private Long quantity1OtherPrimaryUnits;

	@Column(name="Quantity2OtherPrimaryUnits")
	private Long quantity2OtherPrimaryUnits;

	@Column(name="QuantityHardCommitted")
	private Long quantityHardCommitted;

	@Column(name="QuantityInboundWarehouse")
	private Long quantityInboundWarehouse;

	@Column(name="QuantityOnBackOrder")
	private Long quantityOnBackOrder;

	@Column(name="QuantityOnFutureCommit")
	private Long quantityOnFutureCommit;

	@Column(name="QuantityOnHandinSecondaryUnits")
	private Long quantityOnHandinSecondaryUnits;

	@Column(name="QuantityOnHandPrimaryUnits")
	private Long quantityOnHandPrimaryUnits;

	@Column(name="QuantityOnLoanToManufacturing")
	private Long quantityOnLoanToManufacturing;

	@Column(name="QuantityOnPurchaseOrderPrimaryUnits")
	private Long quantityOnPurchaseOrderPrimaryUnits;

	@Column(name="QuantityOnPurchaseOrderSecondary")
	private Long quantityOnPurchaseOrderSecondary;

	@Column(name="QuantityOnWorkOrderReceipt")
	private Long quantityOnWorkOrderReceipt;

	@Column(name="QuantityOtherPurchasing1")
	private Long quantityOtherPurchasing1;

	@Column(name="QuantityOutboundWarehouse")
	private Long quantityOutboundWarehouse;

	@Column(name="QuantitySoftCommitted")
	private Long quantitySoftCommitted;

	@Column(name="QuantityWorkOrderHardCommit")
	private Long quantityWorkOrderHardCommit;

	@Column(name="QuantityWorkOrderSoftCommit")
	private Long quantityWorkOrderSoftCommit;

	@Column(name="SecondaryQuantityHardCommitted")
	private Long secondaryQuantityHardCommitted;

	@Column(name="SecondaryQuantityInboundWarehouse")
	private Long secondaryQuantityInboundWarehouse;

	@Column(name="SecondaryQuantityOnWorkOrderReceipt")
	private Long secondaryQuantityOnWorkOrderReceipt;

	@Column(name="SecondaryQuantityOutboundWarehouse")
	private Long secondaryQuantityOutboundWarehouse;

	@Column(name="SecondaryQuantitySoftCommitted")
	private Long secondaryQuantitySoftCommitted;

	@Column(name="SecondaryQuantityWoHardCommit")
	private Long secondaryQuantityWoHardCommit;

	@Column(name="SecondaryQuantityWoSoftCommit")
	private Long secondaryQuantityWoSoftCommit;

	@Column(name="UniqueConfigurationId")
	private Long uniqueConfigurationId;

	@Column(name="UnitsInInspectionPrimaryUnits")
	private Long unitsInInspectionPrimaryUnits;

	@Column(name="UnitsInOperation1PrimaryUnits")
	private Long unitsInOperation1PrimaryUnits;

	@Column(name="UnitsInOperation2PrimaryUnits")
	private Long unitsInOperation2PrimaryUnits;

	@Column(name="UnitsInTransitPrimaryUnits")
	private Long unitsInTransitPrimaryUnits;

	@Column(name="UserReservedAmount")
	private Long userReservedAmount;

	@Column(name="UserReservedCodeId")
	private Long userReservedCodeId;

	@Column(name="UserReservedDate", nullable=false)
	private Timestamp userReservedDate;

	@Column(name="UserReservedNumber")
	private Long userReservedNumber;

	@Column(name="UserReservedReference")
	private String userReservedReference;

	@Column(name="WorkFlowPendingFlag")
	private String workFlowPendingFlag;

	//bi-directional many-to-one association to InventoryDefinition
	@ManyToOne
	@JoinColumn(name="InventoryId")
	private InventoryDefinition inventoryDefinition;

	public ItemBalance() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryGl() {
		return this.categoryGl;
	}

	public void setCategoryGl(String categoryGl) {
		this.categoryGl = categoryGl;
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

	public String getCriticalHoldFlag() {
		return this.criticalHoldFlag;
	}

	public void setCriticalHoldFlag(String criticalHoldFlag) {
		this.criticalHoldFlag = criticalHoldFlag;
	}

	public Timestamp getDateLastReceipt() {
		return this.dateLastReceipt;
	}

	public void setDateLastReceipt(Timestamp dateLastReceipt) {
		this.dateLastReceipt = dateLastReceipt;
	}

	public Timestamp getDateNextCount() {
		return this.dateNextCount;
	}

	public void setDateNextCount(Timestamp dateNextCount) {
		this.dateNextCount = dateNextCount;
	}

	public Long getDepartmenId() {
		return this.departmenId;
	}

	public void setDepartmenId(Long departmenId) {
		this.departmenId = departmenId;
	}

	public Long getFutureUseQuantity() {
		return this.futureUseQuantity;
	}

	public void setFutureUseQuantity(Long futureUseQuantity) {
		this.futureUseQuantity = futureUseQuantity;
	}

	public Long getFutureUseQuantity2() {
		return this.futureUseQuantity2;
	}

	public void setFutureUseQuantity2(Long futureUseQuantity2) {
		this.futureUseQuantity2 = futureUseQuantity2;
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

	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getLotSerialNumber() {
		return this.lotSerialNumber;
	}

	public void setLotSerialNumber(String lotSerialNumber) {
		this.lotSerialNumber = lotSerialNumber;
	}

	public Long getLotStatusCodeId() {
		return this.lotStatusCodeId;
	}

	public void setLotStatusCodeId(Long lotStatusCodeId) {
		this.lotStatusCodeId = lotStatusCodeId;
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

	public String getPrimaryLocationPs() {
		return this.primaryLocationPs;
	}

	public void setPrimaryLocationPs(String primaryLocationPs) {
		this.primaryLocationPs = primaryLocationPs;
	}

	public Long getProjectHardCommittedQuantityinPrimary() {
		return this.projectHardCommittedQuantityinPrimary;
	}

	public void setProjectHardCommittedQuantityinPrimary(Long projectHardCommittedQuantityinPrimary) {
		this.projectHardCommittedQuantityinPrimary = projectHardCommittedQuantityinPrimary;
	}

	public Long getProjectHardCommittedQuantityinSecondary() {
		return this.projectHardCommittedQuantityinSecondary;
	}

	public void setProjectHardCommittedQuantityinSecondary(Long projectHardCommittedQuantityinSecondary) {
		this.projectHardCommittedQuantityinSecondary = projectHardCommittedQuantityinSecondary;
	}

	public Long getQuantity1OtherPrimaryUnits() {
		return this.quantity1OtherPrimaryUnits;
	}

	public void setQuantity1OtherPrimaryUnits(Long quantity1OtherPrimaryUnits) {
		this.quantity1OtherPrimaryUnits = quantity1OtherPrimaryUnits;
	}

	public Long getQuantity2OtherPrimaryUnits() {
		return this.quantity2OtherPrimaryUnits;
	}

	public void setQuantity2OtherPrimaryUnits(Long quantity2OtherPrimaryUnits) {
		this.quantity2OtherPrimaryUnits = quantity2OtherPrimaryUnits;
	}

	public Long getQuantityHardCommitted() {
		return this.quantityHardCommitted;
	}

	public void setQuantityHardCommitted(Long quantityHardCommitted) {
		this.quantityHardCommitted = quantityHardCommitted;
	}

	public Long getQuantityInboundWarehouse() {
		return this.quantityInboundWarehouse;
	}

	public void setQuantityInboundWarehouse(Long quantityInboundWarehouse) {
		this.quantityInboundWarehouse = quantityInboundWarehouse;
	}

	public Long getQuantityOnBackOrder() {
		return this.quantityOnBackOrder;
	}

	public void setQuantityOnBackOrder(Long quantityOnBackOrder) {
		this.quantityOnBackOrder = quantityOnBackOrder;
	}

	public Long getQuantityOnFutureCommit() {
		return this.quantityOnFutureCommit;
	}

	public void setQuantityOnFutureCommit(Long quantityOnFutureCommit) {
		this.quantityOnFutureCommit = quantityOnFutureCommit;
	}

	public Long getQuantityOnHandinSecondaryUnits() {
		return this.quantityOnHandinSecondaryUnits;
	}

	public void setQuantityOnHandinSecondaryUnits(Long quantityOnHandinSecondaryUnits) {
		this.quantityOnHandinSecondaryUnits = quantityOnHandinSecondaryUnits;
	}

	public Long getQuantityOnHandPrimaryUnits() {
		return this.quantityOnHandPrimaryUnits;
	}

	public void setQuantityOnHandPrimaryUnits(Long quantityOnHandPrimaryUnits) {
		this.quantityOnHandPrimaryUnits = quantityOnHandPrimaryUnits;
	}

	public Long getQuantityOnLoanToManufacturing() {
		return this.quantityOnLoanToManufacturing;
	}

	public void setQuantityOnLoanToManufacturing(Long quantityOnLoanToManufacturing) {
		this.quantityOnLoanToManufacturing = quantityOnLoanToManufacturing;
	}

	public Long getQuantityOnPurchaseOrderPrimaryUnits() {
		return this.quantityOnPurchaseOrderPrimaryUnits;
	}

	public void setQuantityOnPurchaseOrderPrimaryUnits(Long quantityOnPurchaseOrderPrimaryUnits) {
		this.quantityOnPurchaseOrderPrimaryUnits = quantityOnPurchaseOrderPrimaryUnits;
	}

	public Long getQuantityOnPurchaseOrderSecondary() {
		return this.quantityOnPurchaseOrderSecondary;
	}

	public void setQuantityOnPurchaseOrderSecondary(Long quantityOnPurchaseOrderSecondary) {
		this.quantityOnPurchaseOrderSecondary = quantityOnPurchaseOrderSecondary;
	}

	public Long getQuantityOnWorkOrderReceipt() {
		return this.quantityOnWorkOrderReceipt;
	}

	public void setQuantityOnWorkOrderReceipt(Long quantityOnWorkOrderReceipt) {
		this.quantityOnWorkOrderReceipt = quantityOnWorkOrderReceipt;
	}

	public Long getQuantityOtherPurchasing1() {
		return this.quantityOtherPurchasing1;
	}

	public void setQuantityOtherPurchasing1(Long quantityOtherPurchasing1) {
		this.quantityOtherPurchasing1 = quantityOtherPurchasing1;
	}

	public Long getQuantityOutboundWarehouse() {
		return this.quantityOutboundWarehouse;
	}

	public void setQuantityOutboundWarehouse(Long quantityOutboundWarehouse) {
		this.quantityOutboundWarehouse = quantityOutboundWarehouse;
	}

	public Long getQuantitySoftCommitted() {
		return this.quantitySoftCommitted;
	}

	public void setQuantitySoftCommitted(Long quantitySoftCommitted) {
		this.quantitySoftCommitted = quantitySoftCommitted;
	}

	public Long getQuantityWorkOrderHardCommit() {
		return this.quantityWorkOrderHardCommit;
	}

	public void setQuantityWorkOrderHardCommit(Long quantityWorkOrderHardCommit) {
		this.quantityWorkOrderHardCommit = quantityWorkOrderHardCommit;
	}

	public Long getQuantityWorkOrderSoftCommit() {
		return this.quantityWorkOrderSoftCommit;
	}

	public void setQuantityWorkOrderSoftCommit(Long quantityWorkOrderSoftCommit) {
		this.quantityWorkOrderSoftCommit = quantityWorkOrderSoftCommit;
	}

	public Long getSecondaryQuantityHardCommitted() {
		return this.secondaryQuantityHardCommitted;
	}

	public void setSecondaryQuantityHardCommitted(Long secondaryQuantityHardCommitted) {
		this.secondaryQuantityHardCommitted = secondaryQuantityHardCommitted;
	}

	public Long getSecondaryQuantityInboundWarehouse() {
		return this.secondaryQuantityInboundWarehouse;
	}

	public void setSecondaryQuantityInboundWarehouse(Long secondaryQuantityInboundWarehouse) {
		this.secondaryQuantityInboundWarehouse = secondaryQuantityInboundWarehouse;
	}

	public Long getSecondaryQuantityOnWorkOrderReceipt() {
		return this.secondaryQuantityOnWorkOrderReceipt;
	}

	public void setSecondaryQuantityOnWorkOrderReceipt(Long secondaryQuantityOnWorkOrderReceipt) {
		this.secondaryQuantityOnWorkOrderReceipt = secondaryQuantityOnWorkOrderReceipt;
	}

	public Long getSecondaryQuantityOutboundWarehouse() {
		return this.secondaryQuantityOutboundWarehouse;
	}

	public void setSecondaryQuantityOutboundWarehouse(Long secondaryQuantityOutboundWarehouse) {
		this.secondaryQuantityOutboundWarehouse = secondaryQuantityOutboundWarehouse;
	}

	public Long getSecondaryQuantitySoftCommitted() {
		return this.secondaryQuantitySoftCommitted;
	}

	public void setSecondaryQuantitySoftCommitted(Long secondaryQuantitySoftCommitted) {
		this.secondaryQuantitySoftCommitted = secondaryQuantitySoftCommitted;
	}

	public Long getSecondaryQuantityWoHardCommit() {
		return this.secondaryQuantityWoHardCommit;
	}

	public void setSecondaryQuantityWoHardCommit(Long secondaryQuantityWoHardCommit) {
		this.secondaryQuantityWoHardCommit = secondaryQuantityWoHardCommit;
	}

	public Long getSecondaryQuantityWoSoftCommit() {
		return this.secondaryQuantityWoSoftCommit;
	}

	public void setSecondaryQuantityWoSoftCommit(Long secondaryQuantityWoSoftCommit) {
		this.secondaryQuantityWoSoftCommit = secondaryQuantityWoSoftCommit;
	}

	public Long getUniqueConfigurationId() {
		return this.uniqueConfigurationId;
	}

	public void setUniqueConfigurationId(Long uniqueConfigurationId) {
		this.uniqueConfigurationId = uniqueConfigurationId;
	}

	public Long getUnitsInInspectionPrimaryUnits() {
		return this.unitsInInspectionPrimaryUnits;
	}

	public void setUnitsInInspectionPrimaryUnits(Long unitsInInspectionPrimaryUnits) {
		this.unitsInInspectionPrimaryUnits = unitsInInspectionPrimaryUnits;
	}

	public Long getUnitsInOperation1PrimaryUnits() {
		return this.unitsInOperation1PrimaryUnits;
	}

	public void setUnitsInOperation1PrimaryUnits(Long unitsInOperation1PrimaryUnits) {
		this.unitsInOperation1PrimaryUnits = unitsInOperation1PrimaryUnits;
	}

	public Long getUnitsInOperation2PrimaryUnits() {
		return this.unitsInOperation2PrimaryUnits;
	}

	public void setUnitsInOperation2PrimaryUnits(Long unitsInOperation2PrimaryUnits) {
		this.unitsInOperation2PrimaryUnits = unitsInOperation2PrimaryUnits;
	}

	public Long getUnitsInTransitPrimaryUnits() {
		return this.unitsInTransitPrimaryUnits;
	}

	public void setUnitsInTransitPrimaryUnits(Long unitsInTransitPrimaryUnits) {
		this.unitsInTransitPrimaryUnits = unitsInTransitPrimaryUnits;
	}

	public Long getUserReservedAmount() {
		return this.userReservedAmount;
	}

	public void setUserReservedAmount(Long userReservedAmount) {
		this.userReservedAmount = userReservedAmount;
	}

	public Long getUserReservedCodeId() {
		return this.userReservedCodeId;
	}

	public void setUserReservedCodeId(Long userReservedCodeId) {
		this.userReservedCodeId = userReservedCodeId;
	}

	public Timestamp getUserReservedDate() {
		return this.userReservedDate;
	}

	public void setUserReservedDate(Timestamp userReservedDate) {
		this.userReservedDate = userReservedDate;
	}

	public Long getUserReservedNumber() {
		return this.userReservedNumber;
	}

	public void setUserReservedNumber(Long userReservedNumber) {
		this.userReservedNumber = userReservedNumber;
	}

	public String getUserReservedReference() {
		return this.userReservedReference;
	}

	public void setUserReservedReference(String userReservedReference) {
		this.userReservedReference = userReservedReference;
	}

	public String getWorkFlowPendingFlag() {
		return this.workFlowPendingFlag;
	}

	public void setWorkFlowPendingFlag(String workFlowPendingFlag) {
		this.workFlowPendingFlag = workFlowPendingFlag;
	}

	public InventoryDefinition getInventoryDefinition() {
		return this.inventoryDefinition;
	}

	public void setInventoryDefinition(InventoryDefinition inventoryDefinition) {
		this.inventoryDefinition = inventoryDefinition;
	}

}