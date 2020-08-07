package de.blackrose01.model.privates;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

public class List implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "entries_count")
    private int entriesCount;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonIgnore
    @JsonProperty(value = "description")
    private String description;
    @JsonIgnore
    @JsonProperty(value = "numbering")
    private boolean isNumbering;
    @JsonIgnore
    @JsonProperty(value = "private")
    private boolean isPrivate;
    @JsonIgnore
    @JsonProperty(value = "user")
    private long user;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "list_entries")
    private java.util.List<Long> listEntries;
    @JsonIgnore
    @JsonProperty(value = "listed_games")
    private java.util.List<Long> listGames;
    @JsonIgnore
    @JsonProperty(value = "list_tags")
    private java.util.List<Long> listTags;
    @JsonIgnore
    @JsonProperty(value = "similar_lists")
    private java.util.List<Long> similarLists;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public List() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getEntriesCount() {
        return entriesCount;
    }

    public void setEntriesCount(int entriesCount) {
        this.entriesCount = entriesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isNumbering() {
        return isNumbering;
    }

    public void setNumbering(boolean numbering) {
        isNumbering = numbering;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public java.util.List<Long> getListEntries() {
        return listEntries;
    }

    public void setListEntries(java.util.List<Long> listEntries) {
        this.listEntries = listEntries;
    }

    public java.util.List<Long> getListGames() {
        return listGames;
    }

    public void setListGames(java.util.List<Long> listGames) {
        this.listGames = listGames;
    }

    public java.util.List<Long> getListTags() {
        return listTags;
    }

    public void setListTags(java.util.List<Long> listTags) {
        this.listTags = listTags;
    }

    public java.util.List<Long> getSimilarLists() {
        return similarLists;
    }

    public void setSimilarLists(java.util.List<Long> similarLists) {
        this.similarLists = similarLists;
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
        List list = (List) o;
        return id == list.id &&
                entriesCount == list.entriesCount &&
                isNumbering == list.isNumbering &&
                isPrivate == list.isPrivate &&
                user == list.user &&
                createdAt == list.createdAt &&
                updatedAt == list.updatedAt &&
                Objects.equals(name, list.name) &&
                Objects.equals(slug, list.slug) &&
                Objects.equals(description, list.description) &&
                Objects.equals(url, list.url) &&
                Objects.equals(listEntries, list.listEntries) &&
                Objects.equals(listGames, list.listGames) &&
                Objects.equals(listTags, list.listTags) &&
                Objects.equals(similarLists, list.similarLists) &&
                Objects.equals(checksum, list.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, entriesCount, name, slug, description, isNumbering, isPrivate, user, url, listEntries, listGames, listTags, similarLists, createdAt, updatedAt, checksum);
    }
}
