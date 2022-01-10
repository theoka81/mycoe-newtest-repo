package com.scm.dao.csdlocal.domain;

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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

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

	@Column(name="CertificateTypeId")
	private int certificateTypeId;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="EconomicDevelopmentScore")
	private String economicDevelopmentScore;

	@Column(name="EditDate")
	private Timestamp editDate;

	@Column(name="EmploymentEquityScore")
	private String employmentEquityScore;

	@Column(name="EmpoweringSupplier")
	private boolean empoweringSupplier;

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

	@Column(name="IrbaRegisteredAuditorId")
	private int irbaRegisteredAuditorId;

	@Column(name="IsAcceptUnderstandAffidavid")
	private boolean isAcceptUnderstandAffidavid;

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

	@Column(name="SanasAccreditedAgencyId")
	private int sanasAccreditedAgencyId;

	@Column(name="SectorCharterCode")
	private String sectorCharterCode;

	@Column(name="SectorCharterId")
	private int sectorCharterId;

	@Column(name="SkillsDevelopmentScore")
	private String skillsDevelopmentScore;

	@Column(name="SocioEconomicDevelopmentScore")
	private String socioEconomicDevelopmentScore;

	@Column(name="StatusLevelOfContributorCode")
	private String statusLevelOfContributorCode;

	@Column(name="StatusLevelOfContributorId")
	private int statusLevelOfContributorId;

	@Column(name="StatusTypeCode")
	private String statusTypeCode;

	@Column(name="StatusTypeId")
	private int statusTypeId;

	@Column(name="SubSectorCharterCode")
	private String subSectorCharterCode;

	@Column(name="SubSectorCharterId")
	private int subSectorCharterId;

	@Column(name="SupplierId")
	private long supplierId;

	@Column(name="SupplierNumber")
	private String supplierNumber;

	@Column(name="ValueAddingSupplier")
	private boolean valueAddingSupplier;

	@Column(name="VerificationRegulatorCode")
	private String verificationRegulatorCode;

	@Column(name="VerificationRegulatorId")
	private int verificationRegulatorId;

	@Column(name="XmlFileId")
	private int xmlFileId;

	public Bbbee() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
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

	public int getCertificateTypeId() {
		return this.certificateTypeId;
	}

	public void setCertificateTypeId(int certificateTypeId) {
		this.certificateTypeId = certificateTypeId;
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

	public boolean getEmpoweringSupplier() {
		return this.empoweringSupplier;
	}

	public void setEmpoweringSupplier(boolean empoweringSupplier) {
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

	public int getIrbaRegisteredAuditorId() {
		return this.irbaRegisteredAuditorId;
	}

	public void setIrbaRegisteredAuditorId(int irbaRegisteredAuditorId) {
		this.irbaRegisteredAuditorId = irbaRegisteredAuditorId;
	}

	public boolean getIsAcceptUnderstandAffidavid() {
		return this.isAcceptUnderstandAffidavid;
	}

	public void setIsAcceptUnderstandAffidavid(boolean isAcceptUnderstandAffidavid) {
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

	public int getSanasAccreditedAgencyId() {
		return this.sanasAccreditedAgencyId;
	}

	public void setSanasAccreditedAgencyId(int sanasAccreditedAgencyId) {
		this.sanasAccreditedAgencyId = sanasAccreditedAgencyId;
	}

	public String getSectorCharterCode() {
		return this.sectorCharterCode;
	}

	public void setSectorCharterCode(String sectorCharterCode) {
		this.sectorCharterCode = sectorCharterCode;
	}

	public int getSectorCharterId() {
		return this.sectorCharterId;
	}

	public void setSectorCharterId(int sectorCharterId) {
		this.sectorCharterId = sectorCharterId;
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

	public int getStatusLevelOfContributorId() {
		return this.statusLevelOfContributorId;
	}

	public void setStatusLevelOfContributorId(int statusLevelOfContributorId) {
		this.statusLevelOfContributorId = statusLevelOfContributorId;
	}

	public String getStatusTypeCode() {
		return this.statusTypeCode;
	}

	public void setStatusTypeCode(String statusTypeCode) {
		this.statusTypeCode = statusTypeCode;
	}

	public int getStatusTypeId() {
		return this.statusTypeId;
	}

	public void setStatusTypeId(int statusTypeId) {
		this.statusTypeId = statusTypeId;
	}

	public String getSubSectorCharterCode() {
		return this.subSectorCharterCode;
	}

	public void setSubSectorCharterCode(String subSectorCharterCode) {
		this.subSectorCharterCode = subSectorCharterCode;
	}

	public int getSubSectorCharterId() {
		return this.subSectorCharterId;
	}

	public void setSubSectorCharterId(int subSectorCharterId) {
		this.subSectorCharterId = subSectorCharterId;
	}

	public long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierNumber() {
		return this.supplierNumber;
	}

	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public boolean getValueAddingSupplier() {
		return this.valueAddingSupplier;
	}

	public void setValueAddingSupplier(boolean valueAddingSupplier) {
		this.valueAddingSupplier = valueAddingSupplier;
	}

	public String getVerificationRegulatorCode() {
		return this.verificationRegulatorCode;
	}

	public void setVerificationRegulatorCode(String verificationRegulatorCode) {
		this.verificationRegulatorCode = verificationRegulatorCode;
	}

	public int getVerificationRegulatorId() {
		return this.verificationRegulatorId;
	}

	public void setVerificationRegulatorId(int verificationRegulatorId) {
		this.verificationRegulatorId = verificationRegulatorId;
	}

	public int getXmlFileId() {
		return this.xmlFileId;
	}

	public void setXmlFileId(int xmlFileId) {
		this.xmlFileId = xmlFileId;
	}

}