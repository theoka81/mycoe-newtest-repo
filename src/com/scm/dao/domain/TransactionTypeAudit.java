package com.scm.dao.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the TransactionTypeAudits database table.
 * 
 */
@Entity
@Table(name="TransactionTypeAudits")
@NamedQuery(name="TransactionTypeAudit.findAll", query="SELECT t FROM TransactionTypeAudit t")
public class TransactionTypeAudit implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId")
	private Long auditId;

	@Column(name="Action")
	private String action;
	
	@Column(name="DateTime")
	private Timestamp dateTime;
	
	@Column(name="SystemUserId")
	private Long systemUserId;
	
	@Column(name="Id")
	private Long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Description")
	private String description;

	@Column(name="`Key`")
	private String key;
	
	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="IsDeleted")
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;
	
	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;
	
	@Column(name="ApprovalVersionId")
	private Long approvalVersionId;
	
	@Column(name="TransactionTypeId")
	private Long transactionTypeId;

	@Column(name="TransactionTypeValue")
	private String transactionTypeValue;
	
	@Column(name="TableName")
	private String tableName;

	@Column(name="ApprovalTemplateCode")
	private String approvalTemplateCode;

	@Column(name="ApprovalTemplateTypeId")
	private Long approvalTemplateTypeId;

	@Column(name="ApprovalTemplateType")
	private String approvalTemplateType;
	
	@Column(name="TransactionIdMap")
	private Long transactionIdMap;
	
	@Column(name="ProgramIdDrillDown")
	private String programIdDrillDown;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	public TransactionTypeAudit() {
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

	public Long getApprovalTemplateTypeId() {
		return this.approvalTemplateTypeId;
	}

	public void setApprovalTemplateTypeId(Long approvalTemplateTypeId) {
		this.approvalTemplateTypeId = approvalTemplateTypeId;
	}

	public Long getApprovalVersionId() {
		return this.approvalVersionId;
	}

	public void setApprovalVersionId(Long approvalVersionId) {
		this.approvalVersionId = approvalVersionId;
	}

	public Long getCreatedBySystemUserId() {
		return this.createdBySystemUserId;
	}

	public void setCreatedBySystemUserId(Long createdBySystemUserId) {
		this.createdBySystemUserId = createdBySystemUserId;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Long getModifiedBySystemUserId() {
		return this.modifiedBySystemUserId;
	}

	public void setModifiedBySystemUserId(Long modifiedBySystemUserId) {
		this.modifiedBySystemUserId = modifiedBySystemUserId;
	}

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProgramIdDrillDown() {
		return this.programIdDrillDown;
	}

	public void setProgramIdDrillDown(String programIdDrillDown) {
		this.programIdDrillDown = programIdDrillDown;
	}

	public Long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Long getTransactionIdMap() {
		return this.transactionIdMap;
	}

	public void setTransactionIdMap(Long transactionIdMap) {
		this.transactionIdMap = transactionIdMap;
	}

	public Long getTransactionTypeId() {
		return this.transactionTypeId;
	}

	public void setTransactionTypeId(Long transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public String getTransactionTypeValue() {
		return this.transactionTypeValue;
	}

	public void setTransactionTypeValue(String transactionTypeValue) {
		this.transactionTypeValue = transactionTypeValue;
	}

}