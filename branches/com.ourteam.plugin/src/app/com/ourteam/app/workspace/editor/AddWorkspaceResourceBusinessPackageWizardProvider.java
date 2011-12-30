package com.ourteam.app.workspace.editor;

import java.util.List;

import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.AbstractSerachWizardPageControlHelper;
import net.ui.eclipse.wizard.AbstractWizardProvider;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.modelbase.ui.ModelPackageSearchComposite;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;
import com.ourteam.workspace.domain.WorkspaceResourceBusinessPackageRelateBean;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class AddWorkspaceResourceBusinessPackageWizardProvider extends
		AbstractReflectWizardProvider {

	protected ModelPackageSearchPageHelper modelPackageSearchCompositeHelper;

	private long workspaceResourceId;

	public AddWorkspaceResourceBusinessPackageWizardProvider(
			long workspaceResourceId) {
		super();
		this.workspaceResourceId = workspaceResourceId;
	}

	protected String getWizardConfigId(){
		return "addWorkspaceResourceBusinessPackageRelatWizard";
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {

		List<BusinessPackageBean> businessPackageBeans = this.modelPackageSearchCompositeHelper
				.getSelectedItems();

		long[] packageIds = new long[businessPackageBeans.size()];

		for (int i = 0; i < packageIds.length; i++) {
			packageIds[i] = businessPackageBeans.get(i).getBusinessPackageId();

		}

		WorkspaceServiceFactory.getWorkspaceService()
				.addWorkspaceResourceBusinessPackageRelate(workspaceResourceId,
						packageIds);

	}

	@Override
	protected Object getReflectObject(Control control) {
		if (control instanceof ModelPackageSearchComposite) {
			return modelPackageSearchCompositeHelper = new ModelPackageSearchPageHelper(
					this);
		} else {
			return this;
		}
	}

	public class ModelPackageSearchPageHelper
			extends
			AbstractSerachWizardPageControlHelper<BusinessPackageBean, ModelPackageSearchComposite> {

		public ModelPackageSearchPageHelper(
				AbstractWizardProvider wizardProvider) {
			super(wizardProvider);

		}

		@Override
		public void doInitSearchConfig(ModelPackageSearchComposite control)
				throws Exception {

			control.setPackageTypeEnums(new BusinessPackageTypeEnum[] {
					BusinessPackageTypeEnum.BUSINESS_PACKAGE,
					BusinessPackageTypeEnum.SERVICE_PACKAGE });

			WorkspaceResourceBusinessPackageRelateBean[] relateBeans = WorkspaceServiceFactory
					.getWorkspaceService()
					.getWorkspaceResourceBusinessPackageRelates(
							workspaceResourceId);

			if (ArrayUtils.isNotEmpty(relateBeans)) {

				long[] packageIds = new long[relateBeans.length];

				for (int i = 0; i < packageIds.length; i++) {
					packageIds[i] = relateBeans[i].getBusinessPcakageId();

				}
				
				control.setExculdPackageIds(packageIds);

			}

		}

	}

}
