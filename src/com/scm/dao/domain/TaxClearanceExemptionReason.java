package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TaxClearanceExemptionReasons database table.
 * 
 */
@Entity
@Table(name="TaxClearanceExemptionReasons")
@NamedQuery(name="TaxClearanceExemptionReason.findAll", query="SELECT t FROM TaxClearanceExemptionReason t")
public class TaxClearanceExemptionReason implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TaxClearanceExemptionReasonId", unique=true, nullable=false)
	private Integer taxClearanceExemptionReasonId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public TaxClearanceExemptionReason() {
	}

	public Integer getTaxClearanceExemptionReasonId() {
		return this.taxClearanceExemptionReasonId;
	}

	public void setTaxClearanceExemptionReasonId(Integer taxClearanceExemptionReasonId) {
		this.taxClearanceExemptionReasonId = taxClearanceExemptionReasonId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
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

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}