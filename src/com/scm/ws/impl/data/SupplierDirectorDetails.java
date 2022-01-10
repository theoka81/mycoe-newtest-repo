
package com.scm.ws.impl.data;

import java.util.HashMap;
import java.util.List;
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
    "SupplierDirectors"
})
@Generated("jsonschema2pojo")
public class SupplierDirectorDetails {

    @JsonProperty("SupplierDirectors")
    private List<SupplierDirector> supplierDirectors = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SupplierDirectors")
    public List<SupplierDirector> getSupplierDirectors() {
        return supplierDirectors;
    }

    @JsonProperty("SupplierDirectors")
    public void setSupplierDirectors(List<SupplierDirector> supplierDirectors) {
        this.supplierDirectors = supplierDirectors;
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
