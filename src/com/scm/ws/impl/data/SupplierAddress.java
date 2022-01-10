
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
    "AddressID",
    "IsPreferred",
    "AddressTypeCode",
    "AddressTypeName",
    "AddressLine1",
    "AddressLine2",
    "CountryCode",
    "CountryName",
    "ProvinceCode",
    "ProvinceName",
    "DistrictCode",
    "DistrictName",
    "MunicipalityCode",
    "MunicipalityName",
    "CityCode",
    "CityName",
    "SuburbCode",
    "SuburbName",
    "WardCode",
    "WardName",
    "PostalCode",
    "IsPostalAddress",
    "IsDeliveryAddress",
    "IsPhysicalAddress",
    "IsPaymentAddress",
    "IsActive",
    "CreatedDate",
    "EditDate"
})
@Generated("jsonschema2pojo")
public class SupplierAddress {

    @JsonProperty("AddressID")
    private Integer addressID;
    @JsonProperty("IsPreferred")
    private Boolean isPreferred;
    @JsonProperty("AddressTypeCode")
    private String addressTypeCode;
    @JsonProperty("AddressTypeName")
    private String addressTypeName;
    @JsonProperty("AddressLine1")
    private String addressLine1;
    @JsonProperty("AddressLine2")
    private String addressLine2;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("CountryName")
    private String countryName;
    @JsonProperty("ProvinceCode")
    private String provinceCode;
    @JsonProperty("ProvinceName")
    private String provinceName;
    @JsonProperty("DistrictCode")
    private String districtCode;
    @JsonProperty("DistrictName")
    private String districtName;
    @JsonProperty("MunicipalityCode")
    private String municipalityCode;
    @JsonProperty("MunicipalityName")
    private String municipalityName;
    @JsonProperty("CityCode")
    private String cityCode;
    @JsonProperty("CityName")
    private String cityName;
    @JsonProperty("SuburbCode")
    private String suburbCode;
    @JsonProperty("SuburbName")
    private String suburbName;
    @JsonProperty("WardCode")
    private String wardCode;
    @JsonProperty("WardName")
    private String wardName;
    @JsonProperty("PostalCode")
    private String postalCode;
    @JsonProperty("IsPostalAddress")
    private Boolean isPostalAddress;
    @JsonProperty("IsDeliveryAddress")
    private Boolean isDeliveryAddress;
    @JsonProperty("IsPhysicalAddress")
    private Boolean isPhysicalAddress;
    @JsonProperty("IsPaymentAddress")
    private Boolean isPaymentAddress;
    @JsonProperty("IsActive")
    private Boolean isActive;
    @JsonProperty("CreatedDate")
    private String createdDate;
    @JsonProperty("EditDate")
    private String editDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AddressID")
    public Integer getAddressID() {
        return addressID;
    }

    @JsonProperty("AddressID")
    public void setAddressID(Integer addressID) {
        this.addressID = addressID;
    }

    @JsonProperty("IsPreferred")
    public Boolean getIsPreferred() {
        return isPreferred;
    }

    @JsonProperty("IsPreferred")
    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    @JsonProperty("AddressTypeCode")
    public String getAddressTypeCode() {
        return addressTypeCode;
    }

    @JsonProperty("AddressTypeCode")
    public void setAddressTypeCode(String addressTypeCode) {
        this.addressTypeCode = addressTypeCode;
    }

    @JsonProperty("AddressTypeName")
    public String getAddressTypeName() {
        return addressTypeName;
    }

    @JsonProperty("AddressTypeName")
    public void setAddressTypeName(String addressTypeName) {
        this.addressTypeName = addressTypeName;
    }

    @JsonProperty("AddressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("AddressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("AddressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("AddressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("CountryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("CountryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("ProvinceCode")
    public String getProvinceCode() {
        return provinceCode;
    }

    @JsonProperty("ProvinceCode")
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    @JsonProperty("ProvinceName")
    public String getProvinceName() {
        return provinceName;
    }

    @JsonProperty("ProvinceName")
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @JsonProperty("DistrictCode")
    public String getDistrictCode() {
        return districtCode;
    }

    @JsonProperty("DistrictCode")
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    @JsonProperty("DistrictName")
    public String getDistrictName() {
        return districtName;
    }

    @JsonProperty("DistrictName")
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @JsonProperty("MunicipalityCode")
    public String getMunicipalityCode() {
        return municipalityCode;
    }

    @JsonProperty("MunicipalityCode")
    public void setMunicipalityCode(String municipalityCode) {
        this.municipalityCode = municipalityCode;
    }

    @JsonProperty("MunicipalityName")
    public String getMunicipalityName() {
        return municipalityName;
    }

    @JsonProperty("MunicipalityName")
    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }

    @JsonProperty("CityCode")
    public String getCityCode() {
        return cityCode;
    }

    @JsonProperty("CityCode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @JsonProperty("CityName")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("CityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("SuburbCode")
    public String getSuburbCode() {
        return suburbCode;
    }

    @JsonProperty("SuburbCode")
    public void setSuburbCode(String suburbCode) {
        this.suburbCode = suburbCode;
    }

    @JsonProperty("SuburbName")
    public String getSuburbName() {
        return suburbName;
    }

    @JsonProperty("SuburbName")
    public void setSuburbName(String suburbName) {
        this.suburbName = suburbName;
    }

    @JsonProperty("WardCode")
    public String getWardCode() {
        return wardCode;
    }

    @JsonProperty("WardCode")
    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    @JsonProperty("WardName")
    public String getWardName() {
        return wardName;
    }

    @JsonProperty("WardName")
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("IsPostalAddress")
    public Boolean getIsPostalAddress() {
        return isPostalAddress;
    }

    @JsonProperty("IsPostalAddress")
    public void setIsPostalAddress(Boolean isPostalAddress) {
        this.isPostalAddress = isPostalAddress;
    }

    @JsonProperty("IsDeliveryAddress")
    public Boolean getIsDeliveryAddress() {
        return isDeliveryAddress;
    }

    @JsonProperty("IsDeliveryAddress")
    public void setIsDeliveryAddress(Boolean isDeliveryAddress) {
        this.isDeliveryAddress = isDeliveryAddress;
    }

    @JsonProperty("IsPhysicalAddress")
    public Boolean getIsPhysicalAddress() {
        return isPhysicalAddress;
    }

    @JsonProperty("IsPhysicalAddress")
    public void setIsPhysicalAddress(Boolean isPhysicalAddress) {
        this.isPhysicalAddress = isPhysicalAddress;
    }

    @JsonProperty("IsPaymentAddress")
    public Boolean getIsPaymentAddress() {
        return isPaymentAddress;
    }

    @JsonProperty("IsPaymentAddress")
    public void setIsPaymentAddress(Boolean isPaymentAddress) {
        this.isPaymentAddress = isPaymentAddress;
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
