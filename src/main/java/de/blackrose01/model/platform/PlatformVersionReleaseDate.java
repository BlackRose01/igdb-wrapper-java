package de.blackrose01.model.platform;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

/**
 * A handy endpoint that extends platform release dates. Used to dig deeper into release dates, platforms and versions.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlatformVersionReleaseDate implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonProperty(value = "platform_version")
    private Object platformVersion;
    @JsonIgnore
    @JsonProperty(value = "m")
    private int m;
    @JsonIgnore
    @JsonProperty(value = "y")
    private int y;
    @JsonIgnore
    @JsonProperty(value = "region")
    private int region;
    @JsonIgnore
    @JsonProperty(value = "human")
    private String human;
    @JsonIgnore
    @JsonProperty(value = "date")
    private long date;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public PlatformVersionReleaseDate() {
    }

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

    @JsonIgnore
    public long getPlatformVersion() {
        return Long.parseLong(String.valueOf(platformVersion));
    }

    @JsonIgnore
    public PlatformVersion getPlatformVersionObject() {
        return new ObjectMapper().convertValue(platformVersion, PlatformVersion.class);
    }

    public void setPlatformVersion(Object platformVersion) {
        this.platformVersion = platformVersion;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
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
        PlatformVersionReleaseDate that = (PlatformVersionReleaseDate) o;
        return id == that.id &&
                category == that.category &&
                m == that.m &&
                y == that.y &&
                region == that.region &&
                date == that.date &&
                createdAt == that.createdAt &&
                updatedAt == that.updatedAt &&
                Objects.equals(platformVersion, that.platformVersion) &&
                Objects.equals(human, that.human) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, platformVersion, m, y, region, human, date, createdAt, updatedAt, checksum);
    }
}
