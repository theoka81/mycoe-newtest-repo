package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the RoleRelationships database table.
 * 
 */
@Entity
@Table(name="RoleRelationships")
@NamedQuery(name="RoleRelationship.findAll", query="SELECT r FROM RoleRelationship r")
public class RoleRelationship implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DateCreated")
	private Timestamp dateCreated;

	@Column(name="DateDelegated")
	private Timestamp dateDelegated;

	@Column(name="DateExpired")
	private Timestamp dateExpired;

	@Column(name="DelegationApprover")
	private String delegationApprover;

	@Column(name="DelegationReason")
	private String delegationReason;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ReinstatedDate")
	private Timestamp reinstatedDate;

	@Column(name="Status")
	private String status;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="UserId")
	private SystemUser systemUser3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="CompanyId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="DepartmentId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="GroupId")
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="LevelId")
	private UserCode userCode4;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="OrganizationId")
	private UserCode userCode5;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusId")
	private UserCode userCode6;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="TeamId")
	private UserCode userCode7;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="UnitId")
	private UserCode userCode8;

	public RoleRelationship() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateDelegated() {
		return this.dateDelegated;
	}

	public void setDateDelegated(Timestamp dateDelegated) {
		this.dateDelegated = dateDelegated;
	}

	public Timestamp getDateExpired() {
		return this.dateExpired;
	}

	public void setDateExpired(Timestamp dateExpired) {
		this.dateExpired = dateExpired;
	}

	public String getDelegationApprover() {
		return this.delegationApprover;
	}

	public void setDelegationApprover(String delegationApprover) {
		this.delegationApprover = delegationApprover;
	}

	public String getDelegationReason() {
		return this.delegationReason;
	}

	public void setDelegationReason(String delegationReason) {
		this.delegationReason = delegationReason;
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

	public Timestamp getReinstatedDate() {
		return this.reinstatedDate;
	}

	public void setReinstatedDate(Timestamp reinstatedDate) {
		this.reinstatedDate = reinstatedDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public SystemUser getSystemUser3() {
		return this.systemUser3;
	}

	public void setSystemUser3(SystemUser systemUser3) {
		this.systemUser3 = systemUser3;
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

	public UserCode getUserCode5() {
		return this.userCode5;
	}

	public void setUserCode5(UserCode userCode5) {
		this.userCode5 = userCode5;
	}

	public UserCode getUserCode6() {
		return this.userCode6;
	}

	public void setUserCode6(UserCode userCode6) {
		this.userCode6 = userCode6;
	}

	public UserCode getUserCode7() {
		return this.userCode7;
	}

	public void setUserCode7(UserCode userCode7) {
		this.userCode7 = userCode7;
	}

	public UserCode getUserCode8() {
		return this.userCode8;
	}

	public void setUserCode8(UserCode userCode8) {
		this.userCode8 = userCode8;
	}

}