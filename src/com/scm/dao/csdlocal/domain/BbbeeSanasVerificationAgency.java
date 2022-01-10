package com.scm.dao.csdlocal.domain;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SanasVerificationAgencyId")
	private int sanasVerificationAgencyId;

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

	@Column(name="Status")
	private String status;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public BbbeeSanasVerificationAgency() {
	}

	public int getSanasVerificationAgencyId() {
		return this.sanasVerificationAgencyId;
	}

	public void setSanasVerificationAgencyId(int sanasVerificationAgencyId) {
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}