package de.blackrose01;

import de.blackrose01.endpoint.Endpoint;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Wrapper for IGDB API
 */
public class IgdbWrapper {
    private String apiKey;
    private String urlBase;

    public IgdbWrapper(String apiKey, String urlBase) {
        this(apiKey, urlBase, Version.Standard);
    }

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
    public <T> T sendRequest(Endpoint endpoint, Parameters parameters, HttpMethod httpMethod, Class<T> c) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity;

        headers.add("user-key", this.apiKey);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON}));

        entity = new HttpEntity(parameters.buildQuery(), headers);

        return c.cast(restTemplate.exchange(this.urlBase + endpoint.getUri(), httpMethod, entity, c).getBody());
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
    public <T> T sendRequest(Endpoint endpoint, Parameters parameters, Class<T> c) {
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
    public <T> T sendRequest(Endpoint endpoint, HttpMethod httpMethod, Class<T> c) {
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
    public <T> T sendRequest(Endpoint endpoint, Class<T> c) {
        return this.sendRequest(endpoint, new Parameters(), HttpMethod.GET, c);
    }
}
