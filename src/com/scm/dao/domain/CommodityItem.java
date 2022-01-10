package com.scm.dao.domain;

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
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CommodityCode", nullable=false)
	private Long commodityCode;

	@Column(name="CommodityGroupId", nullable=false)
	private Long commodityGroupId;

	@Column(name="CommodityId")
	private Long commodityId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public CommodityItem() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(Long commodityCode) {
		this.commodityCode = commodityCode;
	}

	public Long getCommodityGroupId() {
		return this.commodityGroupId;
	}

	public void setCommodityGroupId(Long commodityGroupId) {
		this.commodityGroupId = commodityGroupId;
	}

	public Long getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(Long commodityId) {
		this.commodityId = commodityId;
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