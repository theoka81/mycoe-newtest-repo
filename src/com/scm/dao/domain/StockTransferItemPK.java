package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the StockTransferItems database table.
 * 
 */
@Embeddable
public class StockTransferItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final Long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private Long STId;

	@Column(name="InventoryId", insertable=false, updatable=false, unique=true, nullable=false)
	private Long inventoryId;

	public StockTransferItemPK() {
	}
	public Long getSTId() {
		return this.STId;
	}
	public void setSTId(Long STId) {
		this.STId = STId;
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
		if (!(other instanceof StockTransferItemPK)) {
			return false;
		}
		StockTransferItemPK castOther = (StockTransferItemPK)other;
		return 
			(this.STId == castOther.STId)
			&& (this.inventoryId == castOther.inventoryId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + ((int) (this.STId ^ (this.STId >>> 32)));
		hash = hash * prime + ((int) (this.inventoryId ^ (this.inventoryId >>> 32)));
		
		return hash;
	}
}