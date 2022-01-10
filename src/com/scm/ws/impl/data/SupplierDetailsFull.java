
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
    "SupplierIdentificationDetails",
    "SupplierContactDetails",
    "SupplierAddressDetails",
    "SupplierBankingDetails",
    "SupplierTaxDetails",
    "SupplierDirectorDetails",
    "SupplierAssociationDetails",
    "SupplierCommodityDetails",
    "SupplierAccreditationDetails",
    "SupplierBBBEEDetails"
})
@Generated("jsonschema2pojo")
public class SupplierDetailsFull {

    @JsonProperty("SupplierIdentificationDetails")
    private SupplierIdentificationDetails supplierIdentificationDetails;
    @JsonProperty("SupplierContactDetails")
    private SupplierContactDetails supplierContactDetails;
    @JsonProperty("SupplierAddressDetails")
    private SupplierAddressDetails supplierAddressDetails;
    @JsonProperty("SupplierBankingDetails")
    private SupplierBankingDetails supplierBankingDetails;
    @JsonProperty("SupplierTaxDetails")
    private SupplierTaxDetails supplierTaxDetails;
    @JsonProperty("SupplierDirectorDetails")
    private SupplierDirectorDetails supplierDirectorDetails;
    @JsonProperty("SupplierAssociationDetails")
    private SupplierAssociationDetails supplierAssociationDetails;
    @JsonProperty("SupplierCommodityDetails")
    private SupplierCommodityDetails supplierCommodityDetails;
    @JsonProperty("SupplierAccreditationDetails")
    private SupplierAccreditationDetails supplierAccreditationDetails;
    @JsonProperty("SupplierBBBEEDetails")
    private SupplierBBBEEDetails supplierBBBEEDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SupplierIdentificationDetails")
    public SupplierIdentificationDetails getSupplierIdentificationDetails() {
        return supplierIdentificationDetails;
    }

    @JsonProperty("SupplierIdentificationDetails")
    public void setSupplierIdentificationDetails(SupplierIdentificationDetails supplierIdentificationDetails) {
        this.supplierIdentificationDetails = supplierIdentificationDetails;
    }

    @JsonProperty("SupplierContactDetails")
    public SupplierContactDetails getSupplierContactDetails() {
        return supplierContactDetails;
    }

    @JsonProperty("SupplierContactDetails")
    public void setSupplierContactDetails(SupplierContactDetails supplierContactDetails) {
        this.supplierContactDetails = supplierContactDetails;
    }

    @JsonProperty("SupplierAddressDetails")
    public SupplierAddressDetails getSupplierAddressDetails() {
        return supplierAddressDetails;
    }

    @JsonProperty("SupplierAddressDetails")
    public void setSupplierAddressDetails(SupplierAddressDetails supplierAddressDetails) {
        this.supplierAddressDetails = supplierAddressDetails;
    }

    @JsonProperty("SupplierBankingDetails")
    public SupplierBankingDetails getSupplierBankingDetails() {
        return supplierBankingDetails;
    }

    @JsonProperty("SupplierBankingDetails")
    public void setSupplierBankingDetails(SupplierBankingDetails supplierBankingDetails) {
        this.supplierBankingDetails = supplierBankingDetails;
    }

    @JsonProperty("SupplierTaxDetails")
    public SupplierTaxDetails getSupplierTaxDetails() {
        return supplierTaxDetails;
    }

    @JsonProperty("SupplierTaxDetails")
    public void setSupplierTaxDetails(SupplierTaxDetails supplierTaxDetails) {
        this.supplierTaxDetails = supplierTaxDetails;
    }

    @JsonProperty("SupplierDirectorDetails")
    public SupplierDirectorDetails getSupplierDirectorDetails() {
        return supplierDirectorDetails;
    }

    @JsonProperty("SupplierDirectorDetails")
    public void setSupplierDirectorDetails(SupplierDirectorDetails supplierDirectorDetails) {
        this.supplierDirectorDetails = supplierDirectorDetails;
    }

    @JsonProperty("SupplierAssociationDetails")
    public SupplierAssociationDetails getSupplierAssociationDetails() {
        return supplierAssociationDetails;
    }

    @JsonProperty("SupplierAssociationDetails")
    public void setSupplierAssociationDetails(SupplierAssociationDetails supplierAssociationDetails) {
        this.supplierAssociationDetails = supplierAssociationDetails;
    }

    @JsonProperty("SupplierCommodityDetails")
    public SupplierCommodityDetails getSupplierCommodityDetails() {
        return supplierCommodityDetails;
    }

    @JsonProperty("SupplierCommodityDetails")
    public void setSupplierCommodityDetails(SupplierCommodityDetails supplierCommodityDetails) {
        this.supplierCommodityDetails = supplierCommodityDetails;
    }

    @JsonProperty("SupplierAccreditationDetails")
    public SupplierAccreditationDetails getSupplierAccreditationDetails() {
        return supplierAccreditationDetails;
    }

    @JsonProperty("SupplierAccreditationDetails")
    public void setSupplierAccreditationDetails(SupplierAccreditationDetails supplierAccreditationDetails) {
        this.supplierAccreditationDetails = supplierAccreditationDetails;
    }

    @JsonProperty("SupplierBBBEEDetails")
    public SupplierBBBEEDetails getSupplierBBBEEDetails() {
        return supplierBBBEEDetails;
    }

    @JsonProperty("SupplierBBBEEDetails")
    public void setSupplierBBBEEDetails(SupplierBBBEEDetails supplierBBBEEDetails) {
        this.supplierBBBEEDetails = supplierBBBEEDetails;
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
