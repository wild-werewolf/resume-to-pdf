
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
    "profarea_id",
    "profarea_name",
    "id",
    "name"
})
public class Specialization {

    @JsonProperty("profarea_id")
    private String profareaId;
    @JsonProperty("profarea_name")
    private String profareaName;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The profareaId
     */
    @JsonProperty("profarea_id")
    public String getProfareaId() {
        return profareaId;
    }

    /**
     * 
     * @param profareaId
     *     The profarea_id
     */
    @JsonProperty("profarea_id")
    public void setProfareaId(String profareaId) {
        this.profareaId = profareaId;
    }

    /**
     * 
     * @return
     *     The profareaName
     */
    @JsonProperty("profarea_name")
    public String getProfareaName() {
        return profareaName;
    }

    /**
     * 
     * @param profareaName
     *     The profarea_name
     */
    @JsonProperty("profarea_name")
    public void setProfareaName(String profareaName) {
        this.profareaName = profareaName;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
