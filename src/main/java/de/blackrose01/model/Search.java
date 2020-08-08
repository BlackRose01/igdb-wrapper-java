package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.company.Company;
import de.blackrose01.model.game.Game;
import de.blackrose01.model.platform.Platform;
import de.blackrose01.model.privates.People;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Search implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "name_alternative")
    private String nameAlternative;
    @JsonIgnore
    @JsonProperty(value = "person")
    private Object person;
    @JsonIgnore
    @JsonProperty(value = "description")
    private String description;
    @JsonIgnore
    @JsonProperty(value = "popularity")
    private double popularity;
    @JsonIgnore
    @JsonProperty(value = "game")
    private Object game;
    @JsonIgnore
    @JsonProperty(value = "theme")
    private Object theme;
    @JsonIgnore
    @JsonProperty(value = "test_dummy")
    private long testDummy;
    @JsonIgnore
    @JsonProperty(value = "platform")
    private Object platform;
    @JsonIgnore
    @JsonProperty(value = "company")
    private Object company;
    @JsonIgnore
    @JsonProperty(value = "collection")
    private Object collection;
    @JsonIgnore
    @JsonProperty(value = "publishedat")
    private long publishedAt;
    @JsonIgnore
    @JsonProperty(value = "id")
    private String checksum;

    public Search() {}

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

    public String getNameAlternative() {
        return nameAlternative;
    }

    public void setNameAlternative(String nameAlternative) {
        this.nameAlternative = nameAlternative;
    }

    public long getPerson() {
        return Long.parseLong(String.valueOf(person));
    }

    public People getPersonObject() {
        return new ObjectMapper().convertValue(this.person, People.class);
    }

    public void setPerson(Object person) {
        this.person = person;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public long getGame() {
        return Long.parseLong(String.valueOf(this.game));
    }

    public Game getGameObject() {
        return new ObjectMapper().convertValue(this.game, Game.class);
    }

    public void setGame(Object game) {
        this.game = game;
    }

    public long getTheme() {
        return Long.parseLong(String.valueOf(this.theme));
    }

    public Theme getThemeObject() {
        return new ObjectMapper().convertValue(this.theme, Theme.class);
    }

    public void setTheme(Object theme) {
        this.theme = theme;
    }

    public long getTestDummy() {
        return testDummy;
    }

    public void setTestDummy(long testDummy) {
        this.testDummy = testDummy;
    }

    public long getPlatform() {
        return Long.parseLong(String.valueOf(this.platform));
    }

    public Platform getPlatformObject() {
        return new ObjectMapper().convertValue(this.platform, Platform.class);
    }

    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    public long getCompany() {
        return Long.parseLong(String.valueOf(this.company));
    }

    public Company getCompanyObject() {
        return new ObjectMapper().convertValue(this.company, Company.class);
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public long getCollection() {
        return Long.parseLong(String.valueOf(this.collection));
    }

    public Collection getCollectionObject() {
        return new ObjectMapper().convertValue(this.collection, Collection.class);
    }

    public void setCollection(Object collection) {
        this.collection = collection;
    }

    public long getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(long publishedAt) {
        this.publishedAt = publishedAt;
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
        Search search = (Search) o;
        return id == search.id &&
                Double.compare(search.popularity, popularity) == 0 &&
                testDummy == search.testDummy &&
                publishedAt == search.publishedAt &&
                Objects.equals(name, search.name) &&
                Objects.equals(nameAlternative, search.nameAlternative) &&
                Objects.equals(person, search.person) &&
                Objects.equals(description, search.description) &&
                Objects.equals(game, search.game) &&
                Objects.equals(theme, search.theme) &&
                Objects.equals(platform, search.platform) &&
                Objects.equals(company, search.company) &&
                Objects.equals(collection, search.collection) &&
                Objects.equals(checksum, search.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nameAlternative, person, description, popularity, game, theme, testDummy, platform, company, collection, publishedAt, checksum);
    }
}
