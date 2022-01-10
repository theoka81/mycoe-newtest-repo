package com.scm.modal;

import java.sql.Timestamp;

public class RequisitionDetailBean {
	private Long requisitionId;
    private String lineNo;
    private String requestingUnit;
    private String orderNo;
    private String orderType;
    private Long requisitionDetailsId;
    private Long orderTypeId;
    private String commodityNo;
    private String commodityShortDescription;
    private String supplier;
    private Long supplierId;
    public Double amountUnitCost;
    public Double amountExtendedPrice;
    private Long transactionQuantity;
    private Long unitofMeasureId;
    private String unitOfMeasure;
    public Timestamp dateOrderTransaction;
    private String currencyCode;
	public Long getRequisitionId() {
		return requisitionId;
	}
	public void setRequisitionId(Long requisitionId) {
		this.requisitionId = requisitionId;
	}
	public String getLineNo() {
		return lineNo;
	}
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
	public String getRequestingUnit() {
		return requestingUnit;
	}
	public void setRequestingUnit(String requestingUnit) {
		this.requestingUnit = requestingUnit;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Long getRequisitionDetailsId() {
		return requisitionDetailsId;
	}
	public void setRequisitionDetailsId(Long requisitionDetailsId) {
		this.requisitionDetailsId = requisitionDetailsId;
	}
	public Long getOrderTypeId() {
		return orderTypeId;
	}
	public void setOrderTypeId(Long orderTypeId) {
		this.orderTypeId = orderTypeId;
	}
	public String getCommodityNo() {
		return commodityNo;
	}
	public void setCommodityNo(String commodityNo) {
		this.commodityNo = commodityNo;
	}
	public String getCommodityShortDescription() {
		return commodityShortDescription;
	}
	public void setCommodityShortDescription(String commodityShortDescription) {
		this.commodityShortDescription = commodityShortDescription;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	public Double getAmountUnitCost() {
		return amountUnitCost;
	}
	public void setAmountUnitCost(Double amountUnitCost) {
		this.amountUnitCost = amountUnitCost;
	}
	public Double getAmountExtendedPrice() {
		return amountExtendedPrice;
	}
	public void setAmountExtendedPrice(Double amountExtendedPrice) {
		this.amountExtendedPrice = amountExtendedPrice;
	}
	public Long getTransactionQuantity() {
		return transactionQuantity;
	}
	public void setTransactionQuantity(Long transactionQuantity) {
		this.transactionQuantity = transactionQuantity;
	}
	public Long getUnitofMeasureId() {
		return unitofMeasureId;
	}
	public void setUnitofMeasureId(Long unitofMeasureId) {
		this.unitofMeasureId = unitofMeasureId;
	}
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public Timestamp getDateOrderTransaction() {
		return dateOrderTransaction;
	}
	public void setDateOrderTransaction(Timestamp dateOrderTransaction) {
		this.dateOrderTransaction = dateOrderTransaction;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
    
    
}
