package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TaskComparableRoutes database table.
 * 
 */
@Entity
@Table(name="TaskComparableRoutes")
@NamedQuery(name="TaskComparableRoute.findAll", query="SELECT t FROM TaskComparableRoute t")
public class TaskComparableRoute implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ApprovalTemplateCode")
	private Long approvalTemplateCode;

	@Column(name="ApprovalTemplateType")
	private String approvalTemplateType;

	@Column(name="ApprovalVersionId")
	private Long approvalVersionId;

	@Column(name="Comparable")
	private String comparable;

	@Column(name="ComparableConditionLimit")
	private String comparableConditionLimit;

	@Column(name="Condition")
	private String condition;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DateDeactivated")
	private Timestamp dateDeactivated;

	@Column(name="Description")
	private String description;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsAdvertised", nullable=false)
	private Boolean isAdvertised;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="Limit")
	private Long limit;

	@Column(name="MaximumThreshold")
	private Long maximumThreshold;

	@Column(name="MinimumThreshold")
	private Long minimumThreshold;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="OrderTypeFrom")
	private Long orderTypeFrom;

	@Column(name="OrderTypeTo")
	private Long orderTypeTo;

	@Column(name="Responsible")
	private Long responsible;

	@Column(name="SequenceId")
	private Long sequenceId;

	@Column(name="Status")
	private String status;

	@Column(name="StatusFrom")
	private Long statusFrom;

	@Column(name="StatusTo")
	private Long statusTo;

	@Column(name="TaskId")
	private Long taskId;

	@Column(name="TransactionTypeId")
	private Long transactionTypeId;

	@Column(name="UserId")
	private Long userId;

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
	@JoinColumn(name="ComparableId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="GroupId")
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="TeamId")
	private UserCode userCode4;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="UnitId")
	private UserCode userCode5;

	public TaskComparableRoute() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getApprovalVersionId() {
		return this.approvalVersionId;
	}

	public void setApprovalVersionId(Long approvalVersionId) {
		this.approvalVersionId = approvalVersionId;
	}

	public String getComparable() {
		return this.comparable;
	}

	public void setComparable(String comparable) {
		this.comparable = comparable;
	}

	public String getComparableConditionLimit() {
		return this.comparableConditionLimit;
	}

	public void setComparableConditionLimit(String comparableConditionLimit) {
		this.comparableConditionLimit = comparableConditionLimit;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getDateDeactivated() {
		return this.dateDeactivated;
	}

	public void setDateDeactivated(Timestamp dateDeactivated) {
		this.dateDeactivated = dateDeactivated;
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

	public Boolean getIsAdvertised() {
		return this.isAdvertised;
	}

	public void setIsAdvertised(Boolean isAdvertised) {
		this.isAdvertised = isAdvertised;
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

	public Long getLimit() {
		return this.limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Long getMaximumThreshold() {
		return this.maximumThreshold;
	}

	public void setMaximumThreshold(Long maximumThreshold) {
		this.maximumThreshold = maximumThreshold;
	}

	public Long getMinimumThreshold() {
		return this.minimumThreshold;
	}

	public void setMinimumThreshold(Long minimumThreshold) {
		this.minimumThreshold = minimumThreshold;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getOrderTypeFrom() {
		return this.orderTypeFrom;
	}

	public void setOrderTypeFrom(Long orderTypeFrom) {
		this.orderTypeFrom = orderTypeFrom;
	}

	public Long getOrderTypeTo() {
		return this.orderTypeTo;
	}

	public void setOrderTypeTo(Long orderTypeTo) {
		this.orderTypeTo = orderTypeTo;
	}

	public Long getResponsible() {
		return this.responsible;
	}

	public void setResponsible(Long responsible) {
		this.responsible = responsible;
	}

	public Long getSequenceId() {
		return this.sequenceId;
	}

	public void setSequenceId(Long sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getStatusFrom() {
		return this.statusFrom;
	}

	public void setStatusFrom(Long statusFrom) {
		this.statusFrom = statusFrom;
	}

	public Long getStatusTo() {
		return this.statusTo;
	}

	public void setStatusTo(Long statusTo) {
		this.statusTo = statusTo;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTransactionTypeId() {
		return this.transactionTypeId;
	}

	public void setTransactionTypeId(Long transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

}