package ro.webdata.dc.parser.core.attribute;

public class DcElement implements Attribute {
    private String element;

    private DcElement() {}

    public DcElement(String element) {
        this.element = element;
    }

    public String getAttrName() {
        return "element";
    }

    public String getAttrValue() {
        return element;
    }
}
