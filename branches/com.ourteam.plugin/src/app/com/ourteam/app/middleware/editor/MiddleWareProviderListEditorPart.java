package com.ourteam.app.middleware.editor;

import java.util.List;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.middleware.domain.MiddleWareProviderBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractObjectRelationDataListEditorPart;
import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.wizard.IWizardProvider;
import net.ui.model.action.ActionBean;

public class MiddleWareProviderListEditorPart
		extends
		AbstractObjectRelationDataListEditorPart<MiddleWareTypeEnum, MiddleWareTypeEditorInput, MiddleWareProviderBean> {

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	@Override
	protected String getTableConfigId() {
		return "middleWareProviderListTable";
	}

	@Override
	protected MiddleWareProviderBean[] getDataList(MiddleWareTypeEnum dataModel)
			throws Exception {
		return IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareProviders(getDataModel());
	}

	public class ActionHandler extends ObjectRelationActionHandler {

		@Override
		protected void doRemoveRelations(List<MiddleWareProviderBean> items)
				throws Exception {

			long[] ids = new long[items.size()];

			for (int i = 0; i < ids.length; i++) {
				ids[i] = items.get(i).getId();
			}

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.deleteMiddleWareProviders(ids);

		}

		@Override
		protected IWizardProvider getAddRelationWizardProvider(
				ActionBean actionBean) throws Exception {
			return null;
		}

		@Override
		protected IDialogProvider getAddRelationDialogProvider(
				ActionBean actionBean) throws Exception {

			MiddleWareProviderBean middleWareProviderBean = new MiddleWareProviderBean();

			middleWareProviderBean.setMiddleWareType(getDataModel().getName());

			return new MiddleWareProviderEditDialogProvider(
					middleWareProviderBean);
		}

		@Override
		protected IDialogProvider getEditDialogProvider(
				List<MiddleWareProviderBean> item) throws Exception {
			return new MiddleWareProviderEditDialogProvider(item.get(0));
		}

	}

}
