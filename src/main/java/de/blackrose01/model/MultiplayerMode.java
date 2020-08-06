package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

public class MultiplayerMode implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "game")
    private long game;
    @JsonIgnore
    @JsonProperty(value = "platform")
    private long platform;
    @JsonIgnore
    @JsonProperty(value = "dropin")
    private boolean isDropin;
    @JsonIgnore
    @JsonProperty(value = "lancoop")
    private boolean isLanCoop;
    @JsonIgnore
    @JsonProperty(value = "offlinecoop")
    private boolean isOfflineCoop;
    @JsonIgnore
    @JsonProperty(value = "offlinecoopmax")
    private int offlineCoopMax;
    @JsonIgnore
    @JsonProperty(value = "offlinemax")
    private int offlineMax;
    @JsonIgnore
    @JsonProperty(value = "onlinecoop")
    private boolean isOnlineCoop;
    @JsonIgnore
    @JsonProperty(value = "onlinecoopmax")
    private int onlineCoopMax;
    @JsonIgnore
    @JsonProperty(value = "onlinemax")
    private int onlineMax;
    @JsonIgnore
    @JsonProperty(value = "splitscreen")
    private boolean isSplitscreen;
    @JsonIgnore
    @JsonProperty(value = "splitscreenonline")
    private boolean isSplitscreenOnline;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public MultiplayerMode() {}

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

    public long getPlatform() {
        return platform;
    }

    public void setPlatform(long platform) {
        this.platform = platform;
    }

    public boolean isDropin() {
        return isDropin;
    }

    public void setDropin(boolean dropin) {
        isDropin = dropin;
    }

    public boolean isLanCoop() {
        return isLanCoop;
    }

    public void setLanCoop(boolean lanCoop) {
        isLanCoop = lanCoop;
    }

    public boolean isOfflineCoop() {
        return isOfflineCoop;
    }

    public void setOfflineCoop(boolean offlineCoop) {
        isOfflineCoop = offlineCoop;
    }

    public int getOfflineCoopMax() {
        return offlineCoopMax;
    }

    public void setOfflineCoopMax(int offlineCoopMax) {
        this.offlineCoopMax = offlineCoopMax;
    }

    public int getOfflineMax() {
        return offlineMax;
    }

    public void setOfflineMax(int offlineMax) {
        this.offlineMax = offlineMax;
    }

    public boolean isOnlineCoop() {
        return isOnlineCoop;
    }

    public void setOnlineCoop(boolean onlineCoop) {
        isOnlineCoop = onlineCoop;
    }

    public int getOnlineCoopMax() {
        return onlineCoopMax;
    }

    public void setOnlineCoopMax(int onlineCoopMax) {
        this.onlineCoopMax = onlineCoopMax;
    }

    public int getOnlineMax() {
        return onlineMax;
    }

    public void setOnlineMax(int onlineMax) {
        this.onlineMax = onlineMax;
    }

    public boolean isSplitscreen() {
        return isSplitscreen;
    }

    public void setSplitscreen(boolean splitscreen) {
        isSplitscreen = splitscreen;
    }

    public boolean isSplitscreenOnline() {
        return isSplitscreenOnline;
    }

    public void setSplitscreenOnline(boolean splitscreenOnline) {
        isSplitscreenOnline = splitscreenOnline;
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
        MultiplayerMode that = (MultiplayerMode) o;
        return id == that.id &&
                game == that.game &&
                platform == that.platform &&
                isDropin == that.isDropin &&
                isLanCoop == that.isLanCoop &&
                isOfflineCoop == that.isOfflineCoop &&
                offlineCoopMax == that.offlineCoopMax &&
                offlineMax == that.offlineMax &&
                isOnlineCoop == that.isOnlineCoop &&
                onlineCoopMax == that.onlineCoopMax &&
                onlineMax == that.onlineMax &&
                isSplitscreen == that.isSplitscreen &&
                isSplitscreenOnline == that.isSplitscreenOnline &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, game, platform, isDropin, isLanCoop, isOfflineCoop, offlineCoopMax, offlineMax, isOnlineCoop, onlineCoopMax, onlineMax, isSplitscreen, isSplitscreenOnline, checksum);
    }
}
