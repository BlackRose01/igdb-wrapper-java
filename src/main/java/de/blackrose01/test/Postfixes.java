package de.blackrose01.test;

import com.google.gson.Gson;

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

    public String getPostfix() {
        return postfix;
    }

    public boolean isRequireComparator() {
        return requireComparator;
    }

    public boolean isOnlyNumeric() {
        return onlyNumeric;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
