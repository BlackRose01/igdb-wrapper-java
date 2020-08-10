package de.blackrose01.endpoint;

/**
 * interface for endpoints
 */
public interface Endpoint {
    /**
     * should return URI of endpoint
     *
     * @return endpoint URI
     */
    String getUri();

    /**
     * should return stringified object
     *
     * @return stringified endpoint object
     */
    String toString();
}
