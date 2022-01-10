package com.scm.dao.cesar.domain;

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
 * The persistent class for the tb_SmsQueue database table.
 * 
 */
@Entity
@Table(name="tb_SmsQueue")
@NamedQuery(name="Tb_SmsQueue.findAll", query="SELECT t FROM Tb_SmsQueue t")
public class Tb_SmsQueue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SmsQueueId")
	private int smsQueueId;

	@Column(name="ApplicationId")
	private int applicationId;

	@Column(name="FailureCount")
	private int failureCount;

	@Column(name="MobileNumber")
	private String mobileNumber;

	@Column(name="QueueDateTime")
	private Timestamp queueDateTime;

	@Column(name="ReferenceId")
	private String referenceId;

	@Column(name="ReferenceTypeId")
	private int referenceTypeId;

	@Column(name="SmsAccountId")
	private int smsAccountId;

	@Column(name="TextMessage")
	private String textMessage;

	public Tb_SmsQueue() {
	}

	public int getSmsQueueId() {
		return this.smsQueueId;
	}

	public void setSmsQueueId(int smsQueueId) {
		this.smsQueueId = smsQueueId;
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getFailureCount() {
		return this.failureCount;
	}

	public void setFailureCount(int failureCount) {
		this.failureCount = failureCount;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	public int getSmsAccountId() {
		return this.smsAccountId;
	}

	public void setSmsAccountId(int smsAccountId) {
		this.smsAccountId = smsAccountId;
	}

	public String getTextMessage() {
		return this.textMessage;
	}

	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}

}