package com.scm.dao.csdlocal.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CommodityItems database table.
 * 
 */
@Entity
@Table(name="CommodityItems")
@NamedQuery(name="CommodityItem.findAll", query="SELECT c FROM CommodityItem c")
public class CommodityItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="CommodityCode")
	private long commodityCode;

	@Column(name="CommodityGroupId")
	private long commodityGroupId;

	@Column(name="CommodityId")
	private long commodityId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public CommodityItem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(long commodityCode) {
		this.commodityCode = commodityCode;
	}

	public long getCommodityGroupId() {
		return this.commodityGroupId;
	}

	public void setCommodityGroupId(long commodityGroupId) {
		this.commodityGroupId = commodityGroupId;
	}

	public long getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(long commodityId) {
		this.commodityId = commodityId;
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