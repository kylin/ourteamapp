package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractDataModelEditorInput;

import com.ourteam.modelbase.service.BusinessDomainServiceFactory;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.BusinessPackageServiceFactory;
import com.ourteam.modelbase.service.IBusinessDomainService;
import com.ourteam.modelbase.service.IBusinessObjectService;
import com.ourteam.modelbase.service.IBusinessPackageService;

abstract public class AbstractModelObjectEditorInput<T> extends
		AbstractDataModelEditorInput<T> {

	private static final IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private static final IBusinessDomainService businessDomainService = BusinessDomainServiceFactory
			.getBusinessDomainService();

	private static final IBusinessPackageService businessPackageService = BusinessPackageServiceFactory
			.getBusinessPackageService();

	public AbstractModelObjectEditorInput(T dataModel) {
		super(dataModel);
	}

	public static IBusinessObjectService getBusinessObjectService() {
		return businessObjectService;
	}

	public static IBusinessDomainService getBusinessDomainService() {
		return businessDomainService;
	}

	public static IBusinessPackageService getBusinessPackageService() {
		return businessPackageService;
	}

}
