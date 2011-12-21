package com.ourteam.system.service;

import com.ourteam.system.dao.SysResourceDAOQueryBean.Criteria;

public interface ISysResourceQueryCallback {

	void buildQueryCriteria(Criteria aCriteria) throws Exception;
}
