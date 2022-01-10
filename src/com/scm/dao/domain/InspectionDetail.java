package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the InspectionDetails database table.
 * 
 */
@Entity
@Table(name="InspectionDetails")
@NamedQuery(name="InspectionDetail.findAll", query="SELECT i FROM InspectionDetail i")
public class InspectionDetail implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="QuantityAccepted", nullable=false)
	private Long quantityAccepted;

	@Column(name="QuantityApproved", nullable=false)
	private Long quantityApproved;

	@Column(name="QuantityOutStanding", nullable=false)
	private Long quantityOutStanding;

	@Column(name="Remarks")
	private String remarks;

	@Column(name="StatusId")
	private Long statusId;

	//bi-directional many-to-one association to GoodsReturn
	@OneToMany(mappedBy="inspectionDetail")
	private Set<GoodsReturn> goodsReturns;

	//bi-directional many-to-one association to GoodReceivedInspectionDetail
	@ManyToOne
	@JoinColumn(name="GRIRDetailId")
	private GoodReceivedInspectionDetail goodReceivedInspectionDetail;

	//bi-directional many-to-one association to GoodsRecievedInspection
	@ManyToOne
	@JoinColumn(name="GRIRId")
	private GoodsRecievedInspection goodsRecievedInspection;

	//bi-directional many-to-one association to Inspection
	@ManyToOne
	@JoinColumn(name="InspectionId")
	private Inspection inspection;

	public InspectionDetail() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getQuantityAccepted() {
		return this.quantityAccepted;
	}

	public void setQuantityAccepted(Long quantityAccepted) {
		this.quantityAccepted = quantityAccepted;
	}

	public Long getQuantityApproved() {
		return this.quantityApproved;
	}

	public void setQuantityApproved(Long quantityApproved) {
		this.quantityApproved = quantityApproved;
	}

	public Long getQuantityOutStanding() {
		return this.quantityOutStanding;
	}

	public void setQuantityOutStanding(Long quantityOutStanding) {
		this.quantityOutStanding = quantityOutStanding;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public Set<GoodsReturn> getGoodsReturns() {
		return this.goodsReturns;
	}

	public void setGoodsReturns(Set<GoodsReturn> goodsReturns) {
		this.goodsReturns = goodsReturns;
	}

	public GoodsReturn addGoodsReturn(GoodsReturn goodsReturn) {
		getGoodsReturns().add(goodsReturn);
		goodsReturn.setInspectionDetail(this);

		return goodsReturn;
	}

	public GoodsReturn removeGoodsReturn(GoodsReturn goodsReturn) {
		getGoodsReturns().remove(goodsReturn);
		goodsReturn.setInspectionDetail(null);

		return goodsReturn;
	}

	public GoodReceivedInspectionDetail getGoodReceivedInspectionDetail() {
		return this.goodReceivedInspectionDetail;
	}

	public void setGoodReceivedInspectionDetail(GoodReceivedInspectionDetail goodReceivedInspectionDetail) {
		this.goodReceivedInspectionDetail = goodReceivedInspectionDetail;
	}

	public GoodsRecievedInspection getGoodsRecievedInspection() {
		return this.goodsRecievedInspection;
	}

	public void setGoodsRecievedInspection(GoodsRecievedInspection goodsRecievedInspection) {
		this.goodsRecievedInspection = goodsRecievedInspection;
	}

	public Inspection getInspection() {
		return this.inspection;
	}

	public void setInspection(Inspection inspection) {
		this.inspection = inspection;
	}

}