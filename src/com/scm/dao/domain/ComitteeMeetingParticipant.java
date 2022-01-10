package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ComitteeMeetingParticipants database table.
 * 
 */
@Entity
@Table(name="ComitteeMeetingParticipants")
@NamedQuery(name="ComitteeMeetingParticipant.findAll", query="SELECT c FROM ComitteeMeetingParticipant c")
public class ComitteeMeetingParticipant implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="CommiteeMeetingId")
	private Long commiteeMeetingId;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	@Column(name="IsPresent", nullable=false)
	private Boolean isPresent;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="ParticipantEmailAddress")
	private String participantEmailAddress;

	@Column(name="ParticipantId")
	private Long participantId;

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

	public ComitteeMeetingParticipant() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCommiteeMeetingId() {
		return this.commiteeMeetingId;
	}

	public void setCommiteeMeetingId(Long commiteeMeetingId) {
		this.commiteeMeetingId = commiteeMeetingId;
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

	public Boolean getIsPresent() {
		return this.isPresent;
	}

	public void setIsPresent(Boolean isPresent) {
		this.isPresent = isPresent;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getParticipantEmailAddress() {
		return this.participantEmailAddress;
	}

	public void setParticipantEmailAddress(String participantEmailAddress) {
		this.participantEmailAddress = participantEmailAddress;
	}

	public Long getParticipantId() {
		return this.participantId;
	}

	public void setParticipantId(Long participantId) {
		this.participantId = participantId;
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