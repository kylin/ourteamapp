package com.ourteam.app.utils;

import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.service.SpringContextAgent;
import net.ui.model.action.ActionSetBean;
import net.ui.model.constlist.ListDataContainer;
import net.ui.model.form.FormSetConfig;
import net.ui.model.tab.TabbedConfig;
import net.ui.model.table.TableConfig;
import net.ui.model.tree.TreeBean;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.ui.velocity.VelocityEngineUtils;

public class UIConfigUtils {

	private static final VelocityEngine VELOCITY_ENGINE = SpringContextAgent
			.getBean(VelocityEngine.class);

	public static void saveUIActionConfig(ActionSetBean actionSetBean,
			Writer fileWriter) throws Exception {
		Map<String, Object> templateContext = new HashMap<String, Object>();

		templateContext.put("actionSet", actionSetBean);

		VelocityEngineUtils.mergeTemplate(VELOCITY_ENGINE, "ui_action_config",
				templateContext, fileWriter);
	}

	public static void saveUISelectListConfig(
			Collection<ListDataContainer> listDataContainers, Writer fileWriter)
			throws Exception {
		Map<String, Object> templateContext = new HashMap<String, Object>();

		templateContext.put("listDataContainers", listDataContainers);

		VelocityEngineUtils.mergeTemplate(VELOCITY_ENGINE, "ui_list_config",
				templateContext, fileWriter);
	}

	public static void saveUIFromConfig(FormSetConfig formSetConfig,
			Writer fileWriter) throws Exception {
		Map<String, Object> templateContext = new HashMap<String, Object>();

		templateContext.put("formSetConfig", formSetConfig);

		VelocityEngineUtils.mergeTemplate(VELOCITY_ENGINE, "ui_form_config",
				templateContext, fileWriter);
	}

	public static void saveUITableConfig(TableConfig tableConfig,
			Writer fileWriter) throws Exception {
		Map<String, Object> templateContext = new HashMap<String, Object>();

		templateContext.put("tableSetConfig", tableConfig);

		VelocityEngineUtils.mergeTemplate(VELOCITY_ENGINE, "ui_table_config",
				templateContext, fileWriter);
	}
	
	public static void saveUITabConfig(TabbedConfig tabbedConfig,
			Writer fileWriter) throws Exception {
		Map<String, Object> templateContext = new HashMap<String, Object>();

		templateContext.put("tabbedSetConfig", tabbedConfig);

		VelocityEngineUtils.mergeTemplate(VELOCITY_ENGINE, "ui_tab_config",
				templateContext, fileWriter);
	}
	
	public static void saveUITreeConfig(TreeBean treeBean,Writer fileWriter){
		Map<String, Object> templateContext = new HashMap<String, Object>();

		templateContext.put("treeConfig", treeBean);

		VelocityEngineUtils.mergeTemplate(VELOCITY_ENGINE, "ui_tree_config",
				templateContext, fileWriter);
	}
}
