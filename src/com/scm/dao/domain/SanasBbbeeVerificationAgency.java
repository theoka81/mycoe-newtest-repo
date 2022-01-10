package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SanasBbbeeVerificationAgencies database table.
 * 
 */
@Entity
@Table(name="SanasBbbeeVerificationAgencies")
@NamedQuery(name="SanasBbbeeVerificationAgency.findAll", query="SELECT s FROM SanasBbbeeVerificationAgency s")
public class SanasBbbeeVerificationAgency implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SanasBbbeeVerificationAgencyId", unique=true, nullable=false)
	private Integer sanasBbbeeVerificationAgencyId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="PracticeNumber")
	private String practiceNumber;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="VerificationRegulator")
	private String verificationRegulator;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public SanasBbbeeVerificationAgency() {
	}

	public Integer getSanasBbbeeVerificationAgencyId() {
		return this.sanasBbbeeVerificationAgencyId;
	}

	public void setSanasBbbeeVerificationAgencyId(Integer sanasBbbeeVerificationAgencyId) {
		this.sanasBbbeeVerificationAgencyId = sanasBbbeeVerificationAgencyId;
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

	public String getPracticeNumber() {
		return this.practiceNumber;
	}

	public void setPracticeNumber(String practiceNumber) {
		this.practiceNumber = practiceNumber;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public String getVerificationRegulator() {
		return this.verificationRegulator;
	}

	public void setVerificationRegulator(String verificationRegulator) {
		this.verificationRegulator = verificationRegulator;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}