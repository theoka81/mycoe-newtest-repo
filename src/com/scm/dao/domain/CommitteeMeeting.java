package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CommitteeMeetings database table.
 * 
 */
@Entity
@Table(name="CommitteeMeetings")
@NamedQuery(name="CommitteeMeeting.findAll", query="SELECT c FROM CommitteeMeeting c")
public class CommitteeMeeting implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CommitteeMeetingDescription")
	private String committeeMeetingDescription;

	@Column(name="CommitteeType")
	private Long committeeType;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="MeetingChair")
	private Long meetingChair;

	@Column(name="MeetingEnd")
	private Timestamp meetingEnd;

	@Column(name="MeetingStart")
	private Timestamp meetingStart;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="Status")
	private Long status;

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

	public CommitteeMeeting() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCommitteeMeetingDescription() {
		return this.committeeMeetingDescription;
	}

	public void setCommitteeMeetingDescription(String committeeMeetingDescription) {
		this.committeeMeetingDescription = committeeMeetingDescription;
	}

	public Long getCommitteeType() {
		return this.committeeType;
	}

	public void setCommitteeType(Long committeeType) {
		this.committeeType = committeeType;
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

	public Long getMeetingChair() {
		return this.meetingChair;
	}

	public void setMeetingChair(Long meetingChair) {
		this.meetingChair = meetingChair;
	}

	public Timestamp getMeetingEnd() {
		return this.meetingEnd;
	}

	public void setMeetingEnd(Timestamp meetingEnd) {
		this.meetingEnd = meetingEnd;
	}

	public Timestamp getMeetingStart() {
		return this.meetingStart;
	}

	public void setMeetingStart(Timestamp meetingStart) {
		this.meetingStart = meetingStart;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
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