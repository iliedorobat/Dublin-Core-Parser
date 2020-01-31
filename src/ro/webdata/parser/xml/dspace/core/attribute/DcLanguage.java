package ro.webdata.parser.xml.dspace.core.attribute;

import ro.webdata.parser.xml.dspace.core.attribute.record.BasicRecord;

public class DcLanguage implements Attribute {
    private String language;

    private DcLanguage() {}

    public DcLanguage(String language) {
        this.language = language != null ? language.trim() : null;
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
        return this.language.equals(BasicRecord.EMPTY);
    }

    public boolean isNone() {
        return this.language.equals(BasicRecord.NONE);
    }
}
