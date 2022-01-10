package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the Tenders database table.
 * 
 */
@Entity
@Table(name="Tenders")
@NamedQuery(name="Tender.findAll", query="SELECT t FROM Tender t")
public class Tender implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="BidClosingDate")
	private Timestamp bidClosingDate;

	@Column(name="BriefingSessionDate")
	private Timestamp briefingSessionDate;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="EstimatedBudget", precision=18, scale=2)
	private BigDecimal estimatedBudget;

	@Column(name="GlAccount")
	private String glAccount;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="Location")
	private Long location;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ProcessId")
	private Long processId;

	@Column(name="ReasonForCancellation")
	private String reasonForCancellation;

	@Column(name="RequisitionHeaderId")
	private Long requisitionHeaderId;

	@Column(name="TenderCategory")
	private Long tenderCategory;

	@Column(name="TenderClosingDate")
	private Timestamp tenderClosingDate;

	@Column(name="TenderDescription")
	private String tenderDescription;

	@Column(name="TenderNo")
	private String tenderNo;

	@Column(name="TenderNotice")
	private String tenderNotice;

	@Column(name="TenderPublishStatus")
	private Long tenderPublishStatus;

	@Column(name="TenderStatus")
	private Long tenderStatus;

	@Column(name="TenderType")
	private Long tenderType;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public Tender() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getBidClosingDate() {
		return this.bidClosingDate;
	}

	public void setBidClosingDate(Timestamp bidClosingDate) {
		this.bidClosingDate = bidClosingDate;
	}

	public Timestamp getBriefingSessionDate() {
		return this.briefingSessionDate;
	}

	public void setBriefingSessionDate(Timestamp briefingSessionDate) {
		this.briefingSessionDate = briefingSessionDate;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public BigDecimal getEstimatedBudget() {
		return this.estimatedBudget;
	}

	public void setEstimatedBudget(BigDecimal estimatedBudget) {
		this.estimatedBudget = estimatedBudget;
	}

	public String getGlAccount() {
		return this.glAccount;
	}

	public void setGlAccount(String glAccount) {
		this.glAccount = glAccount;
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

	public Long getLocation() {
		return this.location;
	}

	public void setLocation(Long location) {
		this.location = location;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getProcessId() {
		return this.processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
	}

	public String getReasonForCancellation() {
		return this.reasonForCancellation;
	}

	public void setReasonForCancellation(String reasonForCancellation) {
		this.reasonForCancellation = reasonForCancellation;
	}

	public Long getRequisitionHeaderId() {
		return this.requisitionHeaderId;
	}

	public void setRequisitionHeaderId(Long requisitionHeaderId) {
		this.requisitionHeaderId = requisitionHeaderId;
	}

	public Long getTenderCategory() {
		return this.tenderCategory;
	}

	public void setTenderCategory(Long tenderCategory) {
		this.tenderCategory = tenderCategory;
	}

	public Timestamp getTenderClosingDate() {
		return this.tenderClosingDate;
	}

	public void setTenderClosingDate(Timestamp tenderClosingDate) {
		this.tenderClosingDate = tenderClosingDate;
	}

	public String getTenderDescription() {
		return this.tenderDescription;
	}

	public void setTenderDescription(String tenderDescription) {
		this.tenderDescription = tenderDescription;
	}

	public String getTenderNo() {
		return this.tenderNo;
	}

	public void setTenderNo(String tenderNo) {
		this.tenderNo = tenderNo;
	}

	public String getTenderNotice() {
		return this.tenderNotice;
	}

	public void setTenderNotice(String tenderNotice) {
		this.tenderNotice = tenderNotice;
	}

	public Long getTenderPublishStatus() {
		return this.tenderPublishStatus;
	}

	public void setTenderPublishStatus(Long tenderPublishStatus) {
		this.tenderPublishStatus = tenderPublishStatus;
	}

	public Long getTenderStatus() {
		return this.tenderStatus;
	}

	public void setTenderStatus(Long tenderStatus) {
		this.tenderStatus = tenderStatus;
	}

	public Long getTenderType() {
		return this.tenderType;
	}

	public void setTenderType(Long tenderType) {
		this.tenderType = tenderType;
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