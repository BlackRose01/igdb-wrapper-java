package de.blackrose01.model.platform;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import de.blackrose01.model.company.Company;

import java.io.Serializable;
import java.util.Objects;

/**
 * A platform developer
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlatformVersionCompany implements Serializable {
    @JsonIgnore
    @JsonProperty(value = "id")
    private long id;
    @JsonProperty(value = "company")
    private Object company;
    @JsonIgnore
    @JsonProperty(value = "developer")
    private boolean isDeveloper;
    @JsonIgnore
    @JsonProperty(value = "manufacturer")
    private boolean isManufacturer;
    @JsonIgnore
    @JsonProperty(value = "checksum")
    private String checksum;

    public PlatformVersionCompany() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonIgnore
    public long getCompany() {
        return Long.parseLong(String.valueOf(company));
    }

    @JsonIgnore
    public Company getCompanyObject() {
        return new ObjectMapper().convertValue(company, Company.class);
    }

    public void setCompany(Object company) {
        this.company = company;
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
                isDeveloper == that.isDeveloper &&
                isManufacturer == that.isManufacturer &&
                Objects.equals(company, that.company) &&
                Objects.equals(checksum, that.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, isDeveloper, isManufacturer, checksum);
    }
}
