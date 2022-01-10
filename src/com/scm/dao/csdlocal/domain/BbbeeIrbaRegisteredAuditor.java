package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BbbeeIrbaRegisteredAuditors database table.
 * 
 */
@Entity
@Table(name="BbbeeIrbaRegisteredAuditors")
@NamedQuery(name="BbbeeIrbaRegisteredAuditor.findAll", query="SELECT b FROM BbbeeIrbaRegisteredAuditor b")
public class BbbeeIrbaRegisteredAuditor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IrbaRegisteredAuditorId")
	private int irbaRegisteredAuditorId;

	@Column(name="AuditFirm")
	private String auditFirm;

	@Column(name="AuditorName")
	private String auditorName;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="IrbaNumber")
	private String irbaNumber;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="PracticeNumber")
	private String practiceNumber;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public BbbeeIrbaRegisteredAuditor() {
	}

	public int getIrbaRegisteredAuditorId() {
		return this.irbaRegisteredAuditorId;
	}

	public void setIrbaRegisteredAuditorId(int irbaRegisteredAuditorId) {
		this.irbaRegisteredAuditorId = irbaRegisteredAuditorId;
	}

	public String getAuditFirm() {
		return this.auditFirm;
	}

	public void setAuditFirm(String auditFirm) {
		this.auditFirm = auditFirm;
	}

	public String getAuditorName() {
		return this.auditorName;
	}

	public void setAuditorName(String auditorName) {
		this.auditorName = auditorName;
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

	public String getIrbaNumber() {
		return this.irbaNumber;
	}

	public void setIrbaNumber(String irbaNumber) {
		this.irbaNumber = irbaNumber;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getPracticeNumber() {
		return this.practiceNumber;
	}

	public void setPracticeNumber(String practiceNumber) {
		this.practiceNumber = practiceNumber;
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