package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the StockReservationItems database table.
 * 
 */
@Embeddable
public class StockReservationItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final Long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private Long SRId;

	@Column(name="InventoryId", insertable=false, updatable=false, unique=true, nullable=false)
	private Long inventoryId;

	public StockReservationItemPK() {
	}
	public Long getSRId() {
		return this.SRId;
	}
	public void setSRId(Long SRId) {
		this.SRId = SRId;
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
		if (!(other instanceof StockReservationItemPK)) {
			return false;
		}
		StockReservationItemPK castOther = (StockReservationItemPK)other;
		return 
			(this.SRId == castOther.SRId)
			&& (this.inventoryId == castOther.inventoryId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + ((int) (this.SRId ^ (this.SRId >>> 32)));
		hash = hash * prime + ((int) (this.inventoryId ^ (this.inventoryId >>> 32)));
		
		return hash;
	}
}