package com.scm.modal;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class IPWBean {
	
	private Long id;
	private String contractNo;
	private Long contractId;
	private String ipwReference;
	private Timestamp createdDate;
	private Timestamp startDate;
	private Timestamp endDate;
	private Timestamp dateIssuedToSupplier;
	private String comments;
	private String supplierReferenceNo;
	private Boolean isActive;
	private Long statusId;
	private String legalName;
	private BigDecimal amount;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public Long getContractId() {
		return contractId;
	}
	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}
	public String getIpwReference() {
		return ipwReference;
	}
	public void setIpwReference(String ipwReference) {
		this.ipwReference = ipwReference;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	public Timestamp getDateIssuedToSupplier() {
		return dateIssuedToSupplier;
	}
	public void setDateIssuedToSupplier(Timestamp dateIssuedToSupplier) {
		this.dateIssuedToSupplier = dateIssuedToSupplier;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getSupplierReferenceNo() {
		return supplierReferenceNo;
	}
	public void setSupplierReferenceNo(String supplierReferenceNo) {
		this.supplierReferenceNo = supplierReferenceNo;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Long getStatusId() {
		return statusId;
	}
	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}
	public String getLegalName() {
		return legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	

}
