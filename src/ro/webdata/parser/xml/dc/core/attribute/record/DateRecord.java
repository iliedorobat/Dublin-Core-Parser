package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class DateRecord extends BasicRecord {
    private DateRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_DATE;

    public static final String QUALIFIER_ACCESSIONED = AttributeValue.QUALIFIER_ACCESSIONED;
    public static final String QUALIFIER_AVAILABLE = AttributeValue.QUALIFIER_AVAILABLE;
    public static final String QUALIFIER_COPYRIGHT = AttributeValue.QUALIFIER_COPYRIGHT;
    public static final String QUALIFIER_CREATED = AttributeValue.QUALIFIER_CREATED;
    public static final String QUALIFIER_ISSUED = AttributeValue.QUALIFIER_ISSUED;
    public static final String QUALIFIER_UPDATED = AttributeValue.QUALIFIER_UPDATED;
}
