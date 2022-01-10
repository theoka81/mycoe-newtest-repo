package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the AccreditationBodyTypes database table.
 * 
 */
@Entity
@Table(name="AccreditationBodyTypes")
@NamedQuery(name="AccreditationBodyType.findAll", query="SELECT a FROM AccreditationBodyType a")
public class AccreditationBodyType implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AccreditationBodyTypeId", unique=true, nullable=false)
	private Integer accreditationBodyTypeId;

	@Column(name="AccreditationNumberLabel")
	private String accreditationNumberLabel;

	@Column(name="Code")
	private String code;

	@Column(name="Description")
	private String description;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="IsVerificationNeeded")
	private Boolean isVerificationNeeded;

	@Column(name="Name")
	private String name;

	@Column(name="ParentAccreditationBodyTypeId")
	private Integer parentAccreditationBodyTypeId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="Selectable")
	private Boolean selectable;

	@Column(name="ServiceUrl")
	private String serviceUrl;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public AccreditationBodyType() {
	}

	public Integer getAccreditationBodyTypeId() {
		return this.accreditationBodyTypeId;
	}

	public void setAccreditationBodyTypeId(Integer accreditationBodyTypeId) {
		this.accreditationBodyTypeId = accreditationBodyTypeId;
	}

	public String getAccreditationNumberLabel() {
		return this.accreditationNumberLabel;
	}

	public void setAccreditationNumberLabel(String accreditationNumberLabel) {
		this.accreditationNumberLabel = accreditationNumberLabel;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsVerificationNeeded() {
		return this.isVerificationNeeded;
	}

	public void setIsVerificationNeeded(Boolean isVerificationNeeded) {
		this.isVerificationNeeded = isVerificationNeeded;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentAccreditationBodyTypeId() {
		return this.parentAccreditationBodyTypeId;
	}

	public void setParentAccreditationBodyTypeId(Integer parentAccreditationBodyTypeId) {
		this.parentAccreditationBodyTypeId = parentAccreditationBodyTypeId;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Boolean getSelectable() {
		return this.selectable;
	}

	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}