package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class TypeRecord extends BasicRecord {
    private TypeRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_TYPE;

    public static final String SCHEME_DCMI_TYPE_VOCABULARY = AttributeValue.QUALIFIER_DCMI_TYPE_VOCABULARY;

    public static final String[] REFINEMENTS = {};
    public static final String[] SCHEMES = {
            SCHEME_DCMI_TYPE_VOCABULARY
    };
}
