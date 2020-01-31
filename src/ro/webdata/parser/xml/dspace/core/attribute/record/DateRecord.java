package ro.webdata.parser.xml.dspace.core.attribute.record;

import ro.webdata.parser.xml.dspace.core.attribute.AttributeValue;

public class DateRecord extends BasicRecord {
    private DateRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_DATE;

    public static final String REFINEMENT_AVAILABLE = AttributeValue.QUALIFIER_AVAILABLE;
    public static final String REFINEMENT_CREATED = AttributeValue.QUALIFIER_CREATED;
    public static final String REFINEMENT_MODIFIED = AttributeValue.QUALIFIER_MODIFIED;
    public static final String REFINEMENT_ISSUED = AttributeValue.QUALIFIER_ISSUED;
    public static final String REFINEMENT_VALID = AttributeValue.QUALIFIER_VALID;

    public static final String SCHEME_TEMPORAL_DCMI_PERIOD = AttributeValue.QUALIFIER_DCMI_PERIOD;
    public static final String SCHEME_TEMPORAL_W3C_DTF = AttributeValue.QUALIFIER_W3C_DTF;

    public static final String[] REFINEMENTS = {
            REFINEMENT_AVAILABLE,
            REFINEMENT_CREATED,
            REFINEMENT_MODIFIED,
            REFINEMENT_ISSUED,
            REFINEMENT_VALID
    };
    public static final String[] SCHEMES = {
            SCHEME_TEMPORAL_DCMI_PERIOD,
            SCHEME_TEMPORAL_W3C_DTF
    };
}
