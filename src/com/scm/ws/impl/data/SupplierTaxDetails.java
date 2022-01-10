
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
    "IncomeTaxNumber",
    "VATNumber",
    "PAYENumber",
    "IsValidCertificate",
    "TaxClearanceCertificateExpiryDate",
    "IsRegistered",
    "LastVerificationDate",
    "ValidationResponse",
    "IsActive",
    "CreatedDate",
    "EditDate"
})
@Generated("jsonschema2pojo")
public class SupplierTaxDetails {

    @JsonProperty("IncomeTaxNumber")
    private String incomeTaxNumber;
    @JsonProperty("VATNumber")
    private String vATNumber;
    @JsonProperty("PAYENumber")
    private String pAYENumber;
    @JsonProperty("IsValidCertificate")
    private Boolean isValidCertificate;
    @JsonProperty("TaxClearanceCertificateExpiryDate")
    private String taxClearanceCertificateExpiryDate;
    @JsonProperty("IsRegistered")
    private Boolean isRegistered;
    @JsonProperty("LastVerificationDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp lastVerificationDate;
    @JsonProperty("ValidationResponse")
    private String validationResponse;
    @JsonProperty("IsActive")
    private Boolean isActive;
    
    @JsonProperty("CreatedDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp createdDate;
    
    @JsonProperty("EditDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp editDate;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("IncomeTaxNumber")
    public String getIncomeTaxNumber() {
        return incomeTaxNumber;
    }

    @JsonProperty("IncomeTaxNumber")
    public void setIncomeTaxNumber(String incomeTaxNumber) {
        this.incomeTaxNumber = incomeTaxNumber;
    }

    @JsonProperty("VATNumber")
    public String getVATNumber() {
        return vATNumber;
    }

    @JsonProperty("VATNumber")
    public void setVATNumber(String vATNumber) {
        this.vATNumber = vATNumber;
    }

    @JsonProperty("PAYENumber")
    public String getPAYENumber() {
        return pAYENumber;
    }

    @JsonProperty("PAYENumber")
    public void setPAYENumber(String pAYENumber) {
        this.pAYENumber = pAYENumber;
    }

    @JsonProperty("IsValidCertificate")
    public Boolean getIsValidCertificate() {
        return isValidCertificate;
    }

    @JsonProperty("IsValidCertificate")
    public void setIsValidCertificate(Boolean isValidCertificate) {
        this.isValidCertificate = isValidCertificate;
    }

    @JsonProperty("TaxClearanceCertificateExpiryDate")
    public String getTaxClearanceCertificateExpiryDate() {
        return taxClearanceCertificateExpiryDate;
    }

    @JsonProperty("TaxClearanceCertificateExpiryDate")
    public void setTaxClearanceCertificateExpiryDate(String taxClearanceCertificateExpiryDate) {
        this.taxClearanceCertificateExpiryDate = taxClearanceCertificateExpiryDate;
    }

    @JsonProperty("IsRegistered")
    public Boolean getIsRegistered() {
        return isRegistered;
    }

    @JsonProperty("IsRegistered")
    public void setIsRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    @JsonProperty("LastVerificationDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getLastVerificationDate() {
        return lastVerificationDate;
    }

    @JsonProperty("LastVerificationDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setLastVerificationDate(Timestamp lastVerificationDate) {
        this.lastVerificationDate = lastVerificationDate;
    }

    @JsonProperty("ValidationResponse")
    public String getValidationResponse() {
        return validationResponse;
    }

    @JsonProperty("ValidationResponse")
    public void setValidationResponse(String validationResponse) {
        this.validationResponse = validationResponse;
    }

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
