package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class SubjectRecord extends BasicRecord {
    private SubjectRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_SUBJECT;
    
    public static final String CLASSIFICATION_QUALIFIER = AttributeValue.QUALIFIER_CLASSIFICATION;
    public static final String DDC_QUALIFIER = AttributeValue.QUALIFIER_DDC;
    public static final String LCC_QUALIFIER = AttributeValue.QUALIFIER_LCC;
    public static final String LCSH_QUALIFIER = AttributeValue.QUALIFIER_LCSH;
    public static final String MESH_QUALIFIER = AttributeValue.QUALIFIER_MESH;
    public static final String OTHER_QUALIFIER = AttributeValue.QUALIFIER_OTHER;
}
