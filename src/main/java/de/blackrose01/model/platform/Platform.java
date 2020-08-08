package de.blackrose01.model.platform;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import de.blackrose01.model.ExternalGame;
import de.blackrose01.model.ProductFamily;

import java.io.Serializable;
import java.lang.reflect.Type;
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
    @JsonProperty(value = "platform_logo")
    private PlatformLogo platformLogoObject;
    @JsonIgnore
    @JsonProperty(value = "versions")
    private List<Long> versions;
    @JsonIgnore
    @JsonProperty(value = "versions")
    private List<PlatformVersion> versionsObject;
    @JsonIgnore
    @JsonProperty(value = "websites")
    private List<Long> websites;
    @JsonIgnore
    @JsonProperty(value = "websites")
    private List<PlatformWebsite> websitesObject;
    @JsonIgnore
    @JsonProperty(value = "product_family")
    private long productFamily;
    @JsonIgnore
    @JsonProperty(value = "product_family")
    private ProductFamily productFamilyObject;
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

    public PlatformLogo getPlatformLogoObject() {
        return platformLogoObject;
    }

    public void setPlatformLogoObject(PlatformLogo platformLogoObject) {
        this.platformLogoObject = platformLogoObject;
    }

    public List<Long> getVersions() {
        return versions;
    }

    public void setVersions(List<Long> versions) {
        this.versions = versions;
    }

    public List<PlatformVersion> getVersionsObject() {
        return versionsObject;
    }

    public void setVersionsObject(List<PlatformVersion> versionsObject) {
        this.versionsObject = versionsObject;
    }

    public List<Long> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Long> websites) {
        this.websites = websites;
    }

    public List<PlatformWebsite> getWebsitesObject() {
        return websitesObject;
    }

    public void setWebsitesObject(List<PlatformWebsite> websitesObject) {
        this.websitesObject = websitesObject;
    }

    public long getProductFamily() {
        return productFamily;
    }

    public void setProductFamily(long productFamily) {
        this.productFamily = productFamily;
    }

    public ProductFamily getProductFamilyObject() {
        return productFamilyObject;
    }

    public void setProductFamilyObject(ProductFamily productFamilyObject) {
        this.productFamilyObject = productFamilyObject;
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

    @JsonSetter("platform_logo")
    public void setPlatformLogoJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.platformLogo = jsonNode.asLong();
        else
            this.platformLogoObject = new Gson().fromJson(jsonNode.toString(), PlatformLogo.class);
    }

    @JsonSetter("versions")
    public void setVersionsJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<PlatformVersion>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.versions = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.versionsObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("websites")
    public void setWebsitesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<PlatformWebsite>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.websites = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.websitesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("product_family")
    public void setProductFamilyJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.productFamily = jsonNode.asLong();
        else
            this.productFamilyObject = new Gson().fromJson(jsonNode.toString(), ProductFamily.class);
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
                Objects.equals(platformLogoObject, platform.platformLogoObject) &&
                Objects.equals(versions, platform.versions) &&
                Objects.equals(versionsObject, platform.versionsObject) &&
                Objects.equals(websites, platform.websites) &&
                Objects.equals(websitesObject, platform.websitesObject) &&
                Objects.equals(productFamilyObject, platform.productFamilyObject) &&
                Objects.equals(checksum, platform.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, name, nameAlternative, slug, platformLogo, platformLogoObject, versions, versionsObject, websites, websitesObject, productFamily, productFamilyObject, createdAt, updatedAt, checksum);
    }
}
