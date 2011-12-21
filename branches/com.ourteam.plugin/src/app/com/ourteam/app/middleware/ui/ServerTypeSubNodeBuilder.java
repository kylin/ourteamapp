package com.ourteam.app.middleware.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class ServerTypeSubNodeBuilder implements
		ISubNodeBuilder<Object, MiddleWareTypeEnum> {

	@Override
	public MiddleWareTypeEnum[] getSubNodes(Object aParentObject)
			throws Exception {
		return new MiddleWareTypeEnum[] { MiddleWareTypeEnum.DATABASE_SERVER,
				MiddleWareTypeEnum.APPLICATION_SERVER,
				MiddleWareTypeEnum.CVS_SERVER, MiddleWareTypeEnum.SVN_SERVER };
	}

	@Override
	public String getSubNodeDefineId(MiddleWareTypeEnum nodeObject) {
		return nodeObject.getName();
	}

	@Override
	public String[] getSubNodeActionGroupIds(MiddleWareTypeEnum nodeObject) {
		if (nodeObject.equals(MiddleWareTypeEnum.DATABASE_SERVER)) {
			return new String[] { "databaseServerTypeActionGroup" };
		} else if (nodeObject.equals(MiddleWareTypeEnum.CVS_SERVER)) {
			return new String[] { "cvsServerTypeActionGroup" };
		} else if (nodeObject.equals(MiddleWareTypeEnum.SVN_SERVER)) {
			return new String[] { "svnServerTypeActionGroup" };
		} else if (nodeObject.equals(MiddleWareTypeEnum.APPLICATION_SERVER)) {
			return new String[] { "appServerTypeActionGroup" };
		} else {
			return null;
		}
	}

}
