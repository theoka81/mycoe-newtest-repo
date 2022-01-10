package com.scm.dao.domain;

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
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CommodityGroupId", nullable=false)
	private Long commodityGroupId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="WardCode", nullable=false)
	private Long wardCode;

	@Column(name="WardId")
	private Integer wardId;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public CommodityLocation() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCommodityGroupId() {
		return this.commodityGroupId;
	}

	public void setCommodityGroupId(Long commodityGroupId) {
		this.commodityGroupId = commodityGroupId;
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

	public Long getWardCode() {
		return this.wardCode;
	}

	public void setWardCode(Long wardCode) {
		this.wardCode = wardCode;
	}

	public Integer getWardId() {
		return this.wardId;
	}

	public void setWardId(Integer wardId) {
		this.wardId = wardId;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}