package de.blackrose01.model.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import de.blackrose01.model.ExternalGame;
import de.blackrose01.model.game.Game;
import de.blackrose01.model.platform.Platform;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

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
    @JsonIgnore
    @JsonProperty(value = "developed")
    private List<Long> developed;
    @JsonIgnore
    @JsonProperty(value = "developed")
    private List<Game> developedObject;
    @JsonIgnore
    @JsonProperty(value = "published")
    private List<Long> published;
    @JsonIgnore
    @JsonProperty(value = "published")
    private List<Game> publishedObject;
    @JsonIgnore
    @JsonProperty(value = "parent")
    private long parent;
    @JsonIgnore
    @JsonProperty(value = "parent")
    private Company parentObject;
    @JsonIgnore
    @JsonProperty(value = "logo")
    private long logo;
    @JsonIgnore
    @JsonProperty(value = "logo")
    private CompanyLogo logoObject;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "websites")
    private List<Long> websites;
    @JsonIgnore
    @JsonProperty(value = "websites")
    private List<CompanyWebsite> websitesObject;
    @JsonIgnore
    @JsonProperty(value = "start_date")
    private long dateStart;
    @JsonIgnore
    @JsonProperty(value = "changed_company_id")
    private long changedCompanyId;
    @JsonIgnore
    @JsonProperty(value = "changed_company_id")
    private Company changedCompanyIdObject;
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
        return developed;
    }

    public void setDeveloped(List<Long> developed) {
        this.developed = developed;
    }

    public List<Game> getDevelopedObject() {
        return developedObject;
    }

    public void setDevelopedObject(List<Game> developedObject) {
        this.developedObject = developedObject;
    }

    public List<Long> getPublished() {
        return published;
    }

    public void setPublished(List<Long> published) {
        this.published = published;
    }

    public List<Game> getPublishedObject() {
        return publishedObject;
    }

    public void setPublishedObject(List<Game> publishedObject) {
        this.publishedObject = publishedObject;
    }

    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }

    public Company getParentObject() {
        return parentObject;
    }

    public void setParentObject(Company parentObject) {
        this.parentObject = parentObject;
    }

    public long getLogo() {
        return logo;
    }

    public void setLogo(long logo) {
        this.logo = logo;
    }

    public CompanyLogo getLogoObject() {
        return logoObject;
    }

    public void setLogoObject(CompanyLogo logoObject) {
        this.logoObject = logoObject;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Long> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Long> websites) {
        this.websites = websites;
    }

    public List<CompanyWebsite> getWebsitesObject() {
        return websitesObject;
    }

    public void setWebsitesObject(List<CompanyWebsite> websitesObject) {
        this.websitesObject = websitesObject;
    }

    public long getDateStart() {
        return dateStart;
    }

    public void setDateStart(long dateStart) {
        this.dateStart = dateStart;
    }

    public long getChangedCompanyId() {
        return changedCompanyId;
    }

    public void setChangedCompanyId(long changedCompanyId) {
        this.changedCompanyId = changedCompanyId;
    }

    public Company getChangedCompanyIdObject() {
        return changedCompanyIdObject;
    }

    public void setChangedCompanyIdObject(Company changedCompanyIdObject) {
        this.changedCompanyIdObject = changedCompanyIdObject;
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

    @JsonSetter("developed")
    public void setDevelopedJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<ExternalGame>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.developed = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.developedObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("published")
    public void setPublishedJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Game>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.published = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.publishedObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("parent")
    public void setParentJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.parent = jsonNode.asLong();
        else
            this.parentObject = new Gson().fromJson(jsonNode.toString(), Company.class);
    }

    @JsonSetter("logo")
    public void setLogoJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.logo = jsonNode.asLong();
        else
            this.logoObject = new Gson().fromJson(jsonNode.toString(), CompanyLogo.class);
    }

    @JsonSetter("websites")
    public void setWebsitesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<CompanyWebsite>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.websites = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.websitesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("changed_company_id")
    public void setChangedCompanyIdJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Company>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.changedCompanyId = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.changedCompanyIdObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
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
                parent == company.parent &&
                logo == company.logo &&
                dateStart == company.dateStart &&
                changedCompanyId == company.changedCompanyId &&
                createdAt == company.createdAt &&
                updatedAt == company.updatedAt &&
                Objects.equals(name, company.name) &&
                Objects.equals(slug, company.slug) &&
                Objects.equals(description, company.description) &&
                Objects.equals(developed, company.developed) &&
                Objects.equals(developedObject, company.developedObject) &&
                Objects.equals(published, company.published) &&
                Objects.equals(publishedObject, company.publishedObject) &&
                Objects.equals(parentObject, company.parentObject) &&
                Objects.equals(logoObject, company.logoObject) &&
                Objects.equals(url, company.url) &&
                Objects.equals(websites, company.websites) &&
                Objects.equals(websitesObject, company.websitesObject) &&
                Objects.equals(changedCompanyIdObject, company.changedCompanyIdObject) &&
                Objects.equals(checksum, company.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryChangeDate, categoryStartDate, country, name, slug, description, developed, developedObject, published, publishedObject, parent, parentObject, logo, logoObject, url, websites, websitesObject, dateStart, changedCompanyId, changedCompanyIdObject, createdAt, updatedAt, checksum);
    }
}
