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
 * Alternative and international game titles
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AlternativeName implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonProperty(value = "id")
    private Object game;
    @JsonIgnore
    @JsonProperty(value = "id")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "id")
    private String comment;
    @JsonIgnore
    @JsonProperty(value = "id")
    private String checksum;

    public AlternativeName() {}

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        AlternativeName that = (AlternativeName) o;
        return id == that.id &&
                Objects.equals(game, that.game) &&
                Objects.equals(name, that.name) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, game, name, comment, checksum);
    }
}
