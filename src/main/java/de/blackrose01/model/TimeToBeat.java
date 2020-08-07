package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;

import java.io.Serializable;
import java.util.Objects;

public class TimeToBeat implements Serializable {
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
    @JsonProperty(value = "normally")
    private long normally;
    @JsonIgnore
    @JsonProperty(value = "completely")
    private long completely;
    @JsonIgnore
    @JsonProperty(value = "hastly")
    private long hastly;

    public TimeToBeat() {}

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

    public long getNormally() {
        return normally;
    }

    public void setNormally(long normally) {
        this.normally = normally;
    }

    public long getCompletely() {
        return completely;
    }

    public void setCompletely(long completely) {
        this.completely = completely;
    }

    public long getHastly() {
        return hastly;
    }

    public void setHastly(long hastly) {
        this.hastly = hastly;
    }

    @JsonSetter("game")
    public void setGameJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.game = jsonNode.asLong();
        else
            this.gameObject = new Gson().fromJson(jsonNode.toString(), Game.class);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeToBeat that = (TimeToBeat) o;
        return id == that.id &&
                game == that.game &&
                normally == that.normally &&
                completely == that.completely &&
                hastly == that.hastly &&
                Objects.equals(gameObject, that.gameObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, game, gameObject, normally, completely, hastly);
    }
}
