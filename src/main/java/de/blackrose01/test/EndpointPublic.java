package de.blackrose01.test;

import com.google.gson.Gson;
import de.blackrose01.interfaces.Endpoint;

public enum EndpointPublic implements Endpoint {
    Achievement("achievements"),
    Achievement_Icon("achievement_icons"),
    Age_Rating("age_ratings"),
    Age_Rating_Content_Description("age_rating_content_descriptions"),
    Alternative_Name("alternative_names"),
    Artwork("artworks"),
    Character("characters"),
    Character_Mug_Shot("character_mug_shots"),
    Collection("collections"),
    Company("companies"),
    Company_Logo("company_logos"),
    Company_Website("company_websites"),
    Cover("covers"),
    External_Games("external_games"),
    Feed("feeds"),
    Franchise("franchises"),
    Game("games"),
    Game_Engine_Logo("game_engine_logos"),
    Game_Engine("game_engines"),
    Game_Mode("game_modes"),
    Game_Version("game_versions"),
    Game_Version_Feature("game_version_features"),
    Game_Version_Feature_Value("game_version_feature_values"),
    Game_Video("game_videos"),
    Genre("genres"),
    Keyword("keywords"),
    Involved_Company("involved_companies"),
    Multiplayer_Mode("multiplayer_modes"),
    Page("pages"),
    Page_Background("page_backgrounds"),
    Page_Logo("page_logos"),
    Page_Website("page_websites"),
    Platform("platforms"),
    Platform_Logo("platform_logos"),
    Platform_Version("platform_versions"),
    Platform_Version_Company("platform_version_companies"),
    Platform_Version_Release_Date("platform_version_release_dates"),
    Platform_Website("platform_websites"),
    Player_Perspective("player_perspectives"),
    Product_Family("product_families"),
    Pulse("pulses"),
    Pulse_Group("pulse_groups"),
    Pulse_Image("pulse_images"),
    Pulse_Source("pulse_sources"),
    Pulse_Url("pulse_urls"),
    Release_Date("release_dates"),
    Screenshot("screenshots"),
    Search("search"),
    Theme("themes"),
    Time_to_Beat("time_to_beats"),
    Title("titles"),
    Website("websites");

    private String url;

    EndpointPublic(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
