package de.blackrose01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Objects;

/**
 * A usage report for the API key
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiStatus implements Serializable {
    @JsonProperty(value = "authorized")
    private boolean authorized;
    @JsonProperty(value = "plan")
    private String plan;
    @JsonProperty(value = "usage_reports")
    private UsageReports usageReports;

    public ApiStatus() {
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public String getPlan() {
        return plan;
    }

    @JsonIgnore
    public UsageReports getUsageReports() {
        return usageReports;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiStatus apiStatus = (ApiStatus) o;
        return authorized == apiStatus.authorized &&
                Objects.equals(plan, apiStatus.plan) &&
                Objects.equals(usageReports, apiStatus.usageReports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorized, plan, usageReports);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UsageReports {
        @JsonProperty(value = "usage_report")
        private UsageReport usageReport;

        public UsageReports() {
        }

        @JsonIgnore
        public UsageReport getUsageReport() {
            return usageReport;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UsageReports that = (UsageReports) o;
            return Objects.equals(usageReport, that.usageReport);
        }

        @Override
        public int hashCode() {
            return Objects.hash(usageReport);
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UsageReport {
        @JsonProperty(value = "metric")
        private String metric;
        @JsonProperty(value = "period")
        private String period;
        @JsonProperty(value = "period_start")
        private String periodStart;
        @JsonProperty(value = "period_end")
        private String periodEnd;
        @JsonProperty(value = "max_value")
        private String valueMax;
        @JsonProperty(value = "current_value")
        private String valueCurrent;

        public UsageReport() {
        }

        public String getMetric() {
            return metric;
        }

        public String getPeriod() {
            return period;
        }

        public String getPeriodStart() {
            return periodStart;
        }

        public String getPeriodEnd() {
            return periodEnd;
        }

        public String getValueMax() {
            return valueMax;
        }

        public String getValueCurrent() {
            return valueCurrent;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UsageReport that = (UsageReport) o;
            return Objects.equals(metric, that.metric) &&
                    Objects.equals(period, that.period) &&
                    Objects.equals(periodStart, that.periodStart) &&
                    Objects.equals(periodEnd, that.periodEnd) &&
                    Objects.equals(valueMax, that.valueMax) &&
                    Objects.equals(valueCurrent, that.valueCurrent);
        }

        @Override
        public int hashCode() {
            return Objects.hash(metric, period, periodStart, periodEnd, valueMax, valueCurrent);
        }
    }
}
