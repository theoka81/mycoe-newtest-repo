package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TaskManagerAudits database table.
 * 
 */
@Entity
@Table(name="TaskManagerAudits")
@NamedQuery(name="TaskManagerAudit.findAll", query="SELECT t FROM TaskManagerAudit t")
public class TaskManagerAudit implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId", unique=true, nullable=false)
	private Long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="ApprovalTeam")
	private String approvalTeam;

	@Column(name="ApprovalTemplateCode")
	private Long approvalTemplateCode;

	@Column(name="ApprovalTemplateType")
	private String approvalTemplateType;

	@Column(name="ApprovalType")
	private String approvalType;

	@Column(name="ApprovalUsage")
	private String approvalUsage;

	@Column(name="ApprovalVersionId")
	private Long approvalVersionId;

	@Column(name="AutoApproveNotify", nullable=false)
	private Boolean autoApproveNotify;

	@Column(name="ConditionDescription")
	private String conditionDescription;

	@Column(name="ConditionMessage")
	private String conditionMessage;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="FinalStep", nullable=false)
	private Boolean finalStep;

	@Column(name="Id", nullable=false)
	private Long id;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="Placeholder1")
	private String placeholder1;

	@Column(name="Placeholder10")
	private String placeholder10;

	@Column(name="Placeholder2")
	private String placeholder2;

	@Column(name="Placeholder3")
	private String placeholder3;

	@Column(name="Placeholder4")
	private String placeholder4;

	@Column(name="Placeholder5")
	private String placeholder5;

	@Column(name="Placeholder6")
	private String placeholder6;

	@Column(name="Placeholder7")
	private String placeholder7;

	@Column(name="Placeholder8")
	private String placeholder8;

	@Column(name="Placeholder9")
	private String placeholder9;

	@Column(name="StepNo")
	private Long stepNo;

	@Column(name="SystemUserId")
	private Long systemUserId;

	@Column(name="TaskId")
	private Long taskId;

	@Column(name="UpdateTrxnStatus")
	private String updateTrxnStatus;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="UserId")
	private SystemUser systemUser3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ApprovalTemplateTypeId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ApprovalUsageId")
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
	@JoinColumn(name="UpdateTrxnStatusId")
	private UserCode userCode6;

	public TaskManagerAudit() {
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

	public String getApprovalTeam() {
		return this.approvalTeam;
	}

	public void setApprovalTeam(String approvalTeam) {
		this.approvalTeam = approvalTeam;
	}

	public Long getApprovalTemplateCode() {
		return this.approvalTemplateCode;
	}

	public void setApprovalTemplateCode(Long approvalTemplateCode) {
		this.approvalTemplateCode = approvalTemplateCode;
	}

	public String getApprovalTemplateType() {
		return this.approvalTemplateType;
	}

	public void setApprovalTemplateType(String approvalTemplateType) {
		this.approvalTemplateType = approvalTemplateType;
	}

	public String getApprovalType() {
		return this.approvalType;
	}

	public void setApprovalType(String approvalType) {
		this.approvalType = approvalType;
	}

	public String getApprovalUsage() {
		return this.approvalUsage;
	}

	public void setApprovalUsage(String approvalUsage) {
		this.approvalUsage = approvalUsage;
	}

	public Long getApprovalVersionId() {
		return this.approvalVersionId;
	}

	public void setApprovalVersionId(Long approvalVersionId) {
		this.approvalVersionId = approvalVersionId;
	}

	public Boolean getAutoApproveNotify() {
		return this.autoApproveNotify;
	}

	public void setAutoApproveNotify(Boolean autoApproveNotify) {
		this.autoApproveNotify = autoApproveNotify;
	}

	public String getConditionDescription() {
		return this.conditionDescription;
	}

	public void setConditionDescription(String conditionDescription) {
		this.conditionDescription = conditionDescription;
	}

	public String getConditionMessage() {
		return this.conditionMessage;
	}

	public void setConditionMessage(String conditionMessage) {
		this.conditionMessage = conditionMessage;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public Boolean getFinalStep() {
		return this.finalStep;
	}

	public void setFinalStep(Boolean finalStep) {
		this.finalStep = finalStep;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
	}

	public String getPlaceholder1() {
		return this.placeholder1;
	}

	public void setPlaceholder1(String placeholder1) {
		this.placeholder1 = placeholder1;
	}

	public String getPlaceholder10() {
		return this.placeholder10;
	}

	public void setPlaceholder10(String placeholder10) {
		this.placeholder10 = placeholder10;
	}

	public String getPlaceholder2() {
		return this.placeholder2;
	}

	public void setPlaceholder2(String placeholder2) {
		this.placeholder2 = placeholder2;
	}

	public String getPlaceholder3() {
		return this.placeholder3;
	}

	public void setPlaceholder3(String placeholder3) {
		this.placeholder3 = placeholder3;
	}

	public String getPlaceholder4() {
		return this.placeholder4;
	}

	public void setPlaceholder4(String placeholder4) {
		this.placeholder4 = placeholder4;
	}

	public String getPlaceholder5() {
		return this.placeholder5;
	}

	public void setPlaceholder5(String placeholder5) {
		this.placeholder5 = placeholder5;
	}

	public String getPlaceholder6() {
		return this.placeholder6;
	}

	public void setPlaceholder6(String placeholder6) {
		this.placeholder6 = placeholder6;
	}

	public String getPlaceholder7() {
		return this.placeholder7;
	}

	public void setPlaceholder7(String placeholder7) {
		this.placeholder7 = placeholder7;
	}

	public String getPlaceholder8() {
		return this.placeholder8;
	}

	public void setPlaceholder8(String placeholder8) {
		this.placeholder8 = placeholder8;
	}

	public String getPlaceholder9() {
		return this.placeholder9;
	}

	public void setPlaceholder9(String placeholder9) {
		this.placeholder9 = placeholder9;
	}

	public Long getStepNo() {
		return this.stepNo;
	}

	public void setStepNo(Long stepNo) {
		this.stepNo = stepNo;
	}

	public Long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getUpdateTrxnStatus() {
		return this.updateTrxnStatus;
	}

	public void setUpdateTrxnStatus(String updateTrxnStatus) {
		this.updateTrxnStatus = updateTrxnStatus;
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

}