package ro.webdata.parser.xml.dc.core.attribute;

public interface Attribute {
    String getName();
    String getValue();

    boolean hasValue();
    boolean isEmpty();
    boolean isNone();
}
