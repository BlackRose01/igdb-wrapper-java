package de.blackrose01.model.privates;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

public class Review implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonIgnore
    @JsonProperty(value = "introduction")
    private String introduction;
    @JsonIgnore
    @JsonProperty(value = "content")
    private String content;
    @JsonIgnore
    @JsonProperty(value = "conclusion")
    private String conclusion;
    @JsonIgnore
    @JsonProperty(value = "positive_points")
    private String pointsPositive;
    @JsonIgnore
    @JsonProperty(value = "negative_points")
    private String pointsNegative;
    @JsonIgnore
    @JsonProperty(value = "game")
    private long game;
    @JsonIgnore
    @JsonProperty(value = "likes")
    private int likes;
    @JsonIgnore
    @JsonProperty(value = "title")
    private String title;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "user")
    private long user;
    @JsonIgnore
    @JsonProperty(value = "user_rating")
    private long userRating;
    @JsonIgnore
    @JsonProperty(value = "views")
    private long views;
    @JsonIgnore
    @JsonProperty(value = "platform")
    private long platform;
    @JsonIgnore
    @JsonProperty(value = "video")
    private long video;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Review() {}

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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getPointsPositive() {
        return pointsPositive;
    }

    public void setPointsPositive(String pointsPositive) {
        this.pointsPositive = pointsPositive;
    }

    public String getPointsNegative() {
        return pointsNegative;
    }

    public void setPointsNegative(String pointsNegative) {
        this.pointsNegative = pointsNegative;
    }

    public long getGame() {
        return game;
    }

    public void setGame(long game) {
        this.game = game;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public long getUserRating() {
        return userRating;
    }

    public void setUserRating(long userRating) {
        this.userRating = userRating;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public long getPlatform() {
        return platform;
    }

    public void setPlatform(long platform) {
        this.platform = platform;
    }

    public long getVideo() {
        return video;
    }

    public void setVideo(long video) {
        this.video = video;
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
        Review review = (Review) o;
        return id == review.id &&
                category == review.category &&
                game == review.game &&
                likes == review.likes &&
                user == review.user &&
                userRating == review.userRating &&
                views == review.views &&
                platform == review.platform &&
                video == review.video &&
                createdAt == review.createdAt &&
                updatedAt == review.updatedAt &&
                Objects.equals(introduction, review.introduction) &&
                Objects.equals(content, review.content) &&
                Objects.equals(conclusion, review.conclusion) &&
                Objects.equals(pointsPositive, review.pointsPositive) &&
                Objects.equals(pointsNegative, review.pointsNegative) &&
                Objects.equals(title, review.title) &&
                Objects.equals(slug, review.slug) &&
                Objects.equals(url, review.url) &&
                Objects.equals(checksum, review.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, introduction, content, conclusion, pointsPositive, pointsNegative, game, likes, title, slug, url, user, userRating, views, platform, video, createdAt, updatedAt, checksum);
    }
}