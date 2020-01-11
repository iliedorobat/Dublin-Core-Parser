package ro.webdata.parser.xml.dc.core.attribute.record;

import ro.webdata.parser.xml.dc.core.attribute.AttributeValue;

public class ContributorRecord extends BasicRecord {
    private ContributorRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_CONTRIBUTOR;

    public static final String QUALIFIER_ADVISOR = AttributeValue.QUALIFIER_ADVISOR;
    public static final String QUALIFIER_AUTHOR = AttributeValue.QUALIFIER_AUTHOR;
    public static final String QUALIFIER_EDITOR = AttributeValue.QUALIFIER_EDITOR;
    public static final String QUALIFIER_ILLUSTRATOR = AttributeValue.QUALIFIER_ILLUSTRATOR;
    public static final String QUALIFIER_OTHER = AttributeValue.QUALIFIER_OTHER;
}
