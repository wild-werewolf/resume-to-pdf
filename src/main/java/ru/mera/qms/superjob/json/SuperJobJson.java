
package ru.mera.qms.superjob.json;

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
    "id",
    "last_profession",
    "payment",
    "currency",
    "birthday",
    "birthmonth",
    "birthyear",
    "age",
    "metro",
    "address",
    "citizenship",
    "published",
    "draft",
    "photo",
    "photo_sizes",
    "moveable",
    "agreement",
    "receive_sms",
    "moveable_towns",
    "type_of_work",
    "place_of_work",
    "education",
    "children",
    "business_trip",
    "maritalstatus",
    "languages",
    "driving_licence",
    "catalogues",
    "town",
    "region",
    "experience_text",
    "experience_month_count",
    "work_history",
    "base_education_history",
    "education_history",
    "contacts_bought",
    "link",
    "gender",
    "achievements",
    "additional_info",
    "date_published",
    "date_last_modified",
    "profession",
    "is_archive",
    "id_user",
    "portfolio"
})
public class SuperJobJson {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("last_profession")
    private String lastProfession;
    @JsonProperty("payment")
    private Integer payment;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("birthday")
    private Integer birthday;
    @JsonProperty("birthmonth")
    private Integer birthmonth;
    @JsonProperty("birthyear")
    private Integer birthyear;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("metro")
    private List<Object> metro = new ArrayList<Object>();
    @JsonProperty("address")
    private String address;
    @JsonProperty("citizenship")
    private Citizenship citizenship;
    @JsonProperty("published")
    private Published published;
    @JsonProperty("draft")
    private Boolean draft;
    @JsonProperty("photo")
    private String photo;
    @JsonProperty("photo_sizes")
    private PhotoSizes photoSizes;
    @JsonProperty("moveable")
    private Boolean moveable;
    @JsonProperty("agreement")
    private Boolean agreement;
    @JsonProperty("receive_sms")
    private Boolean receiveSms;
    @JsonProperty("moveable_towns")
    private List<MoveableTown> moveableTowns = new ArrayList<MoveableTown>();
    @JsonProperty("type_of_work")
    private TypeOfWork typeOfWork;
    @JsonProperty("place_of_work")
    private PlaceOfWork placeOfWork;
    @JsonProperty("education")
    private Education education;
    @JsonProperty("children")
    private Children children;
    @JsonProperty("business_trip")
    private BusinessTrip businessTrip;
    @JsonProperty("maritalstatus")
    private Object maritalstatus;
    @JsonProperty("languages")
    private List<List<Language>> languages = new ArrayList<List<Language>>();
    @JsonProperty("driving_licence")
    private List<String> drivingLicence = new ArrayList<String>();
    @JsonProperty("catalogues")
    private List<Catalogue> catalogues = new ArrayList<Catalogue>();
    @JsonProperty("town")
    private Town town;
    @JsonProperty("region")
    private Region region;
    @JsonProperty("experience_text")
    private String experienceText;
    @JsonProperty("experience_month_count")
    private Integer experienceMonthCount;
    @JsonProperty("work_history")
    private List<WorkHistory> workHistory = new ArrayList<WorkHistory>();
    @JsonProperty("base_education_history")
    private List<BaseEducationHistory> baseEducationHistory = new ArrayList<BaseEducationHistory>();
    @JsonProperty("education_history")
    private List<EducationHistory> educationHistory = new ArrayList<EducationHistory>();
    @JsonProperty("contacts_bought")
    private Boolean contactsBought;
    @JsonProperty("link")
    private String link;
    @JsonProperty("gender")
    private Gender gender;
    @JsonProperty("achievements")
    private String achievements;
    @JsonProperty("additional_info")
    private String additionalInfo;
    @JsonProperty("date_published")
    private Integer datePublished;
    @JsonProperty("date_last_modified")
    private Integer dateLastModified;
    @JsonProperty("profession")
    private String profession;
    @JsonProperty("is_archive")
    private Boolean isArchive;
    @JsonProperty("id_user")
    private Integer idUser;
    @JsonProperty("portfolio")
    private List<Portfolio> portfolio = new ArrayList<Portfolio>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The lastProfession
     */
    @JsonProperty("last_profession")
    public String getLastProfession() {
        return lastProfession;
    }

    /**
     * 
     * @param lastProfession
     *     The last_profession
     */
    @JsonProperty("last_profession")
    public void setLastProfession(String lastProfession) {
        this.lastProfession = lastProfession;
    }

    /**
     * 
     * @return
     *     The payment
     */
    @JsonProperty("payment")
    public Integer getPayment() {
        return payment;
    }

    /**
     * 
     * @param payment
     *     The payment
     */
    @JsonProperty("payment")
    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The birthday
     */
    @JsonProperty("birthday")
    public Integer getBirthday() {
        return birthday;
    }

    /**
     * 
     * @param birthday
     *     The birthday
     */
    @JsonProperty("birthday")
    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    /**
     * 
     * @return
     *     The birthmonth
     */
    @JsonProperty("birthmonth")
    public Integer getBirthmonth() {
        return birthmonth;
    }

    /**
     * 
     * @param birthmonth
     *     The birthmonth
     */
    @JsonProperty("birthmonth")
    public void setBirthmonth(Integer birthmonth) {
        this.birthmonth = birthmonth;
    }

    /**
     * 
     * @return
     *     The birthyear
     */
    @JsonProperty("birthyear")
    public Integer getBirthyear() {
        return birthyear;
    }

    /**
     * 
     * @param birthyear
     *     The birthyear
     */
    @JsonProperty("birthyear")
    public void setBirthyear(Integer birthyear) {
        this.birthyear = birthyear;
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

    /**
     * 
     * @return
     *     The metro
     */
    @JsonProperty("metro")
    public List<Object> getMetro() {
        return metro;
    }

    /**
     * 
     * @param metro
     *     The metro
     */
    @JsonProperty("metro")
    public void setMetro(List<Object> metro) {
        this.metro = metro;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The citizenship
     */
    @JsonProperty("citizenship")
    public Citizenship getCitizenship() {
        return citizenship;
    }

    /**
     * 
     * @param citizenship
     *     The citizenship
     */
    @JsonProperty("citizenship")
    public void setCitizenship(Citizenship citizenship) {
        this.citizenship = citizenship;
    }

    /**
     * 
     * @return
     *     The published
     */
    @JsonProperty("published")
    public Published getPublished() {
        return published;
    }

    /**
     * 
     * @param published
     *     The published
     */
    @JsonProperty("published")
    public void setPublished(Published published) {
        this.published = published;
    }

    /**
     * 
     * @return
     *     The draft
     */
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    /**
     * 
     * @param draft
     *     The draft
     */
    @JsonProperty("draft")
    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    /**
     * 
     * @return
     *     The photo
     */
    @JsonProperty("photo")
    public String getPhoto() {
        return photo;
    }

    /**
     * 
     * @param photo
     *     The photo
     */
    @JsonProperty("photo")
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * 
     * @return
     *     The photoSizes
     */
    @JsonProperty("photo_sizes")
    public PhotoSizes getPhotoSizes() {
        return photoSizes;
    }

    /**
     * 
     * @param photoSizes
     *     The photo_sizes
     */
    @JsonProperty("photo_sizes")
    public void setPhotoSizes(PhotoSizes photoSizes) {
        this.photoSizes = photoSizes;
    }

    /**
     * 
     * @return
     *     The moveable
     */
    @JsonProperty("moveable")
    public Boolean getMoveable() {
        return moveable;
    }

    /**
     * 
     * @param moveable
     *     The moveable
     */
    @JsonProperty("moveable")
    public void setMoveable(Boolean moveable) {
        this.moveable = moveable;
    }

    /**
     * 
     * @return
     *     The agreement
     */
    @JsonProperty("agreement")
    public Boolean getAgreement() {
        return agreement;
    }

    /**
     * 
     * @param agreement
     *     The agreement
     */
    @JsonProperty("agreement")
    public void setAgreement(Boolean agreement) {
        this.agreement = agreement;
    }

    /**
     * 
     * @return
     *     The receiveSms
     */
    @JsonProperty("receive_sms")
    public Boolean getReceiveSms() {
        return receiveSms;
    }

    /**
     * 
     * @param receiveSms
     *     The receive_sms
     */
    @JsonProperty("receive_sms")
    public void setReceiveSms(Boolean receiveSms) {
        this.receiveSms = receiveSms;
    }

    /**
     * 
     * @return
     *     The moveableTowns
     */
    @JsonProperty("moveable_towns")
    public List<MoveableTown> getMoveableTowns() {
        return moveableTowns;
    }

    /**
     * 
     * @param moveableTowns
     *     The moveable_towns
     */
    @JsonProperty("moveable_towns")
    public void setMoveableTowns(List<MoveableTown> moveableTowns) {
        this.moveableTowns = moveableTowns;
    }

    /**
     * 
     * @return
     *     The typeOfWork
     */
    @JsonProperty("type_of_work")
    public TypeOfWork getTypeOfWork() {
        return typeOfWork;
    }

    /**
     * 
     * @param typeOfWork
     *     The type_of_work
     */
    @JsonProperty("type_of_work")
    public void setTypeOfWork(TypeOfWork typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    /**
     * 
     * @return
     *     The placeOfWork
     */
    @JsonProperty("place_of_work")
    public PlaceOfWork getPlaceOfWork() {
        return placeOfWork;
    }

    /**
     * 
     * @param placeOfWork
     *     The place_of_work
     */
    @JsonProperty("place_of_work")
    public void setPlaceOfWork(PlaceOfWork placeOfWork) {
        this.placeOfWork = placeOfWork;
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
     *     The children
     */
    @JsonProperty("children")
    public Children getChildren() {
        return children;
    }

    /**
     * 
     * @param children
     *     The children
     */
    @JsonProperty("children")
    public void setChildren(Children children) {
        this.children = children;
    }

    /**
     * 
     * @return
     *     The businessTrip
     */
    @JsonProperty("business_trip")
    public BusinessTrip getBusinessTrip() {
        return businessTrip;
    }

    /**
     * 
     * @param businessTrip
     *     The business_trip
     */
    @JsonProperty("business_trip")
    public void setBusinessTrip(BusinessTrip businessTrip) {
        this.businessTrip = businessTrip;
    }

    /**
     * 
     * @return
     *     The maritalstatus
     */
    @JsonProperty("maritalstatus")
    public Object getMaritalstatus() {
        return maritalstatus;
    }

    /**
     * 
     * @param maritalstatus
     *     The maritalstatus
     */
    @JsonProperty("maritalstatus")
    public void setMaritalstatus(Object maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    /**
     * 
     * @return
     *     The languages
     */
    @JsonProperty("languages")
    public List<List<Language>> getLanguages() {
        return languages;
    }

    /**
     * 
     * @param languages
     *     The languages
     */
    @JsonProperty("languages")
    public void setLanguages(List<List<Language>> languages) {
        this.languages = languages;
    }

    /**
     * 
     * @return
     *     The drivingLicence
     */
    @JsonProperty("driving_licence")
    public List<String> getDrivingLicence() {
        return drivingLicence;
    }

    /**
     * 
     * @param drivingLicence
     *     The driving_licence
     */
    @JsonProperty("driving_licence")
    public void setDrivingLicence(List<String> drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    /**
     * 
     * @return
     *     The catalogues
     */
    @JsonProperty("catalogues")
    public List<Catalogue> getCatalogues() {
        return catalogues;
    }

    /**
     * 
     * @param catalogues
     *     The catalogues
     */
    @JsonProperty("catalogues")
    public void setCatalogues(List<Catalogue> catalogues) {
        this.catalogues = catalogues;
    }

    /**
     * 
     * @return
     *     The town
     */
    @JsonProperty("town")
    public Town getTown() {
        return town;
    }

    /**
     * 
     * @param town
     *     The town
     */
    @JsonProperty("town")
    public void setTown(Town town) {
        this.town = town;
    }

    /**
     * 
     * @return
     *     The region
     */
    @JsonProperty("region")
    public Region getRegion() {
        return region;
    }

    /**
     * 
     * @param region
     *     The region
     */
    @JsonProperty("region")
    public void setRegion(Region region) {
        this.region = region;
    }

    /**
     * 
     * @return
     *     The experienceText
     */
    @JsonProperty("experience_text")
    public String getExperienceText() {
        return experienceText;
    }

    /**
     * 
     * @param experienceText
     *     The experience_text
     */
    @JsonProperty("experience_text")
    public void setExperienceText(String experienceText) {
        this.experienceText = experienceText;
    }

    /**
     * 
     * @return
     *     The experienceMonthCount
     */
    @JsonProperty("experience_month_count")
    public Integer getExperienceMonthCount() {
        return experienceMonthCount;
    }

    /**
     * 
     * @param experienceMonthCount
     *     The experience_month_count
     */
    @JsonProperty("experience_month_count")
    public void setExperienceMonthCount(Integer experienceMonthCount) {
        this.experienceMonthCount = experienceMonthCount;
    }

    /**
     * 
     * @return
     *     The workHistory
     */
    @JsonProperty("work_history")
    public List<WorkHistory> getWorkHistory() {
        return workHistory;
    }

    /**
     * 
     * @param workHistory
     *     The work_history
     */
    @JsonProperty("work_history")
    public void setWorkHistory(List<WorkHistory> workHistory) {
        this.workHistory = workHistory;
    }

    /**
     * 
     * @return
     *     The baseEducationHistory
     */
    @JsonProperty("base_education_history")
    public List<BaseEducationHistory> getBaseEducationHistory() {
        return baseEducationHistory;
    }

    /**
     * 
     * @param baseEducationHistory
     *     The base_education_history
     */
    @JsonProperty("base_education_history")
    public void setBaseEducationHistory(List<BaseEducationHistory> baseEducationHistory) {
        this.baseEducationHistory = baseEducationHistory;
    }

    /**
     * 
     * @return
     *     The educationHistory
     */
    @JsonProperty("education_history")
    public List<EducationHistory> getEducationHistory() {
        return educationHistory;
    }

    /**
     * 
     * @param educationHistory
     *     The education_history
     */
    @JsonProperty("education_history")
    public void setEducationHistory(List<EducationHistory> educationHistory) {
        this.educationHistory = educationHistory;
    }

    /**
     * 
     * @return
     *     The contactsBought
     */
    @JsonProperty("contacts_bought")
    public Boolean getContactsBought() {
        return contactsBought;
    }

    /**
     * 
     * @param contactsBought
     *     The contacts_bought
     */
    @JsonProperty("contacts_bought")
    public void setContactsBought(Boolean contactsBought) {
        this.contactsBought = contactsBought;
    }

    /**
     * 
     * @return
     *     The link
     */
    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
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
     *     The achievements
     */
    @JsonProperty("achievements")
    public String getAchievements() {
        return achievements;
    }

    /**
     * 
     * @param achievements
     *     The achievements
     */
    @JsonProperty("achievements")
    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    /**
     * 
     * @return
     *     The additionalInfo
     */
    @JsonProperty("additional_info")
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * 
     * @param additionalInfo
     *     The additional_info
     */
    @JsonProperty("additional_info")
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * 
     * @return
     *     The datePublished
     */
    @JsonProperty("date_published")
    public Integer getDatePublished() {
        return datePublished;
    }

    /**
     * 
     * @param datePublished
     *     The date_published
     */
    @JsonProperty("date_published")
    public void setDatePublished(Integer datePublished) {
        this.datePublished = datePublished;
    }

    /**
     * 
     * @return
     *     The dateLastModified
     */
    @JsonProperty("date_last_modified")
    public Integer getDateLastModified() {
        return dateLastModified;
    }

    /**
     * 
     * @param dateLastModified
     *     The date_last_modified
     */
    @JsonProperty("date_last_modified")
    public void setDateLastModified(Integer dateLastModified) {
        this.dateLastModified = dateLastModified;
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
     *     The isArchive
     */
    @JsonProperty("is_archive")
    public Boolean getIsArchive() {
        return isArchive;
    }

    /**
     * 
     * @param isArchive
     *     The is_archive
     */
    @JsonProperty("is_archive")
    public void setIsArchive(Boolean isArchive) {
        this.isArchive = isArchive;
    }

    /**
     * 
     * @return
     *     The idUser
     */
    @JsonProperty("id_user")
    public Integer getIdUser() {
        return idUser;
    }

    /**
     * 
     * @param idUser
     *     The id_user
     */
    @JsonProperty("id_user")
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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
