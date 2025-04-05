package ro.webdata.parser.xml.dspace.core.wrapper.dc;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.dspace.core.attribute.AttributeValue;
import ro.webdata.parser.xml.dspace.core.leaf.dcValue.DcValue;
import ro.webdata.parser.xml.dspace.core.leaf.dcValue.DcValueParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DcWrapperParser {
    public static DcWrapper getDcWrapper(Node node) {
        Map<String, List<DcValue>> hashMap = new HashMap<>();

        NodeList childNodeList = node.getChildNodes();
        String schemaName = node.getAttributes()
                .getNamedItem(AttributeValue.ATTRIBUTE_SCHEMA)
                .getNodeValue();

        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("dcvalue")) {
                DcValue dcValue = DcValueParser.getDcValue(child);
                addDcValue(hashMap, dcValue);
            }
        }

        return new DcWrapper(hashMap, schemaName);
    }

    private static void addDcValue(Map<String, List<DcValue>> hashMap, DcValue dcValue) {
        String key = dcValue.getElement().getValue();
        List<DcValue> currentList = generateList(hashMap, key);
        currentList.add(dcValue);
    }

    private static List<DcValue> generateList(Map<String, List<DcValue>> hashMap, String key) {
        List<DcValue> currentList = hashMap.get(key);

        // If in "hashMap" there isn't any record with the specified key,
        // create the record and return it
        if (currentList == null) {
            List<DcValue> list = new ArrayList<>();
            hashMap.put(key, list);
            return list;
        }

        return currentList;
    }
}
