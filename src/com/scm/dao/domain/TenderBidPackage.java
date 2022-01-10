package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TenderBidPackages database table.
 * 
 */
@Entity
@Table(name="TenderBidPackages")
@NamedQuery(name="TenderBidPackage.findAll", query="SELECT t FROM TenderBidPackage t")
public class TenderBidPackage implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="BidClarificationMeetingDate")
	private Timestamp bidClarificationMeetingDate;

	@Column(name="BidPackageDescription")
	private String bidPackageDescription;

	@Column(name="BidPackageNo")
	private String bidPackageNo;

	@Column(name="BidPackageStatus")
	private Long bidPackageStatus;

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

	@Column(name="NameOfInstitution")
	private String nameOfInstitution;

	@Column(name="PaymentTerms")
	private Long paymentTerms;

	@Column(name="SpecialTermsConditions")
	private String specialTermsConditions;

	@Column(name="TenderId")
	private Long tenderId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public TenderBidPackage() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getBidClarificationMeetingDate() {
		return this.bidClarificationMeetingDate;
	}

	public void setBidClarificationMeetingDate(Timestamp bidClarificationMeetingDate) {
		this.bidClarificationMeetingDate = bidClarificationMeetingDate;
	}

	public String getBidPackageDescription() {
		return this.bidPackageDescription;
	}

	public void setBidPackageDescription(String bidPackageDescription) {
		this.bidPackageDescription = bidPackageDescription;
	}

	public String getBidPackageNo() {
		return this.bidPackageNo;
	}

	public void setBidPackageNo(String bidPackageNo) {
		this.bidPackageNo = bidPackageNo;
	}

	public Long getBidPackageStatus() {
		return this.bidPackageStatus;
	}

	public void setBidPackageStatus(Long bidPackageStatus) {
		this.bidPackageStatus = bidPackageStatus;
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

	public String getNameOfInstitution() {
		return this.nameOfInstitution;
	}

	public void setNameOfInstitution(String nameOfInstitution) {
		this.nameOfInstitution = nameOfInstitution;
	}

	public Long getPaymentTerms() {
		return this.paymentTerms;
	}

	public void setPaymentTerms(Long paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getSpecialTermsConditions() {
		return this.specialTermsConditions;
	}

	public void setSpecialTermsConditions(String specialTermsConditions) {
		this.specialTermsConditions = specialTermsConditions;
	}

	public Long getTenderId() {
		return this.tenderId;
	}

	public void setTenderId(Long tenderId) {
		this.tenderId = tenderId;
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