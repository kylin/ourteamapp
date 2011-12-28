package net.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.dao.BaseQueryBean.Join;
import net.dao.BaseQueryBean.SelectProperty;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;

public class SQLBuilder {

	public static final String MYSQL = "mysql";

	public static final String ORACLE = "oracle";

	private String databaseType;

	private String entityName;

	private String[] entityFields;

	private String[] entityProperties;

	private String[] entityPKFields;

	private String[] entityAutoGenPKFields;

	private String[] entityUniqueFields;

	private String relatedJoinSQL;

	private String baiscQueryFilter;

	public SQLBuilder(String databaseType) {
		super();
		this.databaseType = databaseType;
	}

	public String getDatabaseType() {
		return databaseType;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String[] getEntityFields() {
		return entityFields;
	}

	public void setEntityFields(String[] entityFields) {
		this.entityFields = entityFields;
	}

	public String[] getEntityProperties() {
		return entityProperties;
	}

	public void setEntityProperties(String[] entityProperties) {
		this.entityProperties = entityProperties;
	}

	public String[] getEntityPKFields() {
		return entityPKFields;
	}

	public void setEntityPKFields(String[] entityPKFields) {
		this.entityPKFields = entityPKFields;
	}

	public String[] getEntityAutoGenPKFields() {
		return entityAutoGenPKFields;
	}

	public void setEntityAutoGenPKFields(String[] entityAutoGenPKFields) {
		this.entityAutoGenPKFields = entityAutoGenPKFields;
	}

	public String[] getEntityUniqueFields() {
		return entityUniqueFields;
	}

	public void setEntityUniqueFields(String[] entityUniqueFields) {
		this.entityUniqueFields = entityUniqueFields;
	}

	public String getRelatedJoinSQL() {
		return relatedJoinSQL;
	}

	public void setRelatedJoinSQL(String relatedJoinSQL) {
		this.relatedJoinSQL = relatedJoinSQL;
	}

	public String getBaiscQueryFilter() {
		return baiscQueryFilter;
	}

	public void setBaiscQueryFilter(String baiscQueryFilter) {
		this.baiscQueryFilter = baiscQueryFilter;
	}

	protected String buildQueryCountSQL() {

		String pks = StringUtils.join(getEntityPKFields(), ",");

		StringBuffer sqlBuffer = new StringBuffer("SELECT count( distinct  ")
				.append(pks).append(") AS totalCount_ FROM ")
				.append(getEntityName()).append(" ");

		String relatedJoinSQL = getRelatedJoinSQL();

		if (StringUtils.isNotBlank(relatedJoinSQL)) {
			sqlBuffer.append(" ");
			sqlBuffer.append(relatedJoinSQL);
			sqlBuffer.append(" ");
		}

		return sqlBuffer.toString();
	}

	public String getIsNullFunction(String aField) throws Exception {
		StringBuffer isNullFunction = new StringBuffer();

		if (MYSQL.equalsIgnoreCase(getDatabaseType())) {
			isNullFunction.append("isNull(").append(aField).append(")");
		} else if (ORACLE.equalsIgnoreCase(getDatabaseType())) {
			isNullFunction.append("nvl2(").append(aField).append(",0,1)");
		}

		return isNullFunction.toString();
	}

	public String buildLimitSQL(String sql, BaseQueryBean aBaseQueryBean)
			throws Exception {

		StringBuffer limitSQL = new StringBuffer();

		if (MYSQL.equalsIgnoreCase(getDatabaseType())) {
			limitSQL.append(sql);
			if (aBaseQueryBean.getMaxResults() > -1) {
				limitSQL.append(" LIMIT ").append(aBaseQueryBean.getStart())
						.append(",").append(aBaseQueryBean.getMaxResults());
			}
		} else if (ORACLE.equalsIgnoreCase(getDatabaseType())) {
			if (aBaseQueryBean.getMaxResults() > -1) {
				limitSQL.append(
						"SELECT * FROM (SELECT a.*,rownum row_num FROM (")
						.append(sql)
						.append(") a) b WHERE b.row_num BETWEEN ")
						.append(aBaseQueryBean.getStart() + 1)
						.append(" AND ")
						.append(aBaseQueryBean.getStart()
								+ aBaseQueryBean.getMaxResults());
			} else {
				limitSQL.append(sql);
			}
		} else {
			limitSQL.append(sql);
		}

		return limitSQL.toString();
	}

	public String buildDeleteSQL(String entityName) {
		StringBuffer deleteSQL = new StringBuffer("DELETE ")
				.append(getEntityName());
		deleteSQL.append(" FROM ").append(entityName).append(" ");

		return deleteSQL.toString();

	}

	public String buildQuerySQL(String entityName, String[] entityFields,
			String[] entityProperties, BaseQueryBean aBaseQueryBean)
			throws Exception {
		StringBuffer sqlBuffer = new StringBuffer("SELECT ");

		if (aBaseQueryBean != null && aBaseQueryBean.isDistinct()) {
			sqlBuffer.append("DISTINCT ");
		}

		String[] fields = entityFields;

		String[] properties = entityProperties;

		int fieldIndex = 0;

		for (int i = 0; i < fields.length; i++) {
			String field = fields[i];
			String property = properties[i];
			if (fieldIndex++ > 0) {
				sqlBuffer.append(",");
			}
			sqlBuffer.append(field);
			sqlBuffer.append(",");
			sqlBuffer.append(getIsNullFunction(field)).append(" AS is")
					.append(StringUtils.capitalize(property)).append("Null");

		}

		sqlBuffer.append(" FROM ").append(entityName).append(" ");

		String relatedJoinSQL = getRelatedJoinSQL();

		if (StringUtils.isNotBlank(relatedJoinSQL)) {
			sqlBuffer.append(" ");
			sqlBuffer.append(relatedJoinSQL);
			sqlBuffer.append(" ");
		}

		return sqlBuffer.toString();
	}

	public String buildQuerySQL(BaseQueryBean aBaseQueryBean) throws Exception {

		return buildQuerySQL(getEntityName(), getEntityFields(),
				getEntityProperties(), aBaseQueryBean);
	}

	public String buildSelectiveQuerySQL(String entityName,
			BaseQueryBean aBaseQueryBean) {
		StringBuffer selectiveQuerySQL = new StringBuffer("SELECT ");

		if (aBaseQueryBean.isDistinct()) {
			selectiveQuerySQL.append("DISTINCT ");
		}

		List selectiveList = aBaseQueryBean.getSelectProperties();

		int selectiveIndex = 0;

		for (Iterator iterator = selectiveList.iterator(); iterator.hasNext();) {
			SelectProperty selectProperty = (SelectProperty) iterator.next();
			if (selectiveIndex++ > 0) {
				selectiveQuerySQL.append(",");
			}
			selectiveQuerySQL.append(selectProperty.getProperty());
			if (StringUtils.isNotBlank(selectProperty.getAlias())) {
				selectiveQuerySQL.append(" AS ");
				selectiveQuerySQL.append(selectProperty.getAlias());
			}

			selectiveQuerySQL.append(" ");
		}

		selectiveQuerySQL.append(" FROM ").append(entityName).append(" ");

		String relatedJoinSQL = getRelatedJoinSQL();

		if (StringUtils.isNotBlank(relatedJoinSQL)) {
			selectiveQuerySQL.append(" ");
			selectiveQuerySQL.append(relatedJoinSQL);
			selectiveQuerySQL.append(" ");
		}

		return selectiveQuerySQL.toString();
	}

	public String buildJoinSQL(BaseQueryBean aBaseQueryBean, List parameterList) {

		if (aBaseQueryBean == null) {
			return "";
		}

		StringBuffer joinBuffer = new StringBuffer("");

		List joinList = aBaseQueryBean.getJoinList();

		for (Iterator iterator = joinList.iterator(); iterator.hasNext();) {
			Join join = (Join) iterator.next();
			joinBuffer.append(join.getJoinType()).append(" JOIN ");
			joinBuffer.append(join.getTableName());
			if (StringUtils.isNotBlank(join.getTableAlias())) {
				joinBuffer.append(join.getTableAlias());
			}
			joinBuffer.append(" ON ").append(
					buildWhereCriteriaSQL(join.getJoinCriterion(),
							parameterList));
		}

		return joinBuffer.toString();
	}

	public String buildWhereCriteriaSQL(BaseQueryBean aBaseQueryBean,
			List parameterList) {
		StringBuffer sqlBuffer = new StringBuffer("");

		List oredList = aBaseQueryBean.getOredCriteria();

		int criterionIndex = 0;

		int oredIndex = 0;

		for (Iterator iterator = oredList.iterator(); iterator.hasNext();) {
			BaseWhereCriterion criterion = (BaseWhereCriterion) iterator.next();
			if (criterion.getValid()) {
				criterionIndex = 0;

				if (oredIndex++ > 0) {
					sqlBuffer.append(" OR ");
				}

				sqlBuffer.append("(");

				List criteriaWithoutValueList = criterion
						.getCriteriaWithoutValue();

				for (Iterator iterator2 = criteriaWithoutValueList.iterator(); iterator2
						.hasNext();) {
					if (criterionIndex++ > 0) {
						sqlBuffer.append(" AND ");
					}
					sqlBuffer.append(iterator2.next());
				}

				List criteriaWithSingleValueList = criterion
						.getCriteriaWithSingleValue();

				for (Iterator iterator2 = criteriaWithSingleValueList
						.iterator(); iterator2.hasNext();) {
					Map conMap = (Map) iterator2.next();
					if (criterionIndex++ > 0) {
						sqlBuffer.append(" AND (");
					} else {
						sqlBuffer.append(" (");
					}
					sqlBuffer.append(conMap.get("condition"));
					sqlBuffer.append(" ? )");
					parameterList.add(conMap.get("value"));
				}

				List criteriaWithListValueList = criterion
						.getCriteriaWithListValue();

				for (Iterator iterator2 = criteriaWithListValueList.iterator(); iterator2
						.hasNext();) {
					Map conMap = (Map) iterator2.next();
					if (criterionIndex++ > 0) {
						sqlBuffer.append(" AND ");
					}
					sqlBuffer.append(conMap.get("condition"));
					List values = (List) conMap.get("values");
					sqlBuffer.append(" (");
					int index = 0;
					for (Iterator iterator3 = values.iterator(); iterator3
							.hasNext();) {
						if (index++ > 0) {
							sqlBuffer.append(",");
						}
						sqlBuffer.append(" ? ");
						parameterList.add(iterator3.next());
					}
					sqlBuffer.append(")");
				}

				List criteriaWithBetweenValueList = criterion
						.getCriteriaWithBetweenValue();

				for (Iterator iterator2 = criteriaWithBetweenValueList
						.iterator(); iterator2.hasNext();) {
					Map conMap = (Map) iterator2.next();
					if (criterionIndex++ > 0) {
						sqlBuffer.append(" AND ");
					}
					sqlBuffer.append(conMap.get("condition"));
					sqlBuffer.append(" ? AND ?");
					List values = (List) conMap.get("values");
					parameterList.addAll(values);
				}

				List criteriaWithForeignList = criterion
						.getCriteriaWithForeignKey();

				for (Iterator iterator2 = criteriaWithForeignList.iterator(); iterator2
						.hasNext();) {
					if (criterionIndex++ > 0) {
						sqlBuffer.append(" AND ");
					}
					sqlBuffer.append(iterator2.next());
				}

				List criteriaWithSubQuery = criterion.getCriteriaWithSubQuery();

				for (Iterator iterator2 = criteriaWithSubQuery.iterator(); iterator2
						.hasNext();) {
					Map conMap = (Map) iterator2.next();
					if (criterionIndex++ > 0) {
						sqlBuffer.append(" AND ");
					}
					sqlBuffer.append(conMap.get("condition"));
					SQLBean values = (SQLBean) conMap.get("values");
					sqlBuffer.append(" (");

					sqlBuffer.append(values.getSql());

					sqlBuffer.append(")");

					parameterList.addAll(Arrays.asList(values.getParameters()));
				}

				sqlBuffer.append(")");
			}
		}

		return sqlBuffer.toString();
	}

	public String[] getAutoGenPkFields(String[] autoGenPkFields) {

		String[] sqls = new String[autoGenPkFields.length];

		for (int i = 0; i < autoGenPkFields.length; i++) {

			StringBuffer buffer = new StringBuffer();

			if (SQLBuilder.ORACLE.equalsIgnoreCase(getDatabaseType())) {

				buffer.append("SELECT ")
						.append(StringUtils.replace(autoGenPkFields[i], ".",
								"_")).append("_SEQ.NEXTVAL AS ID FROM DUAL");

			} else if (SQLBuilder.MYSQL.equalsIgnoreCase(getDatabaseType())) {
				buffer.append("SELECT @@IDENTITY AS ").append(
						StringUtils.replace(autoGenPkFields[i], ".", "_"));
			}

			sqls[i] = buffer.toString();

		}

		return sqls;

	}

	public String buildInsertSQL(Object aObject, List<Object> parameters)
			throws Exception {

		String[] fields = getEntityFields();

		String[] properties = getEntityProperties();

		String[] autoGenPkFields = getEntityAutoGenPKFields();

		String databaseType = getDatabaseType();

		StringBuffer sql = new StringBuffer("INSERT INTO ");

		sql.append(getEntityName());
		sql.append("(");

		StringBuffer values = new StringBuffer(" VALUES(");
		int fieldIndex = 0;

		String entityNamePreFix = getEntityName() + ".";

		for (int i = 0; i < fields.length; i++) {
			String field = fields[i];
			String property = properties[i];

			if ((MYSQL.equals(databaseType) && ArrayUtils.contains(
					autoGenPkFields, field))
					|| StringUtils.contains(field, entityNamePreFix) == false) {
				continue;
			}

			Object value = PropertyUtils.getProperty(aObject, property);

			if (value == null) {
				continue;
			}
			if (fieldIndex++ > 0) {
				sql.append(",");
				values.append(",");
			}
			sql.append(field);
			values.append("?");

			parameters.add(value);
		}
		values.append(")");
		sql.append(")");

		sql.append(values);

		return sql.toString();

	}

	public String buildUpdateSQL(Object aObject, List<Object> pkParameters,
			List<Object> parameters) throws Exception {

		String[] fields = getEntityFields();

		String[] pkFields = getEntityPKFields();

		String[] properties = getEntityProperties();

		StringBuffer sql = new StringBuffer("UPDATE ");

		sql.append(getEntityName());
		sql.append(" SET ");

		int fieldIndex = 0;

		String entityNamePreFix = getEntityName() + ".";

		for (int i = 0; i < fields.length; i++) {
			String field = fields[i];
			String property = properties[i];
			Object value = PropertyUtils.getProperty(aObject, property);

			if (ArrayUtils.contains(pkFields, field)) {
				pkParameters.add(value);
				continue;
			}

			if (StringUtils.contains(field, entityNamePreFix) == false) {
				continue;
			}

			Boolean setted = (Boolean) PropertyUtils.getProperty(aObject,
					property + "Setted");

			Boolean nullValue = (Boolean) PropertyUtils.getProperty(aObject,
					property + "Null");

			if (BooleanUtils.isTrue(nullValue)) {
				if (fieldIndex > 0) {
					sql.append(",");
				}
				sql.append(field).append("= NULL ");
				fieldIndex++;
			} else if (value != null && BooleanUtils.isTrue(setted)) {
				if (fieldIndex > 0) {
					sql.append(",");
				}
				sql.append(field).append("=? ");
				parameters.add(value);
				fieldIndex++;
			}
		}

		sql.append(" WHERE ");

		for (int i = 0; i < pkFields.length; i++) {
			String PkField = pkFields[i];
			if (i > 0) {
				sql.append(" AND ");
			}
			sql.append(PkField).append("=? ");
		}

		parameters.addAll(pkParameters);

		return sql.toString();
	}

	public String buildUpdateByQuerySQL(String entityName,
			String[] entityFields, String[] entityProperties, String joinSQL,
			Object aObject, BaseQueryBean aQueryBean, List<Object> parameters)
			throws Exception {

		String[] fields = entityFields;

		String[] properties = entityProperties;

		String[] pkFields = getEntityPKFields();

		StringBuffer sql = new StringBuffer("UPDATE ");

		sql.append(entityName);

		if (StringUtils.isNotBlank(joinSQL)) {
			sql.append(" ");
			sql.append(joinSQL);
			sql.append(" ");
		}

		if (aQueryBean != null) {
			sql.append(buildJoinSQL(aQueryBean, parameters));
		}

		sql.append(" SET ");

		int fieldIndex = 0;

		String entityNamePreFix = getEntityName() + ".";

		for (int i = 0; i < fields.length; i++) {
			String field = fields[i];

			if (ArrayUtils.contains(pkFields, field)
					|| StringUtils.contains(field, entityNamePreFix) == false) {
				continue;
			}

			String property = properties[i];
			Object value = PropertyUtils.getProperty(aObject, property);

			Boolean setted = (Boolean) PropertyUtils.getProperty(aObject,
					property + "Setted");

			Boolean nullValue = (Boolean) PropertyUtils.getProperty(aObject,
					property + "Null");

			if (BooleanUtils.isTrue(nullValue)) {
				if (fieldIndex > 0) {
					sql.append(",");
				}
				sql.append(field).append("= NULL ");
				fieldIndex++;
			} else if (value != null && BooleanUtils.isTrue(setted)) {
				if (fieldIndex > 0) {
					sql.append(",");
				}
				sql.append(field).append("=? ");
				parameters.add(value);
				fieldIndex++;
			}
		}

		String basicQueryFilter = getBaiscQueryFilter();

		if (StringUtils.isNotBlank(basicQueryFilter)) {
			sql.append(" WHERE ").append(basicQueryFilter);
		}

		if (aQueryBean != null) {
			String whereSQL = buildWhereCriteriaSQL(aQueryBean, parameters);
			if (StringUtils.isNotBlank(whereSQL)) {
				if (StringUtils.isNotBlank(basicQueryFilter)) {
					sql.append(" AND ");
				} else {
					sql.append(" WHERE ");
				}
				sql.append(whereSQL);
			}
		}

		return sql.toString();

	}

	public String buildDeleteByQuerySQL(String entityName, String joinSQL,
			BaseQueryBean aQueryBean, List<Object> parameters) throws Exception {
		StringBuffer sql = new StringBuffer();

		sql.append(buildDeleteSQL(entityName));

		if (StringUtils.isNotBlank(joinSQL)) {
			sql.append(" ");
			sql.append(joinSQL);
			sql.append(" ");
		}

		sql.append(buildJoinSQL(aQueryBean, parameters));

		String basicQueryFilter = getBaiscQueryFilter();

		String whereSQL = buildWhereCriteriaSQL(aQueryBean, parameters);

		if (StringUtils.isNotBlank(basicQueryFilter)) {
			sql.append(" WHERE ");
			sql.append(basicQueryFilter);
		}

		if (StringUtils.isNotBlank(whereSQL)) {
			if (StringUtils.isNotBlank(basicQueryFilter)) {
				sql.append(" AND ");
			} else {
				sql.append(" WHERE ");
			}
			sql.append(whereSQL);
		}

		return sql.toString();

	}

	public String buildFindByIdSQL(Object[] ids) throws Exception {

		StringBuffer sql = new StringBuffer();

		String querySQL = buildQuerySQL(null);

		sql.append(querySQL);

		String basicQueryFilter = getBaiscQueryFilter();

		if (StringUtils.isNotBlank(basicQueryFilter)) {
			sql.append(" WHERE ").append(basicQueryFilter).append(" AND ");
		} else {
			sql.append(" WHERE ");
		}

		String[] pkFields = getEntityPKFields();

		for (int i = 0; i < pkFields.length; i++) {
			String pkField = pkFields[i];
			if (i > 0) {
				sql.append(" AND ");
			}
			sql.append(pkField).append("=?");
		}

		return sql.toString();
	}

	public String buildQuerySelectiveSQL(String entityName,
			BaseQueryBean aQueryBean, String aJionSQL,
			List<Object> queryParameters) throws Exception {

		String querySQL = buildSelectiveQuerySQL(entityName, aQueryBean);

		String joinSQL = buildJoinSQL(aQueryBean, queryParameters);

		String basicQueryFilter = getBaiscQueryFilter();

		String whereSQL = buildWhereCriteriaSQL(aQueryBean, queryParameters);

		String orderSQL = buildOrderSQL(aQueryBean);

		String groupSQL = buildGroupSQL(aQueryBean);

		StringBuffer sql = new StringBuffer();

		sql.append(querySQL);

		if (StringUtils.isNotBlank(aJionSQL)) {
			sql.append(" ");
			sql.append(aJionSQL);
			sql.append(" ");
		}

		sql.append(joinSQL);

		if (StringUtils.isNotBlank(basicQueryFilter)) {
			sql.append(" WHERE ");
			sql.append(basicQueryFilter);
		}

		if (StringUtils.isNotBlank(whereSQL)) {
			if (StringUtils.isNotBlank(basicQueryFilter)) {
				sql.append(" AND ");
			} else {
				sql.append(" WHERE ");
			}
			sql.append(whereSQL);
		}

		sql.append(groupSQL);

		sql.append(orderSQL);

		String pagingSQL = buildLimitSQL(sql.toString(), aQueryBean);

		return pagingSQL;
	}

	protected String buildOrderSQL(BaseQueryBean aBaseQueryBean) {
		StringBuffer orderSQL = new StringBuffer();

		List orderList = aBaseQueryBean.getSortProperties();

		if (orderList.isEmpty() == false) {
			orderSQL.append(" ORDER BY ");
		}

		int orderIndex = 0;

		for (Iterator iterator = orderList.iterator(); iterator.hasNext();) {
			if (orderIndex++ > 0) {
				orderSQL.append(",");
			}
			orderSQL.append(iterator.next());
		}

		return orderSQL.toString();
	}

	protected String buildGroupSQL(BaseQueryBean aBaseQueryBean) {
		StringBuffer groupSQL = new StringBuffer();

		List groupList = aBaseQueryBean.getGroupProperties();

		if (groupList.isEmpty() == false) {
			groupSQL.append(" GROUP BY ");
		}

		int groupIndex = 0;

		for (Iterator iterator = groupList.iterator(); iterator.hasNext();) {
			if (groupIndex++ > 0) {
				groupSQL.append(",");
			}
			groupSQL.append(iterator.next());
		}

		return groupSQL.toString();
	}

	public SQLBean getQuerySQLBean(String entityName, String[] entityFields,
			String[] entityProperties, BaseQueryBean aQueryBean, String aJionSQL)
			throws Exception {

		if (aQueryBean == null) {
			aQueryBean = new BaseQueryBean();
		}

		String querySQL = buildQuerySQL(entityName, entityFields,
				entityProperties, aQueryBean);

		List<Object> queryParameters = new ArrayList<Object>();

		String joinSQL = buildJoinSQL(aQueryBean, queryParameters);

		String whereSQL = buildWhereCriteriaSQL(aQueryBean, queryParameters);

		String basicQueryFilter = getBaiscQueryFilter();

		String orderSQL = buildOrderSQL(aQueryBean);

		String groupSQL = buildGroupSQL(aQueryBean);

		StringBuffer sql = new StringBuffer();

		sql.append(querySQL);

		if (StringUtils.isNotBlank(aJionSQL)) {
			sql.append(" ");
			sql.append(aJionSQL);
			sql.append(" ");
		}

		sql.append(joinSQL);

		if (StringUtils.isNotBlank(basicQueryFilter)) {
			sql.append(" WHERE ");
			sql.append(basicQueryFilter);
		}

		if (StringUtils.isNotBlank(whereSQL)) {
			if (StringUtils.isNotBlank(basicQueryFilter)) {
				sql.append(" AND ");
			} else {
				sql.append(" WHERE ");
			}

			sql.append(whereSQL);
		}

		sql.append(groupSQL);

		sql.append(orderSQL);

		String pagingSQL = buildLimitSQL(sql.toString(), aQueryBean);

		return new SQLBean(pagingSQL, queryParameters);
	}

	public String buildQueryCountSQL(BaseQueryBean aQueryBean,
			List<Object> queryParameters) throws Exception {

		String querySQL = buildQueryCountSQL();

		String joinSQL = buildJoinSQL(aQueryBean, queryParameters);

		String basicQueryFilter = getBaiscQueryFilter();

		String whereSQL = buildWhereCriteriaSQL(aQueryBean, queryParameters);

		StringBuffer sql = new StringBuffer();

		sql.append(querySQL);

		sql.append(joinSQL);

		if (StringUtils.isNotBlank(basicQueryFilter)) {
			sql.append(" WHERE ");
			sql.append(basicQueryFilter);
		}

		if (StringUtils.isNotBlank(whereSQL)) {
			if (StringUtils.isNotBlank(basicQueryFilter)) {
				sql.append(" AND ");
			} else {
				sql.append(" WHERE ");
			}

			sql.append(whereSQL);
		}

		String pagingSQL = buildLimitSQL(sql.toString(), aQueryBean);

		return pagingSQL;
	}

	public String buildIsUniqueSQL(Object[] aValues, Object[] aPks,
			List<Object> parameters) throws Exception {

		StringBuffer sql = new StringBuffer();

		String queryCountSQL = buildQueryCountSQL();

		String basicQueryFilter = getBaiscQueryFilter();

		sql.append(queryCountSQL);

		sql.append(" WHERE ");

		if (StringUtils.isNotBlank(basicQueryFilter)) {
			sql.append(basicQueryFilter).append(" ");
		}

		String[] uniqueFields = getEntityUniqueFields();

		for (int i = 0; i < uniqueFields.length; i++) {
			String uniqueField = uniqueFields[i];
			if (i > 0 || StringUtils.isNotBlank(basicQueryFilter)) {
				sql.append(" AND ");
			}
			sql.append(uniqueField).append(" = ? ");
			parameters.add(aValues[i]);
		}

		String[] pkFields = getEntityPKFields();

		if (aPks != null && aPks.length > 0) {
			for (int i = 0; i < pkFields.length; i++) {
				String pkField = pkFields[i];
				sql.append(" AND ");
				sql.append(pkField).append(" != ? ");
				parameters.add(aPks[i]);
			}
		}

		return sql.toString();
	}

	public String buildBatchInsertSQL(final Object[] aObjects,
			List<Object> insertValueProperties) throws Exception {

		String[] fields = getEntityFields();

		final String[] properties = getEntityProperties();

		String[] autoGenPkFields = getEntityAutoGenPKFields();

		StringBuffer sql = new StringBuffer("INSERT INTO ");

		sql.append(getEntityName());
		sql.append("(");

		StringBuffer values = new StringBuffer(" VALUES(");
		int fieldIndex = 0;

		String entityNamePreFix = getEntityName() + ".";

		for (int i = 0; i < fields.length; i++) {
			String field = fields[i];
			if (ArrayUtils.contains(autoGenPkFields, field)
					|| StringUtils.contains(field, entityNamePreFix) == false) {
				continue;
			}

			insertValueProperties.add(properties[i]);

			if (fieldIndex++ > 0) {
				sql.append(",");
				values.append(",");
			}
			sql.append(field);
			values.append("?");

		}
		values.append(")");
		sql.append(")");

		sql.append(values);

		return sql.toString();

	}

	public String buildBatchUpdateSQL(final Object[] aObjects,
			List<Object> pkProperties, List<Object> updateProperties)
			throws Exception {

		String[] fields = getEntityFields();

		String[] pkFields = getEntityPKFields();

		final String[] properties = getEntityProperties();

		StringBuffer sql = new StringBuffer("UPDATE ");

		sql.append(getEntityName());
		sql.append(" SET ");

		int fieldIndex = 0;

		String entityNamePreFix = getEntityName() + ".";

		for (int i = 0; i < fields.length; i++) {
			String field = fields[i];
			String property = properties[i];

			if (ArrayUtils.contains(pkFields, field)) {
				pkProperties.add(property);
				continue;
			}

			if (StringUtils.contains(field, entityNamePreFix) == false) {
				continue;
			}

			updateProperties.add(property);

			if (fieldIndex > 0) {
				sql.append(",");
			}
			sql.append(field).append("= ? ");
			fieldIndex++;
		}

		sql.append(" WHERE ");

		for (int i = 0; i < pkFields.length; i++) {
			String PkField = pkFields[i];
			if (i > 0) {
				sql.append(" AND ");
			}
			sql.append(PkField).append("= ? ");
		}

		return sql.toString();

	}

}
