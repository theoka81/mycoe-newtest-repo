package com.scm.dao.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the BankAccountTypes database table.
 * 
 */
@Entity
@Table(name="BankAccountTypes")
@NamedQuery(name="BankAccountType.findAll", query="SELECT b FROM BankAccountType b")
public class BankAccountType implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BankAccountTypeId", unique=true, nullable=false)
	private Long bankAccountTypeId;

	@Column(name="Code")
	private String code;

	@Column(name="Description")
	private String description;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	//bi-directional many-to-one association to BankAccount
	@OneToMany(mappedBy="bankAccountType")
	private Set<BankAccount> bankAccounts;

	public BankAccountType() {
	}

	public Long getBankAccountTypeId() {
		return this.bankAccountTypeId;
	}

	public void setBankAccountTypeId(Long bankAccountTypeId) {
		this.bankAccountTypeId = bankAccountTypeId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public Set<BankAccount> getBankAccounts() {
		return this.bankAccounts;
	}

	public void setBankAccounts(Set<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public BankAccount addBankAccount(BankAccount bankAccount) {
		getBankAccounts().add(bankAccount);
		bankAccount.setBankAccountType(this);

		return bankAccount;
	}

	public BankAccount removeBankAccount(BankAccount bankAccount) {
		getBankAccounts().remove(bankAccount);
		bankAccount.setBankAccountType(null);

		return bankAccount;
	}

}