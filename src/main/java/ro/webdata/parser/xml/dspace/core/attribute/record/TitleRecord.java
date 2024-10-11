package ro.webdata.parser.xml.dspace.core.attribute.record;

import ro.webdata.parser.xml.dspace.core.attribute.AttributeValue;

public class TitleRecord extends BasicRecord {
    private TitleRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_TITLE;

    public static final String REFINEMENT_ALTERNATIVE = AttributeValue.QUALIFIER_ALTERNATIVE;

    public static final String[] REFINEMENTS = {
            REFINEMENT_ALTERNATIVE
    };
    public static final String[] SCHEMES = {};
}
