package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class FormatRecord extends BasicRecord {
    private FormatRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_FORMAT;

    public static final String EXTENT_QUALIFIER = AttributeValue.QUALIFIER_EXTENT;
    public static final String MEDIUM_QUALIFIER = AttributeValue.QUALIFIER_MEDIUM;
    public static final String MIME_TYPE_QUALIFIER = AttributeValue.QUALIFIER_MIME_TYPE;
}
