package de.blackrose01;

import de.blackrose01.interfaces.Endpoint;
import de.blackrose01.test.Version;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

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

    public <T> T sendRequest(Endpoint endpoint, Parameters parameters, HttpMethod httpMethod, Class<T> c) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity;

        headers.add("user-key", this.apiKey);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));

        entity = new HttpEntity(parameters.buildQuery(), headers);

        return restTemplate.exchange(this.urlBase + endpoint.getUrl(), httpMethod, entity, c).getBody();
    }

    public <T> T sendRequest(Endpoint endpoint, Parameters parameters, Class<T> c) {
        return this.sendRequest(endpoint, parameters, HttpMethod.GET, c);
    }

    public <T> T sendRequest(Endpoint endpoint, HttpMethod httpMethod, Class<T> c) {
        return this.sendRequest(endpoint, new Parameters(), httpMethod, c);
    }

    public <T> T sendRequest(Endpoint endpoint, Class<T> c) {
        return this.sendRequest(endpoint, new Parameters(), HttpMethod.GET, c);
    }
}
