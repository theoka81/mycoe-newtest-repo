package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SupMktDevKPIs database table.
 * 
 */
@Entity
@Table(name="SupMktDevKPIs")
@NamedQuery(name="SupMktDevKPI.findAll", query="SELECT s FROM SupMktDevKPI s")
public class SupMktDevKPI implements Serializable {
	private static final Long serialVersionUID = 1L;

	@EmbeddedId
	private SupMktDevKPIPK id;

	@Column(name="Percentage")
	private Long percentage;

	//bi-directional many-to-one association to SupplierMarketDevelopment
	@ManyToOne
	@JoinColumn(name="SMDId", nullable=false, insertable=false, updatable=false)
	private SupplierMarketDevelopment supplierMarketDevelopment;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="KPIID", nullable=false, insertable=false, updatable=false)
	private UserCode userCode;

	public SupMktDevKPI() {
	}

	public SupMktDevKPIPK getId() {
		return this.id;
	}

	public void setId(SupMktDevKPIPK id) {
		this.id = id;
	}

	public Long getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Long percentage) {
		this.percentage = percentage;
	}

	public SupplierMarketDevelopment getSupplierMarketDevelopment() {
		return this.supplierMarketDevelopment;
	}

	public void setSupplierMarketDevelopment(SupplierMarketDevelopment supplierMarketDevelopment) {
		this.supplierMarketDevelopment = supplierMarketDevelopment;
	}

	public UserCode getUserCode() {
		return this.userCode;
	}

	public void setUserCode(UserCode userCode) {
		this.userCode = userCode;
	}

}