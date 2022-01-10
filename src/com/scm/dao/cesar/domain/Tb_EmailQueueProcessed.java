package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_EmailQueueProcessed database table.
 * 
 */
@Entity
@Table(name="tb_EmailQueueProcessed")
@NamedQuery(name="Tb_EmailQueueProcessed.findAll", query="SELECT t FROM Tb_EmailQueueProcessed t")
public class Tb_EmailQueueProcessed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ApplicationId")
	private int applicationId;

	@Column(name="BccList")
	private String bccList;

	@Column(name="Body")
	private Object body;

	@Column(name="CcList")
	private String ccList;

	@Column(name="EmailAccountId")
	private int emailAccountId;

	@Column(name="EmailQueueId")
	private int emailQueueId;

	@Column(name="FailureCount")
	private int failureCount;

	@Column(name="HasAttachments")
	private boolean hasAttachments;

	@Column(name="IsHtml")
	private boolean isHtml;

	@Column(name="ProcessedDateTime")
	private Timestamp processedDateTime;

	@Column(name="QueueDateTime")
	private Timestamp queueDateTime;

	@Column(name="ReferenceId")
	private String referenceId;

	@Column(name="ReferenceTypeId")
	private int referenceTypeId;

	@Column(name="Subject")
	private String subject;

	@Column(name="ToList")
	private String toList;

	public Tb_EmailQueueProcessed() {
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getBccList() {
		return this.bccList;
	}

	public void setBccList(String bccList) {
		this.bccList = bccList;
	}

	public Object getBody() {
		return this.body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public String getCcList() {
		return this.ccList;
	}

	public void setCcList(String ccList) {
		this.ccList = ccList;
	}

	public int getEmailAccountId() {
		return this.emailAccountId;
	}

	public void setEmailAccountId(int emailAccountId) {
		this.emailAccountId = emailAccountId;
	}

	public int getEmailQueueId() {
		return this.emailQueueId;
	}

	public void setEmailQueueId(int emailQueueId) {
		this.emailQueueId = emailQueueId;
	}

	public int getFailureCount() {
		return this.failureCount;
	}

	public void setFailureCount(int failureCount) {
		this.failureCount = failureCount;
	}

	public boolean getHasAttachments() {
		return this.hasAttachments;
	}

	public void setHasAttachments(boolean hasAttachments) {
		this.hasAttachments = hasAttachments;
	}

	public boolean getIsHtml() {
		return this.isHtml;
	}

	public void setIsHtml(boolean isHtml) {
		this.isHtml = isHtml;
	}

	public Timestamp getProcessedDateTime() {
		return this.processedDateTime;
	}

	public void setProcessedDateTime(Timestamp processedDateTime) {
		this.processedDateTime = processedDateTime;
	}

	public Timestamp getQueueDateTime() {
		return this.queueDateTime;
	}

	public void setQueueDateTime(Timestamp queueDateTime) {
		this.queueDateTime = queueDateTime;
	}

	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public int getReferenceTypeId() {
		return this.referenceTypeId;
	}

	public void setReferenceTypeId(int referenceTypeId) {
		this.referenceTypeId = referenceTypeId;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getToList() {
		return this.toList;
	}

	public void setToList(String toList) {
		this.toList = toList;
	}

}