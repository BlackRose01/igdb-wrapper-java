package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A list of video game franchises such as Star Wars.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Franchise implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long id;
    @JsonProperty(value = "games")
    private List<Object> games;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Franchise() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Long> getGames() {
        return new ObjectMapper().convertValue(games, new TypeReference<List<Long>>() {
        });
    }

    public List<Game> getGamesObject() {
        return new ObjectMapper().convertValue(games, new TypeReference<List<Game>>() {
        });
    }

    public void setGames(List<Object> games) {
        this.games = games;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        Franchise franchise = (Franchise) o;
        return id == franchise.id &&
                createdAt == franchise.createdAt &&
                updatedAt == franchise.updatedAt &&
                Objects.equals(games, franchise.games) &&
                Objects.equals(name, franchise.name) &&
                Objects.equals(slug, franchise.slug) &&
                Objects.equals(url, franchise.url) &&
                Objects.equals(checksum, franchise.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, games, name, slug, url, createdAt, updatedAt, checksum);
    }
}
