package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;

import java.io.Serializable;
import java.util.Objects;

/**
 * A website url, usually associated with a game
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Website implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonProperty(value = "game")
    private Object game;
    @JsonIgnore
    @JsonProperty(value = "trusted")
    private boolean trusted;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Website() {}

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

    public long getGame() {
        return Long.parseLong(String.valueOf(this.game));
    }

    public Game getGameObject() {
        return new ObjectMapper().convertValue(this.game, Game.class);
    }

    public void setGame(Object game) {
        this.game = game;
    }

    public boolean isTrusted() {
        return trusted;
    }

    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        Website website = (Website) o;
        return id == website.id &&
                category == website.category &&
                trusted == website.trusted &&
                Objects.equals(game, website.game) &&
                Objects.equals(url, website.url) &&
                Objects.equals(checksum, website.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, game, trusted, url, checksum);
    }
}
