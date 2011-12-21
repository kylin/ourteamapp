package net.ui.model.table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ColumnBean implements Serializable {
	
	public static final String ALIGN_LEFT = "0";
	
	public static final String ALIGN_RIGHT = "1";
	
	public static final String ALIGN_CENTER = "2";

	private String property;

	private String label;

	private String labelKey;

	private String align;

	private String width = "100";

	private Boolean editable = Boolean.TRUE;

	private String cellEditor;

	private String validator;

	private Boolean showValue = Boolean.TRUE;

	private String dataType = "java.lang.String";

	private Map<String, String> imageMap = new HashMap<String, String>();

	private List<ColumnImageBean> imageList = new ArrayList<ColumnImageBean>();

	private List<ColumnDataBean> columnDataLsit = new ArrayList<ColumnDataBean>();

	private String listDataSource;

	private boolean canSort;

	private boolean canReOrder = true;

	private boolean canFilter = true;
	
	private boolean canResize = true;
	
	private String icon;

	public ColumnBean() {
		super();
	}

	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getCellEditor() {
		return cellEditor;
	}

	public void setCellEditor(String cellEditor) {
		this.cellEditor = cellEditor;
	}

	public Boolean getEditable() {
		return editable;
	}

	public void setEditable(Boolean editable) {
		this.editable = editable;
	}

	public Boolean getShowValue() {
		return showValue;
	}

	public void setShowValue(Boolean showValue) {
		this.showValue = showValue;
	}

	public void addImage(String aValue, String aFile) {
		ColumnImageBean image = new ColumnImageBean();
		image.setPattern(aValue);
		image.setImage(aFile);
		this.addColumnImage(image);
		this.imageMap.put(aValue, aFile);
	}

	public Set<String> getImageKeyIndex() {
		return this.imageMap.keySet();
	}

	public String getImage(String aValue) {
		String file = (String) this.imageMap.get(aValue);

		if (StringUtils.isEmpty(file)) {
			file = (String) this.imageMap.get("*");
		}

		return file;
	}

	public String getValidator() {
		return validator;
	}

	public void setValidator(String validator) {
		this.validator = validator;
	}

	public void addColumnData(ColumnDataBean aData) {
		this.columnDataLsit.add(aData);
	}

	public void removeColumnData(ColumnDataBean aData) {
		this.columnDataLsit.remove(aData);
	}

	public List<ColumnDataBean> getColumnDataList() {
		return this.columnDataLsit;
	}

	public void addColumnImage(ColumnImageBean aImage) {
		this.imageList.add(aImage);
	}

	public void removeColumnImage(ColumnImageBean aImage) {
		this.imageList.remove(aImage);
	}

	public List<ColumnImageBean> getImageList() {
		return imageList;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public boolean isCanSort() {
		return canSort;
	}

	public void setCanSort(boolean canSort) {
		this.canSort = canSort;
	}

	public String getListDataSource() {
		return listDataSource;
	}

	public void setListDataSource(String listDataSource) {
		this.listDataSource = listDataSource;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this).append("property", property)
				.append("label", label).append("align", align)
				.append("width", width).append("editable", editable)
				.append("cellEditor", cellEditor)
				.append("validator", validator).append("showValue", showValue)
				.toString();
	}

	public String getLabelKey() {
		return labelKey;
	}

	public void setLabelKey(String labelKey) {
		this.labelKey = labelKey;
	}

	public boolean isCanReOrder() {
		return canReOrder;
	}

	public void setCanReOrder(boolean canReOrder) {
		this.canReOrder = canReOrder;
	}

	public boolean isCanFilter() {
		return canFilter;
	}

	public void setCanFilter(boolean canFilter) {
		this.canFilter = canFilter;
	}

	public boolean isCanResize() {
		return canResize;
	}

	public void setCanResize(boolean canReSize) {
		this.canResize = canReSize;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
