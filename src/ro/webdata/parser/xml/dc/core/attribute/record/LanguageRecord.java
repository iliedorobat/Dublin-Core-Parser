package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class LanguageRecord extends BasicRecord {
    private LanguageRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_LANGUAGE;

    public static final String QUALIFIER_ISO = AttributeValue.QUALIFIER_ISO;
    public static final String QUALIFIER_RFC_3066 = AttributeValue.QUALIFIER_RFC_3066;
}
