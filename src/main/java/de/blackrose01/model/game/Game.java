package de.blackrose01.model.game;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.*;
import de.blackrose01.model.agerating.AgeRating;
import de.blackrose01.model.platform.Platform;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Video Games
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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
    @JsonProperty(value = "collection")
    private Object collection;
    @JsonProperty(value = "cover")
    private Object cover;
    @JsonIgnore
    @JsonProperty(value = "storyline")
    private String storyline;
    @JsonProperty(value = "external_games")
    private List<Object> externalGames;
    @JsonProperty(value = "first_release_date")
    private Object firstReleaseDate;
    @JsonProperty(value = "game_modes")
    private List<Object> gameModes;
    @JsonProperty(value = "keywords")
    private List<Object> keywords;
    @JsonProperty(value = "platforms")
    private List<Object> platforms;
    @JsonIgnore
    @JsonProperty(value = "popularity")
    private double popularity;
    @JsonIgnore
    @JsonProperty(value = "pulse_count")
    private int pulseCount;
    @JsonProperty(value = "release_dates")
    private List<Object> releaseDates;
    @JsonProperty(value = "similar_games")
    private List<Object> gamesSimilar;
    @JsonIgnore
    @JsonProperty(value = "slug")
    private String slug;
    @JsonIgnore
    @JsonProperty(value = "summary")
    private String summary;
    @JsonIgnore
    @JsonProperty(value = "tags")
    private List<Long> tags;
    @JsonProperty(value = "themes")
    private List<Object> themes;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonProperty(value = "videos")
    private List<Object> videos;
    @JsonProperty(value = "websites")
    private List<Object> websites;
    @JsonProperty(value = "parent_game")
    private Object gameParent;
    @JsonProperty(value = "age_ratings")
    private List<Object> ratingsAge;
    @JsonIgnore
    @JsonProperty(value = "rating")
    private double rating;
    @JsonIgnore
    @JsonProperty(value = "rating_count")
    private int ratingCount;
    @JsonProperty(value = "screenshots")
    private List<Object> screenshots;
    @JsonProperty(value = "multiplayer_modes")
    private List<Object> modesMultiplayer;
    @JsonProperty(value = "involved_companies")
    private List<Object> companiesInvolved;
    @JsonProperty(value = "genres")
    private List<Object> genres;
    @JsonProperty(value = "game_engines")
    private List<Object> gameEngines;
    @JsonProperty(value = "franchises")
    private List<Object> franchises;
    @JsonProperty(value = "artworks")
    private List<Object> artworks;
    @JsonProperty(value = "bundles")
    private List<Object> bundles;
    @JsonProperty(value = "franchise")
    private Object franchise;
    @JsonIgnore
    @JsonProperty(value = "hypes")
    private int hypes;
    @JsonIgnore
    @JsonProperty(value = "follows")
    private int follows;
    @JsonProperty(value = "time_to_beat")
    private Object timeToBeat;
    @JsonProperty(value = "expansions")
    private List<Object> expansions;
    @JsonProperty(value = "standalone_expansions")
    private List<Object> expansionsStandalone;
    @JsonProperty(value = "dlcs")
    private List<Object> dlcs;
    @JsonProperty(value = "player_perspectives")
    private List<Object> perspectivesPlayer;
    @JsonIgnore
    @JsonProperty(value = "total_rating")
    private double ratingTotal;
    @JsonIgnore
    @JsonProperty(value = "total_rating_count")
    private int ratingTotalCount;
    @JsonProperty(value = "version_parent")
    private Object parentVersion;
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

    public Game() {
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

    @JsonIgnore
    public Long getCollection() {
        return Long.parseLong(String.valueOf(collection));
    }

    @JsonIgnore
    public Collection getCollectionObject() {
        return new ObjectMapper().convertValue(collection, Collection.class);
    }

    public void setCollection(Object collection) {
        this.collection = collection;
    }

    @JsonIgnore
    public Long getCover() {
        return Long.parseLong(String.valueOf(cover));
    }

    @JsonIgnore
    public Cover getCoverObject() {
        return new ObjectMapper().convertValue(cover, Cover.class);
    }

    public void setCover(Object cover) {
        this.cover = cover;
    }

    public String getStoryline() {
        return storyline;
    }

    public void setStoryline(String storyline) {
        this.storyline = storyline;
    }

    @JsonIgnore
    public List<Long> getExternalGames() {
        return new ObjectMapper().convertValue(externalGames, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<ExternalGame> getExternalGamesObject() {
        return new ObjectMapper().convertValue(externalGames, new TypeReference<List<ExternalGame>>() {
        });
    }

    public void setExternalGames(List<Object> externalGames) {
        this.externalGames = externalGames;
    }

    public Object getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(Object firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    @JsonIgnore
    public List<Long> getGameModes() {
        return new ObjectMapper().convertValue(gameModes, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<GameMode> getGameModesObject() {
        return new ObjectMapper().convertValue(gameModes, new TypeReference<List<GameMode>>() {
        });
    }

    public void setGameModes(List<Object> gameModes) {
        this.gameModes = gameModes;
    }

    @JsonIgnore
    public List<Long> getKeywords() {
        return new ObjectMapper().convertValue(keywords, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Keyword> getKeywordsObject() {
        return new ObjectMapper().convertValue(keywords, new TypeReference<List<Keyword>>() {
        });
    }

    public void setKeywords(List<Object> keywords) {
        this.keywords = keywords;
    }

    @JsonIgnore
    public List<Long> getPlatforms() {
        return new ObjectMapper().convertValue(platforms, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Platform> getPlatformsObject() {
        return new ObjectMapper().convertValue(platforms, new TypeReference<List<Platform>>() {
        });
    }

    public void setPlatforms(List<Object> platforms) {
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

    @JsonIgnore
    public List<Long> getReleaseDates() {
        return new ObjectMapper().convertValue(releaseDates, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<ReleaseDate> getReleaseDatesObject() {
        return new ObjectMapper().convertValue(releaseDates, new TypeReference<List<ReleaseDate>>() {
        });
    }

    public void setReleaseDates(List<Object> releaseDates) {
        this.releaseDates = releaseDates;
    }

    @JsonIgnore
    public List<Long> getGamesSimilar() {
        return new ObjectMapper().convertValue(gamesSimilar, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Game> getGamesSimilarObject() {
        return new ObjectMapper().convertValue(gamesSimilar, new TypeReference<List<Game>>() {
        });
    }

    public void setGamesSimilar(List<Object> gamesSimilar) {
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

    @JsonIgnore
    public List<Long> getThemes() {
        return new ObjectMapper().convertValue(themes, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Theme> getThemesObject() {
        return new ObjectMapper().convertValue(themes, new TypeReference<List<Theme>>() {
        });
    }

    public void setThemes(List<Object> themes) {
        this.themes = themes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonIgnore
    public List<Long> getVideos() {
        return new ObjectMapper().convertValue(videos, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<GameVideo> getVideosObject() {
        return new ObjectMapper().convertValue(videos, new TypeReference<List<GameVideo>>() {
        });
    }

    public void setVideos(List<Object> videos) {
        this.videos = videos;
    }

    @JsonIgnore
    public List<Long> getWebsites() {
        return new ObjectMapper().convertValue(websites, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Website> getWebsitesObject() {
        return new ObjectMapper().convertValue(websites, new TypeReference<List<Website>>() {
        });
    }

    public void setWebsites(List<Object> websites) {
        this.websites = websites;
    }

    @JsonIgnore
    public long getGameParent() {
        return Long.parseLong(String.valueOf(gameParent));
    }

    @JsonIgnore
    public Game getGameParentObject() {
        return new ObjectMapper().convertValue(gameParent, Game.class);
    }

    public void setGameParent(long gameParent) {
        this.gameParent = gameParent;
    }

    @JsonIgnore
    public List<Long> getRatingsAge() {
        return new ObjectMapper().convertValue(ratingsAge, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<AgeRating> getRatingsAgeObject() {
        return new ObjectMapper().convertValue(ratingsAge, new TypeReference<List<AgeRating>>() {
        });
    }

    public void setRatingsAge(List<Object> ratingsAge) {
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

    @JsonIgnore
    public List<Long> getScreenshots() {
        return new ObjectMapper().convertValue(screenshots, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Screenshot> getScreenshotsObject() {
        return new ObjectMapper().convertValue(screenshots, new TypeReference<List<Screenshot>>() {
        });
    }

    public void setScreenshots(List<Object> screenshots) {
        this.screenshots = screenshots;
    }

    @JsonIgnore
    public List<Long> getModesMultiplayer() {
        return new ObjectMapper().convertValue(modesMultiplayer, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<MultiplayerMode> getModesMultiplayerObject() {
        return new ObjectMapper().convertValue(modesMultiplayer, new TypeReference<List<MultiplayerMode>>() {
        });
    }

    public void setModesMultiplayer(List<Object> modesMultiplayer) {
        this.modesMultiplayer = modesMultiplayer;
    }

    @JsonIgnore
    public List<Long> getCompaniesInvolved() {
        return new ObjectMapper().convertValue(companiesInvolved, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<InvolvedCompany> getCompaniesInvolvedObject() {
        return new ObjectMapper().convertValue(companiesInvolved, new TypeReference<List<InvolvedCompany>>() {
        });
    }

    public void setCompaniesInvolved(List<Object> companiesInvolved) {
        this.companiesInvolved = companiesInvolved;
    }

    @JsonIgnore
    public List<Long> getGenres() {
        return new ObjectMapper().convertValue(genres, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Genre> getGenresObject() {
        return new ObjectMapper().convertValue(genres, new TypeReference<List<Genre>>() {
        });
    }

    public void setGenres(List<Object> genres) {
        this.genres = genres;
    }

    @JsonIgnore
    public List<Long> getGameEngines() {
        return new ObjectMapper().convertValue(gameEngines, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<GameEngine> getGameEnginesObject() {
        return new ObjectMapper().convertValue(gameEngines, new TypeReference<List<GameEngine>>() {
        });
    }

    public void setGameEngines(List<Object> gameEngines) {
        this.gameEngines = gameEngines;
    }

    @JsonIgnore
    public List<Long> getFranchises() {
        return new ObjectMapper().convertValue(franchises, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Franchise> getFranchisesObject() {
        return new ObjectMapper().convertValue(franchises, new TypeReference<List<Franchise>>() {
        });
    }

    public void setFranchises(List<Object> franchises) {
        this.franchises = franchises;
    }

    @JsonIgnore
    public List<Long> getArtworks() {
        return new ObjectMapper().convertValue(artworks, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Artwork> getArtworksObject() {
        return new ObjectMapper().convertValue(artworks, new TypeReference<List<Artwork>>() {
        });
    }

    public void setArtworks(List<Object> artworks) {
        this.artworks = artworks;
    }

    @JsonIgnore
    public List<Long> getBundles() {
        return new ObjectMapper().convertValue(bundles, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Game> getBundlesObject() {
        return new ObjectMapper().convertValue(bundles, new TypeReference<List<Game>>() {
        });
    }

    public void setBundles(List<Object> bundles) {
        this.bundles = bundles;
    }

    @JsonIgnore
    public long getFranchise() {
        return Long.parseLong(String.valueOf(franchise));
    }

    @JsonIgnore
    public Franchise getFranchiseObject() {
        return new ObjectMapper().convertValue(franchise, Franchise.class);
    }

    public void setFranchise(Object franchise) {
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

    @JsonIgnore
    public long getTimeToBeat() {
        return Long.parseLong(String.valueOf(timeToBeat));
    }

    @JsonIgnore
    public TimeToBeat getTimeToBeatObject() {
        return new ObjectMapper().convertValue(franchise, TimeToBeat.class);
    }

    public void setTimeToBeat(Object timeToBeat) {
        this.timeToBeat = timeToBeat;
    }

    @JsonIgnore
    public List<Long> getExpansions() {
        return new ObjectMapper().convertValue(expansions, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Game> getExpansionsObject() {
        return new ObjectMapper().convertValue(expansions, new TypeReference<List<Game>>() {
        });
    }

    public void setExpansions(List<Object> expansions) {
        this.expansions = expansions;
    }

    @JsonIgnore
    public List<Long> getExpansionsStandalone() {
        return new ObjectMapper().convertValue(expansionsStandalone, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Game> getExpansionsStandaloneObject() {
        return new ObjectMapper().convertValue(expansionsStandalone, new TypeReference<List<Game>>() {
        });
    }

    public void setExpansionsStandalone(List<Object> expansionsStandalone) {
        this.expansionsStandalone = expansionsStandalone;
    }

    @JsonIgnore
    public List<Long> getDlcs() {
        return new ObjectMapper().convertValue(dlcs, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<Game> getDlcsObject() {
        return new ObjectMapper().convertValue(dlcs, new TypeReference<List<Game>>() {
        });
    }

    public void setDlcs(List<Object> dlcs) {
        this.dlcs = dlcs;
    }

    @JsonIgnore
    public List<Long> getPerspectivesPlayer() {
        return new ObjectMapper().convertValue(perspectivesPlayer, new TypeReference<List<Long>>() {
        });
    }

    @JsonIgnore
    public List<PlayerPerspective> getPerspectivesPlayerObject() {
        return new ObjectMapper().convertValue(perspectivesPlayer, new TypeReference<List<PlayerPerspective>>() {
        });
    }

    public void setPerspectivesPlayer(List<Object> perspectivesPlayer) {
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

    @JsonIgnore
    public long getParentVersion() {
        return Long.parseLong(String.valueOf(parentVersion));
    }

    @JsonIgnore
    public Game getParentVersionObject() {
        return new ObjectMapper().convertValue(parentVersion, Game.class);
    }

    public void setParentVersion(Object parentVersion) {
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
                Double.compare(game.popularity, popularity) == 0 &&
                pulseCount == game.pulseCount &&
                gameParent == game.gameParent &&
                Double.compare(game.rating, rating) == 0 &&
                ratingCount == game.ratingCount &&
                hypes == game.hypes &&
                follows == game.follows &&
                Double.compare(game.ratingTotal, ratingTotal) == 0 &&
                ratingTotalCount == game.ratingTotalCount &&
                createdAt == game.createdAt &&
                updatedAt == game.updatedAt &&
                Objects.equals(name, game.name) &&
                Objects.equals(collection, game.collection) &&
                Objects.equals(cover, game.cover) &&
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
                Objects.equals(franchise, game.franchise) &&
                Objects.equals(timeToBeat, game.timeToBeat) &&
                Objects.equals(expansions, game.expansions) &&
                Objects.equals(expansionsStandalone, game.expansionsStandalone) &&
                Objects.equals(dlcs, game.dlcs) &&
                Objects.equals(perspectivesPlayer, game.perspectivesPlayer) &&
                Objects.equals(parentVersion, game.parentVersion) &&
                Objects.equals(titleVersion, game.titleVersion) &&
                Objects.equals(checksum, game.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, status, name, collection, cover, storyline, externalGames, firstReleaseDate, gameModes, keywords, platforms, popularity, pulseCount, releaseDates, gamesSimilar, slug, summary, tags, themes, url, videos, websites, gameParent, ratingsAge, rating, ratingCount, screenshots, modesMultiplayer, companiesInvolved, genres, gameEngines, franchises, artworks, bundles, franchise, hypes, follows, timeToBeat, expansions, expansionsStandalone, dlcs, perspectivesPlayer, ratingTotal, ratingTotalCount, parentVersion, titleVersion, createdAt, updatedAt, checksum);
    }
}
