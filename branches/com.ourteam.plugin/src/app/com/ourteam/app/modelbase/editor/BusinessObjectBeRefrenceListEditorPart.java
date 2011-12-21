package com.ourteam.app.modelbase.editor;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractTableViewerEditorPart;
import net.ui.model.action.ActionBean;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class BusinessObjectBeRefrenceListEditorPart
		extends
		AbstractTableViewerEditorPart<BusinessObjectBean, BusinessObjectEditorInput,ObjectRelationBean> {

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private boolean isShowDao = true;

	private boolean isShowBusinessBean = true;

	private boolean isShowService = true;

	@Override
	protected String getTableConfigId() {
		return "businessObjectBeRefrenedTable";
	}

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "businessObjectBeRefrenceFilterActionGroup" };
	}

	@Override
	protected ObjectRelationBean[] getDataList(BusinessObjectBean dataModel)
			throws Exception {

		List<BusinessObjectTypeEnum> businessObjectTypeEnums = new ArrayList<BusinessObjectTypeEnum>();

		if (this.isShowDao) {
			businessObjectTypeEnums.add(BusinessObjectTypeEnum.DAO);
		}

		if (this.isShowBusinessBean) {
			businessObjectTypeEnums.add(BusinessObjectTypeEnum.JAVA_CLASS);
		}

		if (this.isShowService) {
			businessObjectTypeEnums.add(BusinessObjectTypeEnum.SERVICE);
		}

		ObjectRelationBean[] objectRelationBeans = BUSINESS_OBJECT_SERVICE
				.getBusinessObjectBeRefrencedRelations(
						dataModel.getBusinessObjectId(),
						businessObjectTypeEnums
								.toArray(new BusinessObjectTypeEnum[businessObjectTypeEnums
										.size()]), null);
		return objectRelationBeans;
	}

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			return true;
		}

		@Override
		public boolean isActionVisible(ActionBean aAction) {
			return true;
		}

		public void showDaoObject(ActionEvent actionEvent) throws Exception {

			isShowDao = !isShowDao;

			reloadDataModel();
		}

		public void showBusinessBeanObject(ActionEvent actionEvent)
				throws Exception {
			isShowBusinessBean = !isShowBusinessBean;
			reloadDataModel();
		}

		public void showServiceObject(ActionEvent actionEvent) throws Exception {
			isShowService = !isShowService;
			reloadDataModel();
		}

	}

}
