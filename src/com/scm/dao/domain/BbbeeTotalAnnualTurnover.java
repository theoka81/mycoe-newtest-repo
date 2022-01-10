package com.scm.dao.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the BbbeeTotalAnnualTurnovers database table.
 * 
 */
@Entity
@Table(name="BbbeeTotalAnnualTurnovers")
@NamedQuery(name="BbbeeTotalAnnualTurnover.findAll", query="SELECT b FROM BbbeeTotalAnnualTurnover b")
public class BbbeeTotalAnnualTurnover implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TotalAnnualTurnoverId", unique=true, nullable=false)
	private Long totalAnnualTurnoverId;

	@Column(name="Name")
	private String name;
	
	@Column(name="Status")
	private String status;
	
	@Column(name="IsActive")
	private Boolean isActive;
	
	@Column(name="Code")
	private String code;
	
	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;
	
	@Column(name="XmlFileId")
	private Integer xmlFileId;
	
	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;
	
	public BbbeeTotalAnnualTurnover() {
	}

	public Long getTotalAnnualTurnoverId() {
		return totalAnnualTurnoverId;
	}

	public void setTotalAnnualTurnoverId(Long totalAnnualTurnoverId) {
		this.totalAnnualTurnoverId = totalAnnualTurnoverId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Integer getXmlFileId() {
		return xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public Timestamp getProcessedTimeStamp() {
		return processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

}