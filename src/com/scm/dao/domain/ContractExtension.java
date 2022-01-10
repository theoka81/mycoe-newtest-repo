package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ContractExtensions database table.
 * 
 */
@Entity
@Table(name="ContractExtensions")
@NamedQuery(name="ContractExtension.findAll", query="SELECT c FROM ContractExtension c")
public class ContractExtension implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ContractApprovalDate")
	private Timestamp contractApprovalDate;

	@Column(name="ContractExtensionRequestNo")
	private Long contractExtensionRequestNo;

	@Column(name="ContractNo")
	private Long contractNo;

	@Column(name="ContractPeriodicReviewDate")
	private Timestamp contractPeriodicReviewDate;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DepartmentalCommentaryCompletionDate")
	private Timestamp departmentalCommentaryCompletionDate;

	@Column(name="ExpectedReceiptDate")
	private Timestamp expectedReceiptDate;

	@Column(name="ExtensionDate")
	private Timestamp extensionDate;

	@Column(name="ExtensionDescription")
	private String extensionDescription;

	@Column(name="ExtensionRejectionReason")
	private String extensionRejectionReason;

	@Column(name="ExtensionRejectionReasonId")
	private Long extensionRejectionReasonId;

	@Column(name="ExtensionRequestAcknowledgementId")
	private Long extensionRequestAcknowledgementId;

	@Column(name="ExtensionRequestReason")
	private String extensionRequestReason;

	@Column(name="ExtensionRequestReasonId")
	private Long extensionRequestReasonId;

	@Column(name="ExtensionStatus")
	private String extensionStatus;

	@Column(name="ExtensionStatusId")
	private Long extensionStatusId;

	@Column(name="ExtensionValueAmount", precision=18, scale=2)
	private BigDecimal extensionValueAmount;

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

	public ContractExtension() {
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

	public Long getContractExtensionRequestNo() {
		return this.contractExtensionRequestNo;
	}

	public void setContractExtensionRequestNo(Long contractExtensionRequestNo) {
		this.contractExtensionRequestNo = contractExtensionRequestNo;
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

	public Timestamp getExpectedReceiptDate() {
		return this.expectedReceiptDate;
	}

	public void setExpectedReceiptDate(Timestamp expectedReceiptDate) {
		this.expectedReceiptDate = expectedReceiptDate;
	}

	public Timestamp getExtensionDate() {
		return this.extensionDate;
	}

	public void setExtensionDate(Timestamp extensionDate) {
		this.extensionDate = extensionDate;
	}

	public String getExtensionDescription() {
		return this.extensionDescription;
	}

	public void setExtensionDescription(String extensionDescription) {
		this.extensionDescription = extensionDescription;
	}

	public String getExtensionRejectionReason() {
		return this.extensionRejectionReason;
	}

	public void setExtensionRejectionReason(String extensionRejectionReason) {
		this.extensionRejectionReason = extensionRejectionReason;
	}

	public Long getExtensionRejectionReasonId() {
		return this.extensionRejectionReasonId;
	}

	public void setExtensionRejectionReasonId(Long extensionRejectionReasonId) {
		this.extensionRejectionReasonId = extensionRejectionReasonId;
	}

	public Long getExtensionRequestAcknowledgementId() {
		return this.extensionRequestAcknowledgementId;
	}

	public void setExtensionRequestAcknowledgementId(Long extensionRequestAcknowledgementId) {
		this.extensionRequestAcknowledgementId = extensionRequestAcknowledgementId;
	}

	public String getExtensionRequestReason() {
		return this.extensionRequestReason;
	}

	public void setExtensionRequestReason(String extensionRequestReason) {
		this.extensionRequestReason = extensionRequestReason;
	}

	public Long getExtensionRequestReasonId() {
		return this.extensionRequestReasonId;
	}

	public void setExtensionRequestReasonId(Long extensionRequestReasonId) {
		this.extensionRequestReasonId = extensionRequestReasonId;
	}

	public String getExtensionStatus() {
		return this.extensionStatus;
	}

	public void setExtensionStatus(String extensionStatus) {
		this.extensionStatus = extensionStatus;
	}

	public Long getExtensionStatusId() {
		return this.extensionStatusId;
	}

	public void setExtensionStatusId(Long extensionStatusId) {
		this.extensionStatusId = extensionStatusId;
	}

	public BigDecimal getExtensionValueAmount() {
		return this.extensionValueAmount;
	}

	public void setExtensionValueAmount(BigDecimal extensionValueAmount) {
		this.extensionValueAmount = extensionValueAmount;
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