package net.ui.model.tab;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TabConfig implements Serializable{
    private String name;

    private String label;
    
    private String labelKey;

    private String icon;

    private String compentclass;
    
    private List<TabProperty> properties = new ArrayList<TabProperty>();
    
    private List<ConstructorParam> constructorParams = new ArrayList<ConstructorParam>();

    public TabConfig() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCompentclass() {
        return compentclass;
    }

    public void setCompentclass(String compentclass) {
        this.compentclass = compentclass;
    }

	public List<TabProperty> getProperties() {
		return properties;
	}
    
    public void addProperty(TabProperty aProp){
    	this.properties.add(aProp);
    }
    
    public void removeProperty(TabProperty aProp){
    	this.properties.remove(aProp);
    }
    
    public void addConstructorParam(ConstructorParam aParam){
    	this.constructorParams.add(aParam);
    }
    
    public void removeConstructorParam(ConstructorParam aParam){
    	this.constructorParams.remove(aParam);
    }
    
    public List<ConstructorParam> getConstructorParams() {
		return constructorParams;
	}

	public TabProperty getProperty(String aId){
    	TabProperty prop = null;
    	for (Iterator<TabProperty> iter = this.properties.iterator(); iter.hasNext();) {
			TabProperty tempProperty = iter.next();
			if(tempProperty.getId().equals(aId)){
				prop = tempProperty;
				break;
			}
		}
    	
    	return prop;
    }

	public String getLabelKey() {
		return labelKey;
	}

	public void setLabelKey(String labelKey) {
		this.labelKey = labelKey;
	}

}