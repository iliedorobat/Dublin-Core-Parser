package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class IdentifierRecord extends BasicRecord {
    private IdentifierRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_IDENTIFIER;
    
    public static final String CITATION_QUALIFIER = AttributeValue.QUALIFIER_CITATION;
    public static final String GOV_DOC_QUALIFIER = AttributeValue.QUALIFIER_GOV_DOC;
    public static final String ISBN_QUALIFIER = AttributeValue.QUALIFIER_ISBN;
    public static final String ISMN_QUALIFIER = AttributeValue.QUALIFIER_ISMN;
    public static final String ISSN_QUALIFIER = AttributeValue.QUALIFIER_ISSN;
    public static final String OTHER_QUALIFIER = AttributeValue.QUALIFIER_OTHER;
    public static final String SICI_QUALIFIER = AttributeValue.QUALIFIER_SICI;
    public static final String SLUG_QUALIFIER = AttributeValue.QUALIFIER_SLUG;
    public static final String T100_QUALIFIER = AttributeValue.QUALIFIER_T100;
    public static final String URI_QUALIFIER = AttributeValue.QUALIFIER_URI;
}
