package com.scm.dao.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the StateOwnedPfmas database table.
 * 
 */
@Entity
@Table(name="StateOwnedPfmas")
@NamedQuery(name="StateOwnedPfma.findAll", query="SELECT s FROM StateOwnedPfma s")
public class StateOwnedPfma implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StateOwnedPfmaId", unique = true, nullable = false)
	private Long stateOwnedPfmaId;
	
	@Column(name = "ProvinceId")
	private Long provinceId;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "VerificationRegulator")
	private String verificationRegulator;
	
	@Column(name = "PracticeNumber")
	private String practiceNumber;
	
	@Column(name = "IsActive")
	private Boolean isActive;
	
	@Column(name = "Code")
	private String code;
	
	@Column(name = "PfmaSchedule")
	private String pfmaSchedule;
	
	@Column(name = "EffectiveDate")
	private Timestamp effectiveDate;
	
	@Column(name = "XmlFileId")
	private Long xmlFileId;
	
	@Column(name = "ProcessedTimeStamp")
	private Timestamp processedTimeStamp;
	
	
	public StateOwnedPfma() {
	}


	public Long getStateOwnedPfmaId() {
		return stateOwnedPfmaId;
	}


	public void setStateOwnedPfmaId(Long stateOwnedPfmaId) {
		this.stateOwnedPfmaId = stateOwnedPfmaId;
	}


	public Long getProvinceId() {
		return provinceId;
	}


	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVerificationRegulator() {
		return verificationRegulator;
	}


	public void setVerificationRegulator(String verificationRegulator) {
		this.verificationRegulator = verificationRegulator;
	}


	public String getPracticeNumber() {
		return practiceNumber;
	}


	public void setPracticeNumber(String practiceNumber) {
		this.practiceNumber = practiceNumber;
	}


	public Boolean isActive() {
		return isActive;
	}


	public void setActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getPfmaSchedule() {
		return pfmaSchedule;
	}


	public void setPfmaSchedule(String pfmaSchedule) {
		this.pfmaSchedule = pfmaSchedule;
	}


	public Timestamp getEffectiveDate() {
		return effectiveDate;
	}


	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}


	public Long getXmlFileId() {
		return xmlFileId;
	}


	public void setXmlFileId(Long xmlFileId) {
		this.xmlFileId = xmlFileId;
	}


	public Timestamp getProcessedTimeStamp() {
		return processedTimeStamp;
	}


	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

}