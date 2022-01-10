package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierIndustryClassifications database table.
 * 
 */
@Entity
@Table(name="SupplierIndustryClassifications")
@NamedQuery(name="SupplierIndustryClassification.findAll", query="SELECT s FROM SupplierIndustryClassification s")
public class SupplierIndustryClassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="CoreIndustryIndicator")
	private boolean coreIndustryIndicator;

	@Column(name="IndustryClassificationCode")
	private long industryClassificationCode;

	@Column(name="IndustryClassificationId")
	private int industryClassificationId;

	@Column(name="PercentageRanking")
	private BigDecimal percentageRanking;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public SupplierIndustryClassification() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean getCoreIndustryIndicator() {
		return this.coreIndustryIndicator;
	}

	public void setCoreIndustryIndicator(boolean coreIndustryIndicator) {
		this.coreIndustryIndicator = coreIndustryIndicator;
	}

	public long getIndustryClassificationCode() {
		return this.industryClassificationCode;
	}

	public void setIndustryClassificationCode(long industryClassificationCode) {
		this.industryClassificationCode = industryClassificationCode;
	}

	public int getIndustryClassificationId() {
		return this.industryClassificationId;
	}

	public void setIndustryClassificationId(int industryClassificationId) {
		this.industryClassificationId = industryClassificationId;
	}

	public BigDecimal getPercentageRanking() {
		return this.percentageRanking;
	}

	public void setPercentageRanking(BigDecimal percentageRanking) {
		this.percentageRanking = percentageRanking;
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

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}