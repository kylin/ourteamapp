package net.ui;

import java.io.InputStream;
import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class UIConfigSpringFactory extends UIConfigFactory implements
		ApplicationContextAware {

	private ApplicationContext applicationContext;

	private String[] tabConfigFilePaths;

	private String[] tableConfigFilePaths;

	private String[] formConfigFilePaths;

	private String[] listConfigFilePaths;

	private String[] actionConfigFilePaths;

	private String[] iconLibFilePaths;

	public String[] getTabConfigFilePaths() {
		return tabConfigFilePaths;
	}

	public void setTabConfigFilePaths(String[] tabConfigFilePaths) {
		this.tabConfigFilePaths = tabConfigFilePaths;
	}

	public String[] getTableConfigFilePaths() {
		return tableConfigFilePaths;
	}

	public void setTableConfigFilePaths(String[] tableConfigFilePaths) {
		this.tableConfigFilePaths = tableConfigFilePaths;
	}

	public String[] getFormConfigFilePaths() {
		return formConfigFilePaths;
	}

	public void setFormConfigFilePaths(String[] formConfigFilePaths) {
		this.formConfigFilePaths = formConfigFilePaths;
	}

	public String[] getListConfigFilePaths() {
		return listConfigFilePaths;
	}

	public void setListConfigFilePaths(String[] listConfigFilePaths) {
		this.listConfigFilePaths = listConfigFilePaths;
	}

	public String[] getActionConfigFilePaths() {
		return actionConfigFilePaths;
	}

	public void setActionConfigFilePaths(String[] actionConfigFilePaths) {
		this.actionConfigFilePaths = actionConfigFilePaths;
	}

	public String[] getIconLibFilePaths() {
		return iconLibFilePaths;
	}

	public void setIconLibFilePaths(String[] iconLibFilePaths) {
		this.iconLibFilePaths = iconLibFilePaths;
	}

	@Override
	protected InputStream getConfigResource(String resourcePath)
			throws Exception {
		return this.applicationContext.getResource(resourcePath)
				.getInputStream();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;

	}

	@Override
	public String getLocalMessage(String key, Object[] args,
			String defaltMessage, Locale locale) {

		return this.applicationContext.getMessage(key, args, defaltMessage,
				locale);
	}

}
