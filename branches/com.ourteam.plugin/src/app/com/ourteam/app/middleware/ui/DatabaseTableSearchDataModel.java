package com.ourteam.app.middleware.ui;

import net.ui.eclipse.widget.SearchDataModel;

public class DatabaseTableSearchDataModel extends SearchDataModel {

	private long databaseServerId;
	
	private String tableName;
	
	private String databaseName;

	

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public long getDatabaseServerId() {
		return databaseServerId;
	}

	public void setDatabaseServerId(long databaseServerId) {
		this.databaseServerId = databaseServerId;
	}

	
	
}
