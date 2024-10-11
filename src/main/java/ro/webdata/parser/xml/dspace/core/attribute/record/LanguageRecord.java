package ro.webdata.parser.xml.dspace.core.attribute.record;

import ro.webdata.parser.xml.dspace.core.attribute.AttributeValue;

public class LanguageRecord extends BasicRecord {
    private LanguageRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_LANGUAGE;

    public static final String SCHEME_ISO_639_2 = AttributeValue.QUALIFIER_ISO_639_2;
    public static final String SCHEME_RFC_1766 = AttributeValue.QUALIFIER_RFC_1766;

    public static final String[] REFINEMENTS = {};
    public static final String[] SCHEMES = {
            SCHEME_ISO_639_2,
            SCHEME_RFC_1766
    };
}
