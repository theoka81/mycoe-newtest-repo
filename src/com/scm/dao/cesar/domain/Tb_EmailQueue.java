package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_EmailQueue database table.
 * 
 */
@Entity
@Table(name="tb_EmailQueue")
@NamedQuery(name="Tb_EmailQueue.findAll", query="SELECT t FROM Tb_EmailQueue t")
public class Tb_EmailQueue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmailQueueId")
	private int emailQueueId;

	@Column(name="ApplicationId")
	private int applicationId;

	@Column(name="BccList")
	private String bccList;

	@Column(name="Body")
	private String body;

	@Column(name="CcList")
	private String ccList;

	@Column(name="EmailAccountId")
	private int emailAccountId;

	@Column(name="FailureCount")
	private int failureCount;

	@Column(name="HasAttachments")
	private boolean hasAttachments;

	@Column(name="IsHtml")
	private boolean isHtml;

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

	public Tb_EmailQueue() {
	}

	public int getEmailQueueId() {
		return this.emailQueueId;
	}

	public void setEmailQueueId(int emailQueueId) {
		this.emailQueueId = emailQueueId;
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

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
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