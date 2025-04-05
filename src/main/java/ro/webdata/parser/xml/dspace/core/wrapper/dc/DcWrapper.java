package ro.webdata.parser.xml.dspace.core.wrapper.dc;

import ro.webdata.parser.xml.dspace.core.leaf.dcValue.DcValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DcWrapper {
    private String schemaName = null;
    private Map<String, List<DcValue>> dcValueMap = new HashMap<>();

    private DcWrapper() {}

    public DcWrapper(Map<String, List<DcValue>> dcValueMap, String schemaName) {
        setDcValueMap(dcValueMap);
        setSchemaName(schemaName);
    }

    public Map<String, List<DcValue>> getDcValueMap() {
        return dcValueMap;
    }

    public void setDcValueMap(Map<String, List<DcValue>> dcValueMap) {
        this.dcValueMap = dcValueMap;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }
}
