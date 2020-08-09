package de.blackrose01.model.privates;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
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
    @JsonProperty(value = "list_entries")
    private java.util.List<Object> listEntries;
    @JsonProperty(value = "listed_games")
    private java.util.List<Object> listGames;
    @JsonIgnore
    @JsonProperty(value = "list_tags")
    private java.util.List<Long> listTags;
    @JsonProperty(value = "similar_lists")
    private java.util.List<Object> similarLists;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public List() {
    }

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
        return new ObjectMapper().convertValue(listEntries, new TypeReference<java.util.List<Long>>() {
        });
    }

    public java.util.List<ListEntry> getListEntriesObject() {
        return new ObjectMapper().convertValue(listEntries, new TypeReference<java.util.List<ListEntry>>() {
        });
    }

    public void setListEntries(java.util.List<Object> listEntries) {
        this.listEntries = listEntries;
    }

    public java.util.List<Long> getListGames() {
        return new ObjectMapper().convertValue(listGames, new TypeReference<java.util.List<Long>>() {
        });
    }

    public java.util.List<Game> getListGamesObject() {
        return new ObjectMapper().convertValue(listGames, new TypeReference<java.util.List<Game>>() {
        });
    }

    public void setListGames(java.util.List<Object> listGames) {
        this.listGames = listGames;
    }

    public java.util.List<Long> getListTags() {
        return listTags;
    }

    public void setListTags(java.util.List<Long> listTags) {
        this.listTags = listTags;
    }

    public java.util.List<Long> getSimilarLists() {
        return new ObjectMapper().convertValue(similarLists, new TypeReference<java.util.List<Long>>() {
        });
    }

    public java.util.List<List> getSimilarListsObject() {
        return new ObjectMapper().convertValue(similarLists, new TypeReference<java.util.List<List>>() {
        });
    }

    public void setSimilarLists(java.util.List<Object> similarLists) {
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
