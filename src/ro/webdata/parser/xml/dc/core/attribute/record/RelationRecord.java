package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class RelationRecord extends BasicRecord {
    private RelationRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_RELATION;
    
    public static final String HAS_PART_QUALIFIER = AttributeValue.QUALIFIER_HAS_PART;
    public static final String HAS_VERSION_QUALIFIER = AttributeValue.QUALIFIER_HAS_VERSION;
    public static final String IS_BASED_ON_QUALIFIER = AttributeValue.QUALIFIER_IS_BASED_ON;
    public static final String IS_FORMAT_OF_QUALIFIER = AttributeValue.QUALIFIER_IS_FORMAT_OF;
    public static final String IS_PART_OF_QUALIFIER = AttributeValue.QUALIFIER_IS_PART_OF;
    public static final String IS_PART_OF_SERIES_QUALIFIER = AttributeValue.QUALIFIER_IS_PART_OF_SERIES;
    public static final String IS_REFERENCED_BY_QUALIFIER = AttributeValue.QUALIFIER_IS_REFERENCED_BY;
    public static final String IS_REPLACED_BY_QUALIFIER = AttributeValue.QUALIFIER_IS_REPLACED_BY;
    public static final String IS_VERSION_OF_QUALIFIER = AttributeValue.QUALIFIER_IS_VERSION_OF;
    public static final String REPLACES_QUALIFIER = AttributeValue.QUALIFIER_REPLACES;
    public static final String REQUIRES_QUALIFIER = AttributeValue.QUALIFIER_REQUIRES;
    public static final String URI_QUALIFIER = AttributeValue.QUALIFIER_URI;
}
