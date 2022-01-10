package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_EmailExceptionTypes database table.
 * 
 */
@Entity
@Table(name="tb_EmailExceptionTypes")
@NamedQuery(name="Tb_EmailExceptionType.findAll", query="SELECT t FROM Tb_EmailExceptionType t")
public class Tb_EmailExceptionType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmailExceptionTypeId")
	private int emailExceptionTypeId;

	@Column(name="EmailExceptionTypeDescription")
	private String emailExceptionTypeDescription;

	@Column(name="EmailExceptionTypeKey")
	private String emailExceptionTypeKey;

	@Column(name="EmailExceptionTypeName")
	private String emailExceptionTypeName;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	public Tb_EmailExceptionType() {
	}

	public int getEmailExceptionTypeId() {
		return this.emailExceptionTypeId;
	}

	public void setEmailExceptionTypeId(int emailExceptionTypeId) {
		this.emailExceptionTypeId = emailExceptionTypeId;
	}

	public String getEmailExceptionTypeDescription() {
		return this.emailExceptionTypeDescription;
	}

	public void setEmailExceptionTypeDescription(String emailExceptionTypeDescription) {
		this.emailExceptionTypeDescription = emailExceptionTypeDescription;
	}

	public String getEmailExceptionTypeKey() {
		return this.emailExceptionTypeKey;
	}

	public void setEmailExceptionTypeKey(String emailExceptionTypeKey) {
		this.emailExceptionTypeKey = emailExceptionTypeKey;
	}

	public String getEmailExceptionTypeName() {
		return this.emailExceptionTypeName;
	}

	public void setEmailExceptionTypeName(String emailExceptionTypeName) {
		this.emailExceptionTypeName = emailExceptionTypeName;
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

}