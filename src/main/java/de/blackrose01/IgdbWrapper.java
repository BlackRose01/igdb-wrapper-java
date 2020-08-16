package de.blackrose01;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.blackrose01.endpoint.Endpoint;
import de.blackrose01.endpoint.EndpointPrivate;
import de.blackrose01.endpoint.EndpointPublic;
import de.blackrose01.model.Character;
import de.blackrose01.model.achievement.*;
import de.blackrose01.model.agerating.*;
import de.blackrose01.model.company.*;
import de.blackrose01.model.game.*;
import de.blackrose01.model.page.*;
import de.blackrose01.model.platform.*;
import de.blackrose01.model.privates.*;
import de.blackrose01.model.pulse.*;
import de.blackrose01.model.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Wrapper for IGDB API
 */
public class IgdbWrapper {
    private String apiKey;
    private String urlBase;

    /**
     * Basic Constructor
     * uses the standard version of the API
     * @param apiKey
     * @param urlBase
     */
    public IgdbWrapper(String apiKey, String urlBase) {
        this(apiKey, urlBase, Version.Standard);
    }

    /**
     * Full Constructor
     * @param apiKey
     * @param urlBase
     * @param version
     */
    public IgdbWrapper(String apiKey, String urlBase, Version version) {
        this.apiKey = apiKey;
        this.urlBase = urlBase;

        if (!urlBase.endsWith("/"))
            this.urlBase += "/";

        if (version == Version.Pro)
            this.urlBase += "pro/";
    }

    /**
     * general method to send requests
     *
     * @param endpoint
     * @param parameters
     * @param httpMethod
     * @param c
     * @return api response
     */
    public <T> List<T> sendRequest(Endpoint endpoint, Parameters parameters, HttpMethod httpMethod, Class<?> c) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity;
        List<T> newData = new ArrayList<>();

        if (parameters == null)
            parameters = new Parameters();

        headers.add("user-key", this.apiKey);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON}));

        entity = new HttpEntity(parameters.buildQuery(), headers);

        Object[] data = restTemplate.exchange(this.urlBase + endpoint.getUri(), httpMethod, entity,
                Object[].class).getBody();

        Arrays
                .stream(data)
                .forEach(o -> newData.add((T)new ObjectMapper().convertValue(o, c)));

        return newData;
    }

    /**
     * general method to send requests
     *
     * @param endpoint
     * @param parameters
     * @param c
     * @param <T>
     * @return api response
     */
    public <T> List<T> sendRequest(Endpoint endpoint, Parameters parameters, Class<T> c) {
        return this.sendRequest(endpoint, parameters, HttpMethod.GET, c);
    }

    /**
     * general method to send requests
     *
     * @param endpoint
     * @param httpMethod
     * @param c
     * @param <T>
     * @return api response
     */
    public <T> List<T> sendRequest(Endpoint endpoint, HttpMethod httpMethod, Class<T> c) {
        return this.sendRequest(endpoint, new Parameters(), httpMethod, c);
    }

    /**
     * general method to send requests
     *
     * @param endpoint
     * @param c
     * @param <T>
     * @return api response
     */
    public <T> List<T> sendRequest(Endpoint endpoint, Class<T> c) {
        return this.sendRequest(endpoint, new Parameters(), HttpMethod.GET, c);
    }

    //-----------------------------------------------------------------------------------------

    /**
     * Requests Achievement information
     * @param parameters
     * @return
     */
    public List<Achievement> getAchievements(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Achievement, parameters, HttpMethod.POST, Achievement.class);
    }

    /**
     * Requests AchievementIcon information
     * @param parameters
     * @return
     */
    public List<AchievementIcon> getAchievementIcons(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Achievement_Icon, parameters, HttpMethod.POST, AchievementIcon.class);
    }

    /**
     * Requests AgeRating information
     * @param parameters
     * @return
     */
    public List<AgeRating> getAgeRatings(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Age_Rating, parameters, HttpMethod.POST, AgeRating.class);
    }

    /**
     * Requests AgeRatingContentDescription information
     * @param parameters
     * @return
     */
    public List<AgeRatingContentDescription> getAgeRatingContentDescriptions(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Age_Rating_Content_Description, parameters, HttpMethod.POST,
                AgeRatingContentDescription.class);
    }

    /**
     * Requests AlternativeName information
     * @param parameters
     * @return
     */
    public List<AlternativeName> getAlternativeNames(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Alternative_Name, parameters, HttpMethod.POST, AlternativeName.class);
    }

    /**
     * Requests ApiStatus information
     * @param parameters
     * @return
     */
    public List<ApiStatus> getApiStatuss(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Api_Status, parameters, HttpMethod.POST, ApiStatus.class);
    }

    /**
     * Requests Artwork information
     * @param parameters
     * @return
     */
    public List<Artwork> getArtworks(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Artwork, parameters, HttpMethod.POST, Artwork.class);
    }

    /**
     * Requests Character information
     * @param parameters
     * @return
     */
    public List<Character> getCharacters(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Character, parameters, HttpMethod.POST, Character.class);
    }

    /**
     * Requests CharacterMugShot information
     * @param parameters
     * @return
     */
    public List<CharacterMugShot> getCharacterMugShots(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Character_Mug_Shot, parameters, HttpMethod.POST, CharacterMugShot.class);
    }

    /**
     * Requests Collection information
     * @param parameters
     * @return
     */
    public List<Collection> getCollections(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Collection, parameters, HttpMethod.POST, Collection.class);
    }

    /**
     * Requests Company information
     * @param parameters
     * @return
     */
    public List<Company> getCompanys(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Company, parameters, HttpMethod.POST, Company.class);
    }

    /**
     * Requests CompanyLogo information
     * @param parameters
     * @return
     */
    public List<CompanyLogo> getCompanyLogos(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Company_Logo, parameters, HttpMethod.POST, CompanyLogo.class);
    }

    /**
     * Requests CompanyWebsite information
     * @param parameters
     * @return
     */
    public List<CompanyWebsite> getCompanyWebsites(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Company_Website, parameters, HttpMethod.POST, CompanyWebsite.class);
    }

    /**
     * Requests Cover information
     * @param parameters
     * @return
     */
    public List<Cover> getCovers(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Cover, parameters, HttpMethod.POST, Cover.class);
    }

    /**
     * Requests ExternalGame information
     * @param parameters
     * @return
     */
    public List<ExternalGame> getExternalGames(Parameters parameters) {
        return this.sendRequest(EndpointPublic.External_Games, parameters, HttpMethod.POST, ExternalGame.class);
    }

    /**
     * Requests Feed information
     * @param parameters
     * @return
     */
    public List<Feed> getFeeds(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Feed, parameters, HttpMethod.POST, Feed.class);
    }

    /**
     * Requests Franchise information
     * @param parameters
     * @return
     */
    public List<Franchise> getFranchises(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Franchise, parameters, HttpMethod.POST, Franchise.class);
    }

    /**
     * Requests Game information
     * @param parameters
     * @return
     */
    public List<Game> getGames(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Game, parameters, HttpMethod.POST, Game.class);
    }

    /**
     * Requests GameEngine information
     * @param parameters
     * @return
     */
    public List<GameEngine> getGameEngines(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Game_Engine, parameters, HttpMethod.POST, GameEngine.class);
    }

    /**
     * Requests GameEngineLogo information
     * @param parameters
     * @return
     */
    public List<GameEngineLogo> getGameEngineLogos(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Game_Engine_Logo, parameters, HttpMethod.POST, GameEngineLogo.class);
    }

    /**
     * Requests GameMode information
     * @param parameters
     * @return
     */
    public List<GameMode> getGameModes(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Game_Mode, parameters, HttpMethod.POST, GameMode.class);
    }

    /**
     * Requests GameVersion information
     * @param parameters
     * @return
     */
    public List<GameVersion> getGameVersions(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Game_Version, parameters, HttpMethod.POST, GameVersion.class);
    }

    /**
     * Requests GameVersionFeature information
     * @param parameters
     * @return
     */
    public List<GameVersionFeature> getGameVersionFeatures(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Game_Version_Feature, parameters, HttpMethod.POST,
                GameVersionFeature.class);
    }

    /**
     * Requests GameVersionFeatureValue information
     * @param parameters
     * @return
     */
    public List<GameVersionFeatureValue> getGameVersionFeatureValues(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Game_Version_Feature_Value, parameters, HttpMethod.POST,
                GameVersionFeatureValue.class);
    }

    /**
     * Requests GameVideo information
     * @param parameters
     * @return
     */
    public List<GameVideo> getGameVideos(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Game_Video, parameters, HttpMethod.POST, GameVideo.class);
    }

    /**
     * Requests Genre information
     * @param parameters
     * @return
     */
    public List<Genre> getGenres(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Genre, parameters, HttpMethod.POST, Genre.class);
    }

    /**
     * Requests InvolvedCompany information
     * @param parameters
     * @return
     */
    public List<InvolvedCompany> getInvolvedCompanys(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Involved_Company, parameters, HttpMethod.POST, InvolvedCompany.class);
    }

    /**
     * Requests Keyword information
     * @param parameters
     * @return
     */
    public List<Keyword> getKeywords(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Keyword, parameters, HttpMethod.POST, Keyword.class);
    }

    /**
     * Requests MultiplayerMode information
     * @param parameters
     * @return
     */
    public List<MultiplayerMode> getMultiplayerModes(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Multiplayer_Mode, parameters, HttpMethod.POST, MultiplayerMode.class);
    }

    /**
     * Requests Page information
     * @param parameters
     * @return
     */
    public List<Page> getPages(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Page, parameters, HttpMethod.POST, Page.class);
    }

    /**
     * Requests PageBackground information
     * @param parameters
     * @return
     */
    public List<PageBackground> getPageBackgrounds(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Page_Background, parameters, HttpMethod.POST, PageBackground.class);
    }

    /**
     * Requests PageLogo information
     * @param parameters
     * @return
     */
    public List<PageLogo> getPageLogos(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Page_Logo, parameters, HttpMethod.POST, PageLogo.class);
    }

    /**
     * Requests PageWebsite information
     * @param parameters
     * @return
     */
    public List<PageWebsite> getPageWebsites(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Page_Website, parameters, HttpMethod.POST, PageWebsite.class);
    }

    /**
     * Requests Platform information
     * @param parameters
     * @return
     */
    public List<Platform> getPlatforms(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Platform, parameters, HttpMethod.POST, Platform.class);
    }

    /**
     * Requests PlatformLogo information
     * @param parameters
     * @return
     */
    public List<PlatformLogo> getPlatformLogos(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Platform_Logo, parameters, HttpMethod.POST, PlatformLogo.class);
    }

    /**
     * Requests PlatformVersion information
     * @param parameters
     * @return
     */
    public List<PlatformVersion> getPlatformVersions(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Platform_Version, parameters, HttpMethod.POST, PlatformVersion.class);
    }

    /**
     * Requests PlatformVersionCompany information
     * @param parameters
     * @return
     */
    public List<PlatformVersionCompany> getPlatformVersionCompanys(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Platform_Version_Company, parameters, HttpMethod.POST,
                PlatformVersionCompany.class);
    }

    /**
     * Requests PlatformVersionReleaseDate information
     * @param parameters
     * @return
     */
    public List<PlatformVersionReleaseDate> getPlatformVersionReleaseDates(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Platform_Version_Release_Date, parameters, HttpMethod.POST,
                PlatformVersionReleaseDate.class);
    }

    /**
     * Requests PlatformWebsite information
     * @param parameters
     * @return
     */
    public List<PlatformWebsite> getPlatformWebsites(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Platform_Website, parameters, HttpMethod.POST, PlatformWebsite.class);
    }

    /**
     * Requests PlayerPerspective information
     * @param parameters
     * @return
     */
    public List<PlayerPerspective> getPlayerPerspectives(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Player_Perspective, parameters, HttpMethod.POST, PlayerPerspective.class);
    }

    /**
     * Requests FeedFollow information
     * @param parameters
     * @return
     */
    public List<FeedFollow> getFeedFollows(Parameters parameters) {
        return this.sendRequest(EndpointPrivate.Feed_Follow, parameters, HttpMethod.POST, FeedFollow.class);
    }

    /**
     * Requests Follow information
     * @param parameters
     * @return
     */
    public List<Follow> getFollows(Parameters parameters) {
        return this.sendRequest(EndpointPrivate.Follow, parameters, HttpMethod.POST, Follow.class);
    }

    /**
     * Requests List information
     * @param parameters
     * @return
     */
    public List<List> getLists(Parameters parameters) {
        return this.sendRequest(EndpointPrivate.List, parameters, HttpMethod.POST, List.class);
    }

    /**
     * Requests ListEntry information
     * @param parameters
     * @return
     */
    public List<ListEntry> getListEntrys(Parameters parameters) {
        return this.sendRequest(EndpointPrivate.List_Entry, parameters, HttpMethod.POST, ListEntry.class);
    }

    /**
     * Requests People information
     * @param parameters
     * @return
     */
    public List<People> getPeoples(Parameters parameters) {
        return this.sendRequest(EndpointPrivate.People, parameters, HttpMethod.POST, People.class);
    }

    /**
     * Requests Rate information
     * @param parameters
     * @return
     */
    public List<Rate> getRates(Parameters parameters) {
        return this.sendRequest(EndpointPrivate.Rate, parameters, HttpMethod.POST, Rate.class);
    }

    /**
     * Requests Review information
     * @param parameters
     * @return
     */
    public List<Review> getReviews(Parameters parameters) {
        return this.sendRequest(EndpointPrivate.Review, parameters, HttpMethod.POST, Review.class);
    }

    /**
     * Requests ReviewVideo information
     * @param parameters
     * @return
     */
    public List<ReviewVideo> getReviewVideos(Parameters parameters) {
        return this.sendRequest(EndpointPrivate.Review_Video, parameters, HttpMethod.POST, ReviewVideo.class);
    }

    /**
     * Requests ProductFamily information
     * @param parameters
     * @return
     */
    public List<ProductFamily> getProductFamilys(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Product_Family, parameters, HttpMethod.POST, ProductFamily.class);
    }

    /**
     * Requests Pulse information
     * @param parameters
     * @return
     */
    public List<Pulse> getPulses(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Pulse, parameters, HttpMethod.POST, Pulse.class);
    }

    /**
     * Requests PulseGroup information
     * @param parameters
     * @return
     */
    public List<PulseGroup> getPulseGroups(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Pulse_Group, parameters, HttpMethod.POST, PulseGroup.class);
    }

    /**
     * Requests PulseImage information
     * @param parameters
     * @return
     */
    public List<PulseImage> getPulseImages(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Pulse_Image, parameters, HttpMethod.POST, PulseImage.class);
    }

    /**
     * Requests PulseSource information
     * @param parameters
     * @return
     */
    public List<PulseSource> getPulseSources(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Pulse_Source, parameters, HttpMethod.POST, PulseSource.class);
    }

    /**
     * Requests PulseUrl information
     * @param parameters
     * @return
     */
    public List<PulseUrl> getPulseUrls(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Pulse_Url, parameters, HttpMethod.POST, PulseUrl.class);
    }

    /**
     * Requests ReleaseDate information
     * @param parameters
     * @return
     */
    public List<ReleaseDate> getReleaseDates(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Release_Date, parameters, HttpMethod.POST, ReleaseDate.class);
    }

    /**
     * Requests Screenshot information
     * @param parameters
     * @return
     */
    public List<Screenshot> getScreenshots(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Screenshot, parameters, HttpMethod.POST, Screenshot.class);
    }

    /**
     * Requests Search information
     * @param parameters
     * @return
     */
    public List<Search> getSearchs(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Search, parameters, HttpMethod.POST, Search.class);
    }

    /**
     * Requests Theme information
     * @param parameters
     * @return
     */
    public List<Theme> getThemes(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Theme, parameters, HttpMethod.POST, Theme.class);
    }

    /**
     * Requests TimeToBeat information
     * @param parameters
     * @return
     */
    public List<TimeToBeat> getTimeToBeats(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Time_to_Beat, parameters, HttpMethod.POST, TimeToBeat.class);
    }

    /**
     * Requests Title information
     * @param parameters
     * @return
     */
    public List<Title> getTitles(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Title, parameters, HttpMethod.POST, Title.class);
    }

    /**
     * Requests Website information
     * @param parameters
     * @return
     */
    public List<Website> getWebsites(Parameters parameters) {
        return this.sendRequest(EndpointPublic.Website, parameters, HttpMethod.POST, Website.class);
    }
}
