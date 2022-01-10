package com.scm.modal;

import java.sql.Timestamp;

import com.scm.keys.UserCodeIdKeys;

public class ContractDetailBean {

	private Long id;
	private Long contractDetailsId;
	private Long quantityOrdered;
	private Long extendedPrice;
	private Long unitPrice;
	private Long contractTypeId;
	private Long contractMasterId;
	private Long unitCost;
	private Long unitOfMeasurePrimary;
	private Long onHoldAmount;
	private Long receivedAmount;
	private Long requestingUnitId;
	private Long statusId;

	private String supplierNumber;
	private String contractNo;
	private String commodityDescription;
	private String contractTitle;
	private String lineNo;
	private String itemNo;
	private String contractStatus;
	private String contractType;
	private String procurementType;
	private String contractBeginDate;
	private String contractExpiryDate;
	private String contractStartDate;
	private String contractEndDate;
	private String originalPromisedDeliveryDate;

	
	private String supplierName;
	private String comments;

	private Timestamp createdDate;

	private Boolean isActive;
	private Boolean retentionYN;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getContractDetailsId() {
		return contractDetailsId;
	}

	public void setContractDetailsId(Long contractDetailsId) {
		this.contractDetailsId = contractDetailsId;
	}

	public Long getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(Long quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public Long getExtendedPrice() {
		return extendedPrice;
	}

	public void setExtendedPrice(Long extendedPrice) {
		this.extendedPrice = extendedPrice;
	}

	public Long getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Long getContractTypeId() {
		return contractTypeId;
	}

	public void setContractTypeId(Long contractTypeId) {
		this.contractTypeId = contractTypeId;
	}

	public Long getContractMasterId() {
		return contractMasterId;
	}

	public void setContractMasterId(Long contractMasterId) {
		this.contractMasterId = contractMasterId;
	}

	public Long getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Long unitCost) {
		this.unitCost = unitCost;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractTitle() {
		return contractTitle;
	}

	public void setContractTitle(String contractTitle) {
		this.contractTitle = contractTitle;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getProcurementType() {
		return procurementType;
	}

	public void setProcurementType(String procurementType) {
		this.procurementType = procurementType;
	}

	public String getContractBeginDate() {
		return contractBeginDate;
	}

	public void setContractBeginDate(String contractBeginDate) {
		this.contractBeginDate = contractBeginDate;
	}

	public String getContractExpiryDate() {
		return contractExpiryDate;
	}

	public void setContractExpiryDate(String contractExpiryDate) {
		this.contractExpiryDate = contractExpiryDate;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getCommodityDescription() {
		return commodityDescription;
	}

	public void setCommodityDescription(String commodityDescription) {
		this.commodityDescription = commodityDescription;
	}

	public Long getUnitOfMeasurePrimary() {
		return unitOfMeasurePrimary;
	}

	public void setUnitOfMeasurePrimary(Long unitOfMeasurePrimary) {
		this.unitOfMeasurePrimary = unitOfMeasurePrimary;
	}

	public Long getOnHoldAmount() {
		return onHoldAmount;
	}

	public void setOnHoldAmount(Long onHoldAmount) {
		this.onHoldAmount = onHoldAmount;
	}

	public Long getReceivedAmount() {
		return receivedAmount;
	}

	public void setReceivedAmount(Long receivedAmount) {
		this.receivedAmount = receivedAmount;
	}

	public Long getRequestingUnitId() {
		return requestingUnitId;
	}

	public void setRequestingUnitId(Long requestingUnitId) {
		this.requestingUnitId = requestingUnitId;
	}

	public Long getStatusId() {
		return statusId == null ? Long.valueOf(UserCodeIdKeys.ContractStatusActive):statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getSupplierNumber() {
		return supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public String getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(String contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public String getOriginalPromisedDeliveryDate() {
		return originalPromisedDeliveryDate;
	}

	public void setOriginalPromisedDeliveryDate(String originalPromisedDeliveryDate) {
		this.originalPromisedDeliveryDate = originalPromisedDeliveryDate;
	}

	public Boolean getRetentionYN() {
		return retentionYN;
	}

	public void setRetentionYN(Boolean retentionYN) {
		this.retentionYN = retentionYN;
	}

}
