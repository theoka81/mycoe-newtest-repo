package com.scm.dao.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * The persistent class for the PfmaSchedules database table.
 * 
 */
@Entity
@Table(name = "PfmaSchedules")
@NamedQuery(name = "PfmaSchedule.findAll", query = "SELECT p FROM PfmaSchedule p")
public class PfmaSchedule implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PfmaScheduleId", unique = true, nullable = false)
	private Long pfmaScheduleId;

	@Column(name = "Name")
	private String name;

	@Column(name = "IsActive")
	private Boolean isActive;

	@Column(name = "Code")
	private String code;

	@Column(name = "EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name = "XmlFileId")
	private Integer xmlFileId;

	@Column(name = "ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	public PfmaSchedule() {
	}

	public Long getPfmaScheduleId() {
		return pfmaScheduleId;
	}

	public void setPfmaScheduleId(Long pfmaScheduleId) {
		this.pfmaScheduleId = pfmaScheduleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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