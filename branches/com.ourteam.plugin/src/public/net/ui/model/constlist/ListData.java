package net.ui.model.constlist;

import java.io.Serializable;

public class ListData implements Serializable{

    private String label;

    private Object data;

    public ListData() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setListData(Object aData, String aLabel) {
        this.data = aData;
        this.label = aLabel;
    }

    /**
     * Returns a string representation of the object.
     * 
     * @return a string representation of the object.
     * @todo Implement this java.lang.Object method
     */
    public String toString() {
        return this.label;
    }

}