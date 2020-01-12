package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class DescriptionRecord {
    private DescriptionRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_DESCRIPTION;

    public static final String REFINEMENT_ABSTRACT = AttributeValue.QUALIFIER_ABSTRACT;
    public static final String REFINEMENT_PROVENANCE = AttributeValue.QUALIFIER_PROVENANCE;
    public static final String REFINEMENT_SPONSORSHIP = AttributeValue.QUALIFIER_SPONSORSHIP;
    public static final String REFINEMENT_STATEMENT_OF_RESPONSIBILITY = AttributeValue.QUALIFIER_STATEMENT_OF_RESPONSIBILITY;
    public static final String REFINEMENT_TABLE_OF_CONTENTS = AttributeValue.QUALIFIER_TABLE_OF_CONTENTS;
    public static final String REFINEMENT_VERSION = AttributeValue.QUALIFIER_VERSION;

    public static final String SCHEME_URI = AttributeValue.QUALIFIER_URI;

    public static final String[] REFINEMENTS = {
            REFINEMENT_ABSTRACT,
            REFINEMENT_PROVENANCE,
            REFINEMENT_SPONSORSHIP,
            REFINEMENT_STATEMENT_OF_RESPONSIBILITY,
            REFINEMENT_TABLE_OF_CONTENTS,
            REFINEMENT_VERSION
    };
    public static final String[] SCHEMES = {
            SCHEME_URI
    };
}
