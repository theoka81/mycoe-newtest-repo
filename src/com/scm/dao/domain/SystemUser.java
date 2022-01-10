package com.scm.dao.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the SystemUsers database table.
 * 
 */
@Entity
@Table(name = "SystemUsers")
@NamedQuery(name = "SystemUser.findAll", query = "SELECT s FROM SystemUser s")
public class SystemUser implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	private Long id;

	@Column(name = "Code")
	private String code;

	@Column(name = "CompanyName")
	private String companyName;

	@Column(name = "CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name = "Designation")
	private String designation;

	@Column(name = "EmailAddress")
	private String emailAddress;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "IdentificationNumber")
	private String identificationNumber;

	@Column(name = "IsActive", nullable = false)
	private Boolean isActive;

	@Column(name = "IsDeleted", nullable = false)
	private Boolean isDeleted;

	@Column(name = "IsLocked")
	private Boolean isLocked;

	@Column(name = "IsPasswordReset", nullable = false)
	private Boolean isPasswordReset;

	@Column(name = "IsTemporaryPassword", nullable = false)
	private Boolean isTemporaryPassword;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "MaaaNumber")
	private String maaaNumber;

	@Column(name = "MobileNumber")
	private String mobileNumber;

	@Column(name = "ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name = "StatusId")
	private String statusId;

	@Column(name = "SystemUserTypeId")
	private String systemUserTypeId;

	@Column(name = "UserName")
	private String userName;

	@Column(name = "Password")
	private String password;

	// bi-directional many-to-one association to ApprovalTemplate
	@OneToMany(mappedBy = "systemUser1")
	private Set<ApprovalTemplate> approvalTemplates1;

	// bi-directional many-to-one association to ApprovalTemplate
	@OneToMany(mappedBy = "systemUser2")
	private Set<ApprovalTemplate> approvalTemplates2;

	// bi-directional many-to-one association to Location
	@OneToMany(mappedBy = "systemUser1")
	private Set<Location> locations1;

	// bi-directional many-to-one association to Location
	@OneToMany(mappedBy = "systemUser2")
	private Set<Location> locations2;

	// bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name = "CreatedBySystemUserId")
	private SystemUser systemUser1;

	// bi-directional many-to-one association to SystemUser
	@OneToMany(mappedBy = "systemUser1")
	private Set<SystemUser> systemUsers1;

	// bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name = "ModifiedBySystemUserId")
	private SystemUser systemUser2;

	// bi-directional many-to-one association to SystemUser
	@OneToMany(mappedBy = "systemUser2")
	private Set<SystemUser> systemUsers2;

	// bi-directional many-to-one association to UserCodeSetup
	@OneToMany(mappedBy = "systemUser1")
	private Set<UserCodeSetup> userCodeSetups1;

	// bi-directional many-to-one association to UserCodeSetup
	@OneToMany(mappedBy = "systemUser2")
	private Set<UserCodeSetup> userCodeSetups2;

	// bi-directional many-to-one association to UserCode
	@OneToMany(mappedBy = "systemUser1")
	private Set<UserCode> userCodes1;

	// bi-directional many-to-one association to UserCode
	@OneToMany(mappedBy = "systemUser2")
	private Set<UserCode> userCodes2;

	// bi-directional many-to-one association to WarehouseDetail
	@OneToMany(mappedBy = "systemUser1")
	private Set<WarehouseDetail> warehouseDetails1;

	// bi-directional many-to-one association to WarehouseDetail
	@OneToMany(mappedBy = "systemUser2")
	private Set<WarehouseDetail> warehouseDetails2;

	// bi-directional many-to-one association to WarehouseDetailsAudit
	@OneToMany(mappedBy = "systemUser1")
	private Set<WarehouseDetailsAudit> warehouseDetailsAudits1;

	// bi-directional many-to-one association to WarehouseDetailsAudit
	@OneToMany(mappedBy = "systemUser2")
	private Set<WarehouseDetailsAudit> warehouseDetailsAudits2;

	// bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy = "systemUser1")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits1;

	// bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy = "systemUser2")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits2;

	// bi-directional many-to-one association to
	// WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy = "systemUser1")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits1;

	// bi-directional many-to-one association to
	// WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy = "systemUser2")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits2;

	// bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy = "systemUser1")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks1;

	// bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy = "systemUser2")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks2;

	// bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy = "systemUser1")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions1;

	// bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy = "systemUser2")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions2;

	// bi-directional many-to-one association to WarehousePumpDetail
	@OneToMany(mappedBy = "systemUser1")
	private Set<WarehousePumpDetail> warehousePumpDetails1;

	// bi-directional many-to-one association to WarehousePumpDetail
	@OneToMany(mappedBy = "systemUser2")
	private Set<WarehousePumpDetail> warehousePumpDetails2;

	// bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy = "systemUser1")
	private Set<WorkflowAudit> workflowAudits1;

	// bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy = "systemUser2")
	private Set<WorkflowAudit> workflowAudits2;

	// bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy = "systemUser3")
	private Set<WorkflowAudit> workflowAudits3;

	// bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy = "systemUser4")
	private Set<WorkflowAudit> workflowAudits4;

	// bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy = "systemUser5")
	private Set<WorkflowAudit> workflowAudits5;

	// bi-directional many-to-one association to WorkflowRegister
	@OneToMany(mappedBy = "systemUser1")
	private Set<WorkflowRegister> workflowRegisters1;

	// bi-directional many-to-one association to WorkflowRegister
	@OneToMany(mappedBy = "systemUser2")
	private Set<WorkflowRegister> workflowRegisters2;

	// bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy = "systemUser1")
	private Set<Workflow> workflows1;

	// bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy = "systemUser2")
	private Set<Workflow> workflows2;

	// bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy = "systemUser3")
	private Set<Workflow> workflows3;

	// bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy = "systemUser4")
	private Set<Workflow> workflows4;

	// bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy = "systemUser5")
	private Set<Workflow> workflows5;

	public SystemUser() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
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

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
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

	public Set<ApprovalTemplate> getApprovalTemplates1() {
		return this.approvalTemplates1;
	}

	public void setApprovalTemplates1(Set<ApprovalTemplate> approvalTemplates1) {
		this.approvalTemplates1 = approvalTemplates1;
	}

	public ApprovalTemplate addApprovalTemplates1(ApprovalTemplate approvalTemplates1) {
		getApprovalTemplates1().add(approvalTemplates1);
		approvalTemplates1.setSystemUser1(this);

		return approvalTemplates1;
	}

	public ApprovalTemplate removeApprovalTemplates1(ApprovalTemplate approvalTemplates1) {
		getApprovalTemplates1().remove(approvalTemplates1);
		approvalTemplates1.setSystemUser1(null);

		return approvalTemplates1;
	}

	public Set<ApprovalTemplate> getApprovalTemplates2() {
		return this.approvalTemplates2;
	}

	public void setApprovalTemplates2(Set<ApprovalTemplate> approvalTemplates2) {
		this.approvalTemplates2 = approvalTemplates2;
	}

	public ApprovalTemplate addApprovalTemplates2(ApprovalTemplate approvalTemplates2) {
		getApprovalTemplates2().add(approvalTemplates2);
		approvalTemplates2.setSystemUser2(this);

		return approvalTemplates2;
	}

	public ApprovalTemplate removeApprovalTemplates2(ApprovalTemplate approvalTemplates2) {
		getApprovalTemplates2().remove(approvalTemplates2);
		approvalTemplates2.setSystemUser2(null);

		return approvalTemplates2;
	}

	public Set<Location> getLocations1() {
		return this.locations1;
	}

	public void setLocations1(Set<Location> locations1) {
		this.locations1 = locations1;
	}

	public Location addLocations1(Location locations1) {
		getLocations1().add(locations1);
		locations1.setSystemUser1(this);

		return locations1;
	}

	public Location removeLocations1(Location locations1) {
		getLocations1().remove(locations1);
		locations1.setSystemUser1(null);

		return locations1;
	}

	public Set<Location> getLocations2() {
		return this.locations2;
	}

	public void setLocations2(Set<Location> locations2) {
		this.locations2 = locations2;
	}

	public Location addLocations2(Location locations2) {
		getLocations2().add(locations2);
		locations2.setSystemUser2(this);

		return locations2;
	}

	public Location removeLocations2(Location locations2) {
		getLocations2().remove(locations2);
		locations2.setSystemUser2(null);

		return locations2;
	}

	public SystemUser getSystemUser1() {
		return this.systemUser1;
	}

	public void setSystemUser1(SystemUser systemUser1) {
		this.systemUser1 = systemUser1;
	}

	public Set<SystemUser> getSystemUsers1() {
		return this.systemUsers1;
	}

	public void setSystemUsers1(Set<SystemUser> systemUsers1) {
		this.systemUsers1 = systemUsers1;
	}

	public SystemUser addSystemUsers1(SystemUser systemUsers1) {
		getSystemUsers1().add(systemUsers1);
		systemUsers1.setSystemUser1(this);

		return systemUsers1;
	}

	public SystemUser removeSystemUsers1(SystemUser systemUsers1) {
		getSystemUsers1().remove(systemUsers1);
		systemUsers1.setSystemUser1(null);

		return systemUsers1;
	}

	public SystemUser getSystemUser2() {
		return this.systemUser2;
	}

	public void setSystemUser2(SystemUser systemUser2) {
		this.systemUser2 = systemUser2;
	}

	public Set<SystemUser> getSystemUsers2() {
		return this.systemUsers2;
	}

	public void setSystemUsers2(Set<SystemUser> systemUsers2) {
		this.systemUsers2 = systemUsers2;
	}

	public SystemUser addSystemUsers2(SystemUser systemUsers2) {
		getSystemUsers2().add(systemUsers2);
		systemUsers2.setSystemUser2(this);

		return systemUsers2;
	}

	public SystemUser removeSystemUsers2(SystemUser systemUsers2) {
		getSystemUsers2().remove(systemUsers2);
		systemUsers2.setSystemUser2(null);

		return systemUsers2;
	}

	public Set<UserCodeSetup> getUserCodeSetups1() {
		return this.userCodeSetups1;
	}

	public void setUserCodeSetups1(Set<UserCodeSetup> userCodeSetups1) {
		this.userCodeSetups1 = userCodeSetups1;
	}

	public UserCodeSetup addUserCodeSetups1(UserCodeSetup userCodeSetups1) {
		getUserCodeSetups1().add(userCodeSetups1);
		userCodeSetups1.setSystemUser1(this);

		return userCodeSetups1;
	}

	public UserCodeSetup removeUserCodeSetups1(UserCodeSetup userCodeSetups1) {
		getUserCodeSetups1().remove(userCodeSetups1);
		userCodeSetups1.setSystemUser1(null);

		return userCodeSetups1;
	}

	public Set<UserCodeSetup> getUserCodeSetups2() {
		return this.userCodeSetups2;
	}

	public void setUserCodeSetups2(Set<UserCodeSetup> userCodeSetups2) {
		this.userCodeSetups2 = userCodeSetups2;
	}

	public UserCodeSetup addUserCodeSetups2(UserCodeSetup userCodeSetups2) {
		getUserCodeSetups2().add(userCodeSetups2);
		userCodeSetups2.setSystemUser2(this);

		return userCodeSetups2;
	}

	public UserCodeSetup removeUserCodeSetups2(UserCodeSetup userCodeSetups2) {
		getUserCodeSetups2().remove(userCodeSetups2);
		userCodeSetups2.setSystemUser2(null);

		return userCodeSetups2;
	}

	public Set<UserCode> getUserCodes1() {
		return this.userCodes1;
	}

	public void setUserCodes1(Set<UserCode> userCodes1) {
		this.userCodes1 = userCodes1;
	}

	public UserCode addUserCodes1(UserCode userCodes1) {
		getUserCodes1().add(userCodes1);
		userCodes1.setSystemUser1(this);

		return userCodes1;
	}

	public UserCode removeUserCodes1(UserCode userCodes1) {
		getUserCodes1().remove(userCodes1);
		userCodes1.setSystemUser1(null);

		return userCodes1;
	}

	public Set<UserCode> getUserCodes2() {
		return this.userCodes2;
	}

	public void setUserCodes2(Set<UserCode> userCodes2) {
		this.userCodes2 = userCodes2;
	}

	public UserCode addUserCodes2(UserCode userCodes2) {
		getUserCodes2().add(userCodes2);
		userCodes2.setSystemUser2(this);

		return userCodes2;
	}

	public UserCode removeUserCodes2(UserCode userCodes2) {
		getUserCodes2().remove(userCodes2);
		userCodes2.setSystemUser2(null);

		return userCodes2;
	}

	public Set<WarehouseDetail> getWarehouseDetails1() {
		return this.warehouseDetails1;
	}

	public void setWarehouseDetails1(Set<WarehouseDetail> warehouseDetails1) {
		this.warehouseDetails1 = warehouseDetails1;
	}

	public WarehouseDetail addWarehouseDetails1(WarehouseDetail warehouseDetails1) {
		getWarehouseDetails1().add(warehouseDetails1);
		warehouseDetails1.setSystemUser1(this);

		return warehouseDetails1;
	}

	public WarehouseDetail removeWarehouseDetails1(WarehouseDetail warehouseDetails1) {
		getWarehouseDetails1().remove(warehouseDetails1);
		warehouseDetails1.setSystemUser1(null);

		return warehouseDetails1;
	}

	public Set<WarehouseDetail> getWarehouseDetails2() {
		return this.warehouseDetails2;
	}

	public void setWarehouseDetails2(Set<WarehouseDetail> warehouseDetails2) {
		this.warehouseDetails2 = warehouseDetails2;
	}

	public WarehouseDetail addWarehouseDetails2(WarehouseDetail warehouseDetails2) {
		getWarehouseDetails2().add(warehouseDetails2);
		warehouseDetails2.setSystemUser2(this);

		return warehouseDetails2;
	}

	public WarehouseDetail removeWarehouseDetails2(WarehouseDetail warehouseDetails2) {
		getWarehouseDetails2().remove(warehouseDetails2);
		warehouseDetails2.setSystemUser2(null);

		return warehouseDetails2;
	}

	public Set<WarehouseDetailsAudit> getWarehouseDetailsAudits1() {
		return this.warehouseDetailsAudits1;
	}

	public void setWarehouseDetailsAudits1(Set<WarehouseDetailsAudit> warehouseDetailsAudits1) {
		this.warehouseDetailsAudits1 = warehouseDetailsAudits1;
	}

	public WarehouseDetailsAudit addWarehouseDetailsAudits1(WarehouseDetailsAudit warehouseDetailsAudits1) {
		getWarehouseDetailsAudits1().add(warehouseDetailsAudits1);
		warehouseDetailsAudits1.setSystemUser1(this);

		return warehouseDetailsAudits1;
	}

	public WarehouseDetailsAudit removeWarehouseDetailsAudits1(WarehouseDetailsAudit warehouseDetailsAudits1) {
		getWarehouseDetailsAudits1().remove(warehouseDetailsAudits1);
		warehouseDetailsAudits1.setSystemUser1(null);

		return warehouseDetailsAudits1;
	}

	public Set<WarehouseDetailsAudit> getWarehouseDetailsAudits2() {
		return this.warehouseDetailsAudits2;
	}

	public void setWarehouseDetailsAudits2(Set<WarehouseDetailsAudit> warehouseDetailsAudits2) {
		this.warehouseDetailsAudits2 = warehouseDetailsAudits2;
	}

	public WarehouseDetailsAudit addWarehouseDetailsAudits2(WarehouseDetailsAudit warehouseDetailsAudits2) {
		getWarehouseDetailsAudits2().add(warehouseDetailsAudits2);
		warehouseDetailsAudits2.setSystemUser2(this);

		return warehouseDetailsAudits2;
	}

	public WarehouseDetailsAudit removeWarehouseDetailsAudits2(WarehouseDetailsAudit warehouseDetailsAudits2) {
		getWarehouseDetailsAudits2().remove(warehouseDetailsAudits2);
		warehouseDetailsAudits2.setSystemUser2(null);

		return warehouseDetailsAudits2;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits1() {
		return this.warehouseInventoryDefinitionAudits1;
	}

	public void setWarehouseInventoryDefinitionAudits1(
			Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits1) {
		this.warehouseInventoryDefinitionAudits1 = warehouseInventoryDefinitionAudits1;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits1(
			WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits1) {
		getWarehouseInventoryDefinitionAudits1().add(warehouseInventoryDefinitionAudits1);
		warehouseInventoryDefinitionAudits1.setSystemUser1(this);

		return warehouseInventoryDefinitionAudits1;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits1(
			WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits1) {
		getWarehouseInventoryDefinitionAudits1().remove(warehouseInventoryDefinitionAudits1);
		warehouseInventoryDefinitionAudits1.setSystemUser1(null);

		return warehouseInventoryDefinitionAudits1;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits2() {
		return this.warehouseInventoryDefinitionAudits2;
	}

	public void setWarehouseInventoryDefinitionAudits2(
			Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits2) {
		this.warehouseInventoryDefinitionAudits2 = warehouseInventoryDefinitionAudits2;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits2(
			WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits2) {
		getWarehouseInventoryDefinitionAudits2().add(warehouseInventoryDefinitionAudits2);
		warehouseInventoryDefinitionAudits2.setSystemUser2(this);

		return warehouseInventoryDefinitionAudits2;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits2(
			WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits2) {
		getWarehouseInventoryDefinitionAudits2().remove(warehouseInventoryDefinitionAudits2);
		warehouseInventoryDefinitionAudits2.setSystemUser2(null);

		return warehouseInventoryDefinitionAudits2;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits1() {
		return this.warehouseInventoryDefinitionWorkAudits1;
	}

	public void setWarehouseInventoryDefinitionWorkAudits1(
			Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits1) {
		this.warehouseInventoryDefinitionWorkAudits1 = warehouseInventoryDefinitionWorkAudits1;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits1(
			WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits1) {
		getWarehouseInventoryDefinitionWorkAudits1().add(warehouseInventoryDefinitionWorkAudits1);
		warehouseInventoryDefinitionWorkAudits1.setSystemUser1(this);

		return warehouseInventoryDefinitionWorkAudits1;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits1(
			WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits1) {
		getWarehouseInventoryDefinitionWorkAudits1().remove(warehouseInventoryDefinitionWorkAudits1);
		warehouseInventoryDefinitionWorkAudits1.setSystemUser1(null);

		return warehouseInventoryDefinitionWorkAudits1;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits2() {
		return this.warehouseInventoryDefinitionWorkAudits2;
	}

	public void setWarehouseInventoryDefinitionWorkAudits2(
			Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits2) {
		this.warehouseInventoryDefinitionWorkAudits2 = warehouseInventoryDefinitionWorkAudits2;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits2(
			WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits2) {
		getWarehouseInventoryDefinitionWorkAudits2().add(warehouseInventoryDefinitionWorkAudits2);
		warehouseInventoryDefinitionWorkAudits2.setSystemUser2(this);

		return warehouseInventoryDefinitionWorkAudits2;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits2(
			WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits2) {
		getWarehouseInventoryDefinitionWorkAudits2().remove(warehouseInventoryDefinitionWorkAudits2);
		warehouseInventoryDefinitionWorkAudits2.setSystemUser2(null);

		return warehouseInventoryDefinitionWorkAudits2;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks1() {
		return this.warehouseInventoryDefinitionWorks1;
	}

	public void setWarehouseInventoryDefinitionWorks1(
			Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks1) {
		this.warehouseInventoryDefinitionWorks1 = warehouseInventoryDefinitionWorks1;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks1(
			WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks1) {
		getWarehouseInventoryDefinitionWorks1().add(warehouseInventoryDefinitionWorks1);
		warehouseInventoryDefinitionWorks1.setSystemUser1(this);

		return warehouseInventoryDefinitionWorks1;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks1(
			WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks1) {
		getWarehouseInventoryDefinitionWorks1().remove(warehouseInventoryDefinitionWorks1);
		warehouseInventoryDefinitionWorks1.setSystemUser1(null);

		return warehouseInventoryDefinitionWorks1;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks2() {
		return this.warehouseInventoryDefinitionWorks2;
	}

	public void setWarehouseInventoryDefinitionWorks2(
			Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks2) {
		this.warehouseInventoryDefinitionWorks2 = warehouseInventoryDefinitionWorks2;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks2(
			WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks2) {
		getWarehouseInventoryDefinitionWorks2().add(warehouseInventoryDefinitionWorks2);
		warehouseInventoryDefinitionWorks2.setSystemUser2(this);

		return warehouseInventoryDefinitionWorks2;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks2(
			WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks2) {
		getWarehouseInventoryDefinitionWorks2().remove(warehouseInventoryDefinitionWorks2);
		warehouseInventoryDefinitionWorks2.setSystemUser2(null);

		return warehouseInventoryDefinitionWorks2;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions1() {
		return this.warehouseInventoryDefinitions1;
	}

	public void setWarehouseInventoryDefinitions1(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions1) {
		this.warehouseInventoryDefinitions1 = warehouseInventoryDefinitions1;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions1(
			WarehouseInventoryDefinition warehouseInventoryDefinitions1) {
		getWarehouseInventoryDefinitions1().add(warehouseInventoryDefinitions1);
		warehouseInventoryDefinitions1.setSystemUser1(this);

		return warehouseInventoryDefinitions1;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions1(
			WarehouseInventoryDefinition warehouseInventoryDefinitions1) {
		getWarehouseInventoryDefinitions1().remove(warehouseInventoryDefinitions1);
		warehouseInventoryDefinitions1.setSystemUser1(null);

		return warehouseInventoryDefinitions1;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions2() {
		return this.warehouseInventoryDefinitions2;
	}

	public void setWarehouseInventoryDefinitions2(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions2) {
		this.warehouseInventoryDefinitions2 = warehouseInventoryDefinitions2;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions2(
			WarehouseInventoryDefinition warehouseInventoryDefinitions2) {
		getWarehouseInventoryDefinitions2().add(warehouseInventoryDefinitions2);
		warehouseInventoryDefinitions2.setSystemUser2(this);

		return warehouseInventoryDefinitions2;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions2(
			WarehouseInventoryDefinition warehouseInventoryDefinitions2) {
		getWarehouseInventoryDefinitions2().remove(warehouseInventoryDefinitions2);
		warehouseInventoryDefinitions2.setSystemUser2(null);

		return warehouseInventoryDefinitions2;
	}

	public Set<WarehousePumpDetail> getWarehousePumpDetails1() {
		return this.warehousePumpDetails1;
	}

	public void setWarehousePumpDetails1(Set<WarehousePumpDetail> warehousePumpDetails1) {
		this.warehousePumpDetails1 = warehousePumpDetails1;
	}

	public WarehousePumpDetail addWarehousePumpDetails1(WarehousePumpDetail warehousePumpDetails1) {
		getWarehousePumpDetails1().add(warehousePumpDetails1);
		warehousePumpDetails1.setSystemUser1(this);

		return warehousePumpDetails1;
	}

	public WarehousePumpDetail removeWarehousePumpDetails1(WarehousePumpDetail warehousePumpDetails1) {
		getWarehousePumpDetails1().remove(warehousePumpDetails1);
		warehousePumpDetails1.setSystemUser1(null);

		return warehousePumpDetails1;
	}

	public Set<WarehousePumpDetail> getWarehousePumpDetails2() {
		return this.warehousePumpDetails2;
	}

	public void setWarehousePumpDetails2(Set<WarehousePumpDetail> warehousePumpDetails2) {
		this.warehousePumpDetails2 = warehousePumpDetails2;
	}

	public WarehousePumpDetail addWarehousePumpDetails2(WarehousePumpDetail warehousePumpDetails2) {
		getWarehousePumpDetails2().add(warehousePumpDetails2);
		warehousePumpDetails2.setSystemUser2(this);

		return warehousePumpDetails2;
	}

	public WarehousePumpDetail removeWarehousePumpDetails2(WarehousePumpDetail warehousePumpDetails2) {
		getWarehousePumpDetails2().remove(warehousePumpDetails2);
		warehousePumpDetails2.setSystemUser2(null);

		return warehousePumpDetails2;
	}

	public Set<WorkflowAudit> getWorkflowAudits1() {
		return this.workflowAudits1;
	}

	public void setWorkflowAudits1(Set<WorkflowAudit> workflowAudits1) {
		this.workflowAudits1 = workflowAudits1;
	}

	public WorkflowAudit addWorkflowAudits1(WorkflowAudit workflowAudits1) {
		getWorkflowAudits1().add(workflowAudits1);
		workflowAudits1.setSystemUser1(this);

		return workflowAudits1;
	}

	public WorkflowAudit removeWorkflowAudits1(WorkflowAudit workflowAudits1) {
		getWorkflowAudits1().remove(workflowAudits1);
		workflowAudits1.setSystemUser1(null);

		return workflowAudits1;
	}

	public Set<WorkflowAudit> getWorkflowAudits2() {
		return this.workflowAudits2;
	}

	public void setWorkflowAudits2(Set<WorkflowAudit> workflowAudits2) {
		this.workflowAudits2 = workflowAudits2;
	}

	public WorkflowAudit addWorkflowAudits2(WorkflowAudit workflowAudits2) {
		getWorkflowAudits2().add(workflowAudits2);
		workflowAudits2.setSystemUser2(this);

		return workflowAudits2;
	}

	public WorkflowAudit removeWorkflowAudits2(WorkflowAudit workflowAudits2) {
		getWorkflowAudits2().remove(workflowAudits2);
		workflowAudits2.setSystemUser2(null);

		return workflowAudits2;
	}

	public Set<WorkflowAudit> getWorkflowAudits3() {
		return this.workflowAudits3;
	}

	public void setWorkflowAudits3(Set<WorkflowAudit> workflowAudits3) {
		this.workflowAudits3 = workflowAudits3;
	}

	public WorkflowAudit addWorkflowAudits3(WorkflowAudit workflowAudits3) {
		getWorkflowAudits3().add(workflowAudits3);
		workflowAudits3.setSystemUser3(this);

		return workflowAudits3;
	}

	public WorkflowAudit removeWorkflowAudits3(WorkflowAudit workflowAudits3) {
		getWorkflowAudits3().remove(workflowAudits3);
		workflowAudits3.setSystemUser3(null);

		return workflowAudits3;
	}

	public Set<WorkflowAudit> getWorkflowAudits4() {
		return this.workflowAudits4;
	}

	public void setWorkflowAudits4(Set<WorkflowAudit> workflowAudits4) {
		this.workflowAudits4 = workflowAudits4;
	}

	public WorkflowAudit addWorkflowAudits4(WorkflowAudit workflowAudits4) {
		getWorkflowAudits4().add(workflowAudits4);
		workflowAudits4.setSystemUser4(this);

		return workflowAudits4;
	}

	public WorkflowAudit removeWorkflowAudits4(WorkflowAudit workflowAudits4) {
		getWorkflowAudits4().remove(workflowAudits4);
		workflowAudits4.setSystemUser4(null);

		return workflowAudits4;
	}

	public Set<WorkflowAudit> getWorkflowAudits5() {
		return this.workflowAudits5;
	}

	public void setWorkflowAudits5(Set<WorkflowAudit> workflowAudits5) {
		this.workflowAudits5 = workflowAudits5;
	}

	public WorkflowAudit addWorkflowAudits5(WorkflowAudit workflowAudits5) {
		getWorkflowAudits5().add(workflowAudits5);
		workflowAudits5.setSystemUser5(this);

		return workflowAudits5;
	}

	public WorkflowAudit removeWorkflowAudits5(WorkflowAudit workflowAudits5) {
		getWorkflowAudits5().remove(workflowAudits5);
		workflowAudits5.setSystemUser5(null);

		return workflowAudits5;
	}

	public Set<WorkflowRegister> getWorkflowRegisters1() {
		return this.workflowRegisters1;
	}

	public void setWorkflowRegisters1(Set<WorkflowRegister> workflowRegisters1) {
		this.workflowRegisters1 = workflowRegisters1;
	}

	public WorkflowRegister addWorkflowRegisters1(WorkflowRegister workflowRegisters1) {
		getWorkflowRegisters1().add(workflowRegisters1);
		workflowRegisters1.setSystemUser1(this);

		return workflowRegisters1;
	}

	public WorkflowRegister removeWorkflowRegisters1(WorkflowRegister workflowRegisters1) {
		getWorkflowRegisters1().remove(workflowRegisters1);
		workflowRegisters1.setSystemUser1(null);

		return workflowRegisters1;
	}

	public Set<WorkflowRegister> getWorkflowRegisters2() {
		return this.workflowRegisters2;
	}

	public void setWorkflowRegisters2(Set<WorkflowRegister> workflowRegisters2) {
		this.workflowRegisters2 = workflowRegisters2;
	}

	public WorkflowRegister addWorkflowRegisters2(WorkflowRegister workflowRegisters2) {
		getWorkflowRegisters2().add(workflowRegisters2);
		workflowRegisters2.setSystemUser2(this);

		return workflowRegisters2;
	}

	public WorkflowRegister removeWorkflowRegisters2(WorkflowRegister workflowRegisters2) {
		getWorkflowRegisters2().remove(workflowRegisters2);
		workflowRegisters2.setSystemUser2(null);

		return workflowRegisters2;
	}

	public Set<Workflow> getWorkflows1() {
		return this.workflows1;
	}

	public void setWorkflows1(Set<Workflow> workflows1) {
		this.workflows1 = workflows1;
	}

	public Workflow addWorkflows1(Workflow workflows1) {
		getWorkflows1().add(workflows1);
		workflows1.setSystemUser1(this);

		return workflows1;
	}

	public Workflow removeWorkflows1(Workflow workflows1) {
		getWorkflows1().remove(workflows1);
		workflows1.setSystemUser1(null);

		return workflows1;
	}

	public Set<Workflow> getWorkflows2() {
		return this.workflows2;
	}

	public void setWorkflows2(Set<Workflow> workflows2) {
		this.workflows2 = workflows2;
	}

	public Workflow addWorkflows2(Workflow workflows2) {
		getWorkflows2().add(workflows2);
		workflows2.setSystemUser2(this);

		return workflows2;
	}

	public Workflow removeWorkflows2(Workflow workflows2) {
		getWorkflows2().remove(workflows2);
		workflows2.setSystemUser2(null);

		return workflows2;
	}

	public Set<Workflow> getWorkflows3() {
		return this.workflows3;
	}

	public void setWorkflows3(Set<Workflow> workflows3) {
		this.workflows3 = workflows3;
	}

	public Workflow addWorkflows3(Workflow workflows3) {
		getWorkflows3().add(workflows3);
		workflows3.setSystemUser3(this);

		return workflows3;
	}

	public Workflow removeWorkflows3(Workflow workflows3) {
		getWorkflows3().remove(workflows3);
		workflows3.setSystemUser3(null);

		return workflows3;
	}

	public Set<Workflow> getWorkflows4() {
		return this.workflows4;
	}

	public void setWorkflows4(Set<Workflow> workflows4) {
		this.workflows4 = workflows4;
	}

	public Workflow addWorkflows4(Workflow workflows4) {
		getWorkflows4().add(workflows4);
		workflows4.setSystemUser4(this);

		return workflows4;
	}

	public Workflow removeWorkflows4(Workflow workflows4) {
		getWorkflows4().remove(workflows4);
		workflows4.setSystemUser4(null);

		return workflows4;
	}

	public Set<Workflow> getWorkflows5() {
		return this.workflows5;
	}

	public void setWorkflows5(Set<Workflow> workflows5) {
		this.workflows5 = workflows5;
	}

	public Workflow addWorkflows5(Workflow workflows5) {
		getWorkflows5().add(workflows5);
		workflows5.setSystemUser5(this);

		return workflows5;
	}

	public Workflow removeWorkflows5(Workflow workflows5) {
		getWorkflows5().remove(workflows5);
		workflows5.setSystemUser5(null);

		return workflows5;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}