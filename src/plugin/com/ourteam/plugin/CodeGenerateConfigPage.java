package com.ourteam.plugin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.editorpart.AbstractObjectRelationActionHandler;
import net.ui.eclipse.utils.AbstractComboListProvider;
import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.widget.AbstractDataListTableComposite;
import net.ui.eclipse.wizard.IWizardProvider;
import net.ui.model.action.ActionBean;
import net.ui.model.table.TableBean;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.eclipse.jdt.core.IClasspathEntry;
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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.app.workspace.editor.AddWorkspaceResourceBusinessPackageWizardProvider;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;
import com.ourteam.modelbase.service.IBusinessTemplateService;

public class CodeGenerateConfigPage extends WorkbenchPropertyPage {

	private Text dataSourceText;

	private Combo daoProviderCombo;

	private Text serviceBaseText;

	private AbstractDataListTableComposite<BusinessPackageBean> businessPackageTableViewComposite;

	private ListViewer sourceListView;

	private Configuration generateConfiguration;

	private static final IBusinessTemplateService BUSINESS_TEMPLATE_SERVICE = BusinessTemplateServiceFactory
			.getBusinessTemplateService();

	public CodeGenerateConfigPage() {

	}

	@Override
	protected Control createContents(Composite parent) {

		generateConfiguration = configuration.subset("generator");

		Composite composite = new Composite(parent, SWT.NONE);

		composite.setLayout(new GridLayout());

		Group daoConfigGroup = new Group(composite, SWT.NONE);

		daoConfigGroup.setText("DAO设置");

		daoConfigGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		daoConfigGroup.setLayout(new GridLayout(2, false));

		Label daoProviderLabel = new Label(daoConfigGroup, SWT.NONE);
		daoProviderLabel.setText("DAO实现类型:");

		daoProviderCombo = new Combo(daoConfigGroup, SWT.READ_ONLY);

		daoProviderCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Label dataSourceLabel = new Label(daoConfigGroup, SWT.NONE);
		dataSourceLabel.setText("数据源名称:");
		dataSourceText = new Text(daoConfigGroup, SWT.BORDER);
		if (this.generateConfiguration.containsKey("DAO.dataSource")) {
			dataSourceText.setText(this.generateConfiguration
					.getString("DAO.dataSource"));
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
		if (this.generateConfiguration.containsKey("Service.baseClass")) {
			serviceBaseText.setText(this.generateConfiguration
					.getString("Service.baseClass"));
		} else {
			serviceBaseText.setText("net.service.DefaultServiceImpl");
		}

		serviceBaseText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Group sourcePathGroup = new Group(composite, SWT.NONE);

		sourcePathGroup.setText("源码目录映射");

		sourcePathGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		sourcePathGroup.setLayout(new GridLayout());

		try {

			long providerTypeId = this.generateConfiguration.getLong(
					"DAO.providerType", 0);

			SWTUtils.fillCommboBox(
					daoProviderCombo,
					new AbstractComboListProvider<BusinessTemplateProviderTypeBean>(
							false) {

						@Override
						public BusinessTemplateProviderTypeBean[] getDataList()
								throws Exception {
							return BUSINESS_TEMPLATE_SERVICE
									.getBusinessTemplateProviderTypes(BusinessObjectTypeEnum.DAO
											.getName());
						}

						@Override
						public String getDataLabel(
								BusinessTemplateProviderTypeBean dataItem) {
							return dataItem.getProviderName();
						}
					});

			if (providerTypeId != 0) {
				SWTUtils.setCommboBoxSelection(BUSINESS_TEMPLATE_SERVICE
						.getBusinessTemplateProviderTypeById(providerTypeId),
						daoProviderCombo);
			}

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

		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage(e.getLocalizedMessage());
		}

		return composite;
	}

	protected void loadSourcePackageMapping() {
		IClasspathEntry classpathEntry = (IClasspathEntry) sourceListView
				.getElementAt(sourceListView.getList().getSelectionIndex());

		try {
			List packageIds = this.generateConfiguration.getList(classpathEntry
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
			this.generateConfiguration.setProperty("DAO.dataSource",
					this.dataSourceText.getText());
			this.generateConfiguration.setProperty("Service.baseClass",
					this.serviceBaseText.getText());
			BusinessTemplateProviderTypeBean providerTypeBean = (BusinessTemplateProviderTypeBean) SWTUtils
					.getCommboBoxSelectedData(daoProviderCombo);
			this.generateConfiguration.setProperty("DAO.providerType",
					String.valueOf(providerTypeBean.getId()));
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

			generateConfiguration.clearProperty(classpathEntry.getPath()
					.toString());

			List<BusinessPackageBean> packageBeans = businessPackageTableViewComposite
					.getTableComposite().getDataList();

			for (Iterator<BusinessPackageBean> iterator = packageBeans
					.iterator(); iterator.hasNext();) {
				BusinessPackageBean businessPackageBean = iterator.next();

				generateConfiguration.addProperty(classpathEntry.getPath()
						.toString(), String.valueOf(businessPackageBean
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

					List ids = generateConfiguration.getList(classpathEntry
							.getPath().toString());

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

					generateConfiguration.setProperty(classpathEntry.getPath()
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
