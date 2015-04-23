
package ru.mera.qms.headhunter.json;

import java.util.ArrayList;
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
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "elementary",
    "additional",
    "attestation",
    "primary",
    "level"
})
public class Education {

    @JsonProperty("elementary")
    private List<Object> elementary = new ArrayList<Object>();
    @JsonProperty("additional")
    private List<Additional> additional = new ArrayList<Additional>();
    @JsonProperty("attestation")
    private List<Attestation> attestation = new ArrayList<Attestation>();
    @JsonProperty("primary")
    private List<Primary> primary = new ArrayList<Primary>();
    @JsonProperty("level")
    private Level level;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The elementary
     */
    @JsonProperty("elementary")
    public List<Object> getElementary() {
        return elementary;
    }

    /**
     * 
     * @param elementary
     *     The elementary
     */
    @JsonProperty("elementary")
    public void setElementary(List<Object> elementary) {
        this.elementary = elementary;
    }

    /**
     * 
     * @return
     *     The additional
     */
    @JsonProperty("additional")
    public List<Additional> getAdditional() {
        return additional;
    }

    /**
     * 
     * @param additional
     *     The additional
     */
    @JsonProperty("additional")
    public void setAdditional(List<Additional> additional) {
        this.additional = additional;
    }

    /**
     * 
     * @return
     *     The attestation
     */
    @JsonProperty("attestation")
    public List<Attestation> getAttestation() {
        return attestation;
    }

    /**
     * 
     * @param attestation
     *     The attestation
     */
    @JsonProperty("attestation")
    public void setAttestation(List<Attestation> attestation) {
        this.attestation = attestation;
    }

    /**
     * 
     * @return
     *     The primary
     */
    @JsonProperty("primary")
    public List<Primary> getPrimary() {
        return primary;
    }

    /**
     * 
     * @param primary
     *     The primary
     */
    @JsonProperty("primary")
    public void setPrimary(List<Primary> primary) {
        this.primary = primary;
    }

    /**
     * 
     * @return
     *     The level
     */
    @JsonProperty("level")
    public Level getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    @JsonProperty("level")
    public void setLevel(Level level) {
        this.level = level;
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
