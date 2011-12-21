package net.ui.model.action;

import java.io.Serializable;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class ActionBean implements Serializable {

	public static final String PUSH_TYPE = "push";

	public static final String CHECK_TYPE = "check";

	public static final String RADIO_TYPE = "radio";

	public static final String SEPARATOR_TYPE = "separator";

	private String id;

	private String ref;

	private String label;

	private String labelKey;

	private String icon;

	private String desc;

	private String descKey;

	private String type = "";

	private String style;

	private String handler;

	private String path;

	private String needComfirm;

	private String confirmInfoKey;

	private String disabled = "false";

	private String defaultFormProcessing = "true";

	private String roles;

	private String domain;

	private String supportMultiSelection = "false";

	private String subActionBeansBuilder;

	private ActionBean[] subActionBeans = new ActionBean[] {};

	private ActionPropertyBean[] properties = new ActionPropertyBean[] {};

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public ActionBean[] getSubActionBeans() {
		return subActionBeans;
	}

	public void setSubActionBeans(ActionBean[] subActionBeans) {
		this.subActionBeans = subActionBeans;
	}

	public void addSubActionBean(ActionBean aActionBean) {
		this.subActionBeans = (ActionBean[]) ArrayUtils.add(
				this.subActionBeans, aActionBean);
	}

	public ActionPropertyBean[] getProperties() {
		return properties;
	}

	public void setProperties(ActionPropertyBean[] properties) {
		this.properties = properties;
	}

	public void addPropertie(ActionPropertyBean aActionPropertyBean) {
		this.properties = (ActionPropertyBean[]) ArrayUtils.add(
				this.properties, aActionPropertyBean);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

	public String getHandler() {
		return handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public String getLabelKey() {
		return labelKey;
	}

	public void setLabelKey(String labelKey) {
		this.labelKey = labelKey;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getNeedComfirm() {
		return needComfirm;
	}

	public void setNeedComfirm(String needComfirm) {
		this.needComfirm = needComfirm;
	}

	public String getConfirmInfoKey() {
		return confirmInfoKey;
	}

	public void setConfirmInfoKey(String confirmInfoKey) {
		this.confirmInfoKey = confirmInfoKey;
	}

	public String getDefaultFormProcessing() {
		return defaultFormProcessing;
	}

	public void setDefaultFormProcessing(String defaultFormProcessing) {
		this.defaultFormProcessing = defaultFormProcessing;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSupportMultiSelection() {
		return supportMultiSelection;
	}

	public void setSupportMultiSelection(String supportMultiSelection) {
		this.supportMultiSelection = supportMultiSelection;
	}

	public String getDescKey() {
		return descKey;
	}

	public void setDescKey(String descKey) {
		this.descKey = descKey;
	}

	public String getSubActionBeansBuilder() {
		return subActionBeansBuilder;
	}

	public void setSubActionBeansBuilder(String subActionBeansBuilder) {
		this.subActionBeansBuilder = subActionBeansBuilder;
	}

}
