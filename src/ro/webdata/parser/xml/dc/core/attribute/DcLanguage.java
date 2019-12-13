package ro.webdata.parser.xml.dc.core.attribute;

public class DcLanguage implements Attribute {
    private String language;

    private DcLanguage() {}

    public DcLanguage(String language) {
        this.language = language;
    }

    public String getAttrName() {
        return "language";
    }

    public String getAttrValue() {
        return language;
    }
}
