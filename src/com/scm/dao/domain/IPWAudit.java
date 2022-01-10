package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the IPWAudits database table.
 * 
 */
@Entity
@Table(name="IPWAudits")
@NamedQuery(name="IPWAudit.findAll", query="SELECT i FROM IPWAudit i")
public class IPWAudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId")
	private long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="Amount")
	private BigDecimal amount;

	@Column(name="BudgetStatusId")
	private long budgetStatusId;

	@Column(name="Comments")
	private String comments;

	@Column(name="ContractId")
	private long contractId;

	@Column(name="ContractNo")
	private String contractNo;

	@Column(name="DateIssuedToSupplier")
	private Timestamp dateIssuedToSupplier;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="EndDate")
	private Timestamp endDate;

	private Timestamp EPMOApprovedDate;

	private Timestamp EPMOIssuedDate;

	@Column(name="Id")
	private long id;

	@Column(name="IpwReference")
	private String ipwReference;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="IsLocked")
	private boolean isLocked;

	@Column(name="IsSystemGenerated")
	private boolean isSystemGenerated;

	@Column(name="LegalName")
	private String legalName;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="PaymentIndicator")
	private boolean paymentIndicator;

	@Column(name="RequestingDepartmentApprovedDate")
	private Timestamp requestingDepartmentApprovedDate;

	@Column(name="ResponseCounter")
	private long responseCounter;

	@Column(name="ResponseDays")
	private long responseDays;

	@Column(name="ServiceTargetDate")
	private Timestamp serviceTargetDate;

	@Column(name="ShortDescription")
	private String shortDescription;

	private long SROId;

	@Column(name="StartDate")
	private Timestamp startDate;

	@Column(name="StatusId")
	private long statusId;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierReferenceNo")
	private String supplierReferenceNo;

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

	public IPWAudit() {
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

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public long getBudgetStatusId() {
		return this.budgetStatusId;
	}

	public void setBudgetStatusId(long budgetStatusId) {
		this.budgetStatusId = budgetStatusId;
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

	public Timestamp getDateIssuedToSupplier() {
		return this.dateIssuedToSupplier;
	}

	public void setDateIssuedToSupplier(Timestamp dateIssuedToSupplier) {
		this.dateIssuedToSupplier = dateIssuedToSupplier;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Timestamp getEPMOApprovedDate() {
		return this.EPMOApprovedDate;
	}

	public void setEPMOApprovedDate(Timestamp EPMOApprovedDate) {
		this.EPMOApprovedDate = EPMOApprovedDate;
	}

	public Timestamp getEPMOIssuedDate() {
		return this.EPMOIssuedDate;
	}

	public void setEPMOIssuedDate(Timestamp EPMOIssuedDate) {
		this.EPMOIssuedDate = EPMOIssuedDate;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIpwReference() {
		return this.ipwReference;
	}

	public void setIpwReference(String ipwReference) {
		this.ipwReference = ipwReference;
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

	public boolean getIsSystemGenerated() {
		return this.isSystemGenerated;
	}

	public void setIsSystemGenerated(boolean isSystemGenerated) {
		this.isSystemGenerated = isSystemGenerated;
	}

	public String getLegalName() {
		return this.legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
	}

	public boolean getPaymentIndicator() {
		return this.paymentIndicator;
	}

	public void setPaymentIndicator(boolean paymentIndicator) {
		this.paymentIndicator = paymentIndicator;
	}

	public Timestamp getRequestingDepartmentApprovedDate() {
		return this.requestingDepartmentApprovedDate;
	}

	public void setRequestingDepartmentApprovedDate(Timestamp requestingDepartmentApprovedDate) {
		this.requestingDepartmentApprovedDate = requestingDepartmentApprovedDate;
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

	public long getSROId() {
		return this.SROId;
	}

	public void setSROId(long SROId) {
		this.SROId = SROId;
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

	public String getSupplierReferenceNo() {
		return this.supplierReferenceNo;
	}

	public void setSupplierReferenceNo(String supplierReferenceNo) {
		this.supplierReferenceNo = supplierReferenceNo;
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