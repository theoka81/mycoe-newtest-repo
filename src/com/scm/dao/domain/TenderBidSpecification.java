package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the TenderBidSpecifications database table.
 * 
 */
@Entity
@Table(name="TenderBidSpecifications")
@NamedQuery(name="TenderBidSpecification.findAll", query="SELECT t FROM TenderBidSpecification t")
public class TenderBidSpecification implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CommodityId")
	private Long commodityId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemDescription")
	private String itemDescription;

	@Column(name="ItemUnitCost", precision=18, scale=2)
	private BigDecimal itemUnitCost;

	@Column(name="LineNo")
	private Long lineNo;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="RequestedQuantity")
	private Long requestedQuantity;

	@Column(name="RequisitionDetailsId")
	private Long requisitionDetailsId;

	@Column(name="RequisitionHeaderId")
	private Long requisitionHeaderId;

	@Column(name="TenderBidPackageId")
	private Long tenderBidPackageId;

	@Column(name="TenderId")
	private Long tenderId;

	@Column(name="TotalCostPrice", precision=18, scale=2)
	private BigDecimal totalCostPrice;

	@Column(name="UnitOfMeasureId")
	private Long unitOfMeasureId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public TenderBidSpecification() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(Long commodityId) {
		this.commodityId = commodityId;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
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

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public BigDecimal getItemUnitCost() {
		return this.itemUnitCost;
	}

	public void setItemUnitCost(BigDecimal itemUnitCost) {
		this.itemUnitCost = itemUnitCost;
	}

	public Long getLineNo() {
		return this.lineNo;
	}

	public void setLineNo(Long lineNo) {
		this.lineNo = lineNo;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getRequestedQuantity() {
		return this.requestedQuantity;
	}

	public void setRequestedQuantity(Long requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}

	public Long getRequisitionDetailsId() {
		return this.requisitionDetailsId;
	}

	public void setRequisitionDetailsId(Long requisitionDetailsId) {
		this.requisitionDetailsId = requisitionDetailsId;
	}

	public Long getRequisitionHeaderId() {
		return this.requisitionHeaderId;
	}

	public void setRequisitionHeaderId(Long requisitionHeaderId) {
		this.requisitionHeaderId = requisitionHeaderId;
	}

	public Long getTenderBidPackageId() {
		return this.tenderBidPackageId;
	}

	public void setTenderBidPackageId(Long tenderBidPackageId) {
		this.tenderBidPackageId = tenderBidPackageId;
	}

	public Long getTenderId() {
		return this.tenderId;
	}

	public void setTenderId(Long tenderId) {
		this.tenderId = tenderId;
	}

	public BigDecimal getTotalCostPrice() {
		return this.totalCostPrice;
	}

	public void setTotalCostPrice(BigDecimal totalCostPrice) {
		this.totalCostPrice = totalCostPrice;
	}

	public Long getUnitOfMeasureId() {
		return this.unitOfMeasureId;
	}

	public void setUnitOfMeasureId(Long unitOfMeasureId) {
		this.unitOfMeasureId = unitOfMeasureId;
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