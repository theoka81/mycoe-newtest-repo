package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the EthnicGroups database table.
 * 
 */
@Entity
@Table(name="EthnicGroups")
@NamedQuery(name="EthnicGroup.findAll", query="SELECT e FROM EthnicGroup e")
public class EthnicGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EthnicGroupId")
	private int ethnicGroupId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="EventCode")
	private String eventCode;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDesignatedBbbeeGroup")
	private boolean isDesignatedBbbeeGroup;

	@Column(name="Name")
	private String name;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public EthnicGroup() {
	}

	public int getEthnicGroupId() {
		return this.ethnicGroupId;
	}

	public void setEthnicGroupId(int ethnicGroupId) {
		this.ethnicGroupId = ethnicGroupId;
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

	public String getEventCode() {
		return this.eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsDesignatedBbbeeGroup() {
		return this.isDesignatedBbbeeGroup;
	}

	public void setIsDesignatedBbbeeGroup(boolean isDesignatedBbbeeGroup) {
		this.isDesignatedBbbeeGroup = isDesignatedBbbeeGroup;
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