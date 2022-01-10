package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierRFQs database table.
 * 
 */
@Entity
@Table(name="SupplierRFQs")
@NamedQuery(name="SupplierRFQ.findAll", query="SELECT s FROM SupplierRFQ s")
public class SupplierRFQ implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ClosingDate")
	private Timestamp closingDate;

	@Column(name="Conditions")
	private String conditions;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DeliveryAddress")
	private String deliveryAddress;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="RequisitionDetailsId")
	private Long requisitionDetailsId;

	@Column(name="RequisitionId")
	private Long requisitionId;

	@Column(name="Specifications")
	private String specifications;

	@Column(name="SubmissionAddress")
	private String submissionAddress;

	@Column(name="ValidPeriod")
	private String validPeriod;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public SupplierRFQ() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getClosingDate() {
		return this.closingDate;
	}

	public void setClosingDate(Timestamp closingDate) {
		this.closingDate = closingDate;
	}

	public String getConditions() {
		return this.conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
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

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getRequisitionDetailsId() {
		return this.requisitionDetailsId;
	}

	public void setRequisitionDetailsId(Long requisitionDetailsId) {
		this.requisitionDetailsId = requisitionDetailsId;
	}

	public Long getRequisitionId() {
		return this.requisitionId;
	}

	public void setRequisitionId(Long requisitionId) {
		this.requisitionId = requisitionId;
	}

	public String getSpecifications() {
		return this.specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public String getSubmissionAddress() {
		return this.submissionAddress;
	}

	public void setSubmissionAddress(String submissionAddress) {
		this.submissionAddress = submissionAddress;
	}

	public String getValidPeriod() {
		return this.validPeriod;
	}

	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
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