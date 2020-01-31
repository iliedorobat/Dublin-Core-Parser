package ro.webdata.parser.xml.dspace.core;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import ro.webdata.parser.xml.dspace.common.Constants;
import ro.webdata.parser.xml.dspace.core.attribute.AttributeValue;
import ro.webdata.parser.xml.dspace.core.attribute.DcQualifier;
import ro.webdata.parser.xml.dspace.core.leaf.dcValue.DcValue;
import ro.webdata.parser.xml.dspace.core.wrapper.dc.DcWrapper;
import ro.webdata.parser.xml.dspace.core.wrapper.dc.DcWrapperParser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Parser {
    public static String getSchemaName(String filePath) {
        String schemaName = null;
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            Element dcWrapperNode = doc.getDocumentElement();
            schemaName = dcWrapperNode.getAttribute(AttributeValue.ELEMENT_SCHEMA);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return schemaName;
    }

    public static DcWrapper parseDcXmlFile(String filePath) {
        DcWrapper dcWrapper = null;
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            Element dcWrapperNode = doc.getDocumentElement();
            dcWrapper = DcWrapperParser.getDcWrapper(dcWrapperNode);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return dcWrapper;
    }

    public static ArrayList<String> getQualifierValues(String mainPath, String[] filesName) {
        Set<String> set = new HashSet<>();

        for (String fileName : filesName) {
            String filePath = mainPath + Constants.FILE_SEPARATOR + fileName + ".xml";
            set.addAll(
                    getQualifierValues(filePath)
            );
        }

        return new ArrayList<>(set);
    }

    private static Set<String> getQualifierValues(String filePath) {
        Set<String> set = new HashSet<>();
        DcWrapper dcWrapper = Parser.parseDcXmlFile(filePath);
        HashMap<String, ArrayList<DcValue>> dcValueMap = dcWrapper.getDcValueMap();

        for (Map.Entry<String, ArrayList<DcValue>> entry : dcValueMap.entrySet()) {
            ArrayList<DcValue> dcValueList = entry.getValue();

            for (DcValue dcValue : dcValueList) {
                DcQualifier qualifier = dcValue.getQualifier();
                set.add(qualifier.getValue());
            }
        }

        return set;
    }
}
