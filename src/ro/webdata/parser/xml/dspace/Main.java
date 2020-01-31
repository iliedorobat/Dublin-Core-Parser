package ro.webdata.parser.xml.dspace;

import ro.webdata.parser.xml.dspace.common.Constants;
import ro.webdata.parser.xml.dspace.core.Parser;

import java.util.ArrayList;

public class Main {
    private static final String FILE_FULL_PATH = Constants.WORKSPACE_PATH
            + Constants.FILE_SEPARATOR + Constants.FILE_STORAGE;
    private static final String[] FILE_NAMES = {
            "dublin_core",
            "metadata_europeana"
    };

    public static void main(String[] args) {
        printQualifiers(FILE_FULL_PATH, FILE_NAMES);
        printSchemaName(FILE_FULL_PATH, FILE_NAMES);
    }

    private static void printQualifiers(String mainPath, String[] fileNames) {
        ArrayList<String> qualifierList = Parser.getQualifierValues(mainPath, fileNames);
        for (String qualifier : qualifierList) {
            System.out.println(qualifier);
        }
    }

    private static void printSchemaName(String mainPath, String[] filesName) {
        for (String fileName : filesName) {
            String filePath = mainPath + Constants.FILE_SEPARATOR + fileName + ".xml";
            String schemaName = Parser.getSchemaName(filePath);
            System.out.println("Schema name: " + schemaName);
        }
    }
}
