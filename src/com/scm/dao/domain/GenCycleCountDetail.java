package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the GenCycleCountDetails database table.
 * 
 */
@Entity
@Table(name="GenCycleCountDetails")
@NamedQuery(name="GenCycleCountDetail.findAll", query="SELECT g FROM GenCycleCountDetail g")
public class GenCycleCountDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="CountOnHand")
	private long countOnHand;

	@Column(name="CountReserved")
	private long countReserved;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="IsLocked")
	private boolean isLocked;

	@Column(name="IsQuantityOnHandUpdated")
	private boolean isQuantityOnHandUpdated;

	@Column(name="IsQuantityReservedUpdated")
	private boolean isQuantityReservedUpdated;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="PhysicalCountOnHand")
	private long physicalCountOnHand;

	@Column(name="PhysicalCountReserved")
	private long physicalCountReserved;

	@Column(name="Remarks")
	private String remarks;

	@Column(name="StoreOfficer")
	private String storeOfficer;

	//bi-directional many-to-one association to GenCycleCountMaster
	@ManyToOne
	@JoinColumn(name="GenCycleCountMasterId")
	private GenCycleCountMaster genCycleCountMaster;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ItemTypeId")
	private UserCode userCode2;

	//bi-directional many-to-one association to WarehouseInventory
	/*@ManyToOne
	@JoinColumn(name="WarehouseInventoryId")
	private WarehouseInventory warehouseInventory;*/

	public GenCycleCountDetail() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCountOnHand() {
		return this.countOnHand;
	}

	public void setCountOnHand(long countOnHand) {
		this.countOnHand = countOnHand;
	}

	public long getCountReserved() {
		return this.countReserved;
	}

	public void setCountReserved(long countReserved) {
		this.countReserved = countReserved;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public boolean getIsQuantityOnHandUpdated() {
		return this.isQuantityOnHandUpdated;
	}

	public void setIsQuantityOnHandUpdated(boolean isQuantityOnHandUpdated) {
		this.isQuantityOnHandUpdated = isQuantityOnHandUpdated;
	}

	public boolean getIsQuantityReservedUpdated() {
		return this.isQuantityReservedUpdated;
	}

	public void setIsQuantityReservedUpdated(boolean isQuantityReservedUpdated) {
		this.isQuantityReservedUpdated = isQuantityReservedUpdated;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public long getPhysicalCountOnHand() {
		return this.physicalCountOnHand;
	}

	public void setPhysicalCountOnHand(long physicalCountOnHand) {
		this.physicalCountOnHand = physicalCountOnHand;
	}

	public long getPhysicalCountReserved() {
		return this.physicalCountReserved;
	}

	public void setPhysicalCountReserved(long physicalCountReserved) {
		this.physicalCountReserved = physicalCountReserved;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStoreOfficer() {
		return this.storeOfficer;
	}

	public void setStoreOfficer(String storeOfficer) {
		this.storeOfficer = storeOfficer;
	}

	public GenCycleCountMaster getGenCycleCountMaster() {
		return this.genCycleCountMaster;
	}

	public void setGenCycleCountMaster(GenCycleCountMaster genCycleCountMaster) {
		this.genCycleCountMaster = genCycleCountMaster;
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

	public UserCode getUserCode1() {
		return this.userCode1;
	}

	public void setUserCode1(UserCode userCode1) {
		this.userCode1 = userCode1;
	}

	public UserCode getUserCode2() {
		return this.userCode2;
	}

	public void setUserCode2(UserCode userCode2) {
		this.userCode2 = userCode2;
	}

	/*public WarehouseInventory getWarehouseInventory() {
		return this.warehouseInventory;
	}

	public void setWarehouseInventory(WarehouseInventory warehouseInventory) {
		this.warehouseInventory = warehouseInventory;
	}*/

}