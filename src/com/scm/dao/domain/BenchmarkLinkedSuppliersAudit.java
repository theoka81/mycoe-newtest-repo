package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BenchmarkLinkedSuppliersAudits database table.
 * 
 */
@Entity
@Table(name="BenchmarkLinkedSuppliersAudits")
@NamedQuery(name="BenchmarkLinkedSuppliersAudit.findAll", query="SELECT b FROM BenchmarkLinkedSuppliersAudit b")
public class BenchmarkLinkedSuppliersAudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId")
	private long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="Id")
	private long id;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="IsLocked")
	private boolean isLocked;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="PriceBencmarkId")
	private long priceBencmarkId;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierName")
	private String supplierName;

	@Column(name="SupplierReferenceNo")
	private String supplierReferenceNo;

	@Column(name="SystemUserId")
	private long systemUserId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public BenchmarkLinkedSuppliersAudit() {
	}

	public long getAuditId() {
		return this.auditId;
	}

	public void setAuditId(long auditId) {
		this.auditId = auditId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
	}

	public long getPriceBencmarkId() {
		return this.priceBencmarkId;
	}

	public void setPriceBencmarkId(long priceBencmarkId) {
		this.priceBencmarkId = priceBencmarkId;
	}

	public long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierReferenceNo() {
		return this.supplierReferenceNo;
	}

	public void setSupplierReferenceNo(String supplierReferenceNo) {
		this.supplierReferenceNo = supplierReferenceNo;
	}

	public long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public SystemUser getSystemUser1() {
		return this.systemUser1;
	}

	public void setSystemUser1(SystemUser systemUser1) {
		this.systemUser1 = systemUser1;
	}

	public SystemUser getSystemUser2() {
		return this.systemUser2;
	}

	public void setSystemUser2(SystemUser systemUser2) {
		this.systemUser2 = systemUser2;
	}

}