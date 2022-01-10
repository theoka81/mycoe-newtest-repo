package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BbbeeStatusLevelOfContributors database table.
 * 
 */
@Entity
@Table(name="BbbeeStatusLevelOfContributors")
@NamedQuery(name="BbbeeStatusLevelOfContributor.findAll", query="SELECT b FROM BbbeeStatusLevelOfContributor b")
public class BbbeeStatusLevelOfContributor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int BBBEEStatusLevelOfContributorId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="From1May2015Max")
	private int from1May2015Max;

	@Column(name="From1May2015Min")
	private int from1May2015Min;

	@Column(name="InterfaceValue")
	private String interfaceValue;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="NewMax")
	private int newMax;

	@Column(name="NewMin")
	private int newMin;

	@Column(name="OldMax")
	private int oldMax;

	@Column(name="OldMin")
	private int oldMin;

	@Column(name="Prior1May2015Max")
	private int prior1May2015Max;

	@Column(name="Prior1May2015Min")
	private int prior1May2015Min;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="RecognitionPercentages")
	private int recognitionPercentages;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public BbbeeStatusLevelOfContributor() {
	}

	public int getBBBEEStatusLevelOfContributorId() {
		return this.BBBEEStatusLevelOfContributorId;
	}

	public void setBBBEEStatusLevelOfContributorId(int BBBEEStatusLevelOfContributorId) {
		this.BBBEEStatusLevelOfContributorId = BBBEEStatusLevelOfContributorId;
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

	public int getFrom1May2015Max() {
		return this.from1May2015Max;
	}

	public void setFrom1May2015Max(int from1May2015Max) {
		this.from1May2015Max = from1May2015Max;
	}

	public int getFrom1May2015Min() {
		return this.from1May2015Min;
	}

	public void setFrom1May2015Min(int from1May2015Min) {
		this.from1May2015Min = from1May2015Min;
	}

	public String getInterfaceValue() {
		return this.interfaceValue;
	}

	public void setInterfaceValue(String interfaceValue) {
		this.interfaceValue = interfaceValue;
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

	public int getNewMax() {
		return this.newMax;
	}

	public void setNewMax(int newMax) {
		this.newMax = newMax;
	}

	public int getNewMin() {
		return this.newMin;
	}

	public void setNewMin(int newMin) {
		this.newMin = newMin;
	}

	public int getOldMax() {
		return this.oldMax;
	}

	public void setOldMax(int oldMax) {
		this.oldMax = oldMax;
	}

	public int getOldMin() {
		return this.oldMin;
	}

	public void setOldMin(int oldMin) {
		this.oldMin = oldMin;
	}

	public int getPrior1May2015Max() {
		return this.prior1May2015Max;
	}

	public void setPrior1May2015Max(int prior1May2015Max) {
		this.prior1May2015Max = prior1May2015Max;
	}

	public int getPrior1May2015Min() {
		return this.prior1May2015Min;
	}

	public void setPrior1May2015Min(int prior1May2015Min) {
		this.prior1May2015Min = prior1May2015Min;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public int getRecognitionPercentages() {
		return this.recognitionPercentages;
	}

	public void setRecognitionPercentages(int recognitionPercentages) {
		this.recognitionPercentages = recognitionPercentages;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}