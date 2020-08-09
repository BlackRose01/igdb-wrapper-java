package de.blackrose01;

import com.google.gson.Gson;

/**
 * available postfixes to filter
 */
public enum Postfixes {
    Equal_Case_Sensitive("=", true, false),
    Equal_Case_Insensitive("~", true, false),
    Not_Equal("!=", true, true),
    Greater(">", true, true),
    Greater_Equal(">=", true, true),
    Less("<", true, true),
    Less_Equal("<=", true, true),
    Not_Null("!= null", false, false),
    Is_Null("= null", false, false),
    And_List("[&LIST&]", false, false),
    Not_And_List("![&LIST&]", false, false),
    Or_List("(&LIST&)", false, false),
    Not_Or_List("!(&LIST&)", false, false),
    Exact_Array_Match("{&LIST&}", false, false);

    Postfixes(String postfix, boolean requireComparator, boolean onlyNumeric) {
        this.postfix = postfix;
        this.requireComparator = requireComparator;
        this.onlyNumeric = onlyNumeric;
    }

    private String postfix;
    private boolean requireComparator;
    private boolean onlyNumeric;
    public static final String PLACEHOLDER = "&LIST&";

    /**
     * return postfix/relational operator
     *
     * @return
     */
    public String getPostfix() {
        return postfix;
    }

    /**
     * return comparator is requires
     *
     * @return
     */
    public boolean isRequireComparator() {
        return requireComparator;
    }

    /**
     * return only numeric values accepted
     *
     * @return
     */
    public boolean isOnlyNumeric() {
        return onlyNumeric;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
