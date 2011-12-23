package com.ourteam.plugin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.editorpart.AbstractObjectRelationActionHandler;
import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.widget.AbstractDataListTableComposite;
import net.ui.eclipse.wizard.IWizardProvider;
import net.ui.model.action.ActionBean;
import net.ui.model.table.TableBean;

import org.apache.commons.configuration.ConfigurationException;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.ISharedImages;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.app.workspace.editor.AddWorkspaceResourceBusinessPackageWizardProvider;
import com.ourteam.modelbase.domain.BusinessPackageBean;

public class CodeGenerateConfigPage extends WorkbenchPropertyPage {

	private Text dataSourceText;

	private Text serviceBaseText;

	private AbstractDataListTableComposite<BusinessPackageBean> businessPackageTableViewComposite;

	private ListViewer sourceListView;

	public CodeGenerateConfigPage() {

	}

	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);

		composite.setLayout(new GridLayout());

		Group daoConfigGroup = new Group(composite, SWT.NONE);

		daoConfigGroup.setText("DAO设置");

		daoConfigGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		daoConfigGroup.setLayout(new GridLayout(2, false));

		Label dataSourceLabel = new Label(daoConfigGroup, SWT.NONE);
		dataSourceLabel.setText("数据源名称:");
		dataSourceText = new Text(daoConfigGroup, SWT.BORDER);
		if (this.configuration.containsKey("dataSource")) {
			dataSourceText.setText(this.configuration.getString("dataSource"));
		} else {
			dataSourceText.setText("dataSource");
		}

		dataSourceText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Group serviceConfigGroup = new Group(composite, SWT.NONE);

		serviceConfigGroup.setText("Service设置");

		serviceConfigGroup
				.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		serviceConfigGroup.setLayout(new GridLayout(2, false));

		Label serviceBaseLabel = new Label(serviceConfigGroup, SWT.NONE);
		serviceBaseLabel.setText("服务基类:");
		serviceBaseText = new Text(serviceConfigGroup, SWT.BORDER);
		if (this.configuration.containsKey("serviceBase")) {
			serviceBaseText
					.setText(this.configuration.getString("serviceBase"));
		} else {
			serviceBaseText.setText("net.service.DefaultServiceImpl");
		}

		serviceBaseText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Group sourcePathGroup = new Group(composite, SWT.NONE);

		sourcePathGroup.setText("源码目录映射");

		sourcePathGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		sourcePathGroup.setLayout(new GridLayout());

		try {

			sourceListView = new ListViewer(sourcePathGroup, SWT.SINGLE
					| SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);

			sourceListView
					.addSelectionChangedListener(new ISelectionChangedListener() {

						@Override
						public void selectionChanged(SelectionChangedEvent event) {
							businessPackageTableViewComposite
									.getToolBarComposite().update();
							loadSourcePackageMapping();
						}
					});

			sourceListView.setLabelProvider(new LabelProvider() {

				@Override
				public Image getImage(Object element) {
					return JavaUI.getSharedImages().getImage(
							ISharedImages.IMG_OBJS_CLASSPATH_VAR_ENTRY);
				}

				@Override
				public String getText(Object element) {
					return ((IClasspathEntry) element).getPath().toString();
				}

			});

			sourceListView.getList().setLayoutData(
					new GridData(GridData.FILL_HORIZONTAL));

			IClasspathEntry[] classpathEntries = javaProject.getRawClasspath();

			IClasspathEntry firstClasspathEntry = null;

			for (int i = 0; i < classpathEntries.length; i++) {
				IClasspathEntry iClasspathEntry = classpathEntries[i];

				if (iClasspathEntry.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
					sourceListView.add(iClasspathEntry);
					firstClasspathEntry = iClasspathEntry;
				}
			}

			businessPackageTableViewComposite = new AbstractDataListTableComposite<BusinessPackageBean>(
					sourcePathGroup, SWT.NONE) {

				@Override
				protected TableBean getTableConfig() {
					return UIConfigFactory.getInstance().getTableConfig(
							"businessPackageTable");
				}

				@Override
				protected String[] getActionGroupIds() {
					return new String[] { "relationActionGroup" };
				}

			};

			businessPackageTableViewComposite.setLayoutData(new GridData(
					GridData.FILL_BOTH));

			businessPackageTableViewComposite
					.setActionHandler(new BusinessPackageTableActionHandler());

			if (firstClasspathEntry != null) {
				sourceListView.setSelection(new StructuredSelection(
						firstClasspathEntry));
			}

		} catch (JavaModelException e) {
			e.printStackTrace();
			setErrorMessage(e.getLocalizedMessage());
		}

		return composite;
	}

	protected void loadSourcePackageMapping() {
		IClasspathEntry classpathEntry = (IClasspathEntry) sourceListView
				.getElementAt(sourceListView.getList().getSelectionIndex());

		try {
			List packageIds = this.configuration.getList(classpathEntry
					.getPath().toString());

			if (packageIds == null) {
				packageIds = new ArrayList();
			}

			List<BusinessPackageBean> businessPackageBeans = new ArrayList<BusinessPackageBean>();

			for (Iterator<String> iterator = packageIds.iterator(); iterator
					.hasNext();) {
				businessPackageBeans
						.add(IOurTeamServiceConst.BUSINESS_PACKAGE_SERVICE
								.getBusinessPackageById(Long
										.parseLong((String) iterator.next())));

			}

			this.businessPackageTableViewComposite.getTableComposite()
					.setDataList(businessPackageBeans);
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage(e.getLocalizedMessage());
		}

	}

	@Override
	public boolean performOk() {
		try {
			this.configuration.setProperty("dataSource",
					this.dataSourceText.getText());
			this.configuration.setProperty("serviceBase",
					this.serviceBaseText.getText());
			this.configuration.save();
			return true;
		} catch (ConfigurationException e) {
			e.printStackTrace();
			setErrorMessage(e.getLocalizedMessage());
			return false;
		}

	}

	class BusinessPackageTableActionHandler extends
			AbstractObjectRelationActionHandler<BusinessPackageBean> {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			if ("addRelation".equals(aAction.getId())) {
				return sourceListView.getSelection().isEmpty() == false;
			} else {
				return super.isActionEnable(aAction);
			}

		}

		@Override
		protected List<BusinessPackageBean> getSelectedItems() {
			return businessPackageTableViewComposite.getTableComposite()
					.getSelectedDataList();
		}

		@Override
		protected void reLoadDataList() throws Exception {
			loadSourcePackageMapping();
		}

		@Override
		protected Shell getShell() {
			return CodeGenerateConfigPage.this.getShell();
		}

		@Override
		protected void doRemoveRelations(List<BusinessPackageBean> items)
				throws Exception {

			businessPackageTableViewComposite.getTableComposite()
					.removeSelectedRows();

			final IClasspathEntry classpathEntry = (IClasspathEntry) sourceListView
					.getElementAt(sourceListView.getList().getSelectionIndex());

			configuration.clearProperty(classpathEntry.getPath().toString());

			List<BusinessPackageBean> packageBeans = businessPackageTableViewComposite
					.getTableComposite().getDataList();

			for (Iterator<BusinessPackageBean> iterator = packageBeans
					.iterator(); iterator.hasNext();) {
				BusinessPackageBean businessPackageBean = iterator.next();

				configuration.addProperty(classpathEntry.getPath().toString(),
						String.valueOf(businessPackageBean
								.getBusinessPackageId()));

			}

		}

		@Override
		protected IWizardProvider getAddRelationWizardProvider(
				ActionBean actionBean) throws Exception {

			final IClasspathEntry classpathEntry = (IClasspathEntry) sourceListView
					.getElementAt(sourceListView.getList().getSelectionIndex());

			AddWorkspaceResourceBusinessPackageWizardProvider wizardProvider = new AddWorkspaceResourceBusinessPackageWizardProvider(
					0) {
				@Override
				public void doFinish(IWizard wizard) throws Exception {

					List<BusinessPackageBean> businessPackageBeans = modelPackageSearchCompositeHelper
							.getSelectedItems();

					List ids = configuration.getList(classpathEntry.getPath()
							.toString());

					if (ids == null) {
						ids = new ArrayList();
					}

					long[] packageIds = new long[businessPackageBeans.size()];

					for (int i = 0; i < packageIds.length; i++) {
						packageIds[i] = businessPackageBeans.get(i)
								.getBusinessPackageId();

						if (ids.contains(String.valueOf(packageIds[i])) == false) {
							ids.add(String.valueOf(packageIds[i]));
						}

					}

					configuration.setProperty(classpathEntry.getPath()
							.toString(), ids);

				}
			};

			return wizardProvider;

		}

		@Override
		protected IDialogProvider getEditDialogProvider(
				List<BusinessPackageBean> items) throws Exception {

			return null;

		}

	}

}
