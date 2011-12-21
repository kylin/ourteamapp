package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractEditorPart;
import net.ui.eclipse.editorpart.IEditorAgentInput;

import com.ourteam.modelbase.domain.BusinessPackageBean;

public class BusinessPackageEditorInput extends
		AbstractModelObjectEditorInput<BusinessPackageBean> implements
		IEditorAgentInput {

	public BusinessPackageEditorInput(BusinessPackageBean businessPackageBean) {
		super(businessPackageBean);
	}

	@Override
	public boolean exists() {
		try {
			return getBusinessPackageService().getBusinessPackageById(
					getDataModel().getBusinessPackageId()) != null;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String getName() {
		return getDataModel().getName();
	}

	@Override
	public String getToolTipText() {
		return getDataModel().getDescription();
	}

	@Override
	protected BusinessPackageBean doReloadDataModel() throws Exception {
		return getBusinessPackageService().getBusinessPackageById(
				getDataModel().getBusinessPackageId());
	}

	@Override
	public AbstractEditorPart<?, ?> getEditorPart() {
		return new BusinessPackageEditorPart();
	}

}
