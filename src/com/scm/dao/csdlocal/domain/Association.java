package com.scm.dao.csdlocal.domain;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="AssociationStatusId")
	private long associationStatusId;

	@Column(name="AssociationStatusTypeCode")
	private long associationStatusTypeCode;

	@Column(name="AssociationTypeCode")
	private long associationTypeCode;

	@Column(name="AssociationTypeId")
	private long associationTypeId;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="RequestedSupplierId")
	private long requestedSupplierId;

	@Column(name="RequestorSupplierId")
	private long requestorSupplierId;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="SupplierNumberRequested")
	private String supplierNumberRequested;

	@Column(name="SupplierNumberRequestor")
	private String supplierNumberRequestor;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public Association() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAssociationStatusId() {
		return this.associationStatusId;
	}

	public void setAssociationStatusId(long associationStatusId) {
		this.associationStatusId = associationStatusId;
	}

	public long getAssociationStatusTypeCode() {
		return this.associationStatusTypeCode;
	}

	public void setAssociationStatusTypeCode(long associationStatusTypeCode) {
		this.associationStatusTypeCode = associationStatusTypeCode;
	}

	public long getAssociationTypeCode() {
		return this.associationTypeCode;
	}

	public void setAssociationTypeCode(long associationTypeCode) {
		this.associationTypeCode = associationTypeCode;
	}

	public long getAssociationTypeId() {
		return this.associationTypeId;
	}

	public void setAssociationTypeId(long associationTypeId) {
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

	public long getRequestedSupplierId() {
		return this.requestedSupplierId;
	}

	public void setRequestedSupplierId(long requestedSupplierId) {
		this.requestedSupplierId = requestedSupplierId;
	}

	public long getRequestorSupplierId() {
		return this.requestorSupplierId;
	}

	public void setRequestorSupplierId(long requestorSupplierId) {
		this.requestorSupplierId = requestorSupplierId;
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

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}