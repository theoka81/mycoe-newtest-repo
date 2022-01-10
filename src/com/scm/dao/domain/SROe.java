package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SROes database table.
 * 
 */
@Entity
@Table(name="SROes")
@NamedQuery(name="SROe.findAll", query="SELECT s FROM SROe s")
public class SROe implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="Comments")
	private String comments;

	@Column(name="ContractId")
	private Long contractId;

	@Column(name="ContractNo")
	private String contractNo;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DateRecieved")
	private Timestamp dateRecieved;

	@Column(name="DepartmentProjectManager")
	private String departmentProjectManager;

	private Timestamp EMPOIssuedDate;

	@Column(name="EndDate")
	private Timestamp endDate;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="LegalName")
	private String legalName;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="Percentage")
	private Long percentage;

	@Column(name="RequestingDepartmentId")
	private Long requestingDepartmentId;

	@Column(name="ShortDescription")
	private String shortDescription;

	@Column(name="SroReference")
	private String sroReference;

	@Column(name="StartDate")
	private Timestamp startDate;

	@Column(name="StatusId")
	private Long statusId;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierReferenceNo")
	private String supplierReferenceNo;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public SROe() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Long getContractId() {
		return this.contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getDateRecieved() {
		return this.dateRecieved;
	}

	public void setDateRecieved(Timestamp dateRecieved) {
		this.dateRecieved = dateRecieved;
	}

	public String getDepartmentProjectManager() {
		return this.departmentProjectManager;
	}

	public void setDepartmentProjectManager(String departmentProjectManager) {
		this.departmentProjectManager = departmentProjectManager;
	}

	public Timestamp getEMPOIssuedDate() {
		return this.EMPOIssuedDate;
	}

	public void setEMPOIssuedDate(Timestamp EMPOIssuedDate) {
		this.EMPOIssuedDate = EMPOIssuedDate;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
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

	public String getLegalName() {
		return this.legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Long percentage) {
		this.percentage = percentage;
	}

	public Long getRequestingDepartmentId() {
		return this.requestingDepartmentId;
	}

	public void setRequestingDepartmentId(Long requestingDepartmentId) {
		this.requestingDepartmentId = requestingDepartmentId;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getSroReference() {
		return this.sroReference;
	}

	public void setSroReference(String sroReference) {
		this.sroReference = sroReference;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierReferenceNo() {
		return this.supplierReferenceNo;
	}

	public void setSupplierReferenceNo(String supplierReferenceNo) {
		this.supplierReferenceNo = supplierReferenceNo;
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