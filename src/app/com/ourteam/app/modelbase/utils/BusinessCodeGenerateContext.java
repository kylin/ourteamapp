package com.ourteam.app.modelbase.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessTemplateBean;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.VelocityTemplateBean;
import com.ourteam.modelbase.service.IBusinessObjectService;
import com.ourteam.modelbase.service.IBusinessPackageService;

public class BusinessCodeGenerateContext {

	private File baseDirectory;

	private Map<Long, BusinessPackageBean> businessPackageChache = new HashMap<Long, BusinessPackageBean>();

	private Map<Long, File> businessPackageFileChache = new HashMap<Long, File>();

	private Map<Long, BusinessObjectBean> businessObjectChache = new HashMap<Long, BusinessObjectBean>();

	private Map<Long, Map<String, List<ObjectRelationBean>>> businessObjectRelationChache = new HashMap<Long, Map<String, List<ObjectRelationBean>>>();

	private Map<Long, String> businessObjectImplChache = new HashMap<Long, String>();

	private Map<TemplateKey, BusinessTemplateBean[]> businessTemplateCache = new HashMap<TemplateKey, BusinessTemplateBean[]>();

	private Map<Long, VelocityTemplateBean> templateCache = new HashMap<Long, VelocityTemplateBean>();

	private int totalBusinessObjectCount;

	private List<IBusinessCodeGenerateListener> generateListeners = new ArrayList<IBusinessCodeGenerateListener>();

	private Map<String, String> daoGenerateConfig = new HashMap<String, String>();

	private Map<String, String> serviceGenerateConfig = new HashMap<String, String>();

	private IBusinessPackageService businessPackageService;

	private IBusinessObjectService businessObjectService;

	public File getBaseDirectory() {
		return baseDirectory;
	}

	public void setBaseDirectory(File baseDirectory) {
		this.baseDirectory = baseDirectory;
	}

	public Map<Long, BusinessPackageBean> getBusinessPackageChache() {
		return businessPackageChache;
	}

	public Map<Long, File> getBusinessPackageFileChache() {
		return businessPackageFileChache;
	}

	public int getTotalBusinessObjectCount() {
		return totalBusinessObjectCount;
	}

	public void setTotalBusinessObjectCount(int totalBusinessObjectCount) {
		this.totalBusinessObjectCount = totalBusinessObjectCount;
	}

	public Map<Long, BusinessObjectBean> getBusinessObjectChache() {
		return businessObjectChache;
	}

	public void addGenerateListener(
			IBusinessCodeGenerateListener generateListener) {
		if (this.generateListeners.contains(generateListener) == false) {
			this.generateListeners.add(generateListener);
		}

	}

	public void removeGenerateListener(
			IBusinessCodeGenerateListener generateListener) {
		if (this.generateListeners.contains(generateListener)) {
			this.generateListeners.remove(generateListener);
		}
	}

	public void fireBeginGeneration(int totalCount) {

		for (Iterator<IBusinessCodeGenerateListener> iterator = generateListeners
				.iterator(); iterator.hasNext();) {
			IBusinessCodeGenerateListener generateListener = (IBusinessCodeGenerateListener) iterator
					.next();
			generateListener.fireBeginGeneration(totalCount);
		}
	}

	public void fireBusinessObjectGenerated(int index, Object businessObjectBean) {

		for (Iterator<IBusinessCodeGenerateListener> iterator = generateListeners
				.iterator(); iterator.hasNext();) {
			IBusinessCodeGenerateListener generateListener = (IBusinessCodeGenerateListener) iterator
					.next();
			generateListener.fireBusinessCodeGenerated(index,
					businessObjectBean);
		}
	}

	public void fireBusinessObjectGenerateError(int index,
			Object businessObjectBean, Exception e) {

		for (Iterator<IBusinessCodeGenerateListener> iterator = generateListeners
				.iterator(); iterator.hasNext();) {
			IBusinessCodeGenerateListener generateListener = (IBusinessCodeGenerateListener) iterator
					.next();
			generateListener.fireBusinessCodeGenerateError(index,
					businessObjectBean, e);
		}
	}

	public Map<TemplateKey, BusinessTemplateBean[]> getBusinessTemplateCache() {
		return businessTemplateCache;
	}

	public Map<Long, VelocityTemplateBean> getTemplateCache() {
		return templateCache;
	}

	public Map<String, String> getDaoGenerateConfig() {
		return daoGenerateConfig;
	}

	public Map<Long, String> getBusinessObjectImplChache() {
		return businessObjectImplChache;
	}

	public IBusinessPackageService getBusinessPackageService() {
		return businessPackageService;
	}

	public void setBusinessPackageService(
			IBusinessPackageService businessPackageService) {
		this.businessPackageService = businessPackageService;
	}

	public IBusinessObjectService getBusinessObjectService() {
		return businessObjectService;
	}

	public void setBusinessObjectService(
			IBusinessObjectService businessObjectService) {
		this.businessObjectService = businessObjectService;
	}

	public Map<Long, Map<String, List<ObjectRelationBean>>> getBusinessObjectRelationChache() {
		return businessObjectRelationChache;
	}

	public Map<String, String> getServiceGenerateConfig() {
		return serviceGenerateConfig;
	}

	public BusinessObjectHelper getBusinessObjectHelper(
			BusinessObjectBean businessObject) {
		return new BusinessObjectHelper(businessObject);
	}
}
