package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the StandardCommodityAgreements database table.
 * 
 */
@Entity
@Table(name="StandardCommodityAgreements")
@NamedQuery(name="StandardCommodityAgreement.findAll", query="SELECT s FROM StandardCommodityAgreement s")
public class StandardCommodityAgreement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="AgreementDescription")
	private String agreementDescription;

	@Column(name="AgreementTitle")
	private String agreementTitle;

	@Column(name="CommodityMasterAgreementId")
	private long commodityMasterAgreementId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="IsLocked")
	private boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="StandardAgreementId")
	private long standardAgreementId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public StandardCommodityAgreement() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAgreementDescription() {
		return this.agreementDescription;
	}

	public void setAgreementDescription(String agreementDescription) {
		this.agreementDescription = agreementDescription;
	}

	public String getAgreementTitle() {
		return this.agreementTitle;
	}

	public void setAgreementTitle(String agreementTitle) {
		this.agreementTitle = agreementTitle;
	}

	public long getCommodityMasterAgreementId() {
		return this.commodityMasterAgreementId;
	}

	public void setCommodityMasterAgreementId(long commodityMasterAgreementId) {
		this.commodityMasterAgreementId = commodityMasterAgreementId;
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

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public long getStandardAgreementId() {
		return this.standardAgreementId;
	}

	public void setStandardAgreementId(long standardAgreementId) {
		this.standardAgreementId = standardAgreementId;
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