package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BbbeeTotalAnnualTurnovers database table.
 * 
 */
@Entity
@Table(name="BbbeeTotalAnnualTurnovers")
@NamedQuery(name="BbbeeTotalAnnualTurnover.findAll", query="SELECT b FROM BbbeeTotalAnnualTurnover b")
public class BbbeeTotalAnnualTurnover implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TotalAnnualTurnoverId")
	private int totalAnnualTurnoverId;

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

	public BbbeeTotalAnnualTurnover() {
	}

	public int getTotalAnnualTurnoverId() {
		return this.totalAnnualTurnoverId;
	}

	public void setTotalAnnualTurnoverId(int totalAnnualTurnoverId) {
		this.totalAnnualTurnoverId = totalAnnualTurnoverId;
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