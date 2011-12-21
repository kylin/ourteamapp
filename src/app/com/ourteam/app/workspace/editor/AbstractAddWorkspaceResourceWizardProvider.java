package com.ourteam.app.workspace.editor;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.IReflectWizardPageControlHelper;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Control;

import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;
import com.ourteam.workspace.domain.WorkspaceResourceBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public abstract class AbstractAddWorkspaceResourceWizardProvider extends
		AbstractReflectWizardProvider {

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	private WorkspaceResourceBean workspaceResourceBean;

	private long workspaceId;

	private GridFormComposite<WorkspaceResourceBean> formComposite;

	public AbstractAddWorkspaceResourceWizardProvider(long workspaceId) {
		super();
		this.workspaceId = workspaceId;
	}

	abstract protected WorkspaceResourceTypeEnum getWorkspaceResourceTypeEnum();

	protected String getWizardConfigId() {

		return "addWorkspaceResourceWizard";
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {

		WORKSPACE_SERVICE
				.addWorkspaceResource(formComposite.getFormDataModel());

	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		try {
			formComposite.validate();
			setMessage("");
			return true;
		} catch (Exception e) {
			setErrorMessage(e.getLocalizedMessage());
			return false;
		}
	}

	@Override
	protected Object getReflectObject(Control control) {
		if (control instanceof GridFormComposite) {
			return new ResourceInfoPageHelper();
		} else {
			return this;
		}
	}

	protected WorkspaceResourceBean getWorkspaceResourceBean() {
		return workspaceResourceBean;
	}

	public class ResourceInfoPageHelper
			implements
			IReflectWizardPageControlHelper<GridFormComposite<WorkspaceResourceBean>> {

		@Override
		public void doNextWizardPageControl(
				GridFormComposite<WorkspaceResourceBean> control) {

			workspaceResourceBean = control.getFormDataModel();
		}

		@Override
		public boolean canFlipToNextPageControl(
				GridFormComposite<WorkspaceResourceBean> control) {

			try {
				control.validate();
				return true;
			} catch (Exception e) {
				setErrorMessage(e.getLocalizedMessage());
				return false;
			}

		}

		@Override
		public void onActiveWizardPageControlChanged(
				GridFormComposite<WorkspaceResourceBean> control) {

		}

		@Override
		public void initWizardPageControl(
				GridFormComposite<WorkspaceResourceBean> control) {

			formComposite = control;

			WorkspaceResourceBean resourceBean = new WorkspaceResourceBean();

			resourceBean.setWorkspaceId(workspaceId);

			resourceBean.setResourceType(getWorkspaceResourceTypeEnum()
					.getName());

			control.setFormDataModel(resourceBean);

			control.addModifyListener(new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent event) {
					formComposite.getFormDataModel();
					updateWizardButtons();
				}
			});
		}

	}
}
