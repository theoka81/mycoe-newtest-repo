package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CommodityProvinces database table.
 * 
 */
@Entity
@Table(name="CommodityProvinces")
@NamedQuery(name="CommodityProvince.findAll", query="SELECT c FROM CommodityProvince c")
public class CommodityProvince implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CommodityGroupId", nullable=false)
	private Long commodityGroupId;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="ProvinceCode", nullable=false)
	private Long provinceCode;

	@Column(name="ProvinceId")
	private Integer provinceId;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	public CommodityProvince() {
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

	public Long getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(Long provinceCode) {
		this.provinceCode = provinceCode;
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
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