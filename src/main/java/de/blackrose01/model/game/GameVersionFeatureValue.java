package de.blackrose01.model.game;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

/**
 * The bool/text value of the feature
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameVersionFeatureValue implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonProperty(value = "game")
    private Object game;
    @JsonProperty(value = "game_feature")
    private Object gameFeature;
    @JsonIgnore
    @JsonProperty(value = "included_feature")
    private int featureInclude;
    @JsonIgnore
    @JsonProperty(value = "note")
    private String note;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public GameVersionFeatureValue() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonIgnore
    public long getGame() {
        return Long.parseLong(String.valueOf(game));
    }

    @JsonIgnore
    public Game getGameObject() {
        return new ObjectMapper().convertValue(game, Game.class);
    }

    public void setGame(long game) {
        this.game = game;
    }

    public long getGameFeature() {
        return Long.parseLong(String.valueOf(gameFeature));
    }

    public GameVersionFeature getGameFeatureObject() {
        return new ObjectMapper().convertValue(gameFeature, GameVersionFeature.class);
    }

    public void setGameFeature(Object gameFeature) {
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
                featureInclude == that.featureInclude &&
                Objects.equals(gameFeature, that.gameFeature) &&
                Objects.equals(note, that.note) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, game, gameFeature, featureInclude, note, checksum);
    }
}
