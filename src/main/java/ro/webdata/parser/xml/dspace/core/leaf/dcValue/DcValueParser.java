package ro.webdata.parser.xml.dspace.core.leaf.dcValue;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.echo.commons.graph.Graph;
import ro.webdata.parser.xml.dspace.core.attribute.DcElement;
import ro.webdata.parser.xml.dspace.core.attribute.DcLanguage;
import ro.webdata.parser.xml.dspace.core.attribute.DcQualifier;

import java.util.Map;

public class DcValueParser {
    public static DcValue getDcValue(Node node) {
        DcValue dcValue = null;
        Map<String, String> attributes = Graph.getAttributes(node);

        NodeList childNodeList = node.getChildNodes();
        int len = childNodeList.getLength();
        if (len == 1) {
            Node child = childNodeList.item(0);
            dcValue = new DcValue(
                    child.getNodeValue(),
                    new DcElement(attributes.get("element")),
                    new DcQualifier(attributes.get("qualifier")),
                    new DcLanguage(attributes.get("language"))
            );
        }

        return dcValue;
    }
}
