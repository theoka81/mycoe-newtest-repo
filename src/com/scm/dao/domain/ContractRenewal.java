package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ContractRenewals database table.
 * 
 */
@Entity
@Table(name="ContractRenewals")
@NamedQuery(name="ContractRenewal.findAll", query="SELECT c FROM ContractRenewal c")
public class ContractRenewal implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ContractApprovalDate")
	private Timestamp contractApprovalDate;

	@Column(name="ContractNo")
	private Long contractNo;

	@Column(name="ContractOrderType")
	private String contractOrderType;

	@Column(name="ContractOrderTypeId")
	private Long contractOrderTypeId;

	@Column(name="ContractPeriodicReviewDate")
	private Timestamp contractPeriodicReviewDate;

	@Column(name="ContractRenewalRequestNo")
	private Long contractRenewalRequestNo;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DepartmentalCommentaryCompletionDate")
	private Timestamp departmentalCommentaryCompletionDate;

	@Column(name="EscalationDate")
	private Timestamp escalationDate;

	@Column(name="ExpectedReceiptDate")
	private Timestamp expectedReceiptDate;

	@Column(name="ExpectedVettingDate")
	private Timestamp expectedVettingDate;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsCLS", nullable=false)
	private Boolean isCLS;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="PostVettingCompletionDate")
	private Timestamp postVettingCompletionDate;

	@Column(name="RejectionReason")
	private String rejectionReason;

	@Column(name="RejectionReasonId")
	private Long rejectionReasonId;

	@Column(name="RenewalDescription")
	private String renewalDescription;

	@Column(name="RenewalRequestAcknowledgementId")
	private Long renewalRequestAcknowledgementId;

	@Column(name="RenewalRequestDate")
	private Timestamp renewalRequestDate;

	@Column(name="RenewalStatusId")
	private Long renewalStatusId;

	@Column(name="RequestingDepartment")
	private String requestingDepartment;

	@Column(name="RequestingDepartmentId")
	private Long requestingDepartmentId;

	@Column(name="VettingDate")
	private Timestamp vettingDate;

	@Column(name="VettingStatus")
	private String vettingStatus;

	@Column(name="VettingStatusId")
	private Long vettingStatusId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public ContractRenewal() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getContractApprovalDate() {
		return this.contractApprovalDate;
	}

	public void setContractApprovalDate(Timestamp contractApprovalDate) {
		this.contractApprovalDate = contractApprovalDate;
	}

	public Long getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(Long contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractOrderType() {
		return this.contractOrderType;
	}

	public void setContractOrderType(String contractOrderType) {
		this.contractOrderType = contractOrderType;
	}

	public Long getContractOrderTypeId() {
		return this.contractOrderTypeId;
	}

	public void setContractOrderTypeId(Long contractOrderTypeId) {
		this.contractOrderTypeId = contractOrderTypeId;
	}

	public Timestamp getContractPeriodicReviewDate() {
		return this.contractPeriodicReviewDate;
	}

	public void setContractPeriodicReviewDate(Timestamp contractPeriodicReviewDate) {
		this.contractPeriodicReviewDate = contractPeriodicReviewDate;
	}

	public Long getContractRenewalRequestNo() {
		return this.contractRenewalRequestNo;
	}

	public void setContractRenewalRequestNo(Long contractRenewalRequestNo) {
		this.contractRenewalRequestNo = contractRenewalRequestNo;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getDepartmentalCommentaryCompletionDate() {
		return this.departmentalCommentaryCompletionDate;
	}

	public void setDepartmentalCommentaryCompletionDate(Timestamp departmentalCommentaryCompletionDate) {
		this.departmentalCommentaryCompletionDate = departmentalCommentaryCompletionDate;
	}

	public Timestamp getEscalationDate() {
		return this.escalationDate;
	}

	public void setEscalationDate(Timestamp escalationDate) {
		this.escalationDate = escalationDate;
	}

	public Timestamp getExpectedReceiptDate() {
		return this.expectedReceiptDate;
	}

	public void setExpectedReceiptDate(Timestamp expectedReceiptDate) {
		this.expectedReceiptDate = expectedReceiptDate;
	}

	public Timestamp getExpectedVettingDate() {
		return this.expectedVettingDate;
	}

	public void setExpectedVettingDate(Timestamp expectedVettingDate) {
		this.expectedVettingDate = expectedVettingDate;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsCLS() {
		return this.isCLS;
	}

	public void setIsCLS(Boolean isCLS) {
		this.isCLS = isCLS;
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

	public Timestamp getPostVettingCompletionDate() {
		return this.postVettingCompletionDate;
	}

	public void setPostVettingCompletionDate(Timestamp postVettingCompletionDate) {
		this.postVettingCompletionDate = postVettingCompletionDate;
	}

	public String getRejectionReason() {
		return this.rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public Long getRejectionReasonId() {
		return this.rejectionReasonId;
	}

	public void setRejectionReasonId(Long rejectionReasonId) {
		this.rejectionReasonId = rejectionReasonId;
	}

	public String getRenewalDescription() {
		return this.renewalDescription;
	}

	public void setRenewalDescription(String renewalDescription) {
		this.renewalDescription = renewalDescription;
	}

	public Long getRenewalRequestAcknowledgementId() {
		return this.renewalRequestAcknowledgementId;
	}

	public void setRenewalRequestAcknowledgementId(Long renewalRequestAcknowledgementId) {
		this.renewalRequestAcknowledgementId = renewalRequestAcknowledgementId;
	}

	public Timestamp getRenewalRequestDate() {
		return this.renewalRequestDate;
	}

	public void setRenewalRequestDate(Timestamp renewalRequestDate) {
		this.renewalRequestDate = renewalRequestDate;
	}

	public Long getRenewalStatusId() {
		return this.renewalStatusId;
	}

	public void setRenewalStatusId(Long renewalStatusId) {
		this.renewalStatusId = renewalStatusId;
	}

	public String getRequestingDepartment() {
		return this.requestingDepartment;
	}

	public void setRequestingDepartment(String requestingDepartment) {
		this.requestingDepartment = requestingDepartment;
	}

	public Long getRequestingDepartmentId() {
		return this.requestingDepartmentId;
	}

	public void setRequestingDepartmentId(Long requestingDepartmentId) {
		this.requestingDepartmentId = requestingDepartmentId;
	}

	public Timestamp getVettingDate() {
		return this.vettingDate;
	}

	public void setVettingDate(Timestamp vettingDate) {
		this.vettingDate = vettingDate;
	}

	public String getVettingStatus() {
		return this.vettingStatus;
	}

	public void setVettingStatus(String vettingStatus) {
		this.vettingStatus = vettingStatus;
	}

	public Long getVettingStatusId() {
		return this.vettingStatusId;
	}

	public void setVettingStatusId(Long vettingStatusId) {
		this.vettingStatusId = vettingStatusId;
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