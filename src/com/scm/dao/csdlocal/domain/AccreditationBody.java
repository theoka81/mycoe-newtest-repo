package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the AccreditationBodies database table.
 * 
 */
@Entity
@Table(name="AccreditationBodies")
@NamedQuery(name="AccreditationBody.findAll", query="SELECT a FROM AccreditationBody a")
public class AccreditationBody implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="AccreditationBodyCode")
	private long accreditationBodyCode;

	@Column(name="AccreditationBodyTypeId")
	private long accreditationBodyTypeId;

	@Column(name="AccreditationId")
	private long accreditationId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public AccreditationBody() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAccreditationBodyCode() {
		return this.accreditationBodyCode;
	}

	public void setAccreditationBodyCode(long accreditationBodyCode) {
		this.accreditationBodyCode = accreditationBodyCode;
	}

	public long getAccreditationBodyTypeId() {
		return this.accreditationBodyTypeId;
	}

	public void setAccreditationBodyTypeId(long accreditationBodyTypeId) {
		this.accreditationBodyTypeId = accreditationBodyTypeId;
	}

	public long getAccreditationId() {
		return this.accreditationId;
	}

	public void setAccreditationId(long accreditationId) {
		this.accreditationId = accreditationId;
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