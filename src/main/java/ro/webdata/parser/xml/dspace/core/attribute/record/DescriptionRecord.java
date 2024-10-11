package ro.webdata.parser.xml.dspace.core.attribute.record;

import ro.webdata.parser.xml.dspace.core.attribute.AttributeValue;

public class DescriptionRecord extends BasicRecord {
    private DescriptionRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_DESCRIPTION;

    public static final String REFINEMENT_ABSTRACT = AttributeValue.QUALIFIER_ABSTRACT;
    public static final String REFINEMENT_TABLE_OF_CONTENTS = AttributeValue.QUALIFIER_TABLE_OF_CONTENTS;

    public static final String[] REFINEMENTS = {
            REFINEMENT_ABSTRACT,
            REFINEMENT_TABLE_OF_CONTENTS
    };
    public static final String[] SCHEMES = {};
}
