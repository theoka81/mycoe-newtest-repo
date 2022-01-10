package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BbbeeSanasVerificationAgencies database table.
 * 
 */
@Entity
@Table(name="BbbeeSanasVerificationAgencies")
@NamedQuery(name="BbbeeSanasVerificationAgency.findAll", query="SELECT b FROM BbbeeSanasVerificationAgency b")
public class BbbeeSanasVerificationAgency implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SanasVerificationAgencyId", unique=true, nullable=false)
	private Integer sanasVerificationAgencyId;

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

	@Column(name="Status")
	private String status;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public BbbeeSanasVerificationAgency() {
	}

	public Integer getSanasVerificationAgencyId() {
		return this.sanasVerificationAgencyId;
	}

	public void setSanasVerificationAgencyId(Integer sanasVerificationAgencyId) {
		this.sanasVerificationAgencyId = sanasVerificationAgencyId;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}