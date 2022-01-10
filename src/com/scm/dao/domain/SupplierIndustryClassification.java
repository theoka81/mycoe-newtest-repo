package com.scm.dao.domain;

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
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;

	@Column(name="CoreIndustryIndicator")
	private Boolean coreIndustryIndicator;

	@Column(name="IndustryClassificationCode")
	private Long industryClassificationCode;

	@Column(name="IndustryClassificationId")
	private Integer industryClassificationId;

	@Column(name="PercentageRanking")
	private BigDecimal percentageRanking;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public SupplierIndustryClassification() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getCoreIndustryIndicator() {
		return this.coreIndustryIndicator;
	}

	public void setCoreIndustryIndicator(Boolean coreIndustryIndicator) {
		this.coreIndustryIndicator = coreIndustryIndicator;
	}

	public Long getIndustryClassificationCode() {
		return this.industryClassificationCode;
	}

	public void setIndustryClassificationCode(Long industryClassificationCode) {
		this.industryClassificationCode = industryClassificationCode;
	}

	public Integer getIndustryClassificationId() {
		return this.industryClassificationId;
	}

	public void setIndustryClassificationId(Integer industryClassificationId) {
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