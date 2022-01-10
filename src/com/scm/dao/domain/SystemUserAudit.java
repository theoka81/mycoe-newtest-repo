package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SystemUserAudits database table.
 * 
 */
@Entity
@Table(name="SystemUserAudits")
@NamedQuery(name="SystemUserAudit.findAll", query="SELECT s FROM SystemUserAudit s")
public class SystemUserAudit implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId", unique=true, nullable=false)
	private Long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="Code")
	private String code;

	@Column(name="CompanyName")
	private String companyName;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="Designation")
	private String designation;

	@Column(name="EmailAddress")
	private String emailAddress;

	@Column(name="FirstName")
	private String firstName;

	@Column(name="Id", nullable=false)
	private Long id;

	@Column(name="IdentificationNumber")
	private String identificationNumber;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="IsPasswordReset", nullable=false)
	private Boolean isPasswordReset;

	@Column(name="IsTemporaryPassword", nullable=false)
	private Boolean isTemporaryPassword;

	@Column(name="LastName")
	private String lastName;

	@Column(name="MaaaNumber")
	private String maaaNumber;

	@Column(name="MobileNumber")
	private String mobileNumber;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="StatusId")
	private String statusId;

	@Column(name="SystemUserId")
	private Long systemUserId;

	@Column(name="SystemUserTypeId")
	private String systemUserTypeId;

	@Column(name="UserName")
	private String userName;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public SystemUserAudit() {
	}

	public Long getAuditId() {
		return this.auditId;
	}

	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentificationNumber() {
		return this.identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
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

	public Boolean getIsPasswordReset() {
		return this.isPasswordReset;
	}

	public void setIsPasswordReset(Boolean isPasswordReset) {
		this.isPasswordReset = isPasswordReset;
	}

	public Boolean getIsTemporaryPassword() {
		return this.isTemporaryPassword;
	}

	public void setIsTemporaryPassword(Boolean isTemporaryPassword) {
		this.isTemporaryPassword = isTemporaryPassword;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaaaNumber() {
		return this.maaaNumber;
	}

	public void setMaaaNumber(String maaaNumber) {
		this.maaaNumber = maaaNumber;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
	}

	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public Long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public String getSystemUserTypeId() {
		return this.systemUserTypeId;
	}

	public void setSystemUserTypeId(String systemUserTypeId) {
		this.systemUserTypeId = systemUserTypeId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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