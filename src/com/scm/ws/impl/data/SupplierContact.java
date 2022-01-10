
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
    "ContactID",
    "ContactTypeCode",
    "ContactTypeName",
    "IsPreferred",
    "Name",
    "Surname",
    "IdentificationTypeCode",
    "IdentificationTypeName",
    "SAIDNumber",
    "ForeignIDNumber",
    "ForeignPassportNumber",
    "WorkPermit",
    "PreferCellphone",
    "PreferEmail",
    "PreferFax",
    "PreferPostal",
    "PreferSMS",
    "PreferTelephone",
    "EmailAddress",
    "CellphoneNumber",
    "FaxNumber",
    "TelephoneNumber",
    "CSDUser",
    "IsActive",
    "CreatedDate",
    "EditDate"
})
@Generated("jsonschema2pojo")
public class SupplierContact {

    @JsonProperty("ContactID")
    private Integer contactID;
    @JsonProperty("ContactTypeCode")
    private String contactTypeCode;
    @JsonProperty("ContactTypeName")
    private String contactTypeName;
    @JsonProperty("IsPreferred")
    private Boolean isPreferred;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Surname")
    private String surname;
    @JsonProperty("IdentificationTypeCode")
    private String identificationTypeCode;
    @JsonProperty("IdentificationTypeName")
    private String identificationTypeName;
    @JsonProperty("SAIDNumber")
    private String sAIDNumber;
    @JsonProperty("ForeignIDNumber")
    private String foreignIDNumber;
    @JsonProperty("ForeignPassportNumber")
    private String foreignPassportNumber;
    @JsonProperty("WorkPermit")
    private String workPermit;
    @JsonProperty("PreferCellphone")
    private Boolean preferCellphone;
    @JsonProperty("PreferEmail")
    private Boolean preferEmail;
    @JsonProperty("PreferFax")
    private Boolean preferFax;
    @JsonProperty("PreferPostal")
    private Boolean preferPostal;
    @JsonProperty("PreferSMS")
    private Boolean preferSMS;
    @JsonProperty("PreferTelephone")
    private Boolean preferTelephone;
    @JsonProperty("EmailAddress")
    private String emailAddress;
    @JsonProperty("CellphoneNumber")
    private String cellphoneNumber;
    @JsonProperty("FaxNumber")
    private String faxNumber;
    @JsonProperty("TelephoneNumber")
    private String telephoneNumber;
    @JsonProperty("CSDUser")
    private Boolean cSDUser;
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

    @JsonProperty("ContactID")
    public Integer getContactID() {
        return contactID;
    }

    @JsonProperty("ContactID")
    public void setContactID(Integer contactID) {
        this.contactID = contactID;
    }

    @JsonProperty("ContactTypeCode")
    public String getContactTypeCode() {
        return contactTypeCode;
    }

    @JsonProperty("ContactTypeCode")
    public void setContactTypeCode(String contactTypeCode) {
        this.contactTypeCode = contactTypeCode;
    }

    @JsonProperty("ContactTypeName")
    public String getContactTypeName() {
        return contactTypeName;
    }

    @JsonProperty("ContactTypeName")
    public void setContactTypeName(String contactTypeName) {
        this.contactTypeName = contactTypeName;
    }

    @JsonProperty("IsPreferred")
    public Boolean getIsPreferred() {
        return isPreferred;
    }

    @JsonProperty("IsPreferred")
    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Surname")
    public String getSurname() {
        return surname;
    }

    @JsonProperty("Surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @JsonProperty("IdentificationTypeCode")
    public String getIdentificationTypeCode() {
        return identificationTypeCode;
    }

    @JsonProperty("IdentificationTypeCode")
    public void setIdentificationTypeCode(String identificationTypeCode) {
        this.identificationTypeCode = identificationTypeCode;
    }

    @JsonProperty("IdentificationTypeName")
    public String getIdentificationTypeName() {
        return identificationTypeName;
    }

    @JsonProperty("IdentificationTypeName")
    public void setIdentificationTypeName(String identificationTypeName) {
        this.identificationTypeName = identificationTypeName;
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

    @JsonProperty("WorkPermit")
    public String getWorkPermit() {
        return workPermit;
    }

    @JsonProperty("WorkPermit")
    public void setWorkPermit(String workPermit) {
        this.workPermit = workPermit;
    }

    @JsonProperty("PreferCellphone")
    public Boolean getPreferCellphone() {
        return preferCellphone;
    }

    @JsonProperty("PreferCellphone")
    public void setPreferCellphone(Boolean preferCellphone) {
        this.preferCellphone = preferCellphone;
    }

    @JsonProperty("PreferEmail")
    public Boolean getPreferEmail() {
        return preferEmail;
    }

    @JsonProperty("PreferEmail")
    public void setPreferEmail(Boolean preferEmail) {
        this.preferEmail = preferEmail;
    }

    @JsonProperty("PreferFax")
    public Boolean getPreferFax() {
        return preferFax;
    }

    @JsonProperty("PreferFax")
    public void setPreferFax(Boolean preferFax) {
        this.preferFax = preferFax;
    }

    @JsonProperty("PreferPostal")
    public Boolean getPreferPostal() {
        return preferPostal;
    }

    @JsonProperty("PreferPostal")
    public void setPreferPostal(Boolean preferPostal) {
        this.preferPostal = preferPostal;
    }

    @JsonProperty("PreferSMS")
    public Boolean getPreferSMS() {
        return preferSMS;
    }

    @JsonProperty("PreferSMS")
    public void setPreferSMS(Boolean preferSMS) {
        this.preferSMS = preferSMS;
    }

    @JsonProperty("PreferTelephone")
    public Boolean getPreferTelephone() {
        return preferTelephone;
    }

    @JsonProperty("PreferTelephone")
    public void setPreferTelephone(Boolean preferTelephone) {
        this.preferTelephone = preferTelephone;
    }

    @JsonProperty("EmailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("EmailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @JsonProperty("CellphoneNumber")
    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    @JsonProperty("CellphoneNumber")
    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    @JsonProperty("FaxNumber")
    public String getFaxNumber() {
        return faxNumber;
    }

    @JsonProperty("FaxNumber")
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    @JsonProperty("TelephoneNumber")
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    @JsonProperty("TelephoneNumber")
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @JsonProperty("CSDUser")
    public Boolean getCSDUser() {
        return cSDUser;
    }

    @JsonProperty("CSDUser")
    public void setCSDUser(Boolean cSDUser) {
        this.cSDUser = cSDUser;
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
