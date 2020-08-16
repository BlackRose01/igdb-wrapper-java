package de.blackrose01.model.achievement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.game.Game;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Achievement data for specific games for specific platforms (currently limited to acheivements from steam, playstation and Xbox)
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Achievement implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonIgnore
    @JsonProperty(value = "language")
    private int language;
    @JsonIgnore
    @JsonProperty(value = "rank")
    private int rank;
    @JsonIgnore
    @JsonProperty(value = "description")
    private String description;
    @JsonIgnore
    @JsonProperty(value = "external_id")
    private String idExternal;
    @JsonProperty(value = "game")
    private Object game;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonProperty(value = "achievement_icon")
    private Object iconAchievement;
    @JsonProperty(value = "locked_achievement_icon")
    private Object iconAchievementLocked;
    @JsonIgnore
    @JsonProperty(value = "owners_percentage")
    private double percentageOwners;
    @JsonIgnore
    @JsonProperty(value = "tags")
    private List<Long> tags;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Achievement() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdExternal() {
        return idExternal;
    }

    public void setIdExternal(String idExternal) {
        this.idExternal = idExternal;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonIgnore
    public long getIconAchievement() {
        return Long.parseLong(String.valueOf(iconAchievement));
    }

    @JsonIgnore
    public AchievementIcon getIconAchievementObject() {
        return new ObjectMapper().convertValue(iconAchievement, AchievementIcon.class);
    }

    public void setIconAchievement(Object iconAchievement) {
        this.iconAchievement = iconAchievement;
    }

    @JsonIgnore
    public long getIconAchievementLocked() {
        return Long.parseLong(String.valueOf(iconAchievementLocked));
    }

    @JsonIgnore
    public AchievementIcon getIconAchievementLockedObject() {
        return new ObjectMapper().convertValue(iconAchievementLocked, AchievementIcon.class);
    }

    public void setIconAchievementLocked(Object iconAchievementLocked) {
        this.iconAchievementLocked = iconAchievementLocked;
    }

    public double getPercentageOwners() {
        return percentageOwners;
    }

    public void setPercentageOwners(double percentageOwners) {
        this.percentageOwners = percentageOwners;
    }

    public List<Long> getTags() {
        return tags;
    }

    public void setTags(List<Long> tags) {
        this.tags = tags;
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
        Achievement that = (Achievement) o;
        return id == that.id &&
                category == that.category &&
                language == that.language &&
                rank == that.rank &&
                Double.compare(that.percentageOwners, percentageOwners) == 0 &&
                createdAt == that.createdAt &&
                updatedAt == that.updatedAt &&
                Objects.equals(description, that.description) &&
                Objects.equals(idExternal, that.idExternal) &&
                Objects.equals(game, that.game) &&
                Objects.equals(name, that.name) &&
                Objects.equals(slug, that.slug) &&
                Objects.equals(iconAchievement, that.iconAchievement) &&
                Objects.equals(iconAchievementLocked, that.iconAchievementLocked) &&
                Objects.equals(tags, that.tags) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, language, rank, description, idExternal, game, name, slug, iconAchievement, iconAchievementLocked, percentageOwners, tags, createdAt, updatedAt, checksum);
    }
}
