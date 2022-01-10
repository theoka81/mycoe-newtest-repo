
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
    "SupplierAssociations"
})
@Generated("jsonschema2pojo")
public class SupplierAssociationDetails {

    @JsonProperty("SupplierAssociations")
    private List<Object> supplierAssociations = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SupplierAssociations")
    public List<Object> getSupplierAssociations() {
        return supplierAssociations;
    }

    @JsonProperty("SupplierAssociations")
    public void setSupplierAssociations(List<Object> supplierAssociations) {
        this.supplierAssociations = supplierAssociations;
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
