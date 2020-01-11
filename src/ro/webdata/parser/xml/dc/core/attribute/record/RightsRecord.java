package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class RightsRecord extends BasicRecord {
    private RightsRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_RIGHTS;

    public static final String HOLDER_QUALIFIER = AttributeValue.QUALIFIER_HOLDER;
    public static final String URI_QUALIFIER = AttributeValue.QUALIFIER_URI;
}
