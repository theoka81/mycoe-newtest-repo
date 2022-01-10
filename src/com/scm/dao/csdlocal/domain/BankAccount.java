package com.scm.dao.csdlocal.domain;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

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

	@Column(name="BankAccountStatusId")
	private int bankAccountStatusId;

	@Column(name="BankAccountTypeCode")
	private String bankAccountTypeCode;

	@Column(name="BankAccountTypeId")
	private int bankAccountTypeId;

	@Column(name="BankAccountVerificationDate")
	private Timestamp bankAccountVerificationDate;

	@Column(name="BankCode")
	private String bankCode;

	@Column(name="BankId")
	private int bankId;

	@Column(name="BankName")
	private String bankName;

	@Column(name="BranchName")
	private String branchName;

	@Column(name="BranchNumber")
	private String branchNumber;

	@Column(name="CountryCode")
	private String countryCode;

	@Column(name="CountryId")
	private int countryId;

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
	private boolean isActive;

	@Column(name="IsForeignBankAccount")
	private boolean isForeignBankAccount;

	@Column(name="IsIdentifierLinkedAtBank")
	private boolean isIdentifierLinkedAtBank;

	@Column(name="IsPreferredAccount")
	private boolean isPreferredAccount;

	@Column(name="IsSharedFundingAccount")
	private boolean isSharedFundingAccount;

	@Column(name="LastName")
	private String lastName;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="Title")
	private String title;

	@Column(name="XmlFileId")
	private int xmlFileId;

	@Column(name="ZipCode")
	private String zipCode;

	public BankAccount() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
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

	public int getBankAccountStatusId() {
		return this.bankAccountStatusId;
	}

	public void setBankAccountStatusId(int bankAccountStatusId) {
		this.bankAccountStatusId = bankAccountStatusId;
	}

	public String getBankAccountTypeCode() {
		return this.bankAccountTypeCode;
	}

	public void setBankAccountTypeCode(String bankAccountTypeCode) {
		this.bankAccountTypeCode = bankAccountTypeCode;
	}

	public int getBankAccountTypeId() {
		return this.bankAccountTypeId;
	}

	public void setBankAccountTypeId(int bankAccountTypeId) {
		this.bankAccountTypeId = bankAccountTypeId;
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

	public int getBankId() {
		return this.bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
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

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
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

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsForeignBankAccount() {
		return this.isForeignBankAccount;
	}

	public void setIsForeignBankAccount(boolean isForeignBankAccount) {
		this.isForeignBankAccount = isForeignBankAccount;
	}

	public boolean getIsIdentifierLinkedAtBank() {
		return this.isIdentifierLinkedAtBank;
	}

	public void setIsIdentifierLinkedAtBank(boolean isIdentifierLinkedAtBank) {
		this.isIdentifierLinkedAtBank = isIdentifierLinkedAtBank;
	}

	public boolean getIsPreferredAccount() {
		return this.isPreferredAccount;
	}

	public void setIsPreferredAccount(boolean isPreferredAccount) {
		this.isPreferredAccount = isPreferredAccount;
	}

	public boolean getIsSharedFundingAccount() {
		return this.isSharedFundingAccount;
	}

	public void setIsSharedFundingAccount(boolean isSharedFundingAccount) {
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

	public long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(long supplierId) {
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

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}