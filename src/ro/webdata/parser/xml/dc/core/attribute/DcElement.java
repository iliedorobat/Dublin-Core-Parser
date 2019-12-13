package ro.webdata.parser.xml.dc.core.attribute;

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
