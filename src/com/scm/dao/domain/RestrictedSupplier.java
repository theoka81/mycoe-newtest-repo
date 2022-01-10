package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the RestrictedSuppliers database table.
 * 
 */
@Entity
@Table(name="RestrictedSuppliers")
@NamedQuery(name="RestrictedSupplier.findAll", query="SELECT r FROM RestrictedSupplier r")
public class RestrictedSupplier implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RestrictedSupplierId", unique=true, nullable=false)
	private Long restrictedSupplierId;

	@Column(name="AuthorisedBy")
	private String authorisedBy;

	@Column(name="Code")
	private String code;

	@Column(name="DataIssue")
	private String dataIssue;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="IdentificationNumber")
	private String identificationNumber;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="PeriodFrom")
	private Timestamp periodFrom;

	@Column(name="PeriodTo")
	private Timestamp periodTo;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="Reason")
	private String reason;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public RestrictedSupplier() {
	}

	public Long getRestrictedSupplierId() {
		return this.restrictedSupplierId;
	}

	public void setRestrictedSupplierId(Long restrictedSupplierId) {
		this.restrictedSupplierId = restrictedSupplierId;
	}

	public String getAuthorisedBy() {
		return this.authorisedBy;
	}

	public void setAuthorisedBy(String authorisedBy) {
		this.authorisedBy = authorisedBy;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDataIssue() {
		return this.dataIssue;
	}

	public void setDataIssue(String dataIssue) {
		this.dataIssue = dataIssue;
	}

	public Timestamp getEditDate() {
		return this.editDate;
	}

	public void setEditDate(Timestamp editDate) {
		this.editDate = editDate;
	}

	public Timestamp getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getIdentificationNumber() {
		return this.identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getPeriodFrom() {
		return this.periodFrom;
	}

	public void setPeriodFrom(Timestamp periodFrom) {
		this.periodFrom = periodFrom;
	}

	public Timestamp getPeriodTo() {
		return this.periodTo;
	}

	public void setPeriodTo(Timestamp periodTo) {
		this.periodTo = periodTo;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}