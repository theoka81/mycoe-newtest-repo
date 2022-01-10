
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
    "DirectorID",
    "CountryTypeCode",
    "CountryTypeName",
    "IDTypeCode",
    "IDTypeName",
    "DirectorStatusTypeCode",
    "DirectorStatusTypeName",
    "SAIDNumber",
    "ForeignIDNUmber",
    "ForeignPassportNumber",
    "WorkPermitNumber",
    "Name",
    "Surname",
    "AppointmentDate",
    "IsActive",
    "LastVerificationDate",
    "DirectorTypes",
    "DirectorFlags",
    "CreatedDate",
    "EditDate"
})
@Generated("jsonschema2pojo")
public class SupplierDirector {

    @JsonProperty("DirectorID")
    private Integer directorID;
    @JsonProperty("CountryTypeCode")
    private String countryTypeCode;
    @JsonProperty("CountryTypeName")
    private String countryTypeName;
    @JsonProperty("IDTypeCode")
    private String iDTypeCode;
    @JsonProperty("IDTypeName")
    private String iDTypeName;
    @JsonProperty("DirectorStatusTypeCode")
    private String directorStatusTypeCode;
    @JsonProperty("DirectorStatusTypeName")
    private String directorStatusTypeName;
    @JsonProperty("SAIDNumber")
    private String sAIDNumber;
    @JsonProperty("ForeignIDNUmber")
    private String foreignIDNUmber;
    @JsonProperty("ForeignPassportNumber")
    private String foreignPassportNumber;
    @JsonProperty("WorkPermitNumber")
    private String workPermitNumber;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Surname")
    private String surname;

    @JsonProperty("AppointmentDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp appointmentDate;
    
    @JsonProperty("IsActive")
    private Boolean isActive;
    @JsonProperty("LastVerificationDate")
    private String lastVerificationDate;
    @JsonProperty("DirectorTypes")
    private List<DirectorType> directorTypes = null;
    @JsonProperty("DirectorFlags")
    private List<DirectorFlag> directorFlags = null;
    
    @JsonProperty("CreatedDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp createdDate;
    
    @JsonProperty("EditDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp editDate;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DirectorID")
    public Integer getDirectorID() {
        return directorID;
    }

    @JsonProperty("DirectorID")
    public void setDirectorID(Integer directorID) {
        this.directorID = directorID;
    }

    @JsonProperty("CountryTypeCode")
    public String getCountryTypeCode() {
        return countryTypeCode;
    }

    @JsonProperty("CountryTypeCode")
    public void setCountryTypeCode(String countryTypeCode) {
        this.countryTypeCode = countryTypeCode;
    }

    @JsonProperty("CountryTypeName")
    public String getCountryTypeName() {
        return countryTypeName;
    }

    @JsonProperty("CountryTypeName")
    public void setCountryTypeName(String countryTypeName) {
        this.countryTypeName = countryTypeName;
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

    @JsonProperty("DirectorStatusTypeCode")
    public String getDirectorStatusTypeCode() {
        return directorStatusTypeCode;
    }

    @JsonProperty("DirectorStatusTypeCode")
    public void setDirectorStatusTypeCode(String directorStatusTypeCode) {
        this.directorStatusTypeCode = directorStatusTypeCode;
    }

    @JsonProperty("DirectorStatusTypeName")
    public String getDirectorStatusTypeName() {
        return directorStatusTypeName;
    }

    @JsonProperty("DirectorStatusTypeName")
    public void setDirectorStatusTypeName(String directorStatusTypeName) {
        this.directorStatusTypeName = directorStatusTypeName;
    }

    @JsonProperty("SAIDNumber")
    public String getSAIDNumber() {
        return sAIDNumber;
    }

    @JsonProperty("SAIDNumber")
    public void setSAIDNumber(String sAIDNumber) {
        this.sAIDNumber = sAIDNumber;
    }

    @JsonProperty("ForeignIDNUmber")
    public String getForeignIDNUmber() {
        return foreignIDNUmber;
    }

    @JsonProperty("ForeignIDNUmber")
    public void setForeignIDNUmber(String foreignIDNUmber) {
        this.foreignIDNUmber = foreignIDNUmber;
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

    @JsonProperty("AppointmentDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public Timestamp getAppointmentDate() {
        return appointmentDate;
    }

    @JsonProperty("AppointmentDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    public void setAppointmentDate(Timestamp appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("LastVerificationDate")
    public String getLastVerificationDate() {
        return lastVerificationDate;
    }

    @JsonProperty("LastVerificationDate")
    public void setLastVerificationDate(String lastVerificationDate) {
        this.lastVerificationDate = lastVerificationDate;
    }

    @JsonProperty("DirectorTypes")
    public List<DirectorType> getDirectorTypes() {
        return directorTypes;
    }

    @JsonProperty("DirectorTypes")
    public void setDirectorTypes(List<DirectorType> directorTypes) {
        this.directorTypes = directorTypes;
    }

    @JsonProperty("DirectorFlags")
    public List<DirectorFlag> getDirectorFlags() {
        return directorFlags;
    }

    @JsonProperty("DirectorFlags")
    public void setDirectorFlags(List<DirectorFlag> directorFlags) {
        this.directorFlags = directorFlags;
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
