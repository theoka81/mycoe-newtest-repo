package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the FundingContacts database table.
 * 
 */
@Entity
@Table(name="FundingContacts")
@NamedQuery(name="FundingContact.findAll", query="SELECT f FROM FundingContact f")
public class FundingContact implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="BankAccountId", nullable=false)
	private Integer bankAccountId;

	@Column(name="FundingContactId")
	private Long fundingContactId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="ReceiveFundingPartnerOtp")
	private Boolean receiveFundingPartnerOtp;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public FundingContact() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getBankAccountId() {
		return this.bankAccountId;
	}

	public void setBankAccountId(Integer bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public Long getFundingContactId() {
		return this.fundingContactId;
	}

	public void setFundingContactId(Long fundingContactId) {
		this.fundingContactId = fundingContactId;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Boolean getReceiveFundingPartnerOtp() {
		return this.receiveFundingPartnerOtp;
	}

	public void setReceiveFundingPartnerOtp(Boolean receiveFundingPartnerOtp) {
		this.receiveFundingPartnerOtp = receiveFundingPartnerOtp;
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

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}