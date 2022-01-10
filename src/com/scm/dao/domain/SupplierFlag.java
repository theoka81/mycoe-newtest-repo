package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierFlags database table.
 * 
 */
@Entity
@Table(name="SupplierFlags")
@NamedQuery(name="SupplierFlag.findAll", query="SELECT s FROM SupplierFlag s")
public class SupplierFlag implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierFlagLastVerificationDate")
	private Timestamp supplierFlagLastVerificationDate;

	@Column(name="SupplierFlagType", nullable=false)
	private String supplierFlagType;

	@Column(name="SupplierFlagTypeId", nullable=false)
	private Long supplierFlagTypeId;

	@Column(name="SupplierFlagValue")
	private Boolean supplierFlagValue;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public SupplierFlag() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Timestamp getSupplierFlagLastVerificationDate() {
		return this.supplierFlagLastVerificationDate;
	}

	public void setSupplierFlagLastVerificationDate(Timestamp supplierFlagLastVerificationDate) {
		this.supplierFlagLastVerificationDate = supplierFlagLastVerificationDate;
	}

	public String getSupplierFlagType() {
		return this.supplierFlagType;
	}

	public void setSupplierFlagType(String supplierFlagType) {
		this.supplierFlagType = supplierFlagType;
	}

	public Long getSupplierFlagTypeId() {
		return this.supplierFlagTypeId;
	}

	public void setSupplierFlagTypeId(Long supplierFlagTypeId) {
		this.supplierFlagTypeId = supplierFlagTypeId;
	}

	public Boolean getSupplierFlagValue() {
		return this.supplierFlagValue;
	}

	public void setSupplierFlagValue(Boolean supplierFlagValue) {
		this.supplierFlagValue = supplierFlagValue;
	}

	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierNumber() {
		return this.supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}