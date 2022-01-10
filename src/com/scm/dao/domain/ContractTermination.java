package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ContractTerminations database table.
 * 
 */
@Entity
@Table(name="ContractTerminations")
@NamedQuery(name="ContractTermination.findAll", query="SELECT c FROM ContractTermination c")
public class ContractTermination implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ContractApprovalDate")
	private Timestamp contractApprovalDate;

	@Column(name="ContractNo")
	private Long contractNo;

	@Column(name="ContractPeriodicReviewDate")
	private Timestamp contractPeriodicReviewDate;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DepartmentalCommentaryCompletionDate")
	private Timestamp departmentalCommentaryCompletionDate;

	@Column(name="EscalationDate")
	private Timestamp escalationDate;

	@Column(name="ExpectedReceiptDate")
	private Timestamp expectedReceiptDate;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsCLS", nullable=false)
	private Boolean isCLS;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="PostVettingCompletionDate")
	private Timestamp postVettingCompletionDate;

	@Column(name="RejectionReason")
	private String rejectionReason;

	@Column(name="RejectionReasonId")
	private Long rejectionReasonId;

	@Column(name="RequestingDepartment")
	private String requestingDepartment;

	@Column(name="RequestingDepartmentId")
	private Long requestingDepartmentId;

	@Column(name="TerminationDate")
	private Timestamp terminationDate;

	@Column(name="TerminationDescription")
	private String terminationDescription;

	@Column(name="TerminationReason")
	private String terminationReason;

	@Column(name="TerminationReasonId")
	private Long terminationReasonId;

	@Column(name="TerminationRequestAcknowledgementId")
	private Long terminationRequestAcknowledgementId;

	@Column(name="TerminationRequestNo")
	private Long terminationRequestNo;

	@Column(name="TerminationRequestReason")
	private String terminationRequestReason;

	@Column(name="TerminationRequestReasonId")
	private Long terminationRequestReasonId;

	@Column(name="TerminationStatusId")
	private Long terminationStatusId;

	@Column(name="VettingDate")
	private Timestamp vettingDate;

	@Column(name="VettingDescription")
	private String vettingDescription;

	@Column(name="VettingStatus")
	private String vettingStatus;

	@Column(name="VettingStatusId")
	private Long vettingStatusId;

	public ContractTermination() {
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

	public Timestamp getContractPeriodicReviewDate() {
		return this.contractPeriodicReviewDate;
	}

	public void setContractPeriodicReviewDate(Timestamp contractPeriodicReviewDate) {
		this.contractPeriodicReviewDate = contractPeriodicReviewDate;
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

	public Timestamp getTerminationDate() {
		return this.terminationDate;
	}

	public void setTerminationDate(Timestamp terminationDate) {
		this.terminationDate = terminationDate;
	}

	public String getTerminationDescription() {
		return this.terminationDescription;
	}

	public void setTerminationDescription(String terminationDescription) {
		this.terminationDescription = terminationDescription;
	}

	public String getTerminationReason() {
		return this.terminationReason;
	}

	public void setTerminationReason(String terminationReason) {
		this.terminationReason = terminationReason;
	}

	public Long getTerminationReasonId() {
		return this.terminationReasonId;
	}

	public void setTerminationReasonId(Long terminationReasonId) {
		this.terminationReasonId = terminationReasonId;
	}

	public Long getTerminationRequestAcknowledgementId() {
		return this.terminationRequestAcknowledgementId;
	}

	public void setTerminationRequestAcknowledgementId(Long terminationRequestAcknowledgementId) {
		this.terminationRequestAcknowledgementId = terminationRequestAcknowledgementId;
	}

	public Long getTerminationRequestNo() {
		return this.terminationRequestNo;
	}

	public void setTerminationRequestNo(Long terminationRequestNo) {
		this.terminationRequestNo = terminationRequestNo;
	}

	public String getTerminationRequestReason() {
		return this.terminationRequestReason;
	}

	public void setTerminationRequestReason(String terminationRequestReason) {
		this.terminationRequestReason = terminationRequestReason;
	}

	public Long getTerminationRequestReasonId() {
		return this.terminationRequestReasonId;
	}

	public void setTerminationRequestReasonId(Long terminationRequestReasonId) {
		this.terminationRequestReasonId = terminationRequestReasonId;
	}

	public Long getTerminationStatusId() {
		return this.terminationStatusId;
	}

	public void setTerminationStatusId(Long terminationStatusId) {
		this.terminationStatusId = terminationStatusId;
	}

	public Timestamp getVettingDate() {
		return this.vettingDate;
	}

	public void setVettingDate(Timestamp vettingDate) {
		this.vettingDate = vettingDate;
	}

	public String getVettingDescription() {
		return this.vettingDescription;
	}

	public void setVettingDescription(String vettingDescription) {
		this.vettingDescription = vettingDescription;
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

}