
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
    "faculty",
    "profession",
    "education_type",
    "education_form",
    "yearend"
})
public class BaseEducationHistory {

    @JsonProperty("institute")
    private Institute institute;
    @JsonProperty("town")
    private Town__ town;
    @JsonProperty("faculty")
    private String faculty;
    @JsonProperty("profession")
    private String profession;
    @JsonProperty("education_type")
    private EducationType educationType;
    @JsonProperty("education_form")
    private EducationForm educationForm;
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
    public Institute getInstitute() {
        return institute;
    }

    /**
     * 
     * @param institute
     *     The institute
     */
    @JsonProperty("institute")
    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    /**
     * 
     * @return
     *     The town
     */
    @JsonProperty("town")
    public Town__ getTown() {
        return town;
    }

    /**
     * 
     * @param town
     *     The town
     */
    @JsonProperty("town")
    public void setTown(Town__ town) {
        this.town = town;
    }

    /**
     * 
     * @return
     *     The faculty
     */
    @JsonProperty("faculty")
    public String getFaculty() {
        return faculty;
    }

    /**
     * 
     * @param faculty
     *     The faculty
     */
    @JsonProperty("faculty")
    public void setFaculty(String faculty) {
        this.faculty = faculty;
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
     *     The educationType
     */
    @JsonProperty("education_type")
    public EducationType getEducationType() {
        return educationType;
    }

    /**
     * 
     * @param educationType
     *     The education_type
     */
    @JsonProperty("education_type")
    public void setEducationType(EducationType educationType) {
        this.educationType = educationType;
    }

    /**
     * 
     * @return
     *     The educationForm
     */
    @JsonProperty("education_form")
    public EducationForm getEducationForm() {
        return educationForm;
    }

    /**
     * 
     * @param educationForm
     *     The education_form
     */
    @JsonProperty("education_form")
    public void setEducationForm(EducationForm educationForm) {
        this.educationForm = educationForm;
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
