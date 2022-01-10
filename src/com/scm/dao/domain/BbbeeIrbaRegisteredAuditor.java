package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the BbbeeIrbaRegisteredAuditors database table.
 * 
 */
@Entity
@Table(name="BbbeeIrbaRegisteredAuditors")
@NamedQuery(name="BbbeeIrbaRegisteredAuditor.findAll", query="SELECT b FROM BbbeeIrbaRegisteredAuditor b")
public class BbbeeIrbaRegisteredAuditor implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IrbaRegisteredAuditorId", unique=true, nullable=false)
	private Integer irbaRegisteredAuditorId;

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
	private Boolean isActive;

	@Column(name="PracticeNumber")
	private String practiceNumber;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	//bi-directional many-to-one association to Bbbee
	@OneToMany(mappedBy="bbbeeIrbaRegisteredAuditor")
	private Set<Bbbee> bbbees;

	public BbbeeIrbaRegisteredAuditor() {
	}

	public Integer getIrbaRegisteredAuditorId() {
		return this.irbaRegisteredAuditorId;
	}

	public void setIrbaRegisteredAuditorId(Integer irbaRegisteredAuditorId) {
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

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
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

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public Set<Bbbee> getBbbees() {
		return this.bbbees;
	}

	public void setBbbees(Set<Bbbee> bbbees) {
		this.bbbees = bbbees;
	}

	public Bbbee addBbbee(Bbbee bbbee) {
		getBbbees().add(bbbee);
		bbbee.setBbbeeIrbaRegisteredAuditor(this);

		return bbbee;
	}

	public Bbbee removeBbbee(Bbbee bbbee) {
		getBbbees().remove(bbbee);
		bbbee.setBbbeeIrbaRegisteredAuditor(null);

		return bbbee;
	}

}