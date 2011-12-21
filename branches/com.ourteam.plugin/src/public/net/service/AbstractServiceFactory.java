package net.service;

public abstract class AbstractServiceFactory {
	
	protected static Object getBean(String aBeanId){
		return SpringContextAgent.getBean(aBeanId);
	}
}
