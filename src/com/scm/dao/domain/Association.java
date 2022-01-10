package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Associations database table.
 * 
 */
@Entity
@Table(name="Associations")
@NamedQuery(name="Association.findAll", query="SELECT a FROM Association a")
public class Association implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AssociationStatusId")
	private Long associationStatusId;

	@Column(name="AssociationStatusTypeCode")
	private Long associationStatusTypeCode;

	@Column(name="AssociationTypeCode")
	private Long associationTypeCode;

	@Column(name="AssociationTypeId")
	private Long associationTypeId;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="RequestedSupplierId", nullable=false)
	private Long requestedSupplierId;

	@Column(name="RequestorSupplierId", nullable=false)
	private Long requestorSupplierId;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="SupplierNumberRequested")
	private String supplierNumberRequested;

	@Column(name="SupplierNumberRequestor")
	private String supplierNumberRequestor;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public Association() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAssociationStatusId() {
		return this.associationStatusId;
	}

	public void setAssociationStatusId(Long associationStatusId) {
		this.associationStatusId = associationStatusId;
	}

	public Long getAssociationStatusTypeCode() {
		return this.associationStatusTypeCode;
	}

	public void setAssociationStatusTypeCode(Long associationStatusTypeCode) {
		this.associationStatusTypeCode = associationStatusTypeCode;
	}

	public Long getAssociationTypeCode() {
		return this.associationTypeCode;
	}

	public void setAssociationTypeCode(Long associationTypeCode) {
		this.associationTypeCode = associationTypeCode;
	}

	public Long getAssociationTypeId() {
		return this.associationTypeId;
	}

	public void setAssociationTypeId(Long associationTypeId) {
		this.associationTypeId = associationTypeId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getEditDate() {
		return this.editDate;
	}

	public void setEditDate(Timestamp editDate) {
		this.editDate = editDate;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public Long getRequestedSupplierId() {
		return this.requestedSupplierId;
	}

	public void setRequestedSupplierId(Long requestedSupplierId) {
		this.requestedSupplierId = requestedSupplierId;
	}

	public Long getRequestorSupplierId() {
		return this.requestorSupplierId;
	}

	public void setRequestorSupplierId(Long requestorSupplierId) {
		this.requestorSupplierId = requestorSupplierId;
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

	public String getSupplierNumberRequested() {
		return this.supplierNumberRequested;
	}

	public void setSupplierNumberRequested(String supplierNumberRequested) {
		this.supplierNumberRequested = supplierNumberRequested;
	}

	public String getSupplierNumberRequestor() {
		return this.supplierNumberRequestor;
	}

	public void setSupplierNumberRequestor(String supplierNumberRequestor) {
		this.supplierNumberRequestor = supplierNumberRequestor;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}