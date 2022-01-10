package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierRotationTemplates database table.
 * 
 */
@Entity
@Table(name="SupplierRotationTemplates")
@NamedQuery(name="SupplierRotationTemplate.findAll", query="SELECT s FROM SupplierRotationTemplate s")
public class SupplierRotationTemplate implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AuthorizationPeriod")
	private Long authorizationPeriod;

	@Column(name="CommodityId")
	private Long commodityId;

	@Column(name="ContractDetailsId")
	private Long contractDetailsId;

	@Column(name="ContractId")
	private Long contractId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="LocationId")
	private Long locationId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ProductFamilyId")
	private Long productFamilyId;

	@Column(name="ReferenceNo")
	private String referenceNo;

	@Column(name="StatusId")
	private Long statusId;

	@Column(name="SupplierRotationDate", nullable=false)
	private Timestamp supplierRotationDate;

	@Column(name="TemplateTitle")
	private String templateTitle;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public SupplierRotationTemplate() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAuthorizationPeriod() {
		return this.authorizationPeriod;
	}

	public void setAuthorizationPeriod(Long authorizationPeriod) {
		this.authorizationPeriod = authorizationPeriod;
	}

	public Long getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(Long commodityId) {
		this.commodityId = commodityId;
	}

	public Long getContractDetailsId() {
		return this.contractDetailsId;
	}

	public void setContractDetailsId(Long contractDetailsId) {
		this.contractDetailsId = contractDetailsId;
	}

	public Long getContractId() {
		return this.contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
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

	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getProductFamilyId() {
		return this.productFamilyId;
	}

	public void setProductFamilyId(Long productFamilyId) {
		this.productFamilyId = productFamilyId;
	}

	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public Timestamp getSupplierRotationDate() {
		return this.supplierRotationDate;
	}

	public void setSupplierRotationDate(Timestamp supplierRotationDate) {
		this.supplierRotationDate = supplierRotationDate;
	}

	public String getTemplateTitle() {
		return this.templateTitle;
	}

	public void setTemplateTitle(String templateTitle) {
		this.templateTitle = templateTitle;
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

}