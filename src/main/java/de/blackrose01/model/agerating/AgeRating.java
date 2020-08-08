package de.blackrose01.model.agerating;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AgeRating implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonProperty(value = "content_descriptions")
    private List<Object> descriptionsContent;
    @JsonIgnore
    @JsonProperty(value = "rating")
    private int rating;
    @JsonIgnore
    @JsonProperty(value = "rating_cover_url")
    private String ratingCoverUrl;
    @JsonIgnore
    @JsonProperty(value = "synopsis")
    private String synopsis;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public AgeRating() {}

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

    public List<Long> getDescriptionsContent() {
        return new ObjectMapper().convertValue(descriptionsContent, new TypeReference<List<Long>>(){});
    }

    public List<AgeRatingContentDescription> getDescriptionsContentObject() {
        return new ObjectMapper().convertValue(descriptionsContent, new TypeReference<List<AgeRatingContentDescription>>(){});
    }

    public void setDescriptionsContent(List<Object> descriptionsContent) {
        this.descriptionsContent = descriptionsContent;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRatingCoverUrl() {
        return ratingCoverUrl;
    }

    public void setRatingCoverUrl(String ratingCoverUrl) {
        this.ratingCoverUrl = ratingCoverUrl;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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
        AgeRating ageRating = (AgeRating) o;
        return id == ageRating.id &&
                category == ageRating.category &&
                rating == ageRating.rating &&
                Objects.equals(descriptionsContent, ageRating.descriptionsContent) &&
                Objects.equals(ratingCoverUrl, ageRating.ratingCoverUrl) &&
                Objects.equals(synopsis, ageRating.synopsis) &&
                Objects.equals(checksum, ageRating.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, descriptionsContent, rating, ratingCoverUrl, synopsis, checksum);
    }
}
