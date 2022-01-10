package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SROAudits database table.
 * 
 */
@Entity
@Table(name="SROAudits")
@NamedQuery(name="SROAudit.findAll", query="SELECT s FROM SROAudit s")
public class SROAudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId")
	private long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="Comments")
	private String comments;

	@Column(name="ContractId")
	private long contractId;

	@Column(name="ContractNo")
	private String contractNo;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="DepartmentProjectManager")
	private String departmentProjectManager;

	private Timestamp EMPOIssuedDate;

	@Column(name="EndDate")
	private Timestamp endDate;

	private Timestamp EPMODateApproved;

	@Column(name="Id")
	private long id;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="IsLocked")
	private boolean isLocked;

	@Column(name="IsSent")
	private boolean isSent;

	@Column(name="LegalName")
	private String legalName;

	@Column(name="LifeCycleStatusId")
	private long lifeCycleStatusId;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="Percentage")
	private long percentage;

	@Column(name="RequestingDepartmentDateApproved")
	private Timestamp requestingDepartmentDateApproved;

	@Column(name="RequestingDepartmentId")
	private long requestingDepartmentId;

	@Column(name="ResponseCounter")
	private long responseCounter;

	@Column(name="ResponseDays")
	private long responseDays;

	@Column(name="ServiceTargetDate")
	private Timestamp serviceTargetDate;

	@Column(name="ShortDescription")
	private String shortDescription;

	@Column(name="SroReference")
	private String sroReference;

	@Column(name="StartDate")
	private Timestamp startDate;

	@Column(name="StatusId")
	private long statusId;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierIssuedDate")
	private Timestamp supplierIssuedDate;

	@Column(name="SupplierReferenceNo")
	private String supplierReferenceNo;

	@Column(name="SupplierResponseDate")
	private Timestamp supplierResponseDate;

	@Column(name="SystemUserId")
	private long systemUserId;

	@Column(name="WorkflowStatusId")
	private long workflowStatusId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public SROAudit() {
	}

	public long getAuditId() {
		return this.auditId;
	}

	public void setAuditId(long auditId) {
		this.auditId = auditId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public long getContractId() {
		return this.contractId;
	}

	public void setContractId(long contractId) {
		this.contractId = contractId;
	}

	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
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

	public Timestamp getEPMODateApproved() {
		return this.EPMODateApproved;
	}

	public void setEPMODateApproved(Timestamp EPMODateApproved) {
		this.EPMODateApproved = EPMODateApproved;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public boolean getIsSent() {
		return this.isSent;
	}

	public void setIsSent(boolean isSent) {
		this.isSent = isSent;
	}

	public String getLegalName() {
		return this.legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public long getLifeCycleStatusId() {
		return this.lifeCycleStatusId;
	}

	public void setLifeCycleStatusId(long lifeCycleStatusId) {
		this.lifeCycleStatusId = lifeCycleStatusId;
	}

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
	}

	public long getPercentage() {
		return this.percentage;
	}

	public void setPercentage(long percentage) {
		this.percentage = percentage;
	}

	public Timestamp getRequestingDepartmentDateApproved() {
		return this.requestingDepartmentDateApproved;
	}

	public void setRequestingDepartmentDateApproved(Timestamp requestingDepartmentDateApproved) {
		this.requestingDepartmentDateApproved = requestingDepartmentDateApproved;
	}

	public long getRequestingDepartmentId() {
		return this.requestingDepartmentId;
	}

	public void setRequestingDepartmentId(long requestingDepartmentId) {
		this.requestingDepartmentId = requestingDepartmentId;
	}

	public long getResponseCounter() {
		return this.responseCounter;
	}

	public void setResponseCounter(long responseCounter) {
		this.responseCounter = responseCounter;
	}

	public long getResponseDays() {
		return this.responseDays;
	}

	public void setResponseDays(long responseDays) {
		this.responseDays = responseDays;
	}

	public Timestamp getServiceTargetDate() {
		return this.serviceTargetDate;
	}

	public void setServiceTargetDate(Timestamp serviceTargetDate) {
		this.serviceTargetDate = serviceTargetDate;
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

	public long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(long statusId) {
		this.statusId = statusId;
	}

	public long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public Timestamp getSupplierIssuedDate() {
		return this.supplierIssuedDate;
	}

	public void setSupplierIssuedDate(Timestamp supplierIssuedDate) {
		this.supplierIssuedDate = supplierIssuedDate;
	}

	public String getSupplierReferenceNo() {
		return this.supplierReferenceNo;
	}

	public void setSupplierReferenceNo(String supplierReferenceNo) {
		this.supplierReferenceNo = supplierReferenceNo;
	}

	public Timestamp getSupplierResponseDate() {
		return this.supplierResponseDate;
	}

	public void setSupplierResponseDate(Timestamp supplierResponseDate) {
		this.supplierResponseDate = supplierResponseDate;
	}

	public long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public long getWorkflowStatusId() {
		return this.workflowStatusId;
	}

	public void setWorkflowStatusId(long workflowStatusId) {
		this.workflowStatusId = workflowStatusId;
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