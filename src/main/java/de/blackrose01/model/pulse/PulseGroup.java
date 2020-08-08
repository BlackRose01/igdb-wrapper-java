package de.blackrose01.model.pulse;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Pulse groups are a combined array of news articles that are about a specific game and were published around the same time period.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PulseGroup implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonProperty(value = "game")
    private Object game;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "pulses")
    private List<Object> pulses;
    @JsonIgnore
    @JsonProperty(value = "tags")
    private List<Long> tags;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public PulseGroup() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getPulses() {
        return new ObjectMapper().convertValue(pulses, new TypeReference<List<Long>>(){});
    }

    public List<Pulse> getPulsesObject() {
        return new ObjectMapper().convertValue(pulses, new TypeReference<List<Pulse>>(){});
    }

    public void setPulses(List<Object> pulses) {
        this.pulses = pulses;
    }

    public List<Long> getTags() {
        return tags;
    }

    public void setTags(List<Long> tags) {
        this.tags = tags;
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
        PulseGroup that = (PulseGroup) o;
        return id == that.id &&
                createdAt == that.createdAt &&
                updatedAt == that.updatedAt &&
                Objects.equals(game, that.game) &&
                Objects.equals(name, that.name) &&
                Objects.equals(pulses, that.pulses) &&
                Objects.equals(tags, that.tags) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, game, name, pulses, tags, createdAt, updatedAt, checksum);
    }
}
