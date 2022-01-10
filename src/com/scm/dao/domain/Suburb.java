package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Suburbs database table.
 * 
 */
@Entity
@Table(name="Suburbs")
@NamedQuery(name="Suburb.findAll", query="SELECT s FROM Suburb s")
public class Suburb implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SuburbId", unique=true, nullable=false)
	private Integer suburbId;

	@Column(name="CityId")
	private Integer cityId;

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

	@Column(name="Rural")
	private Boolean rural;

	@Column(name="Township")
	private Boolean township;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public Suburb() {
	}

	public Integer getSuburbId() {
		return this.suburbId;
	}

	public void setSuburbId(Integer suburbId) {
		this.suburbId = suburbId;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
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

	public Boolean getRural() {
		return this.rural;
	}

	public void setRural(Boolean rural) {
		this.rural = rural;
	}

	public Boolean getTownship() {
		return this.township;
	}

	public void setTownship(Boolean township) {
		this.township = township;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}