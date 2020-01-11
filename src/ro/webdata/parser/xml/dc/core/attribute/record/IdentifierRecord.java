package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class IdentifierRecord extends BasicRecord {
    private IdentifierRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_IDENTIFIER;
    
    public static final String QUALIFIER_CITATION = AttributeValue.QUALIFIER_CITATION;
    public static final String QUALIFIER_GOV_DOC = AttributeValue.QUALIFIER_GOV_DOC;
    public static final String QUALIFIER_ISBN = AttributeValue.QUALIFIER_ISBN;
    public static final String QUALIFIER_ISMN = AttributeValue.QUALIFIER_ISMN;
    public static final String QUALIFIER_ISSN = AttributeValue.QUALIFIER_ISSN;
    public static final String QUALIFIER_OTHER = AttributeValue.QUALIFIER_OTHER;
    public static final String QUALIFIER_SICI = AttributeValue.QUALIFIER_SICI;
    public static final String QUALIFIER_SLUG = AttributeValue.QUALIFIER_SLUG;
    public static final String QUALIFIER_T100 = AttributeValue.QUALIFIER_T100;
    public static final String QUALIFIER_URI = AttributeValue.QUALIFIER_URI;
}
