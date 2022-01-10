package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the UserCodes database table.
 * 
 */
@Entity
@Table(name="UserCodes")
@NamedQuery(name="UserCode.findAll", query="SELECT u FROM UserCode u")
public class UserCode implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="Character1")
	private String character1;

	@Column(name="Character2")
	private String character2;

	@Column(name="CodeKey")
	private String codeKey;

	@Column(name="CodeType")
	private String codeType;

	@Column(name="CodeValue")
	private String codeValue;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="Description")
	private String description;

	@Column(name="DescriptionExtended")
	private String descriptionExtended;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ModuleId")
	private String moduleId;

	@Column(name="Number1")
	private String number1;

	//bi-directional many-to-one association to ApprovalTemplate
	@OneToMany(mappedBy="userCode1")
	private Set<ApprovalTemplate> approvalTemplates1;

	//bi-directional many-to-one association to ApprovalTemplate
	@OneToMany(mappedBy="userCode2")
	private Set<ApprovalTemplate> approvalTemplates2;

	//bi-directional many-to-one association to ApprovalTemplate
	@OneToMany(mappedBy="userCode3")
	private Set<ApprovalTemplate> approvalTemplates3;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to WarehouseDetail
	@OneToMany(mappedBy="userCode1")
	private Set<WarehouseDetail> warehouseDetails1;

	//bi-directional many-to-one association to WarehouseDetail
	@OneToMany(mappedBy="userCode2")
	private Set<WarehouseDetail> warehouseDetails2;

	//bi-directional many-to-one association to WarehouseDetail
	@OneToMany(mappedBy="userCode3")
	private Set<WarehouseDetail> warehouseDetails3;

	//bi-directional many-to-one association to WarehouseDetail
	@OneToMany(mappedBy="userCode4")
	private Set<WarehouseDetail> warehouseDetails4;

	//bi-directional many-to-one association to WarehouseDetailsAudit
	@OneToMany(mappedBy="userCode1")
	private Set<WarehouseDetailsAudit> warehouseDetailsAudits1;

	//bi-directional many-to-one association to WarehouseDetailsAudit
	@OneToMany(mappedBy="userCode2")
	private Set<WarehouseDetailsAudit> warehouseDetailsAudits2;

	//bi-directional many-to-one association to WarehouseDetailsAudit
	@OneToMany(mappedBy="userCode3")
	private Set<WarehouseDetailsAudit> warehouseDetailsAudits3;

	//bi-directional many-to-one association to WarehouseDetailsAudit
	@OneToMany(mappedBy="userCode4")
	private Set<WarehouseDetailsAudit> warehouseDetailsAudits4;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode1")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits1;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode2")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits2;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode3")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits3;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode4")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits4;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode5")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits5;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode6")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits6;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode7")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits7;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode8")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits8;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode9")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits9;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode10")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits10;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode11")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits11;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="userCode12")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits12;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode1")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits1;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode2")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits2;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode3")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits3;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode4")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits4;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode5")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits5;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode6")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits6;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode7")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits7;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode8")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits8;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode9")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits9;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode10")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits10;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode11")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits11;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="userCode12")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits12;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode1")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks1;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode2")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks2;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode3")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks3;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode4")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks4;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode5")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks5;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode6")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks6;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode7")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks7;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode8")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks8;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode9")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks9;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode10")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks10;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode11")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks11;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="userCode12")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks12;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode1")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions1;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode2")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions2;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode3")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions3;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode4")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions4;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode5")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions5;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode6")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions6;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode7")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions7;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode8")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions8;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode9")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions9;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode10")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions10;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode11")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions11;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="userCode12")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions12;

	//bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy="userCode1")
	private Set<WorkflowAudit> workflowAudits1;

	//bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy="userCode2")
	private Set<WorkflowAudit> workflowAudits2;

	//bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy="userCode3")
	private Set<WorkflowAudit> workflowAudits3;

	//bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy="userCode4")
	private Set<WorkflowAudit> workflowAudits4;

	//bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy="userCode5")
	private Set<WorkflowAudit> workflowAudits5;

	//bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy="userCode6")
	private Set<WorkflowAudit> workflowAudits6;

	//bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy="userCode1")
	private Set<Workflow> workflows1;

	//bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy="userCode2")
	private Set<Workflow> workflows2;

	//bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy="userCode3")
	private Set<Workflow> workflows3;

	//bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy="userCode4")
	private Set<Workflow> workflows4;

	//bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy="userCode5")
	private Set<Workflow> workflows5;

	//bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy="userCode6")
	private Set<Workflow> workflows6;

	//bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy="userCode7")
	private Set<Workflow> workflows7;

	public UserCode() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCharacter1() {
		return this.character1;
	}

	public void setCharacter1(String character1) {
		this.character1 = character1;
	}

	public String getCharacter2() {
		return this.character2;
	}

	public void setCharacter2(String character2) {
		this.character2 = character2;
	}

	public String getCodeKey() {
		return this.codeKey;
	}

	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}

	public String getCodeType() {
		return this.codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getCodeValue() {
		return this.codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
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

	public String getDescriptionExtended() {
		return this.descriptionExtended;
	}

	public void setDescriptionExtended(String descriptionExtended) {
		this.descriptionExtended = descriptionExtended;
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

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getNumber1() {
		return this.number1;
	}

	public void setNumber1(String number1) {
		this.number1 = number1;
	}

	public Set<ApprovalTemplate> getApprovalTemplates1() {
		return this.approvalTemplates1;
	}

	public void setApprovalTemplates1(Set<ApprovalTemplate> approvalTemplates1) {
		this.approvalTemplates1 = approvalTemplates1;
	}

	public ApprovalTemplate addApprovalTemplates1(ApprovalTemplate approvalTemplates1) {
		getApprovalTemplates1().add(approvalTemplates1);
		approvalTemplates1.setUserCode1(this);

		return approvalTemplates1;
	}

	public ApprovalTemplate removeApprovalTemplates1(ApprovalTemplate approvalTemplates1) {
		getApprovalTemplates1().remove(approvalTemplates1);
		approvalTemplates1.setUserCode1(null);

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
		approvalTemplates2.setUserCode2(this);

		return approvalTemplates2;
	}

	public ApprovalTemplate removeApprovalTemplates2(ApprovalTemplate approvalTemplates2) {
		getApprovalTemplates2().remove(approvalTemplates2);
		approvalTemplates2.setUserCode2(null);

		return approvalTemplates2;
	}

	public Set<ApprovalTemplate> getApprovalTemplates3() {
		return this.approvalTemplates3;
	}

	public void setApprovalTemplates3(Set<ApprovalTemplate> approvalTemplates3) {
		this.approvalTemplates3 = approvalTemplates3;
	}

	public ApprovalTemplate addApprovalTemplates3(ApprovalTemplate approvalTemplates3) {
		getApprovalTemplates3().add(approvalTemplates3);
		approvalTemplates3.setUserCode3(this);

		return approvalTemplates3;
	}

	public ApprovalTemplate removeApprovalTemplates3(ApprovalTemplate approvalTemplates3) {
		getApprovalTemplates3().remove(approvalTemplates3);
		approvalTemplates3.setUserCode3(null);

		return approvalTemplates3;
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

	public Set<WarehouseDetail> getWarehouseDetails1() {
		return this.warehouseDetails1;
	}

	public void setWarehouseDetails1(Set<WarehouseDetail> warehouseDetails1) {
		this.warehouseDetails1 = warehouseDetails1;
	}

	public WarehouseDetail addWarehouseDetails1(WarehouseDetail warehouseDetails1) {
		getWarehouseDetails1().add(warehouseDetails1);
		warehouseDetails1.setUserCode1(this);

		return warehouseDetails1;
	}

	public WarehouseDetail removeWarehouseDetails1(WarehouseDetail warehouseDetails1) {
		getWarehouseDetails1().remove(warehouseDetails1);
		warehouseDetails1.setUserCode1(null);

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
		warehouseDetails2.setUserCode2(this);

		return warehouseDetails2;
	}

	public WarehouseDetail removeWarehouseDetails2(WarehouseDetail warehouseDetails2) {
		getWarehouseDetails2().remove(warehouseDetails2);
		warehouseDetails2.setUserCode2(null);

		return warehouseDetails2;
	}

	public Set<WarehouseDetail> getWarehouseDetails3() {
		return this.warehouseDetails3;
	}

	public void setWarehouseDetails3(Set<WarehouseDetail> warehouseDetails3) {
		this.warehouseDetails3 = warehouseDetails3;
	}

	public WarehouseDetail addWarehouseDetails3(WarehouseDetail warehouseDetails3) {
		getWarehouseDetails3().add(warehouseDetails3);
		warehouseDetails3.setUserCode3(this);

		return warehouseDetails3;
	}

	public WarehouseDetail removeWarehouseDetails3(WarehouseDetail warehouseDetails3) {
		getWarehouseDetails3().remove(warehouseDetails3);
		warehouseDetails3.setUserCode3(null);

		return warehouseDetails3;
	}

	public Set<WarehouseDetail> getWarehouseDetails4() {
		return this.warehouseDetails4;
	}

	public void setWarehouseDetails4(Set<WarehouseDetail> warehouseDetails4) {
		this.warehouseDetails4 = warehouseDetails4;
	}

	public WarehouseDetail addWarehouseDetails4(WarehouseDetail warehouseDetails4) {
		getWarehouseDetails4().add(warehouseDetails4);
		warehouseDetails4.setUserCode4(this);

		return warehouseDetails4;
	}

	public WarehouseDetail removeWarehouseDetails4(WarehouseDetail warehouseDetails4) {
		getWarehouseDetails4().remove(warehouseDetails4);
		warehouseDetails4.setUserCode4(null);

		return warehouseDetails4;
	}

	public Set<WarehouseDetailsAudit> getWarehouseDetailsAudits1() {
		return this.warehouseDetailsAudits1;
	}

	public void setWarehouseDetailsAudits1(Set<WarehouseDetailsAudit> warehouseDetailsAudits1) {
		this.warehouseDetailsAudits1 = warehouseDetailsAudits1;
	}

	public WarehouseDetailsAudit addWarehouseDetailsAudits1(WarehouseDetailsAudit warehouseDetailsAudits1) {
		getWarehouseDetailsAudits1().add(warehouseDetailsAudits1);
		warehouseDetailsAudits1.setUserCode1(this);

		return warehouseDetailsAudits1;
	}

	public WarehouseDetailsAudit removeWarehouseDetailsAudits1(WarehouseDetailsAudit warehouseDetailsAudits1) {
		getWarehouseDetailsAudits1().remove(warehouseDetailsAudits1);
		warehouseDetailsAudits1.setUserCode1(null);

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
		warehouseDetailsAudits2.setUserCode2(this);

		return warehouseDetailsAudits2;
	}

	public WarehouseDetailsAudit removeWarehouseDetailsAudits2(WarehouseDetailsAudit warehouseDetailsAudits2) {
		getWarehouseDetailsAudits2().remove(warehouseDetailsAudits2);
		warehouseDetailsAudits2.setUserCode2(null);

		return warehouseDetailsAudits2;
	}

	public Set<WarehouseDetailsAudit> getWarehouseDetailsAudits3() {
		return this.warehouseDetailsAudits3;
	}

	public void setWarehouseDetailsAudits3(Set<WarehouseDetailsAudit> warehouseDetailsAudits3) {
		this.warehouseDetailsAudits3 = warehouseDetailsAudits3;
	}

	public WarehouseDetailsAudit addWarehouseDetailsAudits3(WarehouseDetailsAudit warehouseDetailsAudits3) {
		getWarehouseDetailsAudits3().add(warehouseDetailsAudits3);
		warehouseDetailsAudits3.setUserCode3(this);

		return warehouseDetailsAudits3;
	}

	public WarehouseDetailsAudit removeWarehouseDetailsAudits3(WarehouseDetailsAudit warehouseDetailsAudits3) {
		getWarehouseDetailsAudits3().remove(warehouseDetailsAudits3);
		warehouseDetailsAudits3.setUserCode3(null);

		return warehouseDetailsAudits3;
	}

	public Set<WarehouseDetailsAudit> getWarehouseDetailsAudits4() {
		return this.warehouseDetailsAudits4;
	}

	public void setWarehouseDetailsAudits4(Set<WarehouseDetailsAudit> warehouseDetailsAudits4) {
		this.warehouseDetailsAudits4 = warehouseDetailsAudits4;
	}

	public WarehouseDetailsAudit addWarehouseDetailsAudits4(WarehouseDetailsAudit warehouseDetailsAudits4) {
		getWarehouseDetailsAudits4().add(warehouseDetailsAudits4);
		warehouseDetailsAudits4.setUserCode4(this);

		return warehouseDetailsAudits4;
	}

	public WarehouseDetailsAudit removeWarehouseDetailsAudits4(WarehouseDetailsAudit warehouseDetailsAudits4) {
		getWarehouseDetailsAudits4().remove(warehouseDetailsAudits4);
		warehouseDetailsAudits4.setUserCode4(null);

		return warehouseDetailsAudits4;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits1() {
		return this.warehouseInventoryDefinitionAudits1;
	}

	public void setWarehouseInventoryDefinitionAudits1(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits1) {
		this.warehouseInventoryDefinitionAudits1 = warehouseInventoryDefinitionAudits1;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits1(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits1) {
		getWarehouseInventoryDefinitionAudits1().add(warehouseInventoryDefinitionAudits1);
		warehouseInventoryDefinitionAudits1.setUserCode1(this);

		return warehouseInventoryDefinitionAudits1;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits1(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits1) {
		getWarehouseInventoryDefinitionAudits1().remove(warehouseInventoryDefinitionAudits1);
		warehouseInventoryDefinitionAudits1.setUserCode1(null);

		return warehouseInventoryDefinitionAudits1;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits2() {
		return this.warehouseInventoryDefinitionAudits2;
	}

	public void setWarehouseInventoryDefinitionAudits2(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits2) {
		this.warehouseInventoryDefinitionAudits2 = warehouseInventoryDefinitionAudits2;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits2(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits2) {
		getWarehouseInventoryDefinitionAudits2().add(warehouseInventoryDefinitionAudits2);
		warehouseInventoryDefinitionAudits2.setUserCode2(this);

		return warehouseInventoryDefinitionAudits2;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits2(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits2) {
		getWarehouseInventoryDefinitionAudits2().remove(warehouseInventoryDefinitionAudits2);
		warehouseInventoryDefinitionAudits2.setUserCode2(null);

		return warehouseInventoryDefinitionAudits2;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits3() {
		return this.warehouseInventoryDefinitionAudits3;
	}

	public void setWarehouseInventoryDefinitionAudits3(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits3) {
		this.warehouseInventoryDefinitionAudits3 = warehouseInventoryDefinitionAudits3;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits3(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits3) {
		getWarehouseInventoryDefinitionAudits3().add(warehouseInventoryDefinitionAudits3);
		warehouseInventoryDefinitionAudits3.setUserCode3(this);

		return warehouseInventoryDefinitionAudits3;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits3(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits3) {
		getWarehouseInventoryDefinitionAudits3().remove(warehouseInventoryDefinitionAudits3);
		warehouseInventoryDefinitionAudits3.setUserCode3(null);

		return warehouseInventoryDefinitionAudits3;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits4() {
		return this.warehouseInventoryDefinitionAudits4;
	}

	public void setWarehouseInventoryDefinitionAudits4(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits4) {
		this.warehouseInventoryDefinitionAudits4 = warehouseInventoryDefinitionAudits4;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits4(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits4) {
		getWarehouseInventoryDefinitionAudits4().add(warehouseInventoryDefinitionAudits4);
		warehouseInventoryDefinitionAudits4.setUserCode4(this);

		return warehouseInventoryDefinitionAudits4;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits4(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits4) {
		getWarehouseInventoryDefinitionAudits4().remove(warehouseInventoryDefinitionAudits4);
		warehouseInventoryDefinitionAudits4.setUserCode4(null);

		return warehouseInventoryDefinitionAudits4;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits5() {
		return this.warehouseInventoryDefinitionAudits5;
	}

	public void setWarehouseInventoryDefinitionAudits5(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits5) {
		this.warehouseInventoryDefinitionAudits5 = warehouseInventoryDefinitionAudits5;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits5(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits5) {
		getWarehouseInventoryDefinitionAudits5().add(warehouseInventoryDefinitionAudits5);
		warehouseInventoryDefinitionAudits5.setUserCode5(this);

		return warehouseInventoryDefinitionAudits5;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits5(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits5) {
		getWarehouseInventoryDefinitionAudits5().remove(warehouseInventoryDefinitionAudits5);
		warehouseInventoryDefinitionAudits5.setUserCode5(null);

		return warehouseInventoryDefinitionAudits5;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits6() {
		return this.warehouseInventoryDefinitionAudits6;
	}

	public void setWarehouseInventoryDefinitionAudits6(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits6) {
		this.warehouseInventoryDefinitionAudits6 = warehouseInventoryDefinitionAudits6;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits6(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits6) {
		getWarehouseInventoryDefinitionAudits6().add(warehouseInventoryDefinitionAudits6);
		warehouseInventoryDefinitionAudits6.setUserCode6(this);

		return warehouseInventoryDefinitionAudits6;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits6(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits6) {
		getWarehouseInventoryDefinitionAudits6().remove(warehouseInventoryDefinitionAudits6);
		warehouseInventoryDefinitionAudits6.setUserCode6(null);

		return warehouseInventoryDefinitionAudits6;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits7() {
		return this.warehouseInventoryDefinitionAudits7;
	}

	public void setWarehouseInventoryDefinitionAudits7(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits7) {
		this.warehouseInventoryDefinitionAudits7 = warehouseInventoryDefinitionAudits7;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits7(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits7) {
		getWarehouseInventoryDefinitionAudits7().add(warehouseInventoryDefinitionAudits7);
		warehouseInventoryDefinitionAudits7.setUserCode7(this);

		return warehouseInventoryDefinitionAudits7;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits7(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits7) {
		getWarehouseInventoryDefinitionAudits7().remove(warehouseInventoryDefinitionAudits7);
		warehouseInventoryDefinitionAudits7.setUserCode7(null);

		return warehouseInventoryDefinitionAudits7;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits8() {
		return this.warehouseInventoryDefinitionAudits8;
	}

	public void setWarehouseInventoryDefinitionAudits8(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits8) {
		this.warehouseInventoryDefinitionAudits8 = warehouseInventoryDefinitionAudits8;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits8(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits8) {
		getWarehouseInventoryDefinitionAudits8().add(warehouseInventoryDefinitionAudits8);
		warehouseInventoryDefinitionAudits8.setUserCode8(this);

		return warehouseInventoryDefinitionAudits8;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits8(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits8) {
		getWarehouseInventoryDefinitionAudits8().remove(warehouseInventoryDefinitionAudits8);
		warehouseInventoryDefinitionAudits8.setUserCode8(null);

		return warehouseInventoryDefinitionAudits8;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits9() {
		return this.warehouseInventoryDefinitionAudits9;
	}

	public void setWarehouseInventoryDefinitionAudits9(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits9) {
		this.warehouseInventoryDefinitionAudits9 = warehouseInventoryDefinitionAudits9;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits9(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits9) {
		getWarehouseInventoryDefinitionAudits9().add(warehouseInventoryDefinitionAudits9);
		warehouseInventoryDefinitionAudits9.setUserCode9(this);

		return warehouseInventoryDefinitionAudits9;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits9(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits9) {
		getWarehouseInventoryDefinitionAudits9().remove(warehouseInventoryDefinitionAudits9);
		warehouseInventoryDefinitionAudits9.setUserCode9(null);

		return warehouseInventoryDefinitionAudits9;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits10() {
		return this.warehouseInventoryDefinitionAudits10;
	}

	public void setWarehouseInventoryDefinitionAudits10(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits10) {
		this.warehouseInventoryDefinitionAudits10 = warehouseInventoryDefinitionAudits10;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits10(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits10) {
		getWarehouseInventoryDefinitionAudits10().add(warehouseInventoryDefinitionAudits10);
		warehouseInventoryDefinitionAudits10.setUserCode10(this);

		return warehouseInventoryDefinitionAudits10;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits10(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits10) {
		getWarehouseInventoryDefinitionAudits10().remove(warehouseInventoryDefinitionAudits10);
		warehouseInventoryDefinitionAudits10.setUserCode10(null);

		return warehouseInventoryDefinitionAudits10;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits11() {
		return this.warehouseInventoryDefinitionAudits11;
	}

	public void setWarehouseInventoryDefinitionAudits11(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits11) {
		this.warehouseInventoryDefinitionAudits11 = warehouseInventoryDefinitionAudits11;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits11(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits11) {
		getWarehouseInventoryDefinitionAudits11().add(warehouseInventoryDefinitionAudits11);
		warehouseInventoryDefinitionAudits11.setUserCode11(this);

		return warehouseInventoryDefinitionAudits11;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits11(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits11) {
		getWarehouseInventoryDefinitionAudits11().remove(warehouseInventoryDefinitionAudits11);
		warehouseInventoryDefinitionAudits11.setUserCode11(null);

		return warehouseInventoryDefinitionAudits11;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits12() {
		return this.warehouseInventoryDefinitionAudits12;
	}

	public void setWarehouseInventoryDefinitionAudits12(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits12) {
		this.warehouseInventoryDefinitionAudits12 = warehouseInventoryDefinitionAudits12;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudits12(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits12) {
		getWarehouseInventoryDefinitionAudits12().add(warehouseInventoryDefinitionAudits12);
		warehouseInventoryDefinitionAudits12.setUserCode12(this);

		return warehouseInventoryDefinitionAudits12;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudits12(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudits12) {
		getWarehouseInventoryDefinitionAudits12().remove(warehouseInventoryDefinitionAudits12);
		warehouseInventoryDefinitionAudits12.setUserCode12(null);

		return warehouseInventoryDefinitionAudits12;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits1() {
		return this.warehouseInventoryDefinitionWorkAudits1;
	}

	public void setWarehouseInventoryDefinitionWorkAudits1(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits1) {
		this.warehouseInventoryDefinitionWorkAudits1 = warehouseInventoryDefinitionWorkAudits1;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits1(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits1) {
		getWarehouseInventoryDefinitionWorkAudits1().add(warehouseInventoryDefinitionWorkAudits1);
		warehouseInventoryDefinitionWorkAudits1.setUserCode1(this);

		return warehouseInventoryDefinitionWorkAudits1;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits1(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits1) {
		getWarehouseInventoryDefinitionWorkAudits1().remove(warehouseInventoryDefinitionWorkAudits1);
		warehouseInventoryDefinitionWorkAudits1.setUserCode1(null);

		return warehouseInventoryDefinitionWorkAudits1;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits2() {
		return this.warehouseInventoryDefinitionWorkAudits2;
	}

	public void setWarehouseInventoryDefinitionWorkAudits2(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits2) {
		this.warehouseInventoryDefinitionWorkAudits2 = warehouseInventoryDefinitionWorkAudits2;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits2(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits2) {
		getWarehouseInventoryDefinitionWorkAudits2().add(warehouseInventoryDefinitionWorkAudits2);
		warehouseInventoryDefinitionWorkAudits2.setUserCode2(this);

		return warehouseInventoryDefinitionWorkAudits2;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits2(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits2) {
		getWarehouseInventoryDefinitionWorkAudits2().remove(warehouseInventoryDefinitionWorkAudits2);
		warehouseInventoryDefinitionWorkAudits2.setUserCode2(null);

		return warehouseInventoryDefinitionWorkAudits2;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits3() {
		return this.warehouseInventoryDefinitionWorkAudits3;
	}

	public void setWarehouseInventoryDefinitionWorkAudits3(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits3) {
		this.warehouseInventoryDefinitionWorkAudits3 = warehouseInventoryDefinitionWorkAudits3;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits3(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits3) {
		getWarehouseInventoryDefinitionWorkAudits3().add(warehouseInventoryDefinitionWorkAudits3);
		warehouseInventoryDefinitionWorkAudits3.setUserCode3(this);

		return warehouseInventoryDefinitionWorkAudits3;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits3(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits3) {
		getWarehouseInventoryDefinitionWorkAudits3().remove(warehouseInventoryDefinitionWorkAudits3);
		warehouseInventoryDefinitionWorkAudits3.setUserCode3(null);

		return warehouseInventoryDefinitionWorkAudits3;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits4() {
		return this.warehouseInventoryDefinitionWorkAudits4;
	}

	public void setWarehouseInventoryDefinitionWorkAudits4(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits4) {
		this.warehouseInventoryDefinitionWorkAudits4 = warehouseInventoryDefinitionWorkAudits4;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits4(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits4) {
		getWarehouseInventoryDefinitionWorkAudits4().add(warehouseInventoryDefinitionWorkAudits4);
		warehouseInventoryDefinitionWorkAudits4.setUserCode4(this);

		return warehouseInventoryDefinitionWorkAudits4;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits4(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits4) {
		getWarehouseInventoryDefinitionWorkAudits4().remove(warehouseInventoryDefinitionWorkAudits4);
		warehouseInventoryDefinitionWorkAudits4.setUserCode4(null);

		return warehouseInventoryDefinitionWorkAudits4;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits5() {
		return this.warehouseInventoryDefinitionWorkAudits5;
	}

	public void setWarehouseInventoryDefinitionWorkAudits5(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits5) {
		this.warehouseInventoryDefinitionWorkAudits5 = warehouseInventoryDefinitionWorkAudits5;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits5(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits5) {
		getWarehouseInventoryDefinitionWorkAudits5().add(warehouseInventoryDefinitionWorkAudits5);
		warehouseInventoryDefinitionWorkAudits5.setUserCode5(this);

		return warehouseInventoryDefinitionWorkAudits5;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits5(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits5) {
		getWarehouseInventoryDefinitionWorkAudits5().remove(warehouseInventoryDefinitionWorkAudits5);
		warehouseInventoryDefinitionWorkAudits5.setUserCode5(null);

		return warehouseInventoryDefinitionWorkAudits5;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits6() {
		return this.warehouseInventoryDefinitionWorkAudits6;
	}

	public void setWarehouseInventoryDefinitionWorkAudits6(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits6) {
		this.warehouseInventoryDefinitionWorkAudits6 = warehouseInventoryDefinitionWorkAudits6;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits6(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits6) {
		getWarehouseInventoryDefinitionWorkAudits6().add(warehouseInventoryDefinitionWorkAudits6);
		warehouseInventoryDefinitionWorkAudits6.setUserCode6(this);

		return warehouseInventoryDefinitionWorkAudits6;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits6(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits6) {
		getWarehouseInventoryDefinitionWorkAudits6().remove(warehouseInventoryDefinitionWorkAudits6);
		warehouseInventoryDefinitionWorkAudits6.setUserCode6(null);

		return warehouseInventoryDefinitionWorkAudits6;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits7() {
		return this.warehouseInventoryDefinitionWorkAudits7;
	}

	public void setWarehouseInventoryDefinitionWorkAudits7(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits7) {
		this.warehouseInventoryDefinitionWorkAudits7 = warehouseInventoryDefinitionWorkAudits7;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits7(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits7) {
		getWarehouseInventoryDefinitionWorkAudits7().add(warehouseInventoryDefinitionWorkAudits7);
		warehouseInventoryDefinitionWorkAudits7.setUserCode7(this);

		return warehouseInventoryDefinitionWorkAudits7;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits7(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits7) {
		getWarehouseInventoryDefinitionWorkAudits7().remove(warehouseInventoryDefinitionWorkAudits7);
		warehouseInventoryDefinitionWorkAudits7.setUserCode7(null);

		return warehouseInventoryDefinitionWorkAudits7;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits8() {
		return this.warehouseInventoryDefinitionWorkAudits8;
	}

	public void setWarehouseInventoryDefinitionWorkAudits8(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits8) {
		this.warehouseInventoryDefinitionWorkAudits8 = warehouseInventoryDefinitionWorkAudits8;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits8(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits8) {
		getWarehouseInventoryDefinitionWorkAudits8().add(warehouseInventoryDefinitionWorkAudits8);
		warehouseInventoryDefinitionWorkAudits8.setUserCode8(this);

		return warehouseInventoryDefinitionWorkAudits8;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits8(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits8) {
		getWarehouseInventoryDefinitionWorkAudits8().remove(warehouseInventoryDefinitionWorkAudits8);
		warehouseInventoryDefinitionWorkAudits8.setUserCode8(null);

		return warehouseInventoryDefinitionWorkAudits8;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits9() {
		return this.warehouseInventoryDefinitionWorkAudits9;
	}

	public void setWarehouseInventoryDefinitionWorkAudits9(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits9) {
		this.warehouseInventoryDefinitionWorkAudits9 = warehouseInventoryDefinitionWorkAudits9;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits9(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits9) {
		getWarehouseInventoryDefinitionWorkAudits9().add(warehouseInventoryDefinitionWorkAudits9);
		warehouseInventoryDefinitionWorkAudits9.setUserCode9(this);

		return warehouseInventoryDefinitionWorkAudits9;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits9(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits9) {
		getWarehouseInventoryDefinitionWorkAudits9().remove(warehouseInventoryDefinitionWorkAudits9);
		warehouseInventoryDefinitionWorkAudits9.setUserCode9(null);

		return warehouseInventoryDefinitionWorkAudits9;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits10() {
		return this.warehouseInventoryDefinitionWorkAudits10;
	}

	public void setWarehouseInventoryDefinitionWorkAudits10(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits10) {
		this.warehouseInventoryDefinitionWorkAudits10 = warehouseInventoryDefinitionWorkAudits10;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits10(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits10) {
		getWarehouseInventoryDefinitionWorkAudits10().add(warehouseInventoryDefinitionWorkAudits10);
		warehouseInventoryDefinitionWorkAudits10.setUserCode10(this);

		return warehouseInventoryDefinitionWorkAudits10;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits10(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits10) {
		getWarehouseInventoryDefinitionWorkAudits10().remove(warehouseInventoryDefinitionWorkAudits10);
		warehouseInventoryDefinitionWorkAudits10.setUserCode10(null);

		return warehouseInventoryDefinitionWorkAudits10;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits11() {
		return this.warehouseInventoryDefinitionWorkAudits11;
	}

	public void setWarehouseInventoryDefinitionWorkAudits11(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits11) {
		this.warehouseInventoryDefinitionWorkAudits11 = warehouseInventoryDefinitionWorkAudits11;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits11(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits11) {
		getWarehouseInventoryDefinitionWorkAudits11().add(warehouseInventoryDefinitionWorkAudits11);
		warehouseInventoryDefinitionWorkAudits11.setUserCode11(this);

		return warehouseInventoryDefinitionWorkAudits11;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits11(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits11) {
		getWarehouseInventoryDefinitionWorkAudits11().remove(warehouseInventoryDefinitionWorkAudits11);
		warehouseInventoryDefinitionWorkAudits11.setUserCode11(null);

		return warehouseInventoryDefinitionWorkAudits11;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits12() {
		return this.warehouseInventoryDefinitionWorkAudits12;
	}

	public void setWarehouseInventoryDefinitionWorkAudits12(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits12) {
		this.warehouseInventoryDefinitionWorkAudits12 = warehouseInventoryDefinitionWorkAudits12;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudits12(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits12) {
		getWarehouseInventoryDefinitionWorkAudits12().add(warehouseInventoryDefinitionWorkAudits12);
		warehouseInventoryDefinitionWorkAudits12.setUserCode12(this);

		return warehouseInventoryDefinitionWorkAudits12;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudits12(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudits12) {
		getWarehouseInventoryDefinitionWorkAudits12().remove(warehouseInventoryDefinitionWorkAudits12);
		warehouseInventoryDefinitionWorkAudits12.setUserCode12(null);

		return warehouseInventoryDefinitionWorkAudits12;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks1() {
		return this.warehouseInventoryDefinitionWorks1;
	}

	public void setWarehouseInventoryDefinitionWorks1(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks1) {
		this.warehouseInventoryDefinitionWorks1 = warehouseInventoryDefinitionWorks1;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks1(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks1) {
		getWarehouseInventoryDefinitionWorks1().add(warehouseInventoryDefinitionWorks1);
		warehouseInventoryDefinitionWorks1.setUserCode1(this);

		return warehouseInventoryDefinitionWorks1;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks1(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks1) {
		getWarehouseInventoryDefinitionWorks1().remove(warehouseInventoryDefinitionWorks1);
		warehouseInventoryDefinitionWorks1.setUserCode1(null);

		return warehouseInventoryDefinitionWorks1;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks2() {
		return this.warehouseInventoryDefinitionWorks2;
	}

	public void setWarehouseInventoryDefinitionWorks2(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks2) {
		this.warehouseInventoryDefinitionWorks2 = warehouseInventoryDefinitionWorks2;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks2(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks2) {
		getWarehouseInventoryDefinitionWorks2().add(warehouseInventoryDefinitionWorks2);
		warehouseInventoryDefinitionWorks2.setUserCode2(this);

		return warehouseInventoryDefinitionWorks2;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks2(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks2) {
		getWarehouseInventoryDefinitionWorks2().remove(warehouseInventoryDefinitionWorks2);
		warehouseInventoryDefinitionWorks2.setUserCode2(null);

		return warehouseInventoryDefinitionWorks2;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks3() {
		return this.warehouseInventoryDefinitionWorks3;
	}

	public void setWarehouseInventoryDefinitionWorks3(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks3) {
		this.warehouseInventoryDefinitionWorks3 = warehouseInventoryDefinitionWorks3;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks3(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks3) {
		getWarehouseInventoryDefinitionWorks3().add(warehouseInventoryDefinitionWorks3);
		warehouseInventoryDefinitionWorks3.setUserCode3(this);

		return warehouseInventoryDefinitionWorks3;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks3(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks3) {
		getWarehouseInventoryDefinitionWorks3().remove(warehouseInventoryDefinitionWorks3);
		warehouseInventoryDefinitionWorks3.setUserCode3(null);

		return warehouseInventoryDefinitionWorks3;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks4() {
		return this.warehouseInventoryDefinitionWorks4;
	}

	public void setWarehouseInventoryDefinitionWorks4(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks4) {
		this.warehouseInventoryDefinitionWorks4 = warehouseInventoryDefinitionWorks4;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks4(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks4) {
		getWarehouseInventoryDefinitionWorks4().add(warehouseInventoryDefinitionWorks4);
		warehouseInventoryDefinitionWorks4.setUserCode4(this);

		return warehouseInventoryDefinitionWorks4;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks4(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks4) {
		getWarehouseInventoryDefinitionWorks4().remove(warehouseInventoryDefinitionWorks4);
		warehouseInventoryDefinitionWorks4.setUserCode4(null);

		return warehouseInventoryDefinitionWorks4;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks5() {
		return this.warehouseInventoryDefinitionWorks5;
	}

	public void setWarehouseInventoryDefinitionWorks5(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks5) {
		this.warehouseInventoryDefinitionWorks5 = warehouseInventoryDefinitionWorks5;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks5(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks5) {
		getWarehouseInventoryDefinitionWorks5().add(warehouseInventoryDefinitionWorks5);
		warehouseInventoryDefinitionWorks5.setUserCode5(this);

		return warehouseInventoryDefinitionWorks5;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks5(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks5) {
		getWarehouseInventoryDefinitionWorks5().remove(warehouseInventoryDefinitionWorks5);
		warehouseInventoryDefinitionWorks5.setUserCode5(null);

		return warehouseInventoryDefinitionWorks5;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks6() {
		return this.warehouseInventoryDefinitionWorks6;
	}

	public void setWarehouseInventoryDefinitionWorks6(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks6) {
		this.warehouseInventoryDefinitionWorks6 = warehouseInventoryDefinitionWorks6;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks6(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks6) {
		getWarehouseInventoryDefinitionWorks6().add(warehouseInventoryDefinitionWorks6);
		warehouseInventoryDefinitionWorks6.setUserCode6(this);

		return warehouseInventoryDefinitionWorks6;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks6(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks6) {
		getWarehouseInventoryDefinitionWorks6().remove(warehouseInventoryDefinitionWorks6);
		warehouseInventoryDefinitionWorks6.setUserCode6(null);

		return warehouseInventoryDefinitionWorks6;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks7() {
		return this.warehouseInventoryDefinitionWorks7;
	}

	public void setWarehouseInventoryDefinitionWorks7(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks7) {
		this.warehouseInventoryDefinitionWorks7 = warehouseInventoryDefinitionWorks7;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks7(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks7) {
		getWarehouseInventoryDefinitionWorks7().add(warehouseInventoryDefinitionWorks7);
		warehouseInventoryDefinitionWorks7.setUserCode7(this);

		return warehouseInventoryDefinitionWorks7;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks7(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks7) {
		getWarehouseInventoryDefinitionWorks7().remove(warehouseInventoryDefinitionWorks7);
		warehouseInventoryDefinitionWorks7.setUserCode7(null);

		return warehouseInventoryDefinitionWorks7;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks8() {
		return this.warehouseInventoryDefinitionWorks8;
	}

	public void setWarehouseInventoryDefinitionWorks8(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks8) {
		this.warehouseInventoryDefinitionWorks8 = warehouseInventoryDefinitionWorks8;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks8(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks8) {
		getWarehouseInventoryDefinitionWorks8().add(warehouseInventoryDefinitionWorks8);
		warehouseInventoryDefinitionWorks8.setUserCode8(this);

		return warehouseInventoryDefinitionWorks8;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks8(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks8) {
		getWarehouseInventoryDefinitionWorks8().remove(warehouseInventoryDefinitionWorks8);
		warehouseInventoryDefinitionWorks8.setUserCode8(null);

		return warehouseInventoryDefinitionWorks8;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks9() {
		return this.warehouseInventoryDefinitionWorks9;
	}

	public void setWarehouseInventoryDefinitionWorks9(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks9) {
		this.warehouseInventoryDefinitionWorks9 = warehouseInventoryDefinitionWorks9;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks9(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks9) {
		getWarehouseInventoryDefinitionWorks9().add(warehouseInventoryDefinitionWorks9);
		warehouseInventoryDefinitionWorks9.setUserCode9(this);

		return warehouseInventoryDefinitionWorks9;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks9(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks9) {
		getWarehouseInventoryDefinitionWorks9().remove(warehouseInventoryDefinitionWorks9);
		warehouseInventoryDefinitionWorks9.setUserCode9(null);

		return warehouseInventoryDefinitionWorks9;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks10() {
		return this.warehouseInventoryDefinitionWorks10;
	}

	public void setWarehouseInventoryDefinitionWorks10(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks10) {
		this.warehouseInventoryDefinitionWorks10 = warehouseInventoryDefinitionWorks10;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks10(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks10) {
		getWarehouseInventoryDefinitionWorks10().add(warehouseInventoryDefinitionWorks10);
		warehouseInventoryDefinitionWorks10.setUserCode10(this);

		return warehouseInventoryDefinitionWorks10;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks10(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks10) {
		getWarehouseInventoryDefinitionWorks10().remove(warehouseInventoryDefinitionWorks10);
		warehouseInventoryDefinitionWorks10.setUserCode10(null);

		return warehouseInventoryDefinitionWorks10;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks11() {
		return this.warehouseInventoryDefinitionWorks11;
	}

	public void setWarehouseInventoryDefinitionWorks11(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks11) {
		this.warehouseInventoryDefinitionWorks11 = warehouseInventoryDefinitionWorks11;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks11(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks11) {
		getWarehouseInventoryDefinitionWorks11().add(warehouseInventoryDefinitionWorks11);
		warehouseInventoryDefinitionWorks11.setUserCode11(this);

		return warehouseInventoryDefinitionWorks11;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks11(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks11) {
		getWarehouseInventoryDefinitionWorks11().remove(warehouseInventoryDefinitionWorks11);
		warehouseInventoryDefinitionWorks11.setUserCode11(null);

		return warehouseInventoryDefinitionWorks11;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks12() {
		return this.warehouseInventoryDefinitionWorks12;
	}

	public void setWarehouseInventoryDefinitionWorks12(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks12) {
		this.warehouseInventoryDefinitionWorks12 = warehouseInventoryDefinitionWorks12;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWorks12(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks12) {
		getWarehouseInventoryDefinitionWorks12().add(warehouseInventoryDefinitionWorks12);
		warehouseInventoryDefinitionWorks12.setUserCode12(this);

		return warehouseInventoryDefinitionWorks12;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWorks12(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWorks12) {
		getWarehouseInventoryDefinitionWorks12().remove(warehouseInventoryDefinitionWorks12);
		warehouseInventoryDefinitionWorks12.setUserCode12(null);

		return warehouseInventoryDefinitionWorks12;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions1() {
		return this.warehouseInventoryDefinitions1;
	}

	public void setWarehouseInventoryDefinitions1(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions1) {
		this.warehouseInventoryDefinitions1 = warehouseInventoryDefinitions1;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions1(WarehouseInventoryDefinition warehouseInventoryDefinitions1) {
		getWarehouseInventoryDefinitions1().add(warehouseInventoryDefinitions1);
		warehouseInventoryDefinitions1.setUserCode1(this);

		return warehouseInventoryDefinitions1;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions1(WarehouseInventoryDefinition warehouseInventoryDefinitions1) {
		getWarehouseInventoryDefinitions1().remove(warehouseInventoryDefinitions1);
		warehouseInventoryDefinitions1.setUserCode1(null);

		return warehouseInventoryDefinitions1;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions2() {
		return this.warehouseInventoryDefinitions2;
	}

	public void setWarehouseInventoryDefinitions2(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions2) {
		this.warehouseInventoryDefinitions2 = warehouseInventoryDefinitions2;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions2(WarehouseInventoryDefinition warehouseInventoryDefinitions2) {
		getWarehouseInventoryDefinitions2().add(warehouseInventoryDefinitions2);
		warehouseInventoryDefinitions2.setUserCode2(this);

		return warehouseInventoryDefinitions2;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions2(WarehouseInventoryDefinition warehouseInventoryDefinitions2) {
		getWarehouseInventoryDefinitions2().remove(warehouseInventoryDefinitions2);
		warehouseInventoryDefinitions2.setUserCode2(null);

		return warehouseInventoryDefinitions2;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions3() {
		return this.warehouseInventoryDefinitions3;
	}

	public void setWarehouseInventoryDefinitions3(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions3) {
		this.warehouseInventoryDefinitions3 = warehouseInventoryDefinitions3;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions3(WarehouseInventoryDefinition warehouseInventoryDefinitions3) {
		getWarehouseInventoryDefinitions3().add(warehouseInventoryDefinitions3);
		warehouseInventoryDefinitions3.setUserCode3(this);

		return warehouseInventoryDefinitions3;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions3(WarehouseInventoryDefinition warehouseInventoryDefinitions3) {
		getWarehouseInventoryDefinitions3().remove(warehouseInventoryDefinitions3);
		warehouseInventoryDefinitions3.setUserCode3(null);

		return warehouseInventoryDefinitions3;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions4() {
		return this.warehouseInventoryDefinitions4;
	}

	public void setWarehouseInventoryDefinitions4(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions4) {
		this.warehouseInventoryDefinitions4 = warehouseInventoryDefinitions4;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions4(WarehouseInventoryDefinition warehouseInventoryDefinitions4) {
		getWarehouseInventoryDefinitions4().add(warehouseInventoryDefinitions4);
		warehouseInventoryDefinitions4.setUserCode4(this);

		return warehouseInventoryDefinitions4;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions4(WarehouseInventoryDefinition warehouseInventoryDefinitions4) {
		getWarehouseInventoryDefinitions4().remove(warehouseInventoryDefinitions4);
		warehouseInventoryDefinitions4.setUserCode4(null);

		return warehouseInventoryDefinitions4;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions5() {
		return this.warehouseInventoryDefinitions5;
	}

	public void setWarehouseInventoryDefinitions5(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions5) {
		this.warehouseInventoryDefinitions5 = warehouseInventoryDefinitions5;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions5(WarehouseInventoryDefinition warehouseInventoryDefinitions5) {
		getWarehouseInventoryDefinitions5().add(warehouseInventoryDefinitions5);
		warehouseInventoryDefinitions5.setUserCode5(this);

		return warehouseInventoryDefinitions5;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions5(WarehouseInventoryDefinition warehouseInventoryDefinitions5) {
		getWarehouseInventoryDefinitions5().remove(warehouseInventoryDefinitions5);
		warehouseInventoryDefinitions5.setUserCode5(null);

		return warehouseInventoryDefinitions5;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions6() {
		return this.warehouseInventoryDefinitions6;
	}

	public void setWarehouseInventoryDefinitions6(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions6) {
		this.warehouseInventoryDefinitions6 = warehouseInventoryDefinitions6;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions6(WarehouseInventoryDefinition warehouseInventoryDefinitions6) {
		getWarehouseInventoryDefinitions6().add(warehouseInventoryDefinitions6);
		warehouseInventoryDefinitions6.setUserCode6(this);

		return warehouseInventoryDefinitions6;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions6(WarehouseInventoryDefinition warehouseInventoryDefinitions6) {
		getWarehouseInventoryDefinitions6().remove(warehouseInventoryDefinitions6);
		warehouseInventoryDefinitions6.setUserCode6(null);

		return warehouseInventoryDefinitions6;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions7() {
		return this.warehouseInventoryDefinitions7;
	}

	public void setWarehouseInventoryDefinitions7(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions7) {
		this.warehouseInventoryDefinitions7 = warehouseInventoryDefinitions7;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions7(WarehouseInventoryDefinition warehouseInventoryDefinitions7) {
		getWarehouseInventoryDefinitions7().add(warehouseInventoryDefinitions7);
		warehouseInventoryDefinitions7.setUserCode7(this);

		return warehouseInventoryDefinitions7;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions7(WarehouseInventoryDefinition warehouseInventoryDefinitions7) {
		getWarehouseInventoryDefinitions7().remove(warehouseInventoryDefinitions7);
		warehouseInventoryDefinitions7.setUserCode7(null);

		return warehouseInventoryDefinitions7;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions8() {
		return this.warehouseInventoryDefinitions8;
	}

	public void setWarehouseInventoryDefinitions8(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions8) {
		this.warehouseInventoryDefinitions8 = warehouseInventoryDefinitions8;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions8(WarehouseInventoryDefinition warehouseInventoryDefinitions8) {
		getWarehouseInventoryDefinitions8().add(warehouseInventoryDefinitions8);
		warehouseInventoryDefinitions8.setUserCode8(this);

		return warehouseInventoryDefinitions8;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions8(WarehouseInventoryDefinition warehouseInventoryDefinitions8) {
		getWarehouseInventoryDefinitions8().remove(warehouseInventoryDefinitions8);
		warehouseInventoryDefinitions8.setUserCode8(null);

		return warehouseInventoryDefinitions8;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions9() {
		return this.warehouseInventoryDefinitions9;
	}

	public void setWarehouseInventoryDefinitions9(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions9) {
		this.warehouseInventoryDefinitions9 = warehouseInventoryDefinitions9;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions9(WarehouseInventoryDefinition warehouseInventoryDefinitions9) {
		getWarehouseInventoryDefinitions9().add(warehouseInventoryDefinitions9);
		warehouseInventoryDefinitions9.setUserCode9(this);

		return warehouseInventoryDefinitions9;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions9(WarehouseInventoryDefinition warehouseInventoryDefinitions9) {
		getWarehouseInventoryDefinitions9().remove(warehouseInventoryDefinitions9);
		warehouseInventoryDefinitions9.setUserCode9(null);

		return warehouseInventoryDefinitions9;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions10() {
		return this.warehouseInventoryDefinitions10;
	}

	public void setWarehouseInventoryDefinitions10(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions10) {
		this.warehouseInventoryDefinitions10 = warehouseInventoryDefinitions10;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions10(WarehouseInventoryDefinition warehouseInventoryDefinitions10) {
		getWarehouseInventoryDefinitions10().add(warehouseInventoryDefinitions10);
		warehouseInventoryDefinitions10.setUserCode10(this);

		return warehouseInventoryDefinitions10;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions10(WarehouseInventoryDefinition warehouseInventoryDefinitions10) {
		getWarehouseInventoryDefinitions10().remove(warehouseInventoryDefinitions10);
		warehouseInventoryDefinitions10.setUserCode10(null);

		return warehouseInventoryDefinitions10;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions11() {
		return this.warehouseInventoryDefinitions11;
	}

	public void setWarehouseInventoryDefinitions11(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions11) {
		this.warehouseInventoryDefinitions11 = warehouseInventoryDefinitions11;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions11(WarehouseInventoryDefinition warehouseInventoryDefinitions11) {
		getWarehouseInventoryDefinitions11().add(warehouseInventoryDefinitions11);
		warehouseInventoryDefinitions11.setUserCode11(this);

		return warehouseInventoryDefinitions11;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions11(WarehouseInventoryDefinition warehouseInventoryDefinitions11) {
		getWarehouseInventoryDefinitions11().remove(warehouseInventoryDefinitions11);
		warehouseInventoryDefinitions11.setUserCode11(null);

		return warehouseInventoryDefinitions11;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions12() {
		return this.warehouseInventoryDefinitions12;
	}

	public void setWarehouseInventoryDefinitions12(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions12) {
		this.warehouseInventoryDefinitions12 = warehouseInventoryDefinitions12;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinitions12(WarehouseInventoryDefinition warehouseInventoryDefinitions12) {
		getWarehouseInventoryDefinitions12().add(warehouseInventoryDefinitions12);
		warehouseInventoryDefinitions12.setUserCode12(this);

		return warehouseInventoryDefinitions12;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinitions12(WarehouseInventoryDefinition warehouseInventoryDefinitions12) {
		getWarehouseInventoryDefinitions12().remove(warehouseInventoryDefinitions12);
		warehouseInventoryDefinitions12.setUserCode12(null);

		return warehouseInventoryDefinitions12;
	}

	public Set<WorkflowAudit> getWorkflowAudits1() {
		return this.workflowAudits1;
	}

	public void setWorkflowAudits1(Set<WorkflowAudit> workflowAudits1) {
		this.workflowAudits1 = workflowAudits1;
	}

	public WorkflowAudit addWorkflowAudits1(WorkflowAudit workflowAudits1) {
		getWorkflowAudits1().add(workflowAudits1);
		workflowAudits1.setUserCode1(this);

		return workflowAudits1;
	}

	public WorkflowAudit removeWorkflowAudits1(WorkflowAudit workflowAudits1) {
		getWorkflowAudits1().remove(workflowAudits1);
		workflowAudits1.setUserCode1(null);

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
		workflowAudits2.setUserCode2(this);

		return workflowAudits2;
	}

	public WorkflowAudit removeWorkflowAudits2(WorkflowAudit workflowAudits2) {
		getWorkflowAudits2().remove(workflowAudits2);
		workflowAudits2.setUserCode2(null);

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
		workflowAudits3.setUserCode3(this);

		return workflowAudits3;
	}

	public WorkflowAudit removeWorkflowAudits3(WorkflowAudit workflowAudits3) {
		getWorkflowAudits3().remove(workflowAudits3);
		workflowAudits3.setUserCode3(null);

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
		workflowAudits4.setUserCode4(this);

		return workflowAudits4;
	}

	public WorkflowAudit removeWorkflowAudits4(WorkflowAudit workflowAudits4) {
		getWorkflowAudits4().remove(workflowAudits4);
		workflowAudits4.setUserCode4(null);

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
		workflowAudits5.setUserCode5(this);

		return workflowAudits5;
	}

	public WorkflowAudit removeWorkflowAudits5(WorkflowAudit workflowAudits5) {
		getWorkflowAudits5().remove(workflowAudits5);
		workflowAudits5.setUserCode5(null);

		return workflowAudits5;
	}

	public Set<WorkflowAudit> getWorkflowAudits6() {
		return this.workflowAudits6;
	}

	public void setWorkflowAudits6(Set<WorkflowAudit> workflowAudits6) {
		this.workflowAudits6 = workflowAudits6;
	}

	public WorkflowAudit addWorkflowAudits6(WorkflowAudit workflowAudits6) {
		getWorkflowAudits6().add(workflowAudits6);
		workflowAudits6.setUserCode6(this);

		return workflowAudits6;
	}

	public WorkflowAudit removeWorkflowAudits6(WorkflowAudit workflowAudits6) {
		getWorkflowAudits6().remove(workflowAudits6);
		workflowAudits6.setUserCode6(null);

		return workflowAudits6;
	}

	public Set<Workflow> getWorkflows1() {
		return this.workflows1;
	}

	public void setWorkflows1(Set<Workflow> workflows1) {
		this.workflows1 = workflows1;
	}

	public Workflow addWorkflows1(Workflow workflows1) {
		getWorkflows1().add(workflows1);
		workflows1.setUserCode1(this);

		return workflows1;
	}

	public Workflow removeWorkflows1(Workflow workflows1) {
		getWorkflows1().remove(workflows1);
		workflows1.setUserCode1(null);

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
		workflows2.setUserCode2(this);

		return workflows2;
	}

	public Workflow removeWorkflows2(Workflow workflows2) {
		getWorkflows2().remove(workflows2);
		workflows2.setUserCode2(null);

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
		workflows3.setUserCode3(this);

		return workflows3;
	}

	public Workflow removeWorkflows3(Workflow workflows3) {
		getWorkflows3().remove(workflows3);
		workflows3.setUserCode3(null);

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
		workflows4.setUserCode4(this);

		return workflows4;
	}

	public Workflow removeWorkflows4(Workflow workflows4) {
		getWorkflows4().remove(workflows4);
		workflows4.setUserCode4(null);

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
		workflows5.setUserCode5(this);

		return workflows5;
	}

	public Workflow removeWorkflows5(Workflow workflows5) {
		getWorkflows5().remove(workflows5);
		workflows5.setUserCode5(null);

		return workflows5;
	}

	public Set<Workflow> getWorkflows6() {
		return this.workflows6;
	}

	public void setWorkflows6(Set<Workflow> workflows6) {
		this.workflows6 = workflows6;
	}

	public Workflow addWorkflows6(Workflow workflows6) {
		getWorkflows6().add(workflows6);
		workflows6.setUserCode6(this);

		return workflows6;
	}

	public Workflow removeWorkflows6(Workflow workflows6) {
		getWorkflows6().remove(workflows6);
		workflows6.setUserCode6(null);

		return workflows6;
	}

	public Set<Workflow> getWorkflows7() {
		return this.workflows7;
	}

	public void setWorkflows7(Set<Workflow> workflows7) {
		this.workflows7 = workflows7;
	}

	public Workflow addWorkflows7(Workflow workflows7) {
		getWorkflows7().add(workflows7);
		workflows7.setUserCode7(this);

		return workflows7;
	}

	public Workflow removeWorkflows7(Workflow workflows7) {
		getWorkflows7().remove(workflows7);
		workflows7.setUserCode7(null);

		return workflows7;
	}

}