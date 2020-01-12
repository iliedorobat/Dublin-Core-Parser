package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class IdentifierRecord extends BasicRecord {
    private IdentifierRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_IDENTIFIER;
    
    public static final String REFINEMENT_CITATION = AttributeValue.QUALIFIER_CITATION;
    public static final String REFINEMENT_GOV_DOC = AttributeValue.QUALIFIER_GOV_DOC;
    public static final String REFINEMENT_ISBN = AttributeValue.QUALIFIER_ISBN;
    public static final String REFINEMENT_ISMN = AttributeValue.QUALIFIER_ISMN;
    public static final String REFINEMENT_ISSN = AttributeValue.QUALIFIER_ISSN;
    public static final String REFINEMENT_SICI = AttributeValue.QUALIFIER_SICI;
    public static final String REFINEMENT_SLUG = AttributeValue.QUALIFIER_SLUG;
    public static final String REFINEMENT_T100 = AttributeValue.QUALIFIER_T100;

    public static final String SCHEME_URI = AttributeValue.QUALIFIER_URI;

    public static final String[] REFINEMENTS = {
            REFINEMENT_CITATION,
            REFINEMENT_GOV_DOC,
            REFINEMENT_ISBN,
            REFINEMENT_ISMN,
            REFINEMENT_ISSN,
            REFINEMENT_SICI,
            REFINEMENT_SLUG,
            REFINEMENT_T100
    };
    public static final String[] SCHEMES = {
            SCHEME_URI
    };
}
