package net.ui.model.table;

import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.digester.Digester;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class TableConfig implements Serializable {

	private Map<String,TableBean> tableMap = new HashMap<String,TableBean>();

	private List<TableBean> tableList = new ArrayList<TableBean>();

	public TableConfig() {
		super();
	}

	public static TableConfig init(InputStream aConfig) throws Exception {

		Digester digester = new Digester();

		digester.setValidating(false);

		digester.addObjectCreate("tableList", TableConfig.class);

		digester.addObjectCreate("tableList/table", TableBean.class);

		digester.addSetProperties("tableList/table");

		digester.addObjectCreate("tableList/table/column", ColumnBean.class);

		digester.addSetProperties("tableList/table/column");

		digester.addCallMethod("tableList/table/column/image", "addImage", 2);

		digester.addCallParam("tableList/table/column/image", 0, "value");

		digester.addCallParam("tableList/table/column/image", 1, "file");

		digester.addObjectCreate("tableList/table/column/value",
				ColumnDataBean.class);

		digester.addSetProperties("tableList/table/column/value");

		digester.addSetNext("tableList/table/column/value", "addColumnData");

		digester.addSetNext("tableList/table", "addTable");

		digester.addSetNext("tableList/table/column", "addColumn");

		TableConfig tableConfig = (TableConfig) digester.parse(aConfig);

		return tableConfig;
	}

	public void addTable(TableBean aTable) {
		aTable.setTableConfig(this);
		this.tableMap.put(aTable.getId(), aTable);
		tableList.add(aTable);
	}

	public void removeTable(TableBean aTable) {
		this.tableMap.remove(aTable.getId());
		tableList.remove(aTable);
	}

	public TableBean getTable(String aTableId) {

		return (TableBean) this.tableMap.get(aTableId);
	}

	public List<TableBean> getTableList() {
		return tableList;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("tableMap", tableMap).toString();
	}

}
