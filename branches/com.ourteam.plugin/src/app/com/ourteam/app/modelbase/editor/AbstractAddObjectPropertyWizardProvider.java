package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;

public abstract class AbstractAddObjectPropertyWizardProvider extends
		AbstractAddModelObjectWizardProvider<ObjectPropertyBean> {

	private long businessObjectId;

	public AbstractAddObjectPropertyWizardProvider(long businessObjectId) {
		super();
		this.businessObjectId = businessObjectId;
	}

	abstract protected ObjectPropertyTypeEnum getObjectPropertyTypeEnum();

	@Override
	protected ObjectPropertyBean getBusinessObjectDataModel() {
		ObjectPropertyBean objectPropertyBean = new ObjectPropertyBean();

		objectPropertyBean.setObjectId(this.businessObjectId);

		objectPropertyBean.setPropertyKind(getObjectPropertyTypeEnum()
				.getName());

		return objectPropertyBean;
	}

	@Override
	protected void addBusinessObject(ObjectPropertyBean businessObject)
			throws Exception {

		getBusinessObjectService().addNewBusinessObjectProperties(
				new ObjectPropertyBean[] { businessObject });
	}

}
