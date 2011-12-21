package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.IReflectWizardPageControlHelper;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.modelbase.ui.ModelBaseUIUtils;
import com.ourteam.app.modelbase.ui.ModelObjectActionEditorComposite;
import com.ourteam.modelbase.domain.BusinessObjectActionBean;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class AddDaoActionWizardProvider extends AbstractReflectWizardProvider
		implements
		IReflectWizardPageControlHelper<ModelObjectActionEditorComposite> {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AddDaoActionWizardProvider.class);

	private static final IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private BusinessObjectActionBean businessObjectActionBean;

	private ModelObjectActionEditorComposite actionEditorComposite;

	public AddDaoActionWizardProvider(
			BusinessObjectActionBean businessObjectActionBean) {
		super();
		this.businessObjectActionBean = businessObjectActionBean;
	}

	protected String getWizardConfigId() {
		return "daoActionConfigTab";
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {

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

		businessObjectService.addBusinessObjectAction(businessObjectActionBean);

	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		boolean flag = StringUtils.isNotBlank(actionEditorComposite
				.getActionCombo().getText())
				&& StringUtils.isNotBlank(actionEditorComposite
						.getPropertyCombo().getText())
				&& StringUtils.isNotBlank(actionEditorComposite
						.getActionValueText().getText());

		if (actionEditorComposite.getOperationCombo().isEnabled()) {
			return flag
					&& StringUtils.isNotBlank(actionEditorComposite
							.getOperationCombo().getText());
		} else {
			return flag;
		}
	}

	@Override
	public void doNextWizardPageControl(ModelObjectActionEditorComposite control) {

	}

	@Override
	public boolean canFlipToNextPageControl(
			ModelObjectActionEditorComposite control) {
		return false;
	}

	@Override
	public void onActiveWizardPageControlChanged(
			ModelObjectActionEditorComposite control) {

	}

	@Override
	public void initWizardPageControl(ModelObjectActionEditorComposite control) {

		actionEditorComposite = control;

		ModifyListener modifyListener = new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent event) {
				updateWizardButtons();
			}
		};

		try {
			ModelBaseUIUtils.initModelActionComposite(actionEditorComposite,
					businessObjectActionBean);

			actionEditorComposite.getActionCombo().addModifyListener(
					modifyListener);

			actionEditorComposite.getOperationCombo().addModifyListener(
					modifyListener);

			actionEditorComposite.getPropertyCombo().addModifyListener(
					modifyListener);

			actionEditorComposite.getActionValueText().addModifyListener(
					modifyListener);

		} catch (Exception e) {
			logger.error("initModelActionComposite Error", e);
			setErrorMessage(e.getLocalizedMessage());
		}

	}

	@Override
	protected Object getReflectObject(Control control) {
		return this;
	}

}
