package net.dao;

import java.util.Collection;

public class SQLBean {

	private String sql;

	private Object[] parameters;

	public SQLBean(String sql, Object[] parameters) {
		super();
		this.sql = sql;
		if (parameters != null) {
			this.parameters = parameters;
		} else {
			this.parameters = new Object[0];
		}
	}

	public SQLBean(String sql, Collection parameters) {
		super();
		this.sql = sql;
		if (parameters != null) {
			this.parameters = parameters.toArray(new Object[parameters.size()]);
		} else {
			this.parameters = new Object[0];
		}
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public Object[] getParameters() {
		return parameters;
	}

	public void setParameters(Object[] parameters) {
		this.parameters = parameters;
	}

}
