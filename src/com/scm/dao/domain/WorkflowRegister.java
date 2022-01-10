package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the WorkflowRegisters database table.
 * 
 */
@Entity
@Table(name="WorkflowRegisters")
@NamedQuery(name="WorkflowRegister.findAll", query="SELECT w FROM WorkflowRegister w")
public class WorkflowRegister implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CommitteeType")
	private Long committeeType;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DepartmentId")
	private Long departmentId;

	@Column(name="HasApproved")
	private Boolean hasApproved;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="IsPendingApproval")
	private Boolean isPendingApproval;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ReviewComments")
	private String reviewComments;

	@Column(name="Reviewer")
	private String reviewer;

	@Column(name="TranasctionTypeId")
	private Long tranasctionTypeId;

	@Column(name="TransactionId")
	private Long transactionId;

	@Column(name="UnitId")
	private Long unitId;

	@Column(name="WorkflowId")
	private Long workflowId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public WorkflowRegister() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCommitteeType() {
		return this.committeeType;
	}

	public void setCommitteeType(Long committeeType) {
		this.committeeType = committeeType;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Boolean getHasApproved() {
		return this.hasApproved;
	}

	public void setHasApproved(Boolean hasApproved) {
		this.hasApproved = hasApproved;
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

	public Boolean getIsPendingApproval() {
		return this.isPendingApproval;
	}

	public void setIsPendingApproval(Boolean isPendingApproval) {
		this.isPendingApproval = isPendingApproval;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getReviewComments() {
		return this.reviewComments;
	}

	public void setReviewComments(String reviewComments) {
		this.reviewComments = reviewComments;
	}

	public String getReviewer() {
		return this.reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public Long getTranasctionTypeId() {
		return this.tranasctionTypeId;
	}

	public void setTranasctionTypeId(Long tranasctionTypeId) {
		this.tranasctionTypeId = tranasctionTypeId;
	}

	public Long getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Long getUnitId() {
		return this.unitId;
	}

	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}

	public Long getWorkflowId() {
		return this.workflowId;
	}

	public void setWorkflowId(Long workflowId) {
		this.workflowId = workflowId;
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