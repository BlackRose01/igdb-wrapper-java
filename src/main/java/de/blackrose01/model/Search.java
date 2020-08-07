package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import de.blackrose01.model.company.Company;
import de.blackrose01.model.game.Game;
import de.blackrose01.model.platform.Platform;
import de.blackrose01.model.privates.People;

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
    @JsonProperty(value = "person")
    private People personObject;
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
    @JsonProperty(value = "game")
    private Game gameObject;
    @JsonIgnore
    @JsonProperty(value = "theme")
    private long theme;
    @JsonIgnore
    @JsonProperty(value = "theme")
    private Theme themeObject;
    @JsonIgnore
    @JsonProperty(value = "test_dummy")
    private long testDummy;
    @JsonIgnore
    @JsonProperty(value = "platform")
    private long platform;
    @JsonIgnore
    @JsonProperty(value = "platform")
    private Platform platformObject;
    @JsonIgnore
    @JsonProperty(value = "company")
    private long company;
    @JsonIgnore
    @JsonProperty(value = "company")
    private Company companyObject;
    @JsonIgnore
    @JsonProperty(value = "collection")
    private long collection;
    @JsonIgnore
    @JsonProperty(value = "collection")
    private Collection collectionObject;
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

    public People getPersonObject() {
        return personObject;
    }

    public void setPersonObject(People personObject) {
        this.personObject = personObject;
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

    public Game getGameObject() {
        return gameObject;
    }

    public void setGameObject(Game gameObject) {
        this.gameObject = gameObject;
    }

    public long getTheme() {
        return theme;
    }

    public void setTheme(long theme) {
        this.theme = theme;
    }

    public Theme getThemeObject() {
        return themeObject;
    }

    public void setThemeObject(Theme themeObject) {
        this.themeObject = themeObject;
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

    public Platform getPlatformObject() {
        return platformObject;
    }

    public void setPlatformObject(Platform platformObject) {
        this.platformObject = platformObject;
    }

    public long getCompany() {
        return company;
    }

    public void setCompany(long company) {
        this.company = company;
    }

    public Company getCompanyObject() {
        return companyObject;
    }

    public void setCompanyObject(Company companyObject) {
        this.companyObject = companyObject;
    }

    public long getCollection() {
        return collection;
    }

    public void setCollection(long collection) {
        this.collection = collection;
    }

    public Collection getCollectionObject() {
        return collectionObject;
    }

    public void setCollectionObject(Collection collectionObject) {
        this.collectionObject = collectionObject;
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

    @JsonSetter("people")
    public void setPeopleJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.person = jsonNode.asLong();
        else
            this.personObject = new Gson().fromJson(jsonNode.toString(), People.class);
    }

    @JsonSetter("game")
    public void setGameJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.game = jsonNode.asLong();
        else
            this.gameObject = new Gson().fromJson(jsonNode.toString(), Game.class);
    }

    @JsonSetter("theme")
    public void setThemeJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.theme = jsonNode.asLong();
        else
            this.themeObject = new Gson().fromJson(jsonNode.toString(), Theme.class);
    }

    @JsonSetter("platform")
    public void setPlatformJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.platform = jsonNode.asLong();
        else
            this.platformObject = new Gson().fromJson(jsonNode.toString(), Platform.class);
    }

    @JsonSetter("collection")
    public void setCollectionJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.collection = jsonNode.asLong();
        else
            this.collectionObject = new Gson().fromJson(jsonNode.toString(), Collection.class);
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
                theme == search.theme &&
                testDummy == search.testDummy &&
                platform == search.platform &&
                company == search.company &&
                collection == search.collection &&
                publishedAt == search.publishedAt &&
                Objects.equals(name, search.name) &&
                Objects.equals(nameAlternative, search.nameAlternative) &&
                Objects.equals(personObject, search.personObject) &&
                Objects.equals(description, search.description) &&
                Objects.equals(gameObject, search.gameObject) &&
                Objects.equals(themeObject, search.themeObject) &&
                Objects.equals(platformObject, search.platformObject) &&
                Objects.equals(companyObject, search.companyObject) &&
                Objects.equals(collectionObject, search.collectionObject) &&
                Objects.equals(checksum, search.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nameAlternative, person, personObject, description, popularity, game, gameObject, theme, themeObject, testDummy, platform, platformObject, company, companyObject, collection, collectionObject, publishedAt, checksum);
    }
}
