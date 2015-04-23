
package ru.mera.qms.headhunter.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "organization",
    "contact",
    "name",
    "position"
})
public class Recommendation {

    @JsonProperty("organization")
    private String organization;
    @JsonProperty("contact")
    private String contact;
    @JsonProperty("name")
    private String name;
    @JsonProperty("position")
    private String position;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The organization
     */
    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    /**
     * 
     * @param organization
     *     The organization
     */
    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * 
     * @return
     *     The contact
     */
    @JsonProperty("contact")
    public String getContact() {
        return contact;
    }

    /**
     * 
     * @param contact
     *     The contact
     */
    @JsonProperty("contact")
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The position
     */
    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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
