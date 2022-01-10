
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
    "ProvinceName",
    "ProvinceCode"
})
@Generated("jsonschema2pojo")
public class SupplierCommodityProvince {

    @JsonProperty("ProvinceName")
    private String provinceName;
    @JsonProperty("ProvinceCode")
    private String provinceCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
