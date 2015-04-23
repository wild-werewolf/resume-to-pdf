
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
    "small",
    "100",
    "medium",
    "40",
    "500"
})
public class Photo {

    @JsonProperty("small")
    private String small;
    @JsonProperty("100")
    private String _100;
    @JsonProperty("medium")
    private String medium;
    @JsonProperty("40")
    private String _40;
    @JsonProperty("500")
    private String _500;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The small
     */
    @JsonProperty("small")
    public String getSmall() {
        return small;
    }

    /**
     * 
     * @param small
     *     The small
     */
    @JsonProperty("small")
    public void setSmall(String small) {
        this.small = small;
    }

    /**
     * 
     * @return
     *     The _100
     */
    @JsonProperty("100")
    public String get100() {
        return _100;
    }

    /**
     * 
     * @param _100
     *     The 100
     */
    @JsonProperty("100")
    public void set100(String _100) {
        this._100 = _100;
    }

    /**
     * 
     * @return
     *     The medium
     */
    @JsonProperty("medium")
    public String getMedium() {
        return medium;
    }

    /**
     * 
     * @param medium
     *     The medium
     */
    @JsonProperty("medium")
    public void setMedium(String medium) {
        this.medium = medium;
    }

    /**
     * 
     * @return
     *     The _40
     */
    @JsonProperty("40")
    public String get40() {
        return _40;
    }

    /**
     * 
     * @param _40
     *     The 40
     */
    @JsonProperty("40")
    public void set40(String _40) {
        this._40 = _40;
    }

    /**
     * 
     * @return
     *     The _500
     */
    @JsonProperty("500")
    public String get500() {
        return _500;
    }

    /**
     * 
     * @param _500
     *     The 500
     */
    @JsonProperty("500")
    public void set500(String _500) {
        this._500 = _500;
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
