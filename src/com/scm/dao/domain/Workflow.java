package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Workflows database table.
 * 
 */
@Entity
@Table(name="Workflows")
@NamedQuery(name="Workflow.findAll", query="SELECT w FROM Workflow w")
public class Workflow implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ApprovalProcessTypeId")
	private Long approvalProcessTypeId;

	@Column(name="ApprovalTemplateCode")
	private String approvalTemplateCode;

	@Column(name="ApprovalTemplateType")
	private String approvalTemplateType;

	@Column(name="ApprovedBy")
	private String approvedBy;

	@Column(name="ApprovedDate")
	private Timestamp approvedDate;

	@Column(name="ApprovedMessage")
	private String approvedMessage;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="EventId")
	private Long eventId;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="IsStandard", nullable=false)
	private Boolean isStandard;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="RoundNo")
	private Long roundNo;

	@Column(name="Status")
	private String status;

	@Column(name="StepNo")
	private Long stepNo;

	@Column(name="TaskDateEnded")
	private Timestamp taskDateEnded;

	@Column(name="TaskDateStarted")
	private Timestamp taskDateStarted;

	@Column(name="TaskId")
	private Long taskId;

	@Column(name="TransactionId")
	private Long transactionId;

	@Column(name="TransactionType")
	private String transactionType;

	@Column(name="TrxnOriginator")
	private String trxnOriginator;

	@Column(name="WorkflowDateEnded")
	private Timestamp workflowDateEnded;

	@Column(name="WorkflowDateStarted")
	private Timestamp workflowDateStarted;

	@Column(name="WorkflowDescription")
	private String workflowDescription;

	//bi-directional many-to-one association to ApprovalTemplate
	@ManyToOne
	@JoinColumn(name="ApprovalTemplateVersionId")
	private ApprovalTemplate approvalTemplate;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ApprovedByUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser3;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="TrxnOriginatorId")
	private SystemUser systemUser4;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="UserId")
	private SystemUser systemUser5;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ApprovalTemplateTypeId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ApprovedMessageTypeId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="GroupId")
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusId")
	private UserCode userCode4;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="TeamId")
	private UserCode userCode5;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="TransactionTypeId")
	private UserCode userCode6;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="UnitId")
	private UserCode userCode7;

	public Workflow() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getApprovalProcessTypeId() {
		return this.approvalProcessTypeId;
	}

	public void setApprovalProcessTypeId(Long approvalProcessTypeId) {
		this.approvalProcessTypeId = approvalProcessTypeId;
	}

	public String getApprovalTemplateCode() {
		return this.approvalTemplateCode;
	}

	public void setApprovalTemplateCode(String approvalTemplateCode) {
		this.approvalTemplateCode = approvalTemplateCode;
	}

	public String getApprovalTemplateType() {
		return this.approvalTemplateType;
	}

	public void setApprovalTemplateType(String approvalTemplateType) {
		this.approvalTemplateType = approvalTemplateType;
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Timestamp getApprovedDate() {
		return this.approvedDate;
	}

	public void setApprovedDate(Timestamp approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getApprovedMessage() {
		return this.approvedMessage;
	}

	public void setApprovedMessage(String approvedMessage) {
		this.approvedMessage = approvedMessage;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Long getEventId() {
		return this.eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
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

	public Boolean getIsStandard() {
		return this.isStandard;
	}

	public void setIsStandard(Boolean isStandard) {
		this.isStandard = isStandard;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getRoundNo() {
		return this.roundNo;
	}

	public void setRoundNo(Long roundNo) {
		this.roundNo = roundNo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getStepNo() {
		return this.stepNo;
	}

	public void setStepNo(Long stepNo) {
		this.stepNo = stepNo;
	}

	public Timestamp getTaskDateEnded() {
		return this.taskDateEnded;
	}

	public void setTaskDateEnded(Timestamp taskDateEnded) {
		this.taskDateEnded = taskDateEnded;
	}

	public Timestamp getTaskDateStarted() {
		return this.taskDateStarted;
	}

	public void setTaskDateStarted(Timestamp taskDateStarted) {
		this.taskDateStarted = taskDateStarted;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTrxnOriginator() {
		return this.trxnOriginator;
	}

	public void setTrxnOriginator(String trxnOriginator) {
		this.trxnOriginator = trxnOriginator;
	}

	public Timestamp getWorkflowDateEnded() {
		return this.workflowDateEnded;
	}

	public void setWorkflowDateEnded(Timestamp workflowDateEnded) {
		this.workflowDateEnded = workflowDateEnded;
	}

	public Timestamp getWorkflowDateStarted() {
		return this.workflowDateStarted;
	}

	public void setWorkflowDateStarted(Timestamp workflowDateStarted) {
		this.workflowDateStarted = workflowDateStarted;
	}

	public String getWorkflowDescription() {
		return this.workflowDescription;
	}

	public void setWorkflowDescription(String workflowDescription) {
		this.workflowDescription = workflowDescription;
	}

	public ApprovalTemplate getApprovalTemplate() {
		return this.approvalTemplate;
	}

	public void setApprovalTemplate(ApprovalTemplate approvalTemplate) {
		this.approvalTemplate = approvalTemplate;
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

	public SystemUser getSystemUser3() {
		return this.systemUser3;
	}

	public void setSystemUser3(SystemUser systemUser3) {
		this.systemUser3 = systemUser3;
	}

	public SystemUser getSystemUser4() {
		return this.systemUser4;
	}

	public void setSystemUser4(SystemUser systemUser4) {
		this.systemUser4 = systemUser4;
	}

	public SystemUser getSystemUser5() {
		return this.systemUser5;
	}

	public void setSystemUser5(SystemUser systemUser5) {
		this.systemUser5 = systemUser5;
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

	public UserCode getUserCode4() {
		return this.userCode4;
	}

	public void setUserCode4(UserCode userCode4) {
		this.userCode4 = userCode4;
	}

	public UserCode getUserCode5() {
		return this.userCode5;
	}

	public void setUserCode5(UserCode userCode5) {
		this.userCode5 = userCode5;
	}

	public UserCode getUserCode6() {
		return this.userCode6;
	}

	public void setUserCode6(UserCode userCode6) {
		this.userCode6 = userCode6;
	}

	public UserCode getUserCode7() {
		return this.userCode7;
	}

	public void setUserCode7(UserCode userCode7) {
		this.userCode7 = userCode7;
	}

}