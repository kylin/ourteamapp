package com.ourteam.app.modelbase.ui;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.tree.ISubNodeBuilder;

import org.apache.commons.lang.enums.Enum;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;

public class BusinessObjectTypeSubNodeBuilder implements
		ISubNodeBuilder<Enum, Enum> {

	@Override
	public Enum[] getSubNodes(Enum aParentObject) throws Exception {

		List<Enum> objectTypeEnums = new ArrayList<Enum>();

		if (aParentObject.equals(BusinessPackageTypeEnum.BUSINESS_PACKAGE)) {
			objectTypeEnums.add(BusinessObjectTypeEnum.DAO);
		} else if (aParentObject
				.equals(BusinessPackageTypeEnum.SERVICE_PACKAGE)) {
			objectTypeEnums.add(BusinessObjectTypeEnum.JAVA_CLASS);
			objectTypeEnums.add(BusinessObjectTypeEnum.ENUM);
			objectTypeEnums.add(BusinessObjectTypeEnum.SERVICE);
		} else if (aParentObject
				.equals(BusinessPackageTypeEnum.PERSISTENT_PACKAGE)) {
			objectTypeEnums.add(BusinessObjectTypeEnum.PERSISTENT);
		}

		return objectTypeEnums.toArray(new Enum[objectTypeEnums.size()]);
	}

	@Override
	public String getSubNodeDefineId(Enum nodeObject) {
		return nodeObject.getName();
	}

	@Override
	public String[] getSubNodeActionGroupIds(Enum nodeObject) {
		return new String[]{"businessTypeActionGroup"};
	}

}
