package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the StockReservationWorks database table.
 * 
 */
@Entity
@Table(name="StockReservationWorks")
@NamedQuery(name="StockReservationWork.findAll", query="SELECT s FROM StockReservationWork s")
public class StockReservationWork implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DepartmentRep")
	private String departmentRep;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="OriginalId", nullable=false)
	private Long originalId;

	@Column(name="RefDate")
	private String refDate;

	@Column(name="Remarks")
	private String remarks;

	@Column(name="StockRefNo")
	private String stockRefNo;

	@Column(name="StoreOfficer")
	private String storeOfficer;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="DepartmentID")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StockReservationTypeId", nullable=false)
	private UserCode userCode3;

	//bi-directional many-to-one association to WarehouseDetail
	@ManyToOne
	@JoinColumn(name="WareHouseId")
	private WarehouseDetail warehouseDetail;

	public StockReservationWork() {
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

	public String getDepartmentRep() {
		return this.departmentRep;
	}

	public void setDepartmentRep(String departmentRep) {
		this.departmentRep = departmentRep;
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

	public Long getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(Long originalId) {
		this.originalId = originalId;
	}

	public String getRefDate() {
		return this.refDate;
	}

	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStockRefNo() {
		return this.stockRefNo;
	}

	public void setStockRefNo(String stockRefNo) {
		this.stockRefNo = stockRefNo;
	}

	public String getStoreOfficer() {
		return this.storeOfficer;
	}

	public void setStoreOfficer(String storeOfficer) {
		this.storeOfficer = storeOfficer;
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

	public WarehouseDetail getWarehouseDetail() {
		return this.warehouseDetail;
	}

	public void setWarehouseDetail(WarehouseDetail warehouseDetail) {
		this.warehouseDetail = warehouseDetail;
	}

}