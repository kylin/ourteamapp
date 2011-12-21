package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractEditorPart;
import net.ui.eclipse.editorpart.IEditorAgentInput;

import org.apache.commons.lang.StringUtils;

import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;

public class BusinessObjectPropertyEditorInput extends
		AbstractModelObjectEditorInput<ObjectPropertyBean> implements
		IEditorAgentInput {

	public BusinessObjectPropertyEditorInput(ObjectPropertyBean dataModel) {
		super(dataModel);
	}

	@Override
	protected ObjectPropertyBean doReloadDataModel() throws Exception {
		return getBusinessObjectService().getBusinessObjectPropertyById(
				getDataModel().getObjectPropertyId());
	}

	@Override
	public boolean exists() {
		try {
			return getBusinessObjectService().getBusinessObjectPropertyById(
					getDataModel().getObjectPropertyId()) != null;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String getName() {
		return getDataModel().getObjectName() + "." + getDataModel().getName();
	}

	@Override
	public String getToolTipText() {
		if (StringUtils.isNotBlank(getDataModel().getDescription())) {
			return getDataModel().getDescription();
		} else {
			return getName();
		}

	}

	@Override
	public AbstractEditorPart<?, ?> getEditorPart() {
		ObjectPropertyTypeEnum propertyTypeEnum = ObjectPropertyTypeEnum
				.getEnum(getDataModel().getPropertyKind());

		if (ObjectPropertyTypeEnum.BUSINESS_PROPERTY.equals(propertyTypeEnum)) {
			return new DaoPropertyEditorPart();
		} else if (ObjectPropertyTypeEnum.PERSISTENT_PROPERTY
				.equals(propertyTypeEnum)) {
			return new PersistentPropertyEditorPart();
		} else if (ObjectPropertyTypeEnum.BEAN_PROPERTY
				.equals(propertyTypeEnum)) {
			return new BusinessBeanPropertyEditorPart();
		} else if (ObjectPropertyTypeEnum.ENUM_PROPERTY
				.equals(propertyTypeEnum)) {
			return new EnumPropertyEditorPart();
		}
		else{
			return null;
		}

		
	}

}
