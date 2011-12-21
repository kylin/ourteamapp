package com.ourteam.system.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class MessageResource implements Serializable {

	private long id;

	private String catalog;

	private String messageKey;

	private Map messageResourceMap = new HashMap();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public Map getMessageResourceMap() {
		return messageResourceMap;
	}

	public void setMessageResourceMap(Map messageResourceMap) {
		this.messageResourceMap = messageResourceMap;
	}

	public String getMessageResource(String aLocalCode) {
		return (String) messageResourceMap.get(aLocalCode);
	}

	public void addMessageResource(String aLocalCode, String aValue) {
		if (this.messageResourceMap == null) {
			this.messageResourceMap = new HashMap();
		}
		this.messageResourceMap.put(aLocalCode, aValue);
	}
}
