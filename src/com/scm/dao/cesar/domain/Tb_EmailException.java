package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_EmailExceptions database table.
 * 
 */
@Entity
@Table(name="tb_EmailExceptions")
@NamedQuery(name="Tb_EmailException.findAll", query="SELECT t FROM Tb_EmailException t")
public class Tb_EmailException implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmailExceptionId")
	private int emailExceptionId;

	@Column(name="AttemptCount")
	private int attemptCount;

	@Column(name="EmailExceptionTypeId")
	private int emailExceptionTypeId;

	@Column(name="EmailQueueId")
	private int emailQueueId;

	@Column(name="Exception")
	private String exception;

	@Column(name="ProcessedDateTime")
	private Timestamp processedDateTime;

	@Column(name="ToList")
	private String toList;

	public Tb_EmailException() {
	}

	public int getEmailExceptionId() {
		return this.emailExceptionId;
	}

	public void setEmailExceptionId(int emailExceptionId) {
		this.emailExceptionId = emailExceptionId;
	}

	public int getAttemptCount() {
		return this.attemptCount;
	}

	public void setAttemptCount(int attemptCount) {
		this.attemptCount = attemptCount;
	}

	public int getEmailExceptionTypeId() {
		return this.emailExceptionTypeId;
	}

	public void setEmailExceptionTypeId(int emailExceptionTypeId) {
		this.emailExceptionTypeId = emailExceptionTypeId;
	}

	public int getEmailQueueId() {
		return this.emailQueueId;
	}

	public void setEmailQueueId(int emailQueueId) {
		this.emailQueueId = emailQueueId;
	}

	public String getException() {
		return this.exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public Timestamp getProcessedDateTime() {
		return this.processedDateTime;
	}

	public void setProcessedDateTime(Timestamp processedDateTime) {
		this.processedDateTime = processedDateTime;
	}

	public String getToList() {
		return this.toList;
	}

	public void setToList(String toList) {
		this.toList = toList;
	}

}