package com.ourteam.app.middleware.utils;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.middleware.domain.MiddleWareBean;

public class DatabaseUtils {

	public static SingleConnectionDataSource getSingleConnectionDataSource(
			long databaseServerid) throws Exception {

		MiddleWareBean databaseServerBean = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareById(databaseServerid);

		return getSingleConnectionDataSource(databaseServerBean);
	}

	public static SingleConnectionDataSource getSingleConnectionDataSource(
			MiddleWareBean databaseServerBean) {

		SingleConnectionDataSource dataSource = new SingleConnectionDataSource();

		dataSource.setDriverClassName(databaseServerBean.getDriveType());

		dataSource.setUsername(databaseServerBean.getUser());
		dataSource.setPassword(databaseServerBean.getPassword());

		if ("mysql".equalsIgnoreCase(databaseServerBean.getProvider())) {

			dataSource.setUrl("jdbc:mysql://"
					+ databaseServerBean.getHostName() + ":"
					+ databaseServerBean.getHostPort() + "/"
					+ databaseServerBean.getServiceName()
					+ "?useUnicode=true&characterEncoding=UTF-8");
		} else if ("oracle".equalsIgnoreCase(databaseServerBean.getProvider())) {
			dataSource.setUrl("jdbc:oracle:thin:@"
					+ databaseServerBean.getHostName() + ":"
					+ databaseServerBean.getHostPort() + ":"
					+ databaseServerBean.getServiceName());
		}

		return dataSource;

	}

	public static List<Map<String, Object>> query(DataSource dataSource,
			String sql, Map<String, Object> parameterMap) throws Exception {
		SimpleJdbcTemplate jdbcTemplate = new SimpleJdbcTemplate(dataSource);

		List<Map<String, Object>> results = jdbcTemplate.queryForList(sql,
				parameterMap);

		return results;
	}
}
