package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the DirectorTypeLists database table.
 * 
 */
@Entity
@Table(name="DirectorTypeLists")
@NamedQuery(name="DirectorTypeList.findAll", query="SELECT d FROM DirectorTypeList d")
public class DirectorTypeList implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="DirectorId", nullable=false)
	private Long directorId;

	@Column(name="DirectorTypeCode")
	private String directorTypeCode;

	@Column(name="DirectorTypeId", nullable=false)
	private Long directorTypeId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public DirectorTypeList() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDirectorId() {
		return this.directorId;
	}

	public void setDirectorId(Long directorId) {
		this.directorId = directorId;
	}

	public String getDirectorTypeCode() {
		return this.directorTypeCode;
	}

	public void setDirectorTypeCode(String directorTypeCode) {
		this.directorTypeCode = directorTypeCode;
	}

	public Long getDirectorTypeId() {
		return this.directorTypeId;
	}

	public void setDirectorTypeId(Long directorTypeId) {
		this.directorTypeId = directorTypeId;
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