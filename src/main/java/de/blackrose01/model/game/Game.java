package de.blackrose01.model.game;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import de.blackrose01.model.*;
import de.blackrose01.model.agerating.AgeRating;
import de.blackrose01.model.platform.Platform;

import java.io.Serializable;
import java.lang.reflect.Type;
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
    @JsonProperty(value = "collection")
    private Collection collectionObject;
    @JsonIgnore()
    @JsonProperty(value = "cover")
    private long cover;
    @JsonIgnore
    @JsonProperty(value = "cover")
    private Cover coverObject;
    @JsonIgnore
    @JsonProperty(value = "storyline")
    private String storyline;
    @JsonIgnore
    @JsonProperty(value = "external_games")
    private List<Long> externalGames;
    @JsonIgnore
    @JsonProperty(value = "external_games")
    private List<ExternalGame> externalGamesObject;
    @JsonIgnore
    @JsonProperty(value = "first_release_date")
    private Long firstReleaseDate;
    @JsonIgnore
    @JsonProperty(value = "game_modes")
    private List<Long> gameModes;
    @JsonIgnore
    @JsonProperty(value = "game_modes")
    private List<GameMode> gameModesObject;
    @JsonIgnore
    @JsonProperty(value = "keywords")
    private List<Long> keywords;
    @JsonIgnore
    @JsonProperty(value = "keywords")
    private List<Keyword> keywordsObject;
    @JsonIgnore
    @JsonProperty(value = "platforms")
    private List<Long> platforms;
    @JsonIgnore
    @JsonProperty(value = "platforms")
    private List<Platform> platformsObject;
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
    @JsonProperty(value = "release_dates")
    private List<ReleaseDate> releaseDatesObject;
    @JsonIgnore
    @JsonProperty(value = "similar_games")
    private List<Long> gamesSimilar;
    @JsonIgnore
    @JsonProperty(value = "similar_games")
    private List<Game> gamesSimilarObject;
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
    @JsonProperty(value = "themes")
    private List<Theme> themesObject;
    @JsonIgnore
    @JsonProperty(value = "url")
    private String url;
    @JsonIgnore
    @JsonProperty(value = "videos")
    private List<Long> videos;
    @JsonIgnore
    @JsonProperty(value = "videos")
    private List<GameVideo> videosObject;
    @JsonIgnore
    @JsonProperty(value = "websites")
    private List<Long> websites;
    @JsonIgnore
    @JsonProperty(value = "websites")
    private List<Website> websitesObject;
    @JsonIgnore
    @JsonProperty(value = "parent_game")
    private long gameParent;
    @JsonIgnore
    @JsonProperty(value = "age_ratings")
    private List<Long> ratingsAge;
    @JsonIgnore
    @JsonProperty(value = "age_ratings")
    private List<AgeRating> ratingsAgeObject;
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
    @JsonProperty(value = "screenshots")
    private List<Screenshot> screenshotsObject;
    @JsonIgnore
    @JsonProperty(value = "multiplayer_modes")
    private List<Long> modesMultiplayer;
    @JsonIgnore
    @JsonProperty(value = "multiplayer_modes")
    private List<MultiplayerMode> modesMultiplayerObject;
    @JsonIgnore
    @JsonProperty(value = "involved_companies")
    private List<Long> companiesInvolved;
    @JsonIgnore
    @JsonProperty(value = "involved_companies")
    private List<InvolvedCompany> companiesInvolvedObject;
    @JsonIgnore
    @JsonProperty(value = "genres")
    private List<Long> genres;
    @JsonIgnore
    @JsonProperty(value = "genres")
    private List<Genre> genresObject;
    @JsonIgnore
    @JsonProperty(value = "game_engines")
    private List<Long> gameEngines;
    @JsonIgnore
    @JsonProperty(value = "game_engines")
    private List<GameEngine> gameEnginesObject;
    @JsonIgnore
    @JsonProperty(value = "franchises")
    private List<Long> franchises;
    @JsonIgnore
    @JsonProperty(value = "franchises")
    private List<Franchise> franchisesObject;
    @JsonIgnore
    @JsonProperty(value = "artworks")
    private List<Long> artworks;
    @JsonIgnore
    @JsonProperty(value = "artworks")
    private List<Artwork> artworksObject;
    @JsonIgnore
    @JsonProperty(value = "bundles")
    private List<Long> bundles;
    @JsonIgnore
    @JsonProperty(value = "bundles")
    private List<Game> bundlesObject;
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
    @JsonProperty(value = "expansions")
    private List<Game> expansionsObject;
    @JsonIgnore
    @JsonProperty(value = "standalone_expansions")
    private List<Long> expansionsStandalone;
    @JsonIgnore
    @JsonProperty(value = "standalone_expansions")
    private List<Game> expansionsStandaloneObject;
    @JsonIgnore
    @JsonProperty(value = "dlcs")
    private List<Long> dlcs;
    @JsonIgnore
    @JsonProperty(value = "dlcs")
    private List<Game> dlcsObject;
    @JsonIgnore
    @JsonProperty(value = "player_perspectives")
    private List<Long> perspectivesPlayer;
    @JsonIgnore
    @JsonProperty(value = "player_perspectives")
    private List<PlayerPerspective> perspectivesPlayerObject;
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

    public Collection getCollectionObject() {
        return collectionObject;
    }

    public void setCollectionObject(Collection collectionObject) {
        this.collectionObject = collectionObject;
    }

    public long getCover() {
        return cover;
    }

    public void setCover(long cover) {
        this.cover = cover;
    }

    public Cover getCoverObject() {
        return coverObject;
    }

    public void setCoverObject(Cover coverObject) {
        this.coverObject = coverObject;
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

    public List<ExternalGame> getExternalGamesObject() {
        return externalGamesObject;
    }

    public void setExternalGamesObject(List<ExternalGame> externalGamesObject) {
        this.externalGamesObject = externalGamesObject;
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

    public List<GameMode> getGameModesObject() {
        return gameModesObject;
    }

    public void setGameModesObject(List<GameMode> gameModesObject) {
        this.gameModesObject = gameModesObject;
    }

    public List<Long> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Long> keywords) {
        this.keywords = keywords;
    }

    public List<Keyword> getKeywordsObject() {
        return keywordsObject;
    }

    public void setKeywordsObject(List<Keyword> keywordsObject) {
        this.keywordsObject = keywordsObject;
    }

    public List<Long> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Long> platforms) {
        this.platforms = platforms;
    }

    public List<Platform> getPlatformsObject() {
        return platformsObject;
    }

    public void setPlatformsObject(List<Platform> platformsObject) {
        this.platformsObject = platformsObject;
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

    public List<ReleaseDate> getReleaseDatesObject() {
        return releaseDatesObject;
    }

    public void setReleaseDatesObject(List<ReleaseDate> releaseDatesObject) {
        this.releaseDatesObject = releaseDatesObject;
    }

    public List<Long> getGamesSimilar() {
        return gamesSimilar;
    }

    public void setGamesSimilar(List<Long> gamesSimilar) {
        this.gamesSimilar = gamesSimilar;
    }

    public List<Game> getGamesSimilarObject() {
        return gamesSimilarObject;
    }

    public void setGamesSimilarObject(List<Game> gamesSimilarObject) {
        this.gamesSimilarObject = gamesSimilarObject;
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

    public List<Theme> getThemesObject() {
        return themesObject;
    }

    public void setThemesObject(List<Theme> themesObject) {
        this.themesObject = themesObject;
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

    public List<GameVideo> getVideosObject() {
        return videosObject;
    }

    public void setVideosObject(List<GameVideo> videosObject) {
        this.videosObject = videosObject;
    }

    public List<Long> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Long> websites) {
        this.websites = websites;
    }

    public List<Website> getWebsitesObject() {
        return websitesObject;
    }

    public void setWebsitesObject(List<Website> websitesObject) {
        this.websitesObject = websitesObject;
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

    public List<AgeRating> getRatingsAgeObject() {
        return ratingsAgeObject;
    }

    public void setRatingsAgeObject(List<AgeRating> ratingsAgeObject) {
        this.ratingsAgeObject = ratingsAgeObject;
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

    public List<Screenshot> getScreenshotsObject() {
        return screenshotsObject;
    }

    public void setScreenshotsObject(List<Screenshot> screenshotsObject) {
        this.screenshotsObject = screenshotsObject;
    }

    public List<Long> getModesMultiplayer() {
        return modesMultiplayer;
    }

    public void setModesMultiplayer(List<Long> modesMultiplayer) {
        this.modesMultiplayer = modesMultiplayer;
    }

    public List<MultiplayerMode> getModesMultiplayerObject() {
        return modesMultiplayerObject;
    }

    public void setModesMultiplayerObject(List<MultiplayerMode> modesMultiplayerObject) {
        this.modesMultiplayerObject = modesMultiplayerObject;
    }

    public List<Long> getCompaniesInvolved() {
        return companiesInvolved;
    }

    public void setCompaniesInvolved(List<Long> companiesInvolved) {
        this.companiesInvolved = companiesInvolved;
    }

    public List<InvolvedCompany> getCompaniesInvolvedObject() {
        return companiesInvolvedObject;
    }

    public void setCompaniesInvolvedObject(List<InvolvedCompany> companiesInvolvedObject) {
        this.companiesInvolvedObject = companiesInvolvedObject;
    }

    public List<Long> getGenres() {
        return genres;
    }

    public void setGenres(List<Long> genres) {
        this.genres = genres;
    }

    public List<Genre> getGenresObject() {
        return genresObject;
    }

    public void setGenresObject(List<Genre> genresObject) {
        this.genresObject = genresObject;
    }

    public List<Long> getGameEngines() {
        return gameEngines;
    }

    public void setGameEngines(List<Long> gameEngines) {
        this.gameEngines = gameEngines;
    }

    public List<GameEngine> getGameEnginesObject() {
        return gameEnginesObject;
    }

    public void setGameEnginesObject(List<GameEngine> gameEnginesObject) {
        this.gameEnginesObject = gameEnginesObject;
    }

    public List<Long> getFranchises() {
        return franchises;
    }

    public void setFranchises(List<Long> franchises) {
        this.franchises = franchises;
    }

    public List<Franchise> getFranchisesObject() {
        return franchisesObject;
    }

    public void setFranchisesObject(List<Franchise> franchisesObject) {
        this.franchisesObject = franchisesObject;
    }

    public List<Long> getArtworks() {
        return artworks;
    }

    public void setArtworks(List<Long> artworks) {
        this.artworks = artworks;
    }

    public List<Artwork> getArtworksObject() {
        return artworksObject;
    }

    public void setArtworksObject(List<Artwork> artworksObject) {
        this.artworksObject = artworksObject;
    }

    public List<Long> getBundles() {
        return bundles;
    }

    public void setBundles(List<Long> bundles) {
        this.bundles = bundles;
    }

    public List<Game> getBundlesObject() {
        return bundlesObject;
    }

    public void setBundlesObject(List<Game> bundlesObject) {
        this.bundlesObject = bundlesObject;
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

    public List<Game> getExpansionsObject() {
        return expansionsObject;
    }

    public void setExpansionsObject(List<Game> expansionsObject) {
        this.expansionsObject = expansionsObject;
    }

    public List<Long> getExpansionsStandalone() {
        return expansionsStandalone;
    }

    public void setExpansionsStandalone(List<Long> expansionsStandalone) {
        this.expansionsStandalone = expansionsStandalone;
    }

    public List<Game> getExpansionsStandaloneObject() {
        return expansionsStandaloneObject;
    }

    public void setExpansionsStandaloneObject(List<Game> expansionsStandaloneObject) {
        this.expansionsStandaloneObject = expansionsStandaloneObject;
    }

    public List<Long> getDlcs() {
        return dlcs;
    }

    public void setDlcs(List<Long> dlcs) {
        this.dlcs = dlcs;
    }

    public List<Game> getDlcsObject() {
        return dlcsObject;
    }

    public void setDlcsObject(List<Game> dlcsObject) {
        this.dlcsObject = dlcsObject;
    }

    public List<Long> getPerspectivesPlayer() {
        return perspectivesPlayer;
    }

    public void setPerspectivesPlayer(List<Long> perspectivesPlayer) {
        this.perspectivesPlayer = perspectivesPlayer;
    }

    public List<PlayerPerspective> getPerspectivesPlayerObject() {
        return perspectivesPlayerObject;
    }

    public void setPerspectivesPlayerObject(List<PlayerPerspective> perspectivesPlayerObject) {
        this.perspectivesPlayerObject = perspectivesPlayerObject;
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

    @JsonSetter("cover")
    public void setCoverJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.cover = jsonNode.asLong();
        else
            this.coverObject = new Gson().fromJson(jsonNode.toString(), Cover.class);
    }

    @JsonSetter("collection")
    public void setCollectionJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.collection = jsonNode.asLong();
        else
            this.collectionObject = new Gson().fromJson(jsonNode.toString(), Collection.class);
    }

    @JsonSetter("external_games")
    public void setExternalGamesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<ExternalGame>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.externalGames = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.externalGamesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("game_modes")
    public void setGameModesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<GameMode>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.gameModes = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.gameModesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("keywords")
    public void setKeywordsJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Keyword>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.keywords = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.keywordsObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("platforms")
    public void setPlatformsJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Platform>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.platforms = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.platformsObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("release_dates")
    public void setReleaseDatesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<ReleaseDate>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.releaseDates = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.releaseDatesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("similar_games")
    public void setGamesSimilarJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Game>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.gamesSimilar = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.gamesSimilarObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("themes")
    public void setThemesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Theme>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.themes = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.themesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("videos")
    public void setVideosJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<GameVideo>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.videos = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.videosObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("websites")
    public void setWebsitesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Website>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.websites = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.websitesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("age_ratings")
    public void setAgeRatingsJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<AgeRating>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.ratingsAge = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.ratingsAgeObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("screenshots")
    public void setScreenshotsJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Screenshot>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.screenshots = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.screenshotsObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("multiplayer_modes")
    public void setMultiplayerModesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<MultiplayerMode>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.modesMultiplayer = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.modesMultiplayerObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("involved_companies")
    public void setInvolvedCompaniesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<InvolvedCompany>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.companiesInvolved = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.companiesInvolvedObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("genres")
    public void setGenresJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Genre>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.genres = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.genresObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("game_engines")
    public void setGameEnginesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<GameEngine>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.gameEngines = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.gameEnginesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("franchises")
    public void setFranchisesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Franchise>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.franchises = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.franchisesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("artworks")
    public void setArtworksJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Artwork>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.artworks = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.artworksObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("bundles")
    public void setBundlesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Game>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.bundles = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.bundlesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("expansions")
    public void setExpansionsJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Game>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.expansions = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.expansionsObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("standalone_expansions")
    public void setExpansionsStandaloneJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Game>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.expansionsStandalone = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.expansionsStandaloneObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("dlcs")
    public void setDlcsJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<Game>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.dlcs = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.dlcsObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
    }

    @JsonSetter("player_perspectives")
    public void setPerspectivesPlayerJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<PlayerPerspective>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.perspectivesPlayer = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.perspectivesPlayerObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
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
                Objects.equals(collectionObject, game.collectionObject) &&
                Objects.equals(coverObject, game.coverObject) &&
                Objects.equals(storyline, game.storyline) &&
                Objects.equals(externalGames, game.externalGames) &&
                Objects.equals(externalGamesObject, game.externalGamesObject) &&
                Objects.equals(firstReleaseDate, game.firstReleaseDate) &&
                Objects.equals(gameModes, game.gameModes) &&
                Objects.equals(gameModesObject, game.gameModesObject) &&
                Objects.equals(keywords, game.keywords) &&
                Objects.equals(keywordsObject, game.keywordsObject) &&
                Objects.equals(platforms, game.platforms) &&
                Objects.equals(platformsObject, game.platformsObject) &&
                Objects.equals(releaseDates, game.releaseDates) &&
                Objects.equals(releaseDatesObject, game.releaseDatesObject) &&
                Objects.equals(gamesSimilar, game.gamesSimilar) &&
                Objects.equals(gamesSimilarObject, game.gamesSimilarObject) &&
                Objects.equals(slug, game.slug) &&
                Objects.equals(summary, game.summary) &&
                Objects.equals(tags, game.tags) &&
                Objects.equals(themes, game.themes) &&
                Objects.equals(themesObject, game.themesObject) &&
                Objects.equals(url, game.url) &&
                Objects.equals(videos, game.videos) &&
                Objects.equals(videosObject, game.videosObject) &&
                Objects.equals(websites, game.websites) &&
                Objects.equals(websitesObject, game.websitesObject) &&
                Objects.equals(ratingsAge, game.ratingsAge) &&
                Objects.equals(ratingsAgeObject, game.ratingsAgeObject) &&
                Objects.equals(screenshots, game.screenshots) &&
                Objects.equals(screenshotsObject, game.screenshotsObject) &&
                Objects.equals(modesMultiplayer, game.modesMultiplayer) &&
                Objects.equals(modesMultiplayerObject, game.modesMultiplayerObject) &&
                Objects.equals(companiesInvolved, game.companiesInvolved) &&
                Objects.equals(companiesInvolvedObject, game.companiesInvolvedObject) &&
                Objects.equals(genres, game.genres) &&
                Objects.equals(genresObject, game.genresObject) &&
                Objects.equals(gameEngines, game.gameEngines) &&
                Objects.equals(gameEnginesObject, game.gameEnginesObject) &&
                Objects.equals(franchises, game.franchises) &&
                Objects.equals(franchisesObject, game.franchisesObject) &&
                Objects.equals(artworks, game.artworks) &&
                Objects.equals(artworksObject, game.artworksObject) &&
                Objects.equals(bundles, game.bundles) &&
                Objects.equals(bundlesObject, game.bundlesObject) &&
                Objects.equals(expansions, game.expansions) &&
                Objects.equals(expansionsObject, game.expansionsObject) &&
                Objects.equals(expansionsStandalone, game.expansionsStandalone) &&
                Objects.equals(expansionsStandaloneObject, game.expansionsStandaloneObject) &&
                Objects.equals(dlcs, game.dlcs) &&
                Objects.equals(dlcsObject, game.dlcsObject) &&
                Objects.equals(perspectivesPlayer, game.perspectivesPlayer) &&
                Objects.equals(perspectivesPlayerObject, game.perspectivesPlayerObject) &&
                Objects.equals(titleVersion, game.titleVersion) &&
                Objects.equals(checksum, game.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, status, name, collection, collectionObject, cover, coverObject, storyline, externalGames, externalGamesObject, firstReleaseDate, gameModes, gameModesObject, keywords, keywordsObject, platforms, platformsObject, popularity, pulseCount, releaseDates, releaseDatesObject, gamesSimilar, gamesSimilarObject, slug, summary, tags, themes, themesObject, url, videos, videosObject, websites, websitesObject, gameParent, ratingsAge, ratingsAgeObject, rating, ratingCount, screenshots, screenshotsObject, modesMultiplayer, modesMultiplayerObject, companiesInvolved, companiesInvolvedObject, genres, genresObject, gameEngines, gameEnginesObject, franchises, franchisesObject, artworks, artworksObject, bundles, bundlesObject, franchise, hypes, follows, timeToBeat, expansions, expansionsObject, expansionsStandalone, expansionsStandaloneObject, dlcs, dlcsObject, perspectivesPlayer, perspectivesPlayerObject, ratingTotal, ratingTotalCount, parentVersion, titleVersion, createdAt, updatedAt, checksum);
    }
}
