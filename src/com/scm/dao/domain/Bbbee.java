package com.scm.dao.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Bbbees database table.
 * 
 */
@Entity
@Table(name="Bbbees")
@NamedQuery(name="Bbbee.findAll", query="SELECT b FROM Bbbee b")
public class Bbbee implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;

	@Column(name="AccessFinancialServicesScore")
	private String accessFinancialServicesScore;

	@Column(name="BlackOwnership")
	private String blackOwnership;

	@Column(name="BlackWomanOwnership")
	private String blackWomanOwnership;

	@Column(name="CertificateExpiryDate")
	private Timestamp certificateExpiryDate;

	@Column(name="CertificateIssueDate")
	private Timestamp certificateIssueDate;

	@Column(name="CertificateNumber")
	private String certificateNumber;

	@Column(name="CertificateSignDate")
	private Timestamp certificateSignDate;

	@Column(name="CertificateSignedBy")
	private String certificateSignedBy;

	@Column(name="CertificateTypeCode")
	private String certificateTypeCode;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="EconomicDevelopmentScore")
	private String economicDevelopmentScore;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="EmploymentEquityScore")
	private String employmentEquityScore;

	@Column(name="EmpoweringSupplier")
	private Boolean empoweringSupplier;

	@Column(name="EmpowermentFinancingScore")
	private String empowermentFinancingScore;

	@Column(name="EnterpriseDevelopmentScore")
	private String enterpriseDevelopmentScore;

	@Column(name="EnterpriseSupplierDevelopmentScore")
	private String enterpriseSupplierDevelopmentScore;

	@Column(name="Field1")
	private String field1;

	@Column(name="Field2")
	private String field2;

	@Column(name="Field3")
	private String field3;

	@Column(name="ForeignOwnershipScore")
	private String foreignOwnershipScore;

	@Column(name="IrbaRegisteredAuditorCode")
	private String irbaRegisteredAuditorCode;

	@Column(name="IsAcceptUnderstandAffidavid")
	private Boolean isAcceptUnderstandAffidavid;

	@Column(name="LandOwnershipScore")
	private String landOwnershipScore;

	@Column(name="LastVerificationDate")
	private Timestamp lastVerificationDate;

	@Column(name="ManagementControlScore")
	private String managementControlScore;

	@Column(name="OwnershipScore")
	private String ownershipScore;

	@Column(name="PreferentialProcurementScore")
	private String preferentialProcurementScore;

	@Column(name="ProcessedTimeStamp")
	private Timestamp processedTimeStamp;

	@Column(name="SanasAccreditedAgencyCode")
	private String sanasAccreditedAgencyCode;

	@Column(name="SectorCharterCode")
	private String sectorCharterCode;

	@Column(name="SkillsDevelopmentScore")
	private String skillsDevelopmentScore;

	@Column(name="SocioEconomicDevelopmentScore")
	private String socioEconomicDevelopmentScore;

	@Column(name="StatusLevelOfContributorCode")
	private String statusLevelOfContributorCode;

	@Column(name="StatusTypeCode")
	private String statusTypeCode;

	@Column(name="StatusTypeId")
	private Integer statusTypeId;

	@Column(name="SubSectorCharterCode")
	private String subSectorCharterCode;

	@Column(name="SupplierId")
	private Long supplierId;

	@Column(name="SupplierNumber", nullable=false)
	private String supplierNumber;

	@Column(name="ValueAddingSupplier")
	private Boolean valueAddingSupplier;

	@Column(name="VerificationRegulatorCode")
	private String verificationRegulatorCode;

	@Column(name="XmlFileId")
	private Integer xmlFileId;

	//bi-directional many-to-one association to BbbeeCertificateType
	@ManyToOne
	@JoinColumn(name="CertificateTypeId")
	private BbbeeCertificateType bbbeeCertificateType;

	//bi-directional many-to-one association to BbbeeIrbaRegisteredAuditor
	@ManyToOne
	@JoinColumn(name="IrbaRegisteredAuditorId")
	private BbbeeIrbaRegisteredAuditor bbbeeIrbaRegisteredAuditor;

	//bi-directional many-to-one association to BbbeeSectorCharter
	@ManyToOne
	@JoinColumn(name="SectorCharterId")
	private BbbeeSectorCharter bbbeeSectorCharter1;

	//bi-directional many-to-one association to BbbeeSectorCharter
	@ManyToOne
	@JoinColumn(name="SubSectorCharterId")
	private BbbeeSectorCharter bbbeeSectorCharter2;

	//bi-directional many-to-one association to BbbeeStatusLevelOfContributor
	@ManyToOne
	@JoinColumn(name="StatusLevelOfContributorId")
	private BbbeeStatusLevelOfContributor bbbeeStatusLevelOfContributor;

	//bi-directional many-to-one association to BbbeeVerificationRegulator
	@ManyToOne
	@JoinColumn(name="VerificationRegulatorId")
	private BbbeeVerificationRegulator bbbeeVerificationRegulator;

	//bi-directional many-to-one association to SanasBbbeeVerificationAgency
	@ManyToOne
	@JoinColumn(name="SanasAccreditedAgencyId")
	private SanasBbbeeVerificationAgency sanasBbbeeVerificationAgency;

	public Bbbee() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccessFinancialServicesScore() {
		return this.accessFinancialServicesScore;
	}

	public void setAccessFinancialServicesScore(String accessFinancialServicesScore) {
		this.accessFinancialServicesScore = accessFinancialServicesScore;
	}

	public String getBlackOwnership() {
		return this.blackOwnership;
	}

	public void setBlackOwnership(String blackOwnership) {
		this.blackOwnership = blackOwnership;
	}

	public String getBlackWomanOwnership() {
		return this.blackWomanOwnership;
	}

	public void setBlackWomanOwnership(String blackWomanOwnership) {
		this.blackWomanOwnership = blackWomanOwnership;
	}

	public Timestamp getCertificateExpiryDate() {
		return this.certificateExpiryDate;
	}

	public void setCertificateExpiryDate(Timestamp certificateExpiryDate) {
		this.certificateExpiryDate = certificateExpiryDate;
	}

	public Timestamp getCertificateIssueDate() {
		return this.certificateIssueDate;
	}

	public void setCertificateIssueDate(Timestamp certificateIssueDate) {
		this.certificateIssueDate = certificateIssueDate;
	}

	public String getCertificateNumber() {
		return this.certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public Timestamp getCertificateSignDate() {
		return this.certificateSignDate;
	}

	public void setCertificateSignDate(Timestamp certificateSignDate) {
		this.certificateSignDate = certificateSignDate;
	}

	public String getCertificateSignedBy() {
		return this.certificateSignedBy;
	}

	public void setCertificateSignedBy(String certificateSignedBy) {
		this.certificateSignedBy = certificateSignedBy;
	}

	public String getCertificateTypeCode() {
		return this.certificateTypeCode;
	}

	public void setCertificateTypeCode(String certificateTypeCode) {
		this.certificateTypeCode = certificateTypeCode;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getEconomicDevelopmentScore() {
		return this.economicDevelopmentScore;
	}

	public void setEconomicDevelopmentScore(String economicDevelopmentScore) {
		this.economicDevelopmentScore = economicDevelopmentScore;
	}

	public Timestamp getEditDate() {
		return this.editDate;
	}

	public void setEditDate(Timestamp editDate) {
		this.editDate = editDate;
	}

	public String getEmploymentEquityScore() {
		return this.employmentEquityScore;
	}

	public void setEmploymentEquityScore(String employmentEquityScore) {
		this.employmentEquityScore = employmentEquityScore;
	}

	public Boolean getEmpoweringSupplier() {
		return this.empoweringSupplier;
	}

	public void setEmpoweringSupplier(Boolean empoweringSupplier) {
		this.empoweringSupplier = empoweringSupplier;
	}

	public String getEmpowermentFinancingScore() {
		return this.empowermentFinancingScore;
	}

	public void setEmpowermentFinancingScore(String empowermentFinancingScore) {
		this.empowermentFinancingScore = empowermentFinancingScore;
	}

	public String getEnterpriseDevelopmentScore() {
		return this.enterpriseDevelopmentScore;
	}

	public void setEnterpriseDevelopmentScore(String enterpriseDevelopmentScore) {
		this.enterpriseDevelopmentScore = enterpriseDevelopmentScore;
	}

	public String getEnterpriseSupplierDevelopmentScore() {
		return this.enterpriseSupplierDevelopmentScore;
	}

	public void setEnterpriseSupplierDevelopmentScore(String enterpriseSupplierDevelopmentScore) {
		this.enterpriseSupplierDevelopmentScore = enterpriseSupplierDevelopmentScore;
	}

	public String getField1() {
		return this.field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return this.field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return this.field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getForeignOwnershipScore() {
		return this.foreignOwnershipScore;
	}

	public void setForeignOwnershipScore(String foreignOwnershipScore) {
		this.foreignOwnershipScore = foreignOwnershipScore;
	}

	public String getIrbaRegisteredAuditorCode() {
		return this.irbaRegisteredAuditorCode;
	}

	public void setIrbaRegisteredAuditorCode(String irbaRegisteredAuditorCode) {
		this.irbaRegisteredAuditorCode = irbaRegisteredAuditorCode;
	}

	public Boolean getIsAcceptUnderstandAffidavid() {
		return this.isAcceptUnderstandAffidavid;
	}

	public void setIsAcceptUnderstandAffidavid(Boolean isAcceptUnderstandAffidavid) {
		this.isAcceptUnderstandAffidavid = isAcceptUnderstandAffidavid;
	}

	public String getLandOwnershipScore() {
		return this.landOwnershipScore;
	}

	public void setLandOwnershipScore(String landOwnershipScore) {
		this.landOwnershipScore = landOwnershipScore;
	}

	public Timestamp getLastVerificationDate() {
		return this.lastVerificationDate;
	}

	public void setLastVerificationDate(Timestamp lastVerificationDate) {
		this.lastVerificationDate = lastVerificationDate;
	}

	public String getManagementControlScore() {
		return this.managementControlScore;
	}

	public void setManagementControlScore(String managementControlScore) {
		this.managementControlScore = managementControlScore;
	}

	public String getOwnershipScore() {
		return this.ownershipScore;
	}

	public void setOwnershipScore(String ownershipScore) {
		this.ownershipScore = ownershipScore;
	}

	public String getPreferentialProcurementScore() {
		return this.preferentialProcurementScore;
	}

	public void setPreferentialProcurementScore(String preferentialProcurementScore) {
		this.preferentialProcurementScore = preferentialProcurementScore;
	}

	public Timestamp getProcessedTimeStamp() {
		return this.processedTimeStamp;
	}

	public void setProcessedTimeStamp(Timestamp processedTimeStamp) {
		this.processedTimeStamp = processedTimeStamp;
	}

	public String getSanasAccreditedAgencyCode() {
		return this.sanasAccreditedAgencyCode;
	}

	public void setSanasAccreditedAgencyCode(String sanasAccreditedAgencyCode) {
		this.sanasAccreditedAgencyCode = sanasAccreditedAgencyCode;
	}

	public String getSectorCharterCode() {
		return this.sectorCharterCode;
	}

	public void setSectorCharterCode(String sectorCharterCode) {
		this.sectorCharterCode = sectorCharterCode;
	}

	public String getSkillsDevelopmentScore() {
		return this.skillsDevelopmentScore;
	}

	public void setSkillsDevelopmentScore(String skillsDevelopmentScore) {
		this.skillsDevelopmentScore = skillsDevelopmentScore;
	}

	public String getSocioEconomicDevelopmentScore() {
		return this.socioEconomicDevelopmentScore;
	}

	public void setSocioEconomicDevelopmentScore(String socioEconomicDevelopmentScore) {
		this.socioEconomicDevelopmentScore = socioEconomicDevelopmentScore;
	}

	public String getStatusLevelOfContributorCode() {
		return this.statusLevelOfContributorCode;
	}

	public void setStatusLevelOfContributorCode(String statusLevelOfContributorCode) {
		this.statusLevelOfContributorCode = statusLevelOfContributorCode;
	}

	public String getStatusTypeCode() {
		return this.statusTypeCode;
	}

	public void setStatusTypeCode(String statusTypeCode) {
		this.statusTypeCode = statusTypeCode;
	}

	public Integer getStatusTypeId() {
		return this.statusTypeId;
	}

	public void setStatusTypeId(Integer statusTypeId) {
		this.statusTypeId = statusTypeId;
	}

	public String getSubSectorCharterCode() {
		return this.subSectorCharterCode;
	}

	public void setSubSectorCharterCode(String subSectorCharterCode) {
		this.subSectorCharterCode = subSectorCharterCode;
	}

	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierNumber() {
		return this.supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public Boolean getValueAddingSupplier() {
		return this.valueAddingSupplier;
	}

	public void setValueAddingSupplier(Boolean valueAddingSupplier) {
		this.valueAddingSupplier = valueAddingSupplier;
	}

	public String getVerificationRegulatorCode() {
		return this.verificationRegulatorCode;
	}

	public void setVerificationRegulatorCode(String verificationRegulatorCode) {
		this.verificationRegulatorCode = verificationRegulatorCode;
	}

	public Integer getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(Integer xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

	public BbbeeCertificateType getBbbeeCertificateType() {
		return this.bbbeeCertificateType;
	}

	public void setBbbeeCertificateType(BbbeeCertificateType bbbeeCertificateType) {
		this.bbbeeCertificateType = bbbeeCertificateType;
	}

	public BbbeeIrbaRegisteredAuditor getBbbeeIrbaRegisteredAuditor() {
		return this.bbbeeIrbaRegisteredAuditor;
	}

	public void setBbbeeIrbaRegisteredAuditor(BbbeeIrbaRegisteredAuditor bbbeeIrbaRegisteredAuditor) {
		this.bbbeeIrbaRegisteredAuditor = bbbeeIrbaRegisteredAuditor;
	}

	public BbbeeSectorCharter getBbbeeSectorCharter1() {
		return this.bbbeeSectorCharter1;
	}

	public void setBbbeeSectorCharter1(BbbeeSectorCharter bbbeeSectorCharter1) {
		this.bbbeeSectorCharter1 = bbbeeSectorCharter1;
	}

	public BbbeeSectorCharter getBbbeeSectorCharter2() {
		return this.bbbeeSectorCharter2;
	}

	public void setBbbeeSectorCharter2(BbbeeSectorCharter bbbeeSectorCharter2) {
		this.bbbeeSectorCharter2 = bbbeeSectorCharter2;
	}

	public BbbeeStatusLevelOfContributor getBbbeeStatusLevelOfContributor() {
		return this.bbbeeStatusLevelOfContributor;
	}

	public void setBbbeeStatusLevelOfContributor(BbbeeStatusLevelOfContributor bbbeeStatusLevelOfContributor) {
		this.bbbeeStatusLevelOfContributor = bbbeeStatusLevelOfContributor;
	}

	public BbbeeVerificationRegulator getBbbeeVerificationRegulator() {
		return this.bbbeeVerificationRegulator;
	}

	public void setBbbeeVerificationRegulator(BbbeeVerificationRegulator bbbeeVerificationRegulator) {
		this.bbbeeVerificationRegulator = bbbeeVerificationRegulator;
	}

	public SanasBbbeeVerificationAgency getSanasBbbeeVerificationAgency() {
		return this.sanasBbbeeVerificationAgency;
	}

	public void setSanasBbbeeVerificationAgency(SanasBbbeeVerificationAgency sanasBbbeeVerificationAgency) {
		this.sanasBbbeeVerificationAgency = sanasBbbeeVerificationAgency;
	}

}