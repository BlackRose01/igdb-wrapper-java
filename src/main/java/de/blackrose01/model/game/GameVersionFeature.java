package de.blackrose01.model.game;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

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
    @JsonIgnore
    @JsonProperty(value = "values")
    private List<Long> values;
    @JsonIgnore
    @JsonProperty(value = "values")
    private List<GameVersionFeatureValue> valuesObject;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public GameVersionFeature() {}

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
        return values;
    }

    public void setValues(List<Long> values) {
        this.values = values;
    }

    public List<GameVersionFeatureValue> getValuesObject() {
        return valuesObject;
    }

    public void setValuesObject(List<GameVersionFeatureValue> valuesObject) {
        this.valuesObject = valuesObject;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @JsonSetter("values")
    public void setValuesJson(JsonNode jsonNode) {
        Type typeListObject = new TypeToken<List<GameVersionFeatureValue>>(){}.getType();
        Type typeListLong = new TypeToken<List<Long>>(){}.getType();

        if (jsonNode.size() == 0)
            return;
        else if (jsonNode.isArray() && jsonNode.get(0).isLong())
            this.values = new Gson().fromJson(jsonNode.toString(), typeListLong);
        else
            this.valuesObject = new Gson().fromJson(jsonNode.toString(), typeListObject);
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
                Objects.equals(valuesObject, that.valuesObject) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, title, description, position, values, valuesObject, checksum);
    }
}
