package de.blackrose01.model.platform;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import de.blackrose01.model.company.Company;

import java.io.Serializable;
import java.util.Objects;

public class PlatformVersionCompany implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonIgnore
    @JsonProperty(value = "company")
    private long company;
    @JsonIgnore
    @JsonProperty(value = "company")
    private Company companyObject;
    @JsonIgnore
    @JsonProperty(value = "developer")
    private boolean isDeveloper;
    @JsonIgnore
    @JsonProperty(value = "manufacturer")
    private boolean isManufacturer;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public PlatformVersionCompany() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCompany() {
        return company;
    }

    public void setCompany(long company) {
        this.company = company;
    }

    public Company getCompanyObject() {
        return companyObject;
    }

    public void setCompanyObject(Company companyObject) {
        this.companyObject = companyObject;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public void setDeveloper(boolean developer) {
        isDeveloper = developer;
    }

    public boolean isManufacturer() {
        return isManufacturer;
    }

    public void setManufacturer(boolean manufacturer) {
        isManufacturer = manufacturer;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @JsonSetter("company")
    public void setCompanyJson(JsonNode jsonNode) {
        if (jsonNode.isInt() || jsonNode.isLong())
            this.company = jsonNode.asLong();
        else
            this.companyObject = new Gson().fromJson(jsonNode.toString(), Company.class);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlatformVersionCompany that = (PlatformVersionCompany) o;
        return id == that.id &&
                company == that.company &&
                isDeveloper == that.isDeveloper &&
                isManufacturer == that.isManufacturer &&
                Objects.equals(companyObject, that.companyObject) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, companyObject, isDeveloper, isManufacturer, checksum);
    }
}
