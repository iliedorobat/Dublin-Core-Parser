package ro.webdata.parser.xml.dc.core.attribute;

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
