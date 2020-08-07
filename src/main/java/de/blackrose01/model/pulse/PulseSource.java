package de.blackrose01.model.pulse;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;
import de.blackrose01.model.page.Page;

import java.io.Serializable;
import java.util.Objects;

public class PulseSource implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "page")
    private long page;
    @JsonIgnore
    @JsonProperty(value = "page")
    private Page pageObject;
    @JsonIgnore
    @JsonProperty(value = "game")
    private long game;
    @JsonIgnore
    @JsonProperty(value = "game")
    private Game gameObject;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public PulseSource() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public Page getPageObject() {
        return pageObject;
    }

    public void setPageObject(Page pageObject) {
        this.pageObject = pageObject;
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

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @JsonSetter("page")
    public void setPageJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.page = jsonNode.asLong();
        else
            this.pageObject = new Gson().fromJson(jsonNode.toString(), Page.class);
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
        PulseSource that = (PulseSource) o;
        return id == that.id &&
                page == that.page &&
                game == that.game &&
                Objects.equals(name, that.name) &&
                Objects.equals(pageObject, that.pageObject) &&
                Objects.equals(gameObject, that.gameObject) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, page, pageObject, game, gameObject, checksum);
    }
}
