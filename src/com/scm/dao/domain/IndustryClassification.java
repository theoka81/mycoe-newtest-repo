package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the IndustryClassifications database table.
 * 
 */
@Entity
@Table(name="IndustryClassifications")
@NamedQuery(name="IndustryClassification.findAll", query="SELECT i FROM IndustryClassification i")
public class IndustryClassification implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IndustryClassificationId", unique=true, nullable=false)
	private Integer industryClassificationId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="ParentIndustryClassificationId")
	private Integer parentIndustryClassificationId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public IndustryClassification() {
	}

	public Integer getIndustryClassificationId() {
		return this.industryClassificationId;
	}

	public void setIndustryClassificationId(Integer industryClassificationId) {
		this.industryClassificationId = industryClassificationId;
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

	public Integer getParentIndustryClassificationId() {
		return this.parentIndustryClassificationId;
	}

	public void setParentIndustryClassificationId(Integer parentIndustryClassificationId) {
		this.parentIndustryClassificationId = parentIndustryClassificationId;
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