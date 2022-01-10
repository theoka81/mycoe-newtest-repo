package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SupMktDevItems database table.
 * 
 */
@Entity
@Table(name="SupMktDevItems")
@NamedQuery(name="SupMktDevItem.findAll", query="SELECT s FROM SupMktDevItem s")
public class SupMktDevItem implements Serializable {
	private static final Long serialVersionUID = 1L;

	@EmbeddedId
	private SupMktDevItemPK id;

	//bi-directional many-to-one association to SupplierMarketDevelopment
	@ManyToOne
	@JoinColumn(name="SMDId", nullable=false, insertable=false, updatable=false)
	private SupplierMarketDevelopment supplierMarketDevelopment;

	public SupMktDevItem() {
	}

	public SupMktDevItemPK getId() {
		return this.id;
	}

	public void setId(SupMktDevItemPK id) {
		this.id = id;
	}

	public SupplierMarketDevelopment getSupplierMarketDevelopment() {
		return this.supplierMarketDevelopment;
	}

	public void setSupplierMarketDevelopment(SupplierMarketDevelopment supplierMarketDevelopment) {
		this.supplierMarketDevelopment = supplierMarketDevelopment;
	}

}