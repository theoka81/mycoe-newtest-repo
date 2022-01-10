package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierClassifications database table.
 * 
 */
@Entity
@Table(name="SupplierClassifications")
@NamedQuery(name="SupplierClassification.findAll", query="SELECT s FROM SupplierClassification s")
public class SupplierClassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SupplierClassificationId")
	private int supplierClassificationId;

	@Column(name="AllowInternationalCell")
	private boolean allowInternationalCell;

	@Column(name="AllowInternationalId")
	private boolean allowInternationalId;

	@Column(name="Code")
	private String code;

	@Column(name="EffectiveDate")
	private Timestamp effectiveDate;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public SupplierClassification() {
	}

	public int getSupplierClassificationId() {
		return this.supplierClassificationId;
	}

	public void setSupplierClassificationId(int supplierClassificationId) {
		this.supplierClassificationId = supplierClassificationId;
	}

	public boolean getAllowInternationalCell() {
		return this.allowInternationalCell;
	}

	public void setAllowInternationalCell(boolean allowInternationalCell) {
		this.allowInternationalCell = allowInternationalCell;
	}

	public boolean getAllowInternationalId() {
		return this.allowInternationalId;
	}

	public void setAllowInternationalId(boolean allowInternationalId) {
		this.allowInternationalId = allowInternationalId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
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

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}