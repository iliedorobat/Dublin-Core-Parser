package ro.webdata.dc.parser.core.attribute;

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
