package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the BbbeeStatusLevelOfContributors database table.
 * 
 */
@Entity
@Table(name="BbbeeStatusLevelOfContributors")
@NamedQuery(name="BbbeeStatusLevelOfContributor.findAll", query="SELECT b FROM BbbeeStatusLevelOfContributor b")
public class BbbeeStatusLevelOfContributor implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer BBBEEStatusLevelOfContributorId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="From1May2015Max")
	private Integer from1May2015Max;

	@Column(name="From1May2015Min")
	private Integer from1May2015Min;

	@Column(name="InterfaceValue")
	private String interfaceValue;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="NewMax")
	private Integer newMax;

	@Column(name="NewMin")
	private Integer newMin;

	@Column(name="OldMax")
	private Integer oldMax;

	@Column(name="OldMin")
	private Integer oldMin;

	@Column(name="Prior1May2015Max")
	private Integer prior1May2015Max;

	@Column(name="Prior1May2015Min")
	private Integer prior1May2015Min;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="RecognitionPercentages")
	private Integer recognitionPercentages;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	//bi-directional many-to-one association to Bbbee
	@OneToMany(mappedBy="bbbeeStatusLevelOfContributor")
	private Set<Bbbee> bbbees;

	public BbbeeStatusLevelOfContributor() {
	}

	public Integer getBBBEEStatusLevelOfContributorId() {
		return this.BBBEEStatusLevelOfContributorId;
	}

	public void setBBBEEStatusLevelOfContributorId(Integer BBBEEStatusLevelOfContributorId) {
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

	public Integer getFrom1May2015Max() {
		return this.from1May2015Max;
	}

	public void setFrom1May2015Max(Integer from1May2015Max) {
		this.from1May2015Max = from1May2015Max;
	}

	public Integer getFrom1May2015Min() {
		return this.from1May2015Min;
	}

	public void setFrom1May2015Min(Integer from1May2015Min) {
		this.from1May2015Min = from1May2015Min;
	}

	public String getInterfaceValue() {
		return this.interfaceValue;
	}

	public void setInterfaceValue(String interfaceValue) {
		this.interfaceValue = interfaceValue;
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

	public Integer getNewMax() {
		return this.newMax;
	}

	public void setNewMax(Integer newMax) {
		this.newMax = newMax;
	}

	public Integer getNewMin() {
		return this.newMin;
	}

	public void setNewMin(Integer newMin) {
		this.newMin = newMin;
	}

	public Integer getOldMax() {
		return this.oldMax;
	}

	public void setOldMax(Integer oldMax) {
		this.oldMax = oldMax;
	}

	public Integer getOldMin() {
		return this.oldMin;
	}

	public void setOldMin(Integer oldMin) {
		this.oldMin = oldMin;
	}

	public Integer getPrior1May2015Max() {
		return this.prior1May2015Max;
	}

	public void setPrior1May2015Max(Integer prior1May2015Max) {
		this.prior1May2015Max = prior1May2015Max;
	}

	public Integer getPrior1May2015Min() {
		return this.prior1May2015Min;
	}

	public void setPrior1May2015Min(Integer prior1May2015Min) {
		this.prior1May2015Min = prior1May2015Min;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Integer getRecognitionPercentages() {
		return this.recognitionPercentages;
	}

	public void setRecognitionPercentages(Integer recognitionPercentages) {
		this.recognitionPercentages = recognitionPercentages;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public Set<Bbbee> getBbbees() {
		return this.bbbees;
	}

	public void setBbbees(Set<Bbbee> bbbees) {
		this.bbbees = bbbees;
	}

	public Bbbee addBbbee(Bbbee bbbee) {
		getBbbees().add(bbbee);
		bbbee.setBbbeeStatusLevelOfContributor(this);

		return bbbee;
	}

	public Bbbee removeBbbee(Bbbee bbbee) {
		getBbbees().remove(bbbee);
		bbbee.setBbbeeStatusLevelOfContributor(null);

		return bbbee;
	}

}