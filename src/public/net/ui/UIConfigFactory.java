package net.ui;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Locale;

import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;
import net.ui.model.action.ActionSetBean;
import net.ui.model.action.ActionSetConfigBean;
import net.ui.model.constlist.ListData;
import net.ui.model.constlist.ListDataContainer;
import net.ui.model.constlist.ListDataFactory;
import net.ui.model.form.FormBean;
import net.ui.model.form.FormSetConfig;
import net.ui.model.tab.TabbedConfig;
import net.ui.model.tab.TabbedPaneConfig;
import net.ui.model.table.TableBean;
import net.ui.model.table.TableConfig;
import net.ui.model.tree.TreeBean;
import net.ui.model.tree.TreeConfigAgent;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class UIConfigFactory {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(UIConfigFactory.class);

	private TabbedConfig tabConfig = null;

	private TableConfig[] tableConfigs = null;

	private FormSetConfig formSetConfig = null;

	private ActionSetBean actionSet = null;

	private ListDataFactory listDataFactory = null;

	private Configuration iconLib = null;

	private static UIConfigFactory instance;

	public UIConfigFactory() {
		super();
		instance = this;
	}

	public static UIConfigFactory getInstance() {
		return instance;
	}

	public TabbedPaneConfig getTabConfig(String tabId) {
		return this.tabConfig.getTabbedPaneConfig(tabId);
	}

	public TableBean getTableConfig(String tableId) {

		TableBean tableBean = null;

		for (int i = 0; i < this.tableConfigs.length; i++) {
			TableConfig tableConfig = this.tableConfigs[i];
			tableBean = tableConfig.getTable(tableId);
			if (tableBean != null) {
				break;
			}
		}

		return tableBean;
	}

	public FormBean getFormConfig(String formId) {
		FormBean formBean = this.formSetConfig.getForm(formId);

		if (formBean != null) {
			formBean.setFormModel(FormBean.EDIT_MODEL);
		}

		return formBean;
	}

	public ListDataContainer getListDataConfig(String aId) {
		return this.listDataFactory.getListDataContainer(aId);
	}

	public ListData[] getListDatas(String aId) {
		return this.listDataFactory.getList(aId);
	}

	public String getIconConfig(String iconKey) {
		return this.iconLib.getString(iconKey);
	}

	public String getLocalMessage(String key, Locale locale) {
		return getLocalMessage(key, null, null, locale);
	}

	public String getLocalMessage(String key, String defaltMessage,
			Locale locale) {
		return getLocalMessage(key, null, defaltMessage, locale);
	}

	public String getLocalMessage(String key, Object[] args, Locale locale) {
		return getLocalMessage(key, args, null, locale);
	}

	public TreeBean getTreeConfig(String aId) {
		try {
			return TreeConfigAgent.getTreeConfig(getConfigResource(aId));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public ActionGroupBean getActionGroupConfig(String actionGroupId) {

		return actionSet.getActiongroupBean(actionGroupId);
	}

	public ActionBean getActionBean(String actionBeanId) {
		return actionSet.getActionBean(actionBeanId);
	}

	public void initConfig() throws Exception {

		initUITabConfig();

		initUIListConfig();

		initUITableConfig();

		initUIFormConfig();

		initUIActionConfig();

		initUIIconLib();

	}

	protected void initUITabConfig() throws Exception {

		String[] files = getTabConfigFilePaths();

		tabConfig = new TabbedConfig();

		for (int i = 0; i < files.length; i++) {

			tabConfig.getTabbedPaneList().addAll(
					TabbedConfig.parse(getConfigResource(files[i]))
							.getTabbedPaneList());
		}

		logger.info("Init Tab Config Success");
	}

	protected void initUIListConfig() throws Exception {

		String[] files = getListConfigFilePaths();

		this.listDataFactory = new ListDataFactory();

		for (int i = 0; i < files.length; i++) {
			ListDataFactory tmpDataFactory = new ListDataFactory();
			tmpDataFactory.initListData(getConfigResource(files[i]));
			this.listDataFactory.getListMap().putAll(
					tmpDataFactory.getListMap());
		}

		logger.info("Init List Config Success");
	}

	protected void initUITableConfig() throws Exception {

		String[] files = getTableConfigFilePaths();

		tableConfigs = new TableConfig[files.length];

		for (int i = 0; i < files.length; i++) {
			tableConfigs[i] = TableConfig.init(getConfigResource(files[i]));
		}

		logger.info("Init Table Config Success");
	}

	protected void initUIFormConfig() throws Exception {

		String[] files = getFormConfigFilePaths();

		formSetConfig = new FormSetConfig();

		for (int i = 0; i < files.length; i++) {
			formSetConfig.getFormList().addAll(
					FormSetConfig.init(getConfigResource(files[i]))
							.getFormList());
		}

		logger.info("Init Form Config Success");
	}

	protected void initUIActionConfig() throws Exception {

		String[] files = getActionConfigFilePaths();

		this.actionSet = new ActionSetBean();

		for (int i = 0; i < files.length; i++) {

			ActionSetConfigBean actionSetConfigBean = new ActionSetConfigBean();

			actionSetConfigBean.init(getConfigResource(files[i]), true);

			ActionBean[] actionBeans = actionSetConfigBean.getActionSet()
					.getActions();

			for (int j = 0; j < actionBeans.length; j++) {
				ActionBean actionBean = actionBeans[j];
				this.actionSet.addAction(actionBean);
			}

			ActionGroupBean[] actionGroupBeans = actionSetConfigBean
					.getActionSet().getActionGroups();

			for (int j = 0; j < actionGroupBeans.length; j++) {
				ActionGroupBean actionGroupBean = actionGroupBeans[j];
				this.actionSet.addActionGroup(actionGroupBean);
			}

		}

		ActionSetConfigBean.reBuildActions(actionSet, actionSet.getActions());

		for (int i = 0; i < actionSet.getActionGroups().length; i++) {
			ActionSetConfigBean.reBuildActions(actionSet,
					actionSet.getActionGroups()[i].getActionBeans());
		}

		logger.info("Init Action Config Success");
	}

	protected void initUIIconLib() throws Exception {

		String[] files = getIconLibFilePaths();

		iconLib = new PropertiesConfiguration();

		for (int i = 0; i < files.length; i++) {
			PropertiesConfiguration configuration = new PropertiesConfiguration();

			configuration.setEncoding("UTF-8");

			configuration.load(getConfigResource(files[i]));

			for (Iterator<String> iterator = configuration.getKeys(); iterator
					.hasNext();) {
				String key = iterator.next();
				iconLib.addProperty(key, configuration.getProperty(key));
			}

		}

		logger.info("Init Icon Lib Success");
	}

	abstract public String[] getTabConfigFilePaths();

	abstract public String[] getTableConfigFilePaths();

	abstract public String[] getFormConfigFilePaths();

	abstract public String[] getListConfigFilePaths();

	abstract public String[] getActionConfigFilePaths();

	abstract public String[] getIconLibFilePaths();

	abstract protected InputStream getConfigResource(String resourcePath)
			throws Exception;

	abstract public String getLocalMessage(String key, Object[] args,
			String defaltMessage, Locale locale);

}
