package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierQuotations database table.
 * 
 */
@Entity
@Table(name="SupplierQuotations")
@NamedQuery(name="SupplierQuotation.findAll", query="SELECT s FROM SupplierQuotation s")
public class SupplierQuotation implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="HasNegotiationApproved", nullable=false)
	private Boolean hasNegotiationApproved;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="IsNegotiated", nullable=false)
	private Boolean isNegotiated;

	@Column(name="IsSubmitted", nullable=false)
	private Boolean isSubmitted;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="NegotiatedComments")
	private String negotiatedComments;

	@Column(name="QuotationDescription")
	private String quotationDescription;

	@Column(name="QuotationPrice", nullable=false, precision=18, scale=2)
	private BigDecimal quotationPrice;

	@Column(name="QuotationQuantity", nullable=false)
	private Integer quotationQuantity;

	@Column(name="RequisitionDetailsId")
	private Long requisitionDetailsId;

	//bi-directional many-to-one association to RequisitionHeader
	@ManyToOne
	@JoinColumn(name="RequisitionId")
	private RequisitionHeader requisitionHeader;

	//bi-directional many-to-one association to SupplierMaster
	@ManyToOne
	@JoinColumn(name="SupplierMasterId")
	private SupplierMaster supplierMaster;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public SupplierQuotation() {
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

	public Boolean getHasNegotiationApproved() {
		return this.hasNegotiationApproved;
	}

	public void setHasNegotiationApproved(Boolean hasNegotiationApproved) {
		this.hasNegotiationApproved = hasNegotiationApproved;
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

	public Boolean getIsNegotiated() {
		return this.isNegotiated;
	}

	public void setIsNegotiated(Boolean isNegotiated) {
		this.isNegotiated = isNegotiated;
	}

	public Boolean getIsSubmitted() {
		return this.isSubmitted;
	}

	public void setIsSubmitted(Boolean isSubmitted) {
		this.isSubmitted = isSubmitted;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getNegotiatedComments() {
		return this.negotiatedComments;
	}

	public void setNegotiatedComments(String negotiatedComments) {
		this.negotiatedComments = negotiatedComments;
	}

	public String getQuotationDescription() {
		return this.quotationDescription;
	}

	public void setQuotationDescription(String quotationDescription) {
		this.quotationDescription = quotationDescription;
	}

	public BigDecimal getQuotationPrice() {
		return this.quotationPrice;
	}

	public void setQuotationPrice(BigDecimal quotationPrice) {
		this.quotationPrice = quotationPrice;
	}

	public Integer getQuotationQuantity() {
		return this.quotationQuantity;
	}

	public void setQuotationQuantity(Integer quotationQuantity) {
		this.quotationQuantity = quotationQuantity;
	}

	public Long getRequisitionDetailsId() {
		return this.requisitionDetailsId;
	}

	public void setRequisitionDetailsId(Long requisitionDetailsId) {
		this.requisitionDetailsId = requisitionDetailsId;
	}

	public RequisitionHeader getRequisitionHeader() {
		return this.requisitionHeader;
	}

	public void setRequisitionHeader(RequisitionHeader requisitionHeader) {
		this.requisitionHeader = requisitionHeader;
	}

	public SupplierMaster getSupplierMaster() {
		return this.supplierMaster;
	}

	public void setSupplierMaster(SupplierMaster supplierMaster) {
		this.supplierMaster = supplierMaster;
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