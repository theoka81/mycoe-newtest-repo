
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
    "CommodityCode",
    "CommodityName",
    "ClassName",
    "ClassCode",
    "FamilyName",
    "FamilyCode",
    "SegmentName",
    "SegmentCode"
})
@Generated("jsonschema2pojo")
public class SupplierCommodityItem {

    @JsonProperty("CommodityCode")
    private String commodityCode;
    @JsonProperty("CommodityName")
    private String commodityName;
    @JsonProperty("ClassName")
    private String className;
    @JsonProperty("ClassCode")
    private String classCode;
    @JsonProperty("FamilyName")
    private String familyName;
    @JsonProperty("FamilyCode")
    private String familyCode;
    @JsonProperty("SegmentName")
    private String segmentName;
    @JsonProperty("SegmentCode")
    private String segmentCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CommodityCode")
    public String getCommodityCode() {
        return commodityCode;
    }

    @JsonProperty("CommodityCode")
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    @JsonProperty("CommodityName")
    public String getCommodityName() {
        return commodityName;
    }

    @JsonProperty("CommodityName")
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    @JsonProperty("ClassName")
    public String getClassName() {
        return className;
    }

    @JsonProperty("ClassName")
    public void setClassName(String className) {
        this.className = className;
    }

    @JsonProperty("ClassCode")
    public String getClassCode() {
        return classCode;
    }

    @JsonProperty("ClassCode")
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @JsonProperty("FamilyName")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("FamilyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonProperty("FamilyCode")
    public String getFamilyCode() {
        return familyCode;
    }

    @JsonProperty("FamilyCode")
    public void setFamilyCode(String familyCode) {
        this.familyCode = familyCode;
    }

    @JsonProperty("SegmentName")
    public String getSegmentName() {
        return segmentName;
    }

    @JsonProperty("SegmentName")
    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    @JsonProperty("SegmentCode")
    public String getSegmentCode() {
        return segmentCode;
    }

    @JsonProperty("SegmentCode")
    public void setSegmentCode(String segmentCode) {
        this.segmentCode = segmentCode;
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
