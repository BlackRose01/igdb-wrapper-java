package de.blackrose01.model.privates;

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

@JsonIgnoreProperties(ignoreUnknown = true)
public class People implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonProperty(value = "credited_games")
    private List<Object> gamesCredited;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "gender")
    private int gender;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public People() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @JsonIgnore
    public List<Long> getGamesCredited() {
        return new ObjectMapper().convertValue(gamesCredited, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Game> getGamesCreditedObject() {
        return new ObjectMapper().convertValue(gamesCredited, new TypeReference<List<Game>>() {
        });
    }

    public void setGamesCredited(List<Object> gamesCredited) {
        this.gamesCredited = gamesCredited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
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
        People people = (People) o;
        return id == people.id &&
                gender == people.gender &&
                createdAt == people.createdAt &&
                updatedAt == people.updatedAt &&
                Objects.equals(name, people.name) &&
                Objects.equals(slug, people.slug) &&
                Objects.equals(gamesCredited, people.gamesCredited) &&
                Objects.equals(url, people.url) &&
                Objects.equals(checksum, people.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, slug, gamesCredited, url, gender, createdAt, updatedAt, checksum);
    }
}
