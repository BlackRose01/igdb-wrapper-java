package de.blackrose01.model.game;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
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
    @JsonProperty(value = "game")
    private Game gameObject;
    @JsonIgnore
    @JsonProperty(value = "game_feature")
    private long gameFeature;
    @JsonIgnore
    @JsonProperty(value = "game_feature")
    private GameVersionFeature gameFeatureObject;
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

    @JsonSetter("game")
    public void setGameJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.game = jsonNode.asLong();
        else
            this.gameObject = new Gson().fromJson(jsonNode.toString(), Game.class);
    }

    @JsonSetter("game_feature")
    public void setGameFeatureJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.gameFeature = jsonNode.asLong();
        else
            this.gameFeatureObject = new Gson().fromJson(jsonNode.toString(), GameVersionFeature.class);
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
                Objects.equals(gameObject, that.gameObject) &&
                Objects.equals(gameFeatureObject, that.gameFeatureObject) &&
                Objects.equals(note, that.note) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, game, gameObject, gameFeature, gameFeatureObject, featureInclude, note, checksum);
    }
}
