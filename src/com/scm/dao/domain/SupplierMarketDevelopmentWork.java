package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SupplierMarketDevelopmentWorks database table.
 * 
 */
@Entity
@Table(name="SupplierMarketDevelopmentWorks")
@NamedQuery(name="SupplierMarketDevelopmentWork.findAll", query="SELECT s FROM SupplierMarketDevelopmentWork s")
public class SupplierMarketDevelopmentWork implements Serializable {
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

	@Column(name="OriginalId", nullable=false)
	private Long originalId;

	@Column(name="ReferenceNumber")
	private String referenceNumber;

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

	public SupplierMarketDevelopmentWork() {
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

	public Long getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(Long originalId) {
		this.originalId = originalId;
	}

	public String getReferenceNumber() {
		return this.referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
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

}