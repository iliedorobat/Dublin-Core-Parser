package ro.webdata.dc.parser.core.attribute;

public class DcQualifier implements Attribute {
    private String qualifier;

    private DcQualifier() {}

    public DcQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getAttrName() {
        return "qualifier";
    }

    public String getAttrValue() {
        return qualifier;
    }
}
