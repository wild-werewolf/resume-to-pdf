
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
    "town",
    "townName",
    "name",
    "profession",
    "work",
    "type",
    "monthbeg",
    "monthend",
    "yearbeg",
    "yearend"
})
public class WorkHistory {

    @JsonProperty("town")
    private Town_ town;
    @JsonProperty("townName")
    private String townName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("profession")
    private String profession;
    @JsonProperty("work")
    private String work;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("monthbeg")
    private Integer monthbeg;
    @JsonProperty("monthend")
    private Object monthend;
    @JsonProperty("yearbeg")
    private Integer yearbeg;
    @JsonProperty("yearend")
    private Object yearend;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The town
     */
    @JsonProperty("town")
    public Town_ getTown() {
        return town;
    }

    /**
     * 
     * @param town
     *     The town
     */
    @JsonProperty("town")
    public void setTown(Town_ town) {
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
     *     The profession
     */
    @JsonProperty("profession")
    public String getProfession() {
        return profession;
    }

    /**
     * 
     * @param profession
     *     The profession
     */
    @JsonProperty("profession")
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * 
     * @return
     *     The work
     */
    @JsonProperty("work")
    public String getWork() {
        return work;
    }

    /**
     * 
     * @param work
     *     The work
     */
    @JsonProperty("work")
    public void setWork(String work) {
        this.work = work;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The monthbeg
     */
    @JsonProperty("monthbeg")
    public Integer getMonthbeg() {
        return monthbeg;
    }

    /**
     * 
     * @param monthbeg
     *     The monthbeg
     */
    @JsonProperty("monthbeg")
    public void setMonthbeg(Integer monthbeg) {
        this.monthbeg = monthbeg;
    }

    /**
     * 
     * @return
     *     The monthend
     */
    @JsonProperty("monthend")
    public Object getMonthend() {
        return monthend;
    }

    /**
     * 
     * @param monthend
     *     The monthend
     */
    @JsonProperty("monthend")
    public void setMonthend(Object monthend) {
        this.monthend = monthend;
    }

    /**
     * 
     * @return
     *     The yearbeg
     */
    @JsonProperty("yearbeg")
    public Integer getYearbeg() {
        return yearbeg;
    }

    /**
     * 
     * @param yearbeg
     *     The yearbeg
     */
    @JsonProperty("yearbeg")
    public void setYearbeg(Integer yearbeg) {
        this.yearbeg = yearbeg;
    }

    /**
     * 
     * @return
     *     The yearend
     */
    @JsonProperty("yearend")
    public Object getYearend() {
        return yearend;
    }

    /**
     * 
     * @param yearend
     *     The yearend
     */
    @JsonProperty("yearend")
    public void setYearend(Object yearend) {
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
