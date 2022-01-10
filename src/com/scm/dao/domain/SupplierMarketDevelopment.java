package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the SupplierMarketDevelopments database table.
 * 
 */
@Entity
@Table(name="SupplierMarketDevelopments")
@NamedQuery(name="SupplierMarketDevelopment.findAll", query="SELECT s FROM SupplierMarketDevelopment s")
public class SupplierMarketDevelopment implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CheckBoxA")
	private Boolean checkBoxA;

	@Column(name="CheckBoxB")
	private Boolean checkBoxB;

	@Column(name="CheckBoxC")
	private Boolean checkBoxC;

	@Column(name="CheckBoxD")
	private Boolean checkBoxD;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ReferenceNumber")
	private String referenceNumber;

	@Column(name="Score")
	private Long score;

	//bi-directional many-to-one association to SupMktDevKPI
	@OneToMany(mappedBy="supplierMarketDevelopment")
	private Set<SupMktDevKPI> supMktDevKpis;

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
	@JoinColumn(name="StatusId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="DevelopmentTypeId")
	private UserCode userCode2;

	//bi-directional many-to-many association to SupplierMaster
	@ManyToMany(mappedBy="supplierMarketDevelopments")
	private Set<SupplierMaster> supplierMasters;

	//bi-directional many-to-one association to SupMktDevItem
	@OneToMany(mappedBy="supplierMarketDevelopment")
	private Set<SupMktDevItem> supMktDevItems;

	public SupplierMarketDevelopment() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getCheckBoxA() {
		return this.checkBoxA;
	}

	public void setCheckBoxA(Boolean checkBoxA) {
		this.checkBoxA = checkBoxA;
	}

	public Boolean getCheckBoxB() {
		return this.checkBoxB;
	}

	public void setCheckBoxB(Boolean checkBoxB) {
		this.checkBoxB = checkBoxB;
	}

	public Boolean getCheckBoxC() {
		return this.checkBoxC;
	}

	public void setCheckBoxC(Boolean checkBoxC) {
		this.checkBoxC = checkBoxC;
	}

	public Boolean getCheckBoxD() {
		return this.checkBoxD;
	}

	public void setCheckBoxD(Boolean checkBoxD) {
		this.checkBoxD = checkBoxD;
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

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getReferenceNumber() {
		return this.referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Long getScore() {
		return this.score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Set<SupMktDevKPI> getSupMktDevKpis() {
		return this.supMktDevKpis;
	}

	public void setSupMktDevKpis(Set<SupMktDevKPI> supMktDevKpis) {
		this.supMktDevKpis = supMktDevKpis;
	}

	public SupMktDevKPI addSupMktDevKpi(SupMktDevKPI supMktDevKpi) {
		getSupMktDevKpis().add(supMktDevKpi);
		supMktDevKpi.setSupplierMarketDevelopment(this);

		return supMktDevKpi;
	}

	public SupMktDevKPI removeSupMktDevKpi(SupMktDevKPI supMktDevKpi) {
		getSupMktDevKpis().remove(supMktDevKpi);
		supMktDevKpi.setSupplierMarketDevelopment(null);

		return supMktDevKpi;
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

	public Set<SupplierMaster> getSupplierMasters() {
		return this.supplierMasters;
	}

	public void setSupplierMasters(Set<SupplierMaster> supplierMasters) {
		this.supplierMasters = supplierMasters;
	}

	public Set<SupMktDevItem> getSupMktDevItems() {
		return this.supMktDevItems;
	}

	public void setSupMktDevItems(Set<SupMktDevItem> supMktDevItems) {
		this.supMktDevItems = supMktDevItems;
	}

	public SupMktDevItem addSupMktDevItem(SupMktDevItem supMktDevItem) {
		getSupMktDevItems().add(supMktDevItem);
		supMktDevItem.setSupplierMarketDevelopment(this);

		return supMktDevItem;
	}

	public SupMktDevItem removeSupMktDevItem(SupMktDevItem supMktDevItem) {
		getSupMktDevItems().remove(supMktDevItem);
		supMktDevItem.setSupplierMarketDevelopment(null);

		return supMktDevItem;
	}

}