package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the __MigrationHistory database table.
 * 
 */
@Entity
@Table(name="__MigrationHistory")
//@NamedQuery(name="MigrationHistory.findAll", query="SELECT m FROM MigrationHistory m")
@org.hibernate.annotations.Table(appliesTo = "__MigrationHistory")
public class MigrationHistory implements Serializable {
	private static final Long serialVersionUID = 1L;

	@EmbeddedId
	private MigrationHistoryPK id;

	@Column(name="Model", nullable=false)
	private byte[] model;

	@Column(name="ProductVersion", nullable=false)
	private String productVersion;

	public MigrationHistory() {
	}

	public MigrationHistoryPK getId() {
		return this.id;
	}

	public void setId(MigrationHistoryPK id) {
		this.id = id;
	}

	public byte[] getModel() {
		return this.model;
	}

	public void setModel(byte[] model) {
		this.model = model;
	}

	public String getProductVersion() {
		return this.productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}