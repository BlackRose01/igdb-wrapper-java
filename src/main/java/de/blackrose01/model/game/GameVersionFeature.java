package de.blackrose01.model.game;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Features and descriptions of what makes each version/edition different from the main game
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameVersionFeature implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonIgnore
    @JsonProperty(value = "title")
    private String title;
    @JsonIgnore
    @JsonProperty(value = "description")
    private String description;
    @JsonIgnore
    @JsonProperty(value = "position")
    private int position;
    @JsonProperty(value = "values")
    private List<Object> values;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public GameVersionFeature() {
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<Long> getValues() {
        return new ObjectMapper().convertValue(values, new TypeReference<List<Long>>() {
        });
    }

    public List<GameVersionFeatureValue> getValuesObject() {
        return new ObjectMapper().convertValue(values, new TypeReference<List<GameVersionFeatureValue>>() {
        });
    }

    public void setValues(List<Object> values) {
        this.values = values;
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
        GameVersionFeature that = (GameVersionFeature) o;
        return id == that.id &&
                category == that.category &&
                position == that.position &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(values, that.values) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, title, description, position, values, checksum);
    }
}
