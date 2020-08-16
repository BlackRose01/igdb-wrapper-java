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
 * Screenshots of games
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Screenshot implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "alpha_channel")
    private boolean isAlphaChannel;
    @JsonIgnore
    @JsonProperty(value = "animated")
    private boolean isAnimated;
    @JsonProperty(value = "game")
    private Object game;
    @JsonIgnore
    @JsonProperty(value = "height")
    private int height;
    @JsonIgnore
    @JsonProperty(value = "width")
    private int width;
    @JsonIgnore
    @JsonProperty(value = "image_id")
    private String idImage;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Screenshot() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isAlphaChannel() {
        return isAlphaChannel;
    }

    public void setAlphaChannel(boolean alphaChannel) {
        isAlphaChannel = alphaChannel;
    }

    public boolean isAnimated() {
        return isAnimated;
    }

    public void setAnimated(boolean animated) {
        isAnimated = animated;
    }

    @JsonIgnore
    public long getGame() {
        return Long.parseLong(String.valueOf(game));
    }

    @JsonIgnore
    public Game getGameObject() {
        return new ObjectMapper().convertValue(game, Game.class);
    }

    public void setGame(Object game) {
        this.game = game;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getIdImage() {
        return idImage;
    }

    public void setIdImage(String idImage) {
        this.idImage = idImage;
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
        Screenshot that = (Screenshot) o;
        return id == that.id &&
                isAlphaChannel == that.isAlphaChannel &&
                isAnimated == that.isAnimated &&
                height == that.height &&
                width == that.width &&
                Objects.equals(game, that.game) &&
                Objects.equals(idImage, that.idImage) &&
                Objects.equals(url, that.url) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isAlphaChannel, isAnimated, game, height, width, idImage, url, checksum);
    }
}
