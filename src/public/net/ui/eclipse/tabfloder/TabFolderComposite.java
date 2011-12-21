package net.ui.eclipse.tabfloder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.ui.eclipse.ImageChache;
import net.ui.model.tab.ConstructorParam;
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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class TabFolderComposite extends Composite implements SelectionListener {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(TabFolderComposite.class);

	private TabFolder tabFolder = null;

	private TabbedPaneConfig config;

	private List editorList = new ArrayList();

	private int style = SWT.TOP | SWT.FLAT;

	public TabFolderComposite(Composite parent, TabbedPaneConfig aTabConfig) {
		super(parent, SWT.NONE);
		config = aTabConfig;
		initialize();
	}

	public TabFolderComposite(Composite parent, TabbedPaneConfig aTabConfig,
			int style) {
		super(parent, SWT.NONE);
		this.style = style;
		config = aTabConfig;
		initialize();
	}

	private void initialize() {
		FillLayout fillLayout1 = new FillLayout();
		createTabFolder();
		this.setLayout(fillLayout1);
		fillLayout1.marginHeight = 2;
		setSize(new org.eclipse.swt.graphics.Point(300, 200));
	}

	protected void setTabFolderStyle(TabFolder aCTabFolder) {

	}

	private void createTabFolder() {

		tabFolder = new TabFolder(this, this.style);

		setTabFolderStyle(tabFolder);

		tabFolder.addSelectionListener(this);

		List tabList = config.getTabPageList();

		try {
			for (Iterator iter = tabList.iterator(); iter.hasNext();) {

				TabConfig element = (TabConfig) iter.next();
				TabItem item = new TabItem(tabFolder, SWT.NONE);
				Image image = ImageChache.getImage(element.getIcon());
				if (image != null) {
					item.setImage(image);
				}
				if (element.getLabel() != null) {
					item.setText(element.getLabel());
				}

				String panelClass = element.getCompentclass();
				Control panel = null;
				if (StringUtils.isNotBlank(panelClass)) {

					List paramLsit = element.getConstructorParams();

					if (paramLsit.size() > 0) {
						Class[] paramClass = new Class[paramLsit.size() + 1];
						Object[] paramValue = new Object[paramLsit.size() + 1];
						paramClass[0] = Composite.class;
						paramValue[0] = this.tabFolder;
						int index = 1;
						for (Iterator iterator = paramLsit.iterator(); iterator
								.hasNext();) {
							ConstructorParam param = (ConstructorParam) iterator
									.next();
							paramClass[index] = param.getParamClass();
							paramValue[index] = param.getParamValue();
							index++;
						}
						panel = (Control) ConstructorUtils
								.getAccessibleConstructor(
										Class.forName(panelClass), paramClass)
								.newInstance(paramValue);
					}

					panel = (Control) ConstructorUtils.invokeConstructor(
							Class.forName(panelClass), this.tabFolder);
				} else {
					panel = createDynamicForm(item, element);
				}

				if (panel != null) {
					setTabProperties(panel, element.getProperties());
					item.setControl(panel);
					editorList.add(panel);
				}

			}

			this.tabFolder.setSelection(0);

		} catch (Exception ex) {
			MessageDialog.openError(this.getShell(), "�����༭�����쳣",
					ex.toString());
			logger.error("�����༭�����쳣", ex);
		}
	}

	protected Control createDynamicForm(TabItem aTabItem, TabConfig aTabConfig) {
		return null;
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

	public TabFolder getTabFolder() {
		return tabFolder;
	}

	public void widgetSelected(SelectionEvent e) {
		logger.debug("showList" + this.tabFolder.getSelectionIndex());

	}

	public void widgetDefaultSelected(SelectionEvent e) {
		
	}

}
