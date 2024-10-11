package ro.webdata.parser.xml.dspace.core.attribute;

import ro.webdata.parser.xml.dspace.core.attribute.record.BasicRecord;

public class DcElement implements Attribute {
    private String element;

    private DcElement() {}

    public DcElement(String element) {
        this.element = element != null ? element.trim() : null;
    }

    public String getName() {
        return "element";
    }

    public String getValue() {
        return this.element;
    }

    public boolean hasValue() {
        return this.element != null;
    }

    public boolean isEmpty() {
        return this.element.equals(BasicRecord.EMPTY);
    }

    public boolean isNone() {
        return this.element.equals(BasicRecord.NONE);
    }
}
