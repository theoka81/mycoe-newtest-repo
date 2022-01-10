package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the StandardAgreementItems database table.
 * 
 */
@Embeddable
public class StandardAgreementItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final Long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private Long SAId;

	@Column(name="InventoryId", insertable=false, updatable=false, unique=true, nullable=false)
	private Long inventoryId;

	public StandardAgreementItemPK() {
	}
	public Long getSAId() {
		return this.SAId;
	}
	public void setSAId(Long SAId) {
		this.SAId = SAId;
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
		if (!(other instanceof StandardAgreementItemPK)) {
			return false;
		}
		StandardAgreementItemPK castOther = (StandardAgreementItemPK)other;
		return 
			(this.SAId == castOther.SAId)
			&& (this.inventoryId == castOther.inventoryId);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + ((int) (this.SAId ^ (this.SAId >>> 32)));
		hash = hash * prime + ((int) (this.inventoryId ^ (this.inventoryId >>> 32)));
		
		return hash;
	}
}