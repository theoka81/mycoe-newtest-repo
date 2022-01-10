
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
    "LocationParent",
    "WardNumber",
    "WardCode",
    "LocationType",
    "SuburbName",
    "SuburbCode",
    "CityName",
    "CityCode",
    "MunicipalityName",
    "MunicipalityCode",
    "DistrictName",
    "DistrictCode",
    "ProvinceName",
    "ProvinceCode"
})
@Generated("jsonschema2pojo")
public class SupplierCommodityLocation {

    @JsonProperty("LocationParent")
    private Object locationParent;
    @JsonProperty("WardNumber")
    private String wardNumber;
    @JsonProperty("WardCode")
    private String wardCode;
    @JsonProperty("LocationType")
    private Object locationType;
    @JsonProperty("SuburbName")
    private String suburbName;
    @JsonProperty("SuburbCode")
    private String suburbCode;
    @JsonProperty("CityName")
    private String cityName;
    @JsonProperty("CityCode")
    private String cityCode;
    @JsonProperty("MunicipalityName")
    private String municipalityName;
    @JsonProperty("MunicipalityCode")
    private String municipalityCode;
    @JsonProperty("DistrictName")
    private String districtName;
    @JsonProperty("DistrictCode")
    private String districtCode;
    @JsonProperty("ProvinceName")
    private String provinceName;
    @JsonProperty("ProvinceCode")
    private String provinceCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LocationParent")
    public Object getLocationParent() {
        return locationParent;
    }

    @JsonProperty("LocationParent")
    public void setLocationParent(Object locationParent) {
        this.locationParent = locationParent;
    }

    @JsonProperty("WardNumber")
    public String getWardNumber() {
        return wardNumber;
    }

    @JsonProperty("WardNumber")
    public void setWardNumber(String wardNumber) {
        this.wardNumber = wardNumber;
    }

    @JsonProperty("WardCode")
    public String getWardCode() {
        return wardCode;
    }

    @JsonProperty("WardCode")
    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    @JsonProperty("LocationType")
    public Object getLocationType() {
        return locationType;
    }

    @JsonProperty("LocationType")
    public void setLocationType(Object locationType) {
        this.locationType = locationType;
    }

    @JsonProperty("SuburbName")
    public String getSuburbName() {
        return suburbName;
    }

    @JsonProperty("SuburbName")
    public void setSuburbName(String suburbName) {
        this.suburbName = suburbName;
    }

    @JsonProperty("SuburbCode")
    public String getSuburbCode() {
        return suburbCode;
    }

    @JsonProperty("SuburbCode")
    public void setSuburbCode(String suburbCode) {
        this.suburbCode = suburbCode;
    }

    @JsonProperty("CityName")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("CityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("CityCode")
    public String getCityCode() {
        return cityCode;
    }

    @JsonProperty("CityCode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @JsonProperty("MunicipalityName")
    public String getMunicipalityName() {
        return municipalityName;
    }

    @JsonProperty("MunicipalityName")
    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }

    @JsonProperty("MunicipalityCode")
    public String getMunicipalityCode() {
        return municipalityCode;
    }

    @JsonProperty("MunicipalityCode")
    public void setMunicipalityCode(String municipalityCode) {
        this.municipalityCode = municipalityCode;
    }

    @JsonProperty("DistrictName")
    public String getDistrictName() {
        return districtName;
    }

    @JsonProperty("DistrictName")
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @JsonProperty("DistrictCode")
    public String getDistrictCode() {
        return districtCode;
    }

    @JsonProperty("DistrictCode")
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    @JsonProperty("ProvinceName")
    public String getProvinceName() {
        return provinceName;
    }

    @JsonProperty("ProvinceName")
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @JsonProperty("ProvinceCode")
    public String getProvinceCode() {
        return provinceCode;
    }

    @JsonProperty("ProvinceCode")
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
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
