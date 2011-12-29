package net.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

public abstract class AbstractJdbcDAO extends AbstractSpringDAO {

	public void deleteById(Object[] ids) throws Exception {
		super.doDeleteById(ids);
	}

	public void batchInsert(final Object[] aObjects) throws Exception {
		super.doBatchInsert(aObjects);
	}

	public void batchUpdate(final Object[] aObjects) throws Exception {
		super.doBatchUpdate(aObjects);
	}

	public void insert(Object aObject) throws Exception {

		super.doInsert(aObject);
	}

	public void update(Object aObject) throws Exception {

		super.doUpdate(aObject);
	}

	public void updateByQuery(Object aObject, BaseQueryBean aQueryBean)
			throws Exception {

		super.doUpdateByQuery(aObject, aQueryBean);
	}

	public void updateByQuery(String entityName, String[] entityFields,
			String[] entityProperties, String joinSQL, Object aObject,
			BaseQueryBean aQueryBean) throws Exception {

		super.doUpdateByQuery(entityName, entityFields, entityProperties,
				joinSQL, aObject, aQueryBean);

	}

	public void deleteByQuery(BaseQueryBean aQueryBean) throws Exception {
		super.doDeleteByQuery(aQueryBean);
	}

	public void deleteByQuery(String entityName, String joinSQL,
			BaseQueryBean aQueryBean) throws Exception {

		super.doDeleteByQuery(entityName, joinSQL, aQueryBean);

	}

	public Object findById(Object[] ids, ParameterizedRowMapper rowMapper)
			throws Exception {

		return super.doFindById(ids, rowMapper);
	}

	public Map[] querySelective(String entityName, BaseQueryBean aQueryBean,
			String aJionSQL) throws Exception {

		return super.doQuerySelective(entityName, aQueryBean, aJionSQL);
	}

	public Map[] querySelective(BaseQueryBean aQueryBean) throws Exception {

		return super.doQuerySelective(aQueryBean);
	}

	public List query(BaseQueryBean aQueryBean, String aJionSQL,
			ParameterizedRowMapper rowMapper) throws Exception {
		return super.doQuery(aQueryBean, aJionSQL, rowMapper);
	}

	public List query(String entityName, String[] entityFields,
			String[] entityProperties, BaseQueryBean aQueryBean,
			String aJionSQL, ParameterizedRowMapper rowMapper) throws Exception {

		return super.doQuery(entityName, entityFields, entityProperties,
				aQueryBean, aJionSQL, rowMapper);
	}

	public List query(BaseQueryBean aQueryBean, ParameterizedRowMapper rowMapper)
			throws Exception {

		return super.doQuery(aQueryBean, rowMapper);
	}

	public int queryCount(BaseQueryBean aQueryBean) throws Exception {

		return super.doQueryCount(aQueryBean);
	}

}
