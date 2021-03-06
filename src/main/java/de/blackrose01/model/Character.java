package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;
import de.blackrose01.model.privates.People;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Video game characters
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Character implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "gender")
    private int gender;
    @JsonIgnore
    @JsonProperty(value = "species")
    private int species;
    @JsonProperty(value = "games")
    private List<Object> games;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonProperty(value = "people")
    private List<Object> people;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "description")
    private String description;
    @JsonIgnore
    @JsonProperty(value = "country_name")
    private String nameCountry;
    @JsonIgnore
    @JsonProperty(value = "mug_shot")
    private String mugShot;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Character() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getSpecies() {
        return species;
    }

    public void setSpecies(int species) {
        this.species = species;
    }

    @JsonIgnore
    public List<Long> getGames() {
        return new ObjectMapper().convertValue(games, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
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

    @JsonIgnore
    public List<Long> getPeople() {
        return new ObjectMapper().convertValue(people, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<People> getPeopleObject() {
        return new ObjectMapper().convertValue(people, new TypeReference<List<People>>() {
        });
    }

    public void setPeople(List<Object> people) {
        this.people = people;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getMugShot() {
        return mugShot;
    }

    public void setMugShot(String mugShot) {
        this.mugShot = mugShot;
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
        Character character = (Character) o;
        return id == character.id &&
                gender == character.gender &&
                species == character.species &&
                createdAt == character.createdAt &&
                updatedAt == character.updatedAt &&
                Objects.equals(games, character.games) &&
                Objects.equals(name, character.name) &&
                Objects.equals(slug, character.slug) &&
                Objects.equals(people, character.people) &&
                Objects.equals(url, character.url) &&
                Objects.equals(description, character.description) &&
                Objects.equals(nameCountry, character.nameCountry) &&
                Objects.equals(mugShot, character.mugShot) &&
                Objects.equals(checksum, character.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gender, species, games, name, slug, people, url, description, nameCountry, mugShot, createdAt, updatedAt, checksum);
    }
}
