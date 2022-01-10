
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
    "CommodityGroupID",
    "Name",
    "Description",
    "NationWide",
    "ProvinceWide",
    "IsActive",
    "SupplierCommodityItems",
    "SupplierCommodityLocations",
    "SupplierCommodityProvinces",
    "CreatedDate",
    "EditDate"
})
@Generated("jsonschema2pojo")
public class SupplierCommodity {

    @JsonProperty("CommodityGroupID")
    private Integer commodityGroupID;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("NationWide")
    private Boolean nationWide;
    @JsonProperty("ProvinceWide")
    private Boolean provinceWide;
    @JsonProperty("IsActive")
    private Boolean isActive;
    @JsonProperty("SupplierCommodityItems")
    private List<SupplierCommodityItem> supplierCommodityItems = null;
    @JsonProperty("SupplierCommodityLocations")
    private List<SupplierCommodityLocation> supplierCommodityLocations = null;
    @JsonProperty("SupplierCommodityProvinces")
    private List<SupplierCommodityProvince> supplierCommodityProvinces = null;
    
    @JsonProperty("CreatedDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp createdDate;
    
    @JsonProperty("EditDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="s")
    private Timestamp editDate;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CommodityGroupID")
    public Integer getCommodityGroupID() {
        return commodityGroupID;
    }

    @JsonProperty("CommodityGroupID")
    public void setCommodityGroupID(Integer commodityGroupID) {
        this.commodityGroupID = commodityGroupID;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("NationWide")
    public Boolean getNationWide() {
        return nationWide;
    }

    @JsonProperty("NationWide")
    public void setNationWide(Boolean nationWide) {
        this.nationWide = nationWide;
    }

    @JsonProperty("ProvinceWide")
    public Boolean getProvinceWide() {
        return provinceWide;
    }

    @JsonProperty("ProvinceWide")
    public void setProvinceWide(Boolean provinceWide) {
        this.provinceWide = provinceWide;
    }

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("SupplierCommodityItems")
    public List<SupplierCommodityItem> getSupplierCommodityItems() {
        return supplierCommodityItems;
    }

    @JsonProperty("SupplierCommodityItems")
    public void setSupplierCommodityItems(List<SupplierCommodityItem> supplierCommodityItems) {
        this.supplierCommodityItems = supplierCommodityItems;
    }

    @JsonProperty("SupplierCommodityLocations")
    public List<SupplierCommodityLocation> getSupplierCommodityLocations() {
        return supplierCommodityLocations;
    }

    @JsonProperty("SupplierCommodityLocations")
    public void setSupplierCommodityLocations(List<SupplierCommodityLocation> supplierCommodityLocations) {
        this.supplierCommodityLocations = supplierCommodityLocations;
    }

    @JsonProperty("SupplierCommodityProvinces")
    public List<SupplierCommodityProvince> getSupplierCommodityProvinces() {
        return supplierCommodityProvinces;
    }

    @JsonProperty("SupplierCommodityProvinces")
    public void setSupplierCommodityProvinces(List<SupplierCommodityProvince> supplierCommodityProvinces) {
        this.supplierCommodityProvinces = supplierCommodityProvinces;
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
