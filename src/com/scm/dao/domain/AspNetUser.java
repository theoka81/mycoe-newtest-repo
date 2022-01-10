package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the AspNetUsers database table.
 * 
 */
@Entity
@Table(name="AspNetUsers")
@NamedQuery(name="AspNetUser.findAll", query="SELECT a FROM AspNetUser a")
public class AspNetUser implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private String id;

	@Column(name="AccessFailedCount", nullable=false)
	private Integer accessFailedCount;

	@Column(name="Email")
	private String email;

	@Column(name="EmailConfirmed", nullable=false)
	private Boolean emailConfirmed;

	@Column(name="LockoutEnabled", nullable=false)
	private Boolean lockoutEnabled;

	@Column(name="LockoutEndDateUtc")
	private Timestamp lockoutEndDateUtc;

	@Column(name="PasswordHash")
	private String passwordHash;

	@Column(name="PhoneNumber")
	private String phoneNumber;

	@Column(name="PhoneNumberConfirmed", nullable=false)
	private Boolean phoneNumberConfirmed;

	@Column(name="SecurityStamp")
	private String securityStamp;

	@Column(name="TwoFactorEnabled", nullable=false)
	private Boolean twoFactorEnabled;

	@Column(name="UserName", nullable=false)
	private String userName;

	//bi-directional many-to-one association to AspNetUserClaim
	@OneToMany(mappedBy="aspNetUser")
	private Set<AspNetUserClaim> aspNetUserClaims;

	//bi-directional many-to-one association to AspNetUserLogin
	@OneToMany(mappedBy="aspNetUser")
	private Set<AspNetUserLogin> aspNetUserLogins;

	//bi-directional many-to-many association to AspNetRole
	@ManyToMany
	@JoinTable(
		name="AspNetUserRoles"
		, joinColumns={
			@JoinColumn(name="UserId", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="RoleId", nullable=false)
			}
		)
	private Set<AspNetRole> aspNetRoles;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="SystemUserId", nullable=false)
	private SystemUser systemUser;

	public AspNetUser() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAccessFailedCount() {
		return this.accessFailedCount;
	}

	public void setAccessFailedCount(Integer accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(Boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public Boolean getLockoutEnabled() {
		return this.lockoutEnabled;
	}

	public void setLockoutEnabled(Boolean lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	public Timestamp getLockoutEndDateUtc() {
		return this.lockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(Timestamp lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getPhoneNumberConfirmed() {
		return this.phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(Boolean phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public String getSecurityStamp() {
		return this.securityStamp;
	}

	public void setSecurityStamp(String securityStamp) {
		this.securityStamp = securityStamp;
	}

	public Boolean getTwoFactorEnabled() {
		return this.twoFactorEnabled;
	}

	public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Set<AspNetUserClaim> getAspNetUserClaims() {
		return this.aspNetUserClaims;
	}

	public void setAspNetUserClaims(Set<AspNetUserClaim> aspNetUserClaims) {
		this.aspNetUserClaims = aspNetUserClaims;
	}

	public AspNetUserClaim addAspNetUserClaim(AspNetUserClaim aspNetUserClaim) {
		getAspNetUserClaims().add(aspNetUserClaim);
		aspNetUserClaim.setAspNetUser(this);

		return aspNetUserClaim;
	}

	public AspNetUserClaim removeAspNetUserClaim(AspNetUserClaim aspNetUserClaim) {
		getAspNetUserClaims().remove(aspNetUserClaim);
		aspNetUserClaim.setAspNetUser(null);

		return aspNetUserClaim;
	}

	public Set<AspNetUserLogin> getAspNetUserLogins() {
		return this.aspNetUserLogins;
	}

	public void setAspNetUserLogins(Set<AspNetUserLogin> aspNetUserLogins) {
		this.aspNetUserLogins = aspNetUserLogins;
	}

	public AspNetUserLogin addAspNetUserLogin(AspNetUserLogin aspNetUserLogin) {
		getAspNetUserLogins().add(aspNetUserLogin);
		aspNetUserLogin.setAspNetUser(this);

		return aspNetUserLogin;
	}

	public AspNetUserLogin removeAspNetUserLogin(AspNetUserLogin aspNetUserLogin) {
		getAspNetUserLogins().remove(aspNetUserLogin);
		aspNetUserLogin.setAspNetUser(null);

		return aspNetUserLogin;
	}

	public Set<AspNetRole> getAspNetRoles() {
		return this.aspNetRoles;
	}

	public void setAspNetRoles(Set<AspNetRole> aspNetRoles) {
		this.aspNetRoles = aspNetRoles;
	}

	public SystemUser getSystemUser() {
		return this.systemUser;
	}

	public void setSystemUser(SystemUser systemUser) {
		this.systemUser = systemUser;
	}

}