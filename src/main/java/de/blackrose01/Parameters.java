package de.blackrose01;

import de.blackrose01.endpoint.Endpoint;
import de.blackrose01.endpoint.EndpointPrivate;
import de.blackrose01.endpoint.EndpointPublic;

import java.util.ArrayList;
import java.util.List;

/**
 * Manage Parameters for API requests
 */
public class Parameters {
    private List<String> filters = new ArrayList<String>();
    private String ids = "";
    private String fields = "fields *";
    private String order = "";
    private String offset = "";
    private String limit = "";
    private String search = "";
    private String exclude = "";

    public Parameters() {}

    /**
     * Add single ID as filter
     * @param id
     * @return
     */
    public Parameters addId(long id) {
        this.ids = "id = (" + String.valueOf(id) + ")";
        return this;
    }

    /**
     * Add a bunch of IDs as filter
     * @param id
     * @return
     */
    public Parameters addId(long[] id) {
        String[] ids = new String[id.length];

        for (int i = 0; i < id.length; i++)
            ids[i] = String.valueOf(id[i]);

        this.ids = "id = (" + String.join(",", ids) + ")";
        return this;
    }

    /**
     * Add a bunch of IDs as filter
     * @param id
     * @return
     */
    public Parameters addId(List<Long> id) {
        return this.addId(long[].class.cast(id.toArray()));
    }

    /**
     * Select the field to show in object
     * @param fields
     * @return
     */
    public Parameters addFields(String fields) {
        this.fields = "fields " + fields.replace(" ", ",").toLowerCase();
        return this;
    }

    /**
     * Select the fields to show in objects
     * @param fields
     * @return
     */
    public Parameters addFields(String[] fields) {
        this.fields = "fields " + String.join(",", fields).toLowerCase();
        return this;
    }

    /**
     * Select the fields to show in objects
     * @param fields
     * @return
     */
    public Parameters addFields(List<String> fields) {
        return addFields(fields.toArray(new String[fields.size()]));
    }

    /**
     *
     * @param offset
     * @return
     */
    public Parameters addOffset(int offset) {
        if (offset < 1)
            this.offset = "";
        else if (offset > 5000)
            this.offset = "offset 5000";
        else
            this.offset = "offset " + String.valueOf(offset);

        return this;
    }

    /**
     * Maximal size of objects in response
     * max value: 500, min value: 1
     * @param limit
     * @return
     */
    public Parameters addLimit(int limit) {
        if (limit < 1)
            this.limit = "";
        else if (limit > 500)
            this.limit = "limit 500";
        else
            this.limit = "limit " + String.valueOf(limit);

        return this;
    }

    /**
     * sort response list by given field
     * @param field
     * @param descending
     * @return
     */
    public Parameters addOrder(String field, boolean descending) {
        if (descending)
            this.order = "sort " + field + " desc";
        else
            this.order = "sort " + field + " asc";

        return this;
    }

    /**
     * search for given string in name field; sort by similarity
     * only for endpoints Character, Collection, Game, Platform, People Theme
     * @param endpoint
     * @param search
     * @return
     */
    public Parameters addSearch(Endpoint endpoint, String search) {
        if (
                endpoint == EndpointPublic.Character ||
                        endpoint == EndpointPublic.Collection ||
                        endpoint == EndpointPublic.Game ||
                        endpoint == EndpointPublic.Platform ||
                        endpoint == EndpointPrivate.People ||
                        endpoint == EndpointPublic.Theme
        )
            this.search = "search = " + search.replace(" ", "%20");

        return this;
    }

    /**
     * exclude a field in response objects
     * @param field
     * @return
     */
    public Parameters addExclude(String field) {
        this.exclude = "exclude = " + field;
        return this;
    }

    /**
     * set comparising filters
     * @param field
     * @param comparator
     * @param n
     * @return
     */
    public Parameters addFilter(String field, Postfixes comparator, Number n) {
        if (
                (comparator.isRequireComparator() && comparator.isOnlyNumeric()) ||
                (comparator.isRequireComparator() && comparator == Postfixes.Equal_Case_Sensitive)
        )
            this.filters.add(field + comparator.getPostfix() + String.valueOf(n));

        return this;
    }

    /**
     * set comparising filters
     * @param field
     * @param comparator
     * @param s
     * @return
     */
    public Parameters addFilter(String field, Postfixes comparator, String s) {
        if (
                !comparator.isOnlyNumeric() &&
                s != null &&
                comparator.isRequireComparator()
        )
            this.filters.add(field + comparator.getPostfix() + s);

        return this;
    }

    /**
     * set comparising filters (only null checks)
     * @param field
     * @param comparator
     * @return
     */
    public Parameters addFilterNull(String field, Postfixes comparator) {
        if (comparator == Postfixes.Is_Null || comparator == Postfixes.Not_Null)
            this.filters.add(field + comparator.getPostfix());
        
        return this;
    }

    /**
     * set comparising filters
     * @param values
     * @param comparator
     * @return
     */
    public Parameters addFilter(String[] values, Postfixes comparator) {
        if (
                !comparator.isRequireComparator() &&
                        comparator != Postfixes.Is_Null &&
                        comparator != Postfixes.Not_Null
        )
            this.filters.add(comparator.getPostfix().replace(Postfixes.PLACEHOLDER, String.join(",", values)));

        return this;
    }

    /**
     * set comparising filters
     * @param values
     * @param comparator
     * @return
     */
    public Parameters addFilter(List<String> values, Postfixes comparator) {
        return this.addFilter(values.toArray(new String[values.size()]), comparator);
    }

    /**
     * delete all parameters
     * @return
     */
    public Parameters resetFilterAll() {
        this.filters = new ArrayList<String>();
        this.ids = "";
        this.fields = "fields *";
        this.order = "";
        this.offset = "";
        this.limit = "";
        this.search = "";
        this.exclude = "";

        return this;
    }

    /**
     * delete parameters for ID
     * @return
     */
    public Parameters resetFilterIds() {
        this.ids = "";
        return this;
    }

    /**
     * delete filter parameters
     * @return
     */
    public Parameters resetFilterFilters() {
        this.filters = new ArrayList<>();
        return this;
    }

    /**
     * delete parameters for fields
     * @return
     */
    public Parameters resetFilterFields() {
        this.fields = "fields *";
        return this;
    }

    /**
     * delete parameters for ordering
     * @return
     */
    public Parameters resetFilterOrder() {
        this.order = "";
        return this;
    }

    /**
     * delete parameters for offset
     * @return
     */
    public Parameters resetFilterOffset() {
        this.offset = "";
        return this;
    }

    /**
     * delete parameters for limit
     * @return
     */
    public Parameters resetFilterLimit() {
        this.limit = "";
        return this;
    }

    /**
     * delete parameters for searching
     * @return
     */
    public Parameters resetFilterSearch() {
        this.search = "";
        return this;
    }

    /**
     * delete parameters for exluding fields
     * @return
     */
    public Parameters resetFilterExclude() {
        this.exclude = "";
        return this;
    }

    /**
     * build query string for request
     * @return
     */
    public String buildQuery() {
        String query = fields + ";";

        if (!ids.isEmpty())
            query += ids + ";";
        if (!search.isEmpty())
            query += search + ";";
        if (filters.size() > 0)
            query += "where " + String.join(" & ", filters.toArray(new String[filters.size()])) + ";";
        if (!order.isEmpty())
            query += order + ";";
        if (!limit.isEmpty())
            query += limit + ";";
        if (!offset.isEmpty() && !limit.isEmpty())
            query += offset + ";";
        if (!exclude.isEmpty())
            query += exclude + ";";

        return query;
    }
}
