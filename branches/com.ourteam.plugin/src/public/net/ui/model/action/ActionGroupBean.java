package net.ui.model.action;

import java.io.Serializable;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class ActionGroupBean implements Serializable {

	private String id;

	private String desc;

	private ActionBean[] actionBeans = new ActionBean[] {};

	private ActionGroupBean[] actionGroupBeans = new ActionGroupBean[] {};

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ActionBean[] getActionBeans() {
		return actionBeans;
	}

	public ActionGroupBean[] getActionGroupBeans() {
		return actionGroupBeans;
	}

	public void setActionBeans(ActionBean[] actionBeans) {
		this.actionBeans = actionBeans;
	}

	public void addActionBean(ActionBean aActionBean) {
		this.actionBeans = (ActionBean[]) ArrayUtils.add(this.actionBeans,
				aActionBean);
	}

	public void setActionGroupBeans(ActionGroupBean[] actionGroupBeans) {
		this.actionGroupBeans = actionGroupBeans;
	}

	public void addActionGroupBean(ActionBean actionGroupBean) {
		this.actionGroupBeans = (ActionGroupBean[]) ArrayUtils.add(
				this.actionGroupBeans, actionGroupBean);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
