package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the Inspections database table.
 * 
 */
@Entity
@Table(name="Inspections")
@NamedQuery(name="Inspection.findAll", query="SELECT i FROM Inspection i")
public class Inspection implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="InspectionDate")
	private String inspectionDate;

	@Column(name="InspectionNo")
	private String inspectionNo;

	@Column(name="InspectionOfficer")
	private String inspectionOfficer;

	@Column(name="InspectionTypeId", nullable=false)
	private Long inspectionTypeId;

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

	@Column(name="Remarks")
	private String remarks;

	@Column(name="StatusId")
	private Long statusId;

	@Column(name="WarehouseId")
	private Long warehouseId;

	//bi-directional many-to-one association to InspectionDetail
	@OneToMany(mappedBy="inspection")
	private Set<InspectionDetail> inspectionDetails;

	//bi-directional many-to-one association to GoodsRecievedInspection
	@ManyToOne
	@JoinColumn(name="GRIRId", nullable=false)
	private GoodsRecievedInspection goodsRecievedInspection;

	public Inspection() {
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

	public String getInspectionDate() {
		return this.inspectionDate;
	}

	public void setInspectionDate(String inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public String getInspectionNo() {
		return this.inspectionNo;
	}

	public void setInspectionNo(String inspectionNo) {
		this.inspectionNo = inspectionNo;
	}

	public String getInspectionOfficer() {
		return this.inspectionOfficer;
	}

	public void setInspectionOfficer(String inspectionOfficer) {
		this.inspectionOfficer = inspectionOfficer;
	}

	public Long getInspectionTypeId() {
		return this.inspectionTypeId;
	}

	public void setInspectionTypeId(Long inspectionTypeId) {
		this.inspectionTypeId = inspectionTypeId;
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

	public Long getWarehouseId() {
		return this.warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Set<InspectionDetail> getInspectionDetails() {
		return this.inspectionDetails;
	}

	public void setInspectionDetails(Set<InspectionDetail> inspectionDetails) {
		this.inspectionDetails = inspectionDetails;
	}

	public InspectionDetail addInspectionDetail(InspectionDetail inspectionDetail) {
		getInspectionDetails().add(inspectionDetail);
		inspectionDetail.setInspection(this);

		return inspectionDetail;
	}

	public InspectionDetail removeInspectionDetail(InspectionDetail inspectionDetail) {
		getInspectionDetails().remove(inspectionDetail);
		inspectionDetail.setInspection(null);

		return inspectionDetail;
	}

	public GoodsRecievedInspection getGoodsRecievedInspection() {
		return this.goodsRecievedInspection;
	}

	public void setGoodsRecievedInspection(GoodsRecievedInspection goodsRecievedInspection) {
		this.goodsRecievedInspection = goodsRecievedInspection;
	}

}