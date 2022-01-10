package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the DisposeHeaders database table.
 * 
 */
@Entity
@Table(name="DisposeHeaders")
@NamedQuery(name="DisposeHeader.findAll", query="SELECT d FROM DisposeHeader d")
public class DisposeHeader implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="CreationDate")
	private String creationDate;

	@Column(name="CreationTime")
	private String creationTime;

	@Column(name="DevelopmentTypeId")
	private Long developmentTypeId;

	@Column(name="DisposeRefDate")
	private String disposeRefDate;

	@Column(name="DisposeRefNo")
	private String disposeRefNo;

	@Column(name="DisposeTypeId")
	private Long disposeTypeId;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="Remarks")
	private String remarks;

	@Column(name="StatusId")
	private Long statusId;

	@Column(name="StoreOfficer")
	private String storeOfficer;

	@Column(name="WarehouseId")
	private Long warehouseId;

	@Column(name="WriteOff", nullable=false)
	private Boolean writeOff;

	//bi-directional many-to-one association to DisposeDetail
	@OneToMany(mappedBy="disposeHeader")
	private Set<DisposeDetail> disposeDetails;

	public DisposeHeader() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public Long getDevelopmentTypeId() {
		return this.developmentTypeId;
	}

	public void setDevelopmentTypeId(Long developmentTypeId) {
		this.developmentTypeId = developmentTypeId;
	}

	public String getDisposeRefDate() {
		return this.disposeRefDate;
	}

	public void setDisposeRefDate(String disposeRefDate) {
		this.disposeRefDate = disposeRefDate;
	}

	public String getDisposeRefNo() {
		return this.disposeRefNo;
	}

	public void setDisposeRefNo(String disposeRefNo) {
		this.disposeRefNo = disposeRefNo;
	}

	public Long getDisposeTypeId() {
		return this.disposeTypeId;
	}

	public void setDisposeTypeId(Long disposeTypeId) {
		this.disposeTypeId = disposeTypeId;
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

	public Long getWarehouseId() {
		return this.warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Boolean getWriteOff() {
		return this.writeOff;
	}

	public void setWriteOff(Boolean writeOff) {
		this.writeOff = writeOff;
	}

	public Set<DisposeDetail> getDisposeDetails() {
		return this.disposeDetails;
	}

	public void setDisposeDetails(Set<DisposeDetail> disposeDetails) {
		this.disposeDetails = disposeDetails;
	}

	public DisposeDetail addDisposeDetail(DisposeDetail disposeDetail) {
		getDisposeDetails().add(disposeDetail);
		disposeDetail.setDisposeHeader(this);

		return disposeDetail;
	}

	public DisposeDetail removeDisposeDetail(DisposeDetail disposeDetail) {
		getDisposeDetails().remove(disposeDetail);
		disposeDetail.setDisposeHeader(null);

		return disposeDetail;
	}

}