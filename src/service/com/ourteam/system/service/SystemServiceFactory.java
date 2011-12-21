package com.ourteam.system.service;

import net.service.AbstractServiceFactory;

public class SystemServiceFactory extends AbstractServiceFactory {

	
	public static ISystemApplicationService getSystemApplicationService() {
		return SystemApplicationServiceFactory.getSystemApplicationService();
	}
	
	
}
