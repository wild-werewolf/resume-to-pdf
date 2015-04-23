
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
    "created_at",
    "last_name",
    "citizenship",
    "resume_locale",
    "photo",
    "business_trip_readiness",
    "new_views",
    "site",
    "travel_time",
    "recommendation",
    "alternate_url",
    "education",
    "employment",
    "id",
    "blocked",
    "first_name",
    "middle_name",
    "specialization",
    "certificate",
    "area",
    "relocation",
    "work_ticket",
    "employments",
    "status",
    "_progress",
    "schedule",
    "total_views",
    "updated_at",
    "finished",
    "skill_set",
    "portfolio",
    "schedules",
    "salary",
    "metro",
    "language",
    "skills",
    "gender",
    "next_publish_at",
    "title",
    "experience",
    "views_url",
    "contact",
    "birth_date",
    "age"
})
public class HeadHunterJson {

    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("citizenship")
    private List<Citizenship> citizenship = new ArrayList<Citizenship>();
    @JsonProperty("resume_locale")
    private ResumeLocale resumeLocale;
    @JsonProperty("photo")
    private Photo photo;
    @JsonProperty("business_trip_readiness")
    private BusinessTripReadiness businessTripReadiness;
    @JsonProperty("new_views")
    private Object newViews;
    @JsonProperty("site")
    private List<Site> site = new ArrayList<Site>();
    @JsonProperty("travel_time")
    private TravelTime travelTime;
    @JsonProperty("recommendation")
    private List<Recommendation> recommendation = new ArrayList<Recommendation>();
    @JsonProperty("alternate_url")
    private String alternateUrl;
    @JsonProperty("education")
    private Education education;
    @JsonProperty("employment")
    private Employment employment;
    @JsonProperty("id")
    private String id;
    @JsonProperty("blocked")
    private Object blocked;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("specialization")
    private List<Specialization> specialization = new ArrayList<Specialization>();
    @JsonProperty("certificate")
    private List<Certificate> certificate = new ArrayList<Certificate>();
    @JsonProperty("area")
    private Area area;
    @JsonProperty("relocation")
    private Relocation relocation;
    @JsonProperty("work_ticket")
    private List<WorkTicket> workTicket = new ArrayList<WorkTicket>();
    @JsonProperty("employments")
    private List<Employment_> employments = new ArrayList<Employment_>();
    @JsonProperty("status")
    private Object status;
    @JsonProperty("_progress")
    private Object Progress;
    @JsonProperty("schedule")
    private Schedule schedule;
    @JsonProperty("total_views")
    private Object totalViews;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("finished")
    private Object finished;
    @JsonProperty("skill_set")
    private List<String> skillSet = new ArrayList<String>();
    @JsonProperty("portfolio")
    private List<Portfolio> portfolio = new ArrayList<Portfolio>();
    @JsonProperty("schedules")
    private List<Schedule_> schedules = new ArrayList<Schedule_>();
    @JsonProperty("salary")
    private Salary salary;
    @JsonProperty("metro")
    private Object metro;
    @JsonProperty("language")
    private List<Language> language = new ArrayList<Language>();
    @JsonProperty("skills")
    private String skills;
    @JsonProperty("gender")
    private Gender gender;
    @JsonProperty("next_publish_at")
    private Object nextPublishAt;
    @JsonProperty("title")
    private String title;
    @JsonProperty("experience")
    private List<Experience> experience = new ArrayList<Experience>();
    @JsonProperty("views_url")
    private Object viewsUrl;
    @JsonProperty("contact")
    private List<Contact> contact = new ArrayList<Contact>();
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("age")
    private Integer age;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The citizenship
     */
    @JsonProperty("citizenship")
    public List<Citizenship> getCitizenship() {
        return citizenship;
    }

    /**
     * 
     * @param citizenship
     *     The citizenship
     */
    @JsonProperty("citizenship")
    public void setCitizenship(List<Citizenship> citizenship) {
        this.citizenship = citizenship;
    }

    /**
     * 
     * @return
     *     The resumeLocale
     */
    @JsonProperty("resume_locale")
    public ResumeLocale getResumeLocale() {
        return resumeLocale;
    }

    /**
     * 
     * @param resumeLocale
     *     The resume_locale
     */
    @JsonProperty("resume_locale")
    public void setResumeLocale(ResumeLocale resumeLocale) {
        this.resumeLocale = resumeLocale;
    }

    /**
     * 
     * @return
     *     The photo
     */
    @JsonProperty("photo")
    public Photo getPhoto() {
        return photo;
    }

    /**
     * 
     * @param photo
     *     The photo
     */
    @JsonProperty("photo")
    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    /**
     * 
     * @return
     *     The businessTripReadiness
     */
    @JsonProperty("business_trip_readiness")
    public BusinessTripReadiness getBusinessTripReadiness() {
        return businessTripReadiness;
    }

    /**
     * 
     * @param businessTripReadiness
     *     The business_trip_readiness
     */
    @JsonProperty("business_trip_readiness")
    public void setBusinessTripReadiness(BusinessTripReadiness businessTripReadiness) {
        this.businessTripReadiness = businessTripReadiness;
    }

    /**
     * 
     * @return
     *     The newViews
     */
    @JsonProperty("new_views")
    public Object getNewViews() {
        return newViews;
    }

    /**
     * 
     * @param newViews
     *     The new_views
     */
    @JsonProperty("new_views")
    public void setNewViews(Object newViews) {
        this.newViews = newViews;
    }

    /**
     * 
     * @return
     *     The site
     */
    @JsonProperty("site")
    public List<Site> getSite() {
        return site;
    }

    /**
     * 
     * @param site
     *     The site
     */
    @JsonProperty("site")
    public void setSite(List<Site> site) {
        this.site = site;
    }

    /**
     * 
     * @return
     *     The travelTime
     */
    @JsonProperty("travel_time")
    public TravelTime getTravelTime() {
        return travelTime;
    }

    /**
     * 
     * @param travelTime
     *     The travel_time
     */
    @JsonProperty("travel_time")
    public void setTravelTime(TravelTime travelTime) {
        this.travelTime = travelTime;
    }

    /**
     * 
     * @return
     *     The recommendation
     */
    @JsonProperty("recommendation")
    public List<Recommendation> getRecommendation() {
        return recommendation;
    }

    /**
     * 
     * @param recommendation
     *     The recommendation
     */
    @JsonProperty("recommendation")
    public void setRecommendation(List<Recommendation> recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * 
     * @return
     *     The alternateUrl
     */
    @JsonProperty("alternate_url")
    public String getAlternateUrl() {
        return alternateUrl;
    }

    /**
     * 
     * @param alternateUrl
     *     The alternate_url
     */
    @JsonProperty("alternate_url")
    public void setAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
    }

    /**
     * 
     * @return
     *     The education
     */
    @JsonProperty("education")
    public Education getEducation() {
        return education;
    }

    /**
     * 
     * @param education
     *     The education
     */
    @JsonProperty("education")
    public void setEducation(Education education) {
        this.education = education;
    }

    /**
     * 
     * @return
     *     The employment
     */
    @JsonProperty("employment")
    public Employment getEmployment() {
        return employment;
    }

    /**
     * 
     * @param employment
     *     The employment
     */
    @JsonProperty("employment")
    public void setEmployment(Employment employment) {
        this.employment = employment;
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
     *     The blocked
     */
    @JsonProperty("blocked")
    public Object getBlocked() {
        return blocked;
    }

    /**
     * 
     * @param blocked
     *     The blocked
     */
    @JsonProperty("blocked")
    public void setBlocked(Object blocked) {
        this.blocked = blocked;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The middleName
     */
    @JsonProperty("middle_name")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * 
     * @param middleName
     *     The middle_name
     */
    @JsonProperty("middle_name")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * 
     * @return
     *     The specialization
     */
    @JsonProperty("specialization")
    public List<Specialization> getSpecialization() {
        return specialization;
    }

    /**
     * 
     * @param specialization
     *     The specialization
     */
    @JsonProperty("specialization")
    public void setSpecialization(List<Specialization> specialization) {
        this.specialization = specialization;
    }

    /**
     * 
     * @return
     *     The certificate
     */
    @JsonProperty("certificate")
    public List<Certificate> getCertificate() {
        return certificate;
    }

    /**
     * 
     * @param certificate
     *     The certificate
     */
    @JsonProperty("certificate")
    public void setCertificate(List<Certificate> certificate) {
        this.certificate = certificate;
    }

    /**
     * 
     * @return
     *     The area
     */
    @JsonProperty("area")
    public Area getArea() {
        return area;
    }

    /**
     * 
     * @param area
     *     The area
     */
    @JsonProperty("area")
    public void setArea(Area area) {
        this.area = area;
    }

    /**
     * 
     * @return
     *     The relocation
     */
    @JsonProperty("relocation")
    public Relocation getRelocation() {
        return relocation;
    }

    /**
     * 
     * @param relocation
     *     The relocation
     */
    @JsonProperty("relocation")
    public void setRelocation(Relocation relocation) {
        this.relocation = relocation;
    }

    /**
     * 
     * @return
     *     The workTicket
     */
    @JsonProperty("work_ticket")
    public List<WorkTicket> getWorkTicket() {
        return workTicket;
    }

    /**
     * 
     * @param workTicket
     *     The work_ticket
     */
    @JsonProperty("work_ticket")
    public void setWorkTicket(List<WorkTicket> workTicket) {
        this.workTicket = workTicket;
    }

    /**
     * 
     * @return
     *     The employments
     */
    @JsonProperty("employments")
    public List<Employment_> getEmployments() {
        return employments;
    }

    /**
     * 
     * @param employments
     *     The employments
     */
    @JsonProperty("employments")
    public void setEmployments(List<Employment_> employments) {
        this.employments = employments;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The Progress
     */
    @JsonProperty("_progress")
    public Object getProgress() {
        return Progress;
    }

    /**
     * 
     * @param Progress
     *     The _progress
     */
    @JsonProperty("_progress")
    public void setProgress(Object Progress) {
        this.Progress = Progress;
    }

    /**
     * 
     * @return
     *     The schedule
     */
    @JsonProperty("schedule")
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * 
     * @param schedule
     *     The schedule
     */
    @JsonProperty("schedule")
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * 
     * @return
     *     The totalViews
     */
    @JsonProperty("total_views")
    public Object getTotalViews() {
        return totalViews;
    }

    /**
     * 
     * @param totalViews
     *     The total_views
     */
    @JsonProperty("total_views")
    public void setTotalViews(Object totalViews) {
        this.totalViews = totalViews;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * @return
     *     The finished
     */
    @JsonProperty("finished")
    public Object getFinished() {
        return finished;
    }

    /**
     * 
     * @param finished
     *     The finished
     */
    @JsonProperty("finished")
    public void setFinished(Object finished) {
        this.finished = finished;
    }

    /**
     * 
     * @return
     *     The skillSet
     */
    @JsonProperty("skill_set")
    public List<String> getSkillSet() {
        return skillSet;
    }

    /**
     * 
     * @param skillSet
     *     The skill_set
     */
    @JsonProperty("skill_set")
    public void setSkillSet(List<String> skillSet) {
        this.skillSet = skillSet;
    }

    /**
     * 
     * @return
     *     The portfolio
     */
    @JsonProperty("portfolio")
    public List<Portfolio> getPortfolio() {
        return portfolio;
    }

    /**
     * 
     * @param portfolio
     *     The portfolio
     */
    @JsonProperty("portfolio")
    public void setPortfolio(List<Portfolio> portfolio) {
        this.portfolio = portfolio;
    }

    /**
     * 
     * @return
     *     The schedules
     */
    @JsonProperty("schedules")
    public List<Schedule_> getSchedules() {
        return schedules;
    }

    /**
     * 
     * @param schedules
     *     The schedules
     */
    @JsonProperty("schedules")
    public void setSchedules(List<Schedule_> schedules) {
        this.schedules = schedules;
    }

    /**
     * 
     * @return
     *     The salary
     */
    @JsonProperty("salary")
    public Salary getSalary() {
        return salary;
    }

    /**
     * 
     * @param salary
     *     The salary
     */
    @JsonProperty("salary")
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    /**
     * 
     * @return
     *     The metro
     */
    @JsonProperty("metro")
    public Object getMetro() {
        return metro;
    }

    /**
     * 
     * @param metro
     *     The metro
     */
    @JsonProperty("metro")
    public void setMetro(Object metro) {
        this.metro = metro;
    }

    /**
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public List<Language> getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(List<Language> language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The skills
     */
    @JsonProperty("skills")
    public String getSkills() {
        return skills;
    }

    /**
     * 
     * @param skills
     *     The skills
     */
    @JsonProperty("skills")
    public void setSkills(String skills) {
        this.skills = skills;
    }

    /**
     * 
     * @return
     *     The gender
     */
    @JsonProperty("gender")
    public Gender getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    @JsonProperty("gender")
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     *     The nextPublishAt
     */
    @JsonProperty("next_publish_at")
    public Object getNextPublishAt() {
        return nextPublishAt;
    }

    /**
     * 
     * @param nextPublishAt
     *     The next_publish_at
     */
    @JsonProperty("next_publish_at")
    public void setNextPublishAt(Object nextPublishAt) {
        this.nextPublishAt = nextPublishAt;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The experience
     */
    @JsonProperty("experience")
    public List<Experience> getExperience() {
        return experience;
    }

    /**
     * 
     * @param experience
     *     The experience
     */
    @JsonProperty("experience")
    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    /**
     * 
     * @return
     *     The viewsUrl
     */
    @JsonProperty("views_url")
    public Object getViewsUrl() {
        return viewsUrl;
    }

    /**
     * 
     * @param viewsUrl
     *     The views_url
     */
    @JsonProperty("views_url")
    public void setViewsUrl(Object viewsUrl) {
        this.viewsUrl = viewsUrl;
    }

    /**
     * 
     * @return
     *     The contact
     */
    @JsonProperty("contact")
    public List<Contact> getContact() {
        return contact;
    }

    /**
     * 
     * @param contact
     *     The contact
     */
    @JsonProperty("contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    /**
     * 
     * @return
     *     The birthDate
     */
    @JsonProperty("birth_date")
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 
     * @param birthDate
     *     The birth_date
     */
    @JsonProperty("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 
     * @return
     *     The age
     */
    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    /**
     * 
     * @param age
     *     The age
     */
    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
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
