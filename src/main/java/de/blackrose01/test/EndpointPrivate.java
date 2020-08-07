package de.blackrose01.test;

import com.google.gson.Gson;
import de.blackrose01.interfaces.Endpoint;

public enum EndpointPrivate implements Endpoint {
    Feed_Follow("feed_follows"),
    Follow("follows"),
    List("lists"),
    List_Entry("list_entries"),
    Rate("rates"),
    Review("reviews"),
    Review_Video("review_videos");

    private String url;
    private final String preUrl = "private/";

    EndpointPrivate(String url) {
        this.url = url;
    }

    public String getUrl() {
        return preUrl + url;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
