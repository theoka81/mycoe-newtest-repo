package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the BankVerificationStatus database table.
 * 
 */
@Entity
@Table(name="BankVerificationStatus")
@NamedQuery(name="BankVerificationStatus.findAll", query="SELECT b FROM BankVerificationStatus b")
public class BankVerificationStatus implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BankVerificationStatusId", unique=true, nullable=false)
	private Long bankVerificationStatusId;

	@Column(name="Code")
	private String code;

	@Column(name="Description")
	private String description;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="EventCode")
	private String eventCode;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	//bi-directional many-to-one association to BankAccount
	@OneToMany(mappedBy="bankVerificationStatus")
	private Set<BankAccount> bankAccounts;

	public BankVerificationStatus() {
	}

	public Long getBankVerificationStatusId() {
		return this.bankVerificationStatusId;
	}

	public void setBankVerificationStatusId(Long bankVerificationStatusId) {
		this.bankVerificationStatusId = bankVerificationStatusId;
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

	public String getEventCode() {
		return this.eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
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
		bankAccount.setBankVerificationStatus(this);

		return bankAccount;
	}

	public BankAccount removeBankAccount(BankAccount bankAccount) {
		getBankAccounts().remove(bankAccount);
		bankAccount.setBankVerificationStatus(null);

		return bankAccount;
	}

}