package de.blackrose01.model.platform;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

/**
 * Logo for a platform
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlatformLogo implements Serializable {
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
    @JsonProperty(value = "image_id")
    private String idImage;
    @JsonIgnore
    @JsonProperty(value = "height")
    private int height;
    @JsonIgnore
    @JsonProperty(value = "width")
    private int width;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public PlatformLogo() {}

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

    public String getIdImage() {
        return idImage;
    }

    public void setIdImage(String idImage) {
        this.idImage = idImage;
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
        PlatformLogo that = (PlatformLogo) o;
        return id == that.id &&
                isAlphaChannel == that.isAlphaChannel &&
                isAnimated == that.isAnimated &&
                height == that.height &&
                width == that.width &&
                Objects.equals(idImage, that.idImage) &&
                Objects.equals(url, that.url) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isAlphaChannel, isAnimated, idImage, height, width, url, checksum);
    }
}
