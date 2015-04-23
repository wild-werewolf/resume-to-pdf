
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
    "comment",
    "type",
    "preferred",
    "value"
})
public class Contact {

    @JsonProperty("comment")
    private Object comment;
    @JsonProperty("type")
    private Type__ type;
    @JsonProperty("preferred")
    private Boolean preferred;
    @JsonProperty("value")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The comment
     */
    @JsonProperty("comment")
    public Object getComment() {
        return comment;
    }

    /**
     * 
     * @param comment
     *     The comment
     */
    @JsonProperty("comment")
    public void setComment(Object comment) {
        this.comment = comment;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Type__ getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Type__ type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The preferred
     */
    @JsonProperty("preferred")
    public Boolean getPreferred() {
        return preferred;
    }

    /**
     * 
     * @param preferred
     *     The preferred
     */
    @JsonProperty("preferred")
    public void setPreferred(Boolean preferred) {
        this.preferred = preferred;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
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
