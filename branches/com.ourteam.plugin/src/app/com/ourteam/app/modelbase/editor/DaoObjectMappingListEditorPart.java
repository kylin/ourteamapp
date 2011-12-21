package com.ourteam.app.modelbase.editor;

import java.util.List;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.wizard.IWizardProvider;
import net.ui.model.action.ActionBean;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.ObjectRelationBean;

public class DaoObjectMappingListEditorPart extends
		AbstractBusinessObjectRelationListEditorPart {

	@Override
	protected ObjectRelationBean[] getDataList(BusinessObjectBean dataModel)
			throws Exception {

		ObjectRelationBean objectRelationBean = IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
				.getBusinessObjectMappedPersistentObject(dataModel
						.getBusinessObjectId());

		if (objectRelationBean == null) {
			return new ObjectRelationBean[0];
		} else {
			return new ObjectRelationBean[] { objectRelationBean };
		}
	}

	@Override
	protected String getTableConfigId() {
		return "businessObjectMappingTable";
	}

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	public class ActionHandler extends BusinessObjectRelationActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {

			boolean flag = super.isActionEnable(aAction);

			if (("addRelation").equals(aAction.getId())) {
				if (DaoObjectMappingListEditorPart.this.getTableComposite()
						.getDataList().size() > 0) {
					return false;
				} else {
					return true;
				}
			} else {
				return flag;
			}

		}

		@Override
		protected void doRemoveRelations(List<ObjectRelationBean> items)
				throws Exception {

			IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
					.removeBusinessObjectMappedPersistentObject(getDataModel()
							.getBusinessObjectId());
		}

	}

	@Override
	protected IWizardProvider getAddBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel) {
		return new ConfigDaoObjectMappingWizardProvider(objectRelationDataModel);
	}

	@Override
	protected IDialogProvider getEditBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel) {
		return new EditDaoObjectMappingDialogProvider(objectRelationDataModel);
	}

}
