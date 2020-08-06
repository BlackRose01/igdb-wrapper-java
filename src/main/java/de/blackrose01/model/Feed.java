package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Feed implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonIgnore
    @JsonProperty(value = "pulse")
    private long pulse;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "meta")
    private String meta;
    @JsonIgnore
    @JsonProperty(value = "content")
    private String content;
    @JsonIgnore
    @JsonProperty(value = "feed_likes_count")
    private int feedLikesCount;
    @JsonIgnore
    @JsonProperty(value = "feed_video")
    private long feedVideo;
    @JsonIgnore
    @JsonProperty(value = "games")
    private List<Long> games;
    @JsonIgnore
    @JsonProperty(value = "title")
    private String title;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonIgnore
    @JsonProperty(value = "uid")
    private String uid;
    @JsonIgnore
    @JsonProperty(value = "user")
    private long user;
    @JsonIgnore
    @JsonProperty(value = "published_at")
    private long publishedAt;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Feed() {}

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

    public long getPulse() {
        return pulse;
    }

    public void setPulse(long pulse) {
        this.pulse = pulse;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFeedLikesCount() {
        return feedLikesCount;
    }

    public void setFeedLikesCount(int feedLikesCount) {
        this.feedLikesCount = feedLikesCount;
    }

    public long getFeedVideo() {
        return feedVideo;
    }

    public void setFeedVideo(long feedVideo) {
        this.feedVideo = feedVideo;
    }

    public List<Long> getGames() {
        return games;
    }

    public void setGames(List<Long> games) {
        this.games = games;
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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public long getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(long publishedAt) {
        this.publishedAt = publishedAt;
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
        Feed feed = (Feed) o;
        return id == feed.id &&
                category == feed.category &&
                pulse == feed.pulse &&
                feedLikesCount == feed.feedLikesCount &&
                feedVideo == feed.feedVideo &&
                user == feed.user &&
                publishedAt == feed.publishedAt &&
                createdAt == feed.createdAt &&
                updatedAt == feed.updatedAt &&
                Objects.equals(url, feed.url) &&
                Objects.equals(meta, feed.meta) &&
                Objects.equals(content, feed.content) &&
                Objects.equals(games, feed.games) &&
                Objects.equals(title, feed.title) &&
                Objects.equals(slug, feed.slug) &&
                Objects.equals(uid, feed.uid) &&
                Objects.equals(checksum, feed.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, pulse, url, meta, content, feedLikesCount, feedVideo, games, title, slug, uid, user, publishedAt, createdAt, updatedAt, checksum);
    }
}
