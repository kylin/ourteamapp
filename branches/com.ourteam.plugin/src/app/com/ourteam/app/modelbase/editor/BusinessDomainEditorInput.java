package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractEditorPart;
import net.ui.eclipse.editorpart.IEditorAgentInput;

import com.ourteam.modelbase.domain.BusinessDomainBean;

public class BusinessDomainEditorInput extends
		AbstractModelObjectEditorInput<BusinessDomainBean> implements IEditorAgentInput{

	public BusinessDomainEditorInput(BusinessDomainBean businessDomainDataModel) {
		super(businessDomainDataModel);
	}

	@Override
	public boolean exists() {
		try {
			return getBusinessDomainService().getBusinessDomainById(
					getDataModel().getBusinessDomainId()) != null;
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
	protected BusinessDomainBean doReloadDataModel() throws Exception {
		return getBusinessDomainService().getBusinessDomainById(
				getDataModel().getBusinessDomainId());
	}

	@Override
	public AbstractEditorPart<?, ?> getEditorPart() {
		return new BusinessDomainEditorPart();
	}

	

}
