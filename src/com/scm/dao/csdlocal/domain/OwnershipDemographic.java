package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the OwnershipDemographics database table.
 * 
 */
@Entity
@Table(name="OwnershipDemographics")
@NamedQuery(name="OwnershipDemographic.findAll", query="SELECT o FROM OwnershipDemographic o")
public class OwnershipDemographic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="DirectorId")
	private long directorId;

	@Column(name="OwnershipDemographicCode")
	private String ownershipDemographicCode;

	@Column(name="OwnershipDemographicId")
	private int ownershipDemographicId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public OwnershipDemographic() {
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

	public String getOwnershipDemographicCode() {
		return this.ownershipDemographicCode;
	}

	public void setOwnershipDemographicCode(String ownershipDemographicCode) {
		this.ownershipDemographicCode = ownershipDemographicCode;
	}

	public int getOwnershipDemographicId() {
		return this.ownershipDemographicId;
	}

	public void setOwnershipDemographicId(int ownershipDemographicId) {
		this.ownershipDemographicId = ownershipDemographicId;
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