package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.jdbc.Driver;
import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;
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

	public static void main(String[] args) {
		try {

			Driver mysqlDriver = new Driver();

			DriverManager.registerDriver(mysqlDriver);

			updateObject();

			updateProperty();

		} catch (Exception e) {
			e.printStackTrace();
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

			relationBean.setDescription(objRealtionResultSet
					.getString("description"));
			relationBean.setObjectId(objectMap.get(objRealtionResultSet
					.getString("object_id")));
			relationBean.setRelatedObjectId(objectMap.get(objRealtionResultSet
					.getString("related_object_id")));

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
				
				if(objectBean.getType().equals(BusinessObjectTypeEnum.SERVICE.getName())){
					relationBean.setRelateType(ObjectRelationTypeEnum.DEPENDED.getName());
				}
				else if(objectBean.getType().equals(BusinessObjectTypeEnum.DAO.getName())){
					relationBean.setRelateType(ObjectRelationTypeEnum.EXTEND.getName());
				}
				
				
			}

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
			propertyBean.setDataType(propertyResultSet.getString("data_type"));
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

			propertyBean.setName(StringUtils.remove(
					propertyResultSet.getString("name"), "[]"));

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
					} else if ("SERVICE".equals(objectType)) {
						objectBean.setType(BusinessObjectTypeEnum.SERVICE
								.getName());
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

	public static Connection getOldDatabaseConnection() throws Exception {
		return DriverManager
				.getConnection(
						"jdbc:mysql://localhost:3308/our_team_designbase?useUnicode=true&characterEncoding=UTF-8",
						"root", "password");
	}
}
