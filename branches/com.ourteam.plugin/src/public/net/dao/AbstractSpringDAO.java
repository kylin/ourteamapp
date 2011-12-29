package net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public abstract class AbstractSpringDAO extends SimpleJdbcDaoSupport {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractSpringDAO.class);

	private SQLBuilder sqlBuilder;

	private String DATA_BASE_PRODUCT_NAME;

	protected abstract String getEntityName();

	protected abstract String[] getEntityFields();

	protected abstract String[] getEntityProperties();

	protected abstract String[] getEntityPKFields();

	protected abstract String[] getEntityAutoGenPKFields();

	protected abstract String[] getEntityUniqueFields();

	protected abstract String getRelatedJoinSQL();

	protected abstract String getBaiscQueryFilter();

	protected SQLBuilder getSqlBuilder() throws Exception {
		if (sqlBuilder == null) {
			sqlBuilder = new SQLBuilder(getDatabaseType());
			sqlBuilder.setBaiscQueryFilter(getBaiscQueryFilter());
			sqlBuilder.setEntityAutoGenPKFields(getEntityAutoGenPKFields());
			sqlBuilder.setEntityFields(getEntityFields());
			sqlBuilder.setEntityName(getEntityName());
			sqlBuilder.setEntityPKFields(getEntityPKFields());
			sqlBuilder.setEntityProperties(getEntityProperties());
			sqlBuilder.setEntityUniqueFields(getEntityUniqueFields());
			sqlBuilder.setRelatedJoinSQL(getRelatedJoinSQL());
		}
		return sqlBuilder;
	}

	protected String getDatabaseType() throws Exception {
		if (DATA_BASE_PRODUCT_NAME == null) {

			Connection connection = getJdbcTemplate().getDataSource()
					.getConnection();

			DATA_BASE_PRODUCT_NAME = connection.getMetaData()
					.getDatabaseProductName();

			connection.close();

		}
		return DATA_BASE_PRODUCT_NAME;

	}

	protected void debugSQL(String sql, List<Object> parameters) {
		if (logger.isDebugEnabled()) {
			String value;
			for (int j = 0; j < parameters.size(); j++) {
				value = String.valueOf(parameters.get(j));
				if (parameters.get(j) instanceof String) {
					value = "'" + value + "'";
				} else if (parameters.get(j) instanceof Date) {
					value = DateFormatUtils.format((Date) parameters.get(j),
							"yyyy-MM-dd HH:mm:ss");
				}

				sql = StringUtils.replaceOnce(sql, "?", value);

			}
			logger.debug(sql);
		}
	}

	protected void debugSQL(String sql) {
		debugSQL(sql, new ArrayList<Object>());
	}

	public void doDeleteById(Object[] ids) throws Exception {

		StringBuffer sql = new StringBuffer();

		sql.append(getSqlBuilder().buildDeleteByIdSQL());

		if (ArrayUtils.isNotEmpty(ids)) {
			debugSQL(sql.toString(), Arrays.asList(ids));
		} else {
			debugSQL(sql.toString());
		}

		this.getJdbcTemplate().update(sql.toString(), ids);
	}

	public void doBatchInsert(final Object[] aObjects) throws Exception {
		if (ArrayUtils.isEmpty(aObjects)) {
			return;
		}

		if (aObjects.length == 0) {
			doInsert(aObjects[0]);
		} else {

			final List<Object> insertValueProperties = new ArrayList<Object>();

			StringBuffer sql = new StringBuffer(getSqlBuilder()
					.buildBatchInsertSQL(aObjects, insertValueProperties));

			debugSQL(sql.toString());

			this.getJdbcTemplate().batchUpdate(sql.toString(),
					new BatchPreparedStatementSetter() {

						public int getBatchSize() {
							return aObjects.length;
						}

						public void setValues(
								PreparedStatement preparedStatement,
								int parameterIndex) throws SQLException {
							try {
								for (int i = 0; i < insertValueProperties
										.size(); i++) {
									String property = (String) insertValueProperties
											.get(i);

									preparedStatement.setObject(i + 1,
											PropertyUtils.getProperty(
													aObjects[parameterIndex],
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

	public void doBatchUpdate(final Object[] aObjects) throws Exception {
		if (ArrayUtils.isEmpty(aObjects)) {
			return;
		}

		if (aObjects.length == 0) {
			doUpdate(aObjects[0]);
		} else {

			final List<Object> pkProperties = new ArrayList<Object>();

			final List<Object> updateProperties = new ArrayList<Object>();

			StringBuffer sql = new StringBuffer(getSqlBuilder()
					.buildBatchUpdateSQL(aObjects, pkProperties,
							updateProperties));

			debugSQL(sql.toString());

			this.getJdbcTemplate().batchUpdate(sql.toString(),
					new BatchPreparedStatementSetter() {

						public int getBatchSize() {
							return aObjects.length;
						}

						public void setValues(
								PreparedStatement preparedStatement,
								int parameterIndex) throws SQLException {
							try {
								for (int i = 0; i < updateProperties.size(); i++) {
									String property = (String) updateProperties
											.get(i);

									preparedStatement.setObject(i + 1,
											PropertyUtils.getProperty(
													aObjects[parameterIndex],
													property));

								}

								for (int i = 0; i < pkProperties.size(); i++) {
									String property = (String) pkProperties
											.get(i);

									preparedStatement.setObject(i
											+ updateProperties.size() + 1,
											PropertyUtils.getProperty(
													aObjects[parameterIndex],
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

		String[] autoGenPkFields = getEntityAutoGenPKFields();

		beforeInsert(aObject, autoGenPkFields);

		List<Object> parameters = new ArrayList<Object>();

		StringBuffer sql = new StringBuffer(getSqlBuilder().buildInsertSQL(
				aObject, parameters));

		debugSQL(sql.toString(), parameters);

		this.getJdbcTemplate().update(sql.toString(), parameters.toArray());

		afterInsert(aObject, autoGenPkFields);
	}

	public void doUpdate(Object aObject) throws Exception {
		List<Object> parameters = new ArrayList<Object>();

		List<Object> pkParameters = new ArrayList<Object>();

		StringBuffer sql = new StringBuffer(getSqlBuilder().buildUpdateSQL(
				aObject, pkParameters, parameters));

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

		List<Object> parameters = new ArrayList<Object>();

		StringBuffer sql = new StringBuffer(getSqlBuilder()
				.buildUpdateByQuerySQL(entityName, fields, entityProperties,
						joinSQL, aObject, aQueryBean, parameters));

		debugSQL(sql.toString(), parameters);

		this.getJdbcTemplate().update(sql.toString(), parameters.toArray());

	}

	public void doDeleteByQuery(BaseQueryBean aQueryBean) throws Exception {
		doDeleteByQuery(getEntityName(), null, aQueryBean);
	}

	public void doDeleteByQuery(String entityName, String joinSQL,
			BaseQueryBean aQueryBean) throws Exception {

		List<Object> parameters = new ArrayList<Object>();

		StringBuffer sql = new StringBuffer(getSqlBuilder()
				.buildDeleteByQuerySQL(entityName, joinSQL, aQueryBean,
						parameters));

		debugSQL(sql.toString(), parameters);

		this.getJdbcTemplate().update(sql.toString(), parameters.toArray());

	}

	public Object doFindById(Object[] ids, ParameterizedRowMapper rowMapper)
			throws Exception {

		StringBuffer sql = new StringBuffer(getSqlBuilder().buildFindByIdSQL(
				ids));

		if (ArrayUtils.isNotEmpty(ids)) {
			debugSQL(sql.toString(), Arrays.asList(ids));
		} else {
			debugSQL(sql.toString());
		}

		return this.getJdbcTemplate().queryForObject(sql.toString(), ids,
				rowMapper);
	}

	public Map<String, Object>[] doQuerySelective(String entityName,
			BaseQueryBean aQueryBean, String aJionSQL) throws Exception {

		List<Object> queryParameters = new ArrayList<Object>();

		String pagingSQL = getSqlBuilder().buildQuerySelectiveSQL(entityName,
				aQueryBean, aJionSQL, queryParameters);

		debugSQL(pagingSQL, queryParameters);

		List resultList = this.getJdbcTemplate().queryForList(pagingSQL,
				queryParameters.toArray());

		return (Map[]) resultList.toArray(new Map[resultList.size()]);
	}

	public Map<String, Object>[] doQuerySelective(BaseQueryBean aQueryBean)
			throws Exception {

		return doQuerySelective(getEntityName(), aQueryBean, null);
	}

	public List<Object> doQuery(BaseQueryBean aQueryBean, String aJionSQL,
			ParameterizedRowMapper rowMapper) throws Exception {
		return doQuery(getEntityName(), getEntityFields(),
				getEntityProperties(), aQueryBean, aJionSQL, rowMapper);
	}

	public List<Object> doQuery(String entityName, String[] entityFields,
			String[] entityProperties, BaseQueryBean aQueryBean,
			String aJionSQL, ParameterizedRowMapper rowMapper) throws Exception {

		SQLBean querySQLBean = getSqlBuilder().getQuerySQLBean(entityName,
				entityFields, entityProperties, aQueryBean, aJionSQL);

		if (ArrayUtils.isNotEmpty(querySQLBean.getParameters())) {
			debugSQL(querySQLBean.getSql(),
					Arrays.asList(querySQLBean.getParameters()));
		} else {
			debugSQL(querySQLBean.getSql());
		}

		List<Object> list = this.getJdbcTemplate().query(querySQLBean.getSql(),
				querySQLBean.getParameters(), rowMapper);

		return list;
	}

	public List<Object> doQuery(BaseQueryBean aQueryBean,
			ParameterizedRowMapper rowMapper) throws Exception {

		return doQuery(aQueryBean, null, rowMapper);
	}

	public int doQueryCount(BaseQueryBean aQueryBean) throws Exception {

		List<Object> queryParameters = new ArrayList<Object>();

		String pagingSQL = getSqlBuilder().buildQueryCountSQL(aQueryBean,
				queryParameters);

		debugSQL(pagingSQL, queryParameters);

		return this.getJdbcTemplate().queryForInt(pagingSQL,
				queryParameters.toArray());
	}

	public boolean isUnique(Object[] aValues, Object[] aPks) throws Exception {

		if (aValues == null || aValues.length == 0) {
			return true;
		}

		List<Object> parameters = new ArrayList<Object>();

		StringBuffer sql = new StringBuffer(getSqlBuilder().buildIsUniqueSQL(
				aValues, aPks, parameters));

		debugSQL(sql.toString(), parameters);

		int count = this.getJdbcTemplate().queryForInt(sql.toString(),
				parameters.toArray());

		if (count > 0) {
			return false;
		} else {
			return true;
		}

	}

	protected void afterInsert(Object aObject, String[] autoGenPkFields)
			throws Exception {
		if (SQLBuilder.MYSQL.equalsIgnoreCase(getDatabaseType())) {
			long[] ids = new long[autoGenPkFields.length];
			String[] sqls = getSqlBuilder().getAutoGenPkFields(autoGenPkFields);
			for (int i = 0; i < ids.length; i++) {

				long id = this.getJdbcTemplate().queryForLong(sqls[i]);

				String propertyName = convertEntityFieldToProperty(autoGenPkFields[i]);

				PropertyUtils.setProperty(aObject, propertyName, new Long(id));
			}

		}
	}

	protected void beforeInsert(Object aObject, String[] autoGenPkFields)
			throws Exception {
		if (SQLBuilder.ORACLE.equalsIgnoreCase(getDatabaseType())) {

			long[] ids = new long[autoGenPkFields.length];

			String[] sqls = getSqlBuilder().getAutoGenPkFields(autoGenPkFields);

			for (int i = 0; i < ids.length; i++) {
				long id = this.getJdbcTemplate().queryForLong(sqls[i]);

				String propertyName = convertEntityFieldToProperty(autoGenPkFields[i]);

				PropertyUtils.setProperty(aObject, propertyName, new Long(id));
			}
		}
	}

	protected String convertEntityFieldToProperty(String aFieldName) {
		String[] fields = getEntityFields();

		String[] properties = getEntityProperties();

		String propertyName = null;

		for (int i = 0; i < fields.length; i++) {
			String field = fields[i];

			if (field.equals(aFieldName)) {
				propertyName = properties[i];
				break;
			}
		}

		return propertyName;
	}
}
