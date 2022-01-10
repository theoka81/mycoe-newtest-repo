package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CycleCountDetails database table.
 * 
 */
@Entity
@Table(name="CycleCountDetails")
@NamedQuery(name="CycleCountDetail.findAll", query="SELECT c FROM CycleCountDetail c")
public class CycleCountDetail implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="Count")
	private Long count;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="CycleCountTypeId")
	private Long cycleCountTypeId;

	@Column(name="DateGenerated", nullable=false)
	private Timestamp dateGenerated;

	@Column(name="FinancialYear")
	private String financialYear;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemGroupId")
	private Long itemGroupId;

	@Column(name="IterationId", nullable=false)
	private Long iterationId;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="PhysicalCount", nullable=false)
	private Long physicalCount;

	@Column(name="Remarks")
	private String remarks;

	@Column(name="StatusId")
	private Long statusId;

	@Column(name="StoreOfficer")
	private String storeOfficer;

	@Column(name="WarehouseDetailsId")
	private Long warehouseDetailsId;

	//bi-directional many-to-one association to CycleCount
	@ManyToOne
	@JoinColumn(name="CycleCountId", nullable=false)
	private CycleCount cycleCount;

	//bi-directional many-to-one association to InventoryDefinition
	@ManyToOne
	@JoinColumn(name="ItemId")
	private InventoryDefinition inventoryDefinition;

	public CycleCountDetail() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
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

	public Long getCycleCountTypeId() {
		return this.cycleCountTypeId;
	}

	public void setCycleCountTypeId(Long cycleCountTypeId) {
		this.cycleCountTypeId = cycleCountTypeId;
	}

	public Timestamp getDateGenerated() {
		return this.dateGenerated;
	}

	public void setDateGenerated(Timestamp dateGenerated) {
		this.dateGenerated = dateGenerated;
	}

	public String getFinancialYear() {
		return this.financialYear;
	}

	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
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

	public Long getItemGroupId() {
		return this.itemGroupId;
	}

	public void setItemGroupId(Long itemGroupId) {
		this.itemGroupId = itemGroupId;
	}

	public Long getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(Long iterationId) {
		this.iterationId = iterationId;
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

	public Long getPhysicalCount() {
		return this.physicalCount;
	}

	public void setPhysicalCount(Long physicalCount) {
		this.physicalCount = physicalCount;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getStoreOfficer() {
		return this.storeOfficer;
	}

	public void setStoreOfficer(String storeOfficer) {
		this.storeOfficer = storeOfficer;
	}

	public Long getWarehouseDetailsId() {
		return this.warehouseDetailsId;
	}

	public void setWarehouseDetailsId(Long warehouseDetailsId) {
		this.warehouseDetailsId = warehouseDetailsId;
	}

	public CycleCount getCycleCount() {
		return this.cycleCount;
	}

	public void setCycleCount(CycleCount cycleCount) {
		this.cycleCount = cycleCount;
	}

	public InventoryDefinition getInventoryDefinition() {
		return this.inventoryDefinition;
	}

	public void setInventoryDefinition(InventoryDefinition inventoryDefinition) {
		this.inventoryDefinition = inventoryDefinition;
	}

}