
package ru.mera.qms.superjob.json;

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
    "institute",
    "town",
    "townName",
    "name",
    "yearend"
})
public class EducationHistory {

    @JsonProperty("institute")
    private String institute;
    @JsonProperty("town")
    private Town___ town;
    @JsonProperty("townName")
    private String townName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("yearend")
    private Integer yearend;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The institute
     */
    @JsonProperty("institute")
    public String getInstitute() {
        return institute;
    }

    /**
     * 
     * @param institute
     *     The institute
     */
    @JsonProperty("institute")
    public void setInstitute(String institute) {
        this.institute = institute;
    }

    /**
     * 
     * @return
     *     The town
     */
    @JsonProperty("town")
    public Town___ getTown() {
        return town;
    }

    /**
     * 
     * @param town
     *     The town
     */
    @JsonProperty("town")
    public void setTown(Town___ town) {
        this.town = town;
    }

    /**
     * 
     * @return
     *     The townName
     */
    @JsonProperty("townName")
    public String getTownName() {
        return townName;
    }

    /**
     * 
     * @param townName
     *     The townName
     */
    @JsonProperty("townName")
    public void setTownName(String townName) {
        this.townName = townName;
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
     *     The yearend
     */
    @JsonProperty("yearend")
    public Integer getYearend() {
        return yearend;
    }

    /**
     * 
     * @param yearend
     *     The yearend
     */
    @JsonProperty("yearend")
    public void setYearend(Integer yearend) {
        this.yearend = yearend;
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
