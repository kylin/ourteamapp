package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import org.apache.commons.lang.BooleanUtils;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

abstract public class AbstractBusinessObjectPropertyNodeBuilder implements
		ISubNodeBuilder<BusinessObjectBean, ObjectPropertyBean> {

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	abstract protected ObjectPropertyTypeEnum getBusinessPropertyType();

	@Override
	public ObjectPropertyBean[] getSubNodes(BusinessObjectBean aParentObject)
			throws Exception {
		return BUSINESS_OBJECT_SERVICE
				.getBusinessObjectProperties(aParentObject
						.getBusinessObjectId());
	}

	@Override
	public String getSubNodeDefineId(ObjectPropertyBean nodeObject) {
		if (BooleanUtils.toBoolean(nodeObject.getIsPrimaryProperty())) {
			return "PRIMARY_" + getBusinessPropertyType().getName();
		} else {
			return getBusinessPropertyType().getName();
		}

	}
	
	@Override
	public String[] getSubNodeActionGroupIds(ObjectPropertyBean nodeObject) {
		return new String[]{"objectPropertyActionGroup"};
	}

}
