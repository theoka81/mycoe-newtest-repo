package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the ContractMasterWorks database table.
 * 
 */
@Entity
@Table(name="ContractMasterWorks")
@NamedQuery(name="ContractMasterWork.findAll", query="SELECT c FROM ContractMasterWork c")
public class ContractMasterWork implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="ApprovalTeam")
	private String approvalTeam;

	@Column(name="AssignedTeam")
	private String assignedTeam;

	@Column(name="CancelDate")
	private Timestamp cancelDate;

	@Column(name="ClauseId")
	private Long clauseId;

	@Column(name="ClauseIdType")
	private String clauseIdType;

	@Column(name="ClauseOwner")
	private String clauseOwner;

	@Column(name="ContractEndDate")
	private Timestamp contractEndDate;

	@Column(name="ContractHeaderType")
	private String contractHeaderType;

	@Column(name="ContractNo")
	private Long contractNo;

	@Column(name="ContractStartDate")
	private Timestamp contractStartDate;

	@Column(name="ContractTitle")
	private String contractTitle;

	@Column(name="ContractType")
	private String contractType;

	@Column(name="CreatedDateTime")
	private Timestamp createdDateTime;

	@Column(name="DepartmentInstructionNumber")
	private String departmentInstructionNumber;

	@Column(name="DocumentManagementId")
	private Long documentManagementId;

	@Column(name="DocumentManagementPackType")
	private String documentManagementPackType;

	@Column(name="ElectronicSignatureGroupIdType")
	private String electronicSignatureGroupIdType;

	@Column(name="ElectronicSignatureId")
	private Long electronicSignatureId;

	@Column(name="Escalation")
	private String escalation;

	@Column(name="EscalationDate")
	private Timestamp escalationDate;

	private Timestamp GLDate;

	@Column(name="IsActive", nullable=false)
	private Boolean isActive;

	@Column(name="IsDeleted", nullable=false)
	private Boolean isDeleted;

	@Column(name="IsLocked")
	private Boolean isLocked;

	private String KPINo;

	@Column(name="LocationId")
	private Long locationId;

	@Column(name="ModifiedDateTime")
	private Timestamp modifiedDateTime;

	@Column(name="NetContractAmount")
	private String netContractAmount;

	@Column(name="Origin")
	private String origin;

	@Column(name="OriginalId", nullable=false)
	private Long originalId;

	@Column(name="ParentNo")
	private Long parentNo;

	@Column(name="ParentType")
	private String parentType;

	@Column(name="PrintTemplate")
	private String printTemplate;

	@Column(name="ProcurementPlan")
	private String procurementPlan;

	@Column(name="ProcurementType")
	private String procurementType;

	@Column(name="ProjectNo")
	private Long projectNo;

	@Column(name="RelatedTo")
	private String relatedTo;

	@Column(name="RenewalAdvanceNotifyDays")
	private Long renewalAdvanceNotifyDays;

	@Column(name="RenewalNotificationDate")
	private String renewalNotificationDate;

	@Column(name="RequestedDate")
	private Timestamp requestedDate;

	@Column(name="RequestingUnit")
	private String requestingUnit;

	@Column(name="Status")
	private String status;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="TenderNumber")
	private String tenderNumber;

	@Column(name="TotalContractAmount")
	private String totalContractAmount;

	@Column(name="TransactionDate")
	private Timestamp transactionDate;

	@Column(name="TransactionOriginator")
	private String transactionOriginator;

	@Column(name="TransmissionDate")
	private Timestamp transmissionDate;

	@Column(name="Unit")
	private String unit;

	//bi-directional many-to-one association to ContractDetail
	@OneToMany(mappedBy="contractMasterWork")
	private Set<ContractDetail> contractDetails;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="TransactionOriginatorId")
	private SystemUser systemUser1;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="CreatedBySystemUserId")
	private SystemUser systemUser2;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="ModifiedBySystemUserId")
	private SystemUser systemUser3;

	//bi-directional many-to-one association to SystemUser
	@ManyToOne
	@JoinColumn(name="RequesterId")
	private SystemUser systemUser4;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ContractCategoryId")
	private UserCode userCode1;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ContractHeaderTypeId")
	private UserCode userCode2;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ContractTypeId", nullable=false)
	private UserCode userCode3;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="OrderTypeId")
	private UserCode userCode4;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="StatusId", nullable=false)
	private UserCode userCode5;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="UnitId")
	private UserCode userCode6;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="ApprovalTeamId")
	private UserCode userCode7;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="AssignedTeamId")
	private UserCode userCode8;

	//bi-directional many-to-one association to UserCode
	@ManyToOne
	@JoinColumn(name="RequestingUnitId")
	private UserCode userCode9;

	public ContractMasterWork() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApprovalTeam() {
		return this.approvalTeam;
	}

	public void setApprovalTeam(String approvalTeam) {
		this.approvalTeam = approvalTeam;
	}

	public String getAssignedTeam() {
		return this.assignedTeam;
	}

	public void setAssignedTeam(String assignedTeam) {
		this.assignedTeam = assignedTeam;
	}

	public Timestamp getCancelDate() {
		return this.cancelDate;
	}

	public void setCancelDate(Timestamp cancelDate) {
		this.cancelDate = cancelDate;
	}

	public Long getClauseId() {
		return this.clauseId;
	}

	public void setClauseId(Long clauseId) {
		this.clauseId = clauseId;
	}

	public String getClauseIdType() {
		return this.clauseIdType;
	}

	public void setClauseIdType(String clauseIdType) {
		this.clauseIdType = clauseIdType;
	}

	public String getClauseOwner() {
		return this.clauseOwner;
	}

	public void setClauseOwner(String clauseOwner) {
		this.clauseOwner = clauseOwner;
	}

	public Timestamp getContractEndDate() {
		return this.contractEndDate;
	}

	public void setContractEndDate(Timestamp contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public String getContractHeaderType() {
		return this.contractHeaderType;
	}

	public void setContractHeaderType(String contractHeaderType) {
		this.contractHeaderType = contractHeaderType;
	}

	public Long getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(Long contractNo) {
		this.contractNo = contractNo;
	}

	public Timestamp getContractStartDate() {
		return this.contractStartDate;
	}

	public void setContractStartDate(Timestamp contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public String getContractTitle() {
		return this.contractTitle;
	}

	public void setContractTitle(String contractTitle) {
		this.contractTitle = contractTitle;
	}

	public String getContractType() {
		return this.contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Timestamp getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getDepartmentInstructionNumber() {
		return this.departmentInstructionNumber;
	}

	public void setDepartmentInstructionNumber(String departmentInstructionNumber) {
		this.departmentInstructionNumber = departmentInstructionNumber;
	}

	public Long getDocumentManagementId() {
		return this.documentManagementId;
	}

	public void setDocumentManagementId(Long documentManagementId) {
		this.documentManagementId = documentManagementId;
	}

	public String getDocumentManagementPackType() {
		return this.documentManagementPackType;
	}

	public void setDocumentManagementPackType(String documentManagementPackType) {
		this.documentManagementPackType = documentManagementPackType;
	}

	public String getElectronicSignatureGroupIdType() {
		return this.electronicSignatureGroupIdType;
	}

	public void setElectronicSignatureGroupIdType(String electronicSignatureGroupIdType) {
		this.electronicSignatureGroupIdType = electronicSignatureGroupIdType;
	}

	public Long getElectronicSignatureId() {
		return this.electronicSignatureId;
	}

	public void setElectronicSignatureId(Long electronicSignatureId) {
		this.electronicSignatureId = electronicSignatureId;
	}

	public String getEscalation() {
		return this.escalation;
	}

	public void setEscalation(String escalation) {
		this.escalation = escalation;
	}

	public Timestamp getEscalationDate() {
		return this.escalationDate;
	}

	public void setEscalationDate(Timestamp escalationDate) {
		this.escalationDate = escalationDate;
	}

	public Timestamp getGLDate() {
		return this.GLDate;
	}

	public void setGLDate(Timestamp GLDate) {
		this.GLDate = GLDate;
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

	public String getKPINo() {
		return this.KPINo;
	}

	public void setKPINo(String KPINo) {
		this.KPINo = KPINo;
	}

	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Timestamp getModifiedDateTime() {
		return this.modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getNetContractAmount() {
		return this.netContractAmount;
	}

	public void setNetContractAmount(String netContractAmount) {
		this.netContractAmount = netContractAmount;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Long getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(Long originalId) {
		this.originalId = originalId;
	}

	public Long getParentNo() {
		return this.parentNo;
	}

	public void setParentNo(Long parentNo) {
		this.parentNo = parentNo;
	}

	public String getParentType() {
		return this.parentType;
	}

	public void setParentType(String parentType) {
		this.parentType = parentType;
	}

	public String getPrintTemplate() {
		return this.printTemplate;
	}

	public void setPrintTemplate(String printTemplate) {
		this.printTemplate = printTemplate;
	}

	public String getProcurementPlan() {
		return this.procurementPlan;
	}

	public void setProcurementPlan(String procurementPlan) {
		this.procurementPlan = procurementPlan;
	}

	public String getProcurementType() {
		return this.procurementType;
	}

	public void setProcurementType(String procurementType) {
		this.procurementType = procurementType;
	}

	public Long getProjectNo() {
		return this.projectNo;
	}

	public void setProjectNo(Long projectNo) {
		this.projectNo = projectNo;
	}

	public String getRelatedTo() {
		return this.relatedTo;
	}

	public void setRelatedTo(String relatedTo) {
		this.relatedTo = relatedTo;
	}

	public Long getRenewalAdvanceNotifyDays() {
		return this.renewalAdvanceNotifyDays;
	}

	public void setRenewalAdvanceNotifyDays(Long renewalAdvanceNotifyDays) {
		this.renewalAdvanceNotifyDays = renewalAdvanceNotifyDays;
	}

	public String getRenewalNotificationDate() {
		return this.renewalNotificationDate;
	}

	public void setRenewalNotificationDate(String renewalNotificationDate) {
		this.renewalNotificationDate = renewalNotificationDate;
	}

	public Timestamp getRequestedDate() {
		return this.requestedDate;
	}

	public void setRequestedDate(Timestamp requestedDate) {
		this.requestedDate = requestedDate;
	}

	public String getRequestingUnit() {
		return this.requestingUnit;
	}

	public void setRequestingUnit(String requestingUnit) {
		this.requestingUnit = requestingUnit;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getTenderNumber() {
		return this.tenderNumber;
	}

	public void setTenderNumber(String tenderNumber) {
		this.tenderNumber = tenderNumber;
	}

	public String getTotalContractAmount() {
		return this.totalContractAmount;
	}

	public void setTotalContractAmount(String totalContractAmount) {
		this.totalContractAmount = totalContractAmount;
	}

	public Timestamp getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionOriginator() {
		return this.transactionOriginator;
	}

	public void setTransactionOriginator(String transactionOriginator) {
		this.transactionOriginator = transactionOriginator;
	}

	public Timestamp getTransmissionDate() {
		return this.transmissionDate;
	}

	public void setTransmissionDate(Timestamp transmissionDate) {
		this.transmissionDate = transmissionDate;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Set<ContractDetail> getContractDetails() {
		return this.contractDetails;
	}

	public void setContractDetails(Set<ContractDetail> contractDetails) {
		this.contractDetails = contractDetails;
	}

	public ContractDetail addContractDetail(ContractDetail contractDetail) {
		getContractDetails().add(contractDetail);
		contractDetail.setContractMasterWork(this);

		return contractDetail;
	}

	public ContractDetail removeContractDetail(ContractDetail contractDetail) {
		getContractDetails().remove(contractDetail);
		contractDetail.setContractMasterWork(null);

		return contractDetail;
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

	public SystemUser getSystemUser3() {
		return this.systemUser3;
	}

	public void setSystemUser3(SystemUser systemUser3) {
		this.systemUser3 = systemUser3;
	}

	public SystemUser getSystemUser4() {
		return this.systemUser4;
	}

	public void setSystemUser4(SystemUser systemUser4) {
		this.systemUser4 = systemUser4;
	}

	public UserCode getUserCode1() {
		return this.userCode1;
	}

	public void setUserCode1(UserCode userCode1) {
		this.userCode1 = userCode1;
	}

	public UserCode getUserCode2() {
		return this.userCode2;
	}

	public void setUserCode2(UserCode userCode2) {
		this.userCode2 = userCode2;
	}

	public UserCode getUserCode3() {
		return this.userCode3;
	}

	public void setUserCode3(UserCode userCode3) {
		this.userCode3 = userCode3;
	}

	public UserCode getUserCode4() {
		return this.userCode4;
	}

	public void setUserCode4(UserCode userCode4) {
		this.userCode4 = userCode4;
	}

	public UserCode getUserCode5() {
		return this.userCode5;
	}

	public void setUserCode5(UserCode userCode5) {
		this.userCode5 = userCode5;
	}

	public UserCode getUserCode6() {
		return this.userCode6;
	}

	public void setUserCode6(UserCode userCode6) {
		this.userCode6 = userCode6;
	}

	public UserCode getUserCode7() {
		return this.userCode7;
	}

	public void setUserCode7(UserCode userCode7) {
		this.userCode7 = userCode7;
	}

	public UserCode getUserCode8() {
		return this.userCode8;
	}

	public void setUserCode8(UserCode userCode8) {
		this.userCode8 = userCode8;
	}

	public UserCode getUserCode9() {
		return this.userCode9;
	}

	public void setUserCode9(UserCode userCode9) {
		this.userCode9 = userCode9;
	}

}