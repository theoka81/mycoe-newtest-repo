package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the __MigrationHistory database table.
 * 
 */
@Embeddable
public class MigrationHistoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final Long serialVersionUID = 1L;

	@Column(name="MigrationId", unique=true, nullable=false)
	private String migrationId;

	@Column(name="ContextKey", unique=true, nullable=false)
	private String contextKey;

	public MigrationHistoryPK() {
	}
	public String getMigrationId() {
		return this.migrationId;
	}
	public void setMigrationId(String migrationId) {
		this.migrationId = migrationId;
	}
	public String getContextKey() {
		return this.contextKey;
	}
	public void setContextKey(String contextKey) {
		this.contextKey = contextKey;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MigrationHistoryPK)) {
			return false;
		}
		MigrationHistoryPK castOther = (MigrationHistoryPK)other;
		return 
			this.migrationId.equals(castOther.migrationId)
			&& this.contextKey.equals(castOther.contextKey);
	}

	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.migrationId.hashCode();
		hash = hash * prime + this.contextKey.hashCode();
		
		return hash;
	}
}