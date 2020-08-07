package de.blackrose01;

import de.blackrose01.interfaces.Endpoint;
import de.blackrose01.test.EndpointPrivate;
import de.blackrose01.test.EndpointPublic;
import de.blackrose01.test.Postfixes;
import java.util.ArrayList;
import java.util.List;

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

    public Parameters addId(long id) {
        this.ids = "id = (" + String.valueOf(id) + ")";
        return this;
    }

    public Parameters addId(long[] id) {
        String[] ids = new String[id.length];

        for (int i = 0; i < id.length; i++)
            ids[i] = String.valueOf(id[i]);

        this.ids = "id = (" + String.join(",", ids) + ")";
        return this;
    }

    public Parameters addId(List<Long> id) {
        return this.addId(long[].class.cast(id.toArray()));
    }

    public Parameters addFields(String fields) {
        this.fields = "fields " + fields.replace(" ", ",").toLowerCase();
        return this;
    }

    public Parameters addFields(String[] fields) {
        this.fields = "fields " + String.join(",", fields).toLowerCase();
        return this;
    }

    public Parameters addFields(List<String> fields) {
        return addFields(fields.toArray(new String[fields.size()]));
    }

    public Parameters addOffset(int offset) {
        if (offset < 1)
            this.offset = "";
        else if (offset > 5000)
            this.offset = "offset 5000";
        else
            this.offset = "offset " + String.valueOf(offset);

        return this;
    }

    public Parameters addLimit(int limit) {
        if (limit < 1)
            this.limit = "";
        else if (limit > 500)
            this.limit = "limit 500";
        else
            this.limit = "limit " + String.valueOf(limit);

        return this;
    }

    public Parameters addOrder(String field, boolean descending) {
        if (descending)
            this.order = "sort " + field + " desc";
        else
            this.order = "sort " + field + " asc";

        return this;
    }

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

    public Parameters addExclude(String field) {
        this.exclude = "exclude = " + field;
        return this;
    }

    public Parameters addFilter(String field, Postfixes comparator, Number n) {
        if (
                (comparator.isRequireComparator() && comparator.isOnlyNumeric()) ||
                (comparator.isRequireComparator() && comparator == Postfixes.Equal_Case_Sensitive)
        )
            this.filters.add(field + comparator.getPostfix() + String.valueOf(n));

        return this;
    }

    public Parameters addFilter(String field, Postfixes comparator, String s) {
        if (
                !comparator.isOnlyNumeric() &&
                s != null &&
                comparator.isRequireComparator()
        )
            this.filters.add(field + comparator.getPostfix() + s);

        return this;
    }
    
    public Parameters addFilterNull(String field, Postfixes comparator) {
        if (comparator == Postfixes.Is_Null || comparator == Postfixes.Not_Null)
            this.filters.add(field + comparator.getPostfix());
        
        return this;
    }

    public Parameters addFilter(String[] values, Postfixes comparator) {
        if (
                !comparator.isRequireComparator() &&
                        comparator != Postfixes.Is_Null &&
                        comparator != Postfixes.Not_Null
        )
            this.filters.add(comparator.getPostfix().replace(Postfixes.PLACEHOLDER, String.join(",", values)));

        return this;
    }
    
    public Parameters addFilter(List<String> values, Postfixes comparator) {
        return this.addFilter(values.toArray(new String[values.size()]), comparator);
    }
    
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

    public Parameters resetFilterIds() {
        this.ids = "";
        return this;
    }

    public Parameters resetFilterFilters() {
        this.filters = new ArrayList<>();
        return this;
    }

    public Parameters resetFilterFields() {
        this.fields = "fields *";
        return this;
    }

    public Parameters resetFilterOrder() {
        this.order = "";
        return this;
    }

    public Parameters resetFilterOffset() {
        this.offset = "";
        return this;
    }

    public Parameters resetFilterLimit() {
        this.limit = "";
        return this;
    }

    public Parameters resetFilterSearch() {
        this.search = "";
        return this;
    }

    public Parameters resetFilterExclude() {
        this.exclude = "";
        return this;
    }
    
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
        if (!offset.isEmpty())
            query += offset + ";";
        if (!exclude.isEmpty())
            query += exclude + ";";

        return query;
    }
}
