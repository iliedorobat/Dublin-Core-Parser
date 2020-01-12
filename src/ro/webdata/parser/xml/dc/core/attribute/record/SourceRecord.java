package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class SourceRecord extends BasicRecord {
    private SourceRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_SOURCE;

    public static final String SCHEME_URI = AttributeValue.QUALIFIER_URI;

    public static final String[] REFINEMENTS = {};
    public static final String[] SCHEMES = {
            SCHEME_URI
    };
}
