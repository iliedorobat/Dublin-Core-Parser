package ro.webdata.parser.xml.dc;

import ro.webdata.parser.xml.dc.common.Constants;
import ro.webdata.parser.xml.dc.core.Parser;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    private static final String FILE_FULL_PATH = Constants.WORKSPACE_PATH
            + Constants.FILE_SEPARATOR + Constants.FILE_STORAGE;
    private static final String[] FILE_NAMES = {
            "dublin_core",
            "metadata_europeana"
    };

    public static void main(String[] args) {
        printQualifiers(FILE_FULL_PATH, FILE_NAMES);
    }

    private static void printQualifiers(String mainPath, String[] fileNames) {
        ArrayList<String> qualifierList = Parser.getQualifierValues(mainPath, fileNames);
        for (String qualifier : qualifierList) {
            System.out.println(qualifier);
        }
    }
}
