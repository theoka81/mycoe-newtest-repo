package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Signatories database table.
 * 
 */
@Entity
@Table(name="Signatories")
@NamedQuery(name="Signatory.findAll", query="SELECT s FROM Signatory s")
public class Signatory implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AuthorizedName")
	private String authorizedName;

	@Column(name="AuthorizedSignatory")
	private String authorizedSignatory;

	@Column(name="ContractDetailsId")
	private Long contractDetailsId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="Designation")
	private String designation;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="PlaceOfContractSignature")
	private String placeOfContractSignature;

	@Column(name="SignatureDate")
	private Timestamp signatureDate;

	@Column(name="SupplierAuthorizedName")
	private String supplierAuthorizedName;

	@Column(name="SupplierAuthorizedSignatory")
	private String supplierAuthorizedSignatory;

	@Column(name="SupplierDesignation")
	private String supplierDesignation;

	@Column(name="SupplierPlaceOfContractSignature")
	private String supplierPlaceOfContractSignature;

	@Column(name="SupplierSignatureDate")
	private Timestamp supplierSignatureDate;

	@Column(name="SupplierWitness1")
	private String supplierWitness1;

	@Column(name="SupplierWitness2")
	private String supplierWitness2;

	@Column(name="Witness1")
	private String witness1;

	@Column(name="Witness2")
	private String witness2;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser2;

	public Signatory() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorizedName() {
		return this.authorizedName;
	}

	public void setAuthorizedName(String authorizedName) {
		this.authorizedName = authorizedName;
	}

	public String getAuthorizedSignatory() {
		return this.authorizedSignatory;
	}

	public void setAuthorizedSignatory(String authorizedSignatory) {
		this.authorizedSignatory = authorizedSignatory;
	}

	public Long getContractDetailsId() {
		return this.contractDetailsId;
	}

	public void setContractDetailsId(Long contractDetailsId) {
		this.contractDetailsId = contractDetailsId;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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

	public String getPlaceOfContractSignature() {
		return this.placeOfContractSignature;
	}

	public void setPlaceOfContractSignature(String placeOfContractSignature) {
		this.placeOfContractSignature = placeOfContractSignature;
	}

	public Timestamp getSignatureDate() {
		return this.signatureDate;
	}

	public void setSignatureDate(Timestamp signatureDate) {
		this.signatureDate = signatureDate;
	}

	public String getSupplierAuthorizedName() {
		return this.supplierAuthorizedName;
	}

	public void setSupplierAuthorizedName(String supplierAuthorizedName) {
		this.supplierAuthorizedName = supplierAuthorizedName;
	}

	public String getSupplierAuthorizedSignatory() {
		return this.supplierAuthorizedSignatory;
	}

	public void setSupplierAuthorizedSignatory(String supplierAuthorizedSignatory) {
		this.supplierAuthorizedSignatory = supplierAuthorizedSignatory;
	}

	public String getSupplierDesignation() {
		return this.supplierDesignation;
	}

	public void setSupplierDesignation(String supplierDesignation) {
		this.supplierDesignation = supplierDesignation;
	}

	public String getSupplierPlaceOfContractSignature() {
		return this.supplierPlaceOfContractSignature;
	}

	public void setSupplierPlaceOfContractSignature(String supplierPlaceOfContractSignature) {
		this.supplierPlaceOfContractSignature = supplierPlaceOfContractSignature;
	}

	public Timestamp getSupplierSignatureDate() {
		return this.supplierSignatureDate;
	}

	public void setSupplierSignatureDate(Timestamp supplierSignatureDate) {
		this.supplierSignatureDate = supplierSignatureDate;
	}

	public String getSupplierWitness1() {
		return this.supplierWitness1;
	}

	public void setSupplierWitness1(String supplierWitness1) {
		this.supplierWitness1 = supplierWitness1;
	}

	public String getSupplierWitness2() {
		return this.supplierWitness2;
	}

	public void setSupplierWitness2(String supplierWitness2) {
		this.supplierWitness2 = supplierWitness2;
	}

	public String getWitness1() {
		return this.witness1;
	}

	public void setWitness1(String witness1) {
		this.witness1 = witness1;
	}

	public String getWitness2() {
		return this.witness2;
	}

	public void setWitness2(String witness2) {
		this.witness2 = witness2;
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