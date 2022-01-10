package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_EmailLogs database table.
 * 
 */
@Entity
@Table(name="tb_EmailLogs")
@NamedQuery(name="Tb_EmailLog.findAll", query="SELECT t FROM Tb_EmailLog t")
public class Tb_EmailLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmailLogID")
	private int emailLogID;

	@Column(name="ApplicationID")
	private int applicationID;

	@Column(name="EmailBody")
	private String emailBody;

	@Column(name="EmailFrom")
	private String emailFrom;

	@Column(name="EmailSubject")
	private String emailSubject;

	@Column(name="EmailTemplateID")
	private int emailTemplateID;

	@Column(name="EmailTo")
	private String emailTo;

	@Column(name="SentByUserID")
	private int sentByUserID;

	@Column(name="SentDateTime")
	private Timestamp sentDateTime;

	public Tb_EmailLog() {
	}

	public int getEmailLogID() {
		return this.emailLogID;
	}

	public void setEmailLogID(int emailLogID) {
		this.emailLogID = emailLogID;
	}

	public int getApplicationID() {
		return this.applicationID;
	}

	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}

	public String getEmailBody() {
		return this.emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public String getEmailFrom() {
		return this.emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailSubject() {
		return this.emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public int getEmailTemplateID() {
		return this.emailTemplateID;
	}

	public void setEmailTemplateID(int emailTemplateID) {
		this.emailTemplateID = emailTemplateID;
	}

	public String getEmailTo() {
		return this.emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public int getSentByUserID() {
		return this.sentByUserID;
	}

	public void setSentByUserID(int sentByUserID) {
		this.sentByUserID = sentByUserID;
	}

	public Timestamp getSentDateTime() {
		return this.sentDateTime;
	}

	public void setSentDateTime(Timestamp sentDateTime) {
		this.sentDateTime = sentDateTime;
	}

}