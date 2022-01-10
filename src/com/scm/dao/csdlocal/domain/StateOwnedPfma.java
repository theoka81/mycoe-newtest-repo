package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the StateOwnedPfmas database table.
 * 
 */
@Entity
@Table(name="StateOwnedPfmas")
@NamedQuery(name="StateOwnedPfma.findAll", query="SELECT s FROM StateOwnedPfma s")
public class StateOwnedPfma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="StateOwnedPfmaId")
	private int stateOwnedPfmaId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="PfmaSchedule")
	private String pfmaSchedule;

	@Column(name="PracticeNumber")
	private String practiceNumber;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="ProvinceId")
	private int provinceId;

	@Column(name="VerificationRegulator")
	private String verificationRegulator;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public StateOwnedPfma() {
	}

	public int getStateOwnedPfmaId() {
		return this.stateOwnedPfmaId;
	}

	public void setStateOwnedPfmaId(int stateOwnedPfmaId) {
		this.stateOwnedPfmaId = stateOwnedPfmaId;
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

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPfmaSchedule() {
		return this.pfmaSchedule;
	}

	public void setPfmaSchedule(String pfmaSchedule) {
		this.pfmaSchedule = pfmaSchedule;
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

	public int getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public String getVerificationRegulator() {
		return this.verificationRegulator;
	}

	public void setVerificationRegulator(String verificationRegulator) {
		this.verificationRegulator = verificationRegulator;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}