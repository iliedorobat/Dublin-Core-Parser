package ro.webdata.dc.parser.core.wrapper.dc;

import ro.webdata.dc.parser.core.leaf.dcValue.DcValue;

import java.util.ArrayList;

public class DcWrapper {
    private ArrayList<DcValue> dcValue = new ArrayList<>();

    private DcWrapper() {}

    public DcWrapper(ArrayList<DcValue> dcValue) {
        setDcValue(dcValue);
    }

    public ArrayList<DcValue> getDcValue() {
        return dcValue;
    }

    public void setDcValue(ArrayList<DcValue> dcValue) {
        this.dcValue = dcValue;
    }
}
