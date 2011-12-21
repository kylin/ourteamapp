package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;
import net.ui.eclipse.utils.SWTUtils;

import org.eclipse.swt.widgets.Control;

import com.ourteam.app.modelbase.ui.ModelBaseUIUtils;
import com.ourteam.app.modelbase.ui.ModelObjectActionEditorComposite;
import com.ourteam.modelbase.domain.BusinessObjectActionBean;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class EditDaoActionDialogProvider extends
		AbstractTabbedPanelDialogProvider {

	private static final IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private BusinessObjectActionBean businessObjectActionBean;

	private ModelObjectActionEditorComposite actionEditorComposite;

	public EditDaoActionDialogProvider(
			BusinessObjectActionBean businessObjectActionBean) {
		super();
		this.businessObjectActionBean = businessObjectActionBean;
	}

	@Override
	public String getTitle() {
		return "编辑动作配置";
	}

	@Override
	public boolean doOkPressed() throws Exception {

		businessObjectActionBean.setAction(actionEditorComposite
				.getActionCombo().getText());

		businessObjectActionBean.setOperation(actionEditorComposite
				.getOperationCombo().getText());

		businessObjectActionBean.setPropertyValue(actionEditorComposite
				.getActionValueText().getText());

		ObjectPropertyBean objectPropertyBean = (ObjectPropertyBean) SWTUtils
				.getCommboBoxSelectedData(actionEditorComposite
						.getPropertyCombo());

		businessObjectActionBean.setPropertyId(objectPropertyBean
				.getObjectPropertyId());

		businessObjectService
				.modifyBusinessObjectAction(businessObjectActionBean);

		return true;
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "daoActionConfigTab";
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {
		if (aPanel instanceof ModelObjectActionEditorComposite) {
			actionEditorComposite = (ModelObjectActionEditorComposite) aPanel;
			ModelBaseUIUtils.initModelActionComposite(
					(ModelObjectActionEditorComposite) aPanel,
					businessObjectActionBean);
		}

	}
}
