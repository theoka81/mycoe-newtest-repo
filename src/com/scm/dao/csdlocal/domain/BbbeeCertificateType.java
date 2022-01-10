package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BbbeeCertificateTypes database table.
 * 
 */
@Entity
@Table(name="BbbeeCertificateTypes")
@NamedQuery(name="BbbeeCertificateType.findAll", query="SELECT b FROM BbbeeCertificateType b")
public class BbbeeCertificateType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CertificateTypeId")
	private int certificateTypeId;

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

	@Column(name="XmlFileId")
	private int xmlFileId;

	public BbbeeCertificateType() {
	}

	public int getCertificateTypeId() {
		return this.certificateTypeId;
	}

	public void setCertificateTypeId(int certificateTypeId) {
		this.certificateTypeId = certificateTypeId;
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

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}