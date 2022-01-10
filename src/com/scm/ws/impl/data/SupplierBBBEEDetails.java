
package com.scm.ws.impl.data;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CertificateTypeCode",
    "CertificateTypeName",
    "VerificationRegulatorCode",
    "VerificationRegulatorName",
    "CertificateNumber",
    "CertificateIssueDate",
    "CertificateExpiryDate",
    "StatusLevelOfContributorCode",
    "StatusLevelOfContributorName",
    "BlackOwnership",
    "BlackWomanOwnership",
    "IsAcceptUnderstandAffidavid",
    "CertificateSignedBy",
    "CertificateSignDate",
    "SectorCharterCode",
    "SectorCharterName",
    "SubSectorCharterCode",
    "SubSectorCharterName",
    "ValueAddingSupplier",
    "EmpoweringSupplier",
    "IRBARegisteredAuditorCode",
    "IRBARegisteredAuditorName",
    "SANASAccreditedAgencyCode",
    "SANASAccreditedAgencyName",
    "OwnershipScore",
    "ManagementControlScore",
    "EmploymentEquityScore",
    "SkillsDevelopmentScore",
    "PreferentialProcurementScore",
    "EnterpriseDevelopmentScore",
    "SocioEconomicDevelopmentScore",
    "EnterpriseSupplierDevelopmentScore",
    "LandOwnershipScore",
    "EmpowermentFinancingScore",
    "AccessFinancialServicesScore",
    "EconomicDevelopmentScore",
    "ForeignOwnershipScore",
    "TotalAnnualTurnoverCode",
    "TotalAnnualTurnoverName",
    "FinancialYearStartDate",
    "FinancialYearEndDate",
    "CreatedDate",
    "EditDate"
})
@Generated("jsonschema2pojo")
public class SupplierBBBEEDetails {

    @JsonProperty("CertificateTypeCode")
    private String certificateTypeCode;
    @JsonProperty("CertificateTypeName")
    private String certificateTypeName;
    @JsonProperty("VerificationRegulatorCode")
    private String verificationRegulatorCode;
    @JsonProperty("VerificationRegulatorName")
    private String verificationRegulatorName;
    @JsonProperty("CertificateNumber")
    private String certificateNumber;
    
    @JsonProperty("CertificateIssueDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp certificateIssueDate;
    
    @JsonProperty("CertificateExpiryDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp certificateExpiryDate;
    
    @JsonProperty("StatusLevelOfContributorCode")
    private String statusLevelOfContributorCode;
    @JsonProperty("StatusLevelOfContributorName")
    private String statusLevelOfContributorName;
    @JsonProperty("BlackOwnership")
    private Double blackOwnership;
    @JsonProperty("BlackWomanOwnership")
    private Double blackWomanOwnership;
    @JsonProperty("IsAcceptUnderstandAffidavid")
    private Boolean isAcceptUnderstandAffidavid;
    @JsonProperty("CertificateSignedBy")
    private String certificateSignedBy;
    
    @JsonProperty("CertificateSignDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp certificateSignDate;
    
    @JsonProperty("SectorCharterCode")
    private String sectorCharterCode;
    @JsonProperty("SectorCharterName")
    private String sectorCharterName;
    @JsonProperty("SubSectorCharterCode")
    private String subSectorCharterCode;
    @JsonProperty("SubSectorCharterName")
    private String subSectorCharterName;
    @JsonProperty("ValueAddingSupplier")
    private Boolean valueAddingSupplier;
    @JsonProperty("EmpoweringSupplier")
    private Boolean empoweringSupplier;
    @JsonProperty("IRBARegisteredAuditorCode")
    private String iRBARegisteredAuditorCode;
    @JsonProperty("IRBARegisteredAuditorName")
    private String iRBARegisteredAuditorName;
    @JsonProperty("SANASAccreditedAgencyCode")
    private String sANASAccreditedAgencyCode;
    @JsonProperty("SANASAccreditedAgencyName")
    private String sANASAccreditedAgencyName;
    @JsonProperty("OwnershipScore")
    private Double ownershipScore;
    @JsonProperty("ManagementControlScore")
    private Double managementControlScore;
    @JsonProperty("EmploymentEquityScore")
    private Double employmentEquityScore;
    @JsonProperty("SkillsDevelopmentScore")
    private Double skillsDevelopmentScore;
    @JsonProperty("PreferentialProcurementScore")
    private Double preferentialProcurementScore;
    @JsonProperty("EnterpriseDevelopmentScore")
    private Double enterpriseDevelopmentScore;
    @JsonProperty("SocioEconomicDevelopmentScore")
    private Double socioEconomicDevelopmentScore;
    @JsonProperty("EnterpriseSupplierDevelopmentScore")
    private Double enterpriseSupplierDevelopmentScore;
    @JsonProperty("LandOwnershipScore")
    private Double landOwnershipScore;
    @JsonProperty("EmpowermentFinancingScore")
    private Double empowermentFinancingScore;
    @JsonProperty("AccessFinancialServicesScore")
    private Double accessFinancialServicesScore;
    @JsonProperty("EconomicDevelopmentScore")
    private Double economicDevelopmentScore;
    @JsonProperty("ForeignOwnershipScore")
    private Double foreignOwnershipScore;
    @JsonProperty("TotalAnnualTurnoverCode")
    private String totalAnnualTurnoverCode;
    @JsonProperty("TotalAnnualTurnoverName")
    private String totalAnnualTurnoverName;
    
    @JsonProperty("FinancialYearStartDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp financialYearStartDate;
    
    @JsonProperty("FinancialYearEndDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp financialYearEndDate;
    
    @JsonProperty("CreatedDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp createdDate;
    
    @JsonProperty("EditDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp editDate;
    @JsonIgnore
    private Map<String, String> additionalProperties = new HashMap<String, String>();

    @JsonProperty("CertificateTypeCode")
    public String getCertificateTypeCode() {
        return certificateTypeCode;
    }

    @JsonProperty("CertificateTypeCode")
    public void setCertificateTypeCode(String certificateTypeCode) {
        this.certificateTypeCode = certificateTypeCode;
    }

    @JsonProperty("CertificateTypeName")
    public String getCertificateTypeName() {
        return certificateTypeName;
    }

    @JsonProperty("CertificateTypeName")
    public void setCertificateTypeName(String certificateTypeName) {
        this.certificateTypeName = certificateTypeName;
    }

    @JsonProperty("VerificationRegulatorCode")
    public String getVerificationRegulatorCode() {
        return verificationRegulatorCode;
    }

    @JsonProperty("VerificationRegulatorCode")
    public void setVerificationRegulatorCode(String verificationRegulatorCode) {
        this.verificationRegulatorCode = verificationRegulatorCode;
    }

    @JsonProperty("VerificationRegulatorName")
    public String getVerificationRegulatorName() {
        return verificationRegulatorName;
    }

    @JsonProperty("VerificationRegulatorName")
    public void setVerificationRegulatorName(String verificationRegulatorName) {
        this.verificationRegulatorName = verificationRegulatorName;
    }

    @JsonProperty("CertificateNumber")
    public String getCertificateNumber() {
        return certificateNumber;
    }

    @JsonProperty("CertificateNumber")
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    @JsonProperty("CertificateIssueDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getCertificateIssueDate() {
        return certificateIssueDate;
    }

    @JsonProperty("CertificateIssueDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setCertificateIssueDate(Timestamp certificateIssueDate) {
        this.certificateIssueDate = certificateIssueDate;
    }

    @JsonProperty("CertificateExpiryDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getCertificateExpiryDate() {
        return certificateExpiryDate;
    }

    @JsonProperty("CertificateExpiryDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setCertificateExpiryDate(Timestamp certificateExpiryDate) {
        this.certificateExpiryDate = certificateExpiryDate;
    }

    @JsonProperty("StatusLevelOfContributorCode")
    public String getStatusLevelOfContributorCode() {
        return statusLevelOfContributorCode;
    }

    @JsonProperty("StatusLevelOfContributorCode")
    public void setStatusLevelOfContributorCode(String statusLevelOfContributorCode) {
        this.statusLevelOfContributorCode = statusLevelOfContributorCode;
    }

    @JsonProperty("StatusLevelOfContributorName")
    public String getStatusLevelOfContributorName() {
        return statusLevelOfContributorName;
    }

    @JsonProperty("StatusLevelOfContributorName")
    public void setStatusLevelOfContributorName(String statusLevelOfContributorName) {
        this.statusLevelOfContributorName = statusLevelOfContributorName;
    }

    @JsonProperty("BlackOwnership")
    public Double getBlackOwnership() {
        return blackOwnership;
    }

    @JsonProperty("BlackOwnership")
    public void setBlackOwnership(Double blackOwnership) {
        this.blackOwnership = blackOwnership;
    }

    @JsonProperty("BlackWomanOwnership")
    public Double getBlackWomanOwnership() {
        return blackWomanOwnership;
    }

    @JsonProperty("BlackWomanOwnership")
    public void setBlackWomanOwnership(Double blackWomanOwnership) {
        this.blackWomanOwnership = blackWomanOwnership;
    }

    @JsonProperty("IsAcceptUnderstandAffidavid")
    public Boolean getIsAcceptUnderstandAffidavid() {
        return isAcceptUnderstandAffidavid;
    }

    @JsonProperty("IsAcceptUnderstandAffidavid")
    public void setIsAcceptUnderstandAffidavid(Boolean isAcceptUnderstandAffidavid) {
        this.isAcceptUnderstandAffidavid = isAcceptUnderstandAffidavid;
    }

    @JsonProperty("CertificateSignedBy")
    public String getCertificateSignedBy() {
        return certificateSignedBy;
    }

    @JsonProperty("CertificateSignedBy")
    public void setCertificateSignedBy(String certificateSignedBy) {
        this.certificateSignedBy = certificateSignedBy;
    }

    @JsonProperty("CertificateSignDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getCertificateSignDate() {
        return certificateSignDate;
    }

    @JsonProperty("CertificateSignDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setCertificateSignDate(Timestamp certificateSignDate) {
        this.certificateSignDate = certificateSignDate;
    }

    @JsonProperty("SectorCharterCode")
    public String getSectorCharterCode() {
        return sectorCharterCode;
    }

    @JsonProperty("SectorCharterCode")
    public void setSectorCharterCode(String sectorCharterCode) {
        this.sectorCharterCode = sectorCharterCode;
    }

    @JsonProperty("SectorCharterName")
    public String getSectorCharterName() {
        return sectorCharterName;
    }

    @JsonProperty("SectorCharterName")
    public void setSectorCharterName(String sectorCharterName) {
        this.sectorCharterName = sectorCharterName;
    }

    @JsonProperty("SubSectorCharterCode")
    public String getSubSectorCharterCode() {
        return subSectorCharterCode;
    }

    @JsonProperty("SubSectorCharterCode")
    public void setSubSectorCharterCode(String subSectorCharterCode) {
        this.subSectorCharterCode = subSectorCharterCode;
    }

    @JsonProperty("SubSectorCharterName")
    public String getSubSectorCharterName() {
        return subSectorCharterName;
    }

    @JsonProperty("SubSectorCharterName")
    public void setSubSectorCharterName(String subSectorCharterName) {
        this.subSectorCharterName = subSectorCharterName;
    }

    @JsonProperty("ValueAddingSupplier")
    public Boolean getValueAddingSupplier() {
        return valueAddingSupplier;
    }

    @JsonProperty("ValueAddingSupplier")
    public void setValueAddingSupplier(Boolean valueAddingSupplier) {
        this.valueAddingSupplier = valueAddingSupplier;
    }

    @JsonProperty("EmpoweringSupplier")
    public Boolean getEmpoweringSupplier() {
        return empoweringSupplier;
    }

    @JsonProperty("EmpoweringSupplier")
    public void setEmpoweringSupplier(Boolean empoweringSupplier) {
        this.empoweringSupplier = empoweringSupplier;
    }

    @JsonProperty("IRBARegisteredAuditorCode")
    public String getIRBARegisteredAuditorCode() {
        return iRBARegisteredAuditorCode;
    }

    @JsonProperty("IRBARegisteredAuditorCode")
    public void setIRBARegisteredAuditorCode(String iRBARegisteredAuditorCode) {
        this.iRBARegisteredAuditorCode = iRBARegisteredAuditorCode;
    }

    @JsonProperty("IRBARegisteredAuditorName")
    public String getIRBARegisteredAuditorName() {
        return iRBARegisteredAuditorName;
    }

    @JsonProperty("IRBARegisteredAuditorName")
    public void setIRBARegisteredAuditorName(String iRBARegisteredAuditorName) {
        this.iRBARegisteredAuditorName = iRBARegisteredAuditorName;
    }

    @JsonProperty("SANASAccreditedAgencyCode")
    public String getSANASAccreditedAgencyCode() {
        return sANASAccreditedAgencyCode;
    }

    @JsonProperty("SANASAccreditedAgencyCode")
    public void setSANASAccreditedAgencyCode(String sANASAccreditedAgencyCode) {
        this.sANASAccreditedAgencyCode = sANASAccreditedAgencyCode;
    }

    @JsonProperty("SANASAccreditedAgencyName")
    public String getSANASAccreditedAgencyName() {
        return sANASAccreditedAgencyName;
    }

    @JsonProperty("SANASAccreditedAgencyName")
    public void setSANASAccreditedAgencyName(String sANASAccreditedAgencyName) {
        this.sANASAccreditedAgencyName = sANASAccreditedAgencyName;
    }

    @JsonProperty("OwnershipScore")
    public Double getOwnershipScore() {
        return ownershipScore;
    }

    @JsonProperty("OwnershipScore")
    public void setOwnershipScore(Double ownershipScore) {
        this.ownershipScore = ownershipScore;
    }

    @JsonProperty("ManagementControlScore")
    public Double getManagementControlScore() {
        return managementControlScore;
    }

    @JsonProperty("ManagementControlScore")
    public void setManagementControlScore(Double managementControlScore) {
        this.managementControlScore = managementControlScore;
    }

    @JsonProperty("EmploymentEquityScore")
    public Double getEmploymentEquityScore() {
        return employmentEquityScore;
    }

    @JsonProperty("EmploymentEquityScore")
    public void setEmploymentEquityScore(Double employmentEquityScore) {
        this.employmentEquityScore = employmentEquityScore;
    }

    @JsonProperty("SkillsDevelopmentScore")
    public Double getSkillsDevelopmentScore() {
        return skillsDevelopmentScore;
    }

    @JsonProperty("SkillsDevelopmentScore")
    public void setSkillsDevelopmentScore(Double skillsDevelopmentScore) {
        this.skillsDevelopmentScore = skillsDevelopmentScore;
    }

    @JsonProperty("PreferentialProcurementScore")
    public Double getPreferentialProcurementScore() {
        return preferentialProcurementScore;
    }

    @JsonProperty("PreferentialProcurementScore")
    public void setPreferentialProcurementScore(Double preferentialProcurementScore) {
        this.preferentialProcurementScore = preferentialProcurementScore;
    }

    @JsonProperty("EnterpriseDevelopmentScore")
    public Double getEnterpriseDevelopmentScore() {
        return enterpriseDevelopmentScore;
    }

    @JsonProperty("EnterpriseDevelopmentScore")
    public void setEnterpriseDevelopmentScore(Double enterpriseDevelopmentScore) {
        this.enterpriseDevelopmentScore = enterpriseDevelopmentScore;
    }

    @JsonProperty("SocioEconomicDevelopmentScore")
    public Double getSocioEconomicDevelopmentScore() {
        return socioEconomicDevelopmentScore;
    }

    @JsonProperty("SocioEconomicDevelopmentScore")
    public void setSocioEconomicDevelopmentScore(Double socioEconomicDevelopmentScore) {
        this.socioEconomicDevelopmentScore = socioEconomicDevelopmentScore;
    }

    @JsonProperty("EnterpriseSupplierDevelopmentScore")
    public Double getEnterpriseSupplierDevelopmentScore() {
        return enterpriseSupplierDevelopmentScore;
    }

    @JsonProperty("EnterpriseSupplierDevelopmentScore")
    public void setEnterpriseSupplierDevelopmentScore(Double enterpriseSupplierDevelopmentScore) {
        this.enterpriseSupplierDevelopmentScore = enterpriseSupplierDevelopmentScore;
    }

    @JsonProperty("LandOwnershipScore")
    public Double getLandOwnershipScore() {
        return landOwnershipScore;
    }

    @JsonProperty("LandOwnershipScore")
    public void setLandOwnershipScore(Double landOwnershipScore) {
        this.landOwnershipScore = landOwnershipScore;
    }

    @JsonProperty("EmpowermentFinancingScore")
    public Double getEmpowermentFinancingScore() {
        return empowermentFinancingScore;
    }

    @JsonProperty("EmpowermentFinancingScore")
    public void setEmpowermentFinancingScore(Double empowermentFinancingScore) {
        this.empowermentFinancingScore = empowermentFinancingScore;
    }

    @JsonProperty("AccessFinancialServicesScore")
    public Double getAccessFinancialServicesScore() {
        return accessFinancialServicesScore;
    }

    @JsonProperty("AccessFinancialServicesScore")
    public void setAccessFinancialServicesScore(Double accessFinancialServicesScore) {
        this.accessFinancialServicesScore = accessFinancialServicesScore;
    }

    @JsonProperty("EconomicDevelopmentScore")
    public Double getEconomicDevelopmentScore() {
        return economicDevelopmentScore;
    }

    @JsonProperty("EconomicDevelopmentScore")
    public void setEconomicDevelopmentScore(Double economicDevelopmentScore) {
        this.economicDevelopmentScore = economicDevelopmentScore;
    }

    @JsonProperty("ForeignOwnershipScore")
    public Double getForeignOwnershipScore() {
        return foreignOwnershipScore;
    }

    @JsonProperty("ForeignOwnershipScore")
    public void setForeignOwnershipScore(Double foreignOwnershipScore) {
        this.foreignOwnershipScore = foreignOwnershipScore;
    }

    @JsonProperty("TotalAnnualTurnoverCode")
    public String getTotalAnnualTurnoverCode() {
        return totalAnnualTurnoverCode;
    }

    @JsonProperty("TotalAnnualTurnoverCode")
    public void setTotalAnnualTurnoverCode(String totalAnnualTurnoverCode) {
        this.totalAnnualTurnoverCode = totalAnnualTurnoverCode;
    }

    @JsonProperty("TotalAnnualTurnoverName")
    public String getTotalAnnualTurnoverName() {
        return totalAnnualTurnoverName;
    }

    @JsonProperty("TotalAnnualTurnoverName")
    public void setTotalAnnualTurnoverName(String totalAnnualTurnoverName) {
        this.totalAnnualTurnoverName = totalAnnualTurnoverName;
    }

    @JsonProperty("FinancialYearStartDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getFinancialYearStartDate() {
        return financialYearStartDate;
    }

    @JsonProperty("FinancialYearStartDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setFinancialYearStartDate(Timestamp financialYearStartDate) {
        this.financialYearStartDate = financialYearStartDate;
    }

    @JsonProperty("FinancialYearEndDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getFinancialYearEndDate() {
        return financialYearEndDate;
    }

    @JsonProperty("FinancialYearEndDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setFinancialYearEndDate(Timestamp financialYearEndDate) {
        this.financialYearEndDate = financialYearEndDate;
    }

    @JsonProperty("CreatedDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("CreatedDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("EditDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getEditDate() {
        return editDate;
    }

    @JsonProperty("EditDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setEditDate(Timestamp editDate) {
        this.editDate = editDate;
    }

    @JsonAnyGetter
    public Map<String, String> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, String value) {
        this.additionalProperties.put(name, value);
    }

}
