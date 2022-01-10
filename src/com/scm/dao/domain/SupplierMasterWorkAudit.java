package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierMasterWorkAudits database table.
 * 
 */
@Entity
@Table(name="SupplierMasterWorkAudits")
@NamedQuery(name="SupplierMasterWorkAudit.findAll", query="SELECT s FROM SupplierMasterWorkAudit s")
public class SupplierMasterWorkAudit implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId")
	private Long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="Cluster")
	private String cluster;

	@Column(name="ClusterId")
	private Long clusterId;

	@Column(name="Company")
	private String company;

	@Column(name="CompanyId")
	private Long companyId;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="DeliveryInstructions")
	private String deliveryInstructions;

	@Column(name="Department")
	private String department;

	@Column(name="DepartmentId")
	private Long departmentId;

	@Column(name="Id")
	private Long id;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="IsDeleted")
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="LastInvoiceDate")
	private Timestamp lastInvoiceDate;

	@Column(name="LastPaymentDate")
	private Timestamp lastPaymentDate;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="OriginalId")
	private Long originalId;

	@Column(name="ParentNo")
	private String parentNo;

	@Column(name="PaymentInstrument")
	private String paymentInstrument;

	@Column(name="PaymentInstrumentId")
	private Long paymentInstrumentId;

	@Column(name="PaymentTerms")
	private String paymentTerms;

	@Column(name="PaymentTermsId")
	private Long paymentTermsId;

	@Column(name="PrintMessage")
	private String printMessage;

	@Column(name="PrintMessageId")
	private Long printMessageId;

	@Column(name="RemitType")
	private String remitType;

	@Column(name="RemitTypeId")
	private Long remitTypeId;

	@Column(name="StatusId")
	private Long statusId;

	@Column(name="SupplierCode")
	private String supplierCode;

	@Column(name="SupplierCodeId")
	private Long supplierCodeId;

	@Column(name="SupplierHold")
	private String supplierHold;

	@Column(name="SupplierHoldId")
	private Long supplierHoldId;

	@Column(name="SupplierRefId")
	private Long supplierRefId;

	@Column(name="SupplierRefNo")
	private String supplierRefNo;

	@Column(name="SupplierStatus")
	private String supplierStatus;

	@Column(name="SupplierType")
	private String supplierType;

	@Column(name="SupplierTypeId")
	private Long supplierTypeId;

	@Column(name="SupplierXRef1")
	private String supplierXRef1;

	@Column(name="SupplierXRef2")
	private String supplierXRef2;

	@Column(name="SupplierXRef3")
	private String supplierXRef3;

	@Column(name="SystemUserId")
	private Long systemUserId;

	@Column(name="Unit")
	private String unit;

	@Column(name="UnitId")
	private Long unitId;

	public SupplierMasterWorkAudit() {
	}

	public Long getAuditId() {
		return this.auditId;
	}

	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
	}

	public Long getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getCreatedBySystemUserId() {
		return this.createdBySystemUserId;
	}

	public void setCreatedBySystemUserId(Long createdBySystemUserId) {
		this.createdBySystemUserId = createdBySystemUserId;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getDeliveryInstructions() {
		return this.deliveryInstructions;
	}

	public void setDeliveryInstructions(String deliveryInstructions) {
		this.deliveryInstructions = deliveryInstructions;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Timestamp getLastInvoiceDate() {
		return this.lastInvoiceDate;
	}

	public void setLastInvoiceDate(Timestamp lastInvoiceDate) {
		this.lastInvoiceDate = lastInvoiceDate;
	}

	public Timestamp getLastPaymentDate() {
		return this.lastPaymentDate;
	}

	public void setLastPaymentDate(Timestamp lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public Long getModifiedBySystemUserId() {
		return this.modifiedBySystemUserId;
	}

	public void setModifiedBySystemUserId(Long modifiedBySystemUserId) {
		this.modifiedBySystemUserId = modifiedBySystemUserId;
	}

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
	}

	public Long getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(Long originalId) {
		this.originalId = originalId;
	}

	public String getParentNo() {
		return this.parentNo;
	}

	public void setParentNo(String parentNo) {
		this.parentNo = parentNo;
	}

	public String getPaymentInstrument() {
		return this.paymentInstrument;
	}

	public void setPaymentInstrument(String paymentInstrument) {
		this.paymentInstrument = paymentInstrument;
	}

	public Long getPaymentInstrumentId() {
		return this.paymentInstrumentId;
	}

	public void setPaymentInstrumentId(Long paymentInstrumentId) {
		this.paymentInstrumentId = paymentInstrumentId;
	}

	public String getPaymentTerms() {
		return this.paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public Long getPaymentTermsId() {
		return this.paymentTermsId;
	}

	public void setPaymentTermsId(Long paymentTermsId) {
		this.paymentTermsId = paymentTermsId;
	}

	public String getPrintMessage() {
		return this.printMessage;
	}

	public void setPrintMessage(String printMessage) {
		this.printMessage = printMessage;
	}

	public Long getPrintMessageId() {
		return this.printMessageId;
	}

	public void setPrintMessageId(Long printMessageId) {
		this.printMessageId = printMessageId;
	}

	public String getRemitType() {
		return this.remitType;
	}

	public void setRemitType(String remitType) {
		this.remitType = remitType;
	}

	public Long getRemitTypeId() {
		return this.remitTypeId;
	}

	public void setRemitTypeId(Long remitTypeId) {
		this.remitTypeId = remitTypeId;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getSupplierCode() {
		return this.supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public Long getSupplierCodeId() {
		return this.supplierCodeId;
	}

	public void setSupplierCodeId(Long supplierCodeId) {
		this.supplierCodeId = supplierCodeId;
	}

	public String getSupplierHold() {
		return this.supplierHold;
	}

	public void setSupplierHold(String supplierHold) {
		this.supplierHold = supplierHold;
	}

	public Long getSupplierHoldId() {
		return this.supplierHoldId;
	}

	public void setSupplierHoldId(Long supplierHoldId) {
		this.supplierHoldId = supplierHoldId;
	}

	public Long getSupplierRefId() {
		return this.supplierRefId;
	}

	public void setSupplierRefId(Long supplierRefId) {
		this.supplierRefId = supplierRefId;
	}

	public String getSupplierRefNo() {
		return this.supplierRefNo;
	}

	public void setSupplierRefNo(String supplierRefNo) {
		this.supplierRefNo = supplierRefNo;
	}

	public String getSupplierStatus() {
		return this.supplierStatus;
	}

	public void setSupplierStatus(String supplierStatus) {
		this.supplierStatus = supplierStatus;
	}

	public String getSupplierType() {
		return this.supplierType;
	}

	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}

	public Long getSupplierTypeId() {
		return this.supplierTypeId;
	}

	public void setSupplierTypeId(Long supplierTypeId) {
		this.supplierTypeId = supplierTypeId;
	}

	public String getSupplierXRef1() {
		return this.supplierXRef1;
	}

	public void setSupplierXRef1(String supplierXRef1) {
		this.supplierXRef1 = supplierXRef1;
	}

	public String getSupplierXRef2() {
		return this.supplierXRef2;
	}

	public void setSupplierXRef2(String supplierXRef2) {
		this.supplierXRef2 = supplierXRef2;
	}

	public String getSupplierXRef3() {
		return this.supplierXRef3;
	}

	public void setSupplierXRef3(String supplierXRef3) {
		this.supplierXRef3 = supplierXRef3;
	}

	public Long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Long getUnitId() {
		return this.unitId;
	}

	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}

}