package com.ourteam.app.middleware.editor;

import net.ui.eclipse.editorpart.AbstractPagebleTableViewerEditorPart;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.middleware.dao.MiddleWareToolLogDAOQueryBean;
import com.ourteam.middleware.domain.MiddleWareToolLogBean;

public class MiddleWareToolExecuteLogEditorPart
		extends
		AbstractPagebleTableViewerEditorPart<MiddleWareManageToolExecuteBean, MiddleWareManageToolExecuteEditorInput, MiddleWareToolLogBean> {

	protected MiddleWareToolLogDAOQueryBean createQueryBean() {
		MiddleWareToolLogDAOQueryBean queryBean = new MiddleWareToolLogDAOQueryBean();

		queryBean
				.createCriteria()
				.andToolIdEqualTo(
						getDataModel().getMiddleWareToolBean().getId())
				.andMiddleWareIdEqualTo(
						getDataModel().getMiddleWareBean().getId());

		return queryBean;
	}

	@Override
	protected String getTableConfigId() {
		return "middleWareToolExecuteLogTable";
	}

	@Override
	protected int getTotalDataCount() throws Exception {
		return IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.queryMiddleWareToolExecuteLogCount(createQueryBean());
	}

	@Override
	protected MiddleWareToolLogBean[] getDataList(int start, int count)
			throws Exception {
		return IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.queryMiddleWareToolExecuteLogs(createQueryBean());
	}

}
