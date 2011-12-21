package net.ui.eclipse.widget;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.model.form.FormBean;
import net.ui.model.tab.TabConfig;
import net.ui.model.tab.TabProperty;
import net.ui.model.tab.TabbedPaneConfig;

import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;

abstract public class AbstractMultiPanelGroupComposite extends
		AbstractComposite {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractMultiPanelGroupComposite.class);

	public AbstractMultiPanelGroupComposite(Composite parent, int style) {
		super(parent, style);
	}

	abstract protected String getTabbedPaneConfigId();

	protected int getPanelGroupStyle() {
		return SWT.NONE;
	}

	protected Object getLayoutData(TabConfig tabConfig) {
		return new GridData(GridData.FILL_BOTH);
	}

	@Override
	protected void createContent(Composite parent) {

		try {

			TabbedPaneConfig tabbedPaneConfig = UIConfigFactory
					.getInstance().getTabConfig(getTabbedPaneConfigId());

			parent.setLayout(new GridLayout());

			List<TabConfig> tabConfigList = tabbedPaneConfig.getTabPageList();

			for (Iterator<TabConfig> iterator = tabConfigList.iterator(); iterator
					.hasNext();) {
				TabConfig tabConfig = (TabConfig) iterator.next();

				Group groupPanel = new Group(parent, getPanelGroupStyle());

				if (StringUtils.isNotBlank(tabConfig.getLabel())) {
					groupPanel.setText(tabConfig.getLabel());
				}

				groupPanel.setLayoutData(getLayoutData(tabConfig));

				groupPanel.setLayout(new FillLayout());

				boolean needStyle = false;

				String panelClass = tabConfig.getCompentclass();

				Control panel = null;
				if (StringUtils.isNotBlank(panelClass)) {

					Class pageClazz = Class.forName(panelClass);

					Constructor constructor = ConstructorUtils
							.getAccessibleConstructor(pageClazz,
									new Class[] { Composite.class });

					if (constructor == null) {
						constructor = ConstructorUtils
								.getAccessibleConstructor(pageClazz,
										new Class[] { Composite.class,
												int.class });

						needStyle = true;
					}

					Object[] params = null;

					if (needStyle) {
						params = new Object[] { groupPanel, SWT.NONE };
					} else {
						params = new Object[] { groupPanel };
					}

					panel = (Control) ConstructorUtils.invokeConstructor(
							pageClazz, params);

				} else {
					panel = createDynamicForm(groupPanel, tabConfig);
				}

				if (panel != null) {
					initContentPanel(panel);
				}

			}

		} catch (Exception e) {
			logger.error("createContent Error", e);
			throw new RuntimeException(e);
		}

	}

	protected Control createDynamicForm(Composite composite,
			TabConfig aTabConfig) {
		TabProperty formId = aTabConfig.getProperty("formId");

		if (formId != null && StringUtils.isNotBlank(formId.getValue())) {
			FormBean formBean = UIConfigFactory.getInstance()
					.getFormConfig(formId.getValue());

			return new GridFormComposite(composite, formBean);
		} else {
			return null;
		}

	}

	protected void initContentPanel(Control aPanel) throws Exception {

	}

}
