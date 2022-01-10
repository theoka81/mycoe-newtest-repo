package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the DocumentCollectionPoints database table.
 * 
 */
@Entity
@Table(name="DocumentCollectionPoints")
@NamedQuery(name="DocumentCollectionPoint.findAll", query="SELECT d FROM DocumentCollectionPoint d")
public class DocumentCollectionPoint implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="Address1")
	private String address1;

	@Column(name="Address2")
	private String address2;

	@Column(name="Address3")
	private String address3;

	@Column(name="Address4")
	private String address4;

	@Column(name="Address5")
	private String address5;

	@Column(name="Cheque", nullable=false)
	private Boolean cheque;

	@Column(name="Comments")
	private String comments;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="Credit", nullable=false)
	private Boolean credit;

	@Column(name="Debit", nullable=false)
	private Boolean debit;

	@Column(name="EFT", nullable=false)
	private Boolean eft;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="TenderId")
	private Long tenderId;

	public DocumentCollectionPoint() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return this.address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getAddress5() {
		return this.address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	public Boolean getCheque() {
		return this.cheque;
	}

	public void setCheque(Boolean cheque) {
		this.cheque = cheque;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Long getCreatedBySystemUserId() {
		return this.createdBySystemUserId;
	}

	public void setCreatedBySystemUserId(Long createdBySystemUserId) {
		this.createdBySystemUserId = createdBySystemUserId;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Boolean getCredit() {
		return this.credit;
	}

	public void setCredit(Boolean credit) {
		this.credit = credit;
	}

	public Boolean getDebit() {
		return this.debit;
	}

	public void setDebit(Boolean debit) {
		this.debit = debit;
	}

	public Boolean getEft() {
		return this.eft;
	}

	public void setEft(Boolean eft) {
		this.eft = eft;
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

	public Long getModifiedBySystemUserId() {
		return this.modifiedBySystemUserId;
	}

	public void setModifiedBySystemUserId(Long modifiedBySystemUserId) {
		this.modifiedBySystemUserId = modifiedBySystemUserId;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getTenderId() {
		return this.tenderId;
	}

	public void setTenderId(Long tenderId) {
		this.tenderId = tenderId;
	}

}