package com.scm.dao.domain;

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
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AccreditationBodyCode", nullable=false)
	private Long accreditationBodyCode;

	@Column(name="AccreditationBodyTypeId", nullable=false)
	private Long accreditationBodyTypeId;

	@Column(name="AccreditationId", nullable=false)
	private Long accreditationId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="XmlFileId", nullable=false)
	private Integer xmlFileId;

	public AccreditationBody() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccreditationBodyCode() {
		return this.accreditationBodyCode;
	}

	public void setAccreditationBodyCode(Long accreditationBodyCode) {
		this.accreditationBodyCode = accreditationBodyCode;
	}

	public Long getAccreditationBodyTypeId() {
		return this.accreditationBodyTypeId;
	}

	public void setAccreditationBodyTypeId(Long accreditationBodyTypeId) {
		this.accreditationBodyTypeId = accreditationBodyTypeId;
	}

	public Long getAccreditationId() {
		return this.accreditationId;
	}

	public void setAccreditationId(Long accreditationId) {
		this.accreditationId = accreditationId;
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