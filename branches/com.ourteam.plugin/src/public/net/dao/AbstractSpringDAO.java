package net.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.dao.BaseQueryBean.Join;
import net.dao.BaseQueryBean.SelectProperty;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public abstract class AbstractSpringDAO extends SimpleJdbcDaoSupport {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(AbstractJdbcDAO.class);

	protected abstract String getEntityName();

	protected abstract String[] getEntityFields();

	protected abstract String[] getEntityProperties();

	protected abstract String[] getEntityPKFields();

	protected abstract String[] getEntityAutoGenPKFields();

	protected abstract String[] getEntityUniqueFields();

	protected abstract String getRelatedJoinSQL();

	protected abstract String getBaiscQueryFilter();

	protected void debugSQL(String sql, List<Object> parameters) {
		if (logger.isDebugEnabled()) {
			String value;
			for (int j = 0; j < parameters.size(); j++) {
				value = String.valueOf(parameters.get(j));
				if (parameters.get(j) instanceof String) {
					value = "'" + value + "'";
				}

				sql = StringUtils.replaceOnce(sql, "?", value);

			}
			logger.debug(sql);
		}
	}

	protected void debugSQL(String sql) {
		debugSQL(sql, new ArrayList<Object>());
	}

	protected String buildQueryCountSQL() {

		String pks = StringUtils.join(getEntityPKFields(), ",");

		StringBuffer sqlBuffer = new StringBuffer("SELECT count( distinct  ")
				.append(pks).append(") AS _totalCount FROM ")
				.append(getEntityName()).append(" ");

		String relatedJoinSQL = getRelatedJoinSQL();

		if (StringUtils.isNotBlank(relatedJoinSQL)) {
			sqlBuffer.append(" ");
			sqlBuffer.append(relatedJoinSQL);
			sqlBuffer.append(" ");
		}

		return sqlBuffer.toString();
	}

	protected String buildQuerySQL(String entityName, String[] entityFields,
			String[] entityProperties, BaseQueryBean aBaseQueryBean) {
		StringBuffer sqlBuffer = new StringBuffer("SELECT ");

		if (aBaseQueryBean != null && aBaseQueryBean.isDistinct()) {
			sqlBuffer.append(" DISTINCT ");
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
			sqlBuffer.append("isNull(").append(field).append(") AS is")
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

	protected String buildQuerySQL(BaseQueryBean aBaseQueryBean) {

		return buildQuerySQL(getEntityName(), getEntityFields(),
				getEntityProperties(), aBaseQueryBean);
	}

	protected String buildSelectiveQuerySQL(String entityName,
			BaseQueryBean aBaseQueryBean) {
		StringBuffer selectiveQuerySQL = new StringBuffer("SELECT ");

		if (aBaseQueryBean.isDistinct()) {
			selectiveQuerySQL.append(" DISTINCT ");
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

	protected String buildJoinSQL(BaseQueryBean aBaseQueryBean,
			List parameterList) {

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
				joinBuffer.append(" AS ").append(join.getTableAlias());
			}
			joinBuffer.append(" ON ").append(
					buildWhereCriteriaSQL(join.getJoinCriterion(),
							parameterList));
		}

		return joinBuffer.toString();
	}

	protected String buildWhereCriteriaSQL(BaseQueryBean aBaseQueryBean,
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

				sqlBuffer.append(")");
			}
		}

		return sqlBuffer.toString();
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

	protected String buildLimitSQL(BaseQueryBean aBaseQueryBean) {
		StringBuffer limitSQL = new StringBuffer();

		if (aBaseQueryBean.getMaxResults() > -1) {
			limitSQL.append(" LIMIT ").append(aBaseQueryBean.getStart())
					.append(",").append(aBaseQueryBean.getMaxResults());
		}

		return limitSQL.toString();
	}

	protected String buildDeleteSQL(String entityName) {
		StringBuffer deleteSQL = new StringBuffer("DELETE ")
				.append(getEntityName());
		deleteSQL.append(" FROM ").append(entityName).append(" ");

		return deleteSQL.toString();

	}

	public void doDeleteById(Object[] ids) throws Exception {
		StringBuffer sql = new StringBuffer();

		sql.append(buildDeleteSQL(getEntityName()));

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

		if (logger.isDebugEnabled()) {
			logger.debug(sql);
		}

		this.getJdbcTemplate().update(sql.toString(), ids);
	}

	public void doBatchInsert(final Object[] aObject) throws Exception {
		if (ArrayUtils.isEmpty(aObject)) {
			return;
		}

		if (aObject.length == 0) {
			doInsert(aObject[0]);
		} else {
			String[] fields = getEntityFields();

			final String[] properties = getEntityProperties();

			final List insertValueProperties = new ArrayList();

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

			this.getJdbcTemplate().batchUpdate(sql.toString(),
					new BatchPreparedStatementSetter() {

						public int getBatchSize() {
							return aObject.length;
						}

						public void setValues(
								PreparedStatement preparedStatement,
								int parameterIndex) throws SQLException {
							try {
								for (int i = 0; i < insertValueProperties
										.size(); i++) {
									String property = (String) insertValueProperties
											.get(i);

									preparedStatement.setObject(parameterIndex,
											PropertyUtils.getProperty(aObject,
													property));

								}
							} catch (Exception e) {
								logger.error("batch insert error", e);
								throw new RuntimeException(e);
							}
						}

					});

		}
	}

	public void doBatchUpdate(final Object[] aObject) throws Exception {
		if (ArrayUtils.isEmpty(aObject)) {
			return;
		}

		if (aObject.length == 0) {
			doUpdate(aObject[0]);
		} else {
			String[] fields = getEntityFields();

			String[] pkFields = getEntityPKFields();

			final List pkProperties = new ArrayList();

			final List updateProperties = new ArrayList();

			final String[] properties = getEntityProperties();

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
					pkProperties.add(property);
					continue;
				}

				if (StringUtils.contains(field, entityNamePreFix) == false) {
					continue;
				}

				updateProperties.add(property);

				Boolean setted = (Boolean) PropertyUtils.getProperty(aObject,
						property + "Setted");

				Boolean nullValue = (Boolean) PropertyUtils.getProperty(
						aObject, property + "Null");

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

			this.getJdbcTemplate().batchUpdate(sql.toString(),
					new BatchPreparedStatementSetter() {

						public int getBatchSize() {
							return aObject.length;
						}

						public void setValues(
								PreparedStatement preparedStatement,
								int parameterIndex) throws SQLException {
							try {
								for (int i = 0; i < updateProperties.size(); i++) {
									String property = (String) updateProperties
											.get(i);

									preparedStatement.setObject(parameterIndex,
											PropertyUtils.getProperty(aObject,
													property));

								}

								for (int i = 0; i < pkProperties.size(); i++) {
									String property = (String) pkProperties
											.get(i);

									preparedStatement.setObject(parameterIndex,
											PropertyUtils.getProperty(aObject,
													property));

								}
							} catch (Exception e) {
								logger.error("batch update error", e);
								throw new RuntimeException(e);
							}
						}

					});

		}
	}

	public void doInsert(Object aObject) throws Exception {

		String[] fields = getEntityFields();

		String[] properties = getEntityProperties();

		String[] autoGenPkFields = getEntityAutoGenPKFields();

		List parameters = new ArrayList();

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
			String property = properties[i];
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

		debugSQL(sql.toString(), parameters);

		this.getJdbcTemplate().update(sql.toString(), parameters.toArray());
	}

	public void doUpdate(Object aObject) throws Exception {
		String[] fields = getEntityFields();

		String[] pkFields = getEntityPKFields();

		String[] properties = getEntityProperties();

		List parameters = new ArrayList();

		List pkParameters = new ArrayList();

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

		debugSQL(sql.toString(), parameters);

		this.getJdbcTemplate().update(sql.toString(), parameters.toArray());
	}

	public void doUpdateByQuery(Object aObject, BaseQueryBean aQueryBean)
			throws Exception {

		doUpdateByQuery(getEntityName(), getEntityFields(),
				getEntityProperties(), null, aObject, aQueryBean);
	}

	public void doUpdateByQuery(String entityName, String[] entityFields,
			String[] entityProperties, String joinSQL, Object aObject,
			BaseQueryBean aQueryBean) throws Exception {

		String[] fields = entityFields;

		String[] properties = entityProperties;

		String[] pkFields = getEntityPKFields();

		List parameters = new ArrayList();

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

		debugSQL(sql.toString(), parameters);

		this.getJdbcTemplate().update(sql.toString(), parameters.toArray());

	}

	public void doDeleteByQuery(BaseQueryBean aQueryBean) throws Exception {
		doDeleteByQuery(getEntityName(), null, aQueryBean);
	}

	public void doDeleteByQuery(String entityName, String joinSQL,
			BaseQueryBean aQueryBean) throws Exception {
		StringBuffer sql = new StringBuffer();

		sql.append(buildDeleteSQL(entityName));

		List parameters = new ArrayList();

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

		if (logger.isDebugEnabled()) {
			logger.debug(sql);
		}

		this.getJdbcTemplate().update(sql.toString(), parameters.toArray());

	}

	public Object doFindById(Object[] ids, ParameterizedRowMapper rowMapper)
			throws Exception {
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

		if (logger.isDebugEnabled()) {
			logger.debug(sql);
		}

		return this.getJdbcTemplate().queryForObject(sql.toString(), ids,
				rowMapper);
	}

	public Map<String, Object>[] doQuerySelective(String entityName,
			BaseQueryBean aQueryBean, String aJionSQL) throws Exception {
		String querySQL = buildSelectiveQuerySQL(entityName, aQueryBean);

		List queryParameters = new ArrayList();

		String joinSQL = buildJoinSQL(aQueryBean, queryParameters);

		String basicQueryFilter = getBaiscQueryFilter();

		String whereSQL = buildWhereCriteriaSQL(aQueryBean, queryParameters);

		String orderSQL = buildOrderSQL(aQueryBean);

		String groupSQL = buildGroupSQL(aQueryBean);

		String limitSQL = buildLimitSQL(aQueryBean);

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

		sql.append(limitSQL);

		debugSQL(sql.toString(), queryParameters);

		List resultList = this.getJdbcTemplate().queryForList(sql.toString(),
				queryParameters.toArray());

		return (Map<String, Object>[]) resultList.toArray(new Map[0]);
	}

	public Map<String, Object>[] doQuerySelective(BaseQueryBean aQueryBean)
			throws Exception {

		return doQuerySelective(getEntityName(), aQueryBean, null);
	}

	public List doQuery(BaseQueryBean aQueryBean, String aJionSQL,
			ParameterizedRowMapper rowMapper) throws Exception {
		return doQuery(getEntityName(), getEntityFields(),
				getEntityProperties(), aQueryBean, aJionSQL, rowMapper);
	}

	public List doQuery(String entityName, String[] entityFields,
			String[] entityProperties, BaseQueryBean aQueryBean,
			String aJionSQL, ParameterizedRowMapper rowMapper) throws Exception {

		if (aQueryBean == null) {
			aQueryBean = new BaseQueryBean();
		}

		String querySQL = buildQuerySQL(entityName, entityFields,
				entityProperties, aQueryBean);

		List queryParameters = new ArrayList();

		String joinSQL = buildJoinSQL(aQueryBean, queryParameters);

		String whereSQL = buildWhereCriteriaSQL(aQueryBean, queryParameters);

		String basicQueryFilter = getBaiscQueryFilter();

		String orderSQL = buildOrderSQL(aQueryBean);

		String groupSQL = buildGroupSQL(aQueryBean);

		String limitSQL = buildLimitSQL(aQueryBean);

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

		sql.append(limitSQL);

		debugSQL(sql.toString(), queryParameters);

		List list = this.getJdbcTemplate().query(sql.toString(),
				queryParameters.toArray(), rowMapper);

		return list;
	}

	public List doQuery(BaseQueryBean aQueryBean,
			ParameterizedRowMapper rowMapper) throws Exception {

		return doQuery(aQueryBean, null, rowMapper);
	}

	public int doQueryCount(BaseQueryBean aQueryBean) throws Exception {

		String querySQL = buildQueryCountSQL();

		List queryParameters = new ArrayList();

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

		String limitSQL = buildLimitSQL(aQueryBean);

		sql.append(" ").append(limitSQL);

		debugSQL(sql.toString(), queryParameters);

		return this.getJdbcTemplate().queryForInt(sql.toString(),
				queryParameters.toArray());
	}

	public boolean isUnique(Object[] aValues, Object[] aPks) throws Exception {

		if (aValues == null || aValues.length == 0) {
			return true;
		}

		StringBuffer sql = new StringBuffer();

		String queryCountSQL = buildQueryCountSQL();

		String basicQueryFilter = getBaiscQueryFilter();

		sql.append(queryCountSQL);

		sql.append(" WHERE ");

		if (StringUtils.isNotBlank(basicQueryFilter)) {
			sql.append(basicQueryFilter).append(" ");
		}

		String[] uniqueFields = getEntityUniqueFields();

		List parameters = new ArrayList();

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

		debugSQL(sql.toString(), parameters);

		int count = this.getJdbcTemplate().queryForInt(sql.toString(),
				parameters.toArray());

		if (count > 0) {
			return false;
		} else {
			return true;
		}

	}
}