package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the StockAdjustmentItems database table.
 * 
 */
@Entity
@Table(name="StockAdjustmentItems")
@NamedQuery(name="StockAdjustmentItem.findAll", query="SELECT s FROM StockAdjustmentItem s")
public class StockAdjustmentItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="AdjQtyOnHand")
	private long adjQtyOnHand;

	@Column(name="AdjQtyReserved")
	private long adjQtyReserved;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="IsLocked")
	private boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="QuantityOnHand")
	private long quantityOnHand;

	@Column(name="QuantityReserved")
	private long quantityReserved;

	//bi-directional many-to-one association to StockAdjustment
	@ManyToOne
	@JoinColumn(name="SAId")
	private StockAdjustment stockAdjustment;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to WarehouseInventory
	/*@ManyToOne
	@JoinColumn(name="WarehouseInventoryId")
	private WarehouseInventory warehouseInventory;*/

	public StockAdjustmentItem() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAdjQtyOnHand() {
		return this.adjQtyOnHand;
	}

	public void setAdjQtyOnHand(long adjQtyOnHand) {
		this.adjQtyOnHand = adjQtyOnHand;
	}

	public long getAdjQtyReserved() {
		return this.adjQtyReserved;
	}

	public void setAdjQtyReserved(long adjQtyReserved) {
		this.adjQtyReserved = adjQtyReserved;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public long getQuantityOnHand() {
		return this.quantityOnHand;
	}

	public void setQuantityOnHand(long quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public long getQuantityReserved() {
		return this.quantityReserved;
	}

	public void setQuantityReserved(long quantityReserved) {
		this.quantityReserved = quantityReserved;
	}

	public StockAdjustment getStockAdjustment() {
		return this.stockAdjustment;
	}

	public void setStockAdjustment(StockAdjustment stockAdjustment) {
		this.stockAdjustment = stockAdjustment;
	}

	public SystemUser getSystemUser1() {
		return this.systemUser1;
	}

	public void setSystemUser1(SystemUser systemUser1) {
		this.systemUser1 = systemUser1;
	}

	public SystemUser getSystemUser2() {
		return this.systemUser2;
	}

	public void setSystemUser2(SystemUser systemUser2) {
		this.systemUser2 = systemUser2;
	}

	/*public WarehouseInventory getWarehouseInventory() {
		return this.warehouseInventory;
	}

	public void setWarehouseInventory(WarehouseInventory warehouseInventory) {
		this.warehouseInventory = warehouseInventory;
	}*/

}