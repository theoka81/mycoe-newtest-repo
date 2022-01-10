package com.scm.dao.csdlocal.domain;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SuburbId")
	private int suburbId;

	@Column(name="CityId")
	private int cityId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="Rural")
	private boolean rural;

	@Column(name="Township")
	private boolean township;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public Suburb() {
	}

	public int getSuburbId() {
		return this.suburbId;
	}

	public void setSuburbId(int suburbId) {
		this.suburbId = suburbId;
	}

	public int getCityId() {
		return this.cityId;
	}

	public void setCityId(int cityId) {
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

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public boolean getRural() {
		return this.rural;
	}

	public void setRural(boolean rural) {
		this.rural = rural;
	}

	public boolean getTownship() {
		return this.township;
	}

	public void setTownship(boolean township) {
		this.township = township;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}