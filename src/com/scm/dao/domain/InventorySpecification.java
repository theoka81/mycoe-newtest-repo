package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the InventorySpecifications database table.
 * 
 */
@Entity
@Table(name="InventorySpecifications")
@NamedQuery(name="InventorySpecification.findAll", query="SELECT i FROM InventorySpecification i")
public class InventorySpecification implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CanUseSubstituteFlag", nullable=false)
	private Boolean canUseSubstituteFlag;

	@Column(name="CreatedBySystemUserId")
	private Long createdBySystemUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DefaultUnit")
	private String defaultUnit;

	@Column(name="DocSpecificationId")
	private String docSpecificationId;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ItemId", nullable=false)
	private Long itemId;

	@Column(name="ItemNo", nullable=false)
	private Long itemNo;

	@Column(name="ItemNotesLinkId", nullable=false)
	private Long itemNotesLinkId;

	@Column(name="ModifiedBySystemUserId")
	private Long modifiedBySystemUserId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ProductConfiguration")
	private String productConfiguration;

	@Column(name="ProductModel")
	private String productModel;

	@Column(name="ProductModelGroup")
	private String productModelGroup;

	@Column(name="RelatedAssetDescription")
	private String relatedAssetDescription;

	@Column(name="RelatedAssetId")
	private String relatedAssetId;

	@Column(name="SpecifiedEffectiveDate")
	private String specifiedEffectiveDate;

	@Column(name="SpecifiedState")
	private String specifiedState;

	@Column(name="TraceCode")
	private String traceCode;

	@Column(name="UseOemPartFlag", nullable=false)
	private Boolean useOemPartFlag;

	@Column(name="VariantBaseline")
	private String variantBaseline;

	@Column(name="VariantSpecification")
	private String variantSpecification;

	public InventorySpecification() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getCanUseSubstituteFlag() {
		return this.canUseSubstituteFlag;
	}

	public void setCanUseSubstituteFlag(Boolean canUseSubstituteFlag) {
		this.canUseSubstituteFlag = canUseSubstituteFlag;
	}

	public Long getCreatedBySystemUserId() {
		return this.createdBySystemUserId;
	}

	public void setCreatedBySystemUserId(Long createdBySystemUserId) {
		this.createdBySystemUserId = createdBySystemUserId;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDefaultUnit() {
		return this.defaultUnit;
	}

	public void setDefaultUnit(String defaultUnit) {
		this.defaultUnit = defaultUnit;
	}

	public String getDocSpecificationId() {
		return this.docSpecificationId;
	}

	public void setDocSpecificationId(String docSpecificationId) {
		this.docSpecificationId = docSpecificationId;
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

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(Long itemNo) {
		this.itemNo = itemNo;
	}

	public Long getItemNotesLinkId() {
		return this.itemNotesLinkId;
	}

	public void setItemNotesLinkId(Long itemNotesLinkId) {
		this.itemNotesLinkId = itemNotesLinkId;
	}

	public Long getModifiedBySystemUserId() {
		return this.modifiedBySystemUserId;
	}

	public void setModifiedBySystemUserId(Long modifiedBySystemUserId) {
		this.modifiedBySystemUserId = modifiedBySystemUserId;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getProductConfiguration() {
		return this.productConfiguration;
	}

	public void setProductConfiguration(String productConfiguration) {
		this.productConfiguration = productConfiguration;
	}

	public String getProductModel() {
		return this.productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getProductModelGroup() {
		return this.productModelGroup;
	}

	public void setProductModelGroup(String productModelGroup) {
		this.productModelGroup = productModelGroup;
	}

	public String getRelatedAssetDescription() {
		return this.relatedAssetDescription;
	}

	public void setRelatedAssetDescription(String relatedAssetDescription) {
		this.relatedAssetDescription = relatedAssetDescription;
	}

	public String getRelatedAssetId() {
		return this.relatedAssetId;
	}

	public void setRelatedAssetId(String relatedAssetId) {
		this.relatedAssetId = relatedAssetId;
	}

	public String getSpecifiedEffectiveDate() {
		return this.specifiedEffectiveDate;
	}

	public void setSpecifiedEffectiveDate(String specifiedEffectiveDate) {
		this.specifiedEffectiveDate = specifiedEffectiveDate;
	}

	public String getSpecifiedState() {
		return this.specifiedState;
	}

	public void setSpecifiedState(String specifiedState) {
		this.specifiedState = specifiedState;
	}

	public String getTraceCode() {
		return this.traceCode;
	}

	public void setTraceCode(String traceCode) {
		this.traceCode = traceCode;
	}

	public Boolean getUseOemPartFlag() {
		return this.useOemPartFlag;
	}

	public void setUseOemPartFlag(Boolean useOemPartFlag) {
		this.useOemPartFlag = useOemPartFlag;
	}

	public String getVariantBaseline() {
		return this.variantBaseline;
	}

	public void setVariantBaseline(String variantBaseline) {
		this.variantBaseline = variantBaseline;
	}

	public String getVariantSpecification() {
		return this.variantSpecification;
	}

	public void setVariantSpecification(String variantSpecification) {
		this.variantSpecification = variantSpecification;
	}

}