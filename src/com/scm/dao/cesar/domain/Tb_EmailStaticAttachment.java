package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_EmailStaticAttachments database table.
 * 
 */
@Entity
@Table(name="tb_EmailStaticAttachments")
@NamedQuery(name="Tb_EmailStaticAttachment.findAll", query="SELECT t FROM Tb_EmailStaticAttachment t")
public class Tb_EmailStaticAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmailStaticAttachmentId")
	private int emailStaticAttachmentId;

	@Column(name="ApplicationId")
	private int applicationId;

	@Column(name="Attachment")
	private byte[] attachment;

	@Column(name="ContentType")
	private String contentType;

	@Column(name="EmailAccountId")
	private int emailAccountId;

	@Column(name="EndDateTime")
	private Timestamp endDateTime;

	@Column(name="Filename")
	private String filename;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="StartDateTime")
	private Timestamp startDateTime;

	public Tb_EmailStaticAttachment() {
	}

	public int getEmailStaticAttachmentId() {
		return this.emailStaticAttachmentId;
	}

	public void setEmailStaticAttachmentId(int emailStaticAttachmentId) {
		this.emailStaticAttachmentId = emailStaticAttachmentId;
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public byte[] getAttachment() {
		return this.attachment;
	}

	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getEmailAccountId() {
		return this.emailAccountId;
	}

	public void setEmailAccountId(int emailAccountId) {
		this.emailAccountId = emailAccountId;
	}

	public Timestamp getEndDateTime() {
		return this.endDateTime;
	}

	public void setEndDateTime(Timestamp endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Timestamp getStartDateTime() {
		return this.startDateTime;
	}

	public void setStartDateTime(Timestamp startDateTime) {
		this.startDateTime = startDateTime;
	}

}