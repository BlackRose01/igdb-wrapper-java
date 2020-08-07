package de.blackrose01.model.platform;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Platform implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
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
    @JsonIgnore
    @JsonProperty(value = "platform_logo")
    private long platformLogo;
    @JsonIgnore
    @JsonProperty(value = "versions")
    private List<Long> versions;
    @JsonIgnore
    @JsonProperty(value = "websites")
    private List<Long> websites;
    @JsonIgnore
    @JsonProperty(value = "product_family")
    private long productFamily;
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
        return platformLogo;
    }

    public void setPlatformLogo(long platformLogo) {
        this.platformLogo = platformLogo;
    }

    public List<Long> getVersions() {
        return versions;
    }

    public void setVersions(List<Long> versions) {
        this.versions = versions;
    }

    public List<Long> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Long> websites) {
        this.websites = websites;
    }

    public long getProductFamily() {
        return productFamily;
    }

    public void setProductFamily(long productFamily) {
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
                platformLogo == platform.platformLogo &&
                productFamily == platform.productFamily &&
                createdAt == platform.createdAt &&
                updatedAt == platform.updatedAt &&
                Objects.equals(name, platform.name) &&
                Objects.equals(nameAlternative, platform.nameAlternative) &&
                Objects.equals(slug, platform.slug) &&
                Objects.equals(versions, platform.versions) &&
                Objects.equals(websites, platform.websites) &&
                Objects.equals(checksum, platform.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, name, nameAlternative, slug, platformLogo, versions, websites, productFamily, createdAt, updatedAt, checksum);
    }
}
