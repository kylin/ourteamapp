package net.ui.model.table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class TableBean implements Serializable {

	private String id;

	private String extend;

	private String desc;

	private List<ColumnBean> columnList = new ArrayList<ColumnBean>();

	private TableConfig tableConfig;

	public TableBean() {
		super();
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void addColumn(ColumnBean aColumn) {
		this.columnList.add(aColumn);
	}

	public void removeColumn(ColumnBean aColumn) {
		this.columnList.remove(aColumn);
	}

	public ColumnBean[] getColumns() {
		return (ColumnBean[]) this.columnList.toArray(new ColumnBean[0]);
	}

	public List<ColumnBean> getColumnList() {
		return this.columnList;
	}

	public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("id", id).append("desc", desc)
				.append("columnList", columnList).toString();
	}

	public TableConfig getTableConfig() {
		return tableConfig;
	}

	public void setTableConfig(TableConfig tableConfig) {
		this.tableConfig = tableConfig;
	}

}
