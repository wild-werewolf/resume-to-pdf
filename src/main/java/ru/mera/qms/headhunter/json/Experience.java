
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
    "industries",
    "end",
    "description",
    "area",
    "company_url",
    "industry",
    "company_id",
    "employer",
    "start",
    "position",
    "company"
})
public class Experience {

    @JsonProperty("industries")
    private List<Industry> industries = new ArrayList<Industry>();
    @JsonProperty("end")
    private Object end;
    @JsonProperty("description")
    private String description;
    @JsonProperty("area")
    private Area__ area;
    @JsonProperty("company_url")
    private String companyUrl;
    @JsonProperty("industry")
    private Object industry;
    @JsonProperty("company_id")
    private String companyId;
    @JsonProperty("employer")
    private Employer employer;
    @JsonProperty("start")
    private String start;
    @JsonProperty("position")
    private String position;
    @JsonProperty("company")
    private String company;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The industries
     */
    @JsonProperty("industries")
    public List<Industry> getIndustries() {
        return industries;
    }

    /**
     * 
     * @param industries
     *     The industries
     */
    @JsonProperty("industries")
    public void setIndustries(List<Industry> industries) {
        this.industries = industries;
    }

    /**
     * 
     * @return
     *     The end
     */
    @JsonProperty("end")
    public Object getEnd() {
        return end;
    }

    /**
     * 
     * @param end
     *     The end
     */
    @JsonProperty("end")
    public void setEnd(Object end) {
        this.end = end;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The area
     */
    @JsonProperty("area")
    public Area__ getArea() {
        return area;
    }

    /**
     * 
     * @param area
     *     The area
     */
    @JsonProperty("area")
    public void setArea(Area__ area) {
        this.area = area;
    }

    /**
     * 
     * @return
     *     The companyUrl
     */
    @JsonProperty("company_url")
    public String getCompanyUrl() {
        return companyUrl;
    }

    /**
     * 
     * @param companyUrl
     *     The company_url
     */
    @JsonProperty("company_url")
    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    /**
     * 
     * @return
     *     The industry
     */
    @JsonProperty("industry")
    public Object getIndustry() {
        return industry;
    }

    /**
     * 
     * @param industry
     *     The industry
     */
    @JsonProperty("industry")
    public void setIndustry(Object industry) {
        this.industry = industry;
    }

    /**
     * 
     * @return
     *     The companyId
     */
    @JsonProperty("company_id")
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 
     * @param companyId
     *     The company_id
     */
    @JsonProperty("company_id")
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 
     * @return
     *     The employer
     */
    @JsonProperty("employer")
    public Employer getEmployer() {
        return employer;
    }

    /**
     * 
     * @param employer
     *     The employer
     */
    @JsonProperty("employer")
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    /**
     * 
     * @return
     *     The start
     */
    @JsonProperty("start")
    public String getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    @JsonProperty("start")
    public void setStart(String start) {
        this.start = start;
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

    /**
     * 
     * @return
     *     The company
     */
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
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
