package de.blackrose01.model.privates;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

public class ListEntry implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "game")
    private long game;
    @JsonIgnore
    @JsonProperty(value = "list")
    private long list;
    @JsonIgnore
    @JsonProperty(value = "position")
    private int position;
    @JsonIgnore
    @JsonProperty(value = "private")
    private boolean isPrivate;
    @JsonIgnore
    @JsonProperty(value = "user")
    private long user;
    @JsonIgnore
    @JsonProperty(value = "platform")
    private long platform;
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
        return game;
    }

    public void setGame(long game) {
        this.game = game;
    }

    public long getList() {
        return list;
    }

    public void setList(long list) {
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
        return platform;
    }

    public void setPlatform(long platform) {
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
