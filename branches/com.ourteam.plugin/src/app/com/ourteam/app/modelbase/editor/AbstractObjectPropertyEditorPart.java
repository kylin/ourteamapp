package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractFormEditorPart;

import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

abstract public class AbstractObjectPropertyEditorPart
		extends
		AbstractFormEditorPart<ObjectPropertyBean, BusinessObjectPropertyEditorInput> {


	private static final IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
			.getBusinessObjectService();


	@Override
	protected void saveDataModel(ObjectPropertyBean aDataModel)
			throws Exception {

		businessObjectService.modifyBusinessObjectProperty(aDataModel);
	}

}
