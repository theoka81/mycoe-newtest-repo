package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the GoodsRecievedInspections database table.
 * 
 */
@Entity
@Table(name="GoodsRecievedInspections")
@NamedQuery(name="GoodsRecievedInspection.findAll", query="SELECT g FROM GoodsRecievedInspection g")
public class GoodsRecievedInspection implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DeliveryDate")
	private String deliveryDate;

	private String GRIRRefDate;

	private String GRIRRefNo;

	@Column(nullable=false)
	private Long GRIRTypeId;

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

	private String PODate;

	private String PONo;

	@Column(name="ReceivedDate")
	private String receivedDate;

	@Column(name="Remarks")
	private String remarks;

	@Column(name="RequisitionId")
	private Long requisitionId;

	@Column(name="StatusId")
	private Long statusId;

	@Column(name="StoreOfficer")
	private String storeOfficer;

	@Column(name="SupplierName")
	private String supplierName;

	@Column(name="SupplierNo")
	private String supplierNo;

	@Column(name="WarehouseId")
	private Long warehouseId;

	//bi-directional many-to-one association to GoodReceivedInspectionDetail
	@OneToMany(mappedBy="goodsRecievedInspection")
	private Set<GoodReceivedInspectionDetail> goodReceivedInspectionDetails;

	//bi-directional many-to-one association to InspectionDetail
	@OneToMany(mappedBy="goodsRecievedInspection")
	private Set<InspectionDetail> inspectionDetails;

	//bi-directional many-to-one association to Inspection
	@OneToMany(mappedBy="goodsRecievedInspection")
	private Set<Inspection> inspections;

	public GoodsRecievedInspection() {
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

	public String getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getGRIRRefDate() {
		return this.GRIRRefDate;
	}

	public void setGRIRRefDate(String GRIRRefDate) {
		this.GRIRRefDate = GRIRRefDate;
	}

	public String getGRIRRefNo() {
		return this.GRIRRefNo;
	}

	public void setGRIRRefNo(String GRIRRefNo) {
		this.GRIRRefNo = GRIRRefNo;
	}

	public Long getGRIRTypeId() {
		return this.GRIRTypeId;
	}

	public void setGRIRTypeId(Long GRIRTypeId) {
		this.GRIRTypeId = GRIRTypeId;
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

	public String getPODate() {
		return this.PODate;
	}

	public void setPODate(String PODate) {
		this.PODate = PODate;
	}

	public String getPONo() {
		return this.PONo;
	}

	public void setPONo(String PONo) {
		this.PONo = PONo;
	}

	public String getReceivedDate() {
		return this.receivedDate;
	}

	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getRequisitionId() {
		return this.requisitionId;
	}

	public void setRequisitionId(Long requisitionId) {
		this.requisitionId = requisitionId;
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

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierNo() {
		return this.supplierNo;
	}

	public void setSupplierNo(String supplierNo) {
		this.supplierNo = supplierNo;
	}

	public Long getWarehouseId() {
		return this.warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Set<GoodReceivedInspectionDetail> getGoodReceivedInspectionDetails() {
		return this.goodReceivedInspectionDetails;
	}

	public void setGoodReceivedInspectionDetails(Set<GoodReceivedInspectionDetail> goodReceivedInspectionDetails) {
		this.goodReceivedInspectionDetails = goodReceivedInspectionDetails;
	}

	public GoodReceivedInspectionDetail addGoodReceivedInspectionDetail(GoodReceivedInspectionDetail goodReceivedInspectionDetail) {
		getGoodReceivedInspectionDetails().add(goodReceivedInspectionDetail);
		goodReceivedInspectionDetail.setGoodsRecievedInspection(this);

		return goodReceivedInspectionDetail;
	}

	public GoodReceivedInspectionDetail removeGoodReceivedInspectionDetail(GoodReceivedInspectionDetail goodReceivedInspectionDetail) {
		getGoodReceivedInspectionDetails().remove(goodReceivedInspectionDetail);
		goodReceivedInspectionDetail.setGoodsRecievedInspection(null);

		return goodReceivedInspectionDetail;
	}

	public Set<InspectionDetail> getInspectionDetails() {
		return this.inspectionDetails;
	}

	public void setInspectionDetails(Set<InspectionDetail> inspectionDetails) {
		this.inspectionDetails = inspectionDetails;
	}

	public InspectionDetail addInspectionDetail(InspectionDetail inspectionDetail) {
		getInspectionDetails().add(inspectionDetail);
		inspectionDetail.setGoodsRecievedInspection(this);

		return inspectionDetail;
	}

	public InspectionDetail removeInspectionDetail(InspectionDetail inspectionDetail) {
		getInspectionDetails().remove(inspectionDetail);
		inspectionDetail.setGoodsRecievedInspection(null);

		return inspectionDetail;
	}

	public Set<Inspection> getInspections() {
		return this.inspections;
	}

	public void setInspections(Set<Inspection> inspections) {
		this.inspections = inspections;
	}

	public Inspection addInspection(Inspection inspection) {
		getInspections().add(inspection);
		inspection.setGoodsRecievedInspection(this);

		return inspection;
	}

	public Inspection removeInspection(Inspection inspection) {
		getInspections().remove(inspection);
		inspection.setGoodsRecievedInspection(null);

		return inspection;
	}

}