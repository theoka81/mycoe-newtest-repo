package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the Clauses database table.
 * 
 */
@Entity
@Table(name="Clauses")
@NamedQuery(name="Claus.findAll", query="SELECT c FROM ContractClause c")
public class Clause implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ClauseDescription")
	private String clauseDescription;

	@Column(name="ClauseTitle")
	private String clauseTitle;

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

	//bi-directional many-to-one association to ClauseMapping
	@OneToMany(mappedBy="claus")
	private Set<ClauseMapping> clauseMappings;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ReferenceTypeId")
	private UserCode userCode;

	//bi-directional many-to-one association to ContractClauseAudit
	@OneToMany(mappedBy="claus")
	private Set<ContractClauseAudit> contractClauseAudits;

	//bi-directional many-to-one association to ContractClaus
	@OneToMany(mappedBy="claus")
	private Set<ContractClause> contractClauses;

	public Clause() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClauseDescription() {
		return this.clauseDescription;
	}

	public void setClauseDescription(String clauseDescription) {
		this.clauseDescription = clauseDescription;
	}

	public String getClauseTitle() {
		return this.clauseTitle;
	}

	public void setClauseTitle(String clauseTitle) {
		this.clauseTitle = clauseTitle;
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

	public Set<ClauseMapping> getClauseMappings() {
		return this.clauseMappings;
	}

	public void setClauseMappings(Set<ClauseMapping> clauseMappings) {
		this.clauseMappings = clauseMappings;
	}

	public ClauseMapping addClauseMapping(ClauseMapping clauseMapping) {
		getClauseMappings().add(clauseMapping);
		clauseMapping.setClaus(this);

		return clauseMapping;
	}

	public ClauseMapping removeClauseMapping(ClauseMapping clauseMapping) {
		getClauseMappings().remove(clauseMapping);
		clauseMapping.setClaus(null);

		return clauseMapping;
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

	public UserCode getUserCode() {
		return this.userCode;
	}

	public void setUserCode(UserCode userCode) {
		this.userCode = userCode;
	}

	public Set<ContractClauseAudit> getContractClauseAudits() {
		return this.contractClauseAudits;
	}

	public void setContractClauseAudits(Set<ContractClauseAudit> contractClauseAudits) {
		this.contractClauseAudits = contractClauseAudits;
	}

	public ContractClauseAudit addContractClauseAudit(ContractClauseAudit contractClauseAudit) {
		getContractClauseAudits().add(contractClauseAudit);
		contractClauseAudit.setClaus(this);

		return contractClauseAudit;
	}

	public ContractClauseAudit removeContractClauseAudit(ContractClauseAudit contractClauseAudit) {
		getContractClauseAudits().remove(contractClauseAudit);
		contractClauseAudit.setClaus(null);

		return contractClauseAudit;
	}

	public Set<ContractClause> getContractClauses() {
		return this.contractClauses;
	}

	public void setContractClauses(Set<ContractClause> contractClauses) {
		this.contractClauses = contractClauses;
	}

	public ContractClause addContractClaus(ContractClause contractClaus) {
		getContractClauses().add(contractClaus);
		contractClaus.setClaus(this);

		return contractClaus;
	}

	public ContractClause removeContractClaus(ContractClause contractClaus) {
		getContractClauses().remove(contractClaus);
		contractClaus.setClaus(null);

		return contractClaus;
	}

}