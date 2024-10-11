package ro.webdata.parser.xml.dspace.core.wrapper.dc;

import ro.webdata.parser.xml.dspace.core.leaf.dcValue.DcValue;

import java.util.ArrayList;
import java.util.HashMap;

public class DcWrapper {
    private String schemaName = null;
    private HashMap<String, ArrayList<DcValue>> dcValueMap = new HashMap<>();

    private DcWrapper() {}

    public DcWrapper(HashMap<String, ArrayList<DcValue>> dcValueMap, String schemaName) {
        setDcValueMap(dcValueMap);
        setSchemaName(schemaName);
    }

    public HashMap<String, ArrayList<DcValue>> getDcValueMap() {
        return dcValueMap;
    }

    public void setDcValueMap(HashMap<String, ArrayList<DcValue>> dcValueMap) {
        this.dcValueMap = dcValueMap;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }
}
