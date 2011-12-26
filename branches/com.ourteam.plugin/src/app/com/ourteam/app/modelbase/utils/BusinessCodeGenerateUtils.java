package com.ourteam.app.modelbase.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.service.SpringContextAgent;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;
import com.ourteam.modelbase.domain.BusinessTemplateBean;
import com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean;
import com.ourteam.modelbase.domain.ObjectActionEnumType;
import com.ourteam.modelbase.domain.ObjectRelationAttrBean;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.BusinessPackageServiceFactory;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;
import com.ourteam.modelbase.service.IBusinessPackageService;
import com.ourteam.modelbase.service.IBusinessTemplateService;

public class BusinessCodeGenerateUtils {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(BusinessCodeGenerateUtils.class);

	private static final IBusinessPackageService BUSINESS_PACKAGE_SERVICE = BusinessPackageServiceFactory
			.getBusinessPackageService();

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private static final IBusinessTemplateService BUSINESS_TEMPLATE_SERVICE = BusinessTemplateServiceFactory
			.getBusinessTemplateService();

	private static final VelocityEngine VELOCITY_ENGINE = SpringContextAgent
			.getBean(VelocityEngine.class);

	public static BusinessCodeGenerateContext startGeneration() {
		BusinessCodeGenerateContext generateContext = new BusinessCodeGenerateContext();

		generateContext.setBusinessObjectService(BUSINESS_OBJECT_SERVICE);

		generateContext.setBusinessPackageService(BUSINESS_PACKAGE_SERVICE);

		return generateContext;
	}

	protected static BusinessPackageBean generateBusinessPackageFileObject(
			BusinessCodeGenerateContext context, long packageId)
			throws Exception {

		BusinessPackageBean businessPackageBean = context
				.getBusinessPackageChache().get(Long.valueOf(packageId));

		if (businessPackageBean == null) {

			businessPackageBean = BUSINESS_PACKAGE_SERVICE
					.getBusinessPackageById(packageId);

			context.getBusinessPackageChache().put(Long.valueOf(packageId),
					businessPackageBean);
		}

		File packageFileObject = context.getBusinessPackageFileChache().get(
				Long.valueOf(packageId));

		if (packageFileObject == null) {

			String packageDir = StringUtils.replace(
					businessPackageBean.getName(), ".",
					SystemUtils.FILE_SEPARATOR);

			packageFileObject = new File(context.getBaseDirectory(), packageDir);

			if (packageFileObject.exists() == false) {
				packageFileObject.mkdirs();
			}

			context.getBusinessPackageFileChache().put(Long.valueOf(packageId),
					packageFileObject);
		}

		return businessPackageBean;

	}

	public static void generateBusinessFileObjects(
			BusinessCodeGenerateContext context, long[] businessPackageIds)
			throws Exception {

		CodeFormatUtils.init();

		Map<Long, List<BusinessObjectBean>> packageBusinessObjectCache = new HashMap<Long, List<BusinessObjectBean>>();

		List<String> templateTypes = new ArrayList<String>();

		for (int i = 0; i < businessPackageIds.length; i++) {
			BusinessPackageBean packageBean = generateBusinessPackageFileObject(
					context, businessPackageIds[i]);
			packageBusinessObjectCache.put(Long.valueOf(businessPackageIds[i]),
					new ArrayList<BusinessObjectBean>());
			templateTypes.add(packageBean.getType());
		}

		BusinessObjectBean[] businessObjectBeans = BUSINESS_OBJECT_SERVICE
				.getBusinessObjectsByPackageId(businessPackageIds);

		List<BusinessObjectBean> beans = new ArrayList<BusinessObjectBean>();

		for (int i = 0; i < businessObjectBeans.length; i++) {
			BusinessObjectBean businessObjectBean = businessObjectBeans[i];
			if (BusinessObjectTypeEnum.CUSTOM_DATA_TYPE.getName().equals(
					businessObjectBean.getType())
					|| BusinessObjectTypeEnum.DAO_QUERY_BEAN.getName().equals(
							businessObjectBean.getType())) {
				continue;
			}

			if (templateTypes.contains(businessObjectBean.getType()) == false) {
				templateTypes.add(businessObjectBean.getType());
			}

			beans.add(businessObjectBean);

			packageBusinessObjectCache.get(
					Long.valueOf(businessObjectBean.getPackageId())).add(
					businessObjectBean);

		}

		context.setTotalBusinessObjectCount(beans.size()
				+ businessPackageIds.length);

		context.fireBeginGeneration(beans.size() + businessPackageIds.length);

		for (Iterator<String> iterator = templateTypes.iterator(); iterator
				.hasNext();) {
			String templateType = (String) iterator.next();

			TemplateKey key = new TemplateKey(templateType, null);

			BusinessTemplateBean[] templateBeans = BUSINESS_TEMPLATE_SERVICE
					.getBusinessTemplates(templateType, 0);

			context.getBusinessTemplateCache().put(key, templateBeans);

			if (templateType.equals(BusinessObjectTypeEnum.DAO.getName())
					|| templateType
							.equals(BusinessPackageTypeEnum.BUSINESS_PACKAGE
									.getName())) {
				String daoProvider = context.getDaoGenerateConfig().get(
						"providerType");

				if (StringUtils.isNotBlank(daoProvider)) {

					BusinessTemplateBean[] providerTemplateBeans = BUSINESS_TEMPLATE_SERVICE
							.getBusinessTemplates(templateType,
									Long.parseLong(daoProvider));
					TemplateKey providerKey = new TemplateKey(templateType,
							daoProvider);

					context.getBusinessTemplateCache().put(providerKey,
							providerTemplateBeans);

				}
			}

		}

		for (int i = 0; i < beans.size(); i++) {
			BusinessObjectBean businessObjectBean = beans.get(i);
			try {
				generateBusinessFileObject(context, businessObjectBean);
				context.fireBusinessObjectGenerated(i + 1, businessObjectBean);
			} catch (Exception e) {
				logger.error(e);
				context.fireBusinessObjectGenerateError(i + 1,
						businessObjectBean, e);
				break;
			}
		}

		for (int i = 0; i < businessPackageIds.length; i++) {
			BusinessPackageBean businessPackageBean = context
					.getBusinessPackageChache().get(
							Long.valueOf(businessPackageIds[i]));

			List<BusinessObjectBean> objectBeans = packageBusinessObjectCache
					.get(Long.valueOf(businessPackageBean
							.getBusinessPackageId()));

			try {
				generatePackageFileObject(context, businessPackageBean,
						objectBeans.toArray(new BusinessObjectBean[objectBeans
								.size()]));
				context.fireBusinessObjectGenerated(beans.size() + i + 1,
						businessPackageBean);
			} catch (Exception e) {
				logger.error(e);
				context.fireBusinessObjectGenerateError(beans.size() + i + 1,
						businessPackageBean, e);
				break;
			}

		}
	}

	static protected Map<String, List<ObjectRelationBean>> getBusinessObjectRelations(
			long aBusinessObjectId) throws Exception {

		ObjectRelationBean[] objectRelationBeans = BUSINESS_OBJECT_SERVICE
				.getBusinessObjectRelatedBusinessObjects(aBusinessObjectId,
						null);

		Map<String, List<ObjectRelationBean>> relationMap = new HashMap<String, List<ObjectRelationBean>>();

		for (int j = 0; j < objectRelationBeans.length; j++) {
			ObjectRelationBean objectRelationBean = objectRelationBeans[j];

			ObjectRelationAttrBean[] relationAttrBeans = BUSINESS_OBJECT_SERVICE
					.getBusinessObjectRelatedProperties(objectRelationBean
							.getObjectRelationId());

			objectRelationBean.setRelationAttrBeans(relationAttrBeans);

			if (relationMap.containsKey(objectRelationBean.getRelateType())) {
				relationMap.get(objectRelationBean.getRelateType()).add(
						objectRelationBean);
			} else {
				List<ObjectRelationBean> relationBeans = new ArrayList<ObjectRelationBean>();

				relationBeans.add(objectRelationBean);

				relationMap.put(objectRelationBean.getRelateType(),
						relationBeans);
			}

		}

		return relationMap;
	}

	protected static void generatePackageFileObject(
			BusinessCodeGenerateContext context,
			BusinessPackageBean businessPackageBean,
			BusinessObjectBean[] businessObjectBeans) throws Exception {

		File packageFileObject = context.getBusinessPackageFileChache().get(
				Long.valueOf(businessPackageBean.getBusinessPackageId()));

		TemplateKey key = new TemplateKey(businessPackageBean.getType(), null);

		BusinessTemplateBean[] businessTemplateBeans = context
				.getBusinessTemplateCache().get(key);

		if (businessPackageBean.getType().equals(
				BusinessPackageTypeEnum.BUSINESS_PACKAGE.getName())) {

			String provider = context.getDaoGenerateConfig()
					.get("providerType");

			if (StringUtils.isNotBlank(provider)) {

				TemplateKey providerKey = new TemplateKey(
						businessPackageBean.getType(), provider);

				BusinessTemplateBean[] providerBusinessTemplateBeans = context
						.getBusinessTemplateCache().get(providerKey);

				businessTemplateBeans = (BusinessTemplateBean[]) ArrayUtils
						.addAll(businessTemplateBeans,
								providerBusinessTemplateBeans);
			}

		}

		for (int i = 0; i < businessTemplateBeans.length; i++) {
			BusinessTemplateBean businessTemplateBean = businessTemplateBeans[i];

			Map<String, Object> templateContext = new HashMap<String, Object>();

			templateContext.put("businessPackage", businessPackageBean);

			templateContext.put("businessObjectList", businessObjectBeans);

			templateContext.put("genContext", context);

			templateContext.put("genDate", new Date());

			generateFileObject(packageFileObject, businessTemplateBean,
					templateContext);
		}

	}

	protected static void generateBusinessFileObject(
			BusinessCodeGenerateContext context,
			BusinessObjectBean businessObjectBean) throws Exception {

		File packageFileObject = context.getBusinessPackageFileChache().get(
				Long.valueOf(businessObjectBean.getPackageId()));

		TemplateKey key = new TemplateKey(businessObjectBean.getType(), null);

		BusinessTemplateBean[] businessTemplateBeans = context
				.getBusinessTemplateCache().get(key);

		if (businessObjectBean.getType().equals(
				BusinessObjectTypeEnum.DAO.getName())
				|| businessObjectBean.getType().equals(
						BusinessPackageTypeEnum.BUSINESS_PACKAGE.getName())) {

			String provider = context.getDaoGenerateConfig()
					.get("providerType");

			if (StringUtils.isNotBlank(provider)) {

				TemplateKey providerKey = new TemplateKey(
						businessObjectBean.getType(), provider);

				BusinessTemplateBean[] providerBusinessTemplateBeans = context
						.getBusinessTemplateCache().get(providerKey);

				businessTemplateBeans = (BusinessTemplateBean[]) ArrayUtils
						.addAll(businessTemplateBeans,
								providerBusinessTemplateBeans);
			}

		}

		for (int i = 0; i < businessTemplateBeans.length; i++) {
			BusinessTemplateBean businessTemplateBean = businessTemplateBeans[i];

			Map<String, Object> templateContext = new HashMap<String, Object>();

			templateContext.put("businessObjectHelper",
					new BusinessObjectHelper(businessObjectBean));

			templateContext.put("genContext", context);

			templateContext.put("genDate", new Date());

			generateFileObject(packageFileObject, businessTemplateBean,
					templateContext);
		}

	}

	static protected void generateFileObject(File genDir,
			BusinessTemplateBean businessTemplateBean,
			Map<String, Object> templateContext) throws Exception {

		if (VELOCITY_ENGINE.resourceExists(businessTemplateBean
				.getTemplateName()) == false) {
			logger.error("can not find templat : "
					+ businessTemplateBean.getTemplateName());
			throw new FileNotFoundException("can not find templat : "
					+ businessTemplateBean.getTemplateName());
		}

		templateContext.put("stringUtils", new StringUtils());
		templateContext.put("arrayUtils", new ArrayUtils());
		templateContext.put("DAOType", BusinessObjectTypeEnum.DAO);
		templateContext.put("DTOType", BusinessObjectTypeEnum.JAVA_CLASS);
		templateContext
				.put("PersistentType", BusinessObjectTypeEnum.PERSISTENT);
		templateContext.put("ENUMType", BusinessObjectTypeEnum.ENUM);
		templateContext.put("ServiceType", BusinessObjectTypeEnum.SERVICE);
		templateContext.put("MappedRelation", ObjectRelationTypeEnum.MAPPED);
		templateContext.put("ExtendRelation", ObjectRelationTypeEnum.EXTEND);
		templateContext.put("RelatedViewRelation",
				ObjectRelationTypeEnum.RELATED_VIEW);
		templateContext.put("RelatedOperationRelation",
				ObjectRelationTypeEnum.RELATED_OPERATION);
		templateContext.put("CompounedRelation",
				ObjectRelationTypeEnum.COMPOUNDED);
		templateContext.put("ReferenceRelation",
				ObjectRelationTypeEnum.REFERENCE);

		templateContext.put("queryActionType", ObjectActionEnumType.QUERY);

		templateContext.put("createActionType", ObjectActionEnumType.CREATE);

		templateContext.put("deleteActionType", ObjectActionEnumType.DELETE);

		templateContext.put("updateActionType", ObjectActionEnumType.UPDATE);

		StringWriter fileNameWriter = new StringWriter();

		VELOCITY_ENGINE.evaluate(new VelocityContext(templateContext),
				fileNameWriter, "BusinessTemplate", new StringReader(
						businessTemplateBean.getFileName()));

		templateContext.put("fileName", fileNameWriter.getBuffer().toString());

		File implPackageFileObject = null;

		if (businessTemplateBean.getProviderTypeId() != 0) {

			BusinessTemplateProviderTypeBean providerTypeBean = BUSINESS_TEMPLATE_SERVICE
					.getBusinessTemplateProviderTypeById(businessTemplateBean
							.getProviderTypeId());

			if (StringUtils.isNotBlank(providerTypeBean.getFilePath())) {

				implPackageFileObject = new File(genDir,
						providerTypeBean.getFilePath());

				if (implPackageFileObject.exists() == false) {
					implPackageFileObject.mkdirs();
				}

				templateContext.put("filePath", providerTypeBean.getFilePath());
			}
		}

		StringBuffer fileName = new StringBuffer(fileNameWriter.getBuffer());

		if (StringUtils.isNotBlank(businessTemplateBean.getFileType())) {
			fileName.append(".").append(businessTemplateBean.getFileType());
		}

		File businessFile = new File(
				implPackageFileObject != null ? implPackageFileObject : genDir,
				fileName.toString());

		boolean canWrite = false;

		if (businessFile.exists() == false) {
			businessFile.createNewFile();
			canWrite = true;
		}

		if (canWrite
				|| BooleanUtils.toBoolean(businessTemplateBean
						.getCanOverWrite())) {

			Object edcoding = VELOCITY_ENGINE
					.getProperty(RuntimeConstants.OUTPUT_ENCODING);

			if (edcoding == null) {
				edcoding = "utf-8";
			}

			OutputStreamWriter fileWriter = new OutputStreamWriter(
					new FileOutputStream(businessFile),
					String.valueOf(edcoding));

			VelocityEngineUtils.mergeTemplate(VELOCITY_ENGINE,
					businessTemplateBean.getTemplateName(), templateContext,
					fileWriter);

			fileWriter.flush();

			fileWriter.close();

			// CodeFormatUtils.format(businessFile);

			logger.debug("Write File :" + businessFile.getPath());
		}

	}
}
