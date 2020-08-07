package de.blackrose01.model.platform;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import de.blackrose01.model.ExternalGame;
import de.blackrose01.model.company.Company;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

public class PlatformVersion implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "companies")
    private List<Long> companies;
    @JsonIgnore
    @JsonProperty(value = "companies")
    private List<Company> companiesObject;
    @JsonIgnore
    @JsonProperty(value = "cpu")
    private String cpu;
    @JsonIgnore
    @JsonProperty(value = "graphics")
    private String graphics;
    @JsonIgnore
    @JsonProperty(value = "resolution")
    private String resolution;
    @JsonIgnore
    @JsonProperty(value = "memory")
    private String memory;
    @JsonIgnore
    @JsonProperty(value = "media")
    private String media;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "os")
    private String os;
    @JsonIgnore
    @JsonProperty(value = "online")
    private String online;
    @JsonIgnore
    @JsonProperty(value = "connectivity")
    private String connectivity;
    @JsonIgnore
    @JsonProperty(value = "output")
    private String output;
    @JsonIgnore
    @JsonProperty(value = "platform_logo")
    private long platformLogo;
    @JsonIgnore
    @JsonProperty(value = "platform_logo")
    private PlatformLogo platformLogoObject;
    @JsonIgnore
    @JsonProperty(value = "platform_version_release_dates")
    private List<Long> platformVersionReleaseDates;
    @JsonIgnore
    @JsonProperty(value = "platform_version_release_dates")
    private List<PlatformVersionReleaseDate> platformVersionReleaseDatesObject;
    @JsonIgnore
    @JsonProperty(value = "main_manufacturer")
    private long manufacturerMain;
    @JsonIgnore
    @JsonProperty(value = "main_manufacturer")
    private PlatformVersionCompany manufacturerMainObject;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonIgnore
    @JsonProperty(value = "sound")
    private String sound;
    @JsonIgnore
    @JsonProperty(value = "storage")
    private String storage;
    @JsonIgnore
    @JsonProperty(value = "summary")
    private String summary;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public PlatformVersion() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Long> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Long> companies) {
        this.companies = companies;
    }

    public List<Company> getCompaniesObject() {
        return companiesObject;
    }

    public void setCompaniesObject(List<Company> companiesObject) {
        this.companiesObject = companiesObject;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
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

    public List<Long> getPlatformVersionReleaseDates() {
        return platformVersionReleaseDates;
    }

    public void setPlatformVersionReleaseDates(List<Long> platformVersionReleaseDates) {
        this.platformVersionReleaseDates = platformVersionReleaseDates;
    }

    public List<PlatformVersionReleaseDate> getPlatformVersionReleaseDatesObject() {
        return platformVersionReleaseDatesObject;
    }

    public void setPlatformVersionReleaseDatesObject(List<PlatformVersionReleaseDate> platformVersionReleaseDatesObject) {
        this.platformVersionReleaseDatesObject = platformVersionReleaseDatesObject;
    }

    public long getManufacturerMain() {
        return manufacturerMain;
    }

    public void setManufacturerMain(long manufacturerMain) {
        this.manufacturerMain = manufacturerMain;
    }

    public PlatformVersionCompany getManufacturerMainObject() {
        return manufacturerMainObject;
    }

    public void setManufacturerMainObject(PlatformVersionCompany manufacturerMainObject) {
        this.manufacturerMainObject = manufacturerMainObject;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @JsonSetter("companies")
    public void setCompaniesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Company>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.isArray())
            this.companies = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.companiesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("platform_logo")
    public void setPlatformLogoJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.platformLogo = jsonNode.asLong();
        else
            this.platformLogoObject = new Gson().fromJson(jsonNode.toString(), PlatformLogo.class);
    }

    @JsonSetter("platform_version_release_dates")
    public void setPlatformVersionReleaseDatesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<PlatformVersionReleaseDate>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.isArray())
            this.platformVersionReleaseDates = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.platformVersionReleaseDatesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("main_manufacturer")
    public void setManufacturerMainJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.manufacturerMain = jsonNode.asLong();
        else
            this.manufacturerMainObject = new Gson().fromJson(jsonNode.toString(), PlatformVersionCompany.class);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlatformVersion that = (PlatformVersion) o;
        return id == that.id &&
                platformLogo == that.platformLogo &&
                manufacturerMain == that.manufacturerMain &&
                Objects.equals(companies, that.companies) &&
                Objects.equals(companiesObject, that.companiesObject) &&
                Objects.equals(cpu, that.cpu) &&
                Objects.equals(graphics, that.graphics) &&
                Objects.equals(resolution, that.resolution) &&
                Objects.equals(memory, that.memory) &&
                Objects.equals(media, that.media) &&
                Objects.equals(name, that.name) &&
                Objects.equals(os, that.os) &&
                Objects.equals(online, that.online) &&
                Objects.equals(connectivity, that.connectivity) &&
                Objects.equals(output, that.output) &&
                Objects.equals(platformLogoObject, that.platformLogoObject) &&
                Objects.equals(platformVersionReleaseDates, that.platformVersionReleaseDates) &&
                Objects.equals(platformVersionReleaseDatesObject, that.platformVersionReleaseDatesObject) &&
                Objects.equals(manufacturerMainObject, that.manufacturerMainObject) &&
                Objects.equals(slug, that.slug) &&
                Objects.equals(sound, that.sound) &&
                Objects.equals(storage, that.storage) &&
                Objects.equals(summary, that.summary) &&
                Objects.equals(url, that.url) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companies, companiesObject, cpu, graphics, resolution, memory, media, name, os, online, connectivity, output, platformLogo, platformLogoObject, platformVersionReleaseDates, platformVersionReleaseDatesObject, manufacturerMain, manufacturerMainObject, slug, sound, storage, summary, url, checksum);
    }
}
