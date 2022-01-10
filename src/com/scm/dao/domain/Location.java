package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the Locations database table.
 * 
 */
@Entity
@Table(name="Locations")
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="Aisle")
	private String aisle;

	@Column(name="Bin")
	private Long bin;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="LocationDescription")
	private String locationDescription;

	@Column(name="LocationID")
	private Long locationID;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="location")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="location")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="location")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="location")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions;

	public Location() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAisle() {
		return this.aisle;
	}

	public void setAisle(String aisle) {
		this.aisle = aisle;
	}

	public Long getBin() {
		return this.bin;
	}

	public void setBin(Long bin) {
		this.bin = bin;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public String getLocationDescription() {
		return this.locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public Long getLocationID() {
		return this.locationID;
	}

	public void setLocationID(Long locationID) {
		this.locationID = locationID;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public SystemUser getSystemUser1() {
		return this.systemUser1;
	}

	public void setSystemUser1(SystemUser systemUser1) {
		this.systemUser1 = systemUser1;
	}

	public SystemUser getSystemUser2() {
		return this.systemUser2;
	}

	public void setSystemUser2(SystemUser systemUser2) {
		this.systemUser2 = systemUser2;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits() {
		return this.warehouseInventoryDefinitionAudits;
	}

	public void setWarehouseInventoryDefinitionAudits(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits) {
		this.warehouseInventoryDefinitionAudits = warehouseInventoryDefinitionAudits;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudit(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudit) {
		getWarehouseInventoryDefinitionAudits().add(warehouseInventoryDefinitionAudit);
		warehouseInventoryDefinitionAudit.setLocation(this);

		return warehouseInventoryDefinitionAudit;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudit(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudit) {
		getWarehouseInventoryDefinitionAudits().remove(warehouseInventoryDefinitionAudit);
		warehouseInventoryDefinitionAudit.setLocation(null);

		return warehouseInventoryDefinitionAudit;
	}

	public Set<WarehouseInventoryDefinitionWorkAudit> getWarehouseInventoryDefinitionWorkAudits() {
		return this.warehouseInventoryDefinitionWorkAudits;
	}

	public void setWarehouseInventoryDefinitionWorkAudits(Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits) {
		this.warehouseInventoryDefinitionWorkAudits = warehouseInventoryDefinitionWorkAudits;
	}

	public WarehouseInventoryDefinitionWorkAudit addWarehouseInventoryDefinitionWorkAudit(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudit) {
		getWarehouseInventoryDefinitionWorkAudits().add(warehouseInventoryDefinitionWorkAudit);
		warehouseInventoryDefinitionWorkAudit.setLocation(this);

		return warehouseInventoryDefinitionWorkAudit;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudit(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudit) {
		getWarehouseInventoryDefinitionWorkAudits().remove(warehouseInventoryDefinitionWorkAudit);
		warehouseInventoryDefinitionWorkAudit.setLocation(null);

		return warehouseInventoryDefinitionWorkAudit;
	}

	public Set<WarehouseInventoryDefinitionWork> getWarehouseInventoryDefinitionWorks() {
		return this.warehouseInventoryDefinitionWorks;
	}

	public void setWarehouseInventoryDefinitionWorks(Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks) {
		this.warehouseInventoryDefinitionWorks = warehouseInventoryDefinitionWorks;
	}

	public WarehouseInventoryDefinitionWork addWarehouseInventoryDefinitionWork(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWork) {
		getWarehouseInventoryDefinitionWorks().add(warehouseInventoryDefinitionWork);
		warehouseInventoryDefinitionWork.setLocation(this);

		return warehouseInventoryDefinitionWork;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWork(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWork) {
		getWarehouseInventoryDefinitionWorks().remove(warehouseInventoryDefinitionWork);
		warehouseInventoryDefinitionWork.setLocation(null);

		return warehouseInventoryDefinitionWork;
	}

	public Set<WarehouseInventoryDefinition> getWarehouseInventoryDefinitions() {
		return this.warehouseInventoryDefinitions;
	}

	public void setWarehouseInventoryDefinitions(Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions) {
		this.warehouseInventoryDefinitions = warehouseInventoryDefinitions;
	}

	public WarehouseInventoryDefinition addWarehouseInventoryDefinition(WarehouseInventoryDefinition warehouseInventoryDefinition) {
		getWarehouseInventoryDefinitions().add(warehouseInventoryDefinition);
		warehouseInventoryDefinition.setLocation(this);

		return warehouseInventoryDefinition;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinition(WarehouseInventoryDefinition warehouseInventoryDefinition) {
		getWarehouseInventoryDefinitions().remove(warehouseInventoryDefinition);
		warehouseInventoryDefinition.setLocation(null);

		return warehouseInventoryDefinition;
	}

}