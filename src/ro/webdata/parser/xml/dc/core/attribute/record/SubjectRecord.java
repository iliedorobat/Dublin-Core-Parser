package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class SubjectRecord extends BasicRecord {
    private SubjectRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_SUBJECT;
    
    public static final String QUALIFIER_CLASSIFICATION = AttributeValue.QUALIFIER_CLASSIFICATION;
    public static final String QUALIFIER_DDC = AttributeValue.QUALIFIER_DDC;
    public static final String QUALIFIER_LCC = AttributeValue.QUALIFIER_LCC;
    public static final String QUALIFIER_LCSH = AttributeValue.QUALIFIER_LCSH;
    public static final String QUALIFIER_MESH = AttributeValue.QUALIFIER_MESH;
    public static final String QUALIFIER_OTHER = AttributeValue.QUALIFIER_OTHER;
}
