package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class RelationRecord extends BasicRecord {
    private RelationRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_RELATION;

    public static final String REFINEMENT_HAS_FORMAT = AttributeValue.QUALIFIER_HAS_FORMAT;
    public static final String REFINEMENT_HAS_PART = AttributeValue.QUALIFIER_HAS_PART;
    public static final String REFINEMENT_HAS_VERSION = AttributeValue.QUALIFIER_HAS_VERSION;
    public static final String REFINEMENT_IS_BASED_ON = AttributeValue.QUALIFIER_IS_BASED_ON;
    public static final String REFINEMENT_IS_FORMAT_OF = AttributeValue.QUALIFIER_IS_FORMAT_OF;
    public static final String REFINEMENT_IS_PART_OF = AttributeValue.QUALIFIER_IS_PART_OF;
    public static final String REFINEMENT_IS_PART_OF_SERIES = AttributeValue.QUALIFIER_IS_PART_OF_SERIES;
    public static final String REFINEMENT_IS_REFERENCED_BY = AttributeValue.QUALIFIER_IS_REFERENCED_BY;
    public static final String REFINEMENT_IS_REPLACED_BY = AttributeValue.QUALIFIER_IS_REPLACED_BY;
    public static final String REFINEMENT_IS_REQUIRED_BY = AttributeValue.QUALIFIER_IS_REQUIRED_BY;
    public static final String REFINEMENT_IS_VERSION_OF = AttributeValue.QUALIFIER_IS_VERSION_OF;
    public static final String REFINEMENT_REFERENCES = AttributeValue.QUALIFIER_REFERENCES;
    public static final String REFINEMENT_REPLACES = AttributeValue.QUALIFIER_REPLACES;
    public static final String REFINEMENT_REQUIRES = AttributeValue.QUALIFIER_REQUIRES;
    
    public static final String SCHEME_URI = AttributeValue.QUALIFIER_URI;

    public static final String[] REFINEMENTS = {
            REFINEMENT_HAS_FORMAT,
            REFINEMENT_HAS_PART,
            REFINEMENT_HAS_VERSION,
            REFINEMENT_IS_BASED_ON,
            REFINEMENT_IS_FORMAT_OF,
            REFINEMENT_IS_PART_OF,
            REFINEMENT_IS_PART_OF_SERIES,
            REFINEMENT_IS_REFERENCED_BY,
            REFINEMENT_IS_REPLACED_BY,
            REFINEMENT_IS_REQUIRED_BY,
            REFINEMENT_IS_VERSION_OF,
            REFINEMENT_REFERENCES,
            REFINEMENT_REPLACES,
            REFINEMENT_REQUIRES
    };
    public static final String[] SCHEMES = {
            SCHEME_URI
    };
}
