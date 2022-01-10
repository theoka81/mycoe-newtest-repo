package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the ApprovalTemplates database table.
 * 
 */
@Entity
@Table(name="ApprovalTemplates")
@NamedQuery(name="ApprovalTemplate.findAll", query="SELECT a FROM ApprovalTemplate a")
public class ApprovalTemplate implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ApprovalTemplateCode")
	private String approvalTemplateCode;

	@Column(name="ApprovalTemplateDescription")
	private String approvalTemplateDescription;

	@Column(name="ApprovalTemplateType")
	private String approvalTemplateType;

	@Column(name="ApprovalVersionId")
	private Long approvalVersionId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="RelatedTo")
	private String relatedTo;

	@Column(name="TemplateAction")
	private String templateAction;

	@Column(name="TemplateStatus")
	private String templateStatus;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ApprovalTemplateTypeId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="TemplateActionId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="TemplateStatusId")
	private UserCode userCode3;

	//bi-directional many-to-one association to WorkflowAudit
	@OneToMany(mappedBy="approvalTemplate")
	private Set<WorkflowAudit> workflowAudits;

	//bi-directional many-to-one association to Workflow
	@OneToMany(mappedBy="approvalTemplate")
	private Set<Workflow> workflows;

	public ApprovalTemplate() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApprovalTemplateCode() {
		return this.approvalTemplateCode;
	}

	public void setApprovalTemplateCode(String approvalTemplateCode) {
		this.approvalTemplateCode = approvalTemplateCode;
	}

	public String getApprovalTemplateDescription() {
		return this.approvalTemplateDescription;
	}

	public void setApprovalTemplateDescription(String approvalTemplateDescription) {
		this.approvalTemplateDescription = approvalTemplateDescription;
	}

	public String getApprovalTemplateType() {
		return this.approvalTemplateType;
	}

	public void setApprovalTemplateType(String approvalTemplateType) {
		this.approvalTemplateType = approvalTemplateType;
	}

	public Long getApprovalVersionId() {
		return this.approvalVersionId;
	}

	public void setApprovalVersionId(Long approvalVersionId) {
		this.approvalVersionId = approvalVersionId;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
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

	public String getRelatedTo() {
		return this.relatedTo;
	}

	public void setRelatedTo(String relatedTo) {
		this.relatedTo = relatedTo;
	}

	public String getTemplateAction() {
		return this.templateAction;
	}

	public void setTemplateAction(String templateAction) {
		this.templateAction = templateAction;
	}

	public String getTemplateStatus() {
		return this.templateStatus;
	}

	public void setTemplateStatus(String templateStatus) {
		this.templateStatus = templateStatus;
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

	public UserCode getUserCode1() {
		return this.userCode1;
	}

	public void setUserCode1(UserCode userCode1) {
		this.userCode1 = userCode1;
	}

	public UserCode getUserCode2() {
		return this.userCode2;
	}

	public void setUserCode2(UserCode userCode2) {
		this.userCode2 = userCode2;
	}

	public UserCode getUserCode3() {
		return this.userCode3;
	}

	public void setUserCode3(UserCode userCode3) {
		this.userCode3 = userCode3;
	}

	public Set<WorkflowAudit> getWorkflowAudits() {
		return this.workflowAudits;
	}

	public void setWorkflowAudits(Set<WorkflowAudit> workflowAudits) {
		this.workflowAudits = workflowAudits;
	}

	public WorkflowAudit addWorkflowAudit(WorkflowAudit workflowAudit) {
		getWorkflowAudits().add(workflowAudit);
		workflowAudit.setApprovalTemplate(this);

		return workflowAudit;
	}

	public WorkflowAudit removeWorkflowAudit(WorkflowAudit workflowAudit) {
		getWorkflowAudits().remove(workflowAudit);
		workflowAudit.setApprovalTemplate(null);

		return workflowAudit;
	}

	public Set<Workflow> getWorkflows() {
		return this.workflows;
	}

	public void setWorkflows(Set<Workflow> workflows) {
		this.workflows = workflows;
	}

	public Workflow addWorkflow(Workflow workflow) {
		getWorkflows().add(workflow);
		workflow.setApprovalTemplate(this);

		return workflow;
	}

	public Workflow removeWorkflow(Workflow workflow) {
		getWorkflows().remove(workflow);
		workflow.setApprovalTemplate(null);

		return workflow;
	}

}