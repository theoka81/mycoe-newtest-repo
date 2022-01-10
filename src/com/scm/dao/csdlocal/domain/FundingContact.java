package com.scm.dao.csdlocal.domain;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="BankAccountId")
	private int bankAccountId;

	@Column(name="FundingContactId")
	private long fundingContactId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="ReceiveFundingPartnerOtp")
	private boolean receiveFundingPartnerOtp;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public FundingContact() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getBankAccountId() {
		return this.bankAccountId;
	}

	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public long getFundingContactId() {
		return this.fundingContactId;
	}

	public void setFundingContactId(long fundingContactId) {
		this.fundingContactId = fundingContactId;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public boolean getReceiveFundingPartnerOtp() {
		return this.receiveFundingPartnerOtp;
	}

	public void setReceiveFundingPartnerOtp(boolean receiveFundingPartnerOtp) {
		this.receiveFundingPartnerOtp = receiveFundingPartnerOtp;
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

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}