package de.blackrose01.model.privates;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;
import de.blackrose01.model.platform.Platform;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListEntry implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonProperty(value = "game")
    private Object game;
    @JsonProperty(value = "list")
    private Object list;
    @JsonIgnore
    @JsonProperty(value = "position")
    private int position;
    @JsonIgnore
    @JsonProperty(value = "private")
    private boolean isPrivate;
    @JsonIgnore
    @JsonProperty(value = "user")
    private long user;
    @JsonProperty(value = "platform")
    private Object platform;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public ListEntry() {}

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

    public long getList() {
        return Long.parseLong(String.valueOf(list));
    }

    public List getListObject() {
        return new ObjectMapper().convertValue(list, List.class);
    }

    public void setList(Object list) {
        this.list = list;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public long getPlatform() {
        return Long.parseLong(String.valueOf(platform));
    }

    public Platform getPlatformObject() {
        return new ObjectMapper().convertValue(platform, Platform.class);
    }

    public void setPlatform(Object platform) {
        this.platform = platform;
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
        ListEntry listEntry = (ListEntry) o;
        return id == listEntry.id &&
                game == listEntry.game &&
                list == listEntry.list &&
                position == listEntry.position &&
                isPrivate == listEntry.isPrivate &&
                user == listEntry.user &&
                platform == listEntry.platform &&
                Objects.equals(checksum, listEntry.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, game, list, position, isPrivate, user, platform, checksum);
    }
}
