package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CommodityLocations database table.
 * 
 */
@Entity
@Table(name="CommodityLocations")
@NamedQuery(name="CommodityLocation.findAll", query="SELECT c FROM CommodityLocation c")
public class CommodityLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="CommodityGroupId")
	private long commodityGroupId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="WardCode")
	private long wardCode;

	@Column(name="WardId")
	private int wardId;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public CommodityLocation() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCommodityGroupId() {
		return this.commodityGroupId;
	}

	public void setCommodityGroupId(long commodityGroupId) {
		this.commodityGroupId = commodityGroupId;
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

	public long getWardCode() {
		return this.wardCode;
	}

	public void setWardCode(long wardCode) {
		this.wardCode = wardCode;
	}

	public int getWardId() {
		return this.wardId;
	}

	public void setWardId(int wardId) {
		this.wardId = wardId;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}