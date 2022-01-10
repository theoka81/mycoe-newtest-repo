package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SupMktDevKPIs database table.
 * 
 */
@Embeddable
public class SupMktDevKPIPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final Long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private Long SMDId;

	@Column(name="KPIID", insertable=false, updatable=false, unique=true, nullable=false)
	private Long kpiid;

	public SupMktDevKPIPK() {
	}
	public Long getSMDId() {
		return this.SMDId;
	}
	public void setSMDId(Long SMDId) {
		this.SMDId = SMDId;
	}
	public Long getKpiid() {
		return this.kpiid;
	}
	public void setKpiid(Long kpiid) {
		this.kpiid = kpiid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SupMktDevKPIPK)) {
			return false;
		}
		SupMktDevKPIPK castOther = (SupMktDevKPIPK)other;
		return 
			(this.SMDId == castOther.SMDId)
			&& (this.kpiid == castOther.kpiid);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + ((int) (this.SMDId ^ (this.SMDId >>> 32)));
		hash = hash * prime + ((int) (this.kpiid ^ (this.kpiid >>> 32)));
		
		return hash;
	}
}