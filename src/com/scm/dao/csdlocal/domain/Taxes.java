package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Taxes database table.
 * 
 */
@Entity
@Table(name="Taxes")
@NamedQuery(name="Taxe.findAll", query="SELECT t FROM Taxes t")
public class Taxes implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="Field1")
	private String field1;

	@Column(name="Field2")
	private String field2;

	@Column(name="Field3")
	private String field3;

	@Column(name="IncomeTaxNumber")
	private String incomeTaxNumber;

	@Column(name="IsPinProvided")
	private boolean isPinProvided;

	@Column(name="IsRegistered")
	private boolean isRegistered;

	@Column(name="IsValidCertificate")
	private boolean isValidCertificate;

	@Column(name="IsVatVendor")
	private boolean isVatVendor;

	@Column(name="LastVerificationDate")
	private Timestamp lastVerificationDate;

	@Column(name="PayeNumber")
	private String payeNumber;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="ValidationResponse")
	private String validationResponse;

	@Column(name="VatNumber")
	private String vatNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public Taxes() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getEditDate() {
		return this.editDate;
	}

	public void setEditDate(Timestamp editDate) {
		this.editDate = editDate;
	}

	public String getField1() {
		return this.field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return this.field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return this.field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getIncomeTaxNumber() {
		return this.incomeTaxNumber;
	}

	public void setIncomeTaxNumber(String incomeTaxNumber) {
		this.incomeTaxNumber = incomeTaxNumber;
	}

	public boolean getIsPinProvided() {
		return this.isPinProvided;
	}

	public void setIsPinProvided(boolean isPinProvided) {
		this.isPinProvided = isPinProvided;
	}

	public boolean getIsRegistered() {
		return this.isRegistered;
	}

	public void setIsRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public boolean getIsValidCertificate() {
		return this.isValidCertificate;
	}

	public void setIsValidCertificate(boolean isValidCertificate) {
		this.isValidCertificate = isValidCertificate;
	}

	public boolean getIsVatVendor() {
		return this.isVatVendor;
	}

	public void setIsVatVendor(boolean isVatVendor) {
		this.isVatVendor = isVatVendor;
	}

	public Timestamp getLastVerificationDate() {
		return this.lastVerificationDate;
	}

	public void setLastVerificationDate(Timestamp lastVerificationDate) {
		this.lastVerificationDate = lastVerificationDate;
	}

	public String getPayeNumber() {
		return this.payeNumber;
	}

	public void setPayeNumber(String payeNumber) {
		this.payeNumber = payeNumber;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
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

	public String getValidationResponse() {
		return this.validationResponse;
	}

	public void setValidationResponse(String validationResponse) {
		this.validationResponse = validationResponse;
	}

	public String getVatNumber() {
		return this.vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}