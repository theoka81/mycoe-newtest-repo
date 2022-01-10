package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierContacts database table.
 * 
 */
@Entity
@Table(name="SupplierContacts")
@NamedQuery(name="SupplierContact.findAll", query="SELECT s FROM SupplierContact s")
public class SupplierContact implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AccountsContactPerson")
	private String accountsContactPerson;

	@Column(name="AccountsEmail")
	private String accountsEmail;

	@Column(name="AccountsFaxNumber")
	private String accountsFaxNumber;

	@Column(name="AccountsTelephoneNumber")
	private String accountsTelephoneNumber;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="QuoteEmail")
	private String quoteEmail;

	@Column(name="QuoteFaxNumber")
	private String quoteFaxNumber;

	@Column(name="SalesContactPerson")
	private String salesContactPerson;

	@Column(name="SalesEmail")
	private String salesEmail;

	@Column(name="SalesFaxNumber")
	private String salesFaxNumber;

	@Column(name="SalesTelephoneNumber")
	private String salesTelephoneNumber;

	@Column(name="SupplierId")
	private Long supplierId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public SupplierContact() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountsContactPerson() {
		return this.accountsContactPerson;
	}

	public void setAccountsContactPerson(String accountsContactPerson) {
		this.accountsContactPerson = accountsContactPerson;
	}

	public String getAccountsEmail() {
		return this.accountsEmail;
	}

	public void setAccountsEmail(String accountsEmail) {
		this.accountsEmail = accountsEmail;
	}

	public String getAccountsFaxNumber() {
		return this.accountsFaxNumber;
	}

	public void setAccountsFaxNumber(String accountsFaxNumber) {
		this.accountsFaxNumber = accountsFaxNumber;
	}

	public String getAccountsTelephoneNumber() {
		return this.accountsTelephoneNumber;
	}

	public void setAccountsTelephoneNumber(String accountsTelephoneNumber) {
		this.accountsTelephoneNumber = accountsTelephoneNumber;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
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

	public String getQuoteEmail() {
		return this.quoteEmail;
	}

	public void setQuoteEmail(String quoteEmail) {
		this.quoteEmail = quoteEmail;
	}

	public String getQuoteFaxNumber() {
		return this.quoteFaxNumber;
	}

	public void setQuoteFaxNumber(String quoteFaxNumber) {
		this.quoteFaxNumber = quoteFaxNumber;
	}

	public String getSalesContactPerson() {
		return this.salesContactPerson;
	}

	public void setSalesContactPerson(String salesContactPerson) {
		this.salesContactPerson = salesContactPerson;
	}

	public String getSalesEmail() {
		return this.salesEmail;
	}

	public void setSalesEmail(String salesEmail) {
		this.salesEmail = salesEmail;
	}

	public String getSalesFaxNumber() {
		return this.salesFaxNumber;
	}

	public void setSalesFaxNumber(String salesFaxNumber) {
		this.salesFaxNumber = salesFaxNumber;
	}

	public String getSalesTelephoneNumber() {
		return this.salesTelephoneNumber;
	}

	public void setSalesTelephoneNumber(String salesTelephoneNumber) {
		this.salesTelephoneNumber = salesTelephoneNumber;
	}

	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
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