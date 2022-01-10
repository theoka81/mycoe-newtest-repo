package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BusinessStatus database table.
 * 
 */
@Entity
@NamedQuery(name="BusinessStatus.findAll", query="SELECT b FROM BusinessStatus b")
public class BusinessStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BusinessStatusId")
	private int businessStatusId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="Impact")
	private String impact;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public BusinessStatus() {
	}

	public int getBusinessStatusId() {
		return this.businessStatusId;
	}

	public void setBusinessStatusId(int businessStatusId) {
		this.businessStatusId = businessStatusId;
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

	public String getImpact() {
		return this.impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
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

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}