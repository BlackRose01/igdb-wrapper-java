package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.company.Company;
import de.blackrose01.model.game.Game;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InvolvedCompany implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonProperty(value = "company")
    private Object company;
    @JsonProperty(value = "game")
    private Object game;
    @JsonIgnore
    @JsonProperty(value = "developer")
    private boolean isDeveloper;
    @JsonIgnore
    @JsonProperty(value = "porting")
    private boolean isPorting;
    @JsonIgnore
    @JsonProperty(value = "publisher")
    private boolean isPublisher;
    @JsonIgnore
    @JsonProperty(value = "supporting")
    private boolean isSupporting;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public InvolvedCompany() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonIgnore
    public long getCompany() {
        return Long.parseLong(String.valueOf(company));
    }

    @JsonIgnore
    public Company getCompanyObject() {
        return new ObjectMapper().convertValue(company, Company.class);
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    @JsonIgnore
    public long getGame() {
        return Long.parseLong(String.valueOf(game));
    }

    @JsonIgnore
    public Game getGameObject() {
        return new ObjectMapper().convertValue(game, Game.class);
    }

    public void setGame(Object game) {
        this.game = game;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public void setDeveloper(boolean developer) {
        isDeveloper = developer;
    }

    public boolean isPorting() {
        return isPorting;
    }

    public void setPorting(boolean porting) {
        isPorting = porting;
    }

    public boolean isPublisher() {
        return isPublisher;
    }

    public void setPublisher(boolean publisher) {
        isPublisher = publisher;
    }

    public boolean isSupporting() {
        return isSupporting;
    }

    public void setSupporting(boolean supporting) {
        isSupporting = supporting;
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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvolvedCompany that = (InvolvedCompany) o;
        return id == that.id &&
                isDeveloper == that.isDeveloper &&
                isPorting == that.isPorting &&
                isPublisher == that.isPublisher &&
                isSupporting == that.isSupporting &&
                createdAt == that.createdAt &&
                updatedAt == that.updatedAt &&
                Objects.equals(company, that.company) &&
                Objects.equals(game, that.game) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, game, isDeveloper, isPorting, isPublisher, isSupporting, createdAt, updatedAt, checksum);
    }
}
