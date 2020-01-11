package ro.webdata.parser.xml.dc.core.attribute;

public class DcQualifier implements Attribute {
    private String qualifier;

    private DcQualifier() {}

    public DcQualifier(String qualifier) {
        this.qualifier = qualifier;
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
        return this.qualifier.equals(AttributeValue.EMPTY);
    }

    public boolean isNone() {
        return this.qualifier.equals(AttributeValue.NONE);
    }
}
