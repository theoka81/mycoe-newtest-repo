package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_EmailAttachmentQueue database table.
 * 
 */
@Entity
@Table(name="tb_EmailAttachmentQueue")
@NamedQuery(name="Tb_EmailAttachmentQueue.findAll", query="SELECT t FROM Tb_EmailAttachmentQueue t")
public class Tb_EmailAttachmentQueue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmailAttachmentQueueId")
	private int emailAttachmentQueueId;

	@Column(name="ApplicationId")
	private int applicationId;

	@Column(name="Attachment")
	private byte[] attachment;

	@Column(name="ContentType")
	private String contentType;

	@Column(name="EmailQueueId")
	private int emailQueueId;

	@Column(name="Filename")
	private String filename;

	public Tb_EmailAttachmentQueue() {
	}

	public int getEmailAttachmentQueueId() {
		return this.emailAttachmentQueueId;
	}

	public void setEmailAttachmentQueueId(int emailAttachmentQueueId) {
		this.emailAttachmentQueueId = emailAttachmentQueueId;
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

	public int getEmailQueueId() {
		return this.emailQueueId;
	}

	public void setEmailQueueId(int emailQueueId) {
		this.emailQueueId = emailQueueId;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}