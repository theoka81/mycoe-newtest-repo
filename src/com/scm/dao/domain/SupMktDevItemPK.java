package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SupMktDevItems database table.
 * 
 */
@Embeddable
public class SupMktDevItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final Long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private Long SMDId;

	@Column(name="InventoryId", insertable=false, updatable=false, unique=true, nullable=false)
	private Long inventoryId;

	public SupMktDevItemPK() {
	}
	public Long getSMDId() {
		return this.SMDId;
	}
	public void setSMDId(Long SMDId) {
		this.SMDId = SMDId;
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
		if (!(other instanceof SupMktDevItemPK)) {
			return false;
		}
		SupMktDevItemPK castOther = (SupMktDevItemPK)other;
		return 
			(this.SMDId == castOther.SMDId)
			&& (this.inventoryId == castOther.inventoryId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + ((int) (this.SMDId ^ (this.SMDId >>> 32)));
		hash = hash * prime + ((int) (this.inventoryId ^ (this.inventoryId >>> 32)));
		
		return hash;
	}
}