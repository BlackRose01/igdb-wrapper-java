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
 * official artworks (resolution and aspect ratio may vary)
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Artwork implements Serializable {
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

    public Artwork() {
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

    public long getGame() {
        return Long.parseLong(String.valueOf(game));
    }

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
        Artwork artwork = (Artwork) o;
        return id == artwork.id &&
                isAlphaChannel == artwork.isAlphaChannel &&
                isAnimated == artwork.isAnimated &&
                height == artwork.height &&
                width == artwork.width &&
                Objects.equals(game, artwork.game) &&
                Objects.equals(idImage, artwork.idImage) &&
                Objects.equals(url, artwork.url) &&
                Objects.equals(checksum, artwork.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isAlphaChannel, isAnimated, game, height, width, idImage, url, checksum);
    }
}
