package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the WarehouseDetails database table.
 * 
 */
@Entity
@Table(name="WarehouseDetails")
@NamedQuery(name="WarehouseDetail.findAll", query="SELECT w FROM WarehouseDetail w")
public class WarehouseDetail implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="BarcodeNo")
	private String barcodeNo;

	@Column(name="Capacity")
	private String capacity;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="CycleCountCategory")
	private String cycleCountCategory;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="Parent")
	private String parent;

	@Column(name="ProductType")
	private String productType;

	private String SDCName;

	@Column(name="Status")
	private String status;

	@Column(name="Unit")
	private String unit;

	@Column(name="WarehouseAddress")
	private String warehouseAddress;

	@Column(name="WarehouseDescription")
	private String warehouseDescription;

	@Column(name="WarehouseFax")
	private String warehouseFax;

	@Column(name="WarehouseNo")
	private String warehouseNo;

	@Column(name="WarehousePhone")
	private String warehousePhone;

	@Column(name="WarehouseSDCAddress")
	private String warehouseSDCAddress;

	@Column(name="WarehouseType")
	private String warehouseType;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ProductTypeId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="UnitId")
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="WarehouseTypeId")
	private UserCode userCode4;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionAudit
	@OneToMany(mappedBy="warehouseDetail")
	private Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWorkAudit
	@OneToMany(mappedBy="warehouseDetail")
	private Set<WarehouseInventoryDefinitionWorkAudit> warehouseInventoryDefinitionWorkAudits;

	//bi-directional many-to-one association to WarehouseInventoryDefinitionWork
	@OneToMany(mappedBy="warehouseDetail")
	private Set<WarehouseInventoryDefinitionWork> warehouseInventoryDefinitionWorks;

	//bi-directional many-to-one association to WarehouseInventoryDefinition
	@OneToMany(mappedBy="warehouseDetail")
	private Set<WarehouseInventoryDefinition> warehouseInventoryDefinitions;

	public WarehouseDetail() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBarcodeNo() {
		return this.barcodeNo;
	}

	public void setBarcodeNo(String barcodeNo) {
		this.barcodeNo = barcodeNo;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCycleCountCategory() {
		return this.cycleCountCategory;
	}

	public void setCycleCountCategory(String cycleCountCategory) {
		this.cycleCountCategory = cycleCountCategory;
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

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getParent() {
		return this.parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSDCName() {
		return this.SDCName;
	}

	public void setSDCName(String SDCName) {
		this.SDCName = SDCName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getWarehouseAddress() {
		return this.warehouseAddress;
	}

	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}

	public String getWarehouseDescription() {
		return this.warehouseDescription;
	}

	public void setWarehouseDescription(String warehouseDescription) {
		this.warehouseDescription = warehouseDescription;
	}

	public String getWarehouseFax() {
		return this.warehouseFax;
	}

	public void setWarehouseFax(String warehouseFax) {
		this.warehouseFax = warehouseFax;
	}

	public String getWarehouseNo() {
		return this.warehouseNo;
	}

	public void setWarehouseNo(String warehouseNo) {
		this.warehouseNo = warehouseNo;
	}

	public String getWarehousePhone() {
		return this.warehousePhone;
	}

	public void setWarehousePhone(String warehousePhone) {
		this.warehousePhone = warehousePhone;
	}

	public String getWarehouseSDCAddress() {
		return this.warehouseSDCAddress;
	}

	public void setWarehouseSDCAddress(String warehouseSDCAddress) {
		this.warehouseSDCAddress = warehouseSDCAddress;
	}

	public String getWarehouseType() {
		return this.warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
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

	public UserCode getUserCode3() {
		return this.userCode3;
	}

	public void setUserCode3(UserCode userCode3) {
		this.userCode3 = userCode3;
	}

	public UserCode getUserCode4() {
		return this.userCode4;
	}

	public void setUserCode4(UserCode userCode4) {
		this.userCode4 = userCode4;
	}

	public Set<WarehouseInventoryDefinitionAudit> getWarehouseInventoryDefinitionAudits() {
		return this.warehouseInventoryDefinitionAudits;
	}

	public void setWarehouseInventoryDefinitionAudits(Set<WarehouseInventoryDefinitionAudit> warehouseInventoryDefinitionAudits) {
		this.warehouseInventoryDefinitionAudits = warehouseInventoryDefinitionAudits;
	}

	public WarehouseInventoryDefinitionAudit addWarehouseInventoryDefinitionAudit(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudit) {
		getWarehouseInventoryDefinitionAudits().add(warehouseInventoryDefinitionAudit);
		warehouseInventoryDefinitionAudit.setWarehouseDetail(this);

		return warehouseInventoryDefinitionAudit;
	}

	public WarehouseInventoryDefinitionAudit removeWarehouseInventoryDefinitionAudit(WarehouseInventoryDefinitionAudit warehouseInventoryDefinitionAudit) {
		getWarehouseInventoryDefinitionAudits().remove(warehouseInventoryDefinitionAudit);
		warehouseInventoryDefinitionAudit.setWarehouseDetail(null);

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
		warehouseInventoryDefinitionWorkAudit.setWarehouseDetail(this);

		return warehouseInventoryDefinitionWorkAudit;
	}

	public WarehouseInventoryDefinitionWorkAudit removeWarehouseInventoryDefinitionWorkAudit(WarehouseInventoryDefinitionWorkAudit warehouseInventoryDefinitionWorkAudit) {
		getWarehouseInventoryDefinitionWorkAudits().remove(warehouseInventoryDefinitionWorkAudit);
		warehouseInventoryDefinitionWorkAudit.setWarehouseDetail(null);

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
		warehouseInventoryDefinitionWork.setWarehouseDetail(this);

		return warehouseInventoryDefinitionWork;
	}

	public WarehouseInventoryDefinitionWork removeWarehouseInventoryDefinitionWork(WarehouseInventoryDefinitionWork warehouseInventoryDefinitionWork) {
		getWarehouseInventoryDefinitionWorks().remove(warehouseInventoryDefinitionWork);
		warehouseInventoryDefinitionWork.setWarehouseDetail(null);

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
		warehouseInventoryDefinition.setWarehouseDetail(this);

		return warehouseInventoryDefinition;
	}

	public WarehouseInventoryDefinition removeWarehouseInventoryDefinition(WarehouseInventoryDefinition warehouseInventoryDefinition) {
		getWarehouseInventoryDefinitions().remove(warehouseInventoryDefinition);
		warehouseInventoryDefinition.setWarehouseDetail(null);

		return warehouseInventoryDefinition;
	}

}