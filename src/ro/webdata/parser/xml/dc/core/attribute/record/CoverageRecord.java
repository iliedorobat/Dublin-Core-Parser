package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class CoverageRecord extends BasicRecord {
    private CoverageRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_COVERAGE;

    public static final String QUALIFIER_SPATIAL = AttributeValue.QUALIFIER_SPATIAL;
    public static final String QUALIFIER_TEMPORAL = AttributeValue.QUALIFIER_TEMPORAL;
}
