package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierCompliantDetails database table.
 * 
 */
@Entity
@Table(name="SupplierCompliantDetails")
@NamedQuery(name="SupplierCompliantDetail.findAll", query="SELECT s FROM SupplierCompliantDetail s")
public class SupplierCompliantDetail implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	private String comments;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DateCommented")
	private String dateCommented;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	//bi-directional many-to-one association to SupplierCompliantHeader
	@ManyToOne
	@JoinColumn(name="SupplierCompliantHeaderId")
	private SupplierCompliantHeader supplierCompliantHeader;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="AssignedById")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="AssignedToId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser3;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser4;

	public SupplierCompliantDetail() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDateCommented() {
		return this.dateCommented;
	}

	public void setDateCommented(String dateCommented) {
		this.dateCommented = dateCommented;
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

	public SupplierCompliantHeader getSupplierCompliantHeader() {
		return this.supplierCompliantHeader;
	}

	public void setSupplierCompliantHeader(SupplierCompliantHeader supplierCompliantHeader) {
		this.supplierCompliantHeader = supplierCompliantHeader;
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

	public SystemUser getSystemUser3() {
		return this.systemUser3;
	}

	public void setSystemUser3(SystemUser systemUser3) {
		this.systemUser3 = systemUser3;
	}

	public SystemUser getSystemUser4() {
		return this.systemUser4;
	}

	public void setSystemUser4(SystemUser systemUser4) {
		this.systemUser4 = systemUser4;
	}

}