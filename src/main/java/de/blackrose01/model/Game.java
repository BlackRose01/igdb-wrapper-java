package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Game implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonIgnore
    @JsonProperty(value = "status")
    private int status;
    @JsonIgnore
    @JsonProperty(value = "name")
    private String name;
    @JsonIgnore
    @JsonProperty(value = "collection")
    private long collection;
    @JsonIgnore
    @JsonProperty(value = "cover")
    private long cover;
    @JsonIgnore
    @JsonProperty(value = "storyline")
    private String storyline;
    @JsonIgnore
    @JsonProperty(value = "external_games")
    private List<Long> externalGames;
    @JsonIgnore
    @JsonProperty(value = "first_release_date")
    private Long firstReleaseDate;
    @JsonIgnore
    @JsonProperty(value = "game_modes")
    private List<Long> gameModes;
    @JsonIgnore
    @JsonProperty(value = "keywords")
    private List<Long> keywords;
    @JsonIgnore
    @JsonProperty(value = "platforms")
    private List<Long> platforms;
    @JsonIgnore
    @JsonProperty(value = "popularity")
    private double popularity;
    @JsonIgnore
    @JsonProperty(value = "pulse_count")
    private int pulseCount;
    @JsonIgnore
    @JsonProperty(value = "release_dates")
    private List<Long> releaseDates;
    @JsonIgnore
    @JsonProperty(value = "similar_games")
    private List<Long> gamesSimilar;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonIgnore
    @JsonProperty(value = "summary")
    private String summary;
    @JsonIgnore
    @JsonProperty(value = "tags")
    private List<Long> tags;
    @JsonIgnore
    @JsonProperty(value = "themes")
    private List<Long> themes;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "videos")
    private List<Long> videos;
    @JsonIgnore
    @JsonProperty(value = "websites")
    private List<Long> websites;
    @JsonIgnore
    @JsonProperty(value = "parent_game")
    private long gameParent;
    @JsonIgnore
    @JsonProperty(value = "age_ratings")
    private List<Long> ratingsAge;
    @JsonIgnore
    @JsonProperty(value = "rating")
    private double rating;
    @JsonIgnore
    @JsonProperty(value = "rating_count")
    private int ratingCount;
    @JsonIgnore
    @JsonProperty(value = "screenshots")
    private List<Long> screenshots;
    @JsonIgnore
    @JsonProperty(value = "multiplayer_modes")
    private List<Long> modesMultiplayer;
    @JsonIgnore
    @JsonProperty(value = "involved_companies")
    private List<Long> companiesInvolved;
    @JsonIgnore
    @JsonProperty(value = "genres")
    private List<Long> genres;
    @JsonIgnore
    @JsonProperty(value = "game_engines")
    private List<Long> gameEngines;
    @JsonIgnore
    @JsonProperty(value = "franchises")
    private List<Long> franchises;
    @JsonIgnore
    @JsonProperty(value = "artworks")
    private List<Long> artworks;
    @JsonIgnore
    @JsonProperty(value = "bundles")
    private List<Long> bundles;
    @JsonIgnore
    @JsonProperty(value = "franchise")
    private long franchise;
    @JsonIgnore
    @JsonProperty(value = "hypes")
    private int hypes;
    @JsonIgnore
    @JsonProperty(value = "follows")
    private int follows;
    @JsonIgnore
    @JsonProperty(value = "time_to_beat")
    private long timeToBeat;
    @JsonIgnore
    @JsonProperty(value = "expansions")
    private List<Long> expansions;
    @JsonIgnore
    @JsonProperty(value = "standalone_expansions")
    private List<Long> expansionsStandalone;
    @JsonIgnore
    @JsonProperty(value = "dlcs")
    private List<Long> dlcs;
    @JsonIgnore
    @JsonProperty(value = "player_perspectives")
    private List<Long> perspectivesPlayer;
    @JsonIgnore
    @JsonProperty(value = "total_rating")
    private double ratingTotal;
    @JsonIgnore
    @JsonProperty(value = "total_rating_count")
    private int ratingTotalCount;
    @JsonIgnore
    @JsonProperty(value = "parent_game")
    private long parentVersion;
    @JsonIgnore
    @JsonProperty(value = "version_title")
    private String titleVersion;
    @JsonIgnore
    @JsonProperty(value = "created_at")
    private long createdAt;
    @JsonIgnore
    @JsonProperty(value = "updated_at")
    private long updatedAt;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public Game() {}

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCollection() {
        return collection;
    }

    public void setCollection(long collection) {
        this.collection = collection;
    }

    public long getCover() {
        return cover;
    }

    public void setCover(long cover) {
        this.cover = cover;
    }

    public String getStoryline() {
        return storyline;
    }

    public void setStoryline(String storyline) {
        this.storyline = storyline;
    }

    public List<Long> getExternalGames() {
        return externalGames;
    }

    public void setExternalGames(List<Long> externalGames) {
        this.externalGames = externalGames;
    }

    public Long getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(Long firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public List<Long> getGameModes() {
        return gameModes;
    }

    public void setGameModes(List<Long> gameModes) {
        this.gameModes = gameModes;
    }

    public List<Long> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Long> keywords) {
        this.keywords = keywords;
    }

    public List<Long> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Long> platforms) {
        this.platforms = platforms;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public int getPulseCount() {
        return pulseCount;
    }

    public void setPulseCount(int pulseCount) {
        this.pulseCount = pulseCount;
    }

    public List<Long> getReleaseDates() {
        return releaseDates;
    }

    public void setReleaseDates(List<Long> releaseDates) {
        this.releaseDates = releaseDates;
    }

    public List<Long> getGamesSimilar() {
        return gamesSimilar;
    }

    public void setGamesSimilar(List<Long> gamesSimilar) {
        this.gamesSimilar = gamesSimilar;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Long> getTags() {
        return tags;
    }

    public void setTags(List<Long> tags) {
        this.tags = tags;
    }

    public List<Long> getThemes() {
        return themes;
    }

    public void setThemes(List<Long> themes) {
        this.themes = themes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Long> getVideos() {
        return videos;
    }

    public void setVideos(List<Long> videos) {
        this.videos = videos;
    }

    public List<Long> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Long> websites) {
        this.websites = websites;
    }

    public long getGameParent() {
        return gameParent;
    }

    public void setGameParent(long gameParent) {
        this.gameParent = gameParent;
    }

    public List<Long> getRatingsAge() {
        return ratingsAge;
    }

    public void setRatingsAge(List<Long> ratingsAge) {
        this.ratingsAge = ratingsAge;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public List<Long> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<Long> screenshots) {
        this.screenshots = screenshots;
    }

    public List<Long> getModesMultiplayer() {
        return modesMultiplayer;
    }

    public void setModesMultiplayer(List<Long> modesMultiplayer) {
        this.modesMultiplayer = modesMultiplayer;
    }

    public List<Long> getCompaniesInvolved() {
        return companiesInvolved;
    }

    public void setCompaniesInvolved(List<Long> companiesInvolved) {
        this.companiesInvolved = companiesInvolved;
    }

    public List<Long> getGenres() {
        return genres;
    }

    public void setGenres(List<Long> genres) {
        this.genres = genres;
    }

    public List<Long> getGameEngines() {
        return gameEngines;
    }

    public void setGameEngines(List<Long> gameEngines) {
        this.gameEngines = gameEngines;
    }

    public List<Long> getFranchises() {
        return franchises;
    }

    public void setFranchises(List<Long> franchises) {
        this.franchises = franchises;
    }

    public List<Long> getArtworks() {
        return artworks;
    }

    public void setArtworks(List<Long> artworks) {
        this.artworks = artworks;
    }

    public List<Long> getBundles() {
        return bundles;
    }

    public void setBundles(List<Long> bundles) {
        this.bundles = bundles;
    }

    public long getFranchise() {
        return franchise;
    }

    public void setFranchise(long franchise) {
        this.franchise = franchise;
    }

    public int getHypes() {
        return hypes;
    }

    public void setHypes(int hypes) {
        this.hypes = hypes;
    }

    public int getFollows() {
        return follows;
    }

    public void setFollows(int follows) {
        this.follows = follows;
    }

    public long getTimeToBeat() {
        return timeToBeat;
    }

    public void setTimeToBeat(long timeToBeat) {
        this.timeToBeat = timeToBeat;
    }

    public List<Long> getExpansions() {
        return expansions;
    }

    public void setExpansions(List<Long> expansions) {
        this.expansions = expansions;
    }

    public List<Long> getExpansionsStandalone() {
        return expansionsStandalone;
    }

    public void setExpansionsStandalone(List<Long> expansionsStandalone) {
        this.expansionsStandalone = expansionsStandalone;
    }

    public List<Long> getDlcs() {
        return dlcs;
    }

    public void setDlcs(List<Long> dlcs) {
        this.dlcs = dlcs;
    }

    public List<Long> getPerspectivesPlayer() {
        return perspectivesPlayer;
    }

    public void setPerspectivesPlayer(List<Long> perspectivesPlayer) {
        this.perspectivesPlayer = perspectivesPlayer;
    }

    public double getRatingTotal() {
        return ratingTotal;
    }

    public void setRatingTotal(double ratingTotal) {
        this.ratingTotal = ratingTotal;
    }

    public int getRatingTotalCount() {
        return ratingTotalCount;
    }

    public void setRatingTotalCount(int ratingTotalCount) {
        this.ratingTotalCount = ratingTotalCount;
    }

    public long getParentVersion() {
        return parentVersion;
    }

    public void setParentVersion(long parentVersion) {
        this.parentVersion = parentVersion;
    }

    public String getTitleVersion() {
        return titleVersion;
    }

    public void setTitleVersion(String titleVersion) {
        this.titleVersion = titleVersion;
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
        Game game = (Game) o;
        return id == game.id &&
                category == game.category &&
                status == game.status &&
                collection == game.collection &&
                cover == game.cover &&
                Double.compare(game.popularity, popularity) == 0 &&
                pulseCount == game.pulseCount &&
                gameParent == game.gameParent &&
                Double.compare(game.rating, rating) == 0 &&
                ratingCount == game.ratingCount &&
                franchise == game.franchise &&
                hypes == game.hypes &&
                follows == game.follows &&
                timeToBeat == game.timeToBeat &&
                Double.compare(game.ratingTotal, ratingTotal) == 0 &&
                ratingTotalCount == game.ratingTotalCount &&
                parentVersion == game.parentVersion &&
                createdAt == game.createdAt &&
                updatedAt == game.updatedAt &&
                Objects.equals(name, game.name) &&
                Objects.equals(storyline, game.storyline) &&
                Objects.equals(externalGames, game.externalGames) &&
                Objects.equals(firstReleaseDate, game.firstReleaseDate) &&
                Objects.equals(gameModes, game.gameModes) &&
                Objects.equals(keywords, game.keywords) &&
                Objects.equals(platforms, game.platforms) &&
                Objects.equals(releaseDates, game.releaseDates) &&
                Objects.equals(gamesSimilar, game.gamesSimilar) &&
                Objects.equals(slug, game.slug) &&
                Objects.equals(summary, game.summary) &&
                Objects.equals(tags, game.tags) &&
                Objects.equals(themes, game.themes) &&
                Objects.equals(url, game.url) &&
                Objects.equals(videos, game.videos) &&
                Objects.equals(websites, game.websites) &&
                Objects.equals(ratingsAge, game.ratingsAge) &&
                Objects.equals(screenshots, game.screenshots) &&
                Objects.equals(modesMultiplayer, game.modesMultiplayer) &&
                Objects.equals(companiesInvolved, game.companiesInvolved) &&
                Objects.equals(genres, game.genres) &&
                Objects.equals(gameEngines, game.gameEngines) &&
                Objects.equals(franchises, game.franchises) &&
                Objects.equals(artworks, game.artworks) &&
                Objects.equals(bundles, game.bundles) &&
                Objects.equals(expansions, game.expansions) &&
                Objects.equals(expansionsStandalone, game.expansionsStandalone) &&
                Objects.equals(dlcs, game.dlcs) &&
                Objects.equals(perspectivesPlayer, game.perspectivesPlayer) &&
                Objects.equals(titleVersion, game.titleVersion) &&
                Objects.equals(checksum, game.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, status, name, collection, cover, storyline, externalGames, firstReleaseDate, gameModes, keywords, platforms, popularity, pulseCount, releaseDates, gamesSimilar, slug, summary, tags, themes, url, videos, websites, gameParent, ratingsAge, rating, ratingCount, screenshots, modesMultiplayer, companiesInvolved, genres, gameEngines, franchises, artworks, bundles, franchise, hypes, follows, timeToBeat, expansions, expansionsStandalone, dlcs, perspectivesPlayer, ratingTotal, ratingTotalCount, parentVersion, titleVersion, createdAt, updatedAt, checksum);
    }
}
