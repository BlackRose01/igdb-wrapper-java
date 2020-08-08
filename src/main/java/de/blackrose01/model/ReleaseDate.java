package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;
import de.blackrose01.model.platform.Platform;

import java.io.Serializable;
import java.util.Objects;

/**
 * A handy endpoint that extends game release dates. Used to dig deeper into release dates, platforms and versions.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleaseDate implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonProperty(value = "platform")
    private Object platform;
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
    @JsonProperty(value = "game")
    private Object game;
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
        return Long.parseLong(String.valueOf(platform));
    }

    public Platform getPlatformObject() {
        return new ObjectMapper().convertValue(platform, Platform.class);
    }

    public void setPlatform(Object platform) {
        this.platform = platform;
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
        return Long.parseLong(String.valueOf(this.game));
    }

    public Game getGameObject() {
        return new ObjectMapper().convertValue(this.game, Game.class);
    }

    public void setGame(Object game) {
        this.game = game;
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
                m == that.m &&
                y == that.y &&
                region == that.region &&
                date == that.date &&
                createdAt == that.createdAt &&
                updatedAt == that.updatedAt &&
                Objects.equals(platform, that.platform) &&
                Objects.equals(human, that.human) &&
                Objects.equals(game, that.game) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, platform, m, y, region, human, game, date, createdAt, updatedAt, checksum);
    }
}
