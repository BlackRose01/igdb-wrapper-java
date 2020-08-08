package de.blackrose01.model.page;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import de.blackrose01.model.ExternalGame;
import de.blackrose01.model.Feed;
import de.blackrose01.model.company.Company;
import de.blackrose01.model.game.Game;
import de.blackrose01.model.platform.Platform;

import java.io.Serializable;
import java.lang.reflect.Type;
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
    @JsonProperty(value = "background")
    private PageBackground backgroundObject;
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
    @JsonProperty(value = "company")
    private Company companyObject;
    @JsonIgnore
    @JsonProperty(value = "feed")
    private long feed;
    @JsonIgnore
    @JsonProperty(value = "feed")
    private Feed feedObject;
    @JsonIgnore
    @JsonProperty(value = "game")
    private long game;
    @JsonIgnore
    @JsonProperty(value = "game")
    private Game gameObject;
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
    @JsonProperty(value = "websites")
    private List<PageWebsite> websitesObject;
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

    public PageBackground getBackgroundObject() {
        return backgroundObject;
    }

    public void setBackgroundObject(PageBackground backgroundObject) {
        this.backgroundObject = backgroundObject;
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

    public Company getCompanyObject() {
        return companyObject;
    }

    public void setCompanyObject(Company companyObject) {
        this.companyObject = companyObject;
    }

    public long getFeed() {
        return feed;
    }

    public void setFeed(long feed) {
        this.feed = feed;
    }

    public Feed getFeedObject() {
        return feedObject;
    }

    public void setFeedObject(Feed feedObject) {
        this.feedObject = feedObject;
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

    public List<PageWebsite> getWebsitesObject() {
        return websitesObject;
    }

    public void setWebsitesObject(List<PageWebsite> websitesObject) {
        this.websitesObject = websitesObject;
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

    @JsonSetter("background")
    public void setBackgroundJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.background = jsonNode.asLong();
        else
            this.backgroundObject = new Gson().fromJson(jsonNode.toString(), PageBackground.class);
    }

    @JsonSetter("company")
    public void setCompanyJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.company = jsonNode.asLong();
        else
            this.companyObject = new Gson().fromJson(jsonNode.toString(), Company.class);
    }

    @JsonSetter("feed")
    public void setFeedJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.feed = jsonNode.asLong();
        else
            this.feedObject = new Gson().fromJson(jsonNode.toString(), Feed.class);
    }

    @JsonSetter("game")
    public void setGameJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.game = jsonNode.asLong();
        else
            this.gameObject = new Gson().fromJson(jsonNode.toString(), Game.class);
    }

    @JsonSetter("websites")
    public void setWebsitesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<PageWebsite>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.websites = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.websitesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
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
                Objects.equals(backgroundObject, page.backgroundObject) &&
                Objects.equals(name, page.name) &&
                Objects.equals(description, page.description) &&
                Objects.equals(slug, page.slug) &&
                Objects.equals(battlenet, page.battlenet) &&
                Objects.equals(companyObject, page.companyObject) &&
                Objects.equals(feedObject, page.feedObject) &&
                Objects.equals(gameObject, page.gameObject) &&
                Objects.equals(origin, page.origin) &&
                Objects.equals(uplay, page.uplay) &&
                Objects.equals(url, page.url) &&
                Objects.equals(websites, page.websites) &&
                Objects.equals(websitesObject, page.websitesObject) &&
                Objects.equals(checksum, page.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, background, backgroundObject, country, name, description, slug, battlenet, company, companyObject, feed, feedObject, game, gameObject, origin, uplay, pageFollowsCount, pageLogo, url, user, websites, websitesObject, category, categorySub, color, createdAt, updatedAt, checksum);
    }
}
