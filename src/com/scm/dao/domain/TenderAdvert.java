package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TenderAdverts database table.
 * 
 */
@Entity
@Table(name="TenderAdverts")
@NamedQuery(name="TenderAdvert.findAll", query="SELECT t FROM TenderAdvert t")
public class TenderAdvert implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AdvertCloseDate")
	private Timestamp advertCloseDate;

	@Column(name="AdvertDays")
	private Long advertDays;

	@Column(name="AdvertDescription")
	private String advertDescription;

	@Column(name="AdvertStartDate")
	private Timestamp advertStartDate;

	@Column(name="AdvertType")
	private Long advertType;

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

	@Column(name="TenderId")
	private Long tenderId;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public TenderAdvert() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getAdvertCloseDate() {
		return this.advertCloseDate;
	}

	public void setAdvertCloseDate(Timestamp advertCloseDate) {
		this.advertCloseDate = advertCloseDate;
	}

	public Long getAdvertDays() {
		return this.advertDays;
	}

	public void setAdvertDays(Long advertDays) {
		this.advertDays = advertDays;
	}

	public String getAdvertDescription() {
		return this.advertDescription;
	}

	public void setAdvertDescription(String advertDescription) {
		this.advertDescription = advertDescription;
	}

	public Timestamp getAdvertStartDate() {
		return this.advertStartDate;
	}

	public void setAdvertStartDate(Timestamp advertStartDate) {
		this.advertStartDate = advertStartDate;
	}

	public Long getAdvertType() {
		return this.advertType;
	}

	public void setAdvertType(Long advertType) {
		this.advertType = advertType;
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

	public Long getTenderId() {
		return this.tenderId;
	}

	public void setTenderId(Long tenderId) {
		this.tenderId = tenderId;
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