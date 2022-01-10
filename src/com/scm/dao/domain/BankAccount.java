package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BankAccounts database table.
 * 
 */
@Entity
@Table(name="BankAccounts")
@NamedQuery(name="BankAccount.findAll", query="SELECT b FROM BankAccount b")
public class BankAccount implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AccountHolder")
	private String accountHolder;

	@Column(name="AccountNumber")
	private String accountNumber;

	@Column(name="AddressLine1")
	private String addressLine1;

	@Column(name="AddressLine2")
	private String addressLine2;

	@Column(name="BankAccountStatusCode")
	private String bankAccountStatusCode;

	@Column(name="BankAccountTypeCode")
	private String bankAccountTypeCode;

	@Column(name="BankAccountVerificationDate")
	private Timestamp bankAccountVerificationDate;

	@Column(name="BankCode")
	private String bankCode;

	@Column(name="BankName")
	private String bankName;

	@Column(name="BranchName")
	private String branchName;

	@Column(name="BranchNumber")
	private String branchNumber;

	@Column(name="CountryCode")
	private String countryCode;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="Field1")
	private String field1;

	@Column(name="Field2")
	private String field2;

	@Column(name="Field3")
	private String field3;

	@Column(name="FirstName")
	private String firstName;

	@Column(name="FundingContacts")
	private String fundingContacts;

	@Column(name="Initials")
	private String initials;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="IsForeignBankAccount")
	private Boolean isForeignBankAccount;

	@Column(name="IsIdentifierLinkedAtBank")
	private Boolean isIdentifierLinkedAtBank;

	@Column(name="IsPreferredAccount")
	private Boolean isPreferredAccount;

	@Column(name="IsSharedFundingAccount")
	private Boolean isSharedFundingAccount;

	@Column(name="LastName")
	private String lastName;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="Title")
	private String title;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	@Column(name="ZipCode")
	private String zipCode;

	//bi-directional many-to-one association to BankAccountType
	@ManyToOne
	@JoinColumn(name="BankAccountTypeId")
	private BankAccountType bankAccountType;

	//bi-directional many-to-one association to Bank
	@ManyToOne
	@JoinColumn(name="BankId")
	private Bank bank;

	//bi-directional many-to-one association to BankVerificationStatus
	@ManyToOne
	@JoinColumn(name="BankAccountStatusId")
	private BankVerificationStatus bankVerificationStatus;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="CountryId")
	private Country country;

	public BankAccount() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountHolder() {
		return this.accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getBankAccountStatusCode() {
		return this.bankAccountStatusCode;
	}

	public void setBankAccountStatusCode(String bankAccountStatusCode) {
		this.bankAccountStatusCode = bankAccountStatusCode;
	}

	public String getBankAccountTypeCode() {
		return this.bankAccountTypeCode;
	}

	public void setBankAccountTypeCode(String bankAccountTypeCode) {
		this.bankAccountTypeCode = bankAccountTypeCode;
	}

	public Timestamp getBankAccountVerificationDate() {
		return this.bankAccountVerificationDate;
	}

	public void setBankAccountVerificationDate(Timestamp bankAccountVerificationDate) {
		this.bankAccountVerificationDate = bankAccountVerificationDate;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchNumber() {
		return this.branchNumber;
	}

	public void setBranchNumber(String branchNumber) {
		this.branchNumber = branchNumber;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getEditDate() {
		return this.editDate;
	}

	public void setEditDate(Timestamp editDate) {
		this.editDate = editDate;
	}

	public String getField1() {
		return this.field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return this.field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return this.field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFundingContacts() {
		return this.fundingContacts;
	}

	public void setFundingContacts(String fundingContacts) {
		this.fundingContacts = fundingContacts;
	}

	public String getInitials() {
		return this.initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsForeignBankAccount() {
		return this.isForeignBankAccount;
	}

	public void setIsForeignBankAccount(Boolean isForeignBankAccount) {
		this.isForeignBankAccount = isForeignBankAccount;
	}

	public Boolean getIsIdentifierLinkedAtBank() {
		return this.isIdentifierLinkedAtBank;
	}

	public void setIsIdentifierLinkedAtBank(Boolean isIdentifierLinkedAtBank) {
		this.isIdentifierLinkedAtBank = isIdentifierLinkedAtBank;
	}

	public Boolean getIsPreferredAccount() {
		return this.isPreferredAccount;
	}

	public void setIsPreferredAccount(Boolean isPreferredAccount) {
		this.isPreferredAccount = isPreferredAccount;
	}

	public Boolean getIsSharedFundingAccount() {
		return this.isSharedFundingAccount;
	}

	public void setIsSharedFundingAccount(Boolean isSharedFundingAccount) {
		this.isSharedFundingAccount = isSharedFundingAccount;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierNumber() {
		return this.supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public BankAccountType getBankAccountType() {
		return this.bankAccountType;
	}

	public void setBankAccountType(BankAccountType bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public Bank getBank() {
		return this.bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public BankVerificationStatus getBankVerificationStatus() {
		return this.bankVerificationStatus;
	}

	public void setBankVerificationStatus(BankVerificationStatus bankVerificationStatus) {
		this.bankVerificationStatus = bankVerificationStatus;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}