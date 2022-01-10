package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_AppSettings database table.
 * 
 */
@Entity
@Table(name="tb_AppSettings")
@NamedQuery(name="Tb_AppSetting.findAll", query="SELECT t FROM Tb_AppSetting t")
public class Tb_AppSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AppSettingID")
	private int appSettingID;

	@Column(name="AppKey")
	private String appKey;

	@Column(name="ApplicationID")
	private int applicationID;

	@Column(name="AppValue")
	private String appValue;

	@Column(name="Description")
	private String description;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	public Tb_AppSetting() {
	}

	public int getAppSettingID() {
		return this.appSettingID;
	}

	public void setAppSettingID(int appSettingID) {
		this.appSettingID = appSettingID;
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public int getApplicationID() {
		return this.applicationID;
	}

	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}

	public String getAppValue() {
		return this.appValue;
	}

	public void setAppValue(String appValue) {
		this.appValue = appValue;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

}