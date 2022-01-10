package com.scm.dao.csdlocal.domain;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="DirectorId")
	private long directorId;

	@Column(name="DirectorTypeCode")
	private String directorTypeCode;

	@Column(name="DirectorTypeId")
	private long directorTypeId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public DirectorTypeList() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDirectorId() {
		return this.directorId;
	}

	public void setDirectorId(long directorId) {
		this.directorId = directorId;
	}

	public String getDirectorTypeCode() {
		return this.directorTypeCode;
	}

	public void setDirectorTypeCode(String directorTypeCode) {
		this.directorTypeCode = directorTypeCode;
	}

	public long getDirectorTypeId() {
		return this.directorTypeId;
	}

	public void setDirectorTypeId(long directorTypeId) {
		this.directorTypeId = directorTypeId;
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