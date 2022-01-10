package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the InventoryPricingAudits database table.
 * 
 */
@Entity
@Table(name="InventoryPricingAudits")
@NamedQuery(name="InventoryPricingAudit.findAll", query="SELECT i FROM InventoryPricingAudit i")
public class InventoryPricingAudit implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AuditId", unique=true, nullable=false)
	private Long auditId;

	@Column(name="Action")
	private String action;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="Currency")
	private String currency;

	@Column(name="CurrencyId")
	private Long currencyId;

	@Column(name="DateTime")
	private Timestamp dateTime;

	@Column(name="Id", nullable=false)
	private Long id;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemNo")
	private String itemNo;

	@Column(name="ItemPriceStatus")
	private String itemPriceStatus;

	@Column(name="ItemPriceStatusId")
	private Long itemPriceStatusId;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedValues")
	private String modifiedValues;

	@Column(name="Price", precision=18, scale=2)
	private BigDecimal price;

	@Column(name="PricingDate")
	private Timestamp pricingDate;

	@Column(name="PricingType")
	private String pricingType;

	@Column(name="PricingTypeId")
	private Long pricingTypeId;

	@Column(name="PricingUom")
	private String pricingUom;

	@Column(name="PricingUomId")
	private Long pricingUomId;

	@Column(name="SystemUserId")
	private Long systemUserId;

	//bi-directional many-to-one association to InventoryDefinition
	@ManyToOne
	@JoinColumn(name="ItemId")
	private InventoryDefinition inventoryDefinition;

	public InventoryPricingAudit() {
	}

	public Long getAuditId() {
		return this.auditId;
	}

	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Long getCreatedBySystemUserId() {
		return this.createdBySystemUserId;
	}

	public void setCreatedBySystemUserId(Long createdBySystemUserId) {
		this.createdBySystemUserId = createdBySystemUserId;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	public Timestamp getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemPriceStatus() {
		return this.itemPriceStatus;
	}

	public void setItemPriceStatus(String itemPriceStatus) {
		this.itemPriceStatus = itemPriceStatus;
	}

	public Long getItemPriceStatusId() {
		return this.itemPriceStatusId;
	}

	public void setItemPriceStatusId(Long itemPriceStatusId) {
		this.itemPriceStatusId = itemPriceStatusId;
	}

	public Long getModifiedBySystemUserId() {
		return this.modifiedBySystemUserId;
	}

	public void setModifiedBySystemUserId(Long modifiedBySystemUserId) {
		this.modifiedBySystemUserId = modifiedBySystemUserId;
	}

	public String getModifiedValues() {
		return this.modifiedValues;
	}

	public void setModifiedValues(String modifiedValues) {
		this.modifiedValues = modifiedValues;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Timestamp getPricingDate() {
		return this.pricingDate;
	}

	public void setPricingDate(Timestamp pricingDate) {
		this.pricingDate = pricingDate;
	}

	public String getPricingType() {
		return this.pricingType;
	}

	public void setPricingType(String pricingType) {
		this.pricingType = pricingType;
	}

	public Long getPricingTypeId() {
		return this.pricingTypeId;
	}

	public void setPricingTypeId(Long pricingTypeId) {
		this.pricingTypeId = pricingTypeId;
	}

	public String getPricingUom() {
		return this.pricingUom;
	}

	public void setPricingUom(String pricingUom) {
		this.pricingUom = pricingUom;
	}

	public Long getPricingUomId() {
		return this.pricingUomId;
	}

	public void setPricingUomId(Long pricingUomId) {
		this.pricingUomId = pricingUomId;
	}

	public Long getSystemUserId() {
		return this.systemUserId;
	}

	public void setSystemUserId(Long systemUserId) {
		this.systemUserId = systemUserId;
	}

	public InventoryDefinition getInventoryDefinition() {
		return this.inventoryDefinition;
	}

	public void setInventoryDefinition(InventoryDefinition inventoryDefinition) {
		this.inventoryDefinition = inventoryDefinition;
	}

}