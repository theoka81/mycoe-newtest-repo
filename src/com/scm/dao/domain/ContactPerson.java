package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ContactPersons database table.
 * 
 */
@Entity
@Table(name="ContactPersons")
@NamedQuery(name="ContactPerson.findAll", query="SELECT c FROM ContactPerson c")
public class ContactPerson implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="Description")
	private String description;

	@Column(name="DocumentCollectionId")
	private Long documentCollectionId;

	@Column(name="Email")
	private String email;

	@Column(name="Fax")
	private String fax;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="PersonName")
	private String personName;

	@Column(name="Telephone")
	private String telephone;

	@Column(name="TenderId")
	private Long tenderId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public ContactPerson() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDocumentCollectionId() {
		return this.documentCollectionId;
	}

	public void setDocumentCollectionId(Long documentCollectionId) {
		this.documentCollectionId = documentCollectionId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Long getTenderId() {
		return this.tenderId;
	}

	public void setTenderId(Long tenderId) {
		this.tenderId = tenderId;
	}

	public SystemUser getSystemUser1() {
		return this.systemUser1;
	}

	public void setSystemUser1(SystemUser systemUser1) {
		this.systemUser1 = systemUser1;
	}

	public SystemUser getSystemUser2() {
		return this.systemUser2;
	}

	public void setSystemUser2(SystemUser systemUser2) {
		this.systemUser2 = systemUser2;
	}

}