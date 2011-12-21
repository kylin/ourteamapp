package com.ourteam.app.middleware.utils;

import com.ourteam.middleware.domain.MiddleWareToolBean;

public class MiddleWareToolExecuteUtils {

	public static IMiddleWareToolExecutor getMiddleWareToolExecutor(
			MiddleWareToolBean toolBean) throws Exception {

		if ("bat".equals(toolBean.getToolScriptType())) {
			return new LocalScriptExecutor();
		} else if ("shell".equals(toolBean.getToolScriptType())) {
			return new SSHExecutor();
		} else {
			return null;
		}

	}
}
