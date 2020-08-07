package de.blackrose01.model.platform;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
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
    @JsonProperty(value = "platform_version_release_dates")
    private List<Long> platformVersionReleaseDates;
    @JsonIgnore
    @JsonProperty(value = "main_manufacturer")
    private long manufacturerMain;
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

    public List<Long> getPlatformVersionReleaseDates() {
        return platformVersionReleaseDates;
    }

    public void setPlatformVersionReleaseDates(List<Long> platformVersionReleaseDates) {
        this.platformVersionReleaseDates = platformVersionReleaseDates;
    }

    public long getManufacturerMain() {
        return manufacturerMain;
    }

    public void setManufacturerMain(long manufacturerMain) {
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
                platformLogo == that.platformLogo &&
                manufacturerMain == that.manufacturerMain &&
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
                Objects.equals(platformVersionReleaseDates, that.platformVersionReleaseDates) &&
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
