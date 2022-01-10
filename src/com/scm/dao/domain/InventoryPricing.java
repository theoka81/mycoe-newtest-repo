package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the InventoryPricings database table.
 * 
 */
@Entity
@Table(name="InventoryPricings")
@NamedQuery(name="InventoryPricing.findAll", query="SELECT i FROM InventoryPricing i")
public class InventoryPricing implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="Currency")
	private String currency;

	@Column(name="CurrencyId")
	private Long currencyId;

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

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

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

	//bi-directional many-to-one association to InventoryDefinition
	@ManyToOne
	@JoinColumn(name="ItemId")
	private InventoryDefinition inventoryDefinition;

	public InventoryPricing() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreatedBySystemUserId() {
		return this.createdBySystemUserId;
	}

	public void setCreatedBySystemUserId(Long createdBySystemUserId) {
		this.createdBySystemUserId = createdBySystemUserId;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
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

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
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

	public InventoryDefinition getInventoryDefinition() {
		return this.inventoryDefinition;
	}

	public void setInventoryDefinition(InventoryDefinition inventoryDefinition) {
		this.inventoryDefinition = inventoryDefinition;
	}

}