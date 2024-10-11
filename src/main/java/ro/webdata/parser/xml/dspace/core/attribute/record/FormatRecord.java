package ro.webdata.parser.xml.dspace.core.attribute.record;

import ro.webdata.parser.xml.dspace.core.attribute.AttributeValue;

public class FormatRecord extends BasicRecord {
    private FormatRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_FORMAT;

    public static final String REFINEMENT_EXTENT = AttributeValue.QUALIFIER_EXTENT;
    public static final String REFINEMENT_MEDIUM = AttributeValue.QUALIFIER_MEDIUM;

    public static final String SCHEME_MEDIUM_IMT = AttributeValue.QUALIFIER_IMT;

    public static final String[] REFINEMENTS = {
            REFINEMENT_EXTENT,
            REFINEMENT_MEDIUM
    };
    public static final String[] SCHEMES = {
            SCHEME_MEDIUM_IMT
    };
}
