package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the QuestionZones database table.
 * 
 */
@Entity
@Table(name="QuestionZones")
@NamedQuery(name="QuestionZone.findAll", query="SELECT q FROM QuestionZone q")
public class QuestionZone implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

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

	@Column(name="TransactionId", nullable=false)
	private Long transactionId;

	@Column(name="ZoneTitle")
	private String zoneTitle;

	//bi-directional many-to-one association to QuestionBuilder
	@OneToMany(mappedBy="questionZone")
	private Set<QuestionBuilder> questionBuilders;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	public QuestionZone() {
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

	public Long getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getZoneTitle() {
		return this.zoneTitle;
	}

	public void setZoneTitle(String zoneTitle) {
		this.zoneTitle = zoneTitle;
	}

	public Set<QuestionBuilder> getQuestionBuilders() {
		return this.questionBuilders;
	}

	public void setQuestionBuilders(Set<QuestionBuilder> questionBuilders) {
		this.questionBuilders = questionBuilders;
	}

	public QuestionBuilder addQuestionBuilder(QuestionBuilder questionBuilder) {
		getQuestionBuilders().add(questionBuilder);
		questionBuilder.setQuestionZone(this);

		return questionBuilder;
	}

	public QuestionBuilder removeQuestionBuilder(QuestionBuilder questionBuilder) {
		getQuestionBuilders().remove(questionBuilder);
		questionBuilder.setQuestionZone(null);

		return questionBuilder;
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