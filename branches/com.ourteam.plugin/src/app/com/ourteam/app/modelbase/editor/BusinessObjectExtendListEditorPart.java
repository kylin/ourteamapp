package com.ourteam.app.modelbase.editor;

import java.util.List;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.wizard.IWizardProvider;
import net.ui.model.action.ActionBean;

import org.eclipse.jface.wizard.IWizard;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;

public class BusinessObjectExtendListEditorPart extends
		AbstractBusinessObjectRelationListEditorPart {

	@Override
	protected ObjectRelationBean[] getDataList(BusinessObjectBean dataModel)
			throws Exception {

		ObjectRelationBean objectRelationBean = IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
				.getBusinessObjectExtension(dataModel.getBusinessObjectId());

		if (objectRelationBean == null) {
			return new ObjectRelationBean[0];
		} else {
			return new ObjectRelationBean[] { objectRelationBean };
		}
	}

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "extendRelationActionGroup" };
	}

	@Override
	protected String getTableConfigId() {
		return "businessObjectExtendsTable";
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
				if (BusinessObjectExtendListEditorPart.this.getTableComposite()
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
					.removeBusinessObjectExtension(getDataModel()
							.getBusinessObjectId());
		}
	}

	@Override
	protected IWizardProvider getAddBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel) {
		return new AbstractAddBsuinessObjectRelationWizardProvider(
				objectRelationDataModel) {

			protected String getWizardConfigId() {
				return "daoExtendConfigWizard";

			}

			@Override
			public boolean canFinsh(IWizard wizard) {
				if (canFlipToNextPage(wizard.getPages()[0])) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			protected BusinessObjectTypeEnum[] getBusinessObjectTypeEnums() {
				return new BusinessObjectTypeEnum[] { BusinessObjectTypeEnum.DAO };
			}

			@Override
			protected ObjectRelationTypeEnum getBusinessObjectRelationTypeEnum() {
				return ObjectRelationTypeEnum.EXTEND;
			}

		};
	}

	@Override
	protected IDialogProvider getEditBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel) {
		return null;
	}

}
