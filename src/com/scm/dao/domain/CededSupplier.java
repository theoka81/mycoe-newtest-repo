package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CededSuppliers database table.
 * 
 */
@Entity
@Table(name="CededSuppliers")
@NamedQuery(name="CededSupplier.findAll", query="SELECT c FROM CededSupplier c")
public class CededSupplier implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AuthoriseDate")
	private Timestamp authoriseDate;

	@Column(name="AuthoriseUser")
	private String authoriseUser;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="SupplierEndDate")
	private Timestamp supplierEndDate;

	@Column(name="SupplierFileReference")
	private String supplierFileReference;

	@Column(name="SupplierId", nullable=false)
	private Long supplierId;

	@Column(name="SupplierName")
	private String supplierName;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="SupplierPaymentInstrument")
	private String supplierPaymentInstrument;

	@Column(name="SupplierPostalAddress")
	private String supplierPostalAddress;

	@Column(name="SupplierPostalCode")
	private String supplierPostalCode;

	@Column(name="SupplierStartDate")
	private Timestamp supplierStartDate;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public CededSupplier() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getAuthoriseDate() {
		return this.authoriseDate;
	}

	public void setAuthoriseDate(Timestamp authoriseDate) {
		this.authoriseDate = authoriseDate;
	}

	public String getAuthoriseUser() {
		return this.authoriseUser;
	}

	public void setAuthoriseUser(String authoriseUser) {
		this.authoriseUser = authoriseUser;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
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

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Timestamp getSupplierEndDate() {
		return this.supplierEndDate;
	}

	public void setSupplierEndDate(Timestamp supplierEndDate) {
		this.supplierEndDate = supplierEndDate;
	}

	public String getSupplierFileReference() {
		return this.supplierFileReference;
	}

	public void setSupplierFileReference(String supplierFileReference) {
		this.supplierFileReference = supplierFileReference;
	}

	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierNumber() {
		return this.supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public String getSupplierPaymentInstrument() {
		return this.supplierPaymentInstrument;
	}

	public void setSupplierPaymentInstrument(String supplierPaymentInstrument) {
		this.supplierPaymentInstrument = supplierPaymentInstrument;
	}

	public String getSupplierPostalAddress() {
		return this.supplierPostalAddress;
	}

	public void setSupplierPostalAddress(String supplierPostalAddress) {
		this.supplierPostalAddress = supplierPostalAddress;
	}

	public String getSupplierPostalCode() {
		return this.supplierPostalCode;
	}

	public void setSupplierPostalCode(String supplierPostalCode) {
		this.supplierPostalCode = supplierPostalCode;
	}

	public Timestamp getSupplierStartDate() {
		return this.supplierStartDate;
	}

	public void setSupplierStartDate(Timestamp supplierStartDate) {
		this.supplierStartDate = supplierStartDate;
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