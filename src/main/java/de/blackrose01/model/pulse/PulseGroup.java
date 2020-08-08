package de.blackrose01.model.pulse;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import de.blackrose01.model.ExternalGame;
import de.blackrose01.model.game.Game;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

public class PulseGroup implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "game")
    private long game;
    @JsonIgnore
    @JsonProperty(value = "game")
    private Game gameObject;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "pulses")
    private List<Long> pulses;
    @JsonIgnore
    @JsonProperty(value = "pulses")
    private List<Pulse> pulsesObject;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getPulses() {
        return pulses;
    }

    public void setPulses(List<Long> pulses) {
        this.pulses = pulses;
    }

    public List<Pulse> getPulsesObject() {
        return pulsesObject;
    }

    public void setPulsesObject(List<Pulse> pulsesObject) {
        this.pulsesObject = pulsesObject;
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

    @JsonSetter("game")
    public void setGameJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.game = jsonNode.asLong();
        else
            this.gameObject = new Gson().fromJson(jsonNode.toString(), Game.class);
    }

    @JsonSetter("pulses")
    public void setExternalGamesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Pulse>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.pulses = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.pulsesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
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
                game == that.game &&
                createdAt == that.createdAt &&
                updatedAt == that.updatedAt &&
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
