package com.scm.dao.cesar.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tb_EventLogs database table.
 * 
 */
@Entity
@Table(name="tb_EventLogs")
@NamedQuery(name="Tb_EventLog.findAll", query="SELECT t FROM Tb_EventLog t")
public class Tb_EventLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EventLogID")
	private int eventLogID;

	@Column(name="ApplicationID")
	private int applicationID;

	@Column(name="EventData")
	private String eventData;

	@Column(name="EventDateTime")
	private Timestamp eventDateTime;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="IsDeleted")
	private boolean isDeleted;

	@Column(name="UserID")
	private int userID;

	public Tb_EventLog() {
	}

	public int getEventLogID() {
		return this.eventLogID;
	}

	public void setEventLogID(int eventLogID) {
		this.eventLogID = eventLogID;
	}

	public int getApplicationID() {
		return this.applicationID;
	}

	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}

	public String getEventData() {
		return this.eventData;
	}

	public void setEventData(String eventData) {
		this.eventData = eventData;
	}

	public Timestamp getEventDateTime() {
		return this.eventDateTime;
	}

	public void setEventDateTime(Timestamp eventDateTime) {
		this.eventDateTime = eventDateTime;
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

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}