package com.scm.modal;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SroBean {

	private Long id;
	private Long contractId;
	private String contractNo;
	private String sroReference;
	private Timestamp createdDate;
	private String comments;
	private Long percentage;
	private Boolean activeFlag;;
	private String departmentProjectManager;
	private String legalName;
	private Long statusId;
	private String supplierReferenceNo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getContractId() {
		return contractId;
	}
	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getSroReference() {
		return sroReference;
	}
	public void setSroReference(String sroReference) {
		this.sroReference = sroReference;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Long getPercentage() {
		return percentage;
	}
	public void setPercentage(Long percentage) {
		this.percentage = percentage;
	}
	public String getDepartmentProjectManager() {
		return departmentProjectManager;
	}
	public void setDepartmentProjectManager(String departmentProjectManager) {
		this.departmentProjectManager = departmentProjectManager;
	}
	public String getLegalName() {
		return legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public Boolean getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	public Long getStatusId() {
		return statusId;
	}
	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}
	public String getSupplierReferenceNo() {
		return supplierReferenceNo;
	}
	public void setSupplierReferenceNo(String supplierReferenceNo) {
		this.supplierReferenceNo = supplierReferenceNo;
	}
	
	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public String getFormattedCreatedDate() {
		return createdDate!=null?df.format(createdDate):"";
	}

	
}
