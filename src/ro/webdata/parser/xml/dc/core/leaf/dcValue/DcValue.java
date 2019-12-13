package ro.webdata.parser.xml.dc.core.leaf.dcValue;

import ro.webdata.parser.xml.dc.core.attribute.DcElement;
import ro.webdata.parser.xml.dc.core.attribute.DcLanguage;
import ro.webdata.parser.xml.dc.core.attribute.DcQualifier;

public class DcValue {
    private String text;
    private DcElement element;
    private DcQualifier qualifier;
    private DcLanguage language;

    private DcValue() {}

    public DcValue(String text, DcElement element, DcQualifier qualifier, DcLanguage language) {
        setText(text);
        setElement(element);
        setQualifier(qualifier);
        setLanguage(language);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public DcElement getElement() {
        return element;
    }

    public void setElement(DcElement element) {
        this.element = element;
    }

    public DcQualifier getQualifier() {
        return qualifier;
    }

    public void setQualifier(DcQualifier qualifier) {
        this.qualifier = qualifier;
    }

    public DcLanguage getLanguage() {
        return language;
    }

    public void setLanguage(DcLanguage language) {
        this.language = language;
    }
}
