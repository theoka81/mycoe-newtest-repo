package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the DocumentAudits database table.
 * 
 */
@Entity
@Table(name="DocumentAudits")
@NamedQuery(name="DocumentAudit.findAll", query="SELECT d FROM DocumentAudit d")
public class DocumentAudit implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId", unique=true, nullable=false)
	private Long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="CodeValue")
	private String codeValue;

	@Column(name="Content")
	private byte[] content;

	@Column(name="ContentType")
	private String contentType;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="DocumentLocation")
	private String documentLocation;

	@Column(name="DocumentName")
	private String documentName;

	@Column(name="FileSize", nullable=false)
	private Long fileSize;

	@Column(name="Id", nullable=false)
	private Long id;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="ReferenceId", nullable=false)
	private Long referenceId;

	@Column(name="SystemUserId")
	private Long systemUserId;

	@Column(name="UserCodeId", nullable=false)
	private Long userCodeId;

	public DocumentAudit() {
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

	public String getCodeValue() {
		return this.codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public byte[] getContent() {
		return this.content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
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

	public String getDocumentLocation() {
		return this.documentLocation;
	}

	public void setDocumentLocation(String documentLocation) {
		this.documentLocation = documentLocation;
	}

	public String getDocumentName() {
		return this.documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public Long getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
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

	public Long getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}

	public Long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public Long getUserCodeId() {
		return this.userCodeId;
	}

	public void setUserCodeId(Long userCodeId) {
		this.userCodeId = userCodeId;
	}

}