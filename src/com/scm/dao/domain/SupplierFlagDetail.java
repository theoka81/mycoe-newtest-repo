package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierFlagDetails database table.
 * 
 */
@Entity
@Table(name="SupplierFlagDetails")
@NamedQuery(name="SupplierFlagDetail.findAll", query="SELECT s FROM SupplierFlagDetail s")
public class SupplierFlagDetail implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierFlagDetail")
	private String supplierFlagDetail;

	@Column(name="SupplierFlagId")
	private Long supplierFlagId;

	@Column(name="SupplierFlagType", nullable=false)
	private String supplierFlagType;

	@Column(name="SupplierFlagTypeId")
	private Long supplierFlagTypeId;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public SupplierFlagDetail() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public String getSupplierFlagDetail() {
		return this.supplierFlagDetail;
	}

	public void setSupplierFlagDetail(String supplierFlagDetail) {
		this.supplierFlagDetail = supplierFlagDetail;
	}

	public Long getSupplierFlagId() {
		return this.supplierFlagId;
	}

	public void setSupplierFlagId(Long supplierFlagId) {
		this.supplierFlagId = supplierFlagId;
	}

	public String getSupplierFlagType() {
		return this.supplierFlagType;
	}

	public void setSupplierFlagType(String supplierFlagType) {
		this.supplierFlagType = supplierFlagType;
	}

	public Long getSupplierFlagTypeId() {
		return this.supplierFlagTypeId;
	}

	public void setSupplierFlagTypeId(Long supplierFlagTypeId) {
		this.supplierFlagTypeId = supplierFlagTypeId;
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