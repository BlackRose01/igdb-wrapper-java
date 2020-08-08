package de.blackrose01.model.pulse;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pulse implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "uid")
    private String uid;
    @JsonIgnore
    @JsonProperty(value = "author")
    private String author;
    @JsonIgnore
    @JsonProperty(value = "title")
    private String title;
    @JsonIgnore
    @JsonProperty(value = "summary")
    private String summary;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonIgnore
    @JsonProperty(value = "ignored")
    private boolean isIgnored;
    @JsonIgnore
    @JsonProperty(value = "image")
    private String image;
    @JsonIgnore
    @JsonProperty(value = "pulse_image")
    private Object pulseImage;
    @JsonIgnore
    @JsonProperty(value = "pulse_source")
    private Object pulseSource;
    @JsonIgnore
    @JsonProperty(value = "tags")
    private List<Long> tags;
    @JsonIgnore
    @JsonProperty(value = "website")
    private Object website;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Pulse() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public boolean isIgnored() {
        return isIgnored;
    }

    public void setIgnored(boolean ignored) {
        isIgnored = ignored;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getPulseImage() {
        return Long.parseLong(String.valueOf(pulseImage));
    }

    public PulseImage getPulseImageOBject() {
        return new ObjectMapper().convertValue(pulseImage, PulseImage.class);
    }

    public void setPulseImage(Object pulseImage) {
        this.pulseImage = pulseImage;
    }

    public long getPulseSource() {
        return Long.parseLong(String.valueOf(pulseSource));
    }

    public PulseSource getPulseSourceObject() {
        return new ObjectMapper().convertValue(pulseSource, PulseSource.class);
    }

    public void setPulseSource(Object pulseSource) {
        this.pulseSource = pulseSource;
    }

    public List<Long> getTags() {
        return tags;
    }

    public void setTags(List<Long> tags) {
        this.tags = tags;
    }

    public long getWebsite() {
        return Long.parseLong(String.valueOf(website));
    }

    public PulseUrl getWebsiteObject() {
        return new ObjectMapper().convertValue(website, PulseUrl.class);
    }

    public void setWebsite(Object website) {
        this.website = website;
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
        Pulse pulse = (Pulse) o;
        return id == pulse.id &&
                category == pulse.category &&
                isIgnored == pulse.isIgnored &&
                createdAt == pulse.createdAt &&
                updatedAt == pulse.updatedAt &&
                Objects.equals(uid, pulse.uid) &&
                Objects.equals(author, pulse.author) &&
                Objects.equals(title, pulse.title) &&
                Objects.equals(summary, pulse.summary) &&
                Objects.equals(image, pulse.image) &&
                Objects.equals(pulseImage, pulse.pulseImage) &&
                Objects.equals(pulseSource, pulse.pulseSource) &&
                Objects.equals(tags, pulse.tags) &&
                Objects.equals(website, pulse.website) &&
                Objects.equals(checksum, pulse.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, author, title, summary, category, isIgnored, image, pulseImage, pulseSource, tags, website, createdAt, updatedAt, checksum);
    }
}
