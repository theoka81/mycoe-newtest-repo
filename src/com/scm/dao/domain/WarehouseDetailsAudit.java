package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the WarehouseDetailsAudits database table.
 * 
 */
@Entity
@Table(name="WarehouseDetailsAudits")
@NamedQuery(name="WarehouseDetailsAudit.findAll", query="SELECT w FROM WarehouseDetailsAudit w")
public class WarehouseDetailsAudit implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId", unique=true, nullable=false)
	private Long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="BarcodeNo")
	private String barcodeNo;

	@Column(name="Capacity")
	private String capacity;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="Id", nullable=false)
	private Long id;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="ProductType")
	private String productType;

	@Column(name="Status")
	private String status;

	@Column(name="SystemUserId")
	private Long systemUserId;

	@Column(name="Unit")
	private String unit;

	@Column(name="WarehouseDescription")
	private String warehouseDescription;

	@Column(name="WarehouseID")
	private Long warehouseID;

	@Column(name="WarehouseType")
	private String warehouseType;

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
	@JoinColumn(name="ProductTypeId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="UnitId")
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="WarehouseTypeId")
	private UserCode userCode4;

	public WarehouseDetailsAudit() {
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

	public String getBarcodeNo() {
		return this.barcodeNo;
	}

	public void setBarcodeNo(String barcodeNo) {
		this.barcodeNo = barcodeNo;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
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

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getWarehouseDescription() {
		return this.warehouseDescription;
	}

	public void setWarehouseDescription(String warehouseDescription) {
		this.warehouseDescription = warehouseDescription;
	}

	public Long getWarehouseID() {
		return this.warehouseID;
	}

	public void setWarehouseID(Long warehouseID) {
		this.warehouseID = warehouseID;
	}

	public String getWarehouseType() {
		return this.warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
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

}