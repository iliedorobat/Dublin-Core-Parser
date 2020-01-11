package ro.webdata.parser.xml.dc.core.attribute;

import ro.webdata.parser.xml.dc.core.attribute.record.BasicRecord;

public class DcElement implements Attribute {
    private String element;

    private DcElement() {}

    public DcElement(String element) {
        this.element = element;
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
        return this.element.equals(BasicRecord.ELEMENT_EMPTY);
    }

    public boolean isNone() {
        return this.element.equals(BasicRecord.ELEMENT_NONE);
    }
}
