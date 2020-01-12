package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class LanguageRecord extends BasicRecord {
    private LanguageRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_LANGUAGE;

    public static final String SCHEME_ISO = AttributeValue.QUALIFIER_ISO;
    public static final String SCHEME_ISO_639_2 = AttributeValue.QUALIFIER_ISO_639_2;
    public static final String SCHEME_RFC_3066 = AttributeValue.QUALIFIER_RFC_3066;

    public static final String[] REFINEMENTS = {};
    public static final String[] SCHEMES = {
            SCHEME_ISO,
            SCHEME_ISO_639_2,
            SCHEME_RFC_3066
    };
}
