package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class RightsRecord extends BasicRecord {
    private RightsRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_RIGHTS;

    public static final String QUALIFIER_HOLDER = AttributeValue.QUALIFIER_HOLDER;
    public static final String QUALIFIER_URI = AttributeValue.QUALIFIER_URI;
}
