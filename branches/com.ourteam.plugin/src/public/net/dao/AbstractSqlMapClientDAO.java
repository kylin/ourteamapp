package net.dao;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public abstract class AbstractSqlMapClientDAO extends SqlMapClientDaoSupport
		implements IDataAccessObject {

	public List query(String aSqlId, BaseQueryBean queryBean) throws Exception {
		List result = null;
		if (queryBean == null) {
			result = getSqlMapClientTemplate().queryForList(aSqlId);
		} else {

			result = getSqlMapClientTemplate().queryForList(aSqlId, queryBean);

		}

		return result;
	}
}
