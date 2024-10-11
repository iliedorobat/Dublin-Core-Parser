package ro.webdata.parser.xml.dspace.core.attribute.record;

import ro.webdata.parser.xml.dspace.core.attribute.AttributeValue;

public class CoverageRecord extends BasicRecord {
    private CoverageRecord() {}

    public static final String ELEMENT = AttributeValue.ELEMENT_COVERAGE;

    public static final String REFINEMENT_SPATIAL = AttributeValue.QUALIFIER_SPATIAL;
    public static final String REFINEMENT_TEMPORAL = AttributeValue.QUALIFIER_TEMPORAL;

    public static final String SCHEME_SPATIAL_DCMI_BOX = AttributeValue.QUALIFIER_DCMI_BOX;
    public static final String SCHEME_SPATIAL_DCMI_POINT = AttributeValue.QUALIFIER_DCMI_POINT;
    public static final String SCHEME_SPATIAL_ISO_3166 = AttributeValue.QUALIFIER_ISO_3166;
    public static final String SCHEME_SPATIAL_TGN = AttributeValue.QUALIFIER_TGN;
    public static final String SCHEME_TEMPORAL_DCMI_PERIOD = AttributeValue.QUALIFIER_DCMI_PERIOD;
    public static final String SCHEME_TEMPORAL_W3C_DTF = AttributeValue.QUALIFIER_W3C_DTF;

    public static final String[] REFINEMENTS = {
            REFINEMENT_SPATIAL,
            REFINEMENT_TEMPORAL
    };
    public static final String[] SCHEMES = {
            SCHEME_SPATIAL_DCMI_BOX,
            SCHEME_SPATIAL_DCMI_POINT,
            SCHEME_SPATIAL_ISO_3166,
            SCHEME_SPATIAL_TGN,
            SCHEME_TEMPORAL_DCMI_PERIOD,
            SCHEME_TEMPORAL_W3C_DTF
    };
}
