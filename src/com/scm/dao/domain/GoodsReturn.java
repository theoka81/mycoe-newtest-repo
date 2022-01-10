package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the GoodsReturns database table.
 * 
 */
@Entity
@Table(name="GoodsReturns")
@NamedQuery(name="GoodsReturn.findAll", query="SELECT g FROM GoodsReturn g")
public class GoodsReturn implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	private String GRRefNo;

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

	@Column(name="QuantityReturned", nullable=false)
	private Long quantityReturned;

	@Column(name="Remarks")
	private String remarks;

	@Column(name="StatusId")
	private Long statusId;

	@Column(name="StoreOfficer")
	private String storeOfficer;

	@Column(name="WarehouseId")
	private Long warehouseId;

	//bi-directional many-to-one association to GoodReceivedInspectionDetail
	@ManyToOne
	@JoinColumn(name="GRIRDetailsId")
	private GoodReceivedInspectionDetail goodReceivedInspectionDetail;

	//bi-directional many-to-one association to InspectionDetail
	@ManyToOne
	@JoinColumn(name="InspectionDetailsId")
	private InspectionDetail inspectionDetail;

	public GoodsReturn() {
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

	public String getGRRefNo() {
		return this.GRRefNo;
	}

	public void setGRRefNo(String GRRefNo) {
		this.GRRefNo = GRRefNo;
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

	public Long getQuantityReturned() {
		return this.quantityReturned;
	}

	public void setQuantityReturned(Long quantityReturned) {
		this.quantityReturned = quantityReturned;
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

	public String getStoreOfficer() {
		return this.storeOfficer;
	}

	public void setStoreOfficer(String storeOfficer) {
		this.storeOfficer = storeOfficer;
	}

	public Long getWarehouseId() {
		return this.warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public GoodReceivedInspectionDetail getGoodReceivedInspectionDetail() {
		return this.goodReceivedInspectionDetail;
	}

	public void setGoodReceivedInspectionDetail(GoodReceivedInspectionDetail goodReceivedInspectionDetail) {
		this.goodReceivedInspectionDetail = goodReceivedInspectionDetail;
	}

	public InspectionDetail getInspectionDetail() {
		return this.inspectionDetail;
	}

	public void setInspectionDetail(InspectionDetail inspectionDetail) {
		this.inspectionDetail = inspectionDetail;
	}

}