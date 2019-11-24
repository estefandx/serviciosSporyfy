
package com.musica.models.customer;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "object",
    "address",
    "balance",
    "created",
    "currency",
    "default_source",
    "delinquent",
    "description",
    "discount",
    "email",
    "invoice_prefix",
    "invoice_settings",
    "livemode",
    "metadata",
    "name",
    "phone",
    "preferred_locales",
    "shipping",
    "sources",
    "subscriptions",
    "tax_exempt",
    "tax_ids",
    "tax_info",
    "tax_info_verification"
})
public class Customer implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("object")
    private String object;
    @JsonProperty("address")
    private String address;
    @JsonProperty("balance")
    private Integer balance;
    @JsonProperty("created")
    private Integer created;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("default_source")
    private String defaultSource;
    @JsonProperty("delinquent")
    private Boolean delinquent;
    @JsonProperty("description")
    private String description;
    @JsonProperty("discount")
    private Integer discount;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("invoice_prefix")
    private String invoicePrefix;
    @JsonProperty("invoice_settings")
    private InvoiceSettings invoiceSettings;
    @JsonProperty("livemode")
    private Boolean livemode;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("name")
    private String name;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("preferred_locales")
    private List<Object> preferredLocales = null;
    @JsonProperty("shipping")
    private String shipping;
    @JsonProperty("sources")
    private Sources sources;
    @JsonProperty("subscriptions")
    private Subscriptions subscriptions;
    @JsonProperty("tax_exempt")
    private String taxExempt;
    @JsonProperty("tax_ids")
    private TaxIds taxIds;
    @JsonProperty("tax_info")
    private String taxInfo;
    @JsonProperty("tax_info_verification")
    private String taxInfoVerification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6052652014475014466L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("balance")
    public Integer getBalance() {
        return balance;
    }

    @JsonProperty("balance")
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @JsonProperty("created")
    public Integer getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(Integer created) {
        this.created = created;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("default_source")
    public String getDefaultSource() {
        return defaultSource;
    }

    @JsonProperty("default_source")
    public void setDefaultSource(String defaultSource) {
        this.defaultSource = defaultSource;
    }

    @JsonProperty("delinquent")
    public Boolean getDelinquent() {
        return delinquent;
    }

    @JsonProperty("delinquent")
    public void setDelinquent(Boolean delinquent) {
        this.delinquent = delinquent;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("discount")
    public Integer getDiscount() {
        return discount;
    }

    @JsonProperty("discount")
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    @JsonProperty("invoice_prefix")
    public String getInvoicePrefix() {
        return invoicePrefix;
    }

    @JsonProperty("invoice_prefix")
    public void setInvoicePrefix(String invoicePrefix) {
        this.invoicePrefix = invoicePrefix;
    }

    @JsonProperty("invoice_settings")
    public InvoiceSettings getInvoiceSettings() {
        return invoiceSettings;
    }

    @JsonProperty("invoice_settings")
    public void setInvoiceSettings(InvoiceSettings invoiceSettings) {
        this.invoiceSettings = invoiceSettings;
    }

    @JsonProperty("livemode")
    public Boolean getLivemode() {
        return livemode;
    }

    @JsonProperty("livemode")
    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("preferred_locales")
    public List<Object> getPreferredLocales() {
        return preferredLocales;
    }

    @JsonProperty("preferred_locales")
    public void setPreferredLocales(List<Object> preferredLocales) {
        this.preferredLocales = preferredLocales;
    }

    @JsonProperty("shipping")
    public String getShipping() {
        return shipping;
    }

    @JsonProperty("shipping")
    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    @JsonProperty("sources")
    public Sources getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(Sources sources) {
        this.sources = sources;
    }

    @JsonProperty("subscriptions")
    public Subscriptions getSubscriptions() {
        return subscriptions;
    }

    @JsonProperty("subscriptions")
    public void setSubscriptions(Subscriptions subscriptions) {
        this.subscriptions = subscriptions;
    }

    @JsonProperty("tax_exempt")
    public String getTaxExempt() {
        return taxExempt;
    }

    @JsonProperty("tax_exempt")
    public void setTaxExempt(String taxExempt) {
        this.taxExempt = taxExempt;
    }

    @JsonProperty("tax_ids")
    public TaxIds getTaxIds() {
        return taxIds;
    }

    @JsonProperty("tax_ids")
    public void setTaxIds(TaxIds taxIds) {
        this.taxIds = taxIds;
    }

    @JsonProperty("tax_info")
    public String getTaxInfo() {
        return taxInfo;
    }

    @JsonProperty("tax_info")
    public void setTaxInfo(String taxInfo) {
        this.taxInfo = taxInfo;
    }

    @JsonProperty("tax_info_verification")
    public String getTaxInfoVerification() {
        return taxInfoVerification;
    }

    @JsonProperty("tax_info_verification")
    public void setTaxInfoVerification(String taxInfoVerification) {
        this.taxInfoVerification = taxInfoVerification;
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
