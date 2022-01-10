package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the TenderBidInvitations database table.
 * 
 */
@Entity
@Table(name="TenderBidInvitations")
@NamedQuery(name="TenderBidInvitation.findAll", query="SELECT t FROM TenderBidInvitation t")
public class TenderBidInvitation implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AdditionalBidInformation")
	private String additionalBidInformation;

	@Column(name="BidAmount", precision=18, scale=2)
	private BigDecimal bidAmount;

	@Column(name="BidNo")
	private String bidNo;

	@Column(name="BidPackageId")
	private Long bidPackageId;

	@Column(name="BidQuantity")
	private Long bidQuantity;

	@Column(name="BidSpecificationId")
	private Long bidSpecificationId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="HasBeenAwarded", nullable=false)
	private Boolean hasBeenAwarded;

	@Column(name="HasSubmittedBid", nullable=false)
	private Boolean hasSubmittedBid;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="SupplierMasterId")
	private Long supplierMasterId;

	@Column(name="TenderId", nullable=false)
	private Long tenderId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public TenderBidInvitation() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdditionalBidInformation() {
		return this.additionalBidInformation;
	}

	public void setAdditionalBidInformation(String additionalBidInformation) {
		this.additionalBidInformation = additionalBidInformation;
	}

	public BigDecimal getBidAmount() {
		return this.bidAmount;
	}

	public void setBidAmount(BigDecimal bidAmount) {
		this.bidAmount = bidAmount;
	}

	public String getBidNo() {
		return this.bidNo;
	}

	public void setBidNo(String bidNo) {
		this.bidNo = bidNo;
	}

	public Long getBidPackageId() {
		return this.bidPackageId;
	}

	public void setBidPackageId(Long bidPackageId) {
		this.bidPackageId = bidPackageId;
	}

	public Long getBidQuantity() {
		return this.bidQuantity;
	}

	public void setBidQuantity(Long bidQuantity) {
		this.bidQuantity = bidQuantity;
	}

	public Long getBidSpecificationId() {
		return this.bidSpecificationId;
	}

	public void setBidSpecificationId(Long bidSpecificationId) {
		this.bidSpecificationId = bidSpecificationId;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Boolean getHasBeenAwarded() {
		return this.hasBeenAwarded;
	}

	public void setHasBeenAwarded(Boolean hasBeenAwarded) {
		this.hasBeenAwarded = hasBeenAwarded;
	}

	public Boolean getHasSubmittedBid() {
		return this.hasSubmittedBid;
	}

	public void setHasSubmittedBid(Boolean hasSubmittedBid) {
		this.hasSubmittedBid = hasSubmittedBid;
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

	public Long getSupplierMasterId() {
		return this.supplierMasterId;
	}

	public void setSupplierMasterId(Long supplierMasterId) {
		this.supplierMasterId = supplierMasterId;
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