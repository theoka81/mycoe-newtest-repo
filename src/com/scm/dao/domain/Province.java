package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Provinces database table.
 * 
 */
@Entity
@Table(name="Provinces")
@NamedQuery(name="Province.findAll", query="SELECT p FROM Province p")
public class Province implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ProvinceId", unique=true, nullable=false)
	private Integer provinceId;

	@Column(name="Code")
	private String code;

	@Column(name="CountryId")
	private Integer countryId;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupportEmail")
	private String supportEmail;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public Province() {
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
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

	public String getSupportEmail() {
		return this.supportEmail;
	}

	public void setSupportEmail(String supportEmail) {
		this.supportEmail = supportEmail;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}