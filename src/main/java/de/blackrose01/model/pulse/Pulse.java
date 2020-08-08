package de.blackrose01.model.pulse;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

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
    private long pulseImage;
    @JsonIgnore
    @JsonProperty(value = "pulse_image")
    private PulseImage pulseImageObject;
    @JsonIgnore
    @JsonProperty(value = "pulse_source")
    private long pulseSource;
    @JsonIgnore
    @JsonProperty(value = "pulse_source")
    private PulseSource pulseSourceObject;
    @JsonIgnore
    @JsonProperty(value = "tags")
    private List<Long> tags;
    @JsonIgnore
    @JsonProperty(value = "website")
    private long website;
    @JsonIgnore
    @JsonProperty(value = "website")
    private PulseUrl websiteObject;
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
        return pulseImage;
    }

    public void setPulseImage(long pulseImage) {
        this.pulseImage = pulseImage;
    }

    public PulseImage getPulseImageObject() {
        return pulseImageObject;
    }

    public void setPulseImageObject(PulseImage pulseImageObject) {
        this.pulseImageObject = pulseImageObject;
    }

    public long getPulseSource() {
        return pulseSource;
    }

    public void setPulseSource(long pulseSource) {
        this.pulseSource = pulseSource;
    }

    public PulseSource getPulseSourceObject() {
        return pulseSourceObject;
    }

    public void setPulseSourceObject(PulseSource pulseSourceObject) {
        this.pulseSourceObject = pulseSourceObject;
    }

    public List<Long> getTags() {
        return tags;
    }

    public void setTags(List<Long> tags) {
        this.tags = tags;
    }

    public long getWebsite() {
        return website;
    }

    public void setWebsite(long website) {
        this.website = website;
    }

    public PulseUrl getWebsiteObject() {
        return websiteObject;
    }

    public void setWebsiteObject(PulseUrl websiteObject) {
        this.websiteObject = websiteObject;
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

    @JsonSetter("pulse_image")
    public void setPulseImageJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.pulseImage = jsonNode.asLong();
        else
            this.pulseImageObject = new Gson().fromJson(jsonNode.toString(), PulseImage.class);
    }

    @JsonSetter("pulse_source")
    public void setGameJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.pulseSource = jsonNode.asLong();
        else
            this.pulseSourceObject = new Gson().fromJson(jsonNode.toString(), PulseSource.class);
    }

    @JsonSetter("website")
    public void setWebsiteJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.website = jsonNode.asLong();
        else
            this.websiteObject = new Gson().fromJson(jsonNode.toString(), PulseUrl.class);
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
                pulseImage == pulse.pulseImage &&
                pulseSource == pulse.pulseSource &&
                website == pulse.website &&
                createdAt == pulse.createdAt &&
                updatedAt == pulse.updatedAt &&
                Objects.equals(uid, pulse.uid) &&
                Objects.equals(author, pulse.author) &&
                Objects.equals(title, pulse.title) &&
                Objects.equals(summary, pulse.summary) &&
                Objects.equals(image, pulse.image) &&
                Objects.equals(pulseImageObject, pulse.pulseImageObject) &&
                Objects.equals(pulseSourceObject, pulse.pulseSourceObject) &&
                Objects.equals(tags, pulse.tags) &&
                Objects.equals(websiteObject, pulse.websiteObject) &&
                Objects.equals(checksum, pulse.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, author, title, summary, category, isIgnored, image, pulseImage, pulseImageObject, pulseSource, pulseSourceObject, tags, website, websiteObject, createdAt, updatedAt, checksum);
    }
}
