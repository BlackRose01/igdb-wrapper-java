package de.blackrose01.model.agerating;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

public class AgeRatingContentDescription implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "category")
    private int category;
    @JsonIgnore
    @JsonProperty(value = "description")
    private String description;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public AgeRatingContentDescription() {}

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        AgeRatingContentDescription that = (AgeRatingContentDescription) o;
        return id == that.id &&
                category == that.category &&
                Objects.equals(description, that.description) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, description, checksum);
    }
}
