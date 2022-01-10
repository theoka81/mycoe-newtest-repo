package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_Applications database table.
 * 
 */
@Entity
@Table(name="tb_Applications")
@NamedQuery(name="Tb_Application.findAll", query="SELECT t FROM Tb_Application t")
public class Tb_Application implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ApplicationID")
	private int applicationID;

	@Column(name="ApplicationDescription")
	private String applicationDescription;

	@Column(name="ApplicationKey")
	private String applicationKey;

	@Column(name="ApplicationName")
	private String applicationName;

	@Column(name="ApplicationURL")
	private String applicationURL;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	public Tb_Application() {
	}

	public int getApplicationID() {
		return this.applicationID;
	}

	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}

	public String getApplicationDescription() {
		return this.applicationDescription;
	}

	public void setApplicationDescription(String applicationDescription) {
		this.applicationDescription = applicationDescription;
	}

	public String getApplicationKey() {
		return this.applicationKey;
	}

	public void setApplicationKey(String applicationKey) {
		this.applicationKey = applicationKey;
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationURL() {
		return this.applicationURL;
	}

	public void setApplicationURL(String applicationURL) {
		this.applicationURL = applicationURL;
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