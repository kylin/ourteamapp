package com.ourteam.system.domain;

import com.ourteam.system.dao.SysResourceTypeIdEnum;

public class SystemFunction extends AbstractSystemResourceObject {

	private String icon;

	private String path;

	private String handler;
	

	private SystemFunction parentFunction;

	public SystemFunction() {
		super();
	}

	public SystemFunction(SystemResource aResource) {
		super(aResource);
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getHandler() {
		return handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

	/**
	 * @return the parentFunction
	 */
	public SystemFunction getParentFunction() {
		return parentFunction;
	}

	/**
	 * @param parentFunction
	 *            the parentFunction to set
	 */
	public void setParentFunction(SystemFunction parentFunction) {
		this.parentFunction = parentFunction;
	}

	protected SysResourceTypeIdEnum getSysResourceTypeIdEnum() {
		return SysResourceTypeIdEnum.SYS_FUNCTION;
	}

}
