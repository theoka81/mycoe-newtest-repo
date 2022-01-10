
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
    "SupplierFlagType",
    "SupplierFlagDescription",
    "SupplierFlagValue",
    "SupplierFlagDetails",
    "SupplierFlagLastVerificationDate"
})
@Generated("jsonschema2pojo")
public class DirectorFlag {

    @JsonProperty("SupplierFlagType")
    private String supplierFlagType;
    @JsonProperty("SupplierFlagDescription")
    private String supplierFlagDescription;
    @JsonProperty("SupplierFlagValue")
    private Boolean supplierFlagValue;
    @JsonProperty("SupplierFlagDetails")
    private String supplierFlagDetails;
    @JsonProperty("SupplierFlagLastVerificationDate")
    private String supplierFlagLastVerificationDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SupplierFlagType")
    public String getSupplierFlagType() {
        return supplierFlagType;
    }

    @JsonProperty("SupplierFlagType")
    public void setSupplierFlagType(String supplierFlagType) {
        this.supplierFlagType = supplierFlagType;
    }

    @JsonProperty("SupplierFlagDescription")
    public String getSupplierFlagDescription() {
        return supplierFlagDescription;
    }

    @JsonProperty("SupplierFlagDescription")
    public void setSupplierFlagDescription(String supplierFlagDescription) {
        this.supplierFlagDescription = supplierFlagDescription;
    }

    @JsonProperty("SupplierFlagValue")
    public Boolean getSupplierFlagValue() {
        return supplierFlagValue;
    }

    @JsonProperty("SupplierFlagValue")
    public void setSupplierFlagValue(Boolean supplierFlagValue) {
        this.supplierFlagValue = supplierFlagValue;
    }

    @JsonProperty("SupplierFlagDetails")
    public String getSupplierFlagDetails() {
        return supplierFlagDetails;
    }

    @JsonProperty("SupplierFlagDetails")
    public void setSupplierFlagDetails(String supplierFlagDetails) {
        this.supplierFlagDetails = supplierFlagDetails;
    }

    @JsonProperty("SupplierFlagLastVerificationDate")
    public String getSupplierFlagLastVerificationDate() {
        return supplierFlagLastVerificationDate;
    }

    @JsonProperty("SupplierFlagLastVerificationDate")
    public void setSupplierFlagLastVerificationDate(String supplierFlagLastVerificationDate) {
        this.supplierFlagLastVerificationDate = supplierFlagLastVerificationDate;
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
