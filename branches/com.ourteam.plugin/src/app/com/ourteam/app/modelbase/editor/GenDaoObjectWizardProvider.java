package com.ourteam.app.modelbase.editor;

import org.apache.commons.lang.StringUtils;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;

public class GenDaoObjectWizardProvider extends
		AbstractGenBusinessObjectWizardProvider {

	
	public GenDaoObjectWizardProvider(BusinessObjectBean persistentObject) {
		super(persistentObject);
	}

	@Override
	protected String getWizardConfigId() {
		return "genDaoObjectWizard";
	}

	@Override
	protected BusinessObjectTypeEnum getBusinessObjectTypeEnum() {
		return BusinessObjectTypeEnum.DAO;
	}

	@Override
	protected BusinessPackageTypeEnum getBusinessPackageTypeEnum() {
		return BusinessPackageTypeEnum.BUSINESS_PACKAGE;
	}

	@Override
	protected String convertBusinessName(String name) {
		String[] strings = StringUtils.split(name, "_");

		StringBuffer nameBuffer = new StringBuffer();

		for (int i = 0; i < strings.length; i++) {
			String string = strings[i].toLowerCase();
			nameBuffer.append(StringUtils.capitalize(string));
		}

		return nameBuffer.toString();
	}

	@Override
	protected String convertPropertyName(String name) {
		return StringUtils.uncapitalize(convertBusinessName(name));
	}

}
