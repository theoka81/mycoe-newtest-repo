package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_UnreadEmailAttachments database table.
 * 
 */
@Entity
@Table(name="tb_UnreadEmailAttachments")
@NamedQuery(name="Tb_UnreadEmailAttachment.findAll", query="SELECT t FROM Tb_UnreadEmailAttachment t")
public class Tb_UnreadEmailAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmailAttachmentId")
	private int emailAttachmentId;

	@Column(name="Attachment")
	private byte[] attachment;

	@Column(name="ContentType")
	private String contentType;

	@Column(name="EmailItemId")
	private int emailItemId;

	@Column(name="Filename")
	private String filename;

	@Column(name="IsProcessed")
	private boolean isProcessed;

	public Tb_UnreadEmailAttachment() {
	}

	public int getEmailAttachmentId() {
		return this.emailAttachmentId;
	}

	public void setEmailAttachmentId(int emailAttachmentId) {
		this.emailAttachmentId = emailAttachmentId;
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

	public int getEmailItemId() {
		return this.emailItemId;
	}

	public void setEmailItemId(int emailItemId) {
		this.emailItemId = emailItemId;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public boolean getIsProcessed() {
		return this.isProcessed;
	}

	public void setIsProcessed(boolean isProcessed) {
		this.isProcessed = isProcessed;
	}

}