
package com.scm.ws.impl.data;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AccreditationID",
    "AccreditationBodyParentName",
    "AccreditationBodyParentCode",
    "AccreditationBodyName",
    "AccreditationBodyCode",
    "AccreditationNumber",
    "RegistrationDate",
    "ExpiryDate",
    "Description",
    "IsVerified",
    "StatusName",
    "StatusCode",
    "IsActive",
    "CreatedDate",
    "EditDate"
})
@Generated("jsonschema2pojo")
public class MasterSupplierAccreditation {

    @JsonProperty("AccreditationID")
    private Integer accreditationID;
    @JsonProperty("AccreditationBodyParentName")
    private String accreditationBodyParentName;
    @JsonProperty("AccreditationBodyParentCode")
    private String accreditationBodyParentCode;
    @JsonProperty("AccreditationBodyName")
    private String accreditationBodyName;
    @JsonProperty("AccreditationBodyCode")
    private String accreditationBodyCode;
    @JsonProperty("AccreditationNumber")
    private String accreditationNumber;
    @JsonProperty("RegistrationDate")
    private String registrationDate;
    @JsonProperty("ExpiryDate")
    private String expiryDate;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("IsVerified")
    private Boolean isVerified;
    @JsonProperty("StatusName")
    private String statusName;
    @JsonProperty("StatusCode")
    private String statusCode;
    @JsonProperty("IsActive")
    private Boolean isActive;
    @JsonProperty("CreatedDate")
    private String createdDate;
    @JsonProperty("EditDate")
    private String editDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AccreditationID")
    public Integer getAccreditationID() {
        return accreditationID;
    }

    @JsonProperty("AccreditationID")
    public void setAccreditationID(Integer accreditationID) {
        this.accreditationID = accreditationID;
    }

    @JsonProperty("AccreditationBodyParentName")
    public String getAccreditationBodyParentName() {
        return accreditationBodyParentName;
    }

    @JsonProperty("AccreditationBodyParentName")
    public void setAccreditationBodyParentName(String accreditationBodyParentName) {
        this.accreditationBodyParentName = accreditationBodyParentName;
    }

    @JsonProperty("AccreditationBodyParentCode")
    public String getAccreditationBodyParentCode() {
        return accreditationBodyParentCode;
    }

    @JsonProperty("AccreditationBodyParentCode")
    public void setAccreditationBodyParentCode(String accreditationBodyParentCode) {
        this.accreditationBodyParentCode = accreditationBodyParentCode;
    }

    @JsonProperty("AccreditationBodyName")
    public String getAccreditationBodyName() {
        return accreditationBodyName;
    }

    @JsonProperty("AccreditationBodyName")
    public void setAccreditationBodyName(String accreditationBodyName) {
        this.accreditationBodyName = accreditationBodyName;
    }

    @JsonProperty("AccreditationBodyCode")
    public String getAccreditationBodyCode() {
        return accreditationBodyCode;
    }

    @JsonProperty("AccreditationBodyCode")
    public void setAccreditationBodyCode(String accreditationBodyCode) {
        this.accreditationBodyCode = accreditationBodyCode;
    }

    @JsonProperty("AccreditationNumber")
    public String getAccreditationNumber() {
        return accreditationNumber;
    }

    @JsonProperty("AccreditationNumber")
    public void setAccreditationNumber(String accreditationNumber) {
        this.accreditationNumber = accreditationNumber;
    }

    @JsonProperty("RegistrationDate")
    public String getRegistrationDate() {
        return registrationDate;
    }

    @JsonProperty("RegistrationDate")
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    @JsonProperty("ExpiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    @JsonProperty("ExpiryDate")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("IsVerified")
    public Boolean getIsVerified() {
        return isVerified;
    }

    @JsonProperty("IsVerified")
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    @JsonProperty("StatusName")
    public String getStatusName() {
        return statusName;
    }

    @JsonProperty("StatusName")
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @JsonProperty("StatusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("StatusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
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
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("CreatedDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("EditDate")
    public String getEditDate() {
        return editDate;
    }

    @JsonProperty("EditDate")
    public void setEditDate(String editDate) {
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
