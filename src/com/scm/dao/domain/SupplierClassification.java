package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the SupplierClassifications database table.
 * 
 */
@Entity
@Table(name="SupplierClassifications")
@NamedQuery(name="SupplierClassification.findAll", query="SELECT s FROM SupplierClassification s")
public class SupplierClassification implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SupplierClassificationId", unique=true, nullable=false)
	private Integer supplierClassificationId;

	@Column(name="AllowInternationalCell")
	private Boolean allowInternationalCell;

	@Column(name="AllowInternationalId")
	private Boolean allowInternationalId;

	@Column(name="Code")
	private String code;

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

	//bi-directional many-to-one association to Supplier
	@OneToMany(mappedBy="supplierClassification")
	private Set<Supplier> suppliers;

	public SupplierClassification() {
	}

	public Integer getSupplierClassificationId() {
		return this.supplierClassificationId;
	}

	public void setSupplierClassificationId(Integer supplierClassificationId) {
		this.supplierClassificationId = supplierClassificationId;
	}

	public Boolean getAllowInternationalCell() {
		return this.allowInternationalCell;
	}

	public void setAllowInternationalCell(Boolean allowInternationalCell) {
		this.allowInternationalCell = allowInternationalCell;
	}

	public Boolean getAllowInternationalId() {
		return this.allowInternationalId;
	}

	public void setAllowInternationalId(Boolean allowInternationalId) {
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

	public Set<Supplier> getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(Set<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public Supplier addSupplier(Supplier supplier) {
		getSuppliers().add(supplier);
		supplier.setSupplierClassification(this);

		return supplier;
	}

	public Supplier removeSupplier(Supplier supplier) {
		getSuppliers().remove(supplier);
		supplier.setSupplierClassification(null);

		return supplier;
	}

}