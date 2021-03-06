package de.blackrose01.endpoint;

import com.google.gson.Gson;

/**
 * private api endpoints
 */
public enum EndpointPrivate implements Endpoint {
    Feed_Follow("feed_follows"),
    Follow("follows"),
    List("lists"),
    List_Entry("list_entries"),
    People("people"),
    Rate("rates"),
    Review("reviews"),
    Review_Video("review_videos");

    private String uri;
    private final String preUrl = "private/";

    EndpointPrivate(String url) {
        this.uri = url;
    }

    /**
     * return URI of endpoint
     *
     * @return Endpoint URI
     */
    public String getUri() {
        return preUrl + uri;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
