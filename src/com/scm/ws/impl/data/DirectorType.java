
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
    "DirectorTypeCode",
    "DirectorTypeName"
})
@Generated("jsonschema2pojo")
public class DirectorType {

    @JsonProperty("DirectorTypeCode")
    private String directorTypeCode;
    @JsonProperty("DirectorTypeName")
    private String directorTypeName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DirectorTypeCode")
    public String getDirectorTypeCode() {
        return directorTypeCode;
    }

    @JsonProperty("DirectorTypeCode")
    public void setDirectorTypeCode(String directorTypeCode) {
        this.directorTypeCode = directorTypeCode;
    }

    @JsonProperty("DirectorTypeName")
    public String getDirectorTypeName() {
        return directorTypeName;
    }

    @JsonProperty("DirectorTypeName")
    public void setDirectorTypeName(String directorTypeName) {
        this.directorTypeName = directorTypeName;
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
