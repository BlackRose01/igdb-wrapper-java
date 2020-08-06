package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

public class GameVersionFeatureValue implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "game")
    private long game;
    @JsonIgnore
    @JsonProperty(value = "game_feature")
    private long gameFeature;
    @JsonIgnore
    @JsonProperty(value = "included_feature")
    private int featureInclude;
    @JsonIgnore
    @JsonProperty(value = "note")
    private String note;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public GameVersionFeatureValue() {}

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

    public long getGameFeature() {
        return gameFeature;
    }

    public void setGameFeature(long gameFeature) {
        this.gameFeature = gameFeature;
    }

    public int getFeatureInclude() {
        return featureInclude;
    }

    public void setFeatureInclude(int featureInclude) {
        this.featureInclude = featureInclude;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        GameVersionFeatureValue that = (GameVersionFeatureValue) o;
        return id == that.id &&
                game == that.game &&
                gameFeature == that.gameFeature &&
                featureInclude == that.featureInclude &&
                Objects.equals(note, that.note) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, game, gameFeature, featureInclude, note, checksum);
    }
}
