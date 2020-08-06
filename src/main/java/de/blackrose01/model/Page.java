package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Page implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "background")
    private long background;
    @JsonIgnore
    @JsonProperty(value = "country")
    private long country;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "description")
    private String description;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonIgnore
    @JsonProperty(value = "battlenet")
    private String battlenet;
    @JsonIgnore
    @JsonProperty(value = "company")
    private long company;
    @JsonIgnore
    @JsonProperty(value = "feed")
    private long feed;
    @JsonIgnore
    @JsonProperty(value = "game")
    private long game;
    @JsonIgnore
    @JsonProperty(value = "origin")
    private String origin;
    @JsonIgnore
    @JsonProperty(value = "uplay")
    private String uplay;
    @JsonIgnore
    @JsonProperty(value = "page_follows_count")
    private int pageFollowsCount;
    @JsonIgnore
    @JsonProperty(value = "page_logo")
    private long pageLogo;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "user")
    private long user;
    @JsonIgnore
    @JsonProperty(value = "websites")
    private List<Long> websites;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonIgnore
    @JsonProperty(value = "sub_category")
    private int categorySub;
    @JsonIgnore
    @JsonProperty(value = "color")
    private int color;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Page() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBackground() {
        return background;
    }

    public void setBackground(long background) {
        this.background = background;
    }

    public long getCountry() {
        return country;
    }

    public void setCountry(long country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getBattlenet() {
        return battlenet;
    }

    public void setBattlenet(String battlenet) {
        this.battlenet = battlenet;
    }

    public long getCompany() {
        return company;
    }

    public void setCompany(long company) {
        this.company = company;
    }

    public long getFeed() {
        return feed;
    }

    public void setFeed(long feed) {
        this.feed = feed;
    }

    public long getGame() {
        return game;
    }

    public void setGame(long game) {
        this.game = game;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUplay() {
        return uplay;
    }

    public void setUplay(String uplay) {
        this.uplay = uplay;
    }

    public int getPageFollowsCount() {
        return pageFollowsCount;
    }

    public void setPageFollowsCount(int pageFollowsCount) {
        this.pageFollowsCount = pageFollowsCount;
    }

    public long getPageLogo() {
        return pageLogo;
    }

    public void setPageLogo(long pageLogo) {
        this.pageLogo = pageLogo;
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

    public List<Long> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Long> websites) {
        this.websites = websites;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getCategorySub() {
        return categorySub;
    }

    public void setCategorySub(int categorySub) {
        this.categorySub = categorySub;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
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
        Page page = (Page) o;
        return id == page.id &&
                background == page.background &&
                country == page.country &&
                company == page.company &&
                feed == page.feed &&
                game == page.game &&
                pageFollowsCount == page.pageFollowsCount &&
                pageLogo == page.pageLogo &&
                user == page.user &&
                category == page.category &&
                categorySub == page.categorySub &&
                color == page.color &&
                createdAt == page.createdAt &&
                updatedAt == page.updatedAt &&
                Objects.equals(name, page.name) &&
                Objects.equals(description, page.description) &&
                Objects.equals(slug, page.slug) &&
                Objects.equals(battlenet, page.battlenet) &&
                Objects.equals(origin, page.origin) &&
                Objects.equals(uplay, page.uplay) &&
                Objects.equals(url, page.url) &&
                Objects.equals(websites, page.websites) &&
                Objects.equals(checksum, page.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, background, country, name, description, slug, battlenet, company, feed, game, origin, uplay, pageFollowsCount, pageLogo, url, user, websites, category, categorySub, color, createdAt, updatedAt, checksum);
    }
}
