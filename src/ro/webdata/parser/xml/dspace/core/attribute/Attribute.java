package ro.webdata.parser.xml.dspace.core.attribute;

public interface Attribute {
    String getName();
    String getValue();

    boolean hasValue();
    boolean isEmpty();
    boolean isNone();
}
