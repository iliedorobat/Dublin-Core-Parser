package ro.webdata.parser.xml.dspace.core.attribute.record;

import ro.webdata.parser.xml.dspace.core.attribute.AttributeValue;

public class IdentifierRecord extends BasicRecord {
    private IdentifierRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_IDENTIFIER;

    public static final String SCHEME_URI = AttributeValue.QUALIFIER_URI;

    public static final String[] REFINEMENTS = {};
    public static final String[] SCHEMES = {
            SCHEME_URI
    };
}
