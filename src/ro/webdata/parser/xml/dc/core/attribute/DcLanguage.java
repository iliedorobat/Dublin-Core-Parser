package ro.webdata.parser.xml.dc.core.attribute;

public class DcLanguage implements Attribute {
    private String language;

    private DcLanguage() {}

    public DcLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return "language";
    }

    public String getValue() {
        return this.language;
    }

    public boolean hasValue() {
        return this.language != null;
    }

    public boolean isEmpty() {
        return this.language.equals(AttributeValue.EMPTY);
    }

    public boolean isNone() {
        return this.language.equals(AttributeValue.NONE);
    }
}
