package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_UnreadEmailItems database table.
 * 
 */
@Entity
@Table(name="tb_UnreadEmailItems")
@NamedQuery(name="Tb_UnreadEmailItem.findAll", query="SELECT t FROM Tb_UnreadEmailItem t")
public class Tb_UnreadEmailItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmailItemId")
	private int emailItemId;

	@Column(name="ApplicationId")
	private int applicationId;

	@Column(name="Body")
	private String body;

	@Column(name="CcList")
	private String ccList;

	@Column(name="EmailAccountId")
	private int emailAccountId;

	@Column(name="EmailExceptionTypeId")
	private int emailExceptionTypeId;

	@Column(name="FromList")
	private String fromList;

	@Column(name="HasAttachments")
	private boolean hasAttachments;

	@Column(name="IsHtml")
	private boolean isHtml;

	@Column(name="IsProcessed")
	private boolean isProcessed;

	@Column(name="RecievedDateTime")
	private Timestamp recievedDateTime;

	@Column(name="ReferenceId")
	private int referenceId;

	@Column(name="ReferenceTypeId")
	private int referenceTypeId;

	@Column(name="Subject")
	private String subject;

	@Column(name="ToList")
	private String toList;

	public Tb_UnreadEmailItem() {
	}

	public int getEmailItemId() {
		return this.emailItemId;
	}

	public void setEmailItemId(int emailItemId) {
		this.emailItemId = emailItemId;
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
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

	public int getEmailExceptionTypeId() {
		return this.emailExceptionTypeId;
	}

	public void setEmailExceptionTypeId(int emailExceptionTypeId) {
		this.emailExceptionTypeId = emailExceptionTypeId;
	}

	public String getFromList() {
		return this.fromList;
	}

	public void setFromList(String fromList) {
		this.fromList = fromList;
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

	public boolean getIsProcessed() {
		return this.isProcessed;
	}

	public void setIsProcessed(boolean isProcessed) {
		this.isProcessed = isProcessed;
	}

	public Timestamp getRecievedDateTime() {
		return this.recievedDateTime;
	}

	public void setRecievedDateTime(Timestamp recievedDateTime) {
		this.recievedDateTime = recievedDateTime;
	}

	public int getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(int referenceId) {
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