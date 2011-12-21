package com.ourteam.app.modelbase.editor;

import java.util.Iterator;
import java.util.List;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractObjectRelationDataListEditorPart;
import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.wizard.IWizardProvider;
import net.ui.model.action.ActionBean;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.modelbase.domain.BusinessObjectActionBean;
import com.ourteam.modelbase.domain.BusinessObjectBean;

public class DaoActionListEditorPart
		extends
		AbstractObjectRelationDataListEditorPart<BusinessObjectBean, BusinessObjectEditorInput, BusinessObjectActionBean> {

	@Override
	protected String getTableConfigId() {
		return "businessObjectActionList";
	}

	@Override
	protected BusinessObjectActionBean[] getDataList(
			BusinessObjectBean dataModel) throws Exception {

		BusinessObjectActionBean[] businessObjectActionViewBeans = IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
				.getBusinessObjectActions(dataModel.getBusinessObjectId(), null);

		return businessObjectActionViewBeans;
	}

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	public class ActionHandler extends ObjectRelationActionHandler {

		@Override
		protected void doRemoveRelations(List<BusinessObjectActionBean> items)
				throws Exception {

			long[] ids = new long[items.size()];

			int index = 0;

			for (Iterator<BusinessObjectActionBean> iterator = items.iterator(); iterator
					.hasNext();) {
				BusinessObjectActionBean businessObjectActionBean = (BusinessObjectActionBean) iterator
						.next();

				ids[index++] = businessObjectActionBean.getObjectActionId();

			}

			IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
					.removeBusinessObjectActions(ids);
		}

		@Override
		protected IWizardProvider getAddRelationWizardProvider(
				ActionBean actionBean) throws Exception {

			BusinessObjectActionBean businessObjectActionBean = new BusinessObjectActionBean();

			businessObjectActionBean.setObjectId(getDataModel()
					.getBusinessObjectId());

			AddDaoActionWizardProvider addDaoActionWizardProvider = new AddDaoActionWizardProvider(
					businessObjectActionBean);

			return addDaoActionWizardProvider;
		}

		@Override
		protected IDialogProvider getEditDialogProvider(
				List<BusinessObjectActionBean> items) throws Exception {

			EditDaoActionDialogProvider daoActionDialogProvider = new EditDaoActionDialogProvider(
					items.get(0));

			return daoActionDialogProvider;
		}

	}

}
