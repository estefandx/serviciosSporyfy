
package com.musica.models.customer;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "custom_fields",
    "default_payment_method",
    "footer"
})
public class InvoiceSettings implements Serializable
{

    @JsonProperty("custom_fields")
    private String customFields;
    @JsonProperty("default_payment_method")
    private String defaultPaymentMethod;
    @JsonProperty("footer")
    private String footer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7218484893717047654L;

    @JsonProperty("custom_fields")
    public String getCustomFields() {
        return customFields;
    }

    @JsonProperty("custom_fields")
    public void setCustomFields(String customFields) {
        this.customFields = customFields;
    }

    @JsonProperty("default_payment_method")
    public String getDefaultPaymentMethod() {
        return defaultPaymentMethod;
    }

    @JsonProperty("default_payment_method")
    public void setDefaultPaymentMethod(String defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
    }

    @JsonProperty("footer")
    public String getFooter() {
        return footer;
    }

    @JsonProperty("footer")
    public void setFooter(String footer) {
        this.footer = footer;
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
