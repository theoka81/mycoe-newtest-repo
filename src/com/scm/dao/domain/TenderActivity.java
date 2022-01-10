package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TenderActivities database table.
 * 
 */
@Entity
@Table(name="TenderActivities")
@NamedQuery(name="TenderActivity.findAll", query="SELECT t FROM TenderActivity t")
public class TenderActivity implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ActivityId")
	private Long activityId;

	@Column(name="AssignedUserId")
	private Long assignedUserId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DateEnded")
	private Timestamp dateEnded;

	@Column(name="DateStarted")
	private Timestamp dateStarted;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsApproved", nullable=false)
	private Boolean isApproved;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="IsProcessComplete", nullable=false)
	private Boolean isProcessComplete;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="StatusId")
	private Long statusId;

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

	public TenderActivity() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public Long getAssignedUserId() {
		return this.assignedUserId;
	}

	public void setAssignedUserId(Long assignedUserId) {
		this.assignedUserId = assignedUserId;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getDateEnded() {
		return this.dateEnded;
	}

	public void setDateEnded(Timestamp dateEnded) {
		this.dateEnded = dateEnded;
	}

	public Timestamp getDateStarted() {
		return this.dateStarted;
	}

	public void setDateStarted(Timestamp dateStarted) {
		this.dateStarted = dateStarted;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsApproved() {
		return this.isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
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

	public Boolean getIsProcessComplete() {
		return this.isProcessComplete;
	}

	public void setIsProcessComplete(Boolean isProcessComplete) {
		this.isProcessComplete = isProcessComplete;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
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