package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Wards database table.
 * 
 */
@Entity
@Table(name="Wards")
@NamedQuery(name="Ward.findAll", query="SELECT w FROM Ward w")
public class Ward implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="WardId", unique=true, nullable=false)
	private Integer wardId;

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

	@Column(name="SuburbId")
	private Integer suburbId;

	@Column(name="WardCode")
	private String wardCode;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public Ward() {
	}

	public Integer getWardId() {
		return this.wardId;
	}

	public void setWardId(Integer wardId) {
		this.wardId = wardId;
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

	public Integer getSuburbId() {
		return this.suburbId;
	}

	public void setSuburbId(Integer suburbId) {
		this.suburbId = suburbId;
	}

	public String getWardCode() {
		return this.wardCode;
	}

	public void setWardCode(String wardCode) {
		this.wardCode = wardCode;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}