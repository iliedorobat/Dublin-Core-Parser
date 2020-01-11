package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class LanguageRecord extends BasicRecord {
    private LanguageRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_LANGUAGE;

    public static final String ISO_QUALIFIER = AttributeValue.QUALIFIER_ISO;
    public static final String RFC_3066_QUALIFIER = AttributeValue.QUALIFIER_RFC_3066;
}
