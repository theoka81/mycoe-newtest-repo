package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TenderEvaluations database table.
 * 
 */
@Entity
@Table(name="TenderEvaluations")
@NamedQuery(name="TenderEvaluation.findAll", query="SELECT t FROM TenderEvaluation t")
public class TenderEvaluation implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="Criteria")
	private String criteria;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="MaximumScore")
	private Long maximumScore;

	@Column(name="MinimumScore")
	private Long minimumScore;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="RequirementsEvaluationId")
	private Long requirementsEvaluationId;

	@Column(name="SupplierMasterId")
	private Long supplierMasterId;

	@Column(name="TenderBidInvitationId")
	private Long tenderBidInvitationId;

	@Column(name="TenderId")
	private Long tenderId;

	@Column(name="TotalScore")
	private Long totalScore;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public TenderEvaluation() {
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

	public String getCriteria() {
		return this.criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
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

	public Long getMaximumScore() {
		return this.maximumScore;
	}

	public void setMaximumScore(Long maximumScore) {
		this.maximumScore = maximumScore;
	}

	public Long getMinimumScore() {
		return this.minimumScore;
	}

	public void setMinimumScore(Long minimumScore) {
		this.minimumScore = minimumScore;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getRequirementsEvaluationId() {
		return this.requirementsEvaluationId;
	}

	public void setRequirementsEvaluationId(Long requirementsEvaluationId) {
		this.requirementsEvaluationId = requirementsEvaluationId;
	}

	public Long getSupplierMasterId() {
		return this.supplierMasterId;
	}

	public void setSupplierMasterId(Long supplierMasterId) {
		this.supplierMasterId = supplierMasterId;
	}

	public Long getTenderBidInvitationId() {
		return this.tenderBidInvitationId;
	}

	public void setTenderBidInvitationId(Long tenderBidInvitationId) {
		this.tenderBidInvitationId = tenderBidInvitationId;
	}

	public Long getTenderId() {
		return this.tenderId;
	}

	public void setTenderId(Long tenderId) {
		this.tenderId = tenderId;
	}

	public Long getTotalScore() {
		return this.totalScore;
	}

	public void setTotalScore(Long totalScore) {
		this.totalScore = totalScore;
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