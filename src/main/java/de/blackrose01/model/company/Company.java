package de.blackrose01.model.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Video game companies. Both publishers & developers
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "change_date_category")
    private int categoryChangeDate;
    @JsonIgnore
    @JsonProperty(value = "start_date_category")
    private int categoryStartDate;
    @JsonIgnore
    @JsonProperty(value = "country")
    private long country;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonIgnore
    @JsonProperty(value = "description")
    private String description;
    @JsonProperty(value = "developed")
    private List<Object> developed;
    @JsonProperty(value = "published")
    private List<Object> published;
    @JsonProperty(value = "parent")
    private Object parent;
    @JsonProperty(value = "logo")
    private Object logo;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonProperty(value = "websites")
    private List<Object> websites;
    @JsonIgnore
    @JsonProperty(value = "start_date")
    private long dateStart;
    @JsonProperty(value = "changed_company_id")
    private Object changedCompanyId;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Company() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCategoryChangeDate() {
        return categoryChangeDate;
    }

    public void setCategoryChangeDate(int categoryChangeDate) {
        this.categoryChangeDate = categoryChangeDate;
    }

    public int getCategoryStartDate() {
        return categoryStartDate;
    }

    public void setCategoryStartDate(int categoryStartDate) {
        this.categoryStartDate = categoryStartDate;
    }

    public long getCountry() {
        return country;
    }

    public void setCountry(long country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getDeveloped() {
        return new ObjectMapper().convertValue(developed, new TypeReference<List<Long>>(){});
    }

    public List<Game> getDevelopedObject() {
        return new ObjectMapper().convertValue(developed, new TypeReference<List<Game>>(){});
    }

    public void setDeveloped(List<Object> developed) {
        this.developed = developed;
    }

    public List<Long> getPublished() {
        return new ObjectMapper().convertValue(published, new TypeReference<List<Long>>(){});
    }

    public List<Game> getPublishedObject() {
        return new ObjectMapper().convertValue(published, new TypeReference<List<Game>>(){});
    }

    public void setPublished(List<Object> published) {
        this.published = published;
    }

    public long getParent() {
        return Long.parseLong(String.valueOf(parent));
    }

    public Company getParentObject() {
        return new ObjectMapper().convertValue(parent, Company.class);
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    public long getLogo() {
        return Long.parseLong(String.valueOf(logo));
    }

    public CompanyLogo getLogoObject() {
        return new ObjectMapper().convertValue(logo, CompanyLogo.class);
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Long> getWebsites() {
        return new ObjectMapper().convertValue(websites, new TypeReference<List<Long>>(){});
    }

    public List<CompanyWebsite> getWebsitesObject() {
        return new ObjectMapper().convertValue(websites, new TypeReference<List<CompanyWebsite>>(){});
    }

    public void setWebsites(List<Object> websites) {
        this.websites = websites;
    }

    public long getDateStart() {
        return dateStart;
    }

    public void setDateStart(long dateStart) {
        this.dateStart = dateStart;
    }

    public long getChangedCompanyId() {
        return Long.parseLong(String.valueOf(changedCompanyId));
    }

    public Company getChangedCompanyIdObject() {
        return new ObjectMapper().convertValue(changedCompanyId, Company.class);
    }

    public void setChangedCompanyId(Object changedCompanyId) {
        this.changedCompanyId = changedCompanyId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id &&
                categoryChangeDate == company.categoryChangeDate &&
                categoryStartDate == company.categoryStartDate &&
                country == company.country &&
                dateStart == company.dateStart &&
                createdAt == company.createdAt &&
                updatedAt == company.updatedAt &&
                Objects.equals(name, company.name) &&
                Objects.equals(slug, company.slug) &&
                Objects.equals(description, company.description) &&
                Objects.equals(developed, company.developed) &&
                Objects.equals(published, company.published) &&
                Objects.equals(parent, company.parent) &&
                Objects.equals(logo, company.logo) &&
                Objects.equals(url, company.url) &&
                Objects.equals(websites, company.websites) &&
                Objects.equals(changedCompanyId, company.changedCompanyId) &&
                Objects.equals(checksum, company.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryChangeDate, categoryStartDate, country, name, slug, description, developed, published, parent, logo, url, websites, dateStart, changedCompanyId, createdAt, updatedAt, checksum);
    }
}
