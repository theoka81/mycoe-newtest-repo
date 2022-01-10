package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the GoodReceivedInspectionDetails database table.
 * 
 */
@Entity
@Table(name="GoodReceivedInspectionDetails")
@NamedQuery(name="GoodReceivedInspectionDetail.findAll", query="SELECT g FROM GoodReceivedInspectionDetail g")
public class GoodReceivedInspectionDetail implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="InspectedId")
	private Long inspectedId;

	@Column(name="InspectionCompletedId")
	private Long inspectionCompletedId;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemCode")
	private String itemCode;

	@Column(name="ItemDescription")
	private String itemDescription;

	@Column(name="ItemNo")
	private String itemNo;

	@Column(name="ItemUnit")
	private String itemUnit;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(nullable=false)
	private Long POBalance;

	@Column(nullable=false)
	private Long POQuantity;

	@Column(name="QuantityAccepted", nullable=false)
	private Long quantityAccepted;

	@Column(name="QuantityOutStanding", nullable=false)
	private Long quantityOutStanding;

	@Column(name="QuantityRecived", nullable=false)
	private Long quantityRecived;

	@Column(name="RequisitionDetailId")
	private Long requisitionDetailId;

	@Column(name="StatusId")
	private Long statusId;

	//bi-directional many-to-one association to GoodsRecievedInspection
	@ManyToOne
	@JoinColumn(name="GRIRId")
	private GoodsRecievedInspection goodsRecievedInspection;

	//bi-directional many-to-one association to GoodsReturn
	@OneToMany(mappedBy="goodReceivedInspectionDetail")
	private Set<GoodsReturn> goodsReturns;

	//bi-directional many-to-one association to InspectionDetail
	@OneToMany(mappedBy="goodReceivedInspectionDetail")
	private Set<InspectionDetail> inspectionDetails;

	public GoodReceivedInspectionDetail() {
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

	public Long getInspectedId() {
		return this.inspectedId;
	}

	public void setInspectedId(Long inspectedId) {
		this.inspectedId = inspectedId;
	}

	public Long getInspectionCompletedId() {
		return this.inspectionCompletedId;
	}

	public void setInspectionCompletedId(Long inspectionCompletedId) {
		this.inspectionCompletedId = inspectionCompletedId;
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

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemUnit() {
		return this.itemUnit;
	}

	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
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

	public Long getPOBalance() {
		return this.POBalance;
	}

	public void setPOBalance(Long POBalance) {
		this.POBalance = POBalance;
	}

	public Long getPOQuantity() {
		return this.POQuantity;
	}

	public void setPOQuantity(Long POQuantity) {
		this.POQuantity = POQuantity;
	}

	public Long getQuantityAccepted() {
		return this.quantityAccepted;
	}

	public void setQuantityAccepted(Long quantityAccepted) {
		this.quantityAccepted = quantityAccepted;
	}

	public Long getQuantityOutStanding() {
		return this.quantityOutStanding;
	}

	public void setQuantityOutStanding(Long quantityOutStanding) {
		this.quantityOutStanding = quantityOutStanding;
	}

	public Long getQuantityRecived() {
		return this.quantityRecived;
	}

	public void setQuantityRecived(Long quantityRecived) {
		this.quantityRecived = quantityRecived;
	}

	public Long getRequisitionDetailId() {
		return this.requisitionDetailId;
	}

	public void setRequisitionDetailId(Long requisitionDetailId) {
		this.requisitionDetailId = requisitionDetailId;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public GoodsRecievedInspection getGoodsRecievedInspection() {
		return this.goodsRecievedInspection;
	}

	public void setGoodsRecievedInspection(GoodsRecievedInspection goodsRecievedInspection) {
		this.goodsRecievedInspection = goodsRecievedInspection;
	}

	public Set<GoodsReturn> getGoodsReturns() {
		return this.goodsReturns;
	}

	public void setGoodsReturns(Set<GoodsReturn> goodsReturns) {
		this.goodsReturns = goodsReturns;
	}

	public GoodsReturn addGoodsReturn(GoodsReturn goodsReturn) {
		getGoodsReturns().add(goodsReturn);
		goodsReturn.setGoodReceivedInspectionDetail(this);

		return goodsReturn;
	}

	public GoodsReturn removeGoodsReturn(GoodsReturn goodsReturn) {
		getGoodsReturns().remove(goodsReturn);
		goodsReturn.setGoodReceivedInspectionDetail(null);

		return goodsReturn;
	}

	public Set<InspectionDetail> getInspectionDetails() {
		return this.inspectionDetails;
	}

	public void setInspectionDetails(Set<InspectionDetail> inspectionDetails) {
		this.inspectionDetails = inspectionDetails;
	}

	public InspectionDetail addInspectionDetail(InspectionDetail inspectionDetail) {
		getInspectionDetails().add(inspectionDetail);
		inspectionDetail.setGoodReceivedInspectionDetail(this);

		return inspectionDetail;
	}

	public InspectionDetail removeInspectionDetail(InspectionDetail inspectionDetail) {
		getInspectionDetails().remove(inspectionDetail);
		inspectionDetail.setGoodReceivedInspectionDetail(null);

		return inspectionDetail;
	}

}