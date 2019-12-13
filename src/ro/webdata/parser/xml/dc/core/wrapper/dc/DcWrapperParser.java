package ro.webdata.parser.xml.dc.core.wrapper.dc;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ro.webdata.parser.xml.dc.core.leaf.dcValue.DcValue;
import ro.webdata.parser.xml.dc.core.leaf.dcValue.DcValueParser;

import java.util.ArrayList;

public class DcWrapperParser {
    public static DcWrapper getDcWrapper(Node node) {
        ArrayList<DcValue> dcValueList = new ArrayList<>();

        NodeList childNodeList = node.getChildNodes();
        for (int i = 0; i < childNodeList.getLength(); i++) {
            Node child = childNodeList.item(i);
            String childName = child.getNodeName();

            if (childName.equals("dcvalue")) {
                dcValueList.add(DcValueParser.getDcValue(child));
            }
        }

        return new DcWrapper(dcValueList);
    }
}
