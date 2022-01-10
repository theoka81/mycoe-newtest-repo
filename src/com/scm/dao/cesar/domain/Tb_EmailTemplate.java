package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_EmailTemplates database table.
 * 
 */
@Entity
@Table(name="tb_EmailTemplates")
@NamedQuery(name="Tb_EmailTemplate.findAll", query="SELECT t FROM Tb_EmailTemplate t")
public class Tb_EmailTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmailTemplateID")
	private int emailTemplateID;

	@Column(name="ApplicationID")
	private int applicationID;

	@Column(name="CcVariable")
	private String ccVariable;

	@Column(name="EmailBody")
	private String emailBody;

	@Column(name="EmailFrom")
	private String emailFrom;

	@Column(name="EmailSubject")
	private String emailSubject;

	@Column(name="EmailTemplateDescription")
	private String emailTemplateDescription;

	@Column(name="EmailTemplateKey")
	private String emailTemplateKey;

	@Column(name="EmailTemplateName")
	private String emailTemplateName;

	@Column(name="HasVariables")
	private boolean hasVariables;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="IsHTML")
	private boolean isHTML;

	@Column(name="SendAsOneEmail")
	private boolean sendAsOneEmail;

	@Column(name="ToVariable")
	private String toVariable;

	@Column(name="Variables")
	private String variables;

	public Tb_EmailTemplate() {
	}

	public int getEmailTemplateID() {
		return this.emailTemplateID;
	}

	public void setEmailTemplateID(int emailTemplateID) {
		this.emailTemplateID = emailTemplateID;
	}

	public int getApplicationID() {
		return this.applicationID;
	}

	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}

	public String getCcVariable() {
		return this.ccVariable;
	}

	public void setCcVariable(String ccVariable) {
		this.ccVariable = ccVariable;
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

	public String getEmailTemplateDescription() {
		return this.emailTemplateDescription;
	}

	public void setEmailTemplateDescription(String emailTemplateDescription) {
		this.emailTemplateDescription = emailTemplateDescription;
	}

	public String getEmailTemplateKey() {
		return this.emailTemplateKey;
	}

	public void setEmailTemplateKey(String emailTemplateKey) {
		this.emailTemplateKey = emailTemplateKey;
	}

	public String getEmailTemplateName() {
		return this.emailTemplateName;
	}

	public void setEmailTemplateName(String emailTemplateName) {
		this.emailTemplateName = emailTemplateName;
	}

	public boolean getHasVariables() {
		return this.hasVariables;
	}

	public void setHasVariables(boolean hasVariables) {
		this.hasVariables = hasVariables;
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

	public boolean getIsHTML() {
		return this.isHTML;
	}

	public void setIsHTML(boolean isHTML) {
		this.isHTML = isHTML;
	}

	public boolean getSendAsOneEmail() {
		return this.sendAsOneEmail;
	}

	public void setSendAsOneEmail(boolean sendAsOneEmail) {
		this.sendAsOneEmail = sendAsOneEmail;
	}

	public String getToVariable() {
		return this.toVariable;
	}

	public void setToVariable(String toVariable) {
		this.toVariable = toVariable;
	}

	public String getVariables() {
		return this.variables;
	}

	public void setVariables(String variables) {
		this.variables = variables;
	}

}