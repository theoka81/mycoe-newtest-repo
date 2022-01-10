
package com.scm.ws.impl.data;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
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
    "UniqueRegistrationReferenceNumber",
    "SupplierNumber",
    "SupplierInactiveReason",
    "SupplierInactiveDate",
    "IsAssociated",
    "IsActive",
    "SupplierTypeCode",
    "SupplierTypeName",
    "SupplierSubClassificationID",
    "SupplierSubTypeCode",
    "SupplierSubTypeName",
    "GovernmentTypeID",
    "GovernmentTypeCode",
    "GovernmentTypeName",
    "IDTypeID",
    "IDTypeCode",
    "IDTypeName",
    "CountryOfOriginCode",
    "CountryOfOriginName",
    "BusinessStatusCode",
    "BusinessStatusName",
    "BusinessStatusLastVerificationDate",
    "IndustryClassificationCode",
    "IndustryClassificationName",
    "LegalName",
    "TradingName",
    "SAIDNumber",
    "ForeignIDNumber",
    "ForeignPassportNumber",
    "WorkPermitNumber",
    "SACompanyNumber",
    "ForeignCompanyRegistrationNumber",
    "SATrustRegistrationNumber",
    "ForeignTrustRegistrationNumber",
    "RegistrationDate",
    "SupplierFlags",
    "HaveBankAccount",
    "CreatedDate",
    "EditDate",
    "SupplierClassificationID",
    "InternationalSecurityIDNumber",
    "NonProfitOrganisation",
    "OoSIDNumber"
})
@Generated("jsonschema2pojo")
public class SupplierIdentificationDetails {

    @JsonProperty("UniqueRegistrationReferenceNumber")
    private String uniqueRegistrationReferenceNumber;
    @JsonProperty("SupplierNumber")
    private String supplierNumber;
    @JsonProperty("SupplierInactiveReason")
    private String supplierInactiveReason;
    
    @JsonProperty("SupplierInactiveDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp supplierInactiveDate;
    
    @JsonProperty("IsAssociated")
    private Boolean isAssociated;
    @JsonProperty("IsActive")
    private Boolean isActive;
    @JsonProperty("SupplierTypeCode")
    private String supplierTypeCode;
    @JsonProperty("SupplierTypeName")
    private String supplierTypeName;
    @JsonProperty("SupplierSubClassificationID")
    private String supplierSubClassificationID;
    @JsonProperty("SupplierSubTypeCode")
    private String supplierSubTypeCode;
    @JsonProperty("SupplierSubTypeName")
    private String supplierSubTypeName;
    @JsonProperty("GovernmentTypeID")
    private String governmentTypeID;
    @JsonProperty("GovernmentTypeCode")
    private String governmentTypeCode;
    @JsonProperty("GovernmentTypeName")
    private String governmentTypeName;
    @JsonProperty("IDTypeID")
    private String iDTypeID;
    @JsonProperty("IDTypeCode")
    private String iDTypeCode;
    @JsonProperty("IDTypeName")
    private String iDTypeName;
    @JsonProperty("CountryOfOriginCode")
    private String countryOfOriginCode;
    @JsonProperty("CountryOfOriginName")
    private String countryOfOriginName;
    @JsonProperty("BusinessStatusCode")
    private String businessStatusCode;
    @JsonProperty("BusinessStatusName")
    private String businessStatusName;

    @JsonProperty("BusinessStatusLastVerificationDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp businessStatusLastVerificationDate;
    
    @JsonProperty("IndustryClassificationCode")
    private String industryClassificationCode;
    @JsonProperty("IndustryClassificationName")
    private String industryClassificationName;
    @JsonProperty("LegalName")
    private String legalName;
    @JsonProperty("TradingName")
    private String tradingName;
    @JsonProperty("SAIDNumber")
    private String sAIDNumber;
    @JsonProperty("ForeignIDNumber")
    private String foreignIDNumber;
    @JsonProperty("ForeignPassportNumber")
    private String foreignPassportNumber;
    @JsonProperty("WorkPermitNumber")
    private String workPermitNumber;
    @JsonProperty("SACompanyNumber")
    private String sACompanyNumber;
    @JsonProperty("ForeignCompanyRegistrationNumber")
    private String foreignCompanyRegistrationNumber;
    @JsonProperty("SATrustRegistrationNumber")
    private String sATrustRegistrationNumber;
    @JsonProperty("ForeignTrustRegistrationNumber")
    private String foreignTrustRegistrationNumber;

    @JsonProperty("RegistrationDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp registrationDate;
    
    @JsonProperty("SupplierFlags")
    private List<SupplierFlag> supplierFlags = null;
    @JsonProperty("HaveBankAccount")
    private Boolean haveBankAccount;

    @JsonProperty("CreatedDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp createdDate;
    
    @JsonProperty("EditDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp editDate;
    
    @JsonProperty("SupplierClassificationID")
    private String supplierClassificationID;
    @JsonProperty("InternationalSecurityIDNumber")
    private String internationalSecurityIDNumber;
    @JsonProperty("NonProfitOrganisation")
    private String nonProfitOrganisation;
    @JsonProperty("OoSIDNumber")
    private String ooSIDNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("UniqueRegistrationReferenceNumber")
    public String getUniqueRegistrationReferenceNumber() {
        return uniqueRegistrationReferenceNumber;
    }

    @JsonProperty("UniqueRegistrationReferenceNumber")
    public void setUniqueRegistrationReferenceNumber(String uniqueRegistrationReferenceNumber) {
        this.uniqueRegistrationReferenceNumber = uniqueRegistrationReferenceNumber;
    }

    @JsonProperty("SupplierNumber")
    public String getSupplierNumber() {
        return supplierNumber;
    }

    @JsonProperty("SupplierNumber")
    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    @JsonProperty("SupplierInactiveReason")
    public String getSupplierInactiveReason() {
        return supplierInactiveReason;
    }

    @JsonProperty("SupplierInactiveReason")
    public void setSupplierInactiveReason(String supplierInactiveReason) {
        this.supplierInactiveReason = supplierInactiveReason;
    }

    @JsonProperty("SupplierInactiveDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getSupplierInactiveDate() {
        return supplierInactiveDate;
    }

    @JsonProperty("SupplierInactiveDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setSupplierInactiveDate(Timestamp supplierInactiveDate) {
        this.supplierInactiveDate = supplierInactiveDate;
    }

    @JsonProperty("IsAssociated")
    public Boolean getIsAssociated() {
        return isAssociated;
    }

    @JsonProperty("IsAssociated")
    public void setIsAssociated(Boolean isAssociated) {
        this.isAssociated = isAssociated;
    }

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("SupplierTypeCode")
    public String getSupplierTypeCode() {
        return supplierTypeCode;
    }

    @JsonProperty("SupplierTypeCode")
    public void setSupplierTypeCode(String supplierTypeCode) {
        this.supplierTypeCode = supplierTypeCode;
    }

    @JsonProperty("SupplierTypeName")
    public String getSupplierTypeName() {
        return supplierTypeName;
    }

    @JsonProperty("SupplierTypeName")
    public void setSupplierTypeName(String supplierTypeName) {
        this.supplierTypeName = supplierTypeName;
    }

    @JsonProperty("SupplierSubClassificationID")
    public String getSupplierSubClassificationID() {
        return supplierSubClassificationID;
    }

    @JsonProperty("SupplierSubClassificationID")
    public void setSupplierSubClassificationID(String supplierSubClassificationID) {
        this.supplierSubClassificationID = supplierSubClassificationID;
    }

    @JsonProperty("SupplierSubTypeCode")
    public String getSupplierSubTypeCode() {
        return supplierSubTypeCode;
    }

    @JsonProperty("SupplierSubTypeCode")
    public void setSupplierSubTypeCode(String supplierSubTypeCode) {
        this.supplierSubTypeCode = supplierSubTypeCode;
    }

    @JsonProperty("SupplierSubTypeName")
    public String getSupplierSubTypeName() {
        return supplierSubTypeName;
    }

    @JsonProperty("SupplierSubTypeName")
    public void setSupplierSubTypeName(String supplierSubTypeName) {
        this.supplierSubTypeName = supplierSubTypeName;
    }

    @JsonProperty("GovernmentTypeID")
    public String getGovernmentTypeID() {
        return governmentTypeID;
    }

    @JsonProperty("GovernmentTypeID")
    public void setGovernmentTypeID(String governmentTypeID) {
        this.governmentTypeID = governmentTypeID;
    }

    @JsonProperty("GovernmentTypeCode")
    public String getGovernmentTypeCode() {
        return governmentTypeCode;
    }

    @JsonProperty("GovernmentTypeCode")
    public void setGovernmentTypeCode(String governmentTypeCode) {
        this.governmentTypeCode = governmentTypeCode;
    }

    @JsonProperty("GovernmentTypeName")
    public String getGovernmentTypeName() {
        return governmentTypeName;
    }

    @JsonProperty("GovernmentTypeName")
    public void setGovernmentTypeName(String governmentTypeName) {
        this.governmentTypeName = governmentTypeName;
    }

    @JsonProperty("IDTypeID")
    public String getIDTypeID() {
        return iDTypeID;
    }

    @JsonProperty("IDTypeID")
    public void setIDTypeID(String iDTypeID) {
        this.iDTypeID = iDTypeID;
    }

    @JsonProperty("IDTypeCode")
    public String getIDTypeCode() {
        return iDTypeCode;
    }

    @JsonProperty("IDTypeCode")
    public void setIDTypeCode(String iDTypeCode) {
        this.iDTypeCode = iDTypeCode;
    }

    @JsonProperty("IDTypeName")
    public String getIDTypeName() {
        return iDTypeName;
    }

    @JsonProperty("IDTypeName")
    public void setIDTypeName(String iDTypeName) {
        this.iDTypeName = iDTypeName;
    }

    @JsonProperty("CountryOfOriginCode")
    public String getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    @JsonProperty("CountryOfOriginCode")
    public void setCountryOfOriginCode(String countryOfOriginCode) {
        this.countryOfOriginCode = countryOfOriginCode;
    }

    @JsonProperty("CountryOfOriginName")
    public String getCountryOfOriginName() {
        return countryOfOriginName;
    }

    @JsonProperty("CountryOfOriginName")
    public void setCountryOfOriginName(String countryOfOriginName) {
        this.countryOfOriginName = countryOfOriginName;
    }

    @JsonProperty("BusinessStatusCode")
    public String getBusinessStatusCode() {
        return businessStatusCode;
    }

    @JsonProperty("BusinessStatusCode")
    public void setBusinessStatusCode(String businessStatusCode) {
        this.businessStatusCode = businessStatusCode;
    }

    @JsonProperty("BusinessStatusName")
    public String getBusinessStatusName() {
        return businessStatusName;
    }

    @JsonProperty("BusinessStatusName")
    public void setBusinessStatusName(String businessStatusName) {
        this.businessStatusName = businessStatusName;
    }

    @JsonProperty("BusinessStatusLastVerificationDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getBusinessStatusLastVerificationDate() {
        return businessStatusLastVerificationDate;
    }

    @JsonProperty("BusinessStatusLastVerificationDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setBusinessStatusLastVerificationDate(Timestamp businessStatusLastVerificationDate) {
        this.businessStatusLastVerificationDate = businessStatusLastVerificationDate;
    }

    @JsonProperty("IndustryClassificationCode")
    public String getIndustryClassificationCode() {
        return industryClassificationCode;
    }

    @JsonProperty("IndustryClassificationCode")
    public void setIndustryClassificationCode(String industryClassificationCode) {
        this.industryClassificationCode = industryClassificationCode;
    }

    @JsonProperty("IndustryClassificationName")
    public String getIndustryClassificationName() {
        return industryClassificationName;
    }

    @JsonProperty("IndustryClassificationName")
    public void setIndustryClassificationName(String industryClassificationName) {
        this.industryClassificationName = industryClassificationName;
    }

    @JsonProperty("LegalName")
    public String getLegalName() {
        return legalName;
    }

    @JsonProperty("LegalName")
    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    @JsonProperty("TradingName")
    public String getTradingName() {
        return tradingName;
    }

    @JsonProperty("TradingName")
    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    @JsonProperty("SAIDNumber")
    public String getSAIDNumber() {
        return sAIDNumber;
    }

    @JsonProperty("SAIDNumber")
    public void setSAIDNumber(String sAIDNumber) {
        this.sAIDNumber = sAIDNumber;
    }

    @JsonProperty("ForeignIDNumber")
    public String getForeignIDNumber() {
        return foreignIDNumber;
    }

    @JsonProperty("ForeignIDNumber")
    public void setForeignIDNumber(String foreignIDNumber) {
        this.foreignIDNumber = foreignIDNumber;
    }

    @JsonProperty("ForeignPassportNumber")
    public String getForeignPassportNumber() {
        return foreignPassportNumber;
    }

    @JsonProperty("ForeignPassportNumber")
    public void setForeignPassportNumber(String foreignPassportNumber) {
        this.foreignPassportNumber = foreignPassportNumber;
    }

    @JsonProperty("WorkPermitNumber")
    public String getWorkPermitNumber() {
        return workPermitNumber;
    }

    @JsonProperty("WorkPermitNumber")
    public void setWorkPermitNumber(String workPermitNumber) {
        this.workPermitNumber = workPermitNumber;
    }

    @JsonProperty("SACompanyNumber")
    public String getSACompanyNumber() {
        return sACompanyNumber;
    }

    @JsonProperty("SACompanyNumber")
    public void setSACompanyNumber(String sACompanyNumber) {
        this.sACompanyNumber = sACompanyNumber;
    }

    @JsonProperty("ForeignCompanyRegistrationNumber")
    public String getForeignCompanyRegistrationNumber() {
        return foreignCompanyRegistrationNumber;
    }

    @JsonProperty("ForeignCompanyRegistrationNumber")
    public void setForeignCompanyRegistrationNumber(String foreignCompanyRegistrationNumber) {
        this.foreignCompanyRegistrationNumber = foreignCompanyRegistrationNumber;
    }

    @JsonProperty("SATrustRegistrationNumber")
    public String getSATrustRegistrationNumber() {
        return sATrustRegistrationNumber;
    }

    @JsonProperty("SATrustRegistrationNumber")
    public void setSATrustRegistrationNumber(String sATrustRegistrationNumber) {
        this.sATrustRegistrationNumber = sATrustRegistrationNumber;
    }

    @JsonProperty("ForeignTrustRegistrationNumber")
    public String getForeignTrustRegistrationNumber() {
        return foreignTrustRegistrationNumber;
    }

    @JsonProperty("ForeignTrustRegistrationNumber")
    public void setForeignTrustRegistrationNumber(String foreignTrustRegistrationNumber) {
        this.foreignTrustRegistrationNumber = foreignTrustRegistrationNumber;
    }

    @JsonProperty("RegistrationDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    @JsonProperty("RegistrationDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }

    @JsonProperty("SupplierFlags")
    public List<SupplierFlag> getSupplierFlags() {
        return supplierFlags;
    }

    @JsonProperty("SupplierFlags")
    public void setSupplierFlags(List<SupplierFlag> supplierFlags) {
        this.supplierFlags = supplierFlags;
    }

    @JsonProperty("HaveBankAccount")
    public Boolean getHaveBankAccount() {
        return haveBankAccount;
    }

    @JsonProperty("HaveBankAccount")
    public void setHaveBankAccount(Boolean haveBankAccount) {
        this.haveBankAccount = haveBankAccount;
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

    @JsonProperty("SupplierClassificationID")
    public String getSupplierClassificationID() {
        return supplierClassificationID;
    }

    @JsonProperty("SupplierClassificationID")
    public void setSupplierClassificationID(String supplierClassificationID) {
        this.supplierClassificationID = supplierClassificationID;
    }

    @JsonProperty("InternationalSecurityIDNumber")
    public String getInternationalSecurityIDNumber() {
        return internationalSecurityIDNumber;
    }

    @JsonProperty("InternationalSecurityIDNumber")
    public void setInternationalSecurityIDNumber(String internationalSecurityIDNumber) {
        this.internationalSecurityIDNumber = internationalSecurityIDNumber;
    }

    @JsonProperty("NonProfitOrganisation")
    public String getNonProfitOrganisation() {
        return nonProfitOrganisation;
    }

    @JsonProperty("NonProfitOrganisation")
    public void setNonProfitOrganisation(String nonProfitOrganisation) {
        this.nonProfitOrganisation = nonProfitOrganisation;
    }

    @JsonProperty("OoSIDNumber")
    public String getOoSIDNumber() {
        return ooSIDNumber;
    }

    @JsonProperty("OoSIDNumber")
    public void setOoSIDNumber(String ooSIDNumber) {
        this.ooSIDNumber = ooSIDNumber;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
