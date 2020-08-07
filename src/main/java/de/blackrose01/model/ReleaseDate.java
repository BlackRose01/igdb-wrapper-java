package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;
import de.blackrose01.model.platform.Platform;

import java.io.Serializable;
import java.util.Objects;

public class ReleaseDate implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonIgnore
    @JsonProperty(value = "platform")
    private long platform;
    @JsonIgnore
    @JsonProperty(value = "platform")
    private Platform platformObject;
    @JsonIgnore
    @JsonProperty(value = "m")
    private int m;
    @JsonIgnore
    @JsonProperty(value = "y")
    private int y;
    @JsonIgnore
    @JsonProperty(value = "region")
    private int region;
    @JsonIgnore
    @JsonProperty(value = "human")
    private String human;
    @JsonIgnore
    @JsonProperty(value = "game")
    private long game;
    @JsonIgnore
    @JsonProperty(value = "game")
    private Game gameObject;
    @JsonIgnore
    @JsonProperty(value = "date")
    private long date;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public ReleaseDate() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
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

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human;
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

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
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

    @JsonSetter("game")
    public void setGameJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.game = jsonNode.asLong();
        else
            this.gameObject = new Gson().fromJson(jsonNode.toString(), Game.class);
    }

    @JsonSetter("platform")
    public void setPlatformJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.platform = jsonNode.asLong();
        else
            this.platformObject = new Gson().fromJson(jsonNode.toString(), Platform.class);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReleaseDate that = (ReleaseDate) o;
        return id == that.id &&
                category == that.category &&
                platform == that.platform &&
                m == that.m &&
                y == that.y &&
                region == that.region &&
                game == that.game &&
                date == that.date &&
                createdAt == that.createdAt &&
                updatedAt == that.updatedAt &&
                Objects.equals(platformObject, that.platformObject) &&
                Objects.equals(human, that.human) &&
                Objects.equals(gameObject, that.gameObject) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, platform, platformObject, m, y, region, human, game, gameObject, date, createdAt, updatedAt, checksum);
    }
}
