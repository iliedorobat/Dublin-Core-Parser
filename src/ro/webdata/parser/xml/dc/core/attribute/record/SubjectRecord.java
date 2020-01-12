package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class SubjectRecord extends BasicRecord {
    private SubjectRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_SUBJECT;
    
    public static final String REFINEMENT_CLASSIFICATION = AttributeValue.QUALIFIER_CLASSIFICATION;

    public static final String SCHEME_DDC = AttributeValue.QUALIFIER_DDC;
    public static final String SCHEME_LCC = AttributeValue.QUALIFIER_LCC;
    public static final String SCHEME_LCSH = AttributeValue.QUALIFIER_LCSH;
    public static final String SCHEME_MESH = AttributeValue.QUALIFIER_MESH;
    public static final String SCHEME_UDC = AttributeValue.QUALIFIER_UDC;

    public static final String[] REFINEMENTS = {
            REFINEMENT_CLASSIFICATION
    };
    public static final String[] SCHEMES = {
            SCHEME_DDC,
            SCHEME_LCC,
            SCHEME_LCSH,
            SCHEME_MESH,
            SCHEME_UDC
    };
}
