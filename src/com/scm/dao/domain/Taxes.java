package com.scm.dao.domain;

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
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

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
	private Boolean isPinProvided;

	@Column(name="IsRegistered")
	private Boolean isRegistered;

	@Column(name="IsValidCertificate")
	private Boolean isValidCertificate;

	@Column(name="IsVatVendor")
	private Boolean isVatVendor;

	@Column(name="LastVerificationDate")
	private Timestamp lastVerificationDate;

	@Column(name="PayeNumber")
	private String payeNumber;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="ValidationResponse")
	private String validationResponse;

	@Column(name="VatNumber")
	private String vatNumber;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public Taxes() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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

	public Boolean getIsPinProvided() {
		return this.isPinProvided;
	}

	public void setIsPinProvided(Boolean isPinProvided) {
		this.isPinProvided = isPinProvided;
	}

	public Boolean getIsRegistered() {
		return this.isRegistered;
	}

	public void setIsRegistered(Boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public Boolean getIsValidCertificate() {
		return this.isValidCertificate;
	}

	public void setIsValidCertificate(Boolean isValidCertificate) {
		this.isValidCertificate = isValidCertificate;
	}

	public Boolean getIsVatVendor() {
		return this.isVatVendor;
	}

	public void setIsVatVendor(Boolean isVatVendor) {
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

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}