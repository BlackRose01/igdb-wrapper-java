package de.blackrose01.model.platform;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.company.Company;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlatformVersion implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonProperty(value = "companies")
    private List<Object> companies;
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
    @JsonProperty(value = "platform_logo")
    private Object platformLogo;
    @JsonProperty(value = "platform_version_release_dates")
    private List<Object> platformVersionReleaseDates;
    @JsonProperty(value = "main_manufacturer")
    private Object manufacturerMain;
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
        return new ObjectMapper().convertValue(companies, new TypeReference<List<Long>>(){});
    }

    public List<Company> getCompaniesObject() {
        return new ObjectMapper().convertValue(companies, new TypeReference<List<Company>>(){});
    }

    public void setCompanies(List<Object> companies) {
        this.companies = companies;
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
        return Long.parseLong(String.valueOf(platformLogo));
    }

    public PlatformLogo getPlatformLogoObject() {
        return new ObjectMapper().convertValue(platformLogo, PlatformLogo.class);
    }

    public void setPlatformLogo(Object platformLogo) {
        this.platformLogo = platformLogo;
    }

    public List<Long> getPlatformVersionReleaseDates() {
        return new ObjectMapper().convertValue(platformVersionReleaseDates, new TypeReference<List<Long>>(){});
    }

    public List<PlatformVersionReleaseDate> getPlatformVersionReleaseDatesObject() {
        return new ObjectMapper().convertValue(platformVersionReleaseDates, new TypeReference<List<PlatformVersionReleaseDate>>(){});
    }

    public void setPlatformVersionReleaseDates(List<Object> platformVersionReleaseDates) {
        this.platformVersionReleaseDates = platformVersionReleaseDates;
    }

    public long getManufacturerMain() {
        return Long.parseLong(String.valueOf(manufacturerMain));
    }

    public PlatformVersionCompany getManufacturerMainObject() {
        return new ObjectMapper().convertValue(manufacturerMain, PlatformVersionCompany.class);
    }

    public void setManufacturerMain(Object manufacturerMain) {
        this.manufacturerMain = manufacturerMain;
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
                Objects.equals(companies, that.companies) &&
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
                Objects.equals(platformLogo, that.platformLogo) &&
                Objects.equals(platformVersionReleaseDates, that.platformVersionReleaseDates) &&
                Objects.equals(manufacturerMain, that.manufacturerMain) &&
                Objects.equals(slug, that.slug) &&
                Objects.equals(sound, that.sound) &&
                Objects.equals(storage, that.storage) &&
                Objects.equals(summary, that.summary) &&
                Objects.equals(url, that.url) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companies, cpu, graphics, resolution, memory, media, name, os, online, connectivity, output, platformLogo, platformVersionReleaseDates, manufacturerMain, slug, sound, storage, summary, url, checksum);
    }
}
