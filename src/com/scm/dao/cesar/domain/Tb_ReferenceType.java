package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_ReferenceTypes database table.
 * 
 */
@Entity
@Table(name="tb_ReferenceTypes")
@NamedQuery(name="Tb_ReferenceType.findAll", query="SELECT t FROM Tb_ReferenceType t")
public class Tb_ReferenceType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ReferenceTypeId")
	private int referenceTypeId;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="IsLocked")
	private boolean isLocked;

	@Column(name="ReferenceTypeDescription")
	private String referenceTypeDescription;

	@Column(name="ReferenceTypeKey")
	private String referenceTypeKey;

	@Column(name="ReferenceTypeName")
	private String referenceTypeName;

	public Tb_ReferenceType() {
	}

	public int getReferenceTypeId() {
		return this.referenceTypeId;
	}

	public void setReferenceTypeId(int referenceTypeId) {
		this.referenceTypeId = referenceTypeId;
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

	public boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public String getReferenceTypeDescription() {
		return this.referenceTypeDescription;
	}

	public void setReferenceTypeDescription(String referenceTypeDescription) {
		this.referenceTypeDescription = referenceTypeDescription;
	}

	public String getReferenceTypeKey() {
		return this.referenceTypeKey;
	}

	public void setReferenceTypeKey(String referenceTypeKey) {
		this.referenceTypeKey = referenceTypeKey;
	}

	public String getReferenceTypeName() {
		return this.referenceTypeName;
	}

	public void setReferenceTypeName(String referenceTypeName) {
		this.referenceTypeName = referenceTypeName;
	}

}