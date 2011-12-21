package com.ourteam.app.workspace.ui;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.utils.AbstractComboListProvider;

import org.apache.commons.lang.ArrayUtils;

import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class SCMServiceComboListProvider extends
		AbstractComboListProvider<MiddleWareBean> {

	private List<Long> projectIdList = new ArrayList<Long>();
	
	public SCMServiceComboListProvider(long projectId,boolean allowNull) {
		super(allowNull);
		this.projectIdList = new ArrayList<Long>();
		this.projectIdList.add(Long.valueOf(projectId));
	}

	public SCMServiceComboListProvider(long projectId) {
		this(projectId,true);
	}
	
	public SCMServiceComboListProvider(List<Long> projectIdList,boolean allowNull) {
		super(allowNull);
		this.projectIdList = projectIdList;
	}

	public SCMServiceComboListProvider(List<Long> projectIdList) {
		this(projectIdList,true);
	}

	@Override
	public MiddleWareBean[] getDataList() {
		try {

			long[] projectIds = ArrayUtils.toPrimitive(projectIdList
					.toArray(new Long[projectIdList.size()]));

			MiddleWareBean[] middleWareBeans = WorkspaceServiceFactory
					.getWorkspaceService().getServersByProjectIds(
							projectIds,
							new MiddleWareTypeEnum[] {
									MiddleWareTypeEnum.CVS_SERVER,
									MiddleWareTypeEnum.SVN_SERVER });

			return middleWareBeans;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getDataLabel(MiddleWareBean dataItem) {
		return dataItem.getName();
	}

	@Override
	public Object getNullValue() {
		return "0";
	}

}
