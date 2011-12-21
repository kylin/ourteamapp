package com.ourteam.app.modelbase.editor;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractEditorPart;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.widget.AbstractMultiPanelGroupComposite;
import net.ui.model.action.ActionBean;
import net.ui.model.tab.TabConfig;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.modelbase.ui.ServiceMethodInputParameterListComposite;
import com.ourteam.modelbase.domain.ServiceFunctionBean;
import com.ourteam.modelbase.domain.ServiceParameterBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class ServiceMethodParameterEditorPart extends
		AbstractEditorPart<ServiceFunctionBean, ServiceMethodEditorInput> {

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private ServiceMethodInputParameterListComposite serviceMethodInputParameterListComposite;

	private GridFormComposite<ServiceParameterBean> serviceMethodOututParameterFormComposite;

	private ServiceParameterBean outputParameterBean;

	private ServiceParameterBean[] inputParameterBeans;

	@Override
	protected void saveDataModel(ServiceFunctionBean aDataModel)
			throws Exception {

		serviceMethodOututParameterFormComposite.validate();

		serviceMethodOututParameterFormComposite.getFormDataModel();

		BUSINESS_OBJECT_SERVICE.setServiceOutputParameter(
				aDataModel.getObjectFunctionId(), this.outputParameterBean);

	}

	@Override
	protected void reloadDataModel() throws Exception {

		this.inputParameterBeans = BUSINESS_OBJECT_SERVICE
				.getServiceInputParameters(getDataModel().getObjectFunctionId());

		if (this.isDirty() == false) {

			this.outputParameterBean = BUSINESS_OBJECT_SERVICE
					.getServiceOutputParameter(getDataModel()
							.getObjectFunctionId());

			serviceMethodOututParameterFormComposite
					.setModifyListenerEnable(false);
			serviceMethodOututParameterFormComposite
					.setFormDataModel(this.outputParameterBean);
			serviceMethodOututParameterFormComposite
					.setModifyListenerEnable(true);
		}

		serviceMethodInputParameterListComposite.getTableComposite()
				.setDataList(this.inputParameterBeans);

	}

	@Override
	public void doCreatePartControl(Composite parent) {

		new AbstractMultiPanelGroupComposite(parent, SWT.NONE) {

			@Override
			protected String getTabbedPaneConfigId() {
				return "serviceMethodParameterPanelGroup";
			}

			@SuppressWarnings({ "rawtypes", "unchecked" })
			@Override
			protected void initContentPanel(Control aPanel) throws Exception {

				if (aPanel instanceof GridFormComposite) {
					serviceMethodOututParameterFormComposite = (GridFormComposite) aPanel;

					serviceMethodOututParameterFormComposite
							.addModifyListener(new ModifyListener() {

								@Override
								public void modifyText(ModifyEvent event) {
									setDirty(true);
								}
							});

					serviceMethodOututParameterFormComposite
							.addSelectionListener(new SelectionListener() {

								@Override
								public void widgetSelected(SelectionEvent e) {
									setDirty(true);
								}

								@Override
								public void widgetDefaultSelected(
										SelectionEvent e) {
									setDirty(true);
								}
							});

				} else if (aPanel instanceof ServiceMethodInputParameterListComposite) {
					serviceMethodInputParameterListComposite = (ServiceMethodInputParameterListComposite) aPanel;

					serviceMethodInputParameterListComposite
							.setActionHandler(new ParmeterListActionHandler());

				}

			}

			@Override
			protected Object getLayoutData(TabConfig tabConfig) {
				if (tabConfig.getName().equalsIgnoreCase(
						"setServiceMethodOutput")) {
					return new GridData(GridData.FILL_HORIZONTAL);
				} else {
					return super.getLayoutData(tabConfig);
				}

			}

		};
	}

	public class ParmeterListActionHandler extends
			AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			boolean flag = true;

			List<ServiceParameterBean> selectedParameterBeans = serviceMethodInputParameterListComposite
					.getTableComposite().getSelectedDataList();

			if (("removeRelation").equals(aAction.getId())
					|| "editRelation".equals(aAction.getId())) {
				if (selectedParameterBeans.size() == 0) {
					return false;
				} else {
					return true && flag;
				}
			} else if ("moveUp".equals(aAction.getId())) {

				return flag
						&& selectedParameterBeans.isEmpty() == false
						&& serviceMethodInputParameterListComposite
								.getTableComposite().canMoveUp(
										selectedParameterBeans.get(0));

			} else if ("moveDown".equals(aAction.getId())) {
				return flag
						&& selectedParameterBeans.isEmpty() == false
						&& serviceMethodInputParameterListComposite
								.getTableComposite().canMoveDown(
										selectedParameterBeans.get(0));

			} else {
				return true && flag;
			}
		}

		@Override
		public boolean isActionVisible(ActionBean aAction) {
			return true;
		}

		public void addRelation(ActionEvent actionEvent) throws Exception {

			ServiceParameterBean serviceParameterBean = new ServiceParameterBean();

			serviceParameterBean.setServiceFunctionId(getDataModel()
					.getObjectFunctionId());

			EditServiceMethodInputParameterDialogProvider dialogProvider = new EditServiceMethodInputParameterDialogProvider(
					serviceParameterBean);

			if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {
				reloadDataModel();
			}

		}

		public void editRelation(ActionEvent actionEvent) throws Exception {

			ServiceParameterBean serviceParameterBean = (ServiceParameterBean) serviceMethodInputParameterListComposite
					.getTableComposite().getSelectedDataList().get(0);

			EditServiceMethodInputParameterDialogProvider dialogProvider = new EditServiceMethodInputParameterDialogProvider(
					serviceParameterBean);

			if (SWTUtils.openDialog(getSite().getShell(), dialogProvider)) {
				reloadDataModel();
			}
		}

		public void removeRelation(ActionEvent actionEvent) throws Exception {

			ServiceParameterBean serviceParameterBean = (ServiceParameterBean) serviceMethodInputParameterListComposite
					.getTableComposite().getSelectedDataList().get(0);

			ServiceParameterBean[] serviceParameterBeans = BUSINESS_OBJECT_SERVICE
					.getServiceInputParameters(getDataModel()
							.getObjectFunctionId());

			List<ServiceParameterBean> parameterBeans = new ArrayList<ServiceParameterBean>();

			for (int i = 0; i < serviceParameterBeans.length; i++) {
				ServiceParameterBean inputParameterBean = serviceParameterBeans[i];
				if (inputParameterBean.getServiceParameterId() != serviceParameterBean
						.getServiceParameterId()) {

					parameterBeans.add(inputParameterBean);
				}
			}

			BUSINESS_OBJECT_SERVICE.setServiceInputParameters(getDataModel()
					.getObjectFunctionId(), parameterBeans
					.toArray(new ServiceParameterBean[parameterBeans.size()]));

			reloadDataModel();

		}

		public void moveUp(ActionEvent actionEvent) throws Exception {

			int selectedIndex = serviceMethodInputParameterListComposite
					.getTableComposite().getTable().getSelectionIndex();

			serviceMethodInputParameterListComposite.getTableComposite()
					.moveUpRow(selectedIndex);

			List<ServiceParameterBean> parameterBeans = serviceMethodInputParameterListComposite
					.getTableComposite().getDataList();

			BUSINESS_OBJECT_SERVICE.setServiceInputParameters(getDataModel()
					.getObjectFunctionId(), parameterBeans
					.toArray(new ServiceParameterBean[parameterBeans.size()]));

			reloadDataModel();

			serviceMethodInputParameterListComposite.getTableComposite()
					.getTable().setSelection(selectedIndex - 1);

			serviceMethodInputParameterListComposite.getTableComposite()
					.getTable().setFocus();

		}

		public void moveDown(ActionEvent actionEvent) throws Exception {

			int selectedIndex = serviceMethodInputParameterListComposite
					.getTableComposite().getTable().getSelectionIndex();

			serviceMethodInputParameterListComposite.getTableComposite()
					.moveDownRow(selectedIndex);

			List<ServiceParameterBean> parameterBeans = serviceMethodInputParameterListComposite
					.getTableComposite().getDataList();

			BUSINESS_OBJECT_SERVICE.setServiceInputParameters(getDataModel()
					.getObjectFunctionId(), parameterBeans
					.toArray(new ServiceParameterBean[parameterBeans.size()]));

			reloadDataModel();

			serviceMethodInputParameterListComposite.getTableComposite()
					.getTable().setSelection(selectedIndex + 1);

			serviceMethodInputParameterListComposite.getTableComposite()
					.getTable().setFocus();

		}
	}

	@Override
	public String[] getActionGroupIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IActionHandler createActionHandler() {
		// TODO Auto-generated method stub
		return null;
	}

}
