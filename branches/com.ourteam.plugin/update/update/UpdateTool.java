package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.jdbc.Driver;
import com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean;
import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.domain.BusinessObjectActionBean;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;
import com.ourteam.modelbase.domain.ServiceFunctionBean;
import com.ourteam.modelbase.domain.ServiceParameterBean;
import com.ourteam.modelbase.service.BusinessDomainServiceFactory;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.BusinessPackageServiceFactory;
import com.ourteam.modelbase.service.IBusinessDomainService;
import com.ourteam.modelbase.service.IBusinessObjectService;
import com.ourteam.modelbase.service.IBusinessPackageService;

public class UpdateTool {

	private static final String[] applictionContexts = new String[] { "applicationContext-app.xml" };

	private static AbstractApplicationContext applictionContext = new ClassPathXmlApplicationContext(
			applictionContexts);

	private static IBusinessDomainService businessDomainService = BusinessDomainServiceFactory
			.getBusinessDomainService();

	private static IBusinessPackageService businessPackageService = BusinessPackageServiceFactory
			.getBusinessPackageService();

	private static IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private static Map<Long, Long> objectMap = new HashMap<Long, Long>();

	private static Map<Long, Long> propertyMap = new HashMap<Long, Long>();

	private static Map<String, Long> customerDataMap = new HashMap<String, Long>();

	public static void main(String[] args) {
		try {

			Driver mysqlDriver = new Driver();

			DriverManager.registerDriver(mysqlDriver);

			BusinessObjectBean[] beans = businessObjectService
					.getBusinessObjectsByType(0,
							BusinessObjectTypeEnum.CUSTOM_DATA_TYPE);

			for (int i = 0; i < beans.length; i++) {
				BusinessObjectBean businessObjectBean = beans[i];
				customerDataMap.put(businessObjectBean.getName(),
						businessObjectBean.getBusinessObjectId());
			}

			updateObject();

			updateProperty();

			updateRelation();

			updateAction();

			updateService();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void updateService() throws Exception {
		Connection connection = getOldDatabaseConnection();

		ResultSet objFunctionResultSet = connection.createStatement()
				.executeQuery(
						"select * from object_function order by object_id");

		while (objFunctionResultSet.next()) {

			if (objectMap.get(objFunctionResultSet.getLong("object_id")) == null) {
				continue;
			}

			ServiceFunctionBean functionBean = new ServiceFunctionBean();

			functionBean.setDescription(objFunctionResultSet
					.getString("description"));
			functionBean.setName(objFunctionResultSet.getString("name"));
			functionBean.setObjectId(objectMap.get(objFunctionResultSet
					.getLong("object_id")));

			ResultSet parameterResultSet = connection
					.createStatement()
					.executeQuery(
							"select a.* from service_parameter as a,function_parameter_relat as b where b.function_id = "
									+ objFunctionResultSet
											.getLong("object_function_id")
									+ " and a.service_parameter_id = b.parameter_id order by b.function_id,a.type,a.sort");

			List<ServiceParameterBean> outList = new ArrayList<ServiceParameterBean>();

			List<ServiceParameterBean> inList = new ArrayList<ServiceParameterBean>();

			while (parameterResultSet.next()) {
				ServiceParameterBean parameterBean = new ServiceParameterBean();

				parameterBean.setDataType(StringUtils.trim(parameterResultSet
						.getString("data_type")));

				parameterBean.setDescription(parameterResultSet
						.getString("description"));

				parameterBean.setIsArray(parameterResultSet.getString(
						"is_array").equals("Y") ? "true" : "false");

				parameterBean.setType(parameterResultSet.getString("type"));

				parameterBean.setName(parameterResultSet.getString("name"));

				parameterBean.setPreProcess(parameterResultSet
						.getString("pre_process"));

				if (parameterResultSet.getObject("sort") != null) {
					parameterBean.setSort(parameterResultSet.getInt("sort"));
				}

				parameterBean.setValidateInfo(parameterResultSet
						.getString("validate_info"));

				long refid = getRefObjectId(parameterBean.getDataType());

				if (refid != 0) {
					parameterBean.setReferenceObjectId(Long.valueOf(refid));
				}

				if ("OUT".equals(parameterBean.getType())) {
					outList.add(parameterBean);
				} else {
					inList.add(parameterBean);
				}

			}

			businessObjectService.addNewServiceFunction(functionBean);

			businessObjectService.setServiceInputParameters(
					functionBean.getObjectFunctionId(),
					inList.toArray(new ServiceParameterBean[inList.size()]));

			businessObjectService.setServiceOutputParameter(
					functionBean.getObjectFunctionId(), outList.get(0));
		}
	}

	public static void updateAction() throws Exception {
		Connection connection = getOldDatabaseConnection();

		ResultSet objActionResultSet = connection.createStatement()
				.executeQuery("select * from object_action order by object_id");

		while (objActionResultSet.next()) {
			if (objectMap.get(objActionResultSet.getLong("object_id")) == null) {
				continue;
			}
			BusinessObjectActionBean actionBean = new BusinessObjectActionBean();
			actionBean.setObjectId(objectMap.get(objActionResultSet
					.getLong("object_id")));
			actionBean.setPropertyId(propertyMap.get(objActionResultSet
					.getLong("property_id")));
			actionBean.setAction(objActionResultSet.getString("action"));
			if ("query".equals(objActionResultSet.getString("action"))) {
				String value = objActionResultSet.getString("property_value");
				String[] values = StringUtils.split(value, " ");
				actionBean.setOperation(StringUtils.trim(values[0]));
				actionBean.setPropertyValue(StringUtils.remove(
						StringUtils.trim(values[1]), "'"));
			} else {
				actionBean.setPropertyValue(objActionResultSet
						.getString("property_value"));
			}

			businessObjectService.addBusinessObjectAction(actionBean);
		}

	}

	public static void updateRelation() throws Exception {

		Connection connection = getOldDatabaseConnection();

		ResultSet objRealtionResultSet = connection
				.createStatement()
				.executeQuery(
						"select * from object_relation order by object_id,relate_type");

		while (objRealtionResultSet.next()) {
			ObjectRelationBean relationBean = new ObjectRelationBean();

			if (objectMap.get(objRealtionResultSet.getLong("object_id")) == null) {
				continue;
			}

			relationBean.setDescription(objRealtionResultSet
					.getString("description"));
			relationBean.setObjectId(objectMap.get(objRealtionResultSet
					.getLong("object_id")));
			relationBean.setRelatedObjectId(objectMap.get(objRealtionResultSet
					.getLong("related_object_id")));

			if ("RELATED".equals(objRealtionResultSet.getString("relate_type"))) {
				if ("ONE_TO_MANY".equals(objRealtionResultSet
						.getString("relate_config"))) {
					relationBean.setRelateType("RELATED_OPERATION");
				} else {
					relationBean.setRelateType("RELATED_VIEW");
					relationBean.setRelateConfig(objRealtionResultSet
							.getString("description"));
				}
			} else if ("EXTEND".equals(objRealtionResultSet
					.getString("relate_type"))) {
				BusinessObjectBean objectBean = businessObjectService
						.getBusinessObjectById(relationBean.getObjectId());

				if (objectBean.getType().equals(
						BusinessObjectTypeEnum.SERVICE.getName())) {
					relationBean.setRelateType(ObjectRelationTypeEnum.DEPENDED
							.getName());
				} else if (objectBean.getType().equals(
						BusinessObjectTypeEnum.DAO.getName())) {
					relationBean.setRelateType(ObjectRelationTypeEnum.EXTEND
							.getName());
				}
			}

			ResultSet objRealtionAttrResultSet = connection.createStatement()
					.executeQuery(
							"select * from object_relation_attr where object_relation_id = "
									+ objRealtionResultSet
											.getLong("object_relation_id"));

			List<ObjectRelationAttrBean> attrBeans = new ArrayList<ObjectRelationAttrBean>();

			while (objRealtionAttrResultSet.next()) {
				ObjectRelationAttrBean relationAttrBean = new ObjectRelationAttrBean();

				relationAttrBean.setPropertyId(propertyMap
						.get(objRealtionAttrResultSet.getLong("property_id")));

				relationAttrBean.setRelatedPropertyId(propertyMap
						.get(objRealtionAttrResultSet
								.getLong("related_property_id")));

				if ("RELATED".equals(objRealtionResultSet
						.getString("relate_type"))) {
					relationAttrBean
							.setRelateAttrType(ObjectRelationAttrTypeEnum.RELATED
									.getName());
				}

				attrBeans.add(relationAttrBean);

			}

			if (relationBean.getRelateConfig() != null) {

				ResultSet objRealteViewAttrResultSet = connection
						.createStatement()
						.executeQuery(
								"select c.* from properties_mapping as c,object_property as a where c.business_property_id = a.object_property"
										+ " and a.object_id = "
										+ objRealtionResultSet
												.getString("object_id")
										+ " and c.state = '"
										+ relationBean.getRelateConfig() + "'");

				while (objRealteViewAttrResultSet.next()) {
					if (propertyMap.get(objRealteViewAttrResultSet
							.getLong("business_property_id")) == null) {
						continue;
					}

					ObjectRelationAttrBean relationAttrBean = new ObjectRelationAttrBean();

					relationAttrBean.setPropertyId(propertyMap
							.get(objRealteViewAttrResultSet
									.getLong("business_property_id")));

					System.out
							.println("select * from properties_mapping as a,object_property as b where a.persistent_property_id = "
									+ objRealteViewAttrResultSet
											.getLong("persistent_property_id")
									+ " and b.object_id = "
									+ objRealtionResultSet
											.getString("related_object_id")
									+ " and a.business_property_id = b.object_property ");

					ResultSet tmpResultSet = connection
							.createStatement()
							.executeQuery(
									"select * from properties_mapping as a,object_property as b where a.persistent_property_id = "
											+ objRealteViewAttrResultSet
													.getLong("persistent_property_id")
											+ " and b.object_id = "
											+ objRealtionResultSet
													.getString("related_object_id")
											+ " and a.business_property_id = b.object_property ");

					if (tmpResultSet.next()) {
						relationAttrBean.setRelatedPropertyId(propertyMap
								.get(tmpResultSet.getLong("object_property")));
					}
					tmpResultSet.close();

					relationAttrBean
							.setRelateAttrType(ObjectRelationAttrTypeEnum.MAPPED
									.getName());

					attrBeans.add(relationAttrBean);

				}
			}

			relationBean.setRelationAttrBeans(attrBeans
					.toArray(new ObjectRelationAttrBean[attrBeans.size()]));

			businessObjectService
					.addBusinessObjectRelations(new ObjectRelationBean[] { relationBean });

		}

		ResultSet objMappingResultSet = connection
				.createStatement()
				.executeQuery(
						"select * from object_mapping order by business_object_id");

		while (objMappingResultSet.next()) {

			if (objectMap
					.get(objMappingResultSet.getLong("business_object_id")) == null) {
				continue;
			}

			ObjectRelationBean relationBean = new ObjectRelationBean();

			relationBean.setObjectId(objectMap.get(objMappingResultSet
					.getLong("business_object_id")));
			relationBean.setRelatedObjectId(objectMap.get(objMappingResultSet
					.getLong("persistent_object_id")));

			BusinessObjectBean objectBean = businessObjectService
					.getBusinessObjectById(relationBean.getObjectId());

			if (objectBean.getType().equals(
					BusinessObjectTypeEnum.DAO.getName())) {
				relationBean.setRelateType(ObjectRelationTypeEnum.MAPPED
						.getName());
			} else if (objectBean.getType().equals(
					BusinessObjectTypeEnum.JAVA_CLASS.getName())) {
				relationBean.setRelateType(ObjectRelationTypeEnum.COMPOUNDED
						.getName());
			}

			ResultSet objRealtionAttrResultSet = connection
					.createStatement()
					.executeQuery(
							"select c.* from properties_mapping as c,object_property as a, object_property as b where c.business_property_id = a.object_property and c.persistent_property_id = b.object_property"
									+ " and a.object_id = "
									+ objMappingResultSet
											.getString("business_object_id")
									+ " and b.object_id = "
									+ objMappingResultSet
											.getString("persistent_object_id"));

			List<ObjectRelationAttrBean> attrBeans = new ArrayList<ObjectRelationAttrBean>();

			while (objRealtionAttrResultSet.next()) {

				if (propertyMap.get(objRealtionAttrResultSet
						.getLong("business_property_id")) == null) {
					continue;
				}

				ObjectRelationAttrBean relationAttrBean = new ObjectRelationAttrBean();

				relationAttrBean.setPropertyId(propertyMap
						.get(objRealtionAttrResultSet
								.getLong("business_property_id")));

				relationAttrBean.setRelatedPropertyId(propertyMap
						.get(objRealtionAttrResultSet
								.getLong("persistent_property_id")));

				relationAttrBean
						.setRelateAttrType(ObjectRelationAttrTypeEnum.MAPPED
								.getName());

				attrBeans.add(relationAttrBean);

			}

			relationBean.setRelationAttrBeans(attrBeans
					.toArray(new ObjectRelationAttrBean[attrBeans.size()]));

			businessObjectService
					.addBusinessObjectRelations(new ObjectRelationBean[] { relationBean });

		}

	}

	public static void updateProperty() throws Exception {

		Connection connection = getOldDatabaseConnection();

		ResultSet propertyResultSet = connection
				.createStatement()
				.executeQuery(
						"select * from object_property order by object_id,order_index");

		BusinessObjectBean objectBean = null;

		List<ObjectPropertyBean> propertyList = new ArrayList<ObjectPropertyBean>();

		List<Long> oldPropertyIds = new ArrayList<Long>();

		while (propertyResultSet.next()) {

			if (objectBean == null
					|| objectBean.getBusinessObjectId() != objectMap.get(
							propertyResultSet.getLong("object_id")).longValue()) {

				if (propertyList.isEmpty() == false) {

					businessObjectService
							.addNewBusinessObjectProperties((ObjectPropertyBean[]) propertyList
									.toArray(new ObjectPropertyBean[propertyList
											.size()]));
				}

				objectBean = businessObjectService
						.getBusinessObjectById(objectMap.get(
								propertyResultSet.getLong("object_id"))
								.longValue());

				for (int i = 0; i < oldPropertyIds.size(); i++) {
					propertyMap.put(oldPropertyIds.get(i), propertyList.get(i)
							.getObjectPropertyId());
				}

				oldPropertyIds.clear();
				propertyList.clear();
			}

			oldPropertyIds.add(propertyResultSet.getLong("object_property"));

			ObjectPropertyBean propertyBean = new ObjectPropertyBean();
			propertyBean.setObjectId(objectBean.getBusinessObjectId());
			propertyBean.setDataSize(propertyResultSet.getInt("data_size"));
			propertyBean.setDescription(propertyResultSet
					.getString("description"));
			if (StringUtils.contains(propertyResultSet.getString("type"),
					"ALLOW_NULL")) {
				propertyBean.setIsAllowNull("true");
			} else {
				propertyBean.setIsAllowNull("false");
			}

			if (StringUtils.contains(propertyResultSet.getString("type"),
					"GET_SET_TYPE")) {
				propertyBean.setWritable("true");
				propertyBean.setReadable("true");
			} else if (StringUtils.contains(
					propertyResultSet.getString("type"), "SET_TYPE")) {
				propertyBean.setWritable("true");
				propertyBean.setReadable("false");
			} else if (StringUtils.contains(
					propertyResultSet.getString("type"), "GET_TYPE")) {
				propertyBean.setWritable("false");
				propertyBean.setReadable("true");
			}

			if (StringUtils.contains(propertyResultSet.getString("data_type"),
					"[]")) {
				propertyBean.setIsArray("true");
			}

			propertyBean.setIsEnum(propertyResultSet.getString("is_enum"));

			propertyBean.setIsGenerate(propertyResultSet
					.getString("is_generate"));

			propertyBean.setIsPrimaryProperty(propertyResultSet
					.getString("is_primary_property"));

			propertyBean.setName(propertyResultSet.getString("name"));

			propertyBean.setDataType(StringUtils.remove(
					propertyResultSet.getString("data_type"), "[]"));

			if ("PERSISTENT_PROPERTY".equals(propertyResultSet
					.getString("property_kind")) == false) {

				long refid = getRefObjectId(propertyBean.getDataType());

				if (refid != 0) {
					propertyBean.setReferenceObjectId(Long.valueOf(refid));
				}
			}

			propertyBean.setObjectId(objectMap.get(propertyResultSet
					.getLong("object_id")));

			propertyBean.setOrderIndex(propertyResultSet.getInt("order_index"));

			propertyBean.setPrecisionSize(0);

			propertyBean.setPropertyKind(propertyResultSet
					.getString("property_kind"));

			propertyBean.setValue(propertyResultSet.getString("value"));

			propertyList.add(propertyBean);

		}
	}

	public static void updateObject() throws Exception {
		Connection connection = getOldDatabaseConnection();

		ResultSet resultSet = connection.createStatement().executeQuery(
				"select * from business_domain");

		while (resultSet.next()) {
			BusinessDomainBean domainBean = new BusinessDomainBean();
			domainBean.setCode(resultSet.getString("code"));
			domainBean.setName(resultSet.getString("name"));
			domainBean.setDescription(resultSet.getString("description"));
			businessDomainService.addNewBusinessDomain(domainBean);

			ResultSet packageResultSet = connection.createStatement()
					.executeQuery(
							"select * from business_package where business_domain_id = "
									+ resultSet.getLong("business_domain_id"));

			while (packageResultSet.next()) {
				BusinessPackageBean packageBean = new BusinessPackageBean();
				packageBean.setBusinessDomainId(domainBean
						.getBusinessDomainId());
				packageBean.setDescription(packageResultSet
						.getString("description"));
				packageBean.setName(packageResultSet.getString("name"));
				packageBean.setState(packageResultSet.getString("state"));
				if (StringUtils.endsWith(packageBean.getName(), "domain")) {
					packageBean.setType("SERVICE_PACKAGE");
				} else {
					packageBean.setType(packageResultSet.getString("type"));
				}

				businessPackageService.addNewBusinessPackage(packageBean);

				ResultSet objectResultSet = connection
						.createStatement()
						.executeQuery(
								"select * from business_object where state = 'U' and package_id = "
										+ packageResultSet
												.getLong("business_package_id"));

				while (objectResultSet.next()) {
					BusinessObjectBean objectBean = new BusinessObjectBean();
					objectBean.setPackageId(packageBean.getBusinessPackageId());
					objectBean.setDescription(objectResultSet
							.getString("description"));
					objectBean.setName(objectResultSet.getString("name"));

					String objectType = objectResultSet.getString("type");

					if ("INTERFACE".equals(objectType)) {
						objectBean
								.setType(BusinessObjectTypeEnum.DAO.getName());
						objectBean.setName(StringUtils.substringAfter(
								objectBean.getName(), "I"));
					} else if ("SERVICE".equals(objectType)) {
						objectBean.setType(BusinessObjectTypeEnum.SERVICE
								.getName());
						objectBean.setName(StringUtils.substringAfter(
								objectBean.getName(), "I"));
					} else if ("PERSISTENT".equals(objectType)) {
						objectBean.setType(BusinessObjectTypeEnum.PERSISTENT
								.getName());
					} else if ("ENUM".equals(objectType)) {
						objectBean.setType(BusinessObjectTypeEnum.ENUM
								.getName());
						objectBean.setValuedEnum(Boolean
								.valueOf(objectResultSet
										.getInt("generate_option") == 1));
					} else if ("JAVA_CLASS".equals(objectType)) {
						objectBean.setType(BusinessObjectTypeEnum.JAVA_CLASS
								.getName());
					}

					businessObjectService.addNewBusinessObject(objectBean);

					objectMap.put(
							objectResultSet.getLong("business_object_id"),
							objectBean.getBusinessObjectId());
				}
			}
		}
	}

	protected static long getRefObjectId(String dataType) throws Exception {

		long refid = 0;

		Connection connection = getOldDatabaseConnection();

		if (dataType != null && "void".equals(dataType) == false) {

			if (customerDataMap.containsKey(dataType)) {
				refid = customerDataMap.get(dataType);
			} else {
				System.out.println("select a.* from business_object as a,business_package as b where CONCAT(b.NAME,'.',a.NAME) = '"
										+ dataType + "'");
				ResultSet refResultSet = connection
						.createStatement()
						.executeQuery(
								"select a.* from business_object as a,business_package as b where CONCAT(b.NAME,'.',a.NAME) = '"
										+ dataType + "' and a.state = 'U'");
				if (refResultSet.next()) {
					refid = objectMap.get(refResultSet
							.getLong("business_object_id"));
				} else {

					if (StringUtils.contains(dataType, "DAOQueryBean")) {
						BusinessObjectDAOQueryBean queryBean = new BusinessObjectDAOQueryBean();

						String[] names = StringUtils.split(dataType, ".");

						queryBean.setDistinct(true);

						queryBean
								.createCriteria()
								.andPackageNameEqualTo(
										StringUtils.join(names, ".", 0,
												names.length - 2))
								.andNameEqualTo(names[names.length - 1]);

						BusinessObjectBean[] objectBeans = businessObjectService
								.queryBusinessObjects(queryBean);

						if (ArrayUtils.isNotEmpty(objectBeans)) {
							refid = objectBeans[0].getBusinessObjectId();
						}

					} else {
						BusinessObjectBean custData = new BusinessObjectBean();
						custData.setName(StringUtils.trim(dataType));
						custData.setPackageId(0);
						custData.setType(BusinessObjectTypeEnum.CUSTOM_DATA_TYPE
								.getName());

						businessObjectService.addNewBusinessObject(custData);

						customerDataMap.put(custData.getName(),
								custData.getBusinessObjectId());

						refid = custData.getBusinessObjectId();
					}

				}

			}
		}

		return refid;
	}

	public static Connection getOldDatabaseConnection() throws Exception {
		return DriverManager
				.getConnection(
						"jdbc:mysql://localhost:3308/our_team_designbase?useUnicode=true&characterEncoding=UTF-8",
						"root", "password");
	}
}
