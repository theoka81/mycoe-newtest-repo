package com.scm.dao.csdlocal.domain;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierFlagDetail")
	private String supplierFlagDetail;

	@Column(name="SupplierFlagId")
	private long supplierFlagId;

	@Column(name="SupplierFlagType")
	private String supplierFlagType;

	@Column(name="SupplierFlagTypeId")
	private long supplierFlagTypeId;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public SupplierFlagDetail() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
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

	public long getSupplierFlagId() {
		return this.supplierFlagId;
	}

	public void setSupplierFlagId(long supplierFlagId) {
		this.supplierFlagId = supplierFlagId;
	}

	public String getSupplierFlagType() {
		return this.supplierFlagType;
	}

	public void setSupplierFlagType(String supplierFlagType) {
		this.supplierFlagType = supplierFlagType;
	}

	public long getSupplierFlagTypeId() {
		return this.supplierFlagTypeId;
	}

	public void setSupplierFlagTypeId(long supplierFlagTypeId) {
		this.supplierFlagTypeId = supplierFlagTypeId;
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