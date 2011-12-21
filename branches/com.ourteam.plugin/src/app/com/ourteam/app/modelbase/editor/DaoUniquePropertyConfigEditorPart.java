package com.ourteam.app.modelbase.editor;

import java.util.List;

import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractTableViewerEditorPart;
import net.ui.model.action.ActionBean;

import org.apache.commons.lang.BooleanUtils;

import com.ourteam.modelbase.dao.ObjectPropertyDAOQueryBean;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class DaoUniquePropertyConfigEditorPart
		extends
		AbstractTableViewerEditorPart<BusinessObjectBean, BusinessObjectEditorInput, ObjectPropertyBean> {

	private static final IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
			.getBusinessObjectService();

	@Override
	protected String getTableConfigId() {
		return "businessObjectUniquePropertyList";
	}

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "daoPropertyUniqueActionGroup" };
	}

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	@Override
	protected ObjectPropertyBean[] getDataList(BusinessObjectBean dataModel)
			throws Exception {

		ObjectPropertyDAOQueryBean queryBean = new ObjectPropertyDAOQueryBean();

		queryBean.createCriteria()
				.andObjectIdEqualTo(dataModel.getBusinessObjectId())
				.andIsPrimaryPropertyEqualTo("false");

		ObjectPropertyBean[] objectPropertyBeans = businessObjectService
				.queryBusinessProperties(queryBean);

		return objectPropertyBeans;
	}

	@Override
	protected void saveDataModel(BusinessObjectBean aDataModel)
			throws Exception {
	}

	protected ObjectPropertyBean[] getSlectedObjectPropertyBeans() {
		List<ObjectPropertyBean> selectedItems = getTableComposite()
				.getSelectedDataList();
		return (ObjectPropertyBean[]) selectedItems
				.toArray(new ObjectPropertyBean[selectedItems.size()]);
	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			return getTableComposite().getSelectedDataList().size() > 0;
		}


		public void releaseUnique(ActionEvent actionEvent) throws Exception {
			setPropertiesIsUnique(false);
		}

		public void setUnique(ActionEvent actionEvent) throws Exception {
			setPropertiesIsUnique(true);
		}

		protected void setPropertiesIsUnique(boolean isUnique) throws Exception {
			ObjectPropertyBean[] objectPropertyBeans = getSlectedObjectPropertyBeans();

			for (int i = 0; i < objectPropertyBeans.length; i++) {
				ObjectPropertyBean objectPropertyBean = objectPropertyBeans[i];
				objectPropertyBean.setIsUnique(BooleanUtils.toString(isUnique,
						"true", "false"));
				businessObjectService
						.modifyBusinessObjectProperty(objectPropertyBean);
			}

			reloadDataModel();

		}
	}

}
