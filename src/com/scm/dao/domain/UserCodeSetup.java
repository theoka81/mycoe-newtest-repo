package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the UserCodeSetups database table.
 * 
 */
@Entity
@Table(name="UserCodeSetups")
@NamedQuery(name="UserCodeSetup.findAll", query="SELECT u FROM UserCodeSetup u")
public class UserCodeSetup implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CodeLength")
	private Long codeLength;

	@Column(name="CodeSeqNo")
	private Long codeSeqNo;

	@Column(name="CodeType")
	private String codeType;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="Description")
	private String description;

	@Column(name="Description2Desired", nullable=false)
	private Boolean description2Desired;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="IsNumeric", nullable=false)
	private Boolean isNumeric;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ModuleId")
	private Long moduleId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public UserCodeSetup() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodeLength() {
		return this.codeLength;
	}

	public void setCodeLength(Long codeLength) {
		this.codeLength = codeLength;
	}

	public Long getCodeSeqNo() {
		return this.codeSeqNo;
	}

	public void setCodeSeqNo(Long codeSeqNo) {
		this.codeSeqNo = codeSeqNo;
	}

	public String getCodeType() {
		return this.codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getDescription2Desired() {
		return this.description2Desired;
	}

	public void setDescription2Desired(Boolean description2Desired) {
		this.description2Desired = description2Desired;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Boolean getIsNumeric() {
		return this.isNumeric;
	}

	public void setIsNumeric(Boolean isNumeric) {
		this.isNumeric = isNumeric;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public SystemUser getSystemUser1() {
		return this.systemUser1;
	}

	public void setSystemUser1(SystemUser systemUser1) {
		this.systemUser1 = systemUser1;
	}

	public SystemUser getSystemUser2() {
		return this.systemUser2;
	}

	public void setSystemUser2(SystemUser systemUser2) {
		this.systemUser2 = systemUser2;
	}

}