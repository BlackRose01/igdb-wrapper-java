package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterMugShot implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "alpha_channel")
    private boolean isAlphaChannel;
    @JsonIgnore
    @JsonProperty(value = "animated")
    private boolean isAnimated;
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

    public CharacterMugShot() {}

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
        CharacterMugShot pageLogo = (CharacterMugShot) o;
        return id == pageLogo.id &&
                isAlphaChannel == pageLogo.isAlphaChannel &&
                isAnimated == pageLogo.isAnimated &&
                height == pageLogo.height &&
                width == pageLogo.width &&
                Objects.equals(idImage, pageLogo.idImage) &&
                Objects.equals(url, pageLogo.url) &&
                Objects.equals(checksum, pageLogo.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isAlphaChannel, isAnimated, height, width, idImage, url, checksum);
    }
}
