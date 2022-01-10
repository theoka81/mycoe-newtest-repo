package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ItemTransactions database table.
 * 
 */
@Embeddable
public class ItemTransactionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final Long serialVersionUID = 1L;

	@Column(name="ItemTransMasterId", insertable=false, updatable=false, unique=true, nullable=false)
	private Long itemTransMasterId;

	@Column(name="InventoryId", insertable=false, updatable=false, unique=true, nullable=false)
	private Long inventoryId;

	public ItemTransactionPK() {
	}
	public Long getItemTransMasterId() {
		return this.itemTransMasterId;
	}
	public void setItemTransMasterId(Long itemTransMasterId) {
		this.itemTransMasterId = itemTransMasterId;
	}
	public Long getInventoryId() {
		return this.inventoryId;
	}
	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ItemTransactionPK)) {
			return false;
		}
		ItemTransactionPK castOther = (ItemTransactionPK)other;
		return 
			(this.itemTransMasterId == castOther.itemTransMasterId)
			&& (this.inventoryId == castOther.inventoryId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + ((int) (this.itemTransMasterId ^ (this.itemTransMasterId >>> 32)));
		hash = hash * prime + ((int) (this.inventoryId ^ (this.inventoryId >>> 32)));
		
		return hash;
	}
}