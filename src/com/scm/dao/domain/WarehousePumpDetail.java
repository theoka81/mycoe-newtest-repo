package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the WarehousePumpDetails database table.
 * 
 */
@Entity
@Table(name="WarehousePumpDetails")
@NamedQuery(name="WarehousePumpDetail.findAll", query="SELECT w FROM WarehousePumpDetail w")
public class WarehousePumpDetail implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="CycleCountCategory")
	private String cycleCountCategory;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="PumpDateInstall")
	private String pumpDateInstall;

	@Column(name="PumpDecimals")
	private String pumpDecimals;

	@Column(name="PumpMaxDigits")
	private String pumpMaxDigits;

	@Column(name="PumpNo")
	private String pumpNo;

	@Column(name="PumpOpeningReading")
	private String pumpOpeningReading;

	@Column(name="SdcName")
	private String sdcName;

	@Column(name="TankStockItemNumber")
	private String tankStockItemNumber;

	@Column(name="WarehouseDescription")
	private String warehouseDescription;

	@Column(name="WarehouseId", nullable=false)
	private Long warehouseId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public WarehousePumpDetail() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getPumpDateInstall() {
		return this.pumpDateInstall;
	}

	public void setPumpDateInstall(String pumpDateInstall) {
		this.pumpDateInstall = pumpDateInstall;
	}

	public String getPumpDecimals() {
		return this.pumpDecimals;
	}

	public void setPumpDecimals(String pumpDecimals) {
		this.pumpDecimals = pumpDecimals;
	}

	public String getPumpMaxDigits() {
		return this.pumpMaxDigits;
	}

	public void setPumpMaxDigits(String pumpMaxDigits) {
		this.pumpMaxDigits = pumpMaxDigits;
	}

	public String getPumpNo() {
		return this.pumpNo;
	}

	public void setPumpNo(String pumpNo) {
		this.pumpNo = pumpNo;
	}

	public String getPumpOpeningReading() {
		return this.pumpOpeningReading;
	}

	public void setPumpOpeningReading(String pumpOpeningReading) {
		this.pumpOpeningReading = pumpOpeningReading;
	}

	public String getSdcName() {
		return this.sdcName;
	}

	public void setSdcName(String sdcName) {
		this.sdcName = sdcName;
	}

	public String getTankStockItemNumber() {
		return this.tankStockItemNumber;
	}

	public void setTankStockItemNumber(String tankStockItemNumber) {
		this.tankStockItemNumber = tankStockItemNumber;
	}

	public String getWarehouseDescription() {
		return this.warehouseDescription;
	}

	public void setWarehouseDescription(String warehouseDescription) {
		this.warehouseDescription = warehouseDescription;
	}

	public Long getWarehouseId() {
		return this.warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
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

}