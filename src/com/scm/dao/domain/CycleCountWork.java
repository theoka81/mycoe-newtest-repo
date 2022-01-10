package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CycleCountWorks database table.
 * 
 */
@Entity
@Table(name="CycleCountWorks")
@NamedQuery(name="CycleCountWork.findAll", query="SELECT c FROM CycleCountWork c")
public class CycleCountWork implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="CycleCountRefNo")
	private String cycleCountRefNo;

	@Column(name="CycleCountTypeId")
	private Long cycleCountTypeId;

	@Column(name="Descriptiton")
	private String descriptiton;

	@Column(name="EndDate", nullable=false)
	private Timestamp endDate;

	@Column(name="FinancialYear")
	private String financialYear;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemGroupId")
	private Long itemGroupId;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="OriginalId", nullable=false)
	private Long originalId;

	@Column(name="PeriodicTypeId")
	private Long periodicTypeId;

	@Column(name="StartDate", nullable=false)
	private Timestamp startDate;

	@Column(name="StatusId")
	private Long statusId;

	@Column(name="TransactionTypeId")
	private Long transactionTypeId;

	@Column(name="WarehouseDetailsId")
	private Long warehouseDetailsId;

	public CycleCountWork() {
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

	public String getCycleCountRefNo() {
		return this.cycleCountRefNo;
	}

	public void setCycleCountRefNo(String cycleCountRefNo) {
		this.cycleCountRefNo = cycleCountRefNo;
	}

	public Long getCycleCountTypeId() {
		return this.cycleCountTypeId;
	}

	public void setCycleCountTypeId(Long cycleCountTypeId) {
		this.cycleCountTypeId = cycleCountTypeId;
	}

	public String getDescriptiton() {
		return this.descriptiton;
	}

	public void setDescriptiton(String descriptiton) {
		this.descriptiton = descriptiton;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getFinancialYear() {
		return this.financialYear;
	}

	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
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

	public Long getItemGroupId() {
		return this.itemGroupId;
	}

	public void setItemGroupId(Long itemGroupId) {
		this.itemGroupId = itemGroupId;
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

	public Long getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(Long originalId) {
		this.originalId = originalId;
	}

	public Long getPeriodicTypeId() {
		return this.periodicTypeId;
	}

	public void setPeriodicTypeId(Long periodicTypeId) {
		this.periodicTypeId = periodicTypeId;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public Long getTransactionTypeId() {
		return this.transactionTypeId;
	}

	public void setTransactionTypeId(Long transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public Long getWarehouseDetailsId() {
		return this.warehouseDetailsId;
	}

	public void setWarehouseDetailsId(Long warehouseDetailsId) {
		this.warehouseDetailsId = warehouseDetailsId;
	}

}