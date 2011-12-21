package com.ourteam.app.modelbase.ui;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.tree.ISubNodeBuilder;

import org.apache.commons.lang.enums.Enum;

import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;

public class BusinessPackageTypeSubNodeBuilder implements
		ISubNodeBuilder<Object, Enum> {

	@Override
	public Enum[] getSubNodes(Object aParentObject) throws Exception {

		List<Enum> packageTypeEnums = new ArrayList<Enum>();

		packageTypeEnums.add(BusinessPackageTypeEnum.BUSINESS_PACKAGE);
		packageTypeEnums.add(BusinessPackageTypeEnum.SERVICE_PACKAGE);
		packageTypeEnums.add(BusinessPackageTypeEnum.PERSISTENT_PACKAGE);

		return packageTypeEnums.toArray(new Enum[packageTypeEnums.size()]);
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
