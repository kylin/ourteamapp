package net.ui.eclipse.tabfloder;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.ImageChache;
import net.ui.eclipse.LocalHelper;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.model.form.FormBean;
import net.ui.model.tab.TabConfig;
import net.ui.model.tab.TabProperty;
import net.ui.model.tab.TabbedPaneConfig;

import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class TabbedComposite extends Composite implements SelectionListener {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(TabbedComposite.class);

	private CTabFolder tabFolder = null;

	private TabbedPaneConfig config;

	private List<Control> editorList = new ArrayList<Control>();

	private ITabbedCompositeInitHelper tabbedCompositeInitHelper;

	public TabbedComposite(Composite parent, TabbedPaneConfig aTabConfig,
			ITabbedCompositeInitHelper initHelper) {
		super(parent, SWT.NONE);
		config = aTabConfig;
		if (this.tabbedCompositeInitHelper != null) {
			this.tabbedCompositeInitHelper = initHelper;
			this.tabbedCompositeInitHelper.onConstructor(this);
		}
		initialize();
	}

	public TabbedComposite(Composite parent, TabbedPaneConfig aTabConfig) {
		this(parent, aTabConfig, null);
	}

	private void initialize() {
		FillLayout fillLayout = new FillLayout();
		createTabFolder();
		this.setLayout(fillLayout);
		fillLayout.marginHeight = 2;
	}

	protected void setCTabFolderStyle(CTabFolder aCTabFolder) {
		// tabFolder.set (false);
	}

	protected int getTabFolderStyle() {
		return SWT.TOP | SWT.BORDER | SWT.FLAT;
	}

	protected Control constructTabPanel(Class<?> panelClass,
			CTabFolder tabFolder) throws Exception {

		boolean needStyle = false;

		Constructor constructor = ConstructorUtils.getAccessibleConstructor(
				panelClass, new Class[] { Composite.class });

		if (constructor == null) {
			constructor = ConstructorUtils.getAccessibleConstructor(panelClass,
					new Class[] { Composite.class, int.class });

			needStyle = true;
		}

		Object[] params = null;

		if (needStyle) {
			params = new Object[] { tabFolder, SWT.NONE };
		} else {
			params = new Object[] { tabFolder };
		}

		Control panel = (Control) ConstructorUtils.invokeConstructor(
				panelClass, params);

		return panel;
	}

	private void createTabFolder() {

		tabFolder = new CTabFolder(this, getTabFolderStyle());

		setCTabFolderStyle(tabFolder);

		tabFolder.addSelectionListener(this);

		List tabList = config.getTabPageList();

		try {
			for (Iterator iter = tabList.iterator(); iter.hasNext();) {

				TabConfig element = (TabConfig) iter.next();

				CTabItem item = new CTabItem(tabFolder, SWT.NONE);

				item.setData("TAB_CONFIG", element);

				if (StringUtils.isNotBlank(element.getIcon())) {
					Image image = ImageChache.getImage(element.getIcon());
					if (image != null) {
						item.setImage(image);
					}
				}

				if (element.getLabel() != null) {

					Object[] parameters = null;

					if (this.tabbedCompositeInitHelper != null) {
						parameters = this.tabbedCompositeInitHelper
								.getTabLabelParameters(element);
					}

					item.setText(UIConfigFactory.getInstance().getLocalMessage(
							element.getLabelKey(), parameters,
							element.getLabel(), LocalHelper.getLocale()));
				}

				String panelClass = element.getCompentclass();

				Control panel = null;
				if (StringUtils.isNotBlank(panelClass)) {

					Class pageClazz = Class.forName(panelClass);

					panel = constructTabPanel(pageClazz, this.tabFolder);

				} else {
					panel = createDynamicForm(item, element);
				}

				if (panel != null) {
					setTabProperties(panel, element.getProperties());
					initTabPanel(panel);
					item.setControl(panel);
					editorList.add(panel);
				}

			}

			this.tabFolder.setSelection(0);

		} catch (Exception ex) {
			MessageDialog.openError(this.getShell(), "createTabFolder error",
					ex.toString());
			logger.error("createTabFolder error", ex);
		}
	}

	protected Control createDynamicForm(CTabItem aTabItem, TabConfig aTabConfig) {
		TabProperty formId = aTabConfig.getProperty("formId");

		if (formId != null && StringUtils.isNotBlank(formId.getValue())) {
			FormBean formBean = UIConfigFactory.getInstance().getFormConfig(
					formId.getValue());

			GridFormComposite gridFormComposite = new GridFormComposite(
					this.tabFolder, formBean) {

				@Override
				protected void initFormOptionListDataProviders(
						Map listDataProiverMap) {
					super.initFormOptionListDataProviders(listDataProiverMap);
					doInitFormOptionListDataProviders(listDataProiverMap);
				}

			};

			return gridFormComposite;
		} else {
			return null;
		}

	}

	protected void doInitFormOptionListDataProviders(
			Map<String, IFormOptionListDataProvider> listDataProiverMap) {

	}

	protected void initTabPanel(Control aPanel) throws Exception {

	}

	protected void setTabProperties(Control aPanel, List aTabProperties)
			throws Exception {
		for (Iterator iter = aTabProperties.iterator(); iter.hasNext();) {
			TabProperty property = (TabProperty) iter.next();

			if (PropertyUtils.isWriteable(aPanel, property.getId())
					&& property.getValue() != null) {
				Class dataType = PropertyUtils.getPropertyType(aPanel,
						property.getId());
				Object value = ConvertUtils.convert(property.getValue(),
						dataType);
				PropertyUtils.setProperty(aPanel, property.getId(), value);
			}

		}
	}

	public List getEditorList() {
		return this.editorList;
	}

	public CTabFolder getTabFolder() {
		return tabFolder;
	}

	public void widgetSelected(SelectionEvent e) {
		
	}

	public void widgetDefaultSelected(SelectionEvent e) {

	}

}
