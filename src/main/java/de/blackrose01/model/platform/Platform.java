package de.blackrose01.model.platform;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.ProductFamily;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * The hardware used to run the game or game delivery network
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Platform implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "abbreviation")
    private String abbreviation;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "alternative_name")
    private String nameAlternative;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonProperty(value = "platform_logo")
    private Object platformLogo;
    @JsonProperty(value = "versions")
    private List<Object> versions;
    @JsonProperty(value = "websites")
    private List<Object> websites;
    @JsonProperty(value = "product_family")
    private Object productFamily;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Platform() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAlternative() {
        return nameAlternative;
    }

    public void setNameAlternative(String nameAlternative) {
        this.nameAlternative = nameAlternative;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public long getPlatformLogo() {
        return Long.parseLong(String.valueOf(platformLogo));
    }

    public PlatformLogo getPlatformLogoObject() {
        return new ObjectMapper().convertValue(platformLogo, PlatformLogo.class);
    }

    public void setPlatformLogo(Object platformLogo) {
        this.platformLogo = platformLogo;
    }

    public List<Long> getVersions() {
        return new ObjectMapper().convertValue(versions, new TypeReference<List<Long>>(){});
    }

    public List<PlatformVersion> getVersionsObject() {
        return new ObjectMapper().convertValue(versions, new TypeReference<List<PlatformVersion>>(){});
    }

    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }

    public List<Long> getWebsites() {
        return new ObjectMapper().convertValue(websites, new TypeReference<List<Long>>(){});
    }

    public List<PlatformWebsite> getWebsitesObject() {
        return new ObjectMapper().convertValue(websites, new TypeReference<List<PlatformWebsite>>(){});
    }

    public void setWebsites(List<Object> websites) {
        this.websites = websites;
    }

    public long getProductFamily() {
        return Long.parseLong(String.valueOf(productFamily));
    }

    public ProductFamily getProductFamilyObject() {
        return new ObjectMapper().convertValue(productFamily, ProductFamily.class);
    }

    public void setProductFamily(Object productFamily) {
        this.productFamily = productFamily;
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
        Platform platform = (Platform) o;
        return id == platform.id &&
                category == platform.category &&
                createdAt == platform.createdAt &&
                updatedAt == platform.updatedAt &&
                Objects.equals(abbreviation, platform.abbreviation) &&
                Objects.equals(name, platform.name) &&
                Objects.equals(nameAlternative, platform.nameAlternative) &&
                Objects.equals(slug, platform.slug) &&
                Objects.equals(platformLogo, platform.platformLogo) &&
                Objects.equals(versions, platform.versions) &&
                Objects.equals(websites, platform.websites) &&
                Objects.equals(productFamily, platform.productFamily) &&
                Objects.equals(checksum, platform.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, abbreviation, category, name, nameAlternative, slug, platformLogo, versions, websites, productFamily, createdAt, updatedAt, checksum);
    }
}
