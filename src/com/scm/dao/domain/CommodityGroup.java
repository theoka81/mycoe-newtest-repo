package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CommodityGroups database table.
 * 
 */
@Entity
@Table(name="CommodityGroups")
@NamedQuery(name="CommodityGroup.findAll", query="SELECT c FROM CommodityGroup c")
public class CommodityGroup implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="Description")
	private String description;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="Field1")
	private String field1;

	@Column(name="IsActive")
	private Boolean isActive;

	@Column(name="Name")
	private String name;

	@Column(name="NationWide")
	private Boolean nationWide;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="ProvinceWide")
	private Boolean provinceWide;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public CommodityGroup() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Boolean getNationWide() {
		return this.nationWide;
	}

	public void setNationWide(Boolean nationWide) {
		this.nationWide = nationWide;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Boolean getProvinceWide() {
		return this.provinceWide;
	}

	public void setProvinceWide(Boolean provinceWide) {
		this.provinceWide = provinceWide;
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