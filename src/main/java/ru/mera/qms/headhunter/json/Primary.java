
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
    "organization_id",
    "name_id",
    "name",
    "year",
    "organization",
    "result_id",
    "result"
})
public class Primary {

    @JsonProperty("organization_id")
    private Object organizationId;
    @JsonProperty("name_id")
    private String nameId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("organization")
    private String organization;
    @JsonProperty("result_id")
    private Object resultId;
    @JsonProperty("result")
    private String result;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The organizationId
     */
    @JsonProperty("organization_id")
    public Object getOrganizationId() {
        return organizationId;
    }

    /**
     * 
     * @param organizationId
     *     The organization_id
     */
    @JsonProperty("organization_id")
    public void setOrganizationId(Object organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * 
     * @return
     *     The nameId
     */
    @JsonProperty("name_id")
    public String getNameId() {
        return nameId;
    }

    /**
     * 
     * @param nameId
     *     The name_id
     */
    @JsonProperty("name_id")
    public void setNameId(String nameId) {
        this.nameId = nameId;
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
     *     The year
     */
    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    @JsonProperty("year")
    public void setYear(Integer year) {
        this.year = year;
    }

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
     *     The resultId
     */
    @JsonProperty("result_id")
    public Object getResultId() {
        return resultId;
    }

    /**
     * 
     * @param resultId
     *     The result_id
     */
    @JsonProperty("result_id")
    public void setResultId(Object resultId) {
        this.resultId = resultId;
    }

    /**
     * 
     * @return
     *     The result
     */
    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
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
