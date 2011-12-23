package com.ourteam.plugin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.tree.AbstractTreeTableViewProvider;
import net.ui.eclipse.tree.ITreeViewProvider;
import net.ui.eclipse.tree.TreeViewComposite;
import net.ui.model.tree.TreeBean;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.configuration.Configuration;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TreeItem;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessTemplateBean;
import com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean;

public class CodeTemplateConfigPage extends WorkbenchPropertyPage {

	private TreeViewComposite templateTreeViewComposite;

	
	public CodeTemplateConfigPage() {

	}

	@Override
	protected Control createContents(Composite parent) {

		List<Object> objects = new ArrayList<Object>();

		try {
			IAdaptable adaptable = getElement();
			if (adaptable instanceof IJavaProject) {
				
				Configuration templateConfiguration = configuration.subset("template");

				for (Iterator<String> iterator = templateConfiguration.getKeys(); iterator
						.hasNext();) {
					String key = iterator.next();
					BusinessObjectTypeEnum objectTypeEnum = BusinessObjectTypeEnum
							.getEnum(key);
					if (objectTypeEnum != null) {
						objects.add(objectTypeEnum);
					} else {

						List values = templateConfiguration.getList(key);

						for (Iterator<String> valueIterator = values.iterator(); valueIterator
								.hasNext();) {
							String value = valueIterator.next();
							Object obj = Class.forName(key).newInstance();
							PropertyUtils.setProperty(obj, "id",
									new Long(value));

							objects.add(obj);
						}

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage(e.getLocalizedMessage());
		}

		Composite composite = new Composite(parent, SWT.NONE);

		composite.setLayout(new FillLayout());

		ITreeViewProvider treeViewProvider = new AbstractTreeTableViewProvider() {

			@Override
			public TreeBean getTreeConfig() {
				return UIConfigFactory.getInstance().getTreeConfig(
						"/ui/model/business_template.tree");
			}

			@Override
			public int getDefaultExpandToLevel() {
				return TreeViewer.ALL_LEVELS;
			}

			@Override
			public int getStyle() {
				return super.getStyle() | SWT.CHECK;
			}

			@Override
			public boolean isEditable() {
				return false;
			}

		};

		templateTreeViewComposite = new TreeViewComposite(composite,
				treeViewProvider);

		templateTreeViewComposite.setShowActionMenu(false);

		templateTreeViewComposite.getTreeViewer().getTree()
				.addSelectionListener(new SelectionAdapter() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						if (e.detail == SWT.CHECK) {
							TreeItem treeItem = (TreeItem) e.item;
							if (treeItem.getChecked()) {
								selectAllChildItems(treeItem);
							}
						}
					}

				});

		templateTreeViewComposite.setCheckedItems(objects
				.toArray(new Object[objects.size()]));

		return composite;
	}

	protected void selectAllChildItems(TreeItem treeItem) {

		TreeItem[] treeItems = treeItem.getItems();

		for (int i = 0; i < treeItems.length; i++) {
			treeItems[i].setChecked(true);
			selectAllChildItems(treeItems[i]);
		}
	}

	@Override
	public boolean performOk() {

		try {
			List<Object> selectedObjects = templateTreeViewComposite
					.getCheckedUserObjects();
			
			Configuration templateConfiguration = configuration.subset("template");

			templateConfiguration.clearProperty(BusinessTemplateBean.class.getName());

			templateConfiguration.clearProperty(BusinessTemplateProviderTypeBean.class
					.getName());

			for (Iterator<Object> iterator = selectedObjects.iterator(); iterator
					.hasNext();) {
				Object nodeObj = iterator.next();

				if (nodeObj instanceof BusinessObjectTypeEnum) {
					templateConfiguration.setProperty(
							((BusinessObjectTypeEnum) nodeObj).getName(),
							"true");
				} else if (nodeObj instanceof BusinessTemplateBean) {
					BusinessTemplateBean templateBean = (BusinessTemplateBean) nodeObj;
					templateConfiguration.addProperty(BusinessTemplateBean.class
							.getName(), new Long(templateBean.getId()));
				} else if (nodeObj instanceof BusinessTemplateProviderTypeBean) {
					BusinessTemplateProviderTypeBean templateProviderBean = (BusinessTemplateProviderTypeBean) nodeObj;
					templateConfiguration.addProperty(
							BusinessTemplateProviderTypeBean.class.getName(),
							new Long(templateProviderBean.getId()));
				}

			}

			configuration.save();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage(e.getLocalizedMessage());
			return false;
		}

	}

}
