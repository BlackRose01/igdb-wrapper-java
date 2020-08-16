package de.blackrose01.model.game;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.company.Company;
import de.blackrose01.model.platform.Platform;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Video game engines such as unreal engine.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameEngine implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonProperty(value = "companies")
    private List<Object> companies;
    @JsonProperty(value = "logo")
    private Object logo;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "platforms")
    private List<Object> platforms;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public GameEngine() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Long> getCompanies() {
        return new ObjectMapper().convertValue(companies, new TypeReference<List<Long>>() {
        });
    }

    public List<Company> getCompaniesObject() {
        return new ObjectMapper().convertValue(companies, new TypeReference<List<Company>>() {
        });
    }

    public void setCompanies(List<Object> companies) {
        this.companies = companies;
    }

    public long getLogo() {
        return Long.parseLong(String.valueOf(logo));
    }

    public GameEngineLogo getLogoObject() {
        return new ObjectMapper().convertValue(logo, GameEngineLogo.class);
    }

    public void setLogo(long logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getPlatforms() {
        return new ObjectMapper().convertValue(platforms, new TypeReference<List<Long>>() {
        });
    }

    public List<Platform> getPlatformsObject() {
        return new ObjectMapper().convertValue(platforms, new TypeReference<List<Platform>>() {
        });
    }

    public void setPlatforms(List<Object> platforms) {
        this.platforms = platforms;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        GameEngine that = (GameEngine) o;
        return id == that.id &&
                logo == that.logo &&
                createdAt == that.createdAt &&
                updatedAt == that.updatedAt &&
                Objects.equals(companies, that.companies) &&
                Objects.equals(name, that.name) &&
                Objects.equals(platforms, that.platforms) &&
                Objects.equals(slug, that.slug) &&
                Objects.equals(url, that.url) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companies, logo, name, platforms, slug, url, createdAt, updatedAt, checksum);
    }
}
