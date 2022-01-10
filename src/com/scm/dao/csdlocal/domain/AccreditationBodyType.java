package com.scm.dao.csdlocal.domain;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AccreditationBodyTypeId")
	private int accreditationBodyTypeId;

	@Column(name="AccreditationNumberLabel")
	private String accreditationNumberLabel;

	@Column(name="Code")
	private String code;

	@Column(name="Description")
	private String description;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsVerificationNeeded")
	private boolean isVerificationNeeded;

	@Column(name="Name")
	private String name;

	@Column(name="ParentAccreditationBodyTypeId")
	private int parentAccreditationBodyTypeId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="Selectable")
	private boolean selectable;

	@Column(name="ServiceUrl")
	private String serviceUrl;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public AccreditationBodyType() {
	}

	public int getAccreditationBodyTypeId() {
		return this.accreditationBodyTypeId;
	}

	public void setAccreditationBodyTypeId(int accreditationBodyTypeId) {
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

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsVerificationNeeded() {
		return this.isVerificationNeeded;
	}

	public void setIsVerificationNeeded(boolean isVerificationNeeded) {
		this.isVerificationNeeded = isVerificationNeeded;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentAccreditationBodyTypeId() {
		return this.parentAccreditationBodyTypeId;
	}

	public void setParentAccreditationBodyTypeId(int parentAccreditationBodyTypeId) {
		this.parentAccreditationBodyTypeId = parentAccreditationBodyTypeId;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public boolean getSelectable() {
		return this.selectable;
	}

	public void setSelectable(boolean selectable) {
		this.selectable = selectable;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}