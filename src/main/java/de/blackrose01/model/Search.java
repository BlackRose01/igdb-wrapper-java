package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

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
    private long person;
    @JsonIgnore
    @JsonProperty(value = "description")
    private String description;
    @JsonIgnore
    @JsonProperty(value = "popularity")
    private double popularity;
    @JsonIgnore
    @JsonProperty(value = "game")
    private long game;
    @JsonIgnore
    @JsonProperty(value = "theme")
    private long theme;
    @JsonIgnore
    @JsonProperty(value = "test_dummy")
    private long testDummy;
    @JsonIgnore
    @JsonProperty(value = "platform")
    private long platform;
    @JsonIgnore
    @JsonProperty(value = "company")
    private long company;
    @JsonIgnore
    @JsonProperty(value = "collection")
    private long collection;
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
        return person;
    }

    public void setPerson(long person) {
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
        return game;
    }

    public void setGame(long game) {
        this.game = game;
    }

    public long getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(long publishedAt) {
        this.publishedAt = publishedAt;
    }

    public long getTheme() {
        return theme;
    }

    public void setTheme(long theme) {
        this.theme = theme;
    }

    public long getTestDummy() {
        return testDummy;
    }

    public void setTestDummy(long testDummy) {
        this.testDummy = testDummy;
    }

    public long getPlatform() {
        return platform;
    }

    public void setPlatform(long platform) {
        this.platform = platform;
    }

    public long getCompany() {
        return company;
    }

    public void setCompany(long company) {
        this.company = company;
    }

    public long getCollection() {
        return collection;
    }

    public void setCollection(long collection) {
        this.collection = collection;
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
                person == search.person &&
                Double.compare(search.popularity, popularity) == 0 &&
                game == search.game &&
                publishedAt == search.publishedAt &&
                theme == search.theme &&
                testDummy == search.testDummy &&
                platform == search.platform &&
                company == search.company &&
                collection == search.collection &&
                Objects.equals(name, search.name) &&
                Objects.equals(nameAlternative, search.nameAlternative) &&
                Objects.equals(description, search.description) &&
                Objects.equals(checksum, search.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nameAlternative, person, description, popularity, game, publishedAt, theme, testDummy, platform, company, collection, checksum);
    }
}
