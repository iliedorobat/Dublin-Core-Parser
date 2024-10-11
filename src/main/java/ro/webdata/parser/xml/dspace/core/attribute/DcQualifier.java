package ro.webdata.parser.xml.dspace.core.attribute;

import ro.webdata.parser.xml.dspace.core.attribute.record.BasicRecord;

public class DcQualifier implements Attribute {
    private String qualifier;

    private DcQualifier() {}

    public DcQualifier(String qualifier) {
        this.qualifier = qualifier != null ? qualifier.trim() : null;
    }

    public String getName() {
        return "qualifier";
    }

    public String getValue() {
        return this.qualifier;
    }

    public boolean hasValue() {
        return this.qualifier != null;
    }

    public boolean isEmpty() {
        return this.qualifier.equals(BasicRecord.EMPTY);
    }

    public boolean isNone() {
        return this.qualifier.equals(BasicRecord.EMPTY);
    }
}
