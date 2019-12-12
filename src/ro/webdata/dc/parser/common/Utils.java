package ro.webdata.dc.parser.common;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import java.util.HashMap;

public class Utils {
    /**
     * Get the attributes from a <b>Node</b> element and add them into a <b>HashMap</b>.
     * @param node <b>Node</b> type element.
     * @return <b>HashMap</b>
     */
    public static HashMap<String, String> getAttributes(Node node) {
        NamedNodeMap attributes = node.getAttributes();
        HashMap<String, String> hashMapAttr = new HashMap<>();

        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                Node attr = attributes.item(i);
                hashMapAttr.put(attr.getNodeName(), attr.getNodeValue());
            }
        }

        return hashMapAttr;
    }
}
