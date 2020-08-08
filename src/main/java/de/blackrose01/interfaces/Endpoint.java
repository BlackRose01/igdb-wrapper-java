package de.blackrose01.interfaces;

/**
 * interface for endpoints
 */
public interface Endpoint {
    /**
     * should return URI of endpoint
     * @return
     */
    String getUri();

    /**
     * should return stringified object
     * @return
     */
    String toString();
}
