package ro.webdata.parser.xml.dc.core.wrapper.dc;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.dc.core.leaf.dcValue.DcValue;
import ro.webdata.parser.xml.dc.core.leaf.dcValue.DcValueParser;

import java.util.ArrayList;
import java.util.HashMap;

public class DcWrapperParser {
    public static DcWrapper getDcWrapper(Node node) {
        HashMap<String, ArrayList<DcValue>> hashMap = new HashMap<>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("dcvalue")) {
                DcValue dcValue = DcValueParser.getDcValue(child);
                addDcValue(hashMap, dcValue);
            }
        }

        return new DcWrapper(hashMap);
    }

    private static void addDcValue(HashMap<String, ArrayList<DcValue>> hashMap, DcValue dcValue) {
        String key = dcValue.getElement().getValue();
        ArrayList<DcValue> currentList = generateList(hashMap, key);
        currentList.add(dcValue);
    }

    private static ArrayList<DcValue> generateList(HashMap<String, ArrayList<DcValue>> hashMap, String key) {
        ArrayList<DcValue> currentList = hashMap.get(key);

        // If in "hashMap" there isn't any record with the specified key,
        // create the record and return it
        if (currentList == null) {
            ArrayList<DcValue> list = new ArrayList<>();
            hashMap.put(key, list);
            return list;
        }

        return currentList;
    }
}
