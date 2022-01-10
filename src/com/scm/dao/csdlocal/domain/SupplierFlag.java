package com.scm.dao.csdlocal.domain;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierFlagLastVerificationDate")
	private Timestamp supplierFlagLastVerificationDate;

	@Column(name="SupplierFlagType")
	private String supplierFlagType;

	@Column(name="SupplierFlagTypeId")
	private long supplierFlagTypeId;

	@Column(name="SupplierFlagValue")
	private boolean supplierFlagValue;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public SupplierFlag() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
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

	public long getSupplierFlagTypeId() {
		return this.supplierFlagTypeId;
	}

	public void setSupplierFlagTypeId(long supplierFlagTypeId) {
		this.supplierFlagTypeId = supplierFlagTypeId;
	}

	public boolean getSupplierFlagValue() {
		return this.supplierFlagValue;
	}

	public void setSupplierFlagValue(boolean supplierFlagValue) {
		this.supplierFlagValue = supplierFlagValue;
	}

	public long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierNumber() {
		return this.supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}