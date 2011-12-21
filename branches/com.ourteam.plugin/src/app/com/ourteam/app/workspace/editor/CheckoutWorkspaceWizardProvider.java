package com.ourteam.app.workspace.editor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.AbstractWizardProvider;
import net.ui.eclipse.wizard.DefaultGridFormWizardPageControlHelper;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.project.ui.ProjectSearchComposite;
import com.ourteam.app.workspace.ui.SCMServiceComboListProvider;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.domain.WorkspaceConfigPropertyBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class CheckoutWorkspaceWizardProvider extends
		AbstractReflectWizardProvider {

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	private WorkspaceBean workspaceBean;

	private DefaultGridFormWizardPageControlHelper<WorkspaceBean> workspaceInfoPageHelper;

	private DefaultGridFormWizardPageControlHelper<Map<String, String>> scmServerInfoPageHelper;

	private long selectedprojectId;

	public CheckoutWorkspaceWizardProvider(WorkspaceBean workspaceBean) {
		super();
		this.workspaceBean = workspaceBean;
	}

	protected String getWizardConfigId() {
		return "checkoutWorkspaceWizard";
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {

		WorkspaceBean workspaceBean = workspaceInfoPageHelper
				.getGridFormComposite().getFormDataModel();

		Map<String, String> scmConfig = scmServerInfoPageHelper
				.getGridFormComposite().getFormDataModel();

		WORKSPACE_SERVICE
				.addNewWorkspace(this.selectedprojectId, workspaceBean);

		WorkspaceConfigPropertyBean[] configPropertyBeans = new WorkspaceConfigPropertyBean[scmConfig
				.size()];

		Set<String> keySet = scmConfig.keySet();

		int index = 0;

		for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			configPropertyBeans[index] = new WorkspaceConfigPropertyBean();
			configPropertyBeans[index].setConfigProperty(key);
			configPropertyBeans[index].setConfigValue(scmConfig.get(key));
			index++;
		}

		WORKSPACE_SERVICE.setWorkspaceConfigPropertiesByConfigItem(
				workspaceBean.getId(), "scm.config", configPropertyBeans);

	}

	@Override
	protected Object getReflectObject(Control control) {
		if (control instanceof GridFormComposite) {
			String formBId = ((GridFormComposite) control).getFormConfig()
					.getId();
			if ("workspaceInfoForm".equals(formBId)) {
				return workspaceInfoPageHelper = new DefaultGridFormWizardPageControlHelper<WorkspaceBean>(
						this, workspaceBean);
			} else if ("scmCheckoutConfig".equals(formBId)) {
				return scmServerInfoPageHelper = new DefaultGridFormWizardPageControlHelper<Map<String, String>>(
						this, new HashMap<String, String>());
			} else {
				return this;
			}
		} else if (control instanceof ProjectSearchComposite) {
			return new ProjectSearchCompositeHelper(this);
		} else {
			return this;
		}

	}


	public class ProjectSearchCompositeHelper extends
			ProjectSearchCompositePageHelper {

		public ProjectSearchCompositeHelper(
				AbstractWizardProvider wizardProvider) {
			super(wizardProvider);
		}

		@Override
		public void onActiveWizardPageControlChanged(
				ProjectSearchComposite control)throws Exception {
			super.onActiveWizardPageControlChanged(control);
			selectedprojectId = getSelectedProjectId();

			Combo combo = (Combo) scmServerInfoPageHelper
					.getGridFormComposite().getWidget("scmServiceId");

			SWTUtils.fillCommboBox(combo, new SCMServiceComboListProvider(
					selectedprojectId, false));
		}

	}

}
