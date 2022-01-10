package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Accreditations database table.
 * 
 */
@Entity
@Table(name="Accreditations")
//@NamedQuery(name="Accreditation.findAll", query="SELECT a FROM Accreditation a")
@org.hibernate.annotations.Table(appliesTo = "Accreditations")
public class Accreditation implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AccreditationNumber")
	private String accreditationNumber;

	@Column(name="AccreditationStatusId")
	private Long accreditationStatusId;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="Description")
	private String description;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="ExpiryDate")
	private Timestamp expiryDate;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="IsVerified")
	private Boolean isVerified;

	@Column(name="LastVerificationDate")
	private Timestamp lastVerificationDate;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="RegistrationDate")
	private Timestamp registrationDate;

	@Column(name="StatusCode")
	private Long statusCode;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="XmlFileId", nullable=false)
	private Integer xmlFileId;

	public Accreditation() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccreditationNumber() {
		return this.accreditationNumber;
	}

	public void setAccreditationNumber(String accreditationNumber) {
		this.accreditationNumber = accreditationNumber;
	}

	public Long getAccreditationStatusId() {
		return this.accreditationStatusId;
	}

	public void setAccreditationStatusId(Long accreditationStatusId) {
		this.accreditationStatusId = accreditationStatusId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getEditDate() {
		return this.editDate;
	}

	public void setEditDate(Timestamp editDate) {
		this.editDate = editDate;
	}

	public Timestamp getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsVerified() {
		return this.isVerified;
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}

	public Timestamp getLastVerificationDate() {
		return this.lastVerificationDate;
	}

	public void setLastVerificationDate(Timestamp lastVerificationDate) {
		this.lastVerificationDate = lastVerificationDate;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Timestamp getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Long getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
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