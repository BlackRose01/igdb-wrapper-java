package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

public class PulseUrl implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "trusted")
    private boolean isTrusted;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public PulseUrl() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isTrusted() {
        return isTrusted;
    }

    public void setTrusted(boolean trusted) {
        isTrusted = trusted;
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
        PulseUrl pulseUrl = (PulseUrl) o;
        return id == pulseUrl.id &&
                isTrusted == pulseUrl.isTrusted &&
                Objects.equals(url, pulseUrl.url) &&
                Objects.equals(checksum, pulseUrl.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isTrusted, url, checksum);
    }
}
