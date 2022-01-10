package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_EmailAccounts database table.
 * 
 */
@Entity
@Table(name="tb_EmailAccounts")
@NamedQuery(name="Tb_EmailAccount.findAll", query="SELECT t FROM Tb_EmailAccount t")
public class Tb_EmailAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmailAccountId")
	private int emailAccountId;

	@Column(name="AccountFailureCount")
	private int accountFailureCount;

	@Column(name="ApplicationId")
	private int applicationId;

	@Column(name="CanRecieve")
	private boolean canRecieve;

	@Column(name="CanSend")
	private boolean canSend;

	@Column(name="CheckUndeliverable")
	private boolean checkUndeliverable;

	@Column(name="DeleteServerEmail")
	private boolean deleteServerEmail;

	@Column(name="DisableAccount")
	private boolean disableAccount;

	@Column(name="EmailAccountDescription")
	private String emailAccountDescription;

	@Column(name="EmailAddress")
	private String emailAddress;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="IsLocked")
	private boolean isLocked;

	@Column(name="MaxFailureCount")
	private int maxFailureCount;

	@Column(name="Password")
	private String password;

	@Column(name="PasswordExpiredDate")
	private Timestamp passwordExpiredDate;

	@Column(name="PasswordExpiredDays")
	private int passwordExpiredDays;

	@Column(name="PasswordNeverExpires")
	private boolean passwordNeverExpires;

	@Column(name="ServiceUrl")
	private String serviceUrl;

	@Column(name="Username")
	private String username;

	public Tb_EmailAccount() {
	}

	public int getEmailAccountId() {
		return this.emailAccountId;
	}

	public void setEmailAccountId(int emailAccountId) {
		this.emailAccountId = emailAccountId;
	}

	public int getAccountFailureCount() {
		return this.accountFailureCount;
	}

	public void setAccountFailureCount(int accountFailureCount) {
		this.accountFailureCount = accountFailureCount;
	}

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public boolean getCanRecieve() {
		return this.canRecieve;
	}

	public void setCanRecieve(boolean canRecieve) {
		this.canRecieve = canRecieve;
	}

	public boolean getCanSend() {
		return this.canSend;
	}

	public void setCanSend(boolean canSend) {
		this.canSend = canSend;
	}

	public boolean getCheckUndeliverable() {
		return this.checkUndeliverable;
	}

	public void setCheckUndeliverable(boolean checkUndeliverable) {
		this.checkUndeliverable = checkUndeliverable;
	}

	public boolean getDeleteServerEmail() {
		return this.deleteServerEmail;
	}

	public void setDeleteServerEmail(boolean deleteServerEmail) {
		this.deleteServerEmail = deleteServerEmail;
	}

	public boolean getDisableAccount() {
		return this.disableAccount;
	}

	public void setDisableAccount(boolean disableAccount) {
		this.disableAccount = disableAccount;
	}

	public String getEmailAccountDescription() {
		return this.emailAccountDescription;
	}

	public void setEmailAccountDescription(String emailAccountDescription) {
		this.emailAccountDescription = emailAccountDescription;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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

	public int getMaxFailureCount() {
		return this.maxFailureCount;
	}

	public void setMaxFailureCount(int maxFailureCount) {
		this.maxFailureCount = maxFailureCount;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getPasswordExpiredDate() {
		return this.passwordExpiredDate;
	}

	public void setPasswordExpiredDate(Timestamp passwordExpiredDate) {
		this.passwordExpiredDate = passwordExpiredDate;
	}

	public int getPasswordExpiredDays() {
		return this.passwordExpiredDays;
	}

	public void setPasswordExpiredDays(int passwordExpiredDays) {
		this.passwordExpiredDays = passwordExpiredDays;
	}

	public boolean getPasswordNeverExpires() {
		return this.passwordNeverExpires;
	}

	public void setPasswordNeverExpires(boolean passwordNeverExpires) {
		this.passwordNeverExpires = passwordNeverExpires;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}