package net.ui.model.action;

import java.io.File;
import java.io.InputStream;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.betwixt.io.BeanReader;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ActionSetConfigBean {
	
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(ActionSetConfigBean.class);
		

	private ActionSetBean actionSet;

	private String actionConfigFile;

	public void setActionConfigFile(String actionConfigFile) {
		this.actionConfigFile = actionConfigFile;
	}

	public ActionSetBean getActionSet() {
		return actionSet;
	}

	public ActionBean getActionBean(String aId) {
		return this.actionSet.getActionBean(aId);
	}

	public ActionGroupBean getActionGroupBean(String aId) {
		return this.actionSet.getActiongroupBean(aId);
	}

	public static void reBuildActions(ActionSetBean actionSet, ActionBean[] aActionBeans) throws Exception {
		for (int i = 0; i < aActionBeans.length; i++) {
			String ref = aActionBeans[i].getRef();
			if (StringUtils.isNotBlank(ref)) {
				ActionBean action = actionSet.getActionBean(ref);
				if (action != null) {
					String domain = aActionBeans[i].getDomain();
					String path = aActionBeans[i].getPath();
					String handler = aActionBeans[i].getHandler();
					String type = aActionBeans[i].getType();
					String disabled = aActionBeans[i].getDisabled();
					String label = aActionBeans[i].getLabel();
					String labelKey = aActionBeans[i].getLabelKey();
					String icon = aActionBeans[i].getIcon();
					String confirmInfoKey = aActionBeans[i].getConfirmInfoKey();
					String supportMultiSelection = aActionBeans[i]
							.getSupportMultiSelection();

					PropertyUtils.copyProperties(aActionBeans[i], action);

					aActionBeans[i].setRef(ref);

					if (StringUtils.isNotBlank(path)) {
						aActionBeans[i].setPath(path);
					}

					if (StringUtils.isNotBlank(handler)) {
						aActionBeans[i].setHandler(handler);
					}

					if (StringUtils.isNotBlank(type)) {
						aActionBeans[i].setType(type);
					}

					if (StringUtils.isNotBlank(label)) {
						aActionBeans[i].setLabel(label);
					}

					if (StringUtils.isNotBlank(labelKey)) {
						aActionBeans[i].setLabelKey(labelKey);
					}

					if (StringUtils.isNotBlank(icon)) {
						aActionBeans[i].setIcon(icon);
					}

					if (StringUtils.isNotBlank(confirmInfoKey)) {
						aActionBeans[i].setConfirmInfoKey(confirmInfoKey);
					}

					if (StringUtils.isNotBlank(supportMultiSelection)) {
						aActionBeans[i]
								.setSupportMultiSelection(supportMultiSelection);
					}

					if (StringUtils.isNotBlank(domain)) {
						aActionBeans[i].setDomain(domain);
					}

					if (StringUtils.isNotBlank(disabled)) {
						aActionBeans[i].setDisabled(disabled);
					} else {
						aActionBeans[i].setDisabled("");
					}

				} else {
					logger.warn("can not find action by ref : "
							+ aActionBeans[i].getRef());
				}
			}
			if (aActionBeans[i].getSubActionBeans() != null
					&& aActionBeans[i].getSubActionBeans().length > 0) {
				reBuildActions(actionSet,aActionBeans[i].getSubActionBeans());
			}
		}
	}
	
	public void init(InputStream aConfigStream) throws Exception {
		init(aConfigStream,false);
	}

	public void init(InputStream aConfigStream, boolean onlyParse) throws Exception {
		try {

			BeanReader reader = new BeanReader();
			reader.registerBeanClass(ActionSetBean.class);
			reader.getXMLIntrospector().getConfiguration()
					.setAttributesForPrimitives(true);

			actionSet = (ActionSetBean) reader.parse(aConfigStream);

			if (onlyParse == false) {

				reBuildActions(actionSet,actionSet.getActions());

				for (int i = 0; i < actionSet.getActionGroups().length; i++) {
					reBuildActions(actionSet,actionSet.getActionGroups()[i]
							.getActionBeans());
				}
			}

		} catch (Exception e) {
			logger.error("Action Init Error", e);
			throw e;
		}
	}

	protected void doInit(File configFile) throws Exception {
		try {

			BeanReader reader = new BeanReader();
			reader.registerBeanClass(ActionSetBean.class);
			reader.getXMLIntrospector().getConfiguration()
					.setAttributesForPrimitives(true);

			actionSet = (ActionSetBean) reader.parse(configFile);

			reBuildActions(actionSet,actionSet.getActions());

			for (int i = 0; i < actionSet.getActionGroups().length; i++) {
				reBuildActions(actionSet,actionSet.getActionGroups()[i].getActionBeans());
			}

			logger.info("Action Init Complete");

		} catch (Exception e) {
			logger.error("Action Init Error", e);
			throw e;
		}

	}

	public String getConfigFileName() throws Exception {
		return actionConfigFile;
	}
}
