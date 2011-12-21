package com.ourteam.app.middleware.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.middleware.dao.MiddleWareDAOQueryBean;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;
import com.ourteam.middleware.service.IMiddleWareService;
import com.ourteam.middleware.service.MiddleWareServiceFactory;

public class DatabaseNodeBuilder implements
		ISubNodeBuilder<Object, MiddleWareBean> {

	private static final IMiddleWareService MIDDLE_WARE_SERVICE = MiddleWareServiceFactory
			.getMiddleWareService();

	@Override
	public MiddleWareBean[] getSubNodes(Object aParentObject) throws Exception {
		MiddleWareDAOQueryBean queryBean = new MiddleWareDAOQueryBean();

		queryBean.createCriteria().andTypeEqualTo(
				MiddleWareTypeEnum.DATABASE_SERVER.getName());

		MiddleWareBean[] result = MIDDLE_WARE_SERVICE
				.queryMiddleWare(queryBean);
		return result;
	}

	@Override
	public String getSubNodeDefineId(MiddleWareBean nodeObject) {
		return "DATABASE";
	}

	@Override
	public String[] getSubNodeActionGroupIds(MiddleWareBean nodeObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
