package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the OwnershipNonNaturals database table.
 * 
 */
@Entity
@Table(name="OwnershipNonNaturals")
@NamedQuery(name="OwnershipNonNatural.findAll", query="SELECT o FROM OwnershipNonNatural o")
public class OwnershipNonNatural implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="LegalName")
	private String legalName;

	@Column(name="ParentSupplierId")
	private long parentSupplierId;

	@Column(name="ParentSupplierNumber")
	private String parentSupplierNumber;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SharesInterestPercentage")
	private BigDecimal sharesInterestPercentage;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="TradingName")
	private String tradingName;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public OwnershipNonNatural() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getLegalName() {
		return this.legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public long getParentSupplierId() {
		return this.parentSupplierId;
	}

	public void setParentSupplierId(long parentSupplierId) {
		this.parentSupplierId = parentSupplierId;
	}

	public String getParentSupplierNumber() {
		return this.parentSupplierNumber;
	}

	public void setParentSupplierNumber(String parentSupplierNumber) {
		this.parentSupplierNumber = parentSupplierNumber;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public BigDecimal getSharesInterestPercentage() {
		return this.sharesInterestPercentage;
	}

	public void setSharesInterestPercentage(BigDecimal sharesInterestPercentage) {
		this.sharesInterestPercentage = sharesInterestPercentage;
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

	public String getTradingName() {
		return this.tradingName;
	}

	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}